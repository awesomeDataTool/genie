/*
 *
 *  Copyright 2018 Netflix, Inc.
 *
 *     Licensed under the Apache License, Version 2.0 (the "License");
 *     you may not use this file except in compliance with the License.
 *     You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *     Unless required by applicable law or agreed to in writing, software
 *     distributed under the License is distributed on an "AS IS" BASIS,
 *     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     See the License for the specific language governing permissions and
 *     limitations under the License.
 *
 */

package com.netflix.genie.agent.execution.services;

import com.netflix.genie.agent.execution.exceptions.ArchivalException;

import java.nio.file.Path;
import java.net.URI;

/**
 * Service to archive a file to a remote location.
 * For a directory recursively archives the contents to a remote location
 *
 * @author standon
 * @since 4.0.0
 */
public interface ArchivalService {

    /**
     * Archive path to a target location.
     *
     * @param path      path to the file/dir to archive
     * @param targetURI target uri for the archival location
     * @throws ArchivalException if archival fails
     */
    void archive(final Path path, final URI targetURI) throws ArchivalException;
}
