package androidx.camera.core.impl;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.InputConfiguration;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.impl.C11188b;
import androidx.camera.core.impl.C11192d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
/* renamed from: androidx.camera.core.impl.q */
/* loaded from: classes.dex */
public final class C11213q {

    /* renamed from: a */
    public final List<AbstractC11218e> f52641a;

    /* renamed from: b */
    public final List<CameraDevice.StateCallback> f52642b;

    /* renamed from: c */
    public final List<CameraCaptureSession.StateCallback> f52643c;

    /* renamed from: d */
    public final List<AbstractC46943pa0> f52644d;

    /* renamed from: e */
    public final List<InterfaceC11216c> f52645e;

    /* renamed from: f */
    public final C11192d f52646f;

    /* renamed from: g */
    public InputConfiguration f52647g;

    /* renamed from: androidx.camera.core.impl.q$a */
    /* loaded from: classes.dex */
    public static class C11214a {

        /* renamed from: a */
        public final Set<AbstractC11218e> f52648a = new LinkedHashSet();

        /* renamed from: b */
        public final C11192d.C11193a f52649b = new C11192d.C11193a();

        /* renamed from: c */
        public final List<CameraDevice.StateCallback> f52650c = new ArrayList();

        /* renamed from: d */
        public final List<CameraCaptureSession.StateCallback> f52651d = new ArrayList();

        /* renamed from: e */
        public final List<InterfaceC11216c> f52652e = new ArrayList();

        /* renamed from: f */
        public final List<AbstractC46943pa0> f52653f = new ArrayList();

        /* renamed from: g */
        public InputConfiguration f52654g;
    }

    /* renamed from: androidx.camera.core.impl.q$b */
    /* loaded from: classes.dex */
    public static class C11215b extends C11214a {
        /* renamed from: o */
        public static C11215b m69329o(InterfaceC11225s<?> interfaceC11225s, Size size) {
            InterfaceC11217d m69273P = interfaceC11225s.m69273P(null);
            if (m69273P != null) {
                C11215b c11215b = new C11215b();
                m69273P.mo27145a(size, interfaceC11225s, c11215b);
                return c11215b;
            }
            throw new IllegalStateException("Implementation is missing option unpacker for " + interfaceC11225s.m86619q(interfaceC11225s.toString()));
        }

        /* renamed from: a */
        public C11215b m69343a(Collection<CameraDevice.StateCallback> collection) {
            for (CameraDevice.StateCallback stateCallback : collection) {
                m69339e(stateCallback);
            }
            return this;
        }

        /* renamed from: b */
        public C11215b m69342b(Collection<AbstractC46943pa0> collection) {
            this.f52649b.m69443a(collection);
            return this;
        }

        /* renamed from: c */
        public C11215b m69341c(List<CameraCaptureSession.StateCallback> list) {
            for (CameraCaptureSession.StateCallback stateCallback : list) {
                m69334j(stateCallback);
            }
            return this;
        }

        /* renamed from: d */
        public C11215b m69340d(AbstractC46943pa0 abstractC46943pa0) {
            this.f52649b.m69441c(abstractC46943pa0);
            if (!this.f52653f.contains(abstractC46943pa0)) {
                this.f52653f.add(abstractC46943pa0);
            }
            return this;
        }

        /* renamed from: e */
        public C11215b m69339e(CameraDevice.StateCallback stateCallback) {
            if (this.f52650c.contains(stateCallback)) {
                return this;
            }
            this.f52650c.add(stateCallback);
            return this;
        }

        /* renamed from: f */
        public C11215b m69338f(InterfaceC11216c interfaceC11216c) {
            this.f52652e.add(interfaceC11216c);
            return this;
        }

        /* renamed from: g */
        public C11215b m69337g(InterfaceC11197f interfaceC11197f) {
            this.f52649b.m69439e(interfaceC11197f);
            return this;
        }

        /* renamed from: h */
        public C11215b m69336h(DeferrableSurface deferrableSurface) {
            this.f52648a.add(AbstractC11218e.m69322a(deferrableSurface).mo69317a());
            return this;
        }

        /* renamed from: i */
        public C11215b m69335i(AbstractC46943pa0 abstractC46943pa0) {
            this.f52649b.m69441c(abstractC46943pa0);
            return this;
        }

        /* renamed from: j */
        public C11215b m69334j(CameraCaptureSession.StateCallback stateCallback) {
            if (this.f52651d.contains(stateCallback)) {
                return this;
            }
            this.f52651d.add(stateCallback);
            return this;
        }

        /* renamed from: k */
        public C11215b m69333k(DeferrableSurface deferrableSurface) {
            this.f52648a.add(AbstractC11218e.m69322a(deferrableSurface).mo69317a());
            this.f52649b.m69438f(deferrableSurface);
            return this;
        }

