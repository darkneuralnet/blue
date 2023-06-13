package p000;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import p000.C44090kl2;
/* renamed from: J24 */
/* loaded from: classes6.dex */
public final class J24<P> {

    /* renamed from: a */
    public final ConcurrentMap<C3873d, List<C3872c<P>>> f16679a;

    /* renamed from: b */
    public C3872c<P> f16680b;

    /* renamed from: c */
    public final Class<P> f16681c;

    /* renamed from: d */
    public final C51642xV2 f16682d;

    /* renamed from: e */
    public final boolean f16683e;

    /* renamed from: J24$b */
    /* loaded from: classes6.dex */
    public static class C3871b<P> {

        /* renamed from: a */
        public final Class<P> f16684a;

        /* renamed from: b */
        public ConcurrentMap<C3873d, List<C3872c<P>>> f16685b;

        /* renamed from: c */
        public C3872c<P> f16686c;

        /* renamed from: d */
        public C51642xV2 f16687d;

        /* renamed from: a */
        public C3871b<P> m101272a(P p, C44090kl2.C25225c c25225c) throws GeneralSecurityException {
            return m101270c(p, c25225c, true);
        }

        /* renamed from: b */
        public C3871b<P> m101271b(P p, C44090kl2.C25225c c25225c) throws GeneralSecurityException {
            return m101270c(p, c25225c, false);
        }

        /* renamed from: c */
        public final C3871b<P> m101270c(P p, C44090kl2.C25225c c25225c, boolean z) throws GeneralSecurityException {
            if (this.f16685b != null) {
                if (c25225c.m28499N() == EnumC33577Ik2.ENABLED) {
                    C3872c<P> m101281b = J24.m101281b(p, c25225c, this.f16685b);
                    if (z) {
                        if (this.f16686c == null) {
                            this.f16686c = m101281b;
                        } else {
                            throw new IllegalStateException("you cannot set two primary primitives");
                        }
                    }
                    return this;
                }
                throw new GeneralSecurityException("only ENABLED key is allowed");
            }
            throw new IllegalStateException("addPrimitive cannot be called after build");
        }

        /* renamed from: d */
        public J24<P> m101269d() throws GeneralSecurityException {
            ConcurrentMap<C3873d, List<C3872c<P>>> concurrentMap = this.f16685b;
            if (concurrentMap != null) {
                J24<P> j24 = new J24<>(concurrentMap, this.f16686c, this.f16687d, this.f16684a);
                this.f16685b = null;
                return j24;
            }
            throw new IllegalStateException("build cannot be called twice");
        }

        /* renamed from: e */
        public C3871b<P> m101268e(C51642xV2 c51642xV2) {
            if (this.f16685b != null) {
                this.f16687d = c51642xV2;
                return this;
            }
            throw new IllegalStateException("setAnnotations cannot be called after build");
        }

        public C3871b(Class<P> cls) {
            this.f16685b = new ConcurrentHashMap();
            this.f16684a = cls;
            this.f16687d = C51642xV2.f117716b;
        }
    }

    /* renamed from: J24$c */
    /* loaded from: classes6.dex */
    public static final class C3872c<P> {

        /* renamed from: a */
        public final P f16688a;

        /* renamed from: b */
        public final byte[] f16689b;

        /* renamed from: c */
        public final EnumC33577Ik2 f16690c;

        /* renamed from: d */
        public final EnumC40189eA3 f16691d;

        /* renamed from: e */
        public final int f16692e;

        /* renamed from: f */
        public final AbstractC38726bk2 f16693f;

        public C3872c(P p, byte[] bArr, EnumC33577Ik2 enumC33577Ik2, EnumC40189eA3 enumC40189eA3, int i, AbstractC38726bk2 abstractC38726bk2) {
            this.f16688a = p;
            this.f16689b = Arrays.copyOf(bArr, bArr.length);
            this.f16690c = enumC33577Ik2;
            this.f16691d = enumC40189eA3;
            this.f16692e = i;
            this.f16693f = abstractC38726bk2;
        }

        /* renamed from: a */
        public final byte[] m101267a() {
            byte[] bArr = this.f16689b;
            if (bArr == null) {
                return null;
            }
            return Arrays.copyOf(bArr, bArr.length);
        }

        /* renamed from: b */
        public AbstractC38726bk2 m101266b() {
            return this.f16693f;
        }

