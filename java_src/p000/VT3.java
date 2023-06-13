package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import com.google.android.libraries.places.api.model.Place;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0004\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, m28432d2 = {"LVT3;", "LTv2;", "Lcom/google/android/libraries/places/api/model/Place;", "place", C17296a.f69688o, "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Lcom/google/android/libraries/places/api/model/Place;", "b", "()Lcom/google/android/libraries/places/api/model/Place;", "<init>", "(Lcom/google/android/libraries/places/api/model/Place;)V", "locals-survey_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: VT3 */
/* loaded from: classes3.dex */
public final class VT3 extends AbstractC36250Tv2 {

    /* renamed from: a */
    public final Place f39130a;

    public VT3(Place place) {
        super(null);
        this.f39130a = place;
    }

    public static /* synthetic */ VT3 copy$default(VT3 vt3, Place place, int i, Object obj) {
        if ((i & 1) != 0) {
            place = vt3.f39130a;
        }
        return vt3.m79859a(place);
    }

    /* renamed from: a */
    public final VT3 m79859a(Place place) {
        return new VT3(place);
    }

    /* renamed from: b */
    public final Place m79858b() {
        return this.f39130a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VT3) && Intrinsics.areEqual(this.f39130a, ((VT3) obj).f39130a);
    }

    public int hashCode() {
        Place place = this.f39130a;
        if (place == null) {
            return 0;
        }
        return place.hashCode();
    }

    public String toString() {
        Place place = this.f39130a;
        return "PlaceConfirmed(place=" + place + ")";
    }
}
