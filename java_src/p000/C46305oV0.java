package p000;

import com.bumptech.glide.C17104c;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.data.InterfaceC17126a;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p000.RunnableC48084rV0;
import p000.WU2;
/* renamed from: oV0  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C46305oV0<Transcode> {

    /* renamed from: a */
    public final List<WU2.C9060a<?>> f102069a = new ArrayList();

    /* renamed from: b */
    public final List<InterfaceC38133ak2> f102070b = new ArrayList();

    /* renamed from: c */
    public C17104c f102071c;

    /* renamed from: d */
    public Object f102072d;

    /* renamed from: e */
    public int f102073e;

    /* renamed from: f */
    public int f102074f;

    /* renamed from: g */
    public Class<?> f102075g;

    /* renamed from: h */
    public RunnableC48084rV0.InterfaceC27938e f102076h;

    /* renamed from: i */
    public C48964sy3 f102077i;

    /* renamed from: j */
    public Map<Class<?>, InterfaceC47891r96<?>> f102078j;

    /* renamed from: k */
    public Class<Transcode> f102079k;

    /* renamed from: l */
    public boolean f102080l;

    /* renamed from: m */
    public boolean f102081m;

    /* renamed from: n */
    public InterfaceC38133ak2 f102082n;

    /* renamed from: o */
    public P24 f102083o;

    /* renamed from: p */
    public B41 f102084p;

    /* renamed from: q */
    public boolean f102085q;

    /* renamed from: r */
    public boolean f102086r;

    /* renamed from: a */
    public void m20984a() {
        this.f102071c = null;
        this.f102072d = null;
        this.f102082n = null;
        this.f102075g = null;
        this.f102079k = null;
        this.f102077i = null;
        this.f102083o = null;
        this.f102078j = null;
        this.f102084p = null;
        this.f102069a.clear();
        this.f102080l = false;
        this.f102070b.clear();
        this.f102081m = false;
    }

    /* renamed from: b */
    public InterfaceC28820to m20983b() {
        return this.f102071c.m53132b();
    }

    /* renamed from: c */
    public List<InterfaceC38133ak2> m20982c() {
        if (!this.f102081m) {
            this.f102081m = true;
            this.f102070b.clear();
            List<WU2.C9060a<?>> m20978g = m20978g();
            int size = m20978g.size();
            for (int i = 0; i < size; i++) {
                WU2.C9060a<?> c9060a = m20978g.get(i);
                if (!this.f102070b.contains(c9060a.f41158a)) {
                    this.f102070b.add(c9060a.f41158a);
                }
                for (int i2 = 0; i2 < c9060a.f41159b.size(); i2++) {
                    if (!this.f102070b.contains(c9060a.f41159b.get(i2))) {
                        this.f102070b.add(c9060a.f41159b.get(i2));
                    }
                }
            }
        }
        return this.f102070b;
    }

    /* renamed from: d */
    public InterfaceC52578z41 m20981d() {
        return this.f102076h.mo15852a();
    }

    /* renamed from: e */
    public B41 m20980e() {
        return this.f102084p;
    }

    /* renamed from: f */
    public int m20979f() {
        return this.f102074f;
    }

    /* renamed from: g */
    public List<WU2.C9060a<?>> m20978g() {
        if (!this.f102080l) {
            this.f102080l = true;
            this.f102069a.clear();
            List m53170i = this.f102071c.m53125i().m53170i(this.f102072d);
            int size = m53170i.size();
            for (int i = 0; i < size; i++) {
                WU2.C9060a<?> mo19951b = ((WU2) m53170i.get(i)).mo19951b(this.f102072d, this.f102073e, this.f102074f, this.f102077i);
                if (mo19951b != null) {
                    this.f102069a.add(mo19951b);
                }
            }
        }
        return this.f102069a;
    }

    /* renamed from: h */
    public <Data> C42984it2<Data, ?, Transcode> m20977h(Class<Data> cls) {
        return this.f102071c.m53125i().m53171h(cls, this.f102075g, this.f102079k);
    }

    /* renamed from: i */
    public Class<?> m20976i() {
        return this.f102072d.getClass();
    }

    /* renamed from: j */
    public List<WU2<File, ?>> m20975j(File file) throws Registry.NoModelLoaderAvailableException {
        return this.f102071c.m53125i().m53170i(file);
    }

    /* renamed from: k */
    public C48964sy3 m20974k() {
        return this.f102077i;
    }

    /* renamed from: l */
    public P24 m20973l() {
        return this.f102083o;
    }

    /* renamed from: m */
    public List<Class<?>> m20972m() {
        return this.f102071c.m53125i().m53169j(this.f102072d.getClass(), this.f102075g, this.f102079k);
    }

    /* renamed from: n */
    public <Z> InterfaceC40298eM4<Z> m20971n(VL4<Z> vl4) {
        return this.f102071c.m53125i().m53168k(vl4);
    }

    /* renamed from: o */
    public <T> InterfaceC17126a<T> m20970o(T t) {
        return this.f102071c.m53125i().m53167l(t);
    }

    /* renamed from: p */
    public InterfaceC38133ak2 m20969p() {
        return this.f102082n;
    }

    /* renamed from: q */
    public <X> InterfaceC45175mb1<X> m20968q(X x) throws Registry.NoSourceEncoderAvailableException {
        return this.f102071c.m53125i().m53166m(x);
    }

    /* renamed from: r */
    public Class<?> m20967r() {
        return (Class<Transcode>) this.f102079k;
    }

    /* renamed from: s */
    public <Z> InterfaceC47891r96<Z> m20966s(Class<Z> cls) {
        InterfaceC47891r96<Z> interfaceC47891r96 = (InterfaceC47891r96<Z>) this.f102078j.get(cls);
        if (interfaceC47891r96 == null) {
            Iterator<Map.Entry<Class<?>, InterfaceC47891r96<?>>> it = this.f102078j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<Class<?>, InterfaceC47891r96<?>> next = it.next();
                if (next.getKey().isAssignableFrom(cls)) {
                    interfaceC47891r96 = (InterfaceC47891r96<Z>) next.getValue();
                    break;
                }
            }
        }
        if (interfaceC47891r96 == null) {
            if (this.f102078j.isEmpty() && this.f102085q) {
                throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
            }
            return C42245he6.m36117c();
        }
        return interfaceC47891r96;
    }

    /* renamed from: t */
    public int m20965t() {
        return this.f102073e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: u */
    public boolean m20964u(Class<?> cls) {
        return m20977h(cls) != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: v */
    public <R> void m20963v(C17104c c17104c, Object obj, InterfaceC38133ak2 interfaceC38133ak2, int i, int i2, B41 b41, Class<?> cls, Class<R> cls2, P24 p24, C48964sy3 c48964sy3, Map<Class<?>, InterfaceC47891r96<?>> map, boolean z, boolean z2, RunnableC48084rV0.InterfaceC27938e interfaceC27938e) {
        this.f102071c = c17104c;
        this.f102072d = obj;
        this.f102082n = interfaceC38133ak2;
        this.f102073e = i;
        this.f102074f = i2;
        this.f102084p = b41;
        this.f102075g = cls;
        this.f102076h = interfaceC27938e;
        this.f102079k = cls2;
        this.f102083o = p24;
        this.f102077i = c48964sy3;
        this.f102078j = map;
        this.f102085q = z;
        this.f102086r = z2;
    }

    /* renamed from: w */
    public boolean m20962w(VL4<?> vl4) {
        return this.f102071c.m53125i().m53165n(vl4);
    }

    /* renamed from: x */
    public boolean m20961x() {
        return this.f102086r;
    }

    /* renamed from: y */
    public boolean m20960y(InterfaceC38133ak2 interfaceC38133ak2) {
        List<WU2.C9060a<?>> m20978g = m20978g();
        int size = m20978g.size();
        for (int i = 0; i < size; i++) {
            if (m20978g.get(i).f41158a.equals(interfaceC38133ak2)) {
                return true;
            }
        }
        return false;
    }
}
