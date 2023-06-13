package com.stripe.android.payments.bankaccount.p043di;

import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.payments.bankaccount.di.CollectBankAccountModule$providePublishableKey$1 */
/* loaded from: classes7.dex */
public final class CollectBankAccountModule$providePublishableKey$1 extends Lambda implements Function0<String> {
    final /* synthetic */ CollectBankAccountContract.Args $args;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectBankAccountModule$providePublishableKey$1(CollectBankAccountContract.Args args) {
        super(0);
        this.$args = args;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        return this.$args.getPublishableKey();
    }
}
