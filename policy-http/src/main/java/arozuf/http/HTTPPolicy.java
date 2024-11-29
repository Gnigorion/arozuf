package arozuf.http;

import java.util.HashMap;
import java.util.Map;
import java.util.function.UnaryOperator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import arozuf.constants.Constants;

@Service
public class HTTPPolicy implements UnaryOperator<Map<String, Object>> {

	@Autowired
	RestTemplate restClient;

	@SuppressWarnings("unchecked")
	@Override
	public Map<String, Object> apply(Map<String, Object> input) {
		Map<String, Object> output = new HashMap<>();

		HttpHeaders headers = new HttpHeaders();

		String url = (String) input.getOrDefault(Constants.URL, null);
		String method = (String) input.getOrDefault(Constants.METHOD, null);
		Map<String, String> header = (Map<String, String>) input.getOrDefault(Constants.HEADERS, new HashMap<>());

		header.forEach((k, v) -> {
			headers.set(k, v);
		});
		String body = (String) input.getOrDefault(Constants.BODY, null);

		HttpEntity<Object> requestEntity = new HttpEntity<>(body, headers);
		ResponseEntity<String> response = restClient.exchange(url, HttpMethod.valueOf(method), requestEntity,
				String.class);
		System.out.println(response.getBody());

		return output;
	}

}
