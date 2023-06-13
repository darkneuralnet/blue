package com.stripe.android.payments.bankaccount.p044ui;

import android.content.Intent;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.payments.bankaccount.ui.CollectBankAccountActivity$starterArgs$2 */
/* loaded from: classes7.dex */
public final class CollectBankAccountActivity$starterArgs$2 extends Lambda implements Function0<CollectBankAccountContract.Args> {
    final /* synthetic */ CollectBankAccountActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectBankAccountActivity$starterArgs$2(CollectBankAccountActivity collectBankAccountActivity) {
        super(0);
        this.this$0 = collectBankAccountActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final CollectBankAccountContract.Args invoke() {
        CollectBankAccountContract.Args.Companion companion = CollectBankAccountContract.Args.Companion;
        Intent intent = this.this$0.getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "intent");
        return companion.fromIntent(intent);
    }
}
