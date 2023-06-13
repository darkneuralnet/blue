package p000;

import co.bird.android.model.BarcodeDriversLicense;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p000.C0774Bx;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0015\u0010\u0006\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, m28432d2 = {"Lzy;", "", "Lco/bird/android/model/BarcodeDriversLicense;", "c", "LBx;", "mlKitBarcode", C17296a.f69688o, "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "LBx;", "b", "()LBx;", "<init>", "(LBx;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: zy */
/* loaded from: classes2.dex */
public final class C31597zy {

    /* renamed from: a */
    public final C0774Bx f122520a;

    public C31597zy() {
        this(null, 1, null);
    }

    public static /* synthetic */ C31597zy copy$default(C31597zy c31597zy, C0774Bx c0774Bx, int i, Object obj) {
        if ((i & 1) != 0) {
            c0774Bx = c31597zy.f122520a;
        }
        return c31597zy.m83a(c0774Bx);
    }

    /* renamed from: a */
    public final C31597zy m83a(C0774Bx c0774Bx) {
        return new C31597zy(c0774Bx);
    }

    /* renamed from: b */
    public final C0774Bx m82b() {
        return this.f122520a;
    }

    /* renamed from: c */
    public final BarcodeDriversLicense m81c() {
        C0774Bx.C0775a m113298c;
        C0774Bx c0774Bx = this.f122520a;
        if (c0774Bx != null && (m113298c = c0774Bx.m113298c()) != null) {
            return new BarcodeDriversLicense(m113298c.m113289f(), m113298c.m113287h(), m113298c.m113281n(), m113298c.m113283l(), m113298c.m113286i(), m113298c.m113292c(), m113298c.m113294a(), m113298c.m113293b(), m113298c.m113291d(), m113298c.m113282m(), m113298c.m113285j(), m113298c.m113288g(), m113298c.m113290e(), m113298c.m113284k(), this.f122520a.m113296e());
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C31597zy) && Intrinsics.areEqual(this.f122520a, ((C31597zy) obj).f122520a);
    }

    public int hashCode() {
        C0774Bx c0774Bx = this.f122520a;
        if (c0774Bx == null) {
            return 0;
        }
        return c0774Bx.hashCode();
    }

    public String toString() {
        C0774Bx c0774Bx = this.f122520a;
        return "BarcodeWrapper(mlKitBarcode=" + c0774Bx + ")";
    }

    public C31597zy(C0774Bx c0774Bx) {
        this.f122520a = c0774Bx;
    }

    public /* synthetic */ C31597zy(C0774Bx c0774Bx, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : c0774Bx);
    }
}
