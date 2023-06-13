package p000;

import com.google.crypto.tink.shaded.protobuf.InterfaceC18149F;
import java.security.GeneralSecurityException;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;
/* renamed from: uk2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C50009uk2 {

    /* renamed from: b */
    public static final Logger f112826b = Logger.getLogger(C50009uk2.class.getName());

    /* renamed from: a */
    public final ConcurrentMap<String, InterfaceC29295b> f112827a;

    /* renamed from: uk2$a */
    /* loaded from: classes6.dex */
    public class C29294a implements InterfaceC29295b {

        /* renamed from: a */
        public final /* synthetic */ AbstractC35449Qk2 f112828a;

        public C29294a(AbstractC35449Qk2 abstractC35449Qk2) {
            this.f112828a = abstractC35449Qk2;
        }

        @Override // p000.C50009uk2.InterfaceC29295b
        /* renamed from: a */
        public Class<?> mo9807a() {
            return this.f112828a.getClass();
        }

        @Override // p000.C50009uk2.InterfaceC29295b
        /* renamed from: b */
        public <Q> InterfaceC48823sk2<Q> mo9806b(Class<Q> cls) throws GeneralSecurityException {
            try {
                return new C49416tk2(this.f112828a, cls);
            } catch (IllegalArgumentException e) {
                throw new GeneralSecurityException("Primitive type not supported", e);
            }
        }

        @Override // p000.C50009uk2.InterfaceC29295b
        /* renamed from: c */
        public Set<Class<?>> mo9805c() {
            return this.f112828a.m88101i();
        }

        @Override // p000.C50009uk2.InterfaceC29295b
        /* renamed from: d */
        public InterfaceC48823sk2<?> mo9804d() {
            AbstractC35449Qk2 abstractC35449Qk2 = this.f112828a;
            return new C49416tk2(abstractC35449Qk2, abstractC35449Qk2.m88104b());
        }
    }

    /* renamed from: uk2$b */
    /* loaded from: classes6.dex */
    public interface InterfaceC29295b {
        /* renamed from: a */
        Class<?> mo9807a();

        /* renamed from: b */
        <P> InterfaceC48823sk2<P> mo9806b(Class<P> cls) throws GeneralSecurityException;

        /* renamed from: c */
        Set<Class<?>> mo9805c();

        /* renamed from: d */
        InterfaceC48823sk2<?> mo9804d();
    }

    public C50009uk2(C50009uk2 c50009uk2) {
        this.f112827a = new ConcurrentHashMap(c50009uk2.f112827a);
    }

    /* renamed from: a */
    public static <T> T m9817a(T t) {
        t.getClass();
        return t;
    }

    /* renamed from: b */
    public static <KeyProtoT extends InterfaceC18149F> InterfaceC29295b m9816b(AbstractC35449Qk2<KeyProtoT> abstractC35449Qk2) {
        return new C29294a(abstractC35449Qk2);
    }

    /* renamed from: i */
    public static String m9809i(Set<Class<?>> set) {
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Class<?> cls : set) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(cls.getCanonicalName());
            z = false;
        }
        return sb.toString();
    }

    /* renamed from: c */
    public <P> InterfaceC48823sk2<P> m9815c(String str, Class<P> cls) throws GeneralSecurityException {
        return m9813e(str, (Class) m9817a(cls));
    }

    /* renamed from: d */
    public final synchronized InterfaceC29295b m9814d(String str) throws GeneralSecurityException {
        if (this.f112827a.containsKey(str)) {
        } else {
            throw new GeneralSecurityException("No key manager found for key type " + str);
        }
        return this.f112827a.get(str);
    }

    /* renamed from: e */
    public final <P> InterfaceC48823sk2<P> m9813e(String str, Class<P> cls) throws GeneralSecurityException {
        InterfaceC29295b m9814d = m9814d(str);
        if (cls == null) {
            return (InterfaceC48823sk2<P>) m9814d.mo9804d();
        }
        if (m9814d.mo9805c().contains(cls)) {
            return m9814d.mo9806b(cls);
        }
        throw new GeneralSecurityException("Primitive type " + cls.getName() + " not supported by key manager of type " + m9814d.mo9807a() + ", supported primitives: " + m9809i(m9814d.mo9805c()));
    }

    /* renamed from: f */
    public InterfaceC48823sk2<?> m9812f(String str) throws GeneralSecurityException {
        return m9814d(str).mo9804d();
    }

    /* renamed from: g */
    public synchronized <KeyProtoT extends InterfaceC18149F> void m9811g(AbstractC35449Qk2<KeyProtoT> abstractC35449Qk2) throws GeneralSecurityException {
        if (abstractC35449Qk2.mo79950a().mo80443a()) {
            m9810h(m9816b(abstractC35449Qk2), false);
        } else {
            throw new GeneralSecurityException("failed to register key manager " + abstractC35449Qk2.getClass() + " as it is not FIPS compatible.");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0062, code lost:
        r5.f112827a.putIfAbsent(r0, r6);
     */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized <P> void m9810h(InterfaceC29295b interfaceC29295b, boolean z) throws GeneralSecurityException {
        String mo11827d = interfaceC29295b.mo9804d().mo11827d();
        InterfaceC29295b interfaceC29295b2 = this.f112827a.get(mo11827d);
        if (interfaceC29295b2 != null && !interfaceC29295b2.mo9807a().equals(interfaceC29295b.mo9807a())) {
            Logger logger = f112826b;
            logger.warning("Attempted overwrite of a registered key manager for key type " + mo11827d);
            throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", mo11827d, interfaceC29295b2.mo9807a().getName(), interfaceC29295b.mo9807a().getName()));
        }
        this.f112827a.put(mo11827d, interfaceC29295b);
    }

    /* renamed from: j */
    public boolean m9808j(String str) {
        return this.f112827a.containsKey(str);
    }

    public C50009uk2() {
        this.f112827a = new ConcurrentHashMap();
    }
}
