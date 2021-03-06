/*
 * Copyright (c) 2018 Pantheon Technologies s.r.o. All Rights Reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at https://www.eclipse.org/legal/epl-v10.html
 */
package io.lighty.core.common.models;

@SuppressWarnings("serial")
public class YangClasspathResolutionException extends Exception {

    public YangClasspathResolutionException() {
    }

    public YangClasspathResolutionException(final Exception e) {
        super(e);
    }

}
