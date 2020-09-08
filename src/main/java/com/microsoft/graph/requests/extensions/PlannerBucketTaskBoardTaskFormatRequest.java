// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PlannerBucketTaskBoardTaskFormat;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Planner Bucket Task Board Task Format Request.
 */
public class PlannerBucketTaskBoardTaskFormatRequest extends BaseRequest implements IPlannerBucketTaskBoardTaskFormatRequest {
	
    /**
     * The request for the PlannerBucketTaskBoardTaskFormat
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PlannerBucketTaskBoardTaskFormatRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, PlannerBucketTaskBoardTaskFormat.class);
    }

    /**
     * Gets the PlannerBucketTaskBoardTaskFormat from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<PlannerBucketTaskBoardTaskFormat> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the PlannerBucketTaskBoardTaskFormat from the service
     *
     * @return the PlannerBucketTaskBoardTaskFormat from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PlannerBucketTaskBoardTaskFormat get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<PlannerBucketTaskBoardTaskFormat> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this PlannerBucketTaskBoardTaskFormat with a source
     *
     * @param sourcePlannerBucketTaskBoardTaskFormat the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final PlannerBucketTaskBoardTaskFormat sourcePlannerBucketTaskBoardTaskFormat, final ICallback<PlannerBucketTaskBoardTaskFormat> callback) {
        send(HttpMethod.PATCH, callback, sourcePlannerBucketTaskBoardTaskFormat);
    }

    /**
     * Patches this PlannerBucketTaskBoardTaskFormat with a source
     *
     * @param sourcePlannerBucketTaskBoardTaskFormat the source object with updates
     * @return the updated PlannerBucketTaskBoardTaskFormat
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PlannerBucketTaskBoardTaskFormat patch(final PlannerBucketTaskBoardTaskFormat sourcePlannerBucketTaskBoardTaskFormat) throws ClientException {
        return send(HttpMethod.PATCH, sourcePlannerBucketTaskBoardTaskFormat);
    }

    /**
     * Creates a PlannerBucketTaskBoardTaskFormat with a new object
     *
     * @param newPlannerBucketTaskBoardTaskFormat the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final PlannerBucketTaskBoardTaskFormat newPlannerBucketTaskBoardTaskFormat, final ICallback<PlannerBucketTaskBoardTaskFormat> callback) {
        send(HttpMethod.POST, callback, newPlannerBucketTaskBoardTaskFormat);
    }

    /**
     * Creates a PlannerBucketTaskBoardTaskFormat with a new object
     *
     * @param newPlannerBucketTaskBoardTaskFormat the new object to create
     * @return the created PlannerBucketTaskBoardTaskFormat
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PlannerBucketTaskBoardTaskFormat post(final PlannerBucketTaskBoardTaskFormat newPlannerBucketTaskBoardTaskFormat) throws ClientException {
        return send(HttpMethod.POST, newPlannerBucketTaskBoardTaskFormat);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IPlannerBucketTaskBoardTaskFormatRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (PlannerBucketTaskBoardTaskFormatRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IPlannerBucketTaskBoardTaskFormatRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (PlannerBucketTaskBoardTaskFormatRequest)this;
     }

}

