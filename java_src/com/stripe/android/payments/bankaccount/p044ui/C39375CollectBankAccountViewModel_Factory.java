package com.stripe.android.payments.bankaccount.p044ui;

import androidx.lifecycle.C11747p;
import com.stripe.android.core.Logger;
import com.stripe.android.payments.bankaccount.domain.AttachFinancialConnectionsSession;
import com.stripe.android.payments.bankaccount.domain.CreateFinancialConnectionsSession;
import com.stripe.android.payments.bankaccount.domain.RetrieveStripeIntent;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract;
/* renamed from: com.stripe.android.payments.bankaccount.ui.CollectBankAccountViewModel_Factory  reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39375CollectBankAccountViewModel_Factory implements InterfaceC48812sj1<CollectBankAccountViewModel> {
    private final Y94<BX2<CollectBankAccountViewEffect>> _viewEffectProvider;
    private final Y94<CollectBankAccountContract.Args> argsProvider;
    private final Y94<AttachFinancialConnectionsSession> attachFinancialConnectionsSessionProvider;
    private final Y94<CreateFinancialConnectionsSession> createFinancialConnectionsSessionProvider;
    private final Y94<Logger> loggerProvider;
    private final Y94<RetrieveStripeIntent> retrieveStripeIntentProvider;
    private final Y94<C11747p> savedStateHandleProvider;

    public C39375CollectBankAccountViewModel_Factory(Y94<CollectBankAccountContract.Args> y94, Y94<BX2<CollectBankAccountViewEffect>> y942, Y94<CreateFinancialConnectionsSession> y943, Y94<AttachFinancialConnectionsSession> y944, Y94<RetrieveStripeIntent> y945, Y94<C11747p> y946, Y94<Logger> y947) {
        this.argsProvider = y94;
        this._viewEffectProvider = y942;
        this.createFinancialConnectionsSessionProvider = y943;
        this.attachFinancialConnectionsSessionProvider = y944;
        this.retrieveStripeIntentProvider = y945;
        this.savedStateHandleProvider = y946;
        this.loggerProvider = y947;
    }

    public static C39375CollectBankAccountViewModel_Factory create(Y94<CollectBankAccountContract.Args> y94, Y94<BX2<CollectBankAccountViewEffect>> y942, Y94<CreateFinancialConnectionsSession> y943, Y94<AttachFinancialConnectionsSession> y944, Y94<RetrieveStripeIntent> y945, Y94<C11747p> y946, Y94<Logger> y947) {
        return new C39375CollectBankAccountViewModel_Factory(y94, y942, y943, y944, y945, y946, y947);
    }

    public static CollectBankAccountViewModel newInstance(CollectBankAccountContract.Args args, BX2<CollectBankAccountViewEffect> bx2, CreateFinancialConnectionsSession createFinancialConnectionsSession, AttachFinancialConnectionsSession attachFinancialConnectionsSession, RetrieveStripeIntent retrieveStripeIntent, C11747p c11747p, Logger logger) {
        return new CollectBankAccountViewModel(args, bx2, createFinancialConnectionsSession, attachFinancialConnectionsSession, retrieveStripeIntent, c11747p, logger);
    }

    @Override // p000.Y94
    public CollectBankAccountViewModel get() {
        return newInstance(this.argsProvider.get(), this._viewEffectProvider.get(), this.createFinancialConnectionsSessionProvider.get(), this.attachFinancialConnectionsSessionProvider.get(), this.retrieveStripeIntentProvider.get(), this.savedStateHandleProvider.get(), this.loggerProvider.get());
    }
}
