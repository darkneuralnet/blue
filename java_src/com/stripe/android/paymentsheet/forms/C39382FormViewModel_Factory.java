package com.stripe.android.paymentsheet.forms;

import android.content.Context;
import com.stripe.android.p049ui.core.forms.resources.LpmRepository;
import com.stripe.android.paymentsheet.paymentdatacollection.FormArguments;
import com.stripe.android.uicore.address.AddressRepository;
/* renamed from: com.stripe.android.paymentsheet.forms.FormViewModel_Factory  reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39382FormViewModel_Factory implements InterfaceC48812sj1<FormViewModel> {
    private final Y94<AddressRepository> addressRepositoryProvider;
    private final Y94<Context> contextProvider;
    private final Y94<FormArguments> formArgumentsProvider;
    private final Y94<LpmRepository> lpmRepositoryProvider;
    private final Y94<InterfaceC32730Eu1<Boolean>> showCheckboxFlowProvider;

    public C39382FormViewModel_Factory(Y94<Context> y94, Y94<FormArguments> y942, Y94<LpmRepository> y943, Y94<AddressRepository> y944, Y94<InterfaceC32730Eu1<Boolean>> y945) {
        this.contextProvider = y94;
        this.formArgumentsProvider = y942;
        this.lpmRepositoryProvider = y943;
        this.addressRepositoryProvider = y944;
        this.showCheckboxFlowProvider = y945;
    }

    public static C39382FormViewModel_Factory create(Y94<Context> y94, Y94<FormArguments> y942, Y94<LpmRepository> y943, Y94<AddressRepository> y944, Y94<InterfaceC32730Eu1<Boolean>> y945) {
        return new C39382FormViewModel_Factory(y94, y942, y943, y944, y945);
    }

    public static FormViewModel newInstance(Context context, FormArguments formArguments, LpmRepository lpmRepository, AddressRepository addressRepository, InterfaceC32730Eu1<Boolean> interfaceC32730Eu1) {
        return new FormViewModel(context, formArguments, lpmRepository, addressRepository, interfaceC32730Eu1);
    }

    @Override // p000.Y94
    public FormViewModel get() {
        return newInstance(this.contextProvider.get(), this.formArgumentsProvider.get(), this.lpmRepositoryProvider.get(), this.addressRepositoryProvider.get(), this.showCheckboxFlowProvider.get());
    }
}
