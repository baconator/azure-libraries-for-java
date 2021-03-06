/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The action to be executed by a job step.
 */
public class JobStepAction {
    /**
     * Type of action being executed by the job step. Possible values include:
     * 'TSql'.
     */
    @JsonProperty(value = "type")
    private JobStepActionType type;

    /**
     * The source of the action to execute. Possible values include: 'Inline'.
     */
    @JsonProperty(value = "source")
    private JobStepActionSource source;

    /**
     * The action value, for example the text of the T-SQL script to execute.
     */
    @JsonProperty(value = "value", required = true)
    private String value;

    /**
     * Get the type value.
     *
     * @return the type value
     */
    public JobStepActionType type() {
        return this.type;
    }

    /**
     * Set the type value.
     *
     * @param type the type value to set
     * @return the JobStepAction object itself.
     */
    public JobStepAction withType(JobStepActionType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the source value.
     *
     * @return the source value
     */
    public JobStepActionSource source() {
        return this.source;
    }

    /**
     * Set the source value.
     *
     * @param source the source value to set
     * @return the JobStepAction object itself.
     */
    public JobStepAction withSource(JobStepActionSource source) {
        this.source = source;
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
     * @return the JobStepAction object itself.
     */
    public JobStepAction withValue(String value) {
        this.value = value;
        return this;
    }

}
