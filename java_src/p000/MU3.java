package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import com.google.android.libraries.places.api.model.Place;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, m28432d2 = {"LMU3;", "LTv2;", "Lcom/google/android/libraries/places/api/model/Place;", "place", C17296a.f69688o, "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Lcom/google/android/libraries/places/api/model/Place;", "getPlace", "()Lcom/google/android/libraries/places/api/model/Place;", "<init>", "(Lcom/google/android/libraries/places/api/model/Place;)V", "locals-survey_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: MU3 */
/* loaded from: classes3.dex */
public final class MU3 extends AbstractC36250Tv2 {

    /* renamed from: a */
    public final Place f23150a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MU3(Place place) {
        super(null);
        Intrinsics.checkNotNullParameter(place, "place");
        this.f23150a = place;
    }

    public static /* synthetic */ MU3 copy$default(MU3 mu3, Place place, int i, Object obj) {
        if ((i & 1) != 0) {
            place = mu3.f23150a;
        }
        return mu3.m95284a(place);
    }

    /* renamed from: a */
    public final MU3 m95284a(Place place) {
        Intrinsics.checkNotNullParameter(place, "place");
        return new MU3(place);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MU3) && Intrinsics.areEqual(this.f23150a, ((MU3) obj).f23150a);
    }

    public int hashCode() {
        return this.f23150a.hashCode();
    }

    public String toString() {
        Place place = this.f23150a;
        return "PlaceInvalidSelection(place=" + place + ")";
    }
}
