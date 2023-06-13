package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.PartKind;
import co.bird.android.model.wire.ReleaseValidationResult;
import co.bird.android.model.wire.WireNest;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b#\n\u0002\u0010\u0003\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001B«\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\bT\u0010UJ´\u0001\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0019\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001a\u001a\u00020\tHÖ\u0001J\u0013\u0010\u001d\u001a\u00020\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b.\u0010#\u001a\u0004\b/\u0010%R\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b0\u0010#\u001a\u0004\b1\u0010%R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b&\u00104R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u00103\u001a\u0004\b2\u00104R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b6\u00103\u001a\u0004\b7\u00104R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b7\u00103\u001a\u0004\b5\u00104R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b8\u00103\u001a\u0004\b.\u00104R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u00103\u001a\u0004\b8\u00104R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b6\u0010<R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010=\u001a\u0004\b*\u0010>R$\u0010F\u001a\u0004\u0018\u00010?8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER$\u0010K\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010=\u001a\u0004\bH\u0010>\"\u0004\bI\u0010JR\"\u0010O\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010#\u001a\u0004\bL\u0010%\"\u0004\bM\u0010NR\"\u0010Q\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010#\u001a\u0004\bG\u0010%\"\u0004\bP\u0010NR\"\u0010S\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010#\u001a\u0004\b@\u0010%\"\u0004\bR\u0010N¨\u0006V"}, m28432d2 = {"LKv4;", "LIx5;", "Lco/bird/android/model/wire/WireNest;", "nest", "", "showLockOption", "", "Lco/bird/android/model/wire/ReleaseValidationResult;", "validatedItems", "", "loading", "releaseEnabled", "lockOnRelease", "bulkMode", "enableMlKit", "enablePeripheralScanner", "showCodeInput", "showBluetooth", "showButton", "Lco/bird/android/model/constant/PartKind;", "part", "", "instructions", "n", "(Lco/bird/android/model/wire/WireNest;ZLjava/util/List;IZZLjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lco/bird/android/model/constant/PartKind;Ljava/lang/String;)LKv4;", "toString", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", C17296a.f69688o, "Lco/bird/android/model/wire/WireNest;", "s", "()Lco/bird/android/model/wire/WireNest;", "b", "Z", "w", "()Z", "c", "Ljava/util/List;", "x", "()Ljava/util/List;", DateTokenConverter.CONVERTER_KEY, "I", "q", "()I", "e", "u", "f", "r", "g", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "h", "i", "j", "k", "l", "m", "Lco/bird/android/model/constant/PartKind;", "()Lco/bird/android/model/constant/PartKind;", "Ljava/lang/String;", "()Ljava/lang/String;", "", "o", "Ljava/lang/Throwable;", "getError", "()Ljava/lang/Throwable;", "A", "(Ljava/lang/Throwable;)V", "error", "p", "v", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "(Ljava/lang/String;)V", "scanError", "t", "B", "(Z)V", "quantityExceeded", "z", "alertPermission", "y", "alertMocked", "<init>", "(Lco/bird/android/model/wire/WireNest;ZLjava/util/List;IZZLjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lco/bird/android/model/constant/PartKind;Ljava/lang/String;)V", "release_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Kv4  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34146Kv4 implements InterfaceC33697Ix5 {

    /* renamed from: a */
    public final WireNest f20371a;

    /* renamed from: b */
    public final boolean f20372b;

    /* renamed from: c */
    public final List<ReleaseValidationResult> f20373c;

    /* renamed from: d */
    public final int f20374d;

    /* renamed from: e */
    public final boolean f20375e;

    /* renamed from: f */
    public final boolean f20376f;

    /* renamed from: g */
    public final Boolean f20377g;

    /* renamed from: h */
    public final Boolean f20378h;

    /* renamed from: i */
    public final Boolean f20379i;

    /* renamed from: j */
    public final Boolean f20380j;

    /* renamed from: k */
    public final Boolean f20381k;

    /* renamed from: l */
    public final Boolean f20382l;

    /* renamed from: m */
    public final PartKind f20383m;

    /* renamed from: n */
    public final String f20384n;

    /* renamed from: o */
    public Throwable f20385o;

    /* renamed from: p */
    public String f20386p;

    /* renamed from: q */
    public boolean f20387q;

    /* renamed from: r */
    public boolean f20388r;

    /* renamed from: s */
    public boolean f20389s;

    public C34146Kv4() {
        this(null, false, null, 0, false, false, null, null, null, null, null, null, null, null, 16383, null);
    }

    /* renamed from: A */
    public final void m98145A(Throwable th) {
        this.f20385o = th;
    }

    /* renamed from: B */
    public final void m98144B(boolean z) {
        this.f20387q = z;
    }

    /* renamed from: C */
    public final void m98143C(String str) {
        this.f20386p = str;
    }

    @Override // p000.InterfaceC33697Ix5
    /* renamed from: c */
    public Boolean mo40320c() {
        return this.f20377g;
    }

    @Override // p000.InterfaceC33697Ix5
    /* renamed from: d */
    public String mo40319d() {
        return this.f20384n;
    }

    @Override // p000.InterfaceC33697Ix5
    /* renamed from: e */
    public Boolean mo40318e() {
        return this.f20381k;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C34146Kv4) {
            C34146Kv4 c34146Kv4 = (C34146Kv4) obj;
            return Intrinsics.areEqual(this.f20371a, c34146Kv4.f20371a) && this.f20372b == c34146Kv4.f20372b && Intrinsics.areEqual(this.f20373c, c34146Kv4.f20373c) && this.f20374d == c34146Kv4.f20374d && this.f20375e == c34146Kv4.f20375e && this.f20376f == c34146Kv4.f20376f && Intrinsics.areEqual(this.f20377g, c34146Kv4.f20377g) && Intrinsics.areEqual(this.f20378h, c34146Kv4.f20378h) && Intrinsics.areEqual(this.f20379i, c34146Kv4.f20379i) && Intrinsics.areEqual(this.f20380j, c34146Kv4.f20380j) && Intrinsics.areEqual(this.f20381k, c34146Kv4.f20381k) && Intrinsics.areEqual(this.f20382l, c34146Kv4.f20382l) && this.f20383m == c34146Kv4.f20383m && Intrinsics.areEqual(this.f20384n, c34146Kv4.f20384n);
        }
        return false;
    }

    @Override // p000.InterfaceC33697Ix5
    /* renamed from: g */
    public Boolean mo40317g() {
        return this.f20378h;
    }

    public final Throwable getError() {
        return this.f20385o;
    }

    @Override // p000.InterfaceC33697Ix5
    /* renamed from: h */
    public Boolean mo40316h() {
        return this.f20380j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        WireNest wireNest = this.f20371a;
        int hashCode = (wireNest == null ? 0 : wireNest.hashCode()) * 31;
        boolean z = this.f20372b;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int hashCode2 = (((((hashCode + i) * 31) + this.f20373c.hashCode()) * 31) + Integer.hashCode(this.f20374d)) * 31;
        boolean z2 = this.f20375e;
        int i2 = z2;
        if (z2 != 0) {
            i2 = 1;
        }
        int i3 = (hashCode2 + i2) * 31;
        boolean z3 = this.f20376f;
        int i4 = (i3 + (z3 ? 1 : z3 ? 1 : 0)) * 31;
        Boolean bool = this.f20377g;
        int hashCode3 = (i4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f20378h;
        int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f20379i;
        int hashCode5 = (hashCode4 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.f20380j;
        int hashCode6 = (hashCode5 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.f20381k;
        int hashCode7 = (hashCode6 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.f20382l;
        int hashCode8 = (hashCode7 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        PartKind partKind = this.f20383m;
        int hashCode9 = (hashCode8 + (partKind == null ? 0 : partKind.hashCode())) * 31;
        String str = this.f20384n;
        return hashCode9 + (str != null ? str.hashCode() : 0);
    }

    @Override // p000.InterfaceC33697Ix5
    /* renamed from: i */
    public PartKind mo40315i() {
        return this.f20383m;
    }

    @Override // p000.InterfaceC33697Ix5
    /* renamed from: j */
    public Boolean mo40314j() {
        return this.f20379i;
    }

    @Override // p000.InterfaceC33697Ix5
    /* renamed from: k */
    public Boolean mo40313k() {
        return this.f20382l;
    }

    /* renamed from: n */
    public final C34146Kv4 m98142n(WireNest wireNest, boolean z, List<ReleaseValidationResult> validatedItems, int i, boolean z2, boolean z3, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, PartKind partKind, String str) {
        Intrinsics.checkNotNullParameter(validatedItems, "validatedItems");
        return new C34146Kv4(wireNest, z, validatedItems, i, z2, z3, bool, bool2, bool3, bool4, bool5, bool6, partKind, str);
    }

    /* renamed from: o */
    public final boolean m98141o() {
        return this.f20389s;
    }

    /* renamed from: p */
    public final boolean m98140p() {
        return this.f20388r;
    }

    /* renamed from: q */
    public final int m98139q() {
        return this.f20374d;
    }

    /* renamed from: r */
    public final boolean m98138r() {
        return this.f20376f;
    }

    /* renamed from: s */
    public final WireNest m98137s() {
        return this.f20371a;
    }

    /* renamed from: t */
    public final boolean m98136t() {
        return this.f20387q;
    }

    public String toString() {
        WireNest wireNest = this.f20371a;
        boolean z = this.f20372b;
        List<ReleaseValidationResult> list = this.f20373c;
        int i = this.f20374d;
        boolean z2 = this.f20375e;
        boolean z3 = this.f20376f;
        Boolean bool = this.f20377g;
        Boolean bool2 = this.f20378h;
        Boolean bool3 = this.f20379i;
        Boolean bool4 = this.f20380j;
        Boolean bool5 = this.f20381k;
        Boolean bool6 = this.f20382l;
        PartKind partKind = this.f20383m;
        String str = this.f20384n;
        return "ReleaseScanState(nest=" + wireNest + ", showLockOption=" + z + ", validatedItems=" + list + ", loading=" + i + ", releaseEnabled=" + z2 + ", lockOnRelease=" + z3 + ", bulkMode=" + bool + ", enableMlKit=" + bool2 + ", enablePeripheralScanner=" + bool3 + ", showCodeInput=" + bool4 + ", showBluetooth=" + bool5 + ", showButton=" + bool6 + ", part=" + partKind + ", instructions=" + str + ")";
    }

    /* renamed from: u */
    public final boolean m98135u() {
        return this.f20375e;
    }

    /* renamed from: v */
    public final String m98134v() {
        return this.f20386p;
    }

    /* renamed from: w */
    public final boolean m98133w() {
        return this.f20372b;
    }

    /* renamed from: x */
    public final List<ReleaseValidationResult> m98132x() {
        return this.f20373c;
    }

    /* renamed from: y */
    public final void m98131y(boolean z) {
        this.f20389s = z;
    }

    /* renamed from: z */
    public final void m98130z(boolean z) {
        this.f20388r = z;
    }

    public C34146Kv4(WireNest wireNest, boolean z, List<ReleaseValidationResult> validatedItems, int i, boolean z2, boolean z3, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, PartKind partKind, String str) {
        Intrinsics.checkNotNullParameter(validatedItems, "validatedItems");
        this.f20371a = wireNest;
        this.f20372b = z;
        this.f20373c = validatedItems;
        this.f20374d = i;
        this.f20375e = z2;
        this.f20376f = z3;
        this.f20377g = bool;
        this.f20378h = bool2;
        this.f20379i = bool3;
        this.f20380j = bool4;
        this.f20381k = bool5;
        this.f20382l = bool6;
        this.f20383m = partKind;
        this.f20384n = str;
    }

    public /* synthetic */ C34146Kv4(WireNest wireNest, boolean z, List list, int i, boolean z2, boolean z3, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, PartKind partKind, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : wireNest, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i2 & 8) != 0 ? 0 : i, (i2 & 16) == 0 ? z2 : false, (i2 & 32) != 0 ? true : z3, (i2 & 64) != 0 ? null : bool, (i2 & 128) != 0 ? null : bool2, (i2 & 256) != 0 ? null : bool3, (i2 & 512) != 0 ? null : bool4, (i2 & 1024) != 0 ? null : bool5, (i2 & 2048) != 0 ? null : bool6, (i2 & 4096) != 0 ? null : partKind, (i2 & 8192) == 0 ? str : null);
    }
}
