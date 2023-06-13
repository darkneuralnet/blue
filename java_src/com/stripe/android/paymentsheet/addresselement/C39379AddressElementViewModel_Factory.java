package com.stripe.android.paymentsheet.addresselement;
/* renamed from: com.stripe.android.paymentsheet.addresselement.AddressElementViewModel_Factory  reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39379AddressElementViewModel_Factory implements InterfaceC48812sj1<AddressElementViewModel> {
    private final Y94<AddressElementNavigator> navigatorProvider;

    public C39379AddressElementViewModel_Factory(Y94<AddressElementNavigator> y94) {
        this.navigatorProvider = y94;
    }

    public static C39379AddressElementViewModel_Factory create(Y94<AddressElementNavigator> y94) {
        return new C39379AddressElementViewModel_Factory(y94);
    }

    public static AddressElementViewModel newInstance(AddressElementNavigator addressElementNavigator) {
        return new AddressElementViewModel(addressElementNavigator);
    }

    @Override // p000.Y94
    public AddressElementViewModel get() {
        return newInstance(this.navigatorProvider.get());
    }
}
