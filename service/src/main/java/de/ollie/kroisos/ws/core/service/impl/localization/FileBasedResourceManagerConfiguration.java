package de.ollie.kroisos.ws.core.service.impl.localization;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import de.ollie.kroisos.ws.core.model.localization.LocalizationSO;
import lombok.Getter;

/**
 * A Configuration for the file based resource manager.
 *
 * GENERATED CODE !!! DO NOT CHANGE !!!
 */
@Configuration
@Getter
public class FileBasedResourceManagerConfiguration {

	@Value("${localization.resource.enabled:true}")
	private boolean enabled;

	@Value("${localization.resource.file.name.prefix:kroisosws}")
	private String fileNamePrefix;

	@Value("${localization.resource.file.name.de:}")
	private String resourceFileNameDE;

	public String getResourceFileName(LocalizationSO localization) {
		switch (localization) {
		case DE:
			return resourceFileNameDE;
		default:
			return "";
		}
	}

}