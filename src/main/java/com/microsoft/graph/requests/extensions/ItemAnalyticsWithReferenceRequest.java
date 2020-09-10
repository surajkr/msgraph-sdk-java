// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ItemAnalytics;
import com.microsoft.graph.requests.extensions.IItemActivityStatCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IItemActivityStatRequestBuilder;
import com.microsoft.graph.requests.extensions.ItemActivityStatCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ItemActivityStatRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Item Analytics With Reference Request.
 */
public class ItemAnalyticsWithReferenceRequest extends BaseRequest implements IItemAnalyticsWithReferenceRequest {

    /**
     * The request for the ItemAnalytics
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ItemAnalyticsWithReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ItemAnalytics.class);
    }

    public void post(final ItemAnalytics newItemAnalytics, final IJsonBackedObject payload, final ICallback<ItemAnalytics> callback) {
        send(HttpMethod.POST, callback, payload);
    }

    public ItemAnalytics post(final ItemAnalytics newItemAnalytics, final IJsonBackedObject payload) throws ClientException {
        IJsonBackedObject response = send(HttpMethod.POST, payload);
        if (response != null){
            return newItemAnalytics;
        }
        return null;
    }

    public void get(final ICallback<ItemAnalytics> callback) {
        send(HttpMethod.GET, callback, null);
    }

    public ItemAnalytics get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

	public void delete(final ICallback<ItemAnalytics> callback) {
		send(HttpMethod.DELETE, callback, null);
	}

	public void delete() throws ClientException {
		send(HttpMethod.DELETE, null);
	}

	public void patch(final ItemAnalytics sourceItemAnalytics, final ICallback<ItemAnalytics> callback) {
		send(HttpMethod.PATCH, callback, sourceItemAnalytics);
	}

	public ItemAnalytics patch(final ItemAnalytics sourceItemAnalytics) throws ClientException {
		return send(HttpMethod.PATCH, sourceItemAnalytics);
	}


    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IItemAnalyticsWithReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (IItemAnalyticsWithReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IItemAnalyticsWithReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (ItemAnalyticsWithReferenceRequest)this;
    }
    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IItemAnalyticsWithReferenceRequest filter(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (ItemAnalyticsWithReferenceRequest)this;
    }
}
