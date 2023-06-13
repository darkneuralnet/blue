package p000;

import co.bird.android.model.Country;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, m28432d2 = {"Lir5;", "Lg70;", "Lco/bird/android/model/Country;", "country", C17296a.f69688o, "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Lco/bird/android/model/Country;", "getCountry", "()Lco/bird/android/model/Country;", "<init>", "(Lco/bird/android/model/Country;)V", "eventbus_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: ir5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C42967ir5 extends AbstractC41342g70 {

    /* renamed from: a */
    public final Country f91394a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42967ir5(Country country) {
        super(null);
        Intrinsics.checkNotNullParameter(country, "country");
        this.f91394a = country;
    }

    public static /* synthetic */ C42967ir5 copy$default(C42967ir5 c42967ir5, Country country, int i, Object obj) {
        if ((i & 1) != 0) {
            country = c42967ir5.f91394a;
        }
        return c42967ir5.m31750a(country);
    }

    /* renamed from: a */
    public final C42967ir5 m31750a(Country country) {
        Intrinsics.checkNotNullParameter(country, "country");
        return new C42967ir5(country);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C42967ir5) && Intrinsics.areEqual(this.f91394a, ((C42967ir5) obj).f91394a);
    }

    public int hashCode() {
        return this.f91394a.hashCode();
    }

    public String toString() {
        Country country = this.f91394a;
        return "SelectCountryEvent(country=" + country + ")";
    }
}
