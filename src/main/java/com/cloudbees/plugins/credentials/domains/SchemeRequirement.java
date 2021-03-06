/*
 * The MIT License
 *
 * Copyright (c) 2011-2013, CloudBees, Inc., Stephen Connolly.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.cloudbees.plugins.credentials.domains;

import edu.umd.cs.findbugs.annotations.CheckForNull;
import edu.umd.cs.findbugs.annotations.NonNull;
import hudson.Util;

/**
 * A requirement for a specific URI scheme, for example <code>http</code> or <code>smtp</code>
 *
 * @since 1.5
 */
public class SchemeRequirement extends DomainRequirement {
    /**
     * Standardize serialization format.
     *
     * @since 1.9
     */
    private static final long serialVersionUID = 1L;

    /**
     * The scheme.
     */
    @NonNull
    private final String scheme;

    /**
     * Constructs a requirement for the specified scheme.
     *
     * @param scheme the scheme.
     */
    public SchemeRequirement(@CheckForNull String scheme) {
        this.scheme = Util.fixNull(scheme);
    }

    /**
     * Returns the scheme.
     *
     * @return the scheme.
     */
    @NonNull
    public String getScheme() {
        return scheme;
    }
}
