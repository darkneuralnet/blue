package com.stripe.android.paymentsheet.paymentdatacollection.polling;

import com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingViewModel;
import com.stripe.android.paymentsheet.paymentdatacollection.polling.p046di.PollingViewModelSubcomponent;
import dagger.MembersInjector;
/* loaded from: classes7.dex */
public final class PollingViewModel_Factory_MembersInjector implements MembersInjector<PollingViewModel.Factory> {
    private final Y94<PollingViewModelSubcomponent.Builder> subcomponentBuilderProvider;

    public PollingViewModel_Factory_MembersInjector(Y94<PollingViewModelSubcomponent.Builder> y94) {
        this.subcomponentBuilderProvider = y94;
    }

    public static MembersInjector<PollingViewModel.Factory> create(Y94<PollingViewModelSubcomponent.Builder> y94) {
        return new PollingViewModel_Factory_MembersInjector(y94);
    }

    public static void injectSubcomponentBuilderProvider(PollingViewModel.Factory factory, Y94<PollingViewModelSubcomponent.Builder> y94) {
        factory.subcomponentBuilderProvider = y94;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(PollingViewModel.Factory factory) {
        injectSubcomponentBuilderProvider(factory, this.subcomponentBuilderProvider);
    }
}
