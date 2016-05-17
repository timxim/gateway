/**
 * Copyright 2007-2016, Kaazing Corporation. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.kaazing.gateway.transport.ws.bridge.extensions.pingpong;

import java.net.ProtocolException;

import org.kaazing.gateway.resource.address.ws.WsResourceAddress;
import org.kaazing.gateway.transport.ws.extension.ExtensionHeader;
import org.kaazing.gateway.transport.ws.extension.ExtensionHelper;
import org.kaazing.gateway.transport.ws.extension.WebSocketExtension;
import org.kaazing.gateway.transport.ws.extension.WebSocketExtensionFactorySpi;

public final class PingPongExtensionFactory extends WebSocketExtensionFactorySpi {

    @Override
    public String getExtensionName() {
        return PingPongExtension.EXTENSION_TOKEN;
    }

    @Override
    public ExtensionOrderCategory getOrderCategory() {
        return ExtensionOrderCategory.NETWORK;
    }

    @Override
    public WebSocketExtension negotiate(ExtensionHeader requestedExtension, ExtensionHelper extensionHelper, WsResourceAddress address)
            throws ProtocolException {
        return new PingPongExtension(requestedExtension, extensionHelper);
    }

}
