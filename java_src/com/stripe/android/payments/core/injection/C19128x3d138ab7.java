package com.stripe.android.payments.core.injection;

import android.app.Application;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionContract;
import com.stripe.android.stripe3ds2.transaction.InitChallengeRepository;
import kotlin.coroutines.CoroutineContext;
/* renamed from: com.stripe.android.payments.core.injection.Stripe3dsTransactionViewModelModule_ProvidesInitChallengeRepositoryFactory */
/* loaded from: classes7.dex */
public final class C19128x3d138ab7 implements InterfaceC48812sj1<InitChallengeRepository> {
    private final Y94<Application> applicationProvider;
    private final Y94<Stripe3ds2TransactionContract.Args> argsProvider;
    private final Stripe3dsTransactionViewModelModule module;
    private final Y94<CoroutineContext> workContextProvider;

    public C19128x3d138ab7(Stripe3dsTransactionViewModelModule stripe3dsTransactionViewModelModule, Y94<Application> y94, Y94<Stripe3ds2TransactionContract.Args> y942, Y94<CoroutineContext> y943) {
        this.module = stripe3dsTransactionViewModelModule;
        this.applicationProvider = y94;
        this.argsProvider = y942;
        this.workContextProvider = y943;
    }

    public static C19128x3d138ab7 create(Stripe3dsTransactionViewModelModule stripe3dsTransactionViewModelModule, Y94<Application> y94, Y94<Stripe3ds2TransactionContract.Args> y942, Y94<CoroutineContext> y943) {
        return new C19128x3d138ab7(stripe3dsTransactionViewModelModule, y94, y942, y943);
    }

    public static InitChallengeRepository providesInitChallengeRepository(Stripe3dsTransactionViewModelModule stripe3dsTransactionViewModelModule, Application application, Stripe3ds2TransactionContract.Args args, CoroutineContext coroutineContext) {
        return (InitChallengeRepository) C51679xZ3.m5002e(stripe3dsTransactionViewModelModule.providesInitChallengeRepository(application, args, coroutineContext));
    }

    @Override // p000.Y94
    public InitChallengeRepository get() {
        return providesInitChallengeRepository(this.module, this.applicationProvider.get(), this.argsProvider.get(), this.workContextProvider.get());
    }
}
