// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.Windows10EnterpriseModernAppManagementConfiguration;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Windows10Enterprise Modern App Management Configuration Request.
 */
public interface IWindows10EnterpriseModernAppManagementConfigurationRequest extends IHttpRequest {

    /**
     * Gets the Windows10EnterpriseModernAppManagementConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<Windows10EnterpriseModernAppManagementConfiguration> callback);

    /**
     * Gets the Windows10EnterpriseModernAppManagementConfiguration from the service
     *
     * @return the Windows10EnterpriseModernAppManagementConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Windows10EnterpriseModernAppManagementConfiguration get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<Windows10EnterpriseModernAppManagementConfiguration> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this Windows10EnterpriseModernAppManagementConfiguration with a source
     *
     * @param sourceWindows10EnterpriseModernAppManagementConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final Windows10EnterpriseModernAppManagementConfiguration sourceWindows10EnterpriseModernAppManagementConfiguration, final ICallback<Windows10EnterpriseModernAppManagementConfiguration> callback);

    /**
     * Patches this Windows10EnterpriseModernAppManagementConfiguration with a source
     *
     * @param sourceWindows10EnterpriseModernAppManagementConfiguration the source object with updates
     * @return the updated Windows10EnterpriseModernAppManagementConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Windows10EnterpriseModernAppManagementConfiguration patch(final Windows10EnterpriseModernAppManagementConfiguration sourceWindows10EnterpriseModernAppManagementConfiguration) throws ClientException;

    /**
     * Posts a Windows10EnterpriseModernAppManagementConfiguration with a new object
     *
     * @param newWindows10EnterpriseModernAppManagementConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final Windows10EnterpriseModernAppManagementConfiguration newWindows10EnterpriseModernAppManagementConfiguration, final ICallback<Windows10EnterpriseModernAppManagementConfiguration> callback);

    /**
     * Posts a Windows10EnterpriseModernAppManagementConfiguration with a new object
     *
     * @param newWindows10EnterpriseModernAppManagementConfiguration the new object to create
     * @return the created Windows10EnterpriseModernAppManagementConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Windows10EnterpriseModernAppManagementConfiguration post(final Windows10EnterpriseModernAppManagementConfiguration newWindows10EnterpriseModernAppManagementConfiguration) throws ClientException;

    /**
     * Posts a Windows10EnterpriseModernAppManagementConfiguration with a new object
     *
     * @param newWindows10EnterpriseModernAppManagementConfiguration the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final Windows10EnterpriseModernAppManagementConfiguration newWindows10EnterpriseModernAppManagementConfiguration, final ICallback<Windows10EnterpriseModernAppManagementConfiguration> callback);

    /**
     * Posts a Windows10EnterpriseModernAppManagementConfiguration with a new object
     *
     * @param newWindows10EnterpriseModernAppManagementConfiguration the object to create/update
     * @return the created Windows10EnterpriseModernAppManagementConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Windows10EnterpriseModernAppManagementConfiguration put(final Windows10EnterpriseModernAppManagementConfiguration newWindows10EnterpriseModernAppManagementConfiguration) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IWindows10EnterpriseModernAppManagementConfigurationRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IWindows10EnterpriseModernAppManagementConfigurationRequest expand(final String value);

}

