package com.stripe.android.p049ui.core.elements.autocomplete.model;

import co.bird.android.model.LegacyRepairType;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m28432d2 = {"Lcom/stripe/android/ui/core/elements/autocomplete/model/FindAutocompletePredictionsResponse;", "", "autocompletePredictions", "", "Lcom/stripe/android/ui/core/elements/autocomplete/model/AutocompletePrediction;", "(Ljava/util/List;)V", "getAutocompletePredictions", "()Ljava/util/List;", "component1", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.ui.core.elements.autocomplete.model.FindAutocompletePredictionsResponse */
/* loaded from: classes7.dex */
public final class FindAutocompletePredictionsResponse {
    public static final int $stable = 8;
    private final List<AutocompletePrediction> autocompletePredictions;

    public FindAutocompletePredictionsResponse(List<AutocompletePrediction> autocompletePredictions) {
        Intrinsics.checkNotNullParameter(autocompletePredictions, "autocompletePredictions");
        this.autocompletePredictions = autocompletePredictions;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FindAutocompletePredictionsResponse copy$default(FindAutocompletePredictionsResponse findAutocompletePredictionsResponse, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = findAutocompletePredictionsResponse.autocompletePredictions;
        }
        return findAutocompletePredictionsResponse.copy(list);
    }

    public final List<AutocompletePrediction> component1() {
        return this.autocompletePredictions;
    }

    public final FindAutocompletePredictionsResponse copy(List<AutocompletePrediction> autocompletePredictions) {
        Intrinsics.checkNotNullParameter(autocompletePredictions, "autocompletePredictions");
        return new FindAutocompletePredictionsResponse(autocompletePredictions);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FindAutocompletePredictionsResponse) && Intrinsics.areEqual(this.autocompletePredictions, ((FindAutocompletePredictionsResponse) obj).autocompletePredictions);
    }

    public final List<AutocompletePrediction> getAutocompletePredictions() {
        return this.autocompletePredictions;
    }

    public int hashCode() {
        return this.autocompletePredictions.hashCode();
    }

    public String toString() {
        List<AutocompletePrediction> list = this.autocompletePredictions;
        return "FindAutocompletePredictionsResponse(autocompletePredictions=" + list + ")";
    }
}
