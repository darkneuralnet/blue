package com.stripe.android.link.injection;

import com.stripe.android.link.LinkActivityContract;
import com.stripe.android.link.LinkPaymentLauncher;
/* renamed from: com.stripe.android.link.injection.LinkActivityContractArgsModule_Companion_ProvideConfigurationFactory */
/* loaded from: classes7.dex */
public final class C18986x95336a07 implements InterfaceC48812sj1<LinkPaymentLauncher.Configuration> {
    private final Y94<LinkActivityContract.Args> argsProvider;

    public C18986x95336a07(Y94<LinkActivityContract.Args> y94) {
        this.argsProvider = y94;
    }

    public static C18986x95336a07 create(Y94<LinkActivityContract.Args> y94) {
        return new C18986x95336a07(y94);
    }

    public static LinkPaymentLauncher.Configuration provideConfiguration(LinkActivityContract.Args args) {
        return (LinkPaymentLauncher.Configuration) C51679xZ3.m5002e(LinkActivityContractArgsModule.Companion.provideConfiguration(args));
    }

    @Override // p000.Y94
    public LinkPaymentLauncher.Configuration get() {
        return provideConfiguration(this.argsProvider.get());
    }
}
