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
package org.kaazing.gateway.service.amqp;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;
import org.kaazing.gateway.service.Service;
import org.kaazing.gateway.service.ServiceFactory;
import org.kaazing.test.util.MethodExecutionTrace;

public class CreateAmqpProxyServiceTest {
    @Rule
    public TestRule testExecutionTrace = new MethodExecutionTrace();

    @Test
    public void createTestService() {
        ServiceFactory factory = ServiceFactory.newServiceFactory();
        Service amqpProxyService = factory.newService("amqp.proxy");

        Assert.assertNotNull("Failed to create amqp.proxy service", amqpProxyService);
    }
}
