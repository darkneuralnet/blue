package com.stripe.android.view;

import com.stripe.android.CustomerSession;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/stripe/android/CustomerSession;", "invoke-d1pmJ48", "()Ljava/lang/Object;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nPaymentMethodsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentMethodsActivity.kt\ncom/stripe/android/view/PaymentMethodsActivity$customerSession$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,304:1\n1#2:305\n*E\n"})
/* loaded from: classes7.dex */
public final class PaymentMethodsActivity$customerSession$2 extends Lambda implements Function0<Result<? extends CustomerSession>> {
    final /* synthetic */ PaymentMethodsActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodsActivity$customerSession$2(PaymentMethodsActivity paymentMethodsActivity) {
        super(0);
        this.this$0 = paymentMethodsActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Result<? extends CustomerSession> invoke() {
        return Result.m116782boximpl(m116777invoked1pmJ48());
    }

    /* renamed from: invoke-d1pmJ48  reason: not valid java name */
    public final Object m116777invoked1pmJ48() {
        try {
            Result.Companion companion = Result.Companion;
            return Result.m116783constructorimpl(CustomerSession.Companion.getInstance());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            return Result.m116783constructorimpl(ResultKt.createFailure(th));
        }
    }
}
