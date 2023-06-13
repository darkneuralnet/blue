package com.stripe.android.paymentsheet.addresselement;
/* loaded from: classes7.dex */
public final class AddressElementNavigator_Factory implements InterfaceC48812sj1<AddressElementNavigator> {

    /* loaded from: classes7.dex */
    public static final class InstanceHolder {
        private static final AddressElementNavigator_Factory INSTANCE = new AddressElementNavigator_Factory();

        private InstanceHolder() {
        }
    }

    public static AddressElementNavigator_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static AddressElementNavigator newInstance() {
        return new AddressElementNavigator();
    }

    @Override // p000.Y94
    public AddressElementNavigator get() {
        return newInstance();
    }
}