        /* renamed from: l */
        public C11215b m69332l(String str, Object obj) {
            this.f52649b.m69437g(str, obj);
            return this;
        }

        /* renamed from: m */
        public C11213q m69331m() {
            return new C11213q(new ArrayList(this.f52648a), this.f52650c, this.f52651d, this.f52653f, this.f52652e, this.f52649b.m69436h(), this.f52654g);
        }

        /* renamed from: n */
        public C11215b m69330n() {
            this.f52648a.clear();
            this.f52649b.m69435i();
            return this;
        }

        /* renamed from: p */
        public List<AbstractC46943pa0> m69328p() {
            return Collections.unmodifiableList(this.f52653f);
        }

        /* renamed from: q */
        public boolean m69327q(AbstractC46943pa0 abstractC46943pa0) {
            boolean m69429o = this.f52649b.m69429o(abstractC46943pa0);
            boolean remove = this.f52653f.remove(abstractC46943pa0);
            if (!m69429o && !remove) {
                return false;
            }
            return true;
        }

        /* renamed from: r */
        public C11215b m69326r(Range<Integer> range) {
            this.f52649b.m69427q(range);
            return this;
        }

        /* renamed from: s */
        public C11215b m69325s(InterfaceC11197f interfaceC11197f) {
            this.f52649b.m69426r(interfaceC11197f);
            return this;
        }

        /* renamed from: t */
        public C11215b m69324t(InputConfiguration inputConfiguration) {
            this.f52654g = inputConfiguration;
            return this;
        }

        /* renamed from: u */
        public C11215b m69323u(int i) {
            this.f52649b.m69425s(i);
            return this;
        }
    }

    /* renamed from: androidx.camera.core.impl.q$c */
    /* loaded from: classes.dex */
    public interface InterfaceC11216c {
        /* renamed from: a */
        void mo1277a(C11213q c11213q, EnumC11220f enumC11220f);
    }

    /* renamed from: androidx.camera.core.impl.q$d */
    /* loaded from: classes.dex */
    public interface InterfaceC11217d {
        /* renamed from: a */
        void mo27145a(Size size, InterfaceC11225s<?> interfaceC11225s, C11215b c11215b);
    }

    /* renamed from: androidx.camera.core.impl.q$e */
    /* loaded from: classes.dex */
    public static abstract class AbstractC11218e {

        /* renamed from: androidx.camera.core.impl.q$e$a */
        /* loaded from: classes.dex */
        public static abstract class AbstractC11219a {
            /* renamed from: a */
            public abstract AbstractC11218e mo69317a();

            /* renamed from: b */
            public abstract AbstractC11219a mo69316b(String str);

            /* renamed from: c */
            public abstract AbstractC11219a mo69315c(List<DeferrableSurface> list);

            /* renamed from: d */
            public abstract AbstractC11219a mo69314d(int i);
        }

        /* renamed from: a */
        public static AbstractC11219a m69322a(DeferrableSurface deferrableSurface) {
            return new C11188b.C11190b().m69456e(deferrableSurface).mo69315c(Collections.emptyList()).mo69316b(null).mo69314d(-1);
        }

        /* renamed from: b */
        public abstract String mo69321b();

        /* renamed from: c */
        public abstract List<DeferrableSurface> mo69320c();

        /* renamed from: d */
        public abstract DeferrableSurface mo69319d();

        /* renamed from: e */
        public abstract int mo69318e();
    }

    /* renamed from: androidx.camera.core.impl.q$f */
    /* loaded from: classes.dex */
    public enum EnumC11220f {
        SESSION_ERROR_SURFACE_NEEDS_RESET,
        SESSION_ERROR_UNKNOWN
    }

    /* renamed from: androidx.camera.core.impl.q$g */
    /* loaded from: classes.dex */
    public static final class C11221g extends C11214a {

        /* renamed from: k */
        public static final List<Integer> f52658k = Arrays.asList(1, 5, 3);

        /* renamed from: h */
        public final C45726nW5 f52659h = new C45726nW5();

        /* renamed from: i */
        public boolean f52660i = true;

        /* renamed from: j */
        public boolean f52661j = false;

        /* renamed from: a */
        public void m69312a(C11213q c11213q) {
            C11192d m69348h = c11213q.m69348h();
            if (m69348h.m69445h() != -1) {
                this.f52661j = true;
                this.f52649b.m69425s(m69307f(m69348h.m69445h(), this.f52649b.m69430n()));
            }
            m69306g(m69348h.m69449d());
            this.f52649b.m69442b(c11213q.m69348h().m69446g());
            this.f52650c.addAll(c11213q.m69354b());
            this.f52651d.addAll(c11213q.m69347i());
            this.f52649b.m69443a(c11213q.m69349g());
            this.f52653f.addAll(c11213q.m69346j());
            this.f52652e.addAll(c11213q.m69353c());
            if (c11213q.m69351e() != null) {
                this.f52654g = c11213q.m69351e();
            }
            this.f52648a.addAll(c11213q.m69350f());
            this.f52649b.m69431m().addAll(m69348h.m69447f());
            if (!m69309d().containsAll(this.f52649b.m69431m())) {
                C33928Jx2.m99533a("ValidatingBuilder", "Invalid configuration due to capture request surfaces are not a subset of surfaces");
                this.f52660i = false;
            }
            this.f52649b.m69439e(m69348h.m69448e());
        }

