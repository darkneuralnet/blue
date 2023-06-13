package p000;

import android.graphics.Canvas;
import android.graphics.MaskFilter;
import android.graphics.Paint;
import android.graphics.PathEffect;
import android.graphics.Shader;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.ArrayList;
import java.util.List;
/* renamed from: ZO4 */
/* loaded from: classes6.dex */
public abstract class ZO4 {

    /* renamed from: a */
    public int f48471a;

    /* renamed from: c */
    public int f48473c;

    /* renamed from: d */
    public Paint.Cap f48474d;

    /* renamed from: e */
    public Paint.Join f48475e;

    /* renamed from: f */
    public PathEffect f48476f;

    /* renamed from: g */
    public MaskFilter f48477g;

    /* renamed from: h */
    public Shader f48478h;

    /* renamed from: i */
    public boolean f48479i;

    /* renamed from: j */
    public Integer f48480j;

    /* renamed from: l */
    public boolean f48482l;

    /* renamed from: m */
    public boolean f48483m;

    /* renamed from: b */
    public List<VO4> f48472b = new ArrayList();

    /* renamed from: k */
    public boolean f48481k = false;

    /* renamed from: n */
    public boolean f48484n = true;

    public ZO4(int i, List<VO4> list, int i2, Paint.Cap cap, Paint.Join join, PathEffect pathEffect, MaskFilter maskFilter, Shader shader, boolean z, Integer num, boolean z2, boolean z3) {
        this.f48471a = 0;
        this.f48473c = 1;
        this.f48474d = Paint.Cap.ROUND;
        this.f48475e = Paint.Join.MITER;
        this.f48479i = true;
        this.f48471a = i;
        this.f48473c = i2;
        this.f48474d = cap;
        this.f48475e = join;
        this.f48476f = pathEffect;
        this.f48477g = maskFilter;
        this.f48478h = shader;
        this.f48479i = z;
        this.f48480j = num;
        this.f48482l = z2;
        this.f48483m = z3;
        if (list != null) {
            for (VO4 vo4 : list) {
                m73217a(vo4);
            }
        }
    }

    /* renamed from: a */
    public ZO4 m73217a(VO4 vo4) {
        if (vo4 != null) {
            if (vo4.m79889b() == null) {
                vo4.m79890a(this.f48480j);
            }
            this.f48472b.add(vo4);
        }
        return this;
    }

    /* renamed from: b */
    public boolean m73216b(LatLngBounds latLngBounds) {
        LatLngBounds m73213e = m73213e();
        if (m73213e != null && latLngBounds != null) {
            LatLng latLng = latLngBounds.f71432b;
            double d = latLng.f71431c;
            double d2 = latLng.f71430b;
            LatLng latLng2 = latLngBounds.f71433c;
            double d3 = latLng2.f71431c;
            double d4 = latLng2.f71430b;
            LatLng latLng3 = m73213e.f71432b;
            double d5 = latLng3.f71431c;
            double d6 = latLng3.f71430b;
            LatLng latLng4 = m73213e.f71433c;
            return C37936aP4.m71483a(d, d2, d3, d4, d5, d6, latLng4.f71431c, latLng4.f71430b);
        }
        return false;
    }

    /* renamed from: c */
    public abstract void mo73215c(Canvas canvas, U74 u74, int i, int i2, int i3, int i4);

    /* renamed from: d */
    public boolean m73214d(Canvas canvas, U74 u74, int i, int i2, int i3, int i4) {
        if (canvas != null && u74 != null) {
            if (this.f48484n && m73216b(u74.m81934b().f71509f)) {
                mo73215c(canvas, u74, i, i2, i3, i4);
                return true;
            }
            return false;
        }
        throw new IllegalStateException("Bitmap and Projection cannot be null");
    }

    /* renamed from: e */
    public LatLngBounds m73213e() {
        if (this.f48472b.isEmpty()) {
            return null;
        }
        LatLngBounds.C17620a c17620a = new LatLngBounds.C17620a();
        for (VO4 vo4 : this.f48472b) {
            if (vo4.m79888c() != null) {
                c17620a.m50666b(vo4.m79888c());
            }
        }
        return c17620a.m50667a();
    }

    /* renamed from: f */
    public List<VO4> m73212f() {
        return this.f48472b;
    }

    /* renamed from: g */
    public int m73211g() {
        return this.f48471a;
    }
}
