package com.stripe.android.financialconnections.features.institutionpicker;

import com.stripe.android.financialconnections.model.InstitutionResponse;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;", "Ldp;", "Lcom/stripe/android/financialconnections/model/InstitutionResponse;", "it", "invoke", "(Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;Ldp;)Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class InstitutionPickerViewModel$onQueryChanged$2 extends Lambda implements Function2<InstitutionPickerState, AbstractC19862dp<? extends InstitutionResponse>, InstitutionPickerState> {
    final /* synthetic */ InstitutionPickerViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstitutionPickerViewModel$onQueryChanged$2(InstitutionPickerViewModel institutionPickerViewModel) {
        super(2);
        this.this$0 = institutionPickerViewModel;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ InstitutionPickerState invoke(InstitutionPickerState institutionPickerState, AbstractC19862dp<? extends InstitutionResponse> abstractC19862dp) {
        return invoke2(institutionPickerState, (AbstractC19862dp<InstitutionResponse>) abstractC19862dp);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final InstitutionPickerState invoke2(InstitutionPickerState execute, AbstractC19862dp<InstitutionResponse> it) {
        boolean isCancellationError;
        Intrinsics.checkNotNullParameter(execute, "$this$execute");
        Intrinsics.checkNotNullParameter(it, "it");
        isCancellationError = this.this$0.isCancellationError(it);
        if (isCancellationError) {
            it = new C31786At2<>(null, 1, null);
        }
        return InstitutionPickerState.copy$default(execute, false, false, null, it, 7, null);
    }
}
