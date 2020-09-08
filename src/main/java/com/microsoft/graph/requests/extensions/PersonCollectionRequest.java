// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.User;
import com.microsoft.graph.models.extensions.Person;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IPersonCollectionPage;
import com.microsoft.graph.requests.extensions.PersonCollectionResponse;
import com.microsoft.graph.requests.extensions.IPersonCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPersonCollectionRequest;
import com.microsoft.graph.requests.extensions.PersonCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Person Collection Request.
 */
public class PersonCollectionRequest extends BaseCollectionRequest<PersonCollectionResponse, IPersonCollectionPage> implements IPersonCollectionRequest {

    /**
     * The request builder for this collection of Person
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PersonCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, PersonCollectionResponse.class, IPersonCollectionPage.class);
    }

    public void get(final ICallback<IPersonCollectionPage> callback) {
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

    public IPersonCollectionPage get() throws ClientException {
        final PersonCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final Person newPerson, final ICallback<Person> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new PersonRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newPerson, callback);
    }

    public Person post(final Person newPerson) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new PersonRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newPerson);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IPersonCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (PersonCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IPersonCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (PersonCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IPersonCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (PersonCollectionRequest)this;
    }

    public IPersonCollectionPage buildFromResponse(final PersonCollectionResponse response) {
        final IPersonCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new PersonCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final PersonCollectionPage page = new PersonCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
