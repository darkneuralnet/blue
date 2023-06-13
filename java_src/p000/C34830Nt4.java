package p000;

import com.google.crypto.tink.shaded.protobuf.AbstractC18199g;
import com.google.crypto.tink.shaded.protobuf.InterfaceC18149F;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;
import p000.AbstractC35449Qk2;
/* renamed from: Nt4  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34830Nt4 {

    /* renamed from: a */
    public static final Logger f25340a = Logger.getLogger(C34830Nt4.class.getName());

    /* renamed from: b */
    public static final AtomicReference<C50009uk2> f25341b = new AtomicReference<>(new C50009uk2());

    /* renamed from: c */
    public static final ConcurrentMap<String, InterfaceC5737b> f25342c = new ConcurrentHashMap();

    /* renamed from: d */
    public static final ConcurrentMap<String, Boolean> f25343d = new ConcurrentHashMap();

    /* renamed from: e */
    public static final ConcurrentMap<String, Object> f25344e = new ConcurrentHashMap();

    /* renamed from: f */
    public static final ConcurrentMap<Class<?>, K24<?, ?>> f25345f = new ConcurrentHashMap();

    /* renamed from: g */
    public static final ConcurrentMap<String, C33811Jk2> f25346g = new ConcurrentHashMap();

    /* renamed from: Nt4$a */
    /* loaded from: classes6.dex */
    public class C5736a implements InterfaceC5737b {

        /* renamed from: a */
        public final /* synthetic */ AbstractC35449Qk2 f25347a;

        public C5736a(AbstractC35449Qk2 abstractC35449Qk2) {
            this.f25347a = abstractC35449Qk2;
        }
    }

    /* renamed from: Nt4$b */
    /* loaded from: classes6.dex */
    public interface InterfaceC5737b {
    }

    private C34830Nt4() {
    }

    /* renamed from: a */
    public static <KeyProtoT extends InterfaceC18149F> InterfaceC5737b m93233a(AbstractC35449Qk2<KeyProtoT> abstractC35449Qk2) {
        return new C5736a(abstractC35449Qk2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
        if (p000.C34830Nt4.f25341b.get().m9808j(r3) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:
        r4 = r4.entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
        if (r4.hasNext() == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
        r5 = r4.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0062, code lost:
        if (p000.C34830Nt4.f25346g.containsKey(r5.getKey()) == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0089, code lost:
        throw new java.security.GeneralSecurityException("Attempted to register a new key template " + r5.getKey() + " from an existing key manager of type " + r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008a, code lost:
        r3 = r4.entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0096, code lost:
        if (r3.hasNext() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0098, code lost:
        r4 = r3.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a8, code lost:
        if (p000.C34830Nt4.f25346g.containsKey(r4.getKey()) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c7, code lost:
        throw new java.security.GeneralSecurityException("Attempted overwrite of a registered key template " + r4.getKey());
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static synchronized <KeyProtoT extends InterfaceC18149F, KeyFormatProtoT extends InterfaceC18149F> void m93232b(String str, Map<String, AbstractC35449Qk2.AbstractC6849a.C6850a<KeyFormatProtoT>> map, boolean z) throws GeneralSecurityException {
        synchronized (C34830Nt4.class) {
            if (z) {
                try {
                    ConcurrentMap<String, Boolean> concurrentMap = f25343d;
                    if (concurrentMap.containsKey(str) && !concurrentMap.get(str).booleanValue()) {
                        throw new GeneralSecurityException("New keys are already disallowed for key type " + str);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* renamed from: c */
    public static Class<?> m93231c(Class<?> cls) {
        K24<?, ?> k24 = f25345f.get(cls);
        if (k24 == null) {
            return null;
        }
        return k24.mo16453a();
    }

    /* renamed from: d */
    public static <P> P m93230d(C42301hk2 c42301hk2, Class<P> cls) throws GeneralSecurityException {
        return (P) m93229e(c42301hk2.m35927L(), c42301hk2.m35926M(), cls);
    }

    /* renamed from: e */
    public static <P> P m93229e(String str, AbstractC18199g abstractC18199g, Class<P> cls) throws GeneralSecurityException {
        return f25341b.get().m9815c(str, cls).mo11829b(abstractC18199g);
    }

    /* renamed from: f */
    public static <P> P m93228f(String str, byte[] bArr, Class<P> cls) throws GeneralSecurityException {
        return (P) m93229e(str, AbstractC18199g.m47699f(bArr), cls);
    }

    /* renamed from: g */
    public static InterfaceC48823sk2<?> m93227g(String str) throws GeneralSecurityException {
        return f25341b.get().m9812f(str);
    }

    /* renamed from: h */
    public static synchronized Map<String, C33811Jk2> m93226h() {
        Map<String, C33811Jk2> unmodifiableMap;
        synchronized (C34830Nt4.class) {
            unmodifiableMap = Collections.unmodifiableMap(f25346g);
        }
        return unmodifiableMap;
    }

    /* renamed from: i */
    public static synchronized InterfaceC18149F m93225i(C34045Kk2 c34045Kk2) throws GeneralSecurityException {
        InterfaceC18149F mo11828c;
        synchronized (C34830Nt4.class) {
            InterfaceC48823sk2<?> m93227g = m93227g(c34045Kk2.m98330L());
            if (f25343d.get(c34045Kk2.m98330L()).booleanValue()) {
                mo11828c = m93227g.mo11828c(c34045Kk2.m98329M());
            } else {
                throw new GeneralSecurityException("newKey-operation not permitted for key type " + c34045Kk2.m98330L());
            }
        }
        return mo11828c;
    }

    /* renamed from: j */
    public static synchronized C42301hk2 m93224j(C34045Kk2 c34045Kk2) throws GeneralSecurityException {
        C42301hk2 mo11830a;
        synchronized (C34830Nt4.class) {
            InterfaceC48823sk2<?> m93227g = m93227g(c34045Kk2.m98330L());
            if (f25343d.get(c34045Kk2.m98330L()).booleanValue()) {
                mo11830a = m93227g.mo11830a(c34045Kk2.m98329M());
            } else {
                throw new GeneralSecurityException("newKey-operation not permitted for key type " + c34045Kk2.m98330L());
            }
        }
        return mo11830a;
    }

    /* renamed from: k */
    public static synchronized <KeyProtoT extends InterfaceC18149F> void m93223k(AbstractC35449Qk2<KeyProtoT> abstractC35449Qk2, boolean z) throws GeneralSecurityException {
        Map<String, AbstractC35449Qk2.AbstractC6849a.C6850a<?>> emptyMap;
        synchronized (C34830Nt4.class) {
            if (abstractC35449Qk2 != null) {
                AtomicReference<C50009uk2> atomicReference = f25341b;
                C50009uk2 c50009uk2 = new C50009uk2(atomicReference.get());
                c50009uk2.m9811g(abstractC35449Qk2);
                String mo2659d = abstractC35449Qk2.mo2659d();
                if (z) {
                    emptyMap = abstractC35449Qk2.mo2658f().mo9148c();
                } else {
                    emptyMap = Collections.emptyMap();
                }
                m93232b(mo2659d, emptyMap, z);
                if (!atomicReference.get().m9808j(mo2659d)) {
                    f25342c.put(mo2659d, m93233a(abstractC35449Qk2));
                    if (z) {
                        m93222l(mo2659d, abstractC35449Qk2.mo2658f().mo9148c());
                    }
                }
                f25343d.put(mo2659d, Boolean.valueOf(z));
                atomicReference.set(c50009uk2);
            } else {
                throw new IllegalArgumentException("key manager must be non-null.");
            }
        }
    }

    /* renamed from: l */
    public static <KeyFormatProtoT extends InterfaceC18149F> void m93222l(String str, Map<String, AbstractC35449Qk2.AbstractC6849a.C6850a<KeyFormatProtoT>> map) {
        for (Map.Entry<String, AbstractC35449Qk2.AbstractC6849a.C6850a<KeyFormatProtoT>> entry : map.entrySet()) {
            f25346g.put(entry.getKey(), C33811Jk2.m99873a(str, entry.getValue().f30814a.mo47795e(), entry.getValue().f30815b));
        }
    }

    /* renamed from: m */
    public static synchronized <B, P> void m93221m(K24<B, P> k24) throws GeneralSecurityException {
        synchronized (C34830Nt4.class) {
            if (k24 != null) {
                Class<P> mo16452b = k24.mo16452b();
                ConcurrentMap<Class<?>, K24<?, ?>> concurrentMap = f25345f;
                if (concurrentMap.containsKey(mo16452b)) {
                    K24<?, ?> k242 = concurrentMap.get(mo16452b);
                    if (!k24.getClass().getName().equals(k242.getClass().getName())) {
                        Logger logger = f25340a;
                        logger.warning("Attempted overwrite of a registered PrimitiveWrapper for type " + mo16452b);
                        throw new GeneralSecurityException(String.format("PrimitiveWrapper for primitive (%s) is already registered to be %s, cannot be re-registered with %s", mo16452b.getName(), k242.getClass().getName(), k24.getClass().getName()));
                    }
                }
                concurrentMap.put(mo16452b, k24);
            } else {
                throw new IllegalArgumentException("wrapper must be non-null");
            }
        }
    }

    /* renamed from: n */
    public static <B, P> P m93220n(J24<B> j24, Class<P> cls) throws GeneralSecurityException {
        K24<?, ?> k24 = f25345f.get(cls);
        if (k24 != null) {
            if (k24.mo16453a().equals(j24.m101276g())) {
                return (P) k24.mo16451c(j24);
            }
            throw new GeneralSecurityException("Wrong input primitive class, expected " + k24.mo16453a() + ", got " + j24.m101276g());
        }
        throw new GeneralSecurityException("No wrapper found for " + j24.m101276g().getName());
    }
}
