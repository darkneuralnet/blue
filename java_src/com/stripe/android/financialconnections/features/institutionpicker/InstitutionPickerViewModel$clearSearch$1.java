package com.stripe.android.financialconnections.features.institutionpicker;

import com.stripe.android.financialconnections.model.InstitutionResponse;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class InstitutionPickerViewModel$clearSearch$1 extends Lambda implements Function1<InstitutionPickerState, InstitutionPickerState> {
    public static final InstitutionPickerViewModel$clearSearch$1 INSTANCE = new InstitutionPickerViewModel$clearSearch$1();

    public InstitutionPickerViewModel$clearSearch$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final InstitutionPickerState invoke(InstitutionPickerState setState) {
        List emptyList;
        Intrinsics.checkNotNullParameter(setState, "$this$setState");
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        return InstitutionPickerState.copy$default(setState, false, false, null, new C51034wT5(new InstitutionResponse(emptyList)), 6, null);
    }
}
