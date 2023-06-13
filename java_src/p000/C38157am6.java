package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.PartKind;
import co.bird.android.model.persistence.Bird;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.location.places.Place;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0019\n\u0002\u0010\u0003\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b7\u00108J\u008a\u0001\u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0014\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010\"\u001a\u0004\b%\u0010#R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010\"\u001a\u0004\b'\u0010#R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010\"\u001a\u0004\b)\u0010#R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b&\u0010#R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010\"\u001a\u0004\b*\u0010#R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b+\u0010-R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010.\u001a\u0004\b$\u0010/R$\u00106\u001a\u0004\u0018\u0001008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105¨\u00069"}, m28432d2 = {"Lam6;", "LIx5;", "", "Lco/bird/android/model/persistence/Bird;", "scannedVehicles", "", "loading", "", "bulkMode", "enableMlKit", "enablePeripheralScanner", "showCodeInput", "showBluetooth", "showButton", "Lco/bird/android/model/constant/PartKind;", "part", "", "instructions", "n", "(Ljava/util/List;ILjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lco/bird/android/model/constant/PartKind;Ljava/lang/String;)Lam6;", "toString", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", C17296a.f69688o, "Ljava/util/List;", "p", "()Ljava/util/List;", "b", "I", "o", "()I", "c", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", DateTokenConverter.CONVERTER_KEY, "g", "e", "j", "f", "h", "k", "i", "Lco/bird/android/model/constant/PartKind;", "()Lco/bird/android/model/constant/PartKind;", "Ljava/lang/String;", "()Ljava/lang/String;", "", "Ljava/lang/Throwable;", "getError", "()Ljava/lang/Throwable;", "q", "(Ljava/lang/Throwable;)V", "error", "<init>", "(Ljava/util/List;ILjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lco/bird/android/model/constant/PartKind;Ljava/lang/String;)V", "co.bird.android.feature.complaintresolution"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: am6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C38157am6 implements InterfaceC33697Ix5 {

    /* renamed from: a */
    public final List<Bird> f51212a;

    /* renamed from: b */
    public final int f51213b;

    /* renamed from: c */
    public final Boolean f51214c;

    /* renamed from: d */
    public final Boolean f51215d;

    /* renamed from: e */
    public final Boolean f51216e;

    /* renamed from: f */
    public final Boolean f51217f;

    /* renamed from: g */
    public final Boolean f51218g;

    /* renamed from: h */
    public final Boolean f51219h;

    /* renamed from: i */
    public final PartKind f51220i;

    /* renamed from: j */
    public final String f51221j;

    /* renamed from: k */
    public Throwable f51222k;

    public C38157am6() {
        this(null, 0, null, null, null, null, null, null, null, null, Place.TYPE_SUBLOCALITY_LEVEL_1, null);
    }

    @Override // p000.InterfaceC33697Ix5
    /* renamed from: c */
    public Boolean mo40320c() {
        return this.f51214c;
    }

    @Override // p000.InterfaceC33697Ix5
    /* renamed from: d */
    public String mo40319d() {
        return this.f51221j;
    }

    @Override // p000.InterfaceC33697Ix5
    /* renamed from: e */
    public Boolean mo40318e() {
        return this.f51218g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C38157am6) {
            C38157am6 c38157am6 = (C38157am6) obj;
            return Intrinsics.areEqual(this.f51212a, c38157am6.f51212a) && this.f51213b == c38157am6.f51213b && Intrinsics.areEqual(this.f51214c, c38157am6.f51214c) && Intrinsics.areEqual(this.f51215d, c38157am6.f51215d) && Intrinsics.areEqual(this.f51216e, c38157am6.f51216e) && Intrinsics.areEqual(this.f51217f, c38157am6.f51217f) && Intrinsics.areEqual(this.f51218g, c38157am6.f51218g) && Intrinsics.areEqual(this.f51219h, c38157am6.f51219h) && this.f51220i == c38157am6.f51220i && Intrinsics.areEqual(this.f51221j, c38157am6.f51221j);
        }
        return false;
    }

    @Override // p000.InterfaceC33697Ix5
    /* renamed from: g */
    public Boolean mo40317g() {
        return this.f51215d;
    }

    public final Throwable getError() {
        return this.f51222k;
    }

    @Override // p000.InterfaceC33697Ix5
    /* renamed from: h */
    public Boolean mo40316h() {
        return this.f51217f;
    }

    public int hashCode() {
        int hashCode = ((this.f51212a.hashCode() * 31) + Integer.hashCode(this.f51213b)) * 31;
        Boolean bool = this.f51214c;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f51215d;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f51216e;
        int hashCode4 = (hashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.f51217f;
        int hashCode5 = (hashCode4 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.f51218g;
        int hashCode6 = (hashCode5 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.f51219h;
        int hashCode7 = (hashCode6 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        PartKind partKind = this.f51220i;
        int hashCode8 = (hashCode7 + (partKind == null ? 0 : partKind.hashCode())) * 31;
        String str = this.f51221j;
        return hashCode8 + (str != null ? str.hashCode() : 0);
    }

    @Override // p000.InterfaceC33697Ix5
    /* renamed from: i */
    public PartKind mo40315i() {
        return this.f51220i;
    }

    @Override // p000.InterfaceC33697Ix5
    /* renamed from: j */
    public Boolean mo40314j() {
        return this.f51216e;
    }

    @Override // p000.InterfaceC33697Ix5
    /* renamed from: k */
    public Boolean mo40313k() {
        return this.f51219h;
    }

    /* renamed from: n */
    public final C38157am6 m70762n(List<Bird> scannedVehicles, int i, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, PartKind partKind, String str) {
        Intrinsics.checkNotNullParameter(scannedVehicles, "scannedVehicles");
        return new C38157am6(scannedVehicles, i, bool, bool2, bool3, bool4, bool5, bool6, partKind, str);
    }

    /* renamed from: o */
    public final int m70761o() {
        return this.f51213b;
    }

    /* renamed from: p */
    public final List<Bird> m70760p() {
        return this.f51212a;
    }

    /* renamed from: q */
    public final void m70759q(Throwable th) {
        this.f51222k = th;
    }

    public String toString() {
        List<Bird> list = this.f51212a;
        int i = this.f51213b;
        Boolean bool = this.f51214c;
        Boolean bool2 = this.f51215d;
        Boolean bool3 = this.f51216e;
        Boolean bool4 = this.f51217f;
        Boolean bool5 = this.f51218g;
        Boolean bool6 = this.f51219h;
        PartKind partKind = this.f51220i;
        String str = this.f51221j;
        return "VehicleInvolvedScanState(scannedVehicles=" + list + ", loading=" + i + ", bulkMode=" + bool + ", enableMlKit=" + bool2 + ", enablePeripheralScanner=" + bool3 + ", showCodeInput=" + bool4 + ", showBluetooth=" + bool5 + ", showButton=" + bool6 + ", part=" + partKind + ", instructions=" + str + ")";
    }

    public C38157am6(List<Bird> scannedVehicles, int i, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, PartKind partKind, String str) {
        Intrinsics.checkNotNullParameter(scannedVehicles, "scannedVehicles");
        this.f51212a = scannedVehicles;
        this.f51213b = i;
        this.f51214c = bool;
        this.f51215d = bool2;
        this.f51216e = bool3;
        this.f51217f = bool4;
        this.f51218g = bool5;
        this.f51219h = bool6;
        this.f51220i = partKind;
        this.f51221j = str;
    }

    public /* synthetic */ C38157am6(List list, int i, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, PartKind partKind, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : bool, (i2 & 8) != 0 ? null : bool2, (i2 & 16) != 0 ? null : bool3, (i2 & 32) != 0 ? null : bool4, (i2 & 64) != 0 ? null : bool5, (i2 & 128) != 0 ? null : bool6, (i2 & 256) != 0 ? null : partKind, (i2 & 512) == 0 ? str : null);
    }
}
