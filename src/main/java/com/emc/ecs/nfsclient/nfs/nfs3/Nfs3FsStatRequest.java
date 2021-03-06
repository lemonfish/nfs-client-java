/**
 * Copyright 2016-2018 Dell Inc. or its subsidiaries. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 * http://www.apache.org/licenses/LICENSE-2.0.txt
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.emc.ecs.nfsclient.nfs.nfs3;

import java.io.FileNotFoundException;

import com.emc.ecs.nfsclient.nfs.NfsFsStatRequest;
import com.emc.ecs.nfsclient.rpc.Credential;

/**
 * The request, as specified by RFC 1813 (https://tools.ietf.org/html/rfc1813).
 * 
 * <p>
 * Procedure FSSTAT retrieves volatile file system state information.
 * </p>
 * 
 * @author seibed
 */
public class Nfs3FsStatRequest extends NfsFsStatRequest {

    /**
     * Creates the request, as specified by RFC 1813
     * (https://tools.ietf.org/html/rfc1813).
     * 
     * <p>
     * Procedure FSSTAT retrieves volatile file system state information.
     * </p>
     * 
     * @param fileHandle
     *            A file handle identifying a object in the file system. This is
     *            normally a file handle for a mount point for a file system, as
     *            originally obtained from the MOUNT service on the server.
     * @param credential
     *            The credential to use for the request
     * @throws FileNotFoundException
     */
    public Nfs3FsStatRequest(byte[] fileHandle, Credential credential) throws FileNotFoundException {
        super(fileHandle, credential, Nfs3.VERSION);
    }

}
