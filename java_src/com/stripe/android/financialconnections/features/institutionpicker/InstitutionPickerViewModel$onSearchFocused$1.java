package com.stripe.android.financialconnections.features.institutionpicker;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class InstitutionPickerViewModel$onSearchFocused$1 extends Lambda implements Function1<InstitutionPickerState, InstitutionPickerState> {
    public static final InstitutionPickerViewModel$onSearchFocused$1 INSTANCE = new InstitutionPickerViewModel$onSearchFocused$1();

    public InstitutionPickerViewModel$onSearchFocused$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final InstitutionPickerState invoke(InstitutionPickerState setState) {
        Intrinsics.checkNotNullParameter(setState, "$this$setState");
        return InstitutionPickerState.copy$default(setState, true, false, null, null, 14, null);
    }
}