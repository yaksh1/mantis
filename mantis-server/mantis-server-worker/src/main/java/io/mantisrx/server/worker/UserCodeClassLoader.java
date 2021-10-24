/*
 * Copyright 2022 Netflix, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.mantisrx.server.worker;

import java.io.Closeable;

/**
 * UserCodeClassLoader allows to register release hooks for a user code class loader.
 */
public interface UserCodeClassLoader extends Closeable {

  /**
   * Obtains the actual class loader.
   *
   * @return actual class loader
   */
  ClassLoader asClassLoader();
}
