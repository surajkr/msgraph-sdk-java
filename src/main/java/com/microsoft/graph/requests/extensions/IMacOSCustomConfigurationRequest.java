// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.MacOSCustomConfiguration;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Mac OSCustom Configuration Request.
 */
public interface IMacOSCustomConfigurationRequest extends IHttpRequest {

    /**
     * Gets the MacOSCustomConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<MacOSCustomConfiguration> callback);

    /**
     * Gets the MacOSCustomConfiguration from the service
     *
     * @return the MacOSCustomConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MacOSCustomConfiguration get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<MacOSCustomConfiguration> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this MacOSCustomConfiguration with a source
     *
     * @param sourceMacOSCustomConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final MacOSCustomConfiguration sourceMacOSCustomConfiguration, final ICallback<MacOSCustomConfiguration> callback);

    /**
     * Patches this MacOSCustomConfiguration with a source
     *
     * @param sourceMacOSCustomConfiguration the source object with updates
     * @return the updated MacOSCustomConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MacOSCustomConfiguration patch(final MacOSCustomConfiguration sourceMacOSCustomConfiguration) throws ClientException;

    /**
     * Posts a MacOSCustomConfiguration with a new object
     *
     * @param newMacOSCustomConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final MacOSCustomConfiguration newMacOSCustomConfiguration, final ICallback<MacOSCustomConfiguration> callback);

    /**
     * Posts a MacOSCustomConfiguration with a new object
     *
     * @param newMacOSCustomConfiguration the new object to create
     * @return the created MacOSCustomConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MacOSCustomConfiguration post(final MacOSCustomConfiguration newMacOSCustomConfiguration) throws ClientException;

    /**
     * Posts a MacOSCustomConfiguration with a new object
     *
     * @param newMacOSCustomConfiguration the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final MacOSCustomConfiguration newMacOSCustomConfiguration, final ICallback<MacOSCustomConfiguration> callback);

    /**
     * Posts a MacOSCustomConfiguration with a new object
     *
     * @param newMacOSCustomConfiguration the object to create/update
     * @return the created MacOSCustomConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MacOSCustomConfiguration put(final MacOSCustomConfiguration newMacOSCustomConfiguration) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IMacOSCustomConfigurationRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IMacOSCustomConfigurationRequest expand(final String value);

}

