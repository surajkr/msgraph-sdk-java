// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DirectoryAudit;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Directory Audit Request.
 */
public interface IDirectoryAuditRequest extends IHttpRequest {

    /**
     * Gets the DirectoryAudit from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<DirectoryAudit> callback);

    /**
     * Gets the DirectoryAudit from the service
     *
     * @return the DirectoryAudit from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DirectoryAudit get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<DirectoryAudit> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this DirectoryAudit with a source
     *
     * @param sourceDirectoryAudit the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final DirectoryAudit sourceDirectoryAudit, final ICallback<DirectoryAudit> callback);

    /**
     * Patches this DirectoryAudit with a source
     *
     * @param sourceDirectoryAudit the source object with updates
     * @return the updated DirectoryAudit
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DirectoryAudit patch(final DirectoryAudit sourceDirectoryAudit) throws ClientException;

    /**
     * Posts a DirectoryAudit with a new object
     *
     * @param newDirectoryAudit the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final DirectoryAudit newDirectoryAudit, final ICallback<DirectoryAudit> callback);

    /**
     * Posts a DirectoryAudit with a new object
     *
     * @param newDirectoryAudit the new object to create
     * @return the created DirectoryAudit
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DirectoryAudit post(final DirectoryAudit newDirectoryAudit) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IDirectoryAuditRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IDirectoryAuditRequest expand(final String value);

}

