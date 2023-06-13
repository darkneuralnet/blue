package com.stripe.android.financialconnections.features.consent;

import com.stripe.android.financialconnections.features.consent.ConsentState;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "Lcom/stripe/android/financialconnections/features/consent/ConsentState;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class ConsentViewModel$onClickableTextClick$4 extends Lambda implements Function1<ConsentState, ConsentState> {
    final /* synthetic */ Date $date;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConsentViewModel$onClickableTextClick$4(Date date) {
        super(1);
        this.$date = date;
    }

    @Override // kotlin.jvm.functions.Function1
    public final ConsentState invoke(ConsentState setState) {
        Intrinsics.checkNotNullParameter(setState, "$this$setState");
        return ConsentState.copy$default(setState, null, null, ConsentState.BottomSheetContent.LEGAL, null, new ConsentState.ViewEffect.OpenBottomSheet(this.$date.getTime()), 11, null);
    }
}
