// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.MacOSDeviceFeaturesConfiguration;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Mac OSDevice Features Configuration Request.
 */
public interface IMacOSDeviceFeaturesConfigurationRequest extends IHttpRequest {

    /**
     * Gets the MacOSDeviceFeaturesConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<MacOSDeviceFeaturesConfiguration> callback);

    /**
     * Gets the MacOSDeviceFeaturesConfiguration from the service
     *
     * @return the MacOSDeviceFeaturesConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MacOSDeviceFeaturesConfiguration get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<MacOSDeviceFeaturesConfiguration> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this MacOSDeviceFeaturesConfiguration with a source
     *
     * @param sourceMacOSDeviceFeaturesConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final MacOSDeviceFeaturesConfiguration sourceMacOSDeviceFeaturesConfiguration, final ICallback<MacOSDeviceFeaturesConfiguration> callback);

    /**
     * Patches this MacOSDeviceFeaturesConfiguration with a source
     *
     * @param sourceMacOSDeviceFeaturesConfiguration the source object with updates
     * @return the updated MacOSDeviceFeaturesConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MacOSDeviceFeaturesConfiguration patch(final MacOSDeviceFeaturesConfiguration sourceMacOSDeviceFeaturesConfiguration) throws ClientException;

    /**
     * Posts a MacOSDeviceFeaturesConfiguration with a new object
     *
     * @param newMacOSDeviceFeaturesConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final MacOSDeviceFeaturesConfiguration newMacOSDeviceFeaturesConfiguration, final ICallback<MacOSDeviceFeaturesConfiguration> callback);

    /**
     * Posts a MacOSDeviceFeaturesConfiguration with a new object
     *
     * @param newMacOSDeviceFeaturesConfiguration the new object to create
     * @return the created MacOSDeviceFeaturesConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MacOSDeviceFeaturesConfiguration post(final MacOSDeviceFeaturesConfiguration newMacOSDeviceFeaturesConfiguration) throws ClientException;

    /**
     * Posts a MacOSDeviceFeaturesConfiguration with a new object
     *
     * @param newMacOSDeviceFeaturesConfiguration the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final MacOSDeviceFeaturesConfiguration newMacOSDeviceFeaturesConfiguration, final ICallback<MacOSDeviceFeaturesConfiguration> callback);

    /**
     * Posts a MacOSDeviceFeaturesConfiguration with a new object
     *
     * @param newMacOSDeviceFeaturesConfiguration the object to create/update
     * @return the created MacOSDeviceFeaturesConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MacOSDeviceFeaturesConfiguration put(final MacOSDeviceFeaturesConfiguration newMacOSDeviceFeaturesConfiguration) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IMacOSDeviceFeaturesConfigurationRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IMacOSDeviceFeaturesConfigurationRequest expand(final String value);

}

