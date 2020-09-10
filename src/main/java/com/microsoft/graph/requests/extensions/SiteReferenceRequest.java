// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Site;
import com.microsoft.graph.models.extensions.ItemActivityStat;
import com.microsoft.graph.requests.extensions.IColumnDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IColumnDefinitionRequestBuilder;
import com.microsoft.graph.requests.extensions.ColumnDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ColumnDefinitionRequestBuilder;
import com.microsoft.graph.requests.extensions.IContentTypeCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IContentTypeRequestBuilder;
import com.microsoft.graph.requests.extensions.ContentTypeCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ContentTypeRequestBuilder;
import com.microsoft.graph.requests.extensions.IDriveCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDriveRequestBuilder;
import com.microsoft.graph.requests.extensions.DriveCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DriveRequestBuilder;
import com.microsoft.graph.requests.extensions.IBaseItemCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IBaseItemRequestBuilder;
import com.microsoft.graph.requests.extensions.BaseItemCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.BaseItemRequestBuilder;
import com.microsoft.graph.requests.extensions.IListCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IListRequestBuilder;
import com.microsoft.graph.requests.extensions.ListCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ListRequestBuilder;
import com.microsoft.graph.requests.extensions.ISiteCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISiteRequestBuilder;
import com.microsoft.graph.requests.extensions.SiteCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SiteRequestBuilder;
import com.microsoft.graph.requests.extensions.IItemAnalyticsRequestBuilder;
import com.microsoft.graph.requests.extensions.ItemAnalyticsRequestBuilder;
import com.microsoft.graph.requests.extensions.IOnenoteRequestBuilder;
import com.microsoft.graph.requests.extensions.OnenoteRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Site Reference Request.
 */
public class SiteReferenceRequest extends BaseRequest implements ISiteReferenceRequest {

    /**
     * The request for the Site
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SiteReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Site.class);
    }

    public void delete(final ICallback<Site> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    public Site delete() throws ClientException {
       return send(HttpMethod.DELETE, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public ISiteReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (SiteReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public ISiteReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (SiteReferenceRequest)this;
    }
    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public ISiteReferenceRequest filter(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (SiteReferenceRequest)this;
    }
    /**
     * Puts the Site
     *
     * @param srcSite the Site reference to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(Site srcSite, final ICallback<Site> callback) {
        send(HttpMethod.PUT, callback, srcSite);
    }

    /**
     * Puts the Site
     *
     * @param srcSite the Site reference to PUT
     * @return the Site
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public Site put(Site srcSite) throws ClientException {
        return send(HttpMethod.PUT, srcSite);
    }
}
