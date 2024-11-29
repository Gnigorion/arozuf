package arozuf.http;

import java.time.Duration;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class HTTPClient {

	@Bean
	public RestTemplate restClient(RestTemplateBuilder restTemplateBuilder) {

		return restTemplateBuilder
				.connectTimeout(Duration.ofSeconds(500))
				.readTimeout(Duration.ofSeconds(500))
				.build();
	}
}
