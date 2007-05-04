/*
 * $HeadURL$
 * $Revision$
 * $Date$
 *
 * ====================================================================
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 * ====================================================================
 *
 * This software consists of voluntary contributions made by many
 * individuals on behalf of the Apache Software Foundation.  For more
 * information on the Apache Software Foundation, please see
 * <http://www.apache.org/>.
 *
 */

package org.apache.http.client.protocol;

import org.apache.http.protocol.HttpContext;
import org.apache.http.protocol.HttpExecutionContext;

public class HttpClientContext extends HttpExecutionContext {
    
    public static final String SCHEME_REGISTRY       = "http.scheme-registry"; 
    public static final String COOKIESPEC_REGISTRY   = "http.cookiespec-registry"; 
    public static final String AUTHSCHEME_REGISTRY   = "http.authscheme-registry"; 
    public static final String HTTP_STATE            = "http.state"; 
    public static final String COOKIE_SPEC           = "http.cookie-spec"; 
    public static final String COOKIE_ORIGIN         = "http.cookie-origin"; 
    
    public HttpClientContext(final HttpContext parentContext) {
        super(parentContext);
    }
    
}