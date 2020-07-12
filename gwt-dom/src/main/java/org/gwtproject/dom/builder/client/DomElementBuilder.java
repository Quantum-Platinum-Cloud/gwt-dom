/*
 * Copyright © 2019 The GWT Project Authors
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
package org.gwtproject.dom.builder.client;

import org.gwtproject.dom.builder.shared.ElementBuilder;
import org.gwtproject.dom.client.Element;

/** DOM-based implementation of {@link ElementBuilder}. */
public class DomElementBuilder extends DomElementBuilderBase<ElementBuilder, Element>
    implements ElementBuilder {

  DomElementBuilder(DomBuilderImpl delegate) {
    super(delegate);
  }
}
