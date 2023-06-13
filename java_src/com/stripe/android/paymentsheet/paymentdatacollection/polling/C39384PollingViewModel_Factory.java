package com.stripe.android.paymentsheet.paymentdatacollection.polling;

import androidx.lifecycle.C11747p;
import com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingViewModel;
import com.stripe.android.polling.IntentStatusPoller;
/* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingViewModel_Factory  reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39384PollingViewModel_Factory implements InterfaceC48812sj1<PollingViewModel> {
    private final Y94<PollingViewModel.Args> argsProvider;
    private final Y94<SC0> dispatcherProvider;
    private final Y94<IntentStatusPoller> pollerProvider;
    private final Y94<C11747p> savedStateHandleProvider;
    private final Y94<TimeProvider> timeProvider;

    public C39384PollingViewModel_Factory(Y94<PollingViewModel.Args> y94, Y94<IntentStatusPoller> y942, Y94<TimeProvider> y943, Y94<SC0> y944, Y94<C11747p> y945) {
        this.argsProvider = y94;
        this.pollerProvider = y942;
        this.timeProvider = y943;
        this.dispatcherProvider = y944;
        this.savedStateHandleProvider = y945;
    }

    public static C39384PollingViewModel_Factory create(Y94<PollingViewModel.Args> y94, Y94<IntentStatusPoller> y942, Y94<TimeProvider> y943, Y94<SC0> y944, Y94<C11747p> y945) {
        return new C39384PollingViewModel_Factory(y94, y942, y943, y944, y945);
    }

    public static PollingViewModel newInstance(PollingViewModel.Args args, IntentStatusPoller intentStatusPoller, TimeProvider timeProvider, SC0 sc0, C11747p c11747p) {
        return new PollingViewModel(args, intentStatusPoller, timeProvider, sc0, c11747p);
    }

    @Override // p000.Y94
    public PollingViewModel get() {
        return newInstance(this.argsProvider.get(), this.pollerProvider.get(), this.timeProvider.get(), this.dispatcherProvider.get(), this.savedStateHandleProvider.get());
    }
}
