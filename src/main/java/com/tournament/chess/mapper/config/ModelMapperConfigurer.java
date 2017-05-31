package com.tournament.chess.mapper.config;

/**
 * Created by admin on 3/22/17.
 */
import org.modelmapper.ModelMapper;

/**
 * Allows to set specific behaviour of the {@link ModelMapper} instance. The concrete implementation of this interface
 * needs to be registered within the application context in order to be processed.
 *
 * <pre><strong>Example:</strong>
 * &#064;Component
 * public class UserMapping implements ModelMapperConfigurer {
 *
 *      void configure(ModelMapper modelMapper) {
 *          modelMapper.getConfiguration()
 *              .setSourceNamingConvention(NamingConventions.NONE);
 *              .setDestinationNamingConvention(NamingConventions.NONE);
 *      }
 * }
 * </pre>
 *
 * @see ModelMapper
 * @see ModelMapperFactoryBean
 */
public interface ModelMapperConfigurer {

	/**
	 * Configures the instance of {@link org.modelmapper.ModelMapper}.
	 *
	 * @param modelMapper {@link ModelMapper} instance to be configured
	 */
	void configure(ModelMapper modelMapper);
}