package com.stripe.android.paymentsheet.addresselement;

import android.content.Intent;
import com.stripe.android.paymentsheet.addresselement.AddressElementActivityContract;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class AddressElementActivity$starterArgs$2 extends Lambda implements Function0<AddressElementActivityContract.Args> {
    final /* synthetic */ AddressElementActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressElementActivity$starterArgs$2(AddressElementActivity addressElementActivity) {
        super(0);
        this.this$0 = addressElementActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final AddressElementActivityContract.Args invoke() {
        AddressElementActivityContract.Args.Companion companion = AddressElementActivityContract.Args.Companion;
        Intent intent = this.this$0.getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "intent");
        AddressElementActivityContract.Args fromIntent$paymentsheet_release = companion.fromIntent$paymentsheet_release(intent);
        if (fromIntent$paymentsheet_release != null) {
            return fromIntent$paymentsheet_release;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
