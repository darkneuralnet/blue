package p000;

import android.location.Location;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.wire.WireArea;
import co.bird.android.model.wire.WireNestArea;
import co.bird.android.model.wire.WireNestSuggestionMessage;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.maps.model.LatLng;
import com.stripe.android.model.PaymentMethod;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b&\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B§\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\bQ\u0010RJ°\u0001\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u001b\u001a\u00020\u0013HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010 \u001a\u0004\b!\u0010\"R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b(\u0010&R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b%\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b2\u00104\u001a\u0004\b,\u00105R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b#\u0010<R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b=\u0010;\u001a\u0004\b=\u0010<R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b(\u0010;\u001a\u0004\b>\u0010<R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010?\u001a\u0004\b0\u0010AR$\u0010D\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010)\u001a\u0004\b:\u0010+\"\u0004\bB\u0010CR$\u0010J\u001a\u0004\u0018\u00010E8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u0010F\u001a\u0004\b'\u0010G\"\u0004\bH\u0010IR$\u0010P\u001a\u0004\u0018\u00010K8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010L\u001a\u0004\b6\u0010M\"\u0004\bN\u0010O¨\u0006S"}, m28432d2 = {"LOU5;", "", "", "progress", "", "Lco/bird/android/model/wire/WireArea;", "invalidAreas", "Lco/bird/android/model/wire/WireNestArea;", "nests", "Landroid/location/Location;", "userLocation", "", "userHeading", "", "maxNestDistanceFromUserMeters", "LBj6;", "locationValidity", "Lcom/google/android/gms/maps/model/LatLng;", "suggestedNestLatLng", "", PaymentMethod.BillingDetails.PARAM_ADDRESS, "name", "notes", "suggestedCapacity", "maxCapacity", C17296a.f69688o, "(ILjava/util/List;Ljava/util/List;Landroid/location/Location;Ljava/lang/Float;DLBj6;Lcom/google/android/gms/maps/model/LatLng;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)LOU5;", "toString", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "I", "m", "()I", "b", "Ljava/util/List;", DateTokenConverter.CONVERTER_KEY, "()Ljava/util/List;", "c", "k", "Landroid/location/Location;", "q", "()Landroid/location/Location;", "e", "Ljava/lang/Float;", "p", "()Ljava/lang/Float;", "f", "D", "g", "()D", "LBj6;", "()LBj6;", "h", "Lcom/google/android/gms/maps/model/LatLng;", "o", "()Lcom/google/android/gms/maps/model/LatLng;", "i", "Ljava/lang/String;", "()Ljava/lang/String;", "j", "l", "Ljava/lang/Integer;", "n", "()Ljava/lang/Integer;", "t", "(Landroid/location/Location;)V", "moveTo", "", "Ljava/lang/Throwable;", "()Ljava/lang/Throwable;", "r", "(Ljava/lang/Throwable;)V", "error", "Lco/bird/android/model/wire/WireNestSuggestionMessage;", "Lco/bird/android/model/wire/WireNestSuggestionMessage;", "()Lco/bird/android/model/wire/WireNestSuggestionMessage;", "s", "(Lco/bird/android/model/wire/WireNestSuggestionMessage;)V", "message", "<init>", "(ILjava/util/List;Ljava/util/List;Landroid/location/Location;Ljava/lang/Float;DLBj6;Lcom/google/android/gms/maps/model/LatLng;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "suggest-a-nest_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: OU5 */
/* loaded from: classes3.dex */
public final class OU5 {

    /* renamed from: a */
    public final int f26647a;

    /* renamed from: b */
    public final List<WireArea> f26648b;

    /* renamed from: c */
    public final List<WireNestArea> f26649c;

    /* renamed from: d */
    public final Location f26650d;

    /* renamed from: e */
    public final Float f26651e;

    /* renamed from: f */
    public final double f26652f;

    /* renamed from: g */
    public final EnumC31934Bj6 f26653g;

    /* renamed from: h */
    public final LatLng f26654h;

    /* renamed from: i */
    public final String f26655i;

    /* renamed from: j */
    public final String f26656j;

    /* renamed from: k */
    public final String f26657k;

    /* renamed from: l */
    public final Integer f26658l;

    /* renamed from: m */
    public final Integer f26659m;

    /* renamed from: n */
    public Location f26660n;

    /* renamed from: o */
    public Throwable f26661o;

    /* renamed from: p */
    public WireNestSuggestionMessage f26662p;

    public OU5() {
        this(0, null, null, null, null, 0.0d, null, null, null, null, null, null, null, 8191, null);
    }

    /* renamed from: a */
    public final OU5 m92190a(int i, List<WireArea> invalidAreas, List<WireNestArea> nests, Location location, Float f, double d, EnumC31934Bj6 enumC31934Bj6, LatLng latLng, String str, String str2, String str3, Integer num, Integer num2) {
        Intrinsics.checkNotNullParameter(invalidAreas, "invalidAreas");
        Intrinsics.checkNotNullParameter(nests, "nests");
        return new OU5(i, invalidAreas, nests, location, f, d, enumC31934Bj6, latLng, str, str2, str3, num, num2);
    }

    /* renamed from: b */
    public final String m92189b() {
        return this.f26655i;
    }

    /* renamed from: c */
    public final Throwable m92188c() {
        return this.f26661o;
    }

    /* renamed from: d */
    public final List<WireArea> m92187d() {
        return this.f26648b;
    }

    /* renamed from: e */
    public final EnumC31934Bj6 m92186e() {
        return this.f26653g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OU5) {
            OU5 ou5 = (OU5) obj;
            return this.f26647a == ou5.f26647a && Intrinsics.areEqual(this.f26648b, ou5.f26648b) && Intrinsics.areEqual(this.f26649c, ou5.f26649c) && Intrinsics.areEqual(this.f26650d, ou5.f26650d) && Intrinsics.areEqual((Object) this.f26651e, (Object) ou5.f26651e) && Double.compare(this.f26652f, ou5.f26652f) == 0 && this.f26653g == ou5.f26653g && Intrinsics.areEqual(this.f26654h, ou5.f26654h) && Intrinsics.areEqual(this.f26655i, ou5.f26655i) && Intrinsics.areEqual(this.f26656j, ou5.f26656j) && Intrinsics.areEqual(this.f26657k, ou5.f26657k) && Intrinsics.areEqual(this.f26658l, ou5.f26658l) && Intrinsics.areEqual(this.f26659m, ou5.f26659m);
        }
        return false;
    }

    /* renamed from: f */
    public final Integer m92185f() {
        return this.f26659m;
    }

    /* renamed from: g */
    public final double m92184g() {
        return this.f26652f;
    }

    /* renamed from: h */
    public final WireNestSuggestionMessage m92183h() {
        return this.f26662p;
    }

    public int hashCode() {
        int hashCode = ((((Integer.hashCode(this.f26647a) * 31) + this.f26648b.hashCode()) * 31) + this.f26649c.hashCode()) * 31;
        Location location = this.f26650d;
        int hashCode2 = (hashCode + (location == null ? 0 : location.hashCode())) * 31;
        Float f = this.f26651e;
        int hashCode3 = (((hashCode2 + (f == null ? 0 : f.hashCode())) * 31) + Double.hashCode(this.f26652f)) * 31;
        EnumC31934Bj6 enumC31934Bj6 = this.f26653g;
        int hashCode4 = (hashCode3 + (enumC31934Bj6 == null ? 0 : enumC31934Bj6.hashCode())) * 31;
        LatLng latLng = this.f26654h;
        int hashCode5 = (hashCode4 + (latLng == null ? 0 : latLng.hashCode())) * 31;
        String str = this.f26655i;
        int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f26656j;
        int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f26657k;
        int hashCode8 = (hashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.f26658l;
        int hashCode9 = (hashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f26659m;
        return hashCode9 + (num2 != null ? num2.hashCode() : 0);
    }

    /* renamed from: i */
    public final Location m92182i() {
        return this.f26660n;
    }

    /* renamed from: j */
    public final String m92181j() {
        return this.f26656j;
    }

    /* renamed from: k */
    public final List<WireNestArea> m92180k() {
        return this.f26649c;
    }

    /* renamed from: l */
    public final String m92179l() {
        return this.f26657k;
    }

    /* renamed from: m */
    public final int m92178m() {
        return this.f26647a;
    }

    /* renamed from: n */
    public final Integer m92177n() {
        return this.f26658l;
    }

    /* renamed from: o */
    public final LatLng m92176o() {
        return this.f26654h;
    }

    /* renamed from: p */
    public final Float m92175p() {
        return this.f26651e;
    }

    /* renamed from: q */
    public final Location m92174q() {
        return this.f26650d;
    }

    /* renamed from: r */
    public final void m92173r(Throwable th) {
        this.f26661o = th;
    }

    /* renamed from: s */
    public final void m92172s(WireNestSuggestionMessage wireNestSuggestionMessage) {
        this.f26662p = wireNestSuggestionMessage;
    }

    /* renamed from: t */
    public final void m92171t(Location location) {
        this.f26660n = location;
    }

    public String toString() {
        int i = this.f26647a;
        List<WireArea> list = this.f26648b;
        List<WireNestArea> list2 = this.f26649c;
        Location location = this.f26650d;
        Float f = this.f26651e;
        double d = this.f26652f;
        EnumC31934Bj6 enumC31934Bj6 = this.f26653g;
        LatLng latLng = this.f26654h;
        String str = this.f26655i;
        String str2 = this.f26656j;
        String str3 = this.f26657k;
        Integer num = this.f26658l;
        Integer num2 = this.f26659m;
        return "SuggestNestState(progress=" + i + ", invalidAreas=" + list + ", nests=" + list2 + ", userLocation=" + location + ", userHeading=" + f + ", maxNestDistanceFromUserMeters=" + d + ", locationValidity=" + enumC31934Bj6 + ", suggestedNestLatLng=" + latLng + ", address=" + str + ", name=" + str2 + ", notes=" + str3 + ", suggestedCapacity=" + num + ", maxCapacity=" + num2 + ")";
    }

    public OU5(int i, List<WireArea> invalidAreas, List<WireNestArea> nests, Location location, Float f, double d, EnumC31934Bj6 enumC31934Bj6, LatLng latLng, String str, String str2, String str3, Integer num, Integer num2) {
        Intrinsics.checkNotNullParameter(invalidAreas, "invalidAreas");
        Intrinsics.checkNotNullParameter(nests, "nests");
        this.f26647a = i;
        this.f26648b = invalidAreas;
        this.f26649c = nests;
        this.f26650d = location;
        this.f26651e = f;
        this.f26652f = d;
        this.f26653g = enumC31934Bj6;
        this.f26654h = latLng;
        this.f26655i = str;
        this.f26656j = str2;
        this.f26657k = str3;
        this.f26658l = num;
        this.f26659m = num2;
    }

    public /* synthetic */ OU5(int i, List list, List list2, Location location, Float f, double d, EnumC31934Bj6 enumC31934Bj6, LatLng latLng, String str, String str2, String str3, Integer num, Integer num2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i2 & 4) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2, (i2 & 8) != 0 ? null : location, (i2 & 16) != 0 ? null : f, (i2 & 32) != 0 ? 0.0d : d, (i2 & 64) != 0 ? null : enumC31934Bj6, (i2 & 128) != 0 ? null : latLng, (i2 & 256) != 0 ? null : str, (i2 & 512) != 0 ? null : str2, (i2 & 1024) != 0 ? null : str3, (i2 & 2048) != 0 ? null : num, (i2 & 4096) == 0 ? num2 : null);
    }
}
