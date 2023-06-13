package p000;

import com.google.android.gms.maps.model.Cap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PolylineOptions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* renamed from: kF0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C43789kF0 {

    /* renamed from: a */
    public final PolylineOptions f94117a = new PolylineOptions();

    /* renamed from: b */
    public List<LatLng> f94118b = new ArrayList();

    /* renamed from: c */
    public float f94119c = 0.5f;

    /* renamed from: d */
    public boolean f94120d = false;

    /* renamed from: e */
    public boolean f94121e = false;

    /* renamed from: a */
    public C43789kF0 m29151a(LatLng... latLngArr) {
        Collections.addAll(this.f94118b, latLngArr);
        return this;
    }

    /* renamed from: b */
    public C43789kF0 m29150b(boolean z) {
        this.f94117a.m50604v(z);
        return this;
    }

    /* renamed from: c */
    public C43789kF0 m29149c(int i) {
        this.f94117a.m50622E(i);
        return this;
    }

    /* renamed from: d */
    public C43789kF0 m29148d(Cap cap) {
        this.f94117a.m50620F(cap);
        return this;
    }

    /* renamed from: e */
    public C43789kF0 m29147e(boolean z) {
        this.f94117a.m50619K(z);
        return this;
    }

    /* renamed from: f */
    public float m29146f() {
        return this.f94119c;
    }

    /* renamed from: g */
    public List<LatLng> m29145g() {
        return this.f94118b;
    }

    /* renamed from: h */
    public PolylineOptions m29144h() {
        return this.f94117a;
    }

    /* renamed from: i */
    public boolean m29143i() {
        return this.f94120d;
    }

    /* renamed from: j */
    public C43789kF0 m29142j(float f) {
        this.f94119c = f;
        return this;
    }

    /* renamed from: k */
    public C43789kF0 m29141k(Cap cap) {
        this.f94117a.m50610k1(cap);
        return this;
    }

    /* renamed from: l */
    public C43789kF0 m29140l(float f) {
        this.f94117a.m50605u1(f);
        return this;
    }

    /* renamed from: m */
    public C43789kF0 m29139m(float f) {
        this.f94117a.m50603y1(f);
        return this;
    }
}
