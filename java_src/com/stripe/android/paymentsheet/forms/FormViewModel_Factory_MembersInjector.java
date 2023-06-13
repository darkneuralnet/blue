package com.stripe.android.paymentsheet.forms;

import com.stripe.android.paymentsheet.forms.FormViewModel;
import com.stripe.android.paymentsheet.injection.FormViewModelSubcomponent;
import dagger.MembersInjector;
/* loaded from: classes7.dex */
public final class FormViewModel_Factory_MembersInjector implements MembersInjector<FormViewModel.Factory> {
    private final Y94<FormViewModelSubcomponent.Builder> subComponentBuilderProvider;

    public FormViewModel_Factory_MembersInjector(Y94<FormViewModelSubcomponent.Builder> y94) {
        this.subComponentBuilderProvider = y94;
    }

    public static MembersInjector<FormViewModel.Factory> create(Y94<FormViewModelSubcomponent.Builder> y94) {
        return new FormViewModel_Factory_MembersInjector(y94);
    }

    public static void injectSubComponentBuilderProvider(FormViewModel.Factory factory, Y94<FormViewModelSubcomponent.Builder> y94) {
        factory.subComponentBuilderProvider = y94;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(FormViewModel.Factory factory) {
        injectSubComponentBuilderProvider(factory, this.subComponentBuilderProvider);
    }
}
