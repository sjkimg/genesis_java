package com.emerchantpay.gateway.api.constants;

/*
 * Permission is hereby granted, free of charge, to any person obtaining a
 * copy of this software and associated documentation files (the
 * "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish,
 * distribute, sublicense, and/or sell copies of the Software, and to permit
 * persons to whom the Software is furnished to do so, subject to the
 * following conditions:
 *
 * The above copyright notice and this permission notice shall be included
 * in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS
 * OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NON-INFRINGEMENT.
 * IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY
 * CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT
 * OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR
 * THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 *
 * @license http://opensource.org/licenses/MIT The MIT License
 */

import java.io.Serializable;

public class FXEndpoints implements Serializable {

    private String endpointName;

    // FX API
    public static FXEndpoints FX_TIERS = new FXEndpoints("/fx/tiers");
    public static FXEndpoints FX_RATES = new FXEndpoints("/rates");
    public static FXEndpoints FX_SEARCH_RATE = new FXEndpoints("/rates/search");
    public static String FX_API_VERSION = "v1";

    public FXEndpoints(String endpointName) {
        this.endpointName = endpointName;
    }

    public String getEndpointName() {
        return this.endpointName;
    }

    public String toString() {
        return getEndpointName();
    }
}
