// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.WorkbookChartGridlines;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Chart Gridlines Request.
 */
public interface IWorkbookChartGridlinesRequest extends IHttpRequest {

    /**
     * Gets the WorkbookChartGridlines from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<WorkbookChartGridlines> callback);

    /**
     * Gets the WorkbookChartGridlines from the service
     *
     * @return the WorkbookChartGridlines from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WorkbookChartGridlines get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<WorkbookChartGridlines> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this WorkbookChartGridlines with a source
     *
     * @param sourceWorkbookChartGridlines the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final WorkbookChartGridlines sourceWorkbookChartGridlines, final ICallback<WorkbookChartGridlines> callback);

    /**
     * Patches this WorkbookChartGridlines with a source
     *
     * @param sourceWorkbookChartGridlines the source object with updates
     * @return the updated WorkbookChartGridlines
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WorkbookChartGridlines patch(final WorkbookChartGridlines sourceWorkbookChartGridlines) throws ClientException;

    /**
     * Posts a WorkbookChartGridlines with a new object
     *
     * @param newWorkbookChartGridlines the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final WorkbookChartGridlines newWorkbookChartGridlines, final ICallback<WorkbookChartGridlines> callback);

    /**
     * Posts a WorkbookChartGridlines with a new object
     *
     * @param newWorkbookChartGridlines the new object to create
     * @return the created WorkbookChartGridlines
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WorkbookChartGridlines post(final WorkbookChartGridlines newWorkbookChartGridlines) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IWorkbookChartGridlinesRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IWorkbookChartGridlinesRequest expand(final String value);

}

