/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql;

import java.util.UUID;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * The service objectives capability.
 */
@JsonFlatten
public class ServiceObjectiveCapability {
    /**
     * The service objective name.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /**
     * The status of the service objective. Possible values include: 'Visible',
     * 'Available', 'Default', 'Disabled'.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private CapabilityStatus status;

    /**
     * Unit type used to measure service objective performance level. Possible
     * values include: 'DTU'.
     */
    @JsonProperty(value = "performanceLevel.unit", access = JsonProperty.Access.WRITE_ONLY)
    private PerformanceLevelUnit unit;

    /**
     * Performance level value.
     */
    @JsonProperty(value = "performanceLevel.value", access = JsonProperty.Access.WRITE_ONLY)
    private Integer value;

    /**
     * The unique ID of the service objective.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private UUID id;

    /**
     * The list of supported maximum database sizes for this service objective.
     */
    @JsonProperty(value = "supportedMaxSizes", access = JsonProperty.Access.WRITE_ONLY)
    private List<MaxSizeCapability> supportedMaxSizes;

    /**
     * The included (free) max size for this service level objective.
     */
    @JsonProperty(value = "includedMaxSize", access = JsonProperty.Access.WRITE_ONLY)
    private MaxSizeCapability includedMaxSize;

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the status value.
     *
     * @return the status value
     */
    public CapabilityStatus status() {
        return this.status;
    }

    /**
     * Get the unit value.
     *
     * @return the unit value
     */
    public PerformanceLevelUnit unit() {
        return this.unit;
    }

    /**
     * Get the value value.
     *
     * @return the value value
     */
    public Integer value() {
        return this.value;
    }

    /**
     * Get the id value.
     *
     * @return the id value
     */
    public UUID id() {
        return this.id;
    }

    /**
     * Get the supportedMaxSizes value.
     *
     * @return the supportedMaxSizes value
     */
    public List<MaxSizeCapability> supportedMaxSizes() {
        return this.supportedMaxSizes;
    }

    /**
     * Get the includedMaxSize value.
     *
     * @return the includedMaxSize value
     */
    public MaxSizeCapability includedMaxSize() {
        return this.includedMaxSize;
    }

}
