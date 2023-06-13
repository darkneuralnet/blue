package p000;

import android.graphics.Point;
import android.graphics.Rect;
import com.google.android.gms.internal.mlkit_vision_barcode.zzi;
import com.google.android.gms.internal.mlkit_vision_barcode.zzq;
import p000.C0774Bx;
/* renamed from: xZ8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C51684xZ8 implements InterfaceC30355xy {

    /* renamed from: a */
    public final zzq f117815a;

    public C51684xZ8(zzq zzqVar) {
        this.f117815a = zzqVar;
    }

    @Override // p000.InterfaceC30355xy
    /* renamed from: a */
    public final String mo4379a() {
        return this.f117815a.f70643d;
    }

    @Override // p000.InterfaceC30355xy
    /* renamed from: b */
    public final int mo4378b() {
        return this.f117815a.f70644e;
    }

    @Override // p000.InterfaceC30355xy
    /* renamed from: c */
    public final C0774Bx.C0775a mo4377c() {
        zzi zziVar = this.f117815a.f70654o;
        if (zziVar == null) {
            return null;
        }
        return new C0774Bx.C0775a(zziVar.f70605b, zziVar.f70606c, zziVar.f70607d, zziVar.f70608e, zziVar.f70609f, zziVar.f70610g, zziVar.f70611h, zziVar.f70612i, zziVar.f70613j, zziVar.f70614k, zziVar.f70615l, zziVar.f70616m, zziVar.f70617n, zziVar.f70618o);
    }

    @Override // p000.InterfaceC30355xy
    /* renamed from: d */
    public final Rect mo4376d() {
        zzq zzqVar = this.f117815a;
        if (zzqVar.f70645f != null) {
            int i = 0;
            int i2 = Integer.MIN_VALUE;
            int i3 = Integer.MAX_VALUE;
            int i4 = Integer.MAX_VALUE;
            int i5 = Integer.MIN_VALUE;
            while (true) {
                Point[] pointArr = zzqVar.f70645f;
                if (i < pointArr.length) {
                    Point point = pointArr[i];
                    i3 = Math.min(i3, point.x);
                    i2 = Math.max(i2, point.x);
                    i4 = Math.min(i4, point.y);
                    i5 = Math.max(i5, point.y);
                    i++;
                } else {
                    return new Rect(i3, i4, i2, i5);
                }
            }
        } else {
            return null;
        }
    }

    @Override // p000.InterfaceC30355xy
    /* renamed from: e */
    public final String mo4375e() {
        return this.f117815a.f70642c;
    }

    @Override // p000.InterfaceC30355xy
    /* renamed from: f */
    public final Point[] mo4374f() {
        return this.f117815a.f70645f;
    }

    @Override // p000.InterfaceC30355xy
    public final int getFormat() {
        return this.f117815a.f70641b;
    }
}
