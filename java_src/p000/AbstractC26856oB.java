package p000;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;
/* renamed from: oB */
/* loaded from: classes2.dex */
public abstract class AbstractC26856oB<K, A> {

    /* renamed from: c */
    public final InterfaceC26860d<K> f101565c;

    /* renamed from: e */
    public C41410gE2<A> f101567e;

    /* renamed from: a */
    public final List<InterfaceC26858b> f101563a = new ArrayList(1);

    /* renamed from: b */
    public boolean f101564b = false;

    /* renamed from: d */
    public float f101566d = 0.0f;

    /* renamed from: f */
    public A f101568f = null;

    /* renamed from: g */
    public float f101569g = -1.0f;

    /* renamed from: h */
    public float f101570h = -1.0f;

    /* renamed from: oB$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC26858b {
        /* renamed from: e */
        void mo4989e();
    }

    /* renamed from: oB$c */
    /* loaded from: classes2.dex */
    public static final class C26859c<T> implements InterfaceC26860d<T> {
        private C26859c() {
        }

        @Override // p000.AbstractC26856oB.InterfaceC26860d
        /* renamed from: a */
        public C41125fl2<T> mo21650a() {
            throw new IllegalStateException("not implemented");
        }

        @Override // p000.AbstractC26856oB.InterfaceC26860d
        /* renamed from: b */
        public float mo21649b() {
            return 0.0f;
        }

        @Override // p000.AbstractC26856oB.InterfaceC26860d
        /* renamed from: c */
        public boolean mo21648c(float f) {
            throw new IllegalStateException("not implemented");
        }

        @Override // p000.AbstractC26856oB.InterfaceC26860d
        /* renamed from: d */
        public boolean mo21647d(float f) {
            return false;
        }

        @Override // p000.AbstractC26856oB.InterfaceC26860d
        /* renamed from: e */
        public float mo21646e() {
            return 1.0f;
        }

        @Override // p000.AbstractC26856oB.InterfaceC26860d
        public boolean isEmpty() {
            return true;
        }
    }

    /* renamed from: oB$d */
    /* loaded from: classes2.dex */
    public interface InterfaceC26860d<T> {
        /* renamed from: a */
        C41125fl2<T> mo21650a();

        /* renamed from: b */
        float mo21649b();

        /* renamed from: c */
        boolean mo21648c(float f);

        /* renamed from: d */
        boolean mo21647d(float f);

        /* renamed from: e */
        float mo21646e();

        boolean isEmpty();
    }

    /* renamed from: oB$e */
    /* loaded from: classes2.dex */
    public static final class C26861e<T> implements InterfaceC26860d<T> {

        /* renamed from: a */
        public final List<? extends C41125fl2<T>> f101571a;

        /* renamed from: c */
        public C41125fl2<T> f101573c = null;

        /* renamed from: d */
        public float f101574d = -1.0f;

        /* renamed from: b */
        public C41125fl2<T> f101572b = m21651f(0.0f);

        public C26861e(List<? extends C41125fl2<T>> list) {
            this.f101571a = list;
        }

        @Override // p000.AbstractC26856oB.InterfaceC26860d
        /* renamed from: a */
        public C41125fl2<T> mo21650a() {
            return this.f101572b;
        }

        @Override // p000.AbstractC26856oB.InterfaceC26860d
        /* renamed from: b */
        public float mo21649b() {
            return this.f101571a.get(0).m40902f();
        }

        @Override // p000.AbstractC26856oB.InterfaceC26860d
        /* renamed from: c */
        public boolean mo21648c(float f) {
            C41125fl2<T> c41125fl2 = this.f101573c;
            C41125fl2<T> c41125fl22 = this.f101572b;
            if (c41125fl2 == c41125fl22 && this.f101574d == f) {
                return true;
            }
            this.f101573c = c41125fl22;
            this.f101574d = f;
            return false;
        }

        @Override // p000.AbstractC26856oB.InterfaceC26860d
        /* renamed from: d */
        public boolean mo21647d(float f) {
            if (this.f101572b.m40907a(f)) {
                return !this.f101572b.m40899i();
            }
            this.f101572b = m21651f(f);
            return true;
        }

        @Override // p000.AbstractC26856oB.InterfaceC26860d
        /* renamed from: e */
        public float mo21646e() {
            List<? extends C41125fl2<T>> list = this.f101571a;
            return list.get(list.size() - 1).m40905c();
        }

        /* renamed from: f */
        public final C41125fl2<T> m21651f(float f) {
            List<? extends C41125fl2<T>> list = this.f101571a;
            C41125fl2<T> c41125fl2 = list.get(list.size() - 1);
            if (f >= c41125fl2.m40902f()) {
                return c41125fl2;
            }
            for (int size = this.f101571a.size() - 2; size >= 1; size--) {
                C41125fl2<T> c41125fl22 = this.f101571a.get(size);
                if (this.f101572b != c41125fl22 && c41125fl22.m40907a(f)) {
                    return c41125fl22;
                }
            }
            return this.f101571a.get(0);
        }

        @Override // p000.AbstractC26856oB.InterfaceC26860d
        public boolean isEmpty() {
            return false;
        }
    }

    /* renamed from: oB$f */
    /* loaded from: classes2.dex */
    public static final class C26862f<T> implements InterfaceC26860d<T> {

        /* renamed from: a */
        public final C41125fl2<T> f101575a;

        /* renamed from: b */
        public float f101576b = -1.0f;

        public C26862f(List<? extends C41125fl2<T>> list) {
            this.f101575a = list.get(0);
        }

        @Override // p000.AbstractC26856oB.InterfaceC26860d
        /* renamed from: a */
        public C41125fl2<T> mo21650a() {
            return this.f101575a;
        }

        @Override // p000.AbstractC26856oB.InterfaceC26860d
        /* renamed from: b */
        public float mo21649b() {
            return this.f101575a.m40902f();
        }

        @Override // p000.AbstractC26856oB.InterfaceC26860d
        /* renamed from: c */
        public boolean mo21648c(float f) {
            if (this.f101576b == f) {
                return true;
            }
            this.f101576b = f;
            return false;
        }

        @Override // p000.AbstractC26856oB.InterfaceC26860d
        /* renamed from: d */
        public boolean mo21647d(float f) {
            return !this.f101575a.m40899i();
        }

        @Override // p000.AbstractC26856oB.InterfaceC26860d
        /* renamed from: e */
        public float mo21646e() {
            return this.f101575a.m40905c();
        }

        @Override // p000.AbstractC26856oB.InterfaceC26860d
        public boolean isEmpty() {
            return false;
        }
    }

    public AbstractC26856oB(List<? extends C41125fl2<K>> list) {
        this.f101565c = m21652o(list);
    }

    /* renamed from: o */
    public static <T> InterfaceC26860d<T> m21652o(List<? extends C41125fl2<T>> list) {
        if (list.isEmpty()) {
            return new C26859c();
        }
        if (list.size() == 1) {
            return new C26862f(list);
        }
        return new C26861e(list);
    }

    /* renamed from: a */
    public void m21665a(InterfaceC26858b interfaceC26858b) {
        this.f101563a.add(interfaceC26858b);
    }

    /* renamed from: b */
    public C41125fl2<K> m21664b() {
        C32416Dl2.m109978a("BaseKeyframeAnimation#getCurrentKeyframe");
        C41125fl2<K> mo21650a = this.f101565c.mo21650a();
        C32416Dl2.m109977b("BaseKeyframeAnimation#getCurrentKeyframe");
        return mo21650a;
    }

    /* renamed from: c */
    public float mo21663c() {
        if (this.f101570h == -1.0f) {
            this.f101570h = this.f101565c.mo21646e();
        }
        return this.f101570h;
    }

    /* renamed from: d */
    public float m21662d() {
        C41125fl2<K> m21664b = m21664b();
        if (m21664b != null && !m21664b.m40899i()) {
            return m21664b.f80566d.getInterpolation(m21661e());
        }
        return 0.0f;
    }

    /* renamed from: e */
    public float m21661e() {
        if (this.f101564b) {
            return 0.0f;
        }
        C41125fl2<K> m21664b = m21664b();
        if (m21664b.m40899i()) {
            return 0.0f;
        }
        return (this.f101566d - m21664b.m40902f()) / (m21664b.m40905c() - m21664b.m40902f());
    }

    /* renamed from: f */
    public float m21660f() {
        return this.f101566d;
    }

    /* renamed from: g */
    public final float m21659g() {
        if (this.f101569g == -1.0f) {
            this.f101569g = this.f101565c.mo21649b();
        }
        return this.f101569g;
    }

    /* renamed from: h */
    public A mo21658h() {
        A mo11803i;
        float m21661e = m21661e();
        if (this.f101567e == null && this.f101565c.mo21648c(m21661e)) {
            return this.f101568f;
        }
        C41125fl2<K> m21664b = m21664b();
        Interpolator interpolator = m21664b.f80567e;
        if (interpolator != null && m21664b.f80568f != null) {
            mo11803i = mo21657j(m21664b, m21661e, interpolator.getInterpolation(m21661e), m21664b.f80568f.getInterpolation(m21661e));
        } else {
            mo11803i = mo11803i(m21664b, m21662d());
        }
        this.f101568f = mo11803i;
        return mo11803i;
    }

    /* renamed from: i */
    public abstract A mo11803i(C41125fl2<K> c41125fl2, float f);

    /* renamed from: j */
    public A mo21657j(C41125fl2<K> c41125fl2, float f, float f2, float f3) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    /* renamed from: k */
    public void mo21656k() {
        for (int i = 0; i < this.f101563a.size(); i++) {
            this.f101563a.get(i).mo4989e();
        }
    }

    /* renamed from: l */
    public void m21655l() {
        this.f101564b = true;
    }

    /* renamed from: m */
    public void mo21654m(float f) {
        if (this.f101565c.isEmpty()) {
            return;
        }
        if (f < m21659g()) {
            f = m21659g();
        } else if (f > mo21663c()) {
            f = mo21663c();
        }
        if (f == this.f101566d) {
            return;
        }
        this.f101566d = f;
        if (this.f101565c.mo21647d(f)) {
            mo21656k();
        }
    }

    /* renamed from: n */
    public void m21653n(C41410gE2<A> c41410gE2) {
        C41410gE2<A> c41410gE22 = this.f101567e;
        if (c41410gE22 != null) {
            c41410gE22.m39821c(null);
        }
        this.f101567e = c41410gE2;
        if (c41410gE2 != null) {
            c41410gE2.m39821c(this);
        }
    }
}
