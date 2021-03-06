/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties of a build argument.
 */
public class BuildArgumentInner {
    /**
     * The type of the argument.
     */
    @JsonProperty(value = "type", required = true)
    private String type;

    /**
     * The name of the argument.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * The value of the argument.
     */
    @JsonProperty(value = "value", required = true)
    private String value;

    /**
     * Flag to indicate whether the argument represents a secret and want to be
     * removed from build logs.
     */
    @JsonProperty(value = "isSecret")
    private Boolean isSecret;

    /**
     * Creates an instance of BuildArgumentInner class.
     */
    public BuildArgumentInner() {
        type = "DockerBuildArgument";
    }

    /**
     * Get the type value.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type value.
     *
     * @param type the type value to set
     * @return the BuildArgumentInner object itself.
     */
    public BuildArgumentInner withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the BuildArgumentInner object itself.
     */
    public BuildArgumentInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the value value.
     *
     * @return the value value
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value value.
     *
     * @param value the value value to set
     * @return the BuildArgumentInner object itself.
     */
    public BuildArgumentInner withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Get the isSecret value.
     *
     * @return the isSecret value
     */
    public Boolean isSecret() {
        return this.isSecret;
    }

    /**
     * Set the isSecret value.
     *
     * @param isSecret the isSecret value to set
     * @return the BuildArgumentInner object itself.
     */
    public BuildArgumentInner withIsSecret(Boolean isSecret) {
        this.isSecret = isSecret;
        return this;
    }

}
