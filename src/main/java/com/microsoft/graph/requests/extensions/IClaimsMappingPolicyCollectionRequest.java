// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PolicyRoot;
import com.microsoft.graph.models.extensions.ClaimsMappingPolicy;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.IBaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Claims Mapping Policy Collection Request.
 */
public interface IClaimsMappingPolicyCollectionRequest {

    void get(final ICallback<IClaimsMappingPolicyCollectionPage> callback);

    IClaimsMappingPolicyCollectionPage get() throws ClientException;

    void post(final ClaimsMappingPolicy newClaimsMappingPolicy, final ICallback<ClaimsMappingPolicy> callback);

    ClaimsMappingPolicy post(final ClaimsMappingPolicy newClaimsMappingPolicy) throws ClientException;

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IClaimsMappingPolicyCollectionRequest expand(final String value);

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    IClaimsMappingPolicyCollectionRequest filter(final String value);

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IClaimsMappingPolicyCollectionRequest select(final String value);

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    IClaimsMappingPolicyCollectionRequest top(final int value);

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    IClaimsMappingPolicyCollectionRequest skip(final int value);

    /**
	 * Sets the skip token value for the request
	 * 
	 * @param skipToken value for pagination
     *
	 * @return the updated request
	 */
	IClaimsMappingPolicyCollectionRequest skipToken(String skipToken);
}
