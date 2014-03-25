/*
 * Licensed to Elasticsearch under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.elasticsearch.hadoop.serialization;

import org.elasticsearch.hadoop.serialization.field.FieldExtractor;


/**
 * Produces an index name based on the given pattern and arguments (field values).
 */
public interface IndexFormat extends FieldExtractor {

    void compile(String pattern);

    /**
     * Indicates whether the given string is a pattern or not.
     *
     * @return true for a pattern, false otherwise
     */
    boolean hasPattern();
}
