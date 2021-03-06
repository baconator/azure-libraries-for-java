/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.implementation;

import com.microsoft.azure.management.sql.SyncMemberDbType;
import java.util.UUID;
import com.microsoft.azure.management.sql.SyncDirection;
import com.microsoft.azure.management.sql.SyncMemberState;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * An Azure SQL Database sync member.
 */
@JsonFlatten
public class SyncMemberInner extends ProxyResourceInner {
    /**
     * Database type of the sync member. Possible values include:
     * 'AzureSqlDatabase', 'SqlServerDatabase'.
     */
    @JsonProperty(value = "properties.databaseType")
    private SyncMemberDbType databaseType;

    /**
     * ARM resource id of the sync agent in the sync member.
     */
    @JsonProperty(value = "properties.syncAgentId")
    private String syncAgentId;

    /**
     * SQL Server database id of the sync member.
     */
    @JsonProperty(value = "properties.sqlServerDatabaseId")
    private UUID sqlServerDatabaseId;

    /**
     * Server name of the member database in the sync member.
     */
    @JsonProperty(value = "properties.serverName")
    private String serverName;

    /**
     * Database name of the member database in the sync member.
     */
    @JsonProperty(value = "properties.databaseName")
    private String databaseName;

    /**
     * User name of the member database in the sync member.
     */
    @JsonProperty(value = "properties.userName")
    private String userName;

    /**
     * Password of the member database in the sync member.
     */
    @JsonProperty(value = "properties.password")
    private String password;

    /**
     * Sync direction of the sync member. Possible values include:
     * 'Bidirectional', 'OneWayMemberToHub', 'OneWayHubToMember'.
     */
    @JsonProperty(value = "properties.syncDirection")
    private SyncDirection syncDirection;

    /**
     * Sync state of the sync member. Possible values include:
     * 'SyncInProgress', 'SyncSucceeded', 'SyncFailed',
     * 'DisabledTombstoneCleanup', 'DisabledBackupRestore',
     * 'SyncSucceededWithWarnings', 'SyncCancelling', 'SyncCancelled',
     * 'UnProvisioned', 'Provisioning', 'Provisioned', 'ProvisionFailed',
     * 'DeProvisioning', 'DeProvisioned', 'DeProvisionFailed',
     * 'Reprovisioning', 'ReprovisionFailed', 'UnReprovisioned'.
     */
    @JsonProperty(value = "properties.syncState", access = JsonProperty.Access.WRITE_ONLY)
    private SyncMemberState syncState;

    /**
     * Get the databaseType value.
     *
     * @return the databaseType value
     */
    public SyncMemberDbType databaseType() {
        return this.databaseType;
    }

    /**
     * Set the databaseType value.
     *
     * @param databaseType the databaseType value to set
     * @return the SyncMemberInner object itself.
     */
    public SyncMemberInner withDatabaseType(SyncMemberDbType databaseType) {
        this.databaseType = databaseType;
        return this;
    }

    /**
     * Get the syncAgentId value.
     *
     * @return the syncAgentId value
     */
    public String syncAgentId() {
        return this.syncAgentId;
    }

    /**
     * Set the syncAgentId value.
     *
     * @param syncAgentId the syncAgentId value to set
     * @return the SyncMemberInner object itself.
     */
    public SyncMemberInner withSyncAgentId(String syncAgentId) {
        this.syncAgentId = syncAgentId;
        return this;
    }

    /**
     * Get the sqlServerDatabaseId value.
     *
     * @return the sqlServerDatabaseId value
     */
    public UUID sqlServerDatabaseId() {
        return this.sqlServerDatabaseId;
    }

    /**
     * Set the sqlServerDatabaseId value.
     *
     * @param sqlServerDatabaseId the sqlServerDatabaseId value to set
     * @return the SyncMemberInner object itself.
     */
    public SyncMemberInner withSqlServerDatabaseId(UUID sqlServerDatabaseId) {
        this.sqlServerDatabaseId = sqlServerDatabaseId;
        return this;
    }

    /**
     * Get the serverName value.
     *
     * @return the serverName value
     */
    public String serverName() {
        return this.serverName;
    }

    /**
     * Set the serverName value.
     *
     * @param serverName the serverName value to set
     * @return the SyncMemberInner object itself.
     */
    public SyncMemberInner withServerName(String serverName) {
        this.serverName = serverName;
        return this;
    }

    /**
     * Get the databaseName value.
     *
     * @return the databaseName value
     */
    public String databaseName() {
        return this.databaseName;
    }

    /**
     * Set the databaseName value.
     *
     * @param databaseName the databaseName value to set
     * @return the SyncMemberInner object itself.
     */
    public SyncMemberInner withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * Get the userName value.
     *
     * @return the userName value
     */
    public String userName() {
        return this.userName;
    }

    /**
     * Set the userName value.
     *
     * @param userName the userName value to set
     * @return the SyncMemberInner object itself.
     */
    public SyncMemberInner withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * Get the password value.
     *
     * @return the password value
     */
    public String password() {
        return this.password;
    }

    /**
     * Set the password value.
     *
     * @param password the password value to set
     * @return the SyncMemberInner object itself.
     */
    public SyncMemberInner withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * Get the syncDirection value.
     *
     * @return the syncDirection value
     */
    public SyncDirection syncDirection() {
        return this.syncDirection;
    }

    /**
     * Set the syncDirection value.
     *
     * @param syncDirection the syncDirection value to set
     * @return the SyncMemberInner object itself.
     */
    public SyncMemberInner withSyncDirection(SyncDirection syncDirection) {
        this.syncDirection = syncDirection;
        return this;
    }

    /**
     * Get the syncState value.
     *
     * @return the syncState value
     */
    public SyncMemberState syncState() {
        return this.syncState;
    }

}
