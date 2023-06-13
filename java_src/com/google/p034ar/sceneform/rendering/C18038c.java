package com.google.p034ar.sceneform.rendering;

import com.google.android.filament.MaterialInstance;
import com.google.android.filament.TransformManager;
import com.google.p034ar.core.Plane;
import com.google.p034ar.core.TrackingState;
import com.google.p034ar.sceneform.rendering.C18041e;
import io.github.sceneview.SceneView;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
/* renamed from: com.google.ar.sceneform.rendering.c */
/* loaded from: classes6.dex */
public class C18038c implements InterfaceC46112o96 {

    /* renamed from: b */
    public final SceneView f73910b;

    /* renamed from: c */
    public final Plane f73911c;

    /* renamed from: d */
    public final C43270jN2 f73912d = new C43270jN2();

    /* renamed from: e */
    public boolean f73913e = false;

    /* renamed from: f */
    public boolean f73914f = false;

    /* renamed from: g */
    public boolean f73915g = false;

    /* renamed from: h */
    public boolean f73916h = false;

    /* renamed from: i */
    public C18035b f73917i = null;

    /* renamed from: j */
    public C46584ox4 f73918j;

    /* renamed from: k */
    public final ArrayList<C18049h> f73919k;

    /* renamed from: l */
    public final ArrayList<Integer> f73920l;

    /* renamed from: m */
    public final C18041e f73921m;

    /* renamed from: n */
    public C18041e.C18044c f73922n;

    /* renamed from: o */
    public C18041e.C18044c f73923o;

    public C18038c(SceneView sceneView, Plane plane) {
        ArrayList<C18049h> arrayList = new ArrayList<>();
        this.f73919k = arrayList;
        this.f73920l = new ArrayList<>();
        this.f73910b = sceneView;
        this.f73911c = plane;
        this.f73921m = C18041e.m48306g().m48299d(arrayList).m48300c();
    }

    /* renamed from: a */
    public final void m48359a() {
        C46584ox4 c46584ox4;
        if (!this.f73913e && (c46584ox4 = this.f73918j) != null) {
            this.f73910b.m33474J(c46584ox4.m20223o());
            this.f73913e = true;
        }
    }

    /* renamed from: b */
    public void m48358b() {
        m48357c();
        C46584ox4 c46584ox4 = this.f73918j;
        if (c46584ox4 != null) {
            c46584ox4.m20231g();
        }
        this.f73917i = null;
    }

    /* renamed from: c */
    public final void m48357c() {
        C46584ox4 c46584ox4;
        if (this.f73913e && (c46584ox4 = this.f73918j) != null) {
            this.f73910b.m33450l0(c46584ox4.m20223o());
            this.f73913e = false;
        }
    }

    /* renamed from: d */
    public void m48356d(boolean z) {
        if (this.f73914f != z) {
            this.f73914f = z;
            m48351i();
        }
    }

    /* renamed from: e */
    public void m48355e(MaterialInstance materialInstance) {
        C18041e.C18044c c18044c = this.f73922n;
        if (c18044c == null) {
            this.f73922n = C18041e.C18044c.m48298a().m48288f(this.f73920l).m48289e(materialInstance).m48290d();
        } else {
            c18044c.m48294e(materialInstance);
        }
        if (this.f73917i != null) {
            m48350j();
        }
    }

    /* renamed from: f */
    public void m48354f(MaterialInstance materialInstance) {
        C18041e.C18044c c18044c = this.f73923o;
        if (c18044c == null) {
            this.f73923o = C18041e.C18044c.m48298a().m48288f(this.f73920l).m48289e(materialInstance).m48290d();
        } else {
            c18044c.m48294e(materialInstance);
        }
        if (this.f73917i != null) {
            m48350j();
        }
    }

    /* renamed from: g */
    public void m48353g(boolean z) {
        if (this.f73915g != z) {
            this.f73915g = z;
            m48351i();
        }
    }

    /* renamed from: h */
    public void m48352h(boolean z) {
        if (this.f73916h != z) {
            this.f73916h = z;
            m48351i();
        }
    }

