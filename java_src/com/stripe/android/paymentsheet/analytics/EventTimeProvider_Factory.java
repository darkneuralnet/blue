package com.stripe.android.paymentsheet.analytics;
/* loaded from: classes7.dex */
public final class EventTimeProvider_Factory implements InterfaceC48812sj1<EventTimeProvider> {

    /* loaded from: classes7.dex */
    public static final class InstanceHolder {
        private static final EventTimeProvider_Factory INSTANCE = new EventTimeProvider_Factory();

        private InstanceHolder() {
        }
    }

    public static EventTimeProvider_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static EventTimeProvider newInstance() {
        return new EventTimeProvider();
    }

    @Override // p000.Y94
    public EventTimeProvider get() {
        return newInstance();
    }
}
