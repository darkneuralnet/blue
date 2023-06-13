package com.stripe.android.financialconnections.features.consent;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lcom/stripe/android/financialconnections/features/consent/ConsentState;", "Ldp;", "", "it", "invoke", "(Lcom/stripe/android/financialconnections/features/consent/ConsentState;Ldp;)Lcom/stripe/android/financialconnections/features/consent/ConsentState;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class ConsentViewModel$onContinueClick$2 extends Lambda implements Function2<ConsentState, AbstractC19862dp<? extends Unit>, ConsentState> {
    public static final ConsentViewModel$onContinueClick$2 INSTANCE = new ConsentViewModel$onContinueClick$2();

    public ConsentViewModel$onContinueClick$2() {
        super(2);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final ConsentState invoke2(ConsentState execute, AbstractC19862dp<Unit> it) {
        Intrinsics.checkNotNullParameter(execute, "$this$execute");
        Intrinsics.checkNotNullParameter(it, "it");
        return ConsentState.copy$default(execute, null, null, null, it, null, 23, null);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ ConsentState invoke(ConsentState consentState, AbstractC19862dp<? extends Unit> abstractC19862dp) {
        return invoke2(consentState, (AbstractC19862dp<Unit>) abstractC19862dp);
    }
}