        /* renamed from: b */
        public C11213q m69311b() {
            if (this.f52660i) {
                ArrayList arrayList = new ArrayList(this.f52648a);
                this.f52659h.m23562d(arrayList);
                return new C11213q(arrayList, this.f52650c, this.f52651d, this.f52653f, this.f52652e, this.f52649b.m69436h(), this.f52654g);
            }
            throw new IllegalArgumentException("Unsupported session configuration combination");
        }

        /* renamed from: c */
        public void m69310c() {
            this.f52648a.clear();
            this.f52649b.m69435i();
        }

        /* renamed from: d */
        public final List<DeferrableSurface> m69309d() {
            ArrayList arrayList = new ArrayList();
            for (AbstractC11218e abstractC11218e : this.f52648a) {
                arrayList.add(abstractC11218e.mo69319d());
                for (DeferrableSurface deferrableSurface : abstractC11218e.mo69320c()) {
                    arrayList.add(deferrableSurface);
                }
            }
            return arrayList;
        }

        /* renamed from: e */
        public boolean m69308e() {
            return this.f52661j && this.f52660i;
        }

        /* renamed from: f */
        public final int m69307f(int i, int i2) {
            List<Integer> list = f52658k;
            if (list.indexOf(Integer.valueOf(i)) < list.indexOf(Integer.valueOf(i2))) {
                return i2;
            }
            return i;
        }

        /* renamed from: g */
        public final void m69306g(Range<Integer> range) {
            Range<Integer> range2 = BR5.f2318a;
            if (range.equals(range2)) {
                return;
            }
            if (this.f52649b.m69432l().equals(range2)) {
                this.f52649b.m69427q(range);
            } else if (!this.f52649b.m69432l().equals(range)) {
                this.f52660i = false;
                C33928Jx2.m99533a("ValidatingBuilder", "Different ExpectedFrameRateRange values");
            }
        }
    }

    public C11213q(List<AbstractC11218e> list, List<CameraDevice.StateCallback> list2, List<CameraCaptureSession.StateCallback> list3, List<AbstractC46943pa0> list4, List<InterfaceC11216c> list5, C11192d c11192d, InputConfiguration inputConfiguration) {
        this.f52641a = list;
        this.f52642b = Collections.unmodifiableList(list2);
        this.f52643c = Collections.unmodifiableList(list3);
        this.f52644d = Collections.unmodifiableList(list4);
        this.f52645e = Collections.unmodifiableList(list5);
        this.f52646f = c11192d;
        this.f52647g = inputConfiguration;
    }

    /* renamed from: a */
    public static C11213q m69355a() {
        return new C11213q(new ArrayList(), new ArrayList(0), new ArrayList(0), new ArrayList(0), new ArrayList(0), new C11192d.C11193a().m69436h(), null);
    }

    /* renamed from: b */
    public List<CameraDevice.StateCallback> m69354b() {
        return this.f52642b;
    }

    /* renamed from: c */
    public List<InterfaceC11216c> m69353c() {
        return this.f52645e;
    }

    /* renamed from: d */
    public InterfaceC11197f m69352d() {
        return this.f52646f.m69448e();
    }

    /* renamed from: e */
    public InputConfiguration m69351e() {
        return this.f52647g;
    }

    /* renamed from: f */
    public List<AbstractC11218e> m69350f() {
        return this.f52641a;
    }

    /* renamed from: g */
    public List<AbstractC46943pa0> m69349g() {
        return this.f52646f.m69451b();
    }

    /* renamed from: h */
    public C11192d m69348h() {
        return this.f52646f;
    }

    /* renamed from: i */
    public List<CameraCaptureSession.StateCallback> m69347i() {
        return this.f52643c;
    }

    /* renamed from: j */
    public List<AbstractC46943pa0> m69346j() {
        return this.f52644d;
    }

    /* renamed from: k */
    public List<DeferrableSurface> m69345k() {
        ArrayList arrayList = new ArrayList();
        for (AbstractC11218e abstractC11218e : this.f52641a) {
            arrayList.add(abstractC11218e.mo69319d());
            for (DeferrableSurface deferrableSurface : abstractC11218e.mo69320c()) {
                arrayList.add(deferrableSurface);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: l */
    public int m69344l() {
        return this.f52646f.m69445h();
    }
}
