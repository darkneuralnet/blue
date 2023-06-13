package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.PartKind;
import co.bird.android.model.wire.WireCaptureValidation;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.location.places.Place;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0019\n\u0002\u0010\u0003\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\bC\u0010DJ\u008a\u0001\u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0014\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010\"\u001a\u0004\b%\u0010#R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010\"\u001a\u0004\b'\u0010#R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010\"\u001a\u0004\b)\u0010#R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b&\u0010#R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010\"\u001a\u0004\b*\u0010#R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b+\u0010-R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010.\u001a\u0004\b$\u0010/R$\u00106\u001a\u0004\u0018\u0001008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R$\u0010;\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u0010.\u001a\u0004\b8\u0010/\"\u0004\b9\u0010:R\"\u0010B\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010A¨\u0006E"}, m28432d2 = {"LYe0;", "LIx5;", "", "Lco/bird/android/model/wire/WireCaptureValidation;", "vehicles", "", "loading", "", "bulkMode", "enableMlKit", "enablePeripheralScanner", "showCodeInput", "showBluetooth", "showButton", "Lco/bird/android/model/constant/PartKind;", "part", "", "instructions", "n", "(Ljava/util/List;ILjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lco/bird/android/model/constant/PartKind;Ljava/lang/String;)LYe0;", "toString", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", C17296a.f69688o, "Ljava/util/List;", "r", "()Ljava/util/List;", "b", "I", "q", "()I", "c", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", DateTokenConverter.CONVERTER_KEY, "g", "e", "j", "f", "h", "k", "i", "Lco/bird/android/model/constant/PartKind;", "()Lco/bird/android/model/constant/PartKind;", "Ljava/lang/String;", "()Ljava/lang/String;", "", "Ljava/lang/Throwable;", "getError", "()Ljava/lang/Throwable;", "t", "(Ljava/lang/Throwable;)V", "error", "l", "p", "u", "(Ljava/lang/String;)V", "failureReason", "m", "Z", "o", "()Z", "s", "(Z)V", "captureConfirmation", "<init>", "(Ljava/util/List;ILjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lco/bird/android/model/constant/PartKind;Ljava/lang/String;)V", "bulk-scanner_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Ye0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C37265Ye0 implements InterfaceC33697Ix5 {

    /* renamed from: a */
    public final List<WireCaptureValidation> f46159a;

    /* renamed from: b */
    public final int f46160b;

    /* renamed from: c */
    public final Boolean f46161c;

    /* renamed from: d */
    public final Boolean f46162d;

    /* renamed from: e */
    public final Boolean f46163e;

    /* renamed from: f */
    public final Boolean f46164f;

    /* renamed from: g */
    public final Boolean f46165g;

    /* renamed from: h */
    public final Boolean f46166h;

    /* renamed from: i */
    public final PartKind f46167i;

    /* renamed from: j */
    public final String f46168j;

    /* renamed from: k */
    public Throwable f46169k;

    /* renamed from: l */
    public String f46170l;

    /* renamed from: m */
    public boolean f46171m;

    public C37265Ye0() {
        this(null, 0, null, null, null, null, null, null, null, null, Place.TYPE_SUBLOCALITY_LEVEL_1, null);
    }

    @Override // p000.InterfaceC33697Ix5
    /* renamed from: c */
    public Boolean mo40320c() {
        return this.f46161c;
    }

    @Override // p000.InterfaceC33697Ix5
    /* renamed from: d */
    public String mo40319d() {
        return this.f46168j;
    }

    @Override // p000.InterfaceC33697Ix5
    /* renamed from: e */
    public Boolean mo40318e() {
        return this.f46165g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C37265Ye0) {
            C37265Ye0 c37265Ye0 = (C37265Ye0) obj;
            return Intrinsics.areEqual(this.f46159a, c37265Ye0.f46159a) && this.f46160b == c37265Ye0.f46160b && Intrinsics.areEqual(this.f46161c, c37265Ye0.f46161c) && Intrinsics.areEqual(this.f46162d, c37265Ye0.f46162d) && Intrinsics.areEqual(this.f46163e, c37265Ye0.f46163e) && Intrinsics.areEqual(this.f46164f, c37265Ye0.f46164f) && Intrinsics.areEqual(this.f46165g, c37265Ye0.f46165g) && Intrinsics.areEqual(this.f46166h, c37265Ye0.f46166h) && this.f46167i == c37265Ye0.f46167i && Intrinsics.areEqual(this.f46168j, c37265Ye0.f46168j);
        }
        return false;
    }

    @Override // p000.InterfaceC33697Ix5
    /* renamed from: g */
    public Boolean mo40317g() {
        return this.f46162d;
    }

    public final Throwable getError() {
        return this.f46169k;
    }

    @Override // p000.InterfaceC33697Ix5
    /* renamed from: h */
    public Boolean mo40316h() {
        return this.f46164f;
    }

    public int hashCode() {
        int hashCode = ((this.f46159a.hashCode() * 31) + Integer.hashCode(this.f46160b)) * 31;
        Boolean bool = this.f46161c;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f46162d;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f46163e;
        int hashCode4 = (hashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.f46164f;
        int hashCode5 = (hashCode4 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.f46165g;
        int hashCode6 = (hashCode5 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.f46166h;
        int hashCode7 = (hashCode6 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        PartKind partKind = this.f46167i;
        int hashCode8 = (hashCode7 + (partKind == null ? 0 : partKind.hashCode())) * 31;
        String str = this.f46168j;
        return hashCode8 + (str != null ? str.hashCode() : 0);
    }

    @Override // p000.InterfaceC33697Ix5
    /* renamed from: i */
    public PartKind mo40315i() {
        return this.f46167i;
    }

    @Override // p000.InterfaceC33697Ix5
    /* renamed from: j */
    public Boolean mo40314j() {
        return this.f46163e;
    }

    @Override // p000.InterfaceC33697Ix5
    /* renamed from: k */
    public Boolean mo40313k() {
        return this.f46166h;
    }

    /* renamed from: n */
    public final C37265Ye0 m74663n(List<WireCaptureValidation> vehicles, int i, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, PartKind partKind, String str) {
        Intrinsics.checkNotNullParameter(vehicles, "vehicles");
        return new C37265Ye0(vehicles, i, bool, bool2, bool3, bool4, bool5, bool6, partKind, str);
    }

    /* renamed from: o */
    public final boolean m74662o() {
        return this.f46171m;
    }

    /* renamed from: p */
    public final String m74661p() {
        return this.f46170l;
    }

    /* renamed from: q */
    public final int m74660q() {
        return this.f46160b;
    }

    /* renamed from: r */
    public final List<WireCaptureValidation> m74659r() {
        return this.f46159a;
    }

    /* renamed from: s */
    public final void m74658s(boolean z) {
        this.f46171m = z;
    }

    /* renamed from: t */
    public final void m74657t(Throwable th) {
        this.f46169k = th;
    }

    public String toString() {
        List<WireCaptureValidation> list = this.f46159a;
        int i = this.f46160b;
        Boolean bool = this.f46161c;
        Boolean bool2 = this.f46162d;
        Boolean bool3 = this.f46163e;
        Boolean bool4 = this.f46164f;
        Boolean bool5 = this.f46165g;
        Boolean bool6 = this.f46166h;
        PartKind partKind = this.f46167i;
        String str = this.f46168j;
        return "CaptureBulkScannerState(vehicles=" + list + ", loading=" + i + ", bulkMode=" + bool + ", enableMlKit=" + bool2 + ", enablePeripheralScanner=" + bool3 + ", showCodeInput=" + bool4 + ", showBluetooth=" + bool5 + ", showButton=" + bool6 + ", part=" + partKind + ", instructions=" + str + ")";
    }

    /* renamed from: u */
    public final void m74656u(String str) {
        this.f46170l = str;
    }

    public C37265Ye0(List<WireCaptureValidation> vehicles, int i, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, PartKind partKind, String str) {
        Intrinsics.checkNotNullParameter(vehicles, "vehicles");
        this.f46159a = vehicles;
        this.f46160b = i;
        this.f46161c = bool;
        this.f46162d = bool2;
        this.f46163e = bool3;
        this.f46164f = bool4;
        this.f46165g = bool5;
        this.f46166h = bool6;
        this.f46167i = partKind;
        this.f46168j = str;
    }

    public /* synthetic */ C37265Ye0(List list, int i, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, PartKind partKind, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : bool, (i2 & 8) != 0 ? null : bool2, (i2 & 16) != 0 ? null : bool3, (i2 & 32) != 0 ? null : bool4, (i2 & 64) != 0 ? null : bool5, (i2 & 128) != 0 ? null : bool6, (i2 & 256) != 0 ? null : partKind, (i2 & 512) == 0 ? str : null);
    }
}