    /* renamed from: i */
    public void m48351i() {
        if (this.f73914f && (this.f73916h || this.f73915g)) {
            if (this.f73911c.getTrackingState() != TrackingState.TRACKING) {
                m48357c();
                return;
            }
            this.f73911c.getCenterPose().toMatrix(this.f73912d.f92611a, 0);
            if (!m48349k()) {
                m48357c();
                return;
            }
            m48350j();
            m48359a();
            return;
        }
        m48357c();
    }

    /* renamed from: j */
    public void m48350j() {
        C18041e.C18044c c18044c;
        C18041e.C18044c c18044c2;
        List<C18041e.C18044c> m48304i = this.f73921m.m48304i();
        m48304i.clear();
        if (this.f73916h && (c18044c2 = this.f73922n) != null) {
            m48304i.add(c18044c2);
        }
        if (this.f73915g && (c18044c = this.f73923o) != null) {
            m48304i.add(c18044c);
        }
        if (m48304i.isEmpty()) {
            m48357c();
            return;
        }
        C18035b c18035b = this.f73917i;
        if (c18035b == null) {
            try {
                C18035b c18035b2 = C18035b.m48364u().m48313s(this.f73921m).m48324h().get();
                this.f73917i = c18035b2;
                c18035b2.m48333s(false);
                this.f73918j = this.f73917i.m48348a(this);
            } catch (InterruptedException | ExecutionException unused) {
                throw new AssertionError("Unable to create plane renderable.");
            }
        } else {
            c18035b.m48332t(this.f73921m);
        }
        if (this.f73918j != null && m48304i.size() > 1) {
            this.f73918j.m20220r(0, 0);
            this.f73918j.m20220r(1, 1);
        }
        this.f73918j.m20221q(this.f73910b);
        TransformManager m43777j = C39939dl1.m43777j();
        m43777j.setTransform(m43777j.getInstance(this.f73918j.f102815c), this.f73918j.m20222p().f92611a);
    }

    /* renamed from: k */
    public final boolean m48349k() {
        float f;
        FloatBuffer polygon = this.f73911c.getPolygon();
        if (polygon == null) {
            return false;
        }
        polygon.rewind();
        int limit = polygon.limit() / 2;
        if (limit == 0) {
            return false;
        }
        this.f73919k.clear();
        this.f73919k.ensureCapacity(limit * 2);
        int i = limit - 2;
        this.f73920l.clear();
        this.f73920l.ensureCapacity((limit * 6) + (i * 3));
        C35444Qj6 m88119w = C35444Qj6.m88119w();
        while (polygon.hasRemaining()) {
            this.f73919k.add(C18049h.m48263a().m48252g(new C35444Qj6(polygon.get(), 0.0f, polygon.get())).m48253f(m88119w).m48254e());
        }
        polygon.rewind();
        while (polygon.hasRemaining()) {
            float f2 = polygon.get();
            float f3 = polygon.get();
            float hypot = (float) Math.hypot(f2, f3);
            if (hypot != 0.0f) {
                f = 1.0f - Math.min(0.2f / hypot, 0.2f);
            } else {
                f = 0.8f;
            }
            this.f73919k.add(C18049h.m48263a().m48252g(new C35444Qj6(f2 * f, 1.0f, f3 * f)).m48253f(m88119w).m48254e());
        }
        short s = (short) limit;
        for (int i2 = 0; i2 < i; i2++) {
            this.f73920l.add(Integer.valueOf(s));
            int i3 = s + i2;
            this.f73920l.add(Integer.valueOf(i3 + 1));
            this.f73920l.add(Integer.valueOf(i3 + 2));
        }
        short s2 = 0;
        while (s2 < limit) {
            int i4 = 0 + s2;
            int i5 = s2 + 1;
            int i6 = i5 % limit;
            int i7 = 0 + i6;
            int i8 = s2 + s;
            this.f73920l.add(Integer.valueOf(i4));
            this.f73920l.add(Integer.valueOf(i7));
            this.f73920l.add(Integer.valueOf(i8));
            this.f73920l.add(Integer.valueOf(i8));
            this.f73920l.add(Integer.valueOf(i7));
            this.f73920l.add(Integer.valueOf(i6 + s));
            s2 = i5;
        }
        return true;
    }

    @Override // p000.InterfaceC46112o96
    /* renamed from: y */
    public C43270jN2 mo21708y() {
        return this.f73912d;
    }
}
