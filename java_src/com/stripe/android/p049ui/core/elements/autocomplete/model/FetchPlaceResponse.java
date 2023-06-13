package com.stripe.android.p049ui.core.elements.autocomplete.model;

import co.bird.android.model.LegacyRepairType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m28432d2 = {"Lcom/stripe/android/ui/core/elements/autocomplete/model/FetchPlaceResponse;", "", "place", "Lcom/stripe/android/ui/core/elements/autocomplete/model/Place;", "(Lcom/stripe/android/ui/core/elements/autocomplete/model/Place;)V", "getPlace", "()Lcom/stripe/android/ui/core/elements/autocomplete/model/Place;", "component1", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.ui.core.elements.autocomplete.model.FetchPlaceResponse */
/* loaded from: classes7.dex */
public final class FetchPlaceResponse {
    public static final int $stable = 8;
    private final Place place;

    public FetchPlaceResponse(Place place) {
        Intrinsics.checkNotNullParameter(place, "place");
        this.place = place;
    }

    public static /* synthetic */ FetchPlaceResponse copy$default(FetchPlaceResponse fetchPlaceResponse, Place place, int i, Object obj) {
        if ((i & 1) != 0) {
            place = fetchPlaceResponse.place;
        }
        return fetchPlaceResponse.copy(place);
    }

    public final Place component1() {
        return this.place;
    }

    public final FetchPlaceResponse copy(Place place) {
        Intrinsics.checkNotNullParameter(place, "place");
        return new FetchPlaceResponse(place);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FetchPlaceResponse) && Intrinsics.areEqual(this.place, ((FetchPlaceResponse) obj).place);
    }

    public final Place getPlace() {
        return this.place;
    }

    public int hashCode() {
        return this.place.hashCode();
    }

    public String toString() {
        Place place = this.place;
        return "FetchPlaceResponse(place=" + place + ")";
    }
}
