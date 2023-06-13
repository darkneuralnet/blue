package p000;

import android.graphics.Point;
import android.graphics.Rect;
import com.google.android.gms.internal.mlkit_vision_barcode.zzse;
import com.google.android.gms.internal.mlkit_vision_barcode.zzsm;
import p000.C0774Bx;
/* renamed from: HN8 */
/* loaded from: classes6.dex */
public final class HN8 implements InterfaceC30355xy {

    /* renamed from: a */
    public final zzsm f13330a;

    public HN8(zzsm zzsmVar) {
        this.f13330a = zzsmVar;
    }

    @Override // p000.InterfaceC30355xy
    /* renamed from: a */
    public final String mo4379a() {
        return this.f13330a.m51323v();
    }

    @Override // p000.InterfaceC30355xy
    /* renamed from: b */
    public final int mo4378b() {
        return this.f13330a.m51325s();
    }

    @Override // p000.InterfaceC30355xy
    /* renamed from: c */
    public final C0774Bx.C0775a mo4377c() {
        zzse m51324u = this.f13330a.m51324u();
        if (m51324u != null) {
            return new C0774Bx.C0775a(m51324u.m51328v(), m51324u.m51337F(), m51324u.m51331m0(), m51324u.m51333T(), m51324u.m51336K(), m51324u.m51330s(), m51324u.zza(), m51324u.zzb(), m51324u.zzd(), m51324u.m51332j0(), m51324u.m51335L(), m51324u.m51338E(), m51324u.m51329u(), m51324u.m51334R());
        }
        return null;
    }

    @Override // p000.InterfaceC30355xy
    /* renamed from: d */
    public final Rect mo4376d() {
        Point[] m51326F = this.f13330a.m51326F();
        if (m51326F != null) {
            int i = Integer.MIN_VALUE;
            int i2 = Integer.MAX_VALUE;
            int i3 = Integer.MAX_VALUE;
            int i4 = Integer.MIN_VALUE;
            for (Point point : m51326F) {
                i2 = Math.min(i2, point.x);
                i = Math.max(i, point.x);
                i3 = Math.min(i3, point.y);
                i4 = Math.max(i4, point.y);
            }
            return new Rect(i2, i3, i, i4);
        }
        return null;
    }

    @Override // p000.InterfaceC30355xy
    /* renamed from: e */
    public final String mo4375e() {
        return this.f13330a.m51327E();
    }

    @Override // p000.InterfaceC30355xy
    /* renamed from: f */
    public final Point[] mo4374f() {
        return this.f13330a.m51326F();
    }

    @Override // p000.InterfaceC30355xy
    public final int getFormat() {
        return this.f13330a.zza();
    }
}