        /* renamed from: c */
        public int m101265c() {
            return this.f16692e;
        }

        /* renamed from: d */
        public EnumC40189eA3 m101264d() {
            return this.f16691d;
        }

        /* renamed from: e */
        public JE3 m101263e() {
            return this.f16693f.mo13031a();
        }

        /* renamed from: f */
        public P m101262f() {
            return this.f16688a;
        }

        /* renamed from: g */
        public EnumC33577Ik2 m101261g() {
            return this.f16690c;
        }
    }

    /* renamed from: J24$d */
    /* loaded from: classes6.dex */
    public static class C3873d implements Comparable<C3873d> {

        /* renamed from: b */
        public final byte[] f16694b;

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(C3873d c3873d) {
            byte[] bArr = this.f16694b;
            int length = bArr.length;
            byte[] bArr2 = c3873d.f16694b;
            if (length != bArr2.length) {
                return bArr.length - bArr2.length;
            }
            int i = 0;
            while (true) {
                byte[] bArr3 = this.f16694b;
                if (i >= bArr3.length) {
                    return 0;
                }
                byte b = bArr3[i];
                byte b2 = c3873d.f16694b[i];
                if (b != b2) {
                    return b - b2;
                }
                i++;
            }
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C3873d)) {
                return false;
            }
            return Arrays.equals(this.f16694b, ((C3873d) obj).f16694b);
        }

        public int hashCode() {
            return Arrays.hashCode(this.f16694b);
        }

        public String toString() {
            return ML1.m95434b(this.f16694b);
        }

        public C3873d(byte[] bArr) {
            this.f16694b = Arrays.copyOf(bArr, bArr.length);
        }
    }

    /* renamed from: b */
    public static <P> C3872c<P> m101281b(P p, C44090kl2.C25225c c25225c, ConcurrentMap<C3873d, List<C3872c<P>>> concurrentMap) throws GeneralSecurityException {
        Integer valueOf = Integer.valueOf(c25225c.m28501L());
        if (c25225c.m28500M() == EnumC40189eA3.RAW) {
            valueOf = null;
        }
        C3872c<P> c3872c = new C3872c<>(p, TE0.m84166a(c25225c), c25225c.m28499N(), c25225c.m28500M(), c25225c.m28501L(), AX2.m115675a().m115673c(G94.m105678b(c25225c.m28502K().m35927L(), c25225c.m28502K().m35926M(), c25225c.m28502K().m35928K(), c25225c.m28500M(), valueOf), A32.m116161a()));
        ArrayList arrayList = new ArrayList();
        arrayList.add(c3872c);
        C3873d c3873d = new C3873d(c3872c.m101267a());
        List<C3872c<P>> put = concurrentMap.put(c3873d, Collections.unmodifiableList(arrayList));
        if (put != null) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(put);
            arrayList2.add(c3872c);
            concurrentMap.put(c3873d, Collections.unmodifiableList(arrayList2));
        }
        return c3872c;
    }

    /* renamed from: j */
    public static <P> C3871b<P> m101273j(Class<P> cls) {
        return new C3871b<>(cls);
    }

    /* renamed from: c */
    public Collection<List<C3872c<P>>> m101280c() {
        return this.f16679a.values();
    }

    /* renamed from: d */
    public C51642xV2 m101279d() {
        return this.f16682d;
    }

    /* renamed from: e */
    public C3872c<P> m101278e() {
        return this.f16680b;
    }

    /* renamed from: f */
    public List<C3872c<P>> m101277f(byte[] bArr) {
        List<C3872c<P>> list = this.f16679a.get(new C3873d(bArr));
        if (list == null) {
            return Collections.emptyList();
        }
        return list;
    }

    /* renamed from: g */
    public Class<P> m101276g() {
        return this.f16681c;
    }

    /* renamed from: h */
    public List<C3872c<P>> m101275h() {
        return m101277f(TE0.f35009a);
    }

    /* renamed from: i */
    public boolean m101274i() {
        return !this.f16682d.m5117b().isEmpty();
    }

    public J24(ConcurrentMap<C3873d, List<C3872c<P>>> concurrentMap, C3872c<P> c3872c, C51642xV2 c51642xV2, Class<P> cls) {
        this.f16679a = concurrentMap;
        this.f16680b = c3872c;
        this.f16681c = cls;
        this.f16682d = c51642xV2;
        this.f16683e = false;
    }
}
