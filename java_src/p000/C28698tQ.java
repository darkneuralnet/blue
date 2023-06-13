package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.persistence.BirdPlusView;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.location.places.Place;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001Bo\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b&\u0010'Jq\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u0019\u001a\u0004\b!\u0010\u001bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010\u0019\u001a\u0004\b\u001e\u0010\u001bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0019\u001a\u0004\b\"\u0010\u001bR\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b#\u0010\u001bR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b!\u0010$\u001a\u0004\b \u0010%¨\u0006("}, m28432d2 = {"LtQ;", "", "Lco/bird/android/model/persistence/BirdPlusView;", "birdPlus", "", "subscribeEnabled", "showSubscribe", "showCancel", "showTransfer", "canResubscribe", "canStartTrial", "progress", "purchasing", "", "error", C17296a.f69688o, "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "equals", "Lco/bird/android/model/persistence/BirdPlusView;", "b", "()Lco/bird/android/model/persistence/BirdPlusView;", "Z", "k", "()Z", "c", "i", DateTokenConverter.CONVERTER_KEY, "h", "e", "j", "f", "g", "Ljava/lang/Throwable;", "()Ljava/lang/Throwable;", "<init>", "(Lco/bird/android/model/persistence/BirdPlusView;ZZZZZZZZLjava/lang/Throwable;)V", "bird-plus_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: tQ */
/* loaded from: classes3.dex */
public final class C28698tQ {

    /* renamed from: a */
    public final BirdPlusView f110440a;

    /* renamed from: b */
    public final boolean f110441b;

    /* renamed from: c */
    public final boolean f110442c;

    /* renamed from: d */
    public final boolean f110443d;

    /* renamed from: e */
    public final boolean f110444e;

    /* renamed from: f */
    public final boolean f110445f;

    /* renamed from: g */
    public final boolean f110446g;

    /* renamed from: h */
    public final boolean f110447h;

    /* renamed from: i */
    public final boolean f110448i;

    /* renamed from: j */
    public final Throwable f110449j;

    public C28698tQ() {
        this(null, false, false, false, false, false, false, false, false, null, Place.TYPE_SUBLOCALITY_LEVEL_1, null);
    }

    /* renamed from: a */
    public final C28698tQ m12411a(BirdPlusView birdPlusView, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, Throwable th) {
        return new C28698tQ(birdPlusView, z, z2, z3, z4, z5, z6, z7, z8, th);
    }

    /* renamed from: b */
    public final BirdPlusView m12410b() {
        return this.f110440a;
    }

    /* renamed from: c */
    public final boolean m12409c() {
        return this.f110445f;
    }

    /* renamed from: d */
    public final boolean m12408d() {
        return this.f110446g;
    }

    /* renamed from: e */
    public final Throwable m12407e() {
        return this.f110449j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C28698tQ) {
            C28698tQ c28698tQ = (C28698tQ) obj;
            return Intrinsics.areEqual(this.f110440a, c28698tQ.f110440a) && this.f110441b == c28698tQ.f110441b && this.f110442c == c28698tQ.f110442c && this.f110443d == c28698tQ.f110443d && this.f110444e == c28698tQ.f110444e && this.f110445f == c28698tQ.f110445f && this.f110446g == c28698tQ.f110446g && this.f110447h == c28698tQ.f110447h && this.f110448i == c28698tQ.f110448i && Intrinsics.areEqual(this.f110449j, c28698tQ.f110449j);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean m12406f() {
        return this.f110447h;
    }

    /* renamed from: g */
    public final boolean m12405g() {
        return this.f110448i;
    }

    /* renamed from: h */
    public final boolean m12404h() {
        return this.f110443d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        BirdPlusView birdPlusView = this.f110440a;
        int hashCode = (birdPlusView == null ? 0 : birdPlusView.hashCode()) * 31;
        boolean z = this.f110441b;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        boolean z2 = this.f110442c;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        boolean z3 = this.f110443d;
        int i5 = z3;
        if (z3 != 0) {
            i5 = 1;
        }
        int i6 = (i4 + i5) * 31;
        boolean z4 = this.f110444e;
        int i7 = z4;
        if (z4 != 0) {
            i7 = 1;
        }
        int i8 = (i6 + i7) * 31;
        boolean z5 = this.f110445f;
        int i9 = z5;
        if (z5 != 0) {
            i9 = 1;
        }
        int i10 = (i8 + i9) * 31;
        boolean z6 = this.f110446g;
        int i11 = z6;
        if (z6 != 0) {
            i11 = 1;
        }
        int i12 = (i10 + i11) * 31;
        boolean z7 = this.f110447h;
        int i13 = z7;
        if (z7 != 0) {
            i13 = 1;
        }
        int i14 = (i12 + i13) * 31;
        boolean z8 = this.f110448i;
        int i15 = (i14 + (z8 ? 1 : z8 ? 1 : 0)) * 31;
        Throwable th = this.f110449j;
        return i15 + (th != null ? th.hashCode() : 0);
    }

    /* renamed from: i */
    public final boolean m12403i() {
        return this.f110442c;
    }

    /* renamed from: j */
    public final boolean m12402j() {
        return this.f110444e;
    }

    /* renamed from: k */
    public final boolean m12401k() {
        return this.f110441b;
    }

    public String toString() {
        BirdPlusView birdPlusView = this.f110440a;
        boolean z = this.f110441b;
        boolean z2 = this.f110442c;
        boolean z3 = this.f110443d;
        boolean z4 = this.f110444e;
        boolean z5 = this.f110445f;
        boolean z6 = this.f110446g;
        boolean z7 = this.f110447h;
        boolean z8 = this.f110448i;
        Throwable th = this.f110449j;
        return "BirdPlusDetailsState(birdPlus=" + birdPlusView + ", subscribeEnabled=" + z + ", showSubscribe=" + z2 + ", showCancel=" + z3 + ", showTransfer=" + z4 + ", canResubscribe=" + z5 + ", canStartTrial=" + z6 + ", progress=" + z7 + ", purchasing=" + z8 + ", error=" + th + ")";
    }

    public C28698tQ(BirdPlusView birdPlusView, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, Throwable th) {
        this.f110440a = birdPlusView;
        this.f110441b = z;
        this.f110442c = z2;
        this.f110443d = z3;
        this.f110444e = z4;
        this.f110445f = z5;
        this.f110446g = z6;
        this.f110447h = z7;
        this.f110448i = z8;
        this.f110449j = th;
    }

    public /* synthetic */ C28698tQ(BirdPlusView birdPlusView, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : birdPlusView, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? false : z3, (i & 16) != 0 ? false : z4, (i & 32) != 0 ? false : z5, (i & 64) != 0 ? false : z6, (i & 128) != 0 ? false : z7, (i & 256) == 0 ? z8 : false, (i & 512) == 0 ? th : null);
    }
}
