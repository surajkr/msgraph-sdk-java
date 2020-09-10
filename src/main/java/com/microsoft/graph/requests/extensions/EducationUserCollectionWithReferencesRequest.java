// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.EducationSchool;
import com.microsoft.graph.models.extensions.EducationUser;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Education User Collection With References Request.
 */
public class EducationUserCollectionWithReferencesRequest extends BaseCollectionRequest<EducationUserCollectionResponse, IEducationUserCollectionPage> implements IEducationUserCollectionWithReferencesRequest {

    /**
     * The request builder for this collection of EducationUser
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EducationUserCollectionWithReferencesRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, EducationUserCollectionResponse.class, IEducationUserCollectionPage.class);
    }

    public void get(final ICallback<IEducationUserCollectionWithReferencesPage> callback) {
        final IExecutors executors = getBaseRequest().getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    executors.performOnForeground(get(), callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    public IEducationUserCollectionWithReferencesPage get() throws ClientException {
        final EducationUserCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public IEducationUserCollectionWithReferencesRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (EducationUserCollectionWithReferencesRequest)this;
    }

    public IEducationUserCollectionWithReferencesRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (EducationUserCollectionWithReferencesRequest)this;
    }

    public IEducationUserCollectionWithReferencesRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (EducationUserCollectionWithReferencesRequest)this;
    }

    public IEducationUserCollectionWithReferencesRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (EducationUserCollectionWithReferencesRequest)this;
    }

    public IEducationUserCollectionWithReferencesPage buildFromResponse(final EducationUserCollectionResponse response) {
        final IEducationUserCollectionWithReferencesRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new EducationUserCollectionWithReferencesRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final EducationUserCollectionWithReferencesPage page = new EducationUserCollectionWithReferencesPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
