/**
 * 
 */
package com.bookstore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.session.data.redis.config.ConfigureRedisAction;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * @author Omar Issa
 *
 */

@EnableRedisHttpSession
public class HttpSessionConfig {

	@Bean
	public LettuceConnectionFactory lettuceConnectionFactory() {
		return new LettuceConnectionFactory();
	}
	
}
