package com.stripe.android.paymentsheet.paymentdatacollection.polling;

import android.content.Intent;
import com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingContract;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingContract$Args;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class PollingActivity$args$2 extends Lambda implements Function0<PollingContract.Args> {
    final /* synthetic */ PollingActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PollingActivity$args$2(PollingActivity pollingActivity) {
        super(0);
        this.this$0 = pollingActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final PollingContract.Args invoke() {
        PollingContract.Args.Companion companion = PollingContract.Args.Companion;
        Intent intent = this.this$0.getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "intent");
        PollingContract.Args fromIntent = companion.fromIntent(intent);
        if (fromIntent != null) {
            return fromIntent;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
