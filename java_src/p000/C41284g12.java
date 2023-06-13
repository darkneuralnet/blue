package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.PartKind;
import co.bird.android.model.wire.WireSkuOrder;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0003\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u008d\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b]\u0010^J\u0096\u0001\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0016\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u001a\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b#\u0010)R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010(\u001a\u0004\b+\u0010)R\u001c\u0010\f\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010(\u001a\u0004\b-\u0010)R\u001c\u0010\r\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010(\u001a\u0004\b.\u0010)R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010(\u001a\u0004\b*\u0010)R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u0010(\u001a\u0004\b0\u0010)R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u00101\u001a\u0004\b/\u00102R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u00103\u001a\u0004\b'\u00104R$\u0010<\u001a\u0004\u0018\u0001058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R$\u0010D\u001a\u0004\u0018\u00010=8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR$\u0010H\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u00103\u001a\u0004\bE\u00104\"\u0004\bF\u0010GR$\u0010O\u001a\u0004\u0018\u00010I8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\"\u0010U\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR$\u0010\\\u001a\u0004\u0018\u00010V8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[¨\u0006_"}, m28432d2 = {"Lg12;", "LIx5;", "Lco/bird/android/model/wire/WireSkuOrder;", "skuOrder", "", "LPC5;", "scannedItems", "", "loading", "", "bulkMode", "enableMlKit", "enablePeripheralScanner", "showCodeInput", "showBluetooth", "showButton", "Lco/bird/android/model/constant/PartKind;", "part", "", "instructions", "n", "(Lco/bird/android/model/wire/WireSkuOrder;Ljava/util/List;ILjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lco/bird/android/model/constant/PartKind;Ljava/lang/String;)Lg12;", "toString", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", C17296a.f69688o, "Lco/bird/android/model/wire/WireSkuOrder;", "v", "()Lco/bird/android/model/wire/WireSkuOrder;", "b", "Ljava/util/List;", "u", "()Ljava/util/List;", "c", "I", "q", "()I", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "e", "g", "f", "j", "h", "i", "k", "Lco/bird/android/model/constant/PartKind;", "()Lco/bird/android/model/constant/PartKind;", "Ljava/lang/String;", "()Ljava/lang/String;", "Lam5;", "l", "Lam5;", "t", "()Lam5;", "B", "(Lam5;)V", "scannedItem", "Lck5;", "m", "Lck5;", "s", "()Lck5;", "A", "(Lck5;)V", "scanError", "o", "w", "(Ljava/lang/String;)V", "duplicateScan", "LSw1;", "LSw1;", "p", "()LSw1;", "y", "(LSw1;)V", "forceScanConfirmation", "Z", "r", "()Z", "z", "(Z)V", "quantityExceeded", "", "Ljava/lang/Throwable;", "getError", "()Ljava/lang/Throwable;", "x", "(Ljava/lang/Throwable;)V", "error", "<init>", "(Lco/bird/android/model/wire/WireSkuOrder;Ljava/util/List;ILjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lco/bird/android/model/constant/PartKind;Ljava/lang/String;)V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: g12  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C41284g12 implements InterfaceC33697Ix5 {

    /* renamed from: a */
    public final WireSkuOrder f81329a;

    /* renamed from: b */
    public final List<PC5> f81330b;

    /* renamed from: c */
    public final int f81331c;

    /* renamed from: d */
    public final Boolean f81332d;

    /* renamed from: e */
    public final Boolean f81333e;

    /* renamed from: f */
    public final Boolean f81334f;

    /* renamed from: g */
    public final Boolean f81335g;

    /* renamed from: h */
    public final Boolean f81336h;

    /* renamed from: i */
    public final Boolean f81337i;

    /* renamed from: j */
    public final PartKind f81338j;

    /* renamed from: k */
    public final String f81339k;

    /* renamed from: l */
    public C38156am5 f81340l;

    /* renamed from: m */
    public C39322ck5 f81341m;

    /* renamed from: n */
    public String f81342n;

    /* renamed from: o */
    public C36024Sw1 f81343o;

    /* renamed from: p */
    public boolean f81344p;

    /* renamed from: q */
    public Throwable f81345q;

    public C41284g12() {
        this(null, null, 0, null, null, null, null, null, null, null, null, 2047, null);
    }

    /* renamed from: A */
    public final void m40322A(C39322ck5 c39322ck5) {
        this.f81341m = c39322ck5;
    }

    /* renamed from: B */
    public final void m40321B(C38156am5 c38156am5) {
        this.f81340l = c38156am5;
    }

    @Override // p000.InterfaceC33697Ix5
    /* renamed from: c */
    public Boolean mo40320c() {
        return this.f81332d;
    }

    @Override // p000.InterfaceC33697Ix5
    /* renamed from: d */
    public String mo40319d() {
        return this.f81339k;
    }

    @Override // p000.InterfaceC33697Ix5
    /* renamed from: e */
    public Boolean mo40318e() {
        return this.f81336h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C41284g12) {
            C41284g12 c41284g12 = (C41284g12) obj;
            return Intrinsics.areEqual(this.f81329a, c41284g12.f81329a) && Intrinsics.areEqual(this.f81330b, c41284g12.f81330b) && this.f81331c == c41284g12.f81331c && Intrinsics.areEqual(this.f81332d, c41284g12.f81332d) && Intrinsics.areEqual(this.f81333e, c41284g12.f81333e) && Intrinsics.areEqual(this.f81334f, c41284g12.f81334f) && Intrinsics.areEqual(this.f81335g, c41284g12.f81335g) && Intrinsics.areEqual(this.f81336h, c41284g12.f81336h) && Intrinsics.areEqual(this.f81337i, c41284g12.f81337i) && this.f81338j == c41284g12.f81338j && Intrinsics.areEqual(this.f81339k, c41284g12.f81339k);
        }
        return false;
    }

    @Override // p000.InterfaceC33697Ix5
    /* renamed from: g */
    public Boolean mo40317g() {
        return this.f81333e;
    }

    public final Throwable getError() {
        return this.f81345q;
    }

    @Override // p000.InterfaceC33697Ix5
    /* renamed from: h */
    public Boolean mo40316h() {
        return this.f81335g;
    }

    public int hashCode() {
        WireSkuOrder wireSkuOrder = this.f81329a;
        int hashCode = (((((wireSkuOrder == null ? 0 : wireSkuOrder.hashCode()) * 31) + this.f81330b.hashCode()) * 31) + Integer.hashCode(this.f81331c)) * 31;
        Boolean bool = this.f81332d;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f81333e;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f81334f;
        int hashCode4 = (hashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.f81335g;
        int hashCode5 = (hashCode4 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.f81336h;
        int hashCode6 = (hashCode5 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.f81337i;
        int hashCode7 = (hashCode6 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        PartKind partKind = this.f81338j;
        int hashCode8 = (hashCode7 + (partKind == null ? 0 : partKind.hashCode())) * 31;
        String str = this.f81339k;
        return hashCode8 + (str != null ? str.hashCode() : 0);
    }

    @Override // p000.InterfaceC33697Ix5
    /* renamed from: i */
    public PartKind mo40315i() {
        return this.f81338j;
    }

    @Override // p000.InterfaceC33697Ix5
    /* renamed from: j */
    public Boolean mo40314j() {
        return this.f81334f;
    }

    @Override // p000.InterfaceC33697Ix5
    /* renamed from: k */
    public Boolean mo40313k() {
        return this.f81337i;
    }

    /* renamed from: n */
    public final C41284g12 m40312n(WireSkuOrder wireSkuOrder, List<PC5> scannedItems, int i, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, PartKind partKind, String str) {
        Intrinsics.checkNotNullParameter(scannedItems, "scannedItems");
        return new C41284g12(wireSkuOrder, scannedItems, i, bool, bool2, bool3, bool4, bool5, bool6, partKind, str);
    }

    /* renamed from: o */
    public final String m40311o() {
        return this.f81342n;
    }

    /* renamed from: p */
    public final C36024Sw1 m40310p() {
        return this.f81343o;
    }

    /* renamed from: q */
    public final int m40309q() {
        return this.f81331c;
    }

    /* renamed from: r */
    public final boolean m40308r() {
        return this.f81344p;
    }

    /* renamed from: s */
    public final C39322ck5 m40307s() {
        return this.f81341m;
    }

    /* renamed from: t */
    public final C38156am5 m40306t() {
        return this.f81340l;
    }

    public String toString() {
        WireSkuOrder wireSkuOrder = this.f81329a;
        List<PC5> list = this.f81330b;
        int i = this.f81331c;
        Boolean bool = this.f81332d;
        Boolean bool2 = this.f81333e;
        Boolean bool3 = this.f81334f;
        Boolean bool4 = this.f81335g;
        Boolean bool5 = this.f81336h;
        Boolean bool6 = this.f81337i;
        PartKind partKind = this.f81338j;
        String str = this.f81339k;
        return "InboundScanState(skuOrder=" + wireSkuOrder + ", scannedItems=" + list + ", loading=" + i + ", bulkMode=" + bool + ", enableMlKit=" + bool2 + ", enablePeripheralScanner=" + bool3 + ", showCodeInput=" + bool4 + ", showBluetooth=" + bool5 + ", showButton=" + bool6 + ", part=" + partKind + ", instructions=" + str + ")";
    }

    /* renamed from: u */
    public final List<PC5> m40305u() {
        return this.f81330b;
    }

    /* renamed from: v */
    public final WireSkuOrder m40304v() {
        return this.f81329a;
    }

    /* renamed from: w */
    public final void m40303w(String str) {
        this.f81342n = str;
    }

    /* renamed from: x */
    public final void m40302x(Throwable th) {
        this.f81345q = th;
    }

    /* renamed from: y */
    public final void m40301y(C36024Sw1 c36024Sw1) {
        this.f81343o = c36024Sw1;
    }

    /* renamed from: z */
    public final void m40300z(boolean z) {
        this.f81344p = z;
    }

    public C41284g12(WireSkuOrder wireSkuOrder, List<PC5> scannedItems, int i, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, PartKind partKind, String str) {
        Intrinsics.checkNotNullParameter(scannedItems, "scannedItems");
        this.f81329a = wireSkuOrder;
        this.f81330b = scannedItems;
        this.f81331c = i;
        this.f81332d = bool;
        this.f81333e = bool2;
        this.f81334f = bool3;
        this.f81335g = bool4;
        this.f81336h = bool5;
        this.f81337i = bool6;
        this.f81338j = partKind;
        this.f81339k = str;
    }

    public /* synthetic */ C41284g12(WireSkuOrder wireSkuOrder, List list, int i, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, PartKind partKind, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : wireSkuOrder, (i2 & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? null : bool, (i2 & 16) != 0 ? null : bool2, (i2 & 32) != 0 ? null : bool3, (i2 & 64) != 0 ? null : bool4, (i2 & 128) != 0 ? null : bool5, (i2 & 256) != 0 ? null : bool6, (i2 & 512) != 0 ? null : partKind, (i2 & 1024) == 0 ? str : null);
    }
}
