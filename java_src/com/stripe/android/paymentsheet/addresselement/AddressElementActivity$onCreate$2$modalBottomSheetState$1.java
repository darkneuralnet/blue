package com.stripe.android.paymentsheet.addresselement;

import com.stripe.android.paymentsheet.addresselement.AddressElementScreen;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class AddressElementActivity$onCreate$2$modalBottomSheetState$1 extends Lambda implements Function1<HU2, Boolean> {
    final /* synthetic */ AddressElementActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressElementActivity$onCreate$2$modalBottomSheetState$1(AddressElementActivity addressElementActivity) {
        super(1);
        this.this$0 = addressElementActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(HU2 it) {
        OY2 oy2;
        HY2 m110261A;
        Intrinsics.checkNotNullParameter(it, "it");
        oy2 = this.this$0.navController;
        if (oy2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("navController");
            oy2 = null;
        }
        return Boolean.valueOf(!Intrinsics.areEqual(oy2.m110261A() != null ? m110261A.m103771w() : null, AddressElementScreen.Autocomplete.route));
    }
}
