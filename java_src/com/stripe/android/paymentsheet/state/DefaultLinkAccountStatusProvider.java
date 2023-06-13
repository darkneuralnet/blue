package com.stripe.android.paymentsheet.state;

import com.stripe.android.link.LinkPaymentLauncher;
import com.stripe.android.link.model.AccountStatus;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096Bø\u0001\u0000¢\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/state/DefaultLinkAccountStatusProvider;", "Lcom/stripe/android/paymentsheet/state/LinkAccountStatusProvider;", "linkLauncher", "Lcom/stripe/android/link/LinkPaymentLauncher;", "(Lcom/stripe/android/link/LinkPaymentLauncher;)V", "invoke", "Lcom/stripe/android/link/model/AccountStatus;", "configuration", "Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;", "(Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class DefaultLinkAccountStatusProvider implements LinkAccountStatusProvider {
    private final LinkPaymentLauncher linkLauncher;

    public DefaultLinkAccountStatusProvider(LinkPaymentLauncher linkLauncher) {
        Intrinsics.checkNotNullParameter(linkLauncher, "linkLauncher");
        this.linkLauncher = linkLauncher;
    }

    @Override // com.stripe.android.paymentsheet.state.LinkAccountStatusProvider
    public Object invoke(LinkPaymentLauncher.Configuration configuration, Continuation<? super AccountStatus> continuation) {
        return C36708Vu1.m79248w(this.linkLauncher.getAccountStatusFlow(configuration), continuation);
    }
}
