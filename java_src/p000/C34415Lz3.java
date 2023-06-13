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
@Metadata(m28433d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0003\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b[\u0010\\J¦\u0001\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0017\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0018\u001a\u00020\tHÖ\u0001J\u0013\u0010\u001b\u001a\u00020\u000b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010#R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b$\u0010,R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010+\u001a\u0004\b.\u0010,R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010+\u001a\u0004\b/\u0010,R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u0010+\u001a\u0004\b0\u0010,R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u0010+\u001a\u0004\b*\u0010,R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u0010+\u001a\u0004\b2\u0010,R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b1\u00104R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b&\u00107R$\u0010?\u001a\u0004\u0018\u0001088\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R$\u0010F\u001a\u0004\u0018\u00010@8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER$\u0010M\u001a\u0004\u0018\u00010G8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\"\u0010S\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR$\u0010Z\u001a\u0004\u0018\u00010T8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010Y¨\u0006]"}, m28432d2 = {"LLz3;", "LIx5;", "Lco/bird/android/model/wire/WireSkuOrder;", "skuOrder", "", "LPC5;", "scannedItems", "", "successItems", "", "loading", "", "bulkMode", "enableMlKit", "enablePeripheralScanner", "showCodeInput", "showBluetooth", "showButton", "Lco/bird/android/model/constant/PartKind;", "part", "instructions", "n", "(Lco/bird/android/model/wire/WireSkuOrder;Ljava/util/List;Ljava/util/List;ILjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lco/bird/android/model/constant/PartKind;Ljava/lang/String;)LLz3;", "toString", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", C17296a.f69688o, "Lco/bird/android/model/wire/WireSkuOrder;", "u", "()Lco/bird/android/model/wire/WireSkuOrder;", "b", "Ljava/util/List;", "r", "()Ljava/util/List;", "c", "v", DateTokenConverter.CONVERTER_KEY, "I", "o", "()I", "e", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "f", "g", "j", "h", "i", "k", "Lco/bird/android/model/constant/PartKind;", "()Lco/bird/android/model/constant/PartKind;", "l", "Ljava/lang/String;", "()Ljava/lang/String;", "Lbk5;", "m", "Lbk5;", "p", "()Lbk5;", "x", "(Lbk5;)V", "scanError", "LqA5;", "LqA5;", "t", "()LqA5;", "A", "(LqA5;)V", "showScrapReason", "LhA5;", "LhA5;", "s", "()LhA5;", "z", "(LhA5;)V", "showExitConfirmation", "Z", "q", "()Z", "y", "(Z)V", "scanQuantityExceeded", "", "Ljava/lang/Throwable;", "getError", "()Ljava/lang/Throwable;", "w", "(Ljava/lang/Throwable;)V", "error", "<init>", "(Lco/bird/android/model/wire/WireSkuOrder;Ljava/util/List;Ljava/util/List;ILjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lco/bird/android/model/constant/PartKind;Ljava/lang/String;)V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Lz3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34415Lz3 implements InterfaceC33697Ix5 {

    /* renamed from: a */
    public final WireSkuOrder f22383a;

    /* renamed from: b */
    public final List<PC5> f22384b;

    /* renamed from: c */
    public final List<String> f22385c;

    /* renamed from: d */
    public final int f22386d;

    /* renamed from: e */
    public final Boolean f22387e;

    /* renamed from: f */
    public final Boolean f22388f;

    /* renamed from: g */
    public final Boolean f22389g;

    /* renamed from: h */
    public final Boolean f22390h;

    /* renamed from: i */
    public final Boolean f22391i;

    /* renamed from: j */
    public final Boolean f22392j;

    /* renamed from: k */
    public final PartKind f22393k;

    /* renamed from: l */
    public final String f22394l;

    /* renamed from: m */
    public C38729bk5 f22395m;

    /* renamed from: n */
    public C47307qA5 f22396n;

    /* renamed from: o */
    public C41970hA5 f22397o;

    /* renamed from: p */
    public boolean f22398p;

    /* renamed from: q */
    public Throwable f22399q;

    public C34415Lz3() {
        this(null, null, null, 0, null, null, null, null, null, null, null, null, 4095, null);
    }

    /* renamed from: A */
    public final void m96040A(C47307qA5 c47307qA5) {
        this.f22396n = c47307qA5;
    }

    @Override // p000.InterfaceC33697Ix5
    /* renamed from: c */
    public Boolean mo40320c() {
        return this.f22387e;
    }

    @Override // p000.InterfaceC33697Ix5
    /* renamed from: d */
    public String mo40319d() {
        return this.f22394l;
    }

    @Override // p000.InterfaceC33697Ix5
    /* renamed from: e */
    public Boolean mo40318e() {
        return this.f22391i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C34415Lz3) {
            C34415Lz3 c34415Lz3 = (C34415Lz3) obj;
            return Intrinsics.areEqual(this.f22383a, c34415Lz3.f22383a) && Intrinsics.areEqual(this.f22384b, c34415Lz3.f22384b) && Intrinsics.areEqual(this.f22385c, c34415Lz3.f22385c) && this.f22386d == c34415Lz3.f22386d && Intrinsics.areEqual(this.f22387e, c34415Lz3.f22387e) && Intrinsics.areEqual(this.f22388f, c34415Lz3.f22388f) && Intrinsics.areEqual(this.f22389g, c34415Lz3.f22389g) && Intrinsics.areEqual(this.f22390h, c34415Lz3.f22390h) && Intrinsics.areEqual(this.f22391i, c34415Lz3.f22391i) && Intrinsics.areEqual(this.f22392j, c34415Lz3.f22392j) && this.f22393k == c34415Lz3.f22393k && Intrinsics.areEqual(this.f22394l, c34415Lz3.f22394l);
        }
        return false;
    }

    @Override // p000.InterfaceC33697Ix5
    /* renamed from: g */
    public Boolean mo40317g() {
        return this.f22388f;
    }

    public final Throwable getError() {
        return this.f22399q;
    }

    @Override // p000.InterfaceC33697Ix5
    /* renamed from: h */
    public Boolean mo40316h() {
        return this.f22390h;
    }

    public int hashCode() {
        WireSkuOrder wireSkuOrder = this.f22383a;
        int hashCode = (((((((wireSkuOrder == null ? 0 : wireSkuOrder.hashCode()) * 31) + this.f22384b.hashCode()) * 31) + this.f22385c.hashCode()) * 31) + Integer.hashCode(this.f22386d)) * 31;
        Boolean bool = this.f22387e;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f22388f;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f22389g;
        int hashCode4 = (hashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.f22390h;
        int hashCode5 = (hashCode4 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.f22391i;
        int hashCode6 = (hashCode5 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.f22392j;
        int hashCode7 = (hashCode6 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        PartKind partKind = this.f22393k;
        int hashCode8 = (hashCode7 + (partKind == null ? 0 : partKind.hashCode())) * 31;
        String str = this.f22394l;
        return hashCode8 + (str != null ? str.hashCode() : 0);
    }

    @Override // p000.InterfaceC33697Ix5
    /* renamed from: i */
    public PartKind mo40315i() {
        return this.f22393k;
    }

    @Override // p000.InterfaceC33697Ix5
    /* renamed from: j */
    public Boolean mo40314j() {
        return this.f22389g;
    }

    @Override // p000.InterfaceC33697Ix5
    /* renamed from: k */
    public Boolean mo40313k() {
        return this.f22392j;
    }

    /* renamed from: n */
    public final C34415Lz3 m96039n(WireSkuOrder wireSkuOrder, List<PC5> scannedItems, List<String> successItems, int i, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, PartKind partKind, String str) {
        Intrinsics.checkNotNullParameter(scannedItems, "scannedItems");
        Intrinsics.checkNotNullParameter(successItems, "successItems");
        return new C34415Lz3(wireSkuOrder, scannedItems, successItems, i, bool, bool2, bool3, bool4, bool5, bool6, partKind, str);
    }

    /* renamed from: o */
    public final int m96038o() {
        return this.f22386d;
    }

    /* renamed from: p */
    public final C38729bk5 m96037p() {
        return this.f22395m;
    }

    /* renamed from: q */
    public final boolean m96036q() {
        return this.f22398p;
    }

    /* renamed from: r */
    public final List<PC5> m96035r() {
        return this.f22384b;
    }

    /* renamed from: s */
    public final C41970hA5 m96034s() {
        return this.f22397o;
    }

    /* renamed from: t */
    public final C47307qA5 m96033t() {
        return this.f22396n;
    }

    public String toString() {
        WireSkuOrder wireSkuOrder = this.f22383a;
        List<PC5> list = this.f22384b;
        List<String> list2 = this.f22385c;
        int i = this.f22386d;
        Boolean bool = this.f22387e;
        Boolean bool2 = this.f22388f;
        Boolean bool3 = this.f22389g;
        Boolean bool4 = this.f22390h;
        Boolean bool5 = this.f22391i;
        Boolean bool6 = this.f22392j;
        PartKind partKind = this.f22393k;
        String str = this.f22394l;
        return "OutboundScanState(skuOrder=" + wireSkuOrder + ", scannedItems=" + list + ", successItems=" + list2 + ", loading=" + i + ", bulkMode=" + bool + ", enableMlKit=" + bool2 + ", enablePeripheralScanner=" + bool3 + ", showCodeInput=" + bool4 + ", showBluetooth=" + bool5 + ", showButton=" + bool6 + ", part=" + partKind + ", instructions=" + str + ")";
    }

    /* renamed from: u */
    public final WireSkuOrder m96032u() {
        return this.f22383a;
    }

    /* renamed from: v */
    public final List<String> m96031v() {
        return this.f22385c;
    }

    /* renamed from: w */
    public final void m96030w(Throwable th) {
        this.f22399q = th;
    }

    /* renamed from: x */
    public final void m96029x(C38729bk5 c38729bk5) {
        this.f22395m = c38729bk5;
    }

    /* renamed from: y */
    public final void m96028y(boolean z) {
        this.f22398p = z;
    }

    /* renamed from: z */
    public final void m96027z(C41970hA5 c41970hA5) {
        this.f22397o = c41970hA5;
    }

    public C34415Lz3(WireSkuOrder wireSkuOrder, List<PC5> scannedItems, List<String> successItems, int i, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, PartKind partKind, String str) {
        Intrinsics.checkNotNullParameter(scannedItems, "scannedItems");
        Intrinsics.checkNotNullParameter(successItems, "successItems");
        this.f22383a = wireSkuOrder;
        this.f22384b = scannedItems;
        this.f22385c = successItems;
        this.f22386d = i;
        this.f22387e = bool;
        this.f22388f = bool2;
        this.f22389g = bool3;
        this.f22390h = bool4;
        this.f22391i = bool5;
        this.f22392j = bool6;
        this.f22393k = partKind;
        this.f22394l = str;
    }

    public /* synthetic */ C34415Lz3(WireSkuOrder wireSkuOrder, List list, List list2, int i, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, PartKind partKind, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : wireSkuOrder, (i2 & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i2 & 4) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? null : bool, (i2 & 32) != 0 ? null : bool2, (i2 & 64) != 0 ? null : bool3, (i2 & 128) != 0 ? null : bool4, (i2 & 256) != 0 ? null : bool5, (i2 & 512) != 0 ? null : bool6, (i2 & 1024) != 0 ? null : partKind, (i2 & 2048) == 0 ? str : null);
    }
}
