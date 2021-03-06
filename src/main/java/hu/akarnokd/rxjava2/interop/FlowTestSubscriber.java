/*
 * Copyright 2016 David Karnok
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

package hu.akarnokd.rxjava2.interop;

import io.reactivex.subscribers.TestSubscriber;

import java.util.concurrent.Flow;

/**
 * A TestSubscriber also extending the Flow.Subscriber interface.
 * @since 0.1.0
 */
public class FlowTestSubscriber<T> extends TestSubscriber<T> implements Flow.Subscriber<T> {

    @Override
    public final void onSubscribe(Flow.Subscription subscription) {
        onSubscribe(new FlowToRsSubscription(subscription));
    }
}
