/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.v2.management.network;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * City or town details.
 */
public final class AvailableProvidersListCity {
    /**
     * The city or town name.
     */
    @JsonProperty(value = "cityName")
    private String cityName;

    /**
     * A list of Internet service providers.
     */
    @JsonProperty(value = "providers")
    private List<String> providers;

    /**
     * Get the cityName value.
     *
     * @return the cityName value.
     */
    public String cityName() {
        return this.cityName;
    }

    /**
     * Set the cityName value.
     *
     * @param cityName the cityName value to set.
     * @return the AvailableProvidersListCity object itself.
     */
    public AvailableProvidersListCity withCityName(String cityName) {
        this.cityName = cityName;
        return this;
    }

    /**
     * Get the providers value.
     *
     * @return the providers value.
     */
    public List<String> providers() {
        return this.providers;
    }

    /**
     * Set the providers value.
     *
     * @param providers the providers value to set.
     * @return the AvailableProvidersListCity object itself.
     */
    public AvailableProvidersListCity withProviders(List<String> providers) {
        this.providers = providers;
        return this;
    }
}
