package p000;

import com.google.crypto.tink.shaded.protobuf.AbstractC18199g;
import com.google.crypto.tink.shaded.protobuf.InterfaceC18149F;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import p000.C33811Jk2;
import p000.C42301hk2;
import p000.V46;
/* renamed from: Qk2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC35449Qk2<KeyProtoT extends InterfaceC18149F> {

    /* renamed from: a */
    public final Class<KeyProtoT> f30810a;

    /* renamed from: b */
    public final Map<Class<?>, D24<?, KeyProtoT>> f30811b;

    /* renamed from: c */
    public final Class<?> f30812c;

    /* renamed from: Qk2$a */
    /* loaded from: classes6.dex */
    public static abstract class AbstractC6849a<KeyFormatProtoT extends InterfaceC18149F, KeyProtoT extends InterfaceC18149F> {

        /* renamed from: a */
        public final Class<KeyFormatProtoT> f30813a;

        /* renamed from: Qk2$a$a */
        /* loaded from: classes6.dex */
        public static final class C6850a<KeyFormatProtoT> {

            /* renamed from: a */
            public KeyFormatProtoT f30814a;

            /* renamed from: b */
            public C33811Jk2.EnumC4220b f30815b;

            public C6850a(KeyFormatProtoT keyformatprotot, C33811Jk2.EnumC4220b enumC4220b) {
                this.f30814a = keyformatprotot;
                this.f30815b = enumC4220b;
            }
        }

        public AbstractC6849a(Class<KeyFormatProtoT> cls) {
            this.f30813a = cls;
        }

        /* renamed from: a */
        public abstract KeyProtoT mo2648a(KeyFormatProtoT keyformatprotot) throws GeneralSecurityException;

        /* renamed from: b */
        public final Class<KeyFormatProtoT> m88100b() {
            return this.f30813a;
        }

        /* renamed from: c */
        public Map<String, C6850a<KeyFormatProtoT>> mo9148c() throws GeneralSecurityException {
            return Collections.emptyMap();
        }

        /* renamed from: d */
        public abstract KeyFormatProtoT mo2647d(AbstractC18199g abstractC18199g) throws InvalidProtocolBufferException;

        /* renamed from: e */
        public abstract void mo2646e(KeyFormatProtoT keyformatprotot) throws GeneralSecurityException;
    }

    @SafeVarargs
    public AbstractC35449Qk2(Class<KeyProtoT> cls, D24<?, KeyProtoT>... d24Arr) {
        this.f30810a = cls;
        HashMap hashMap = new HashMap();
        for (D24<?, KeyProtoT> d24 : d24Arr) {
            if (!hashMap.containsKey(d24.m111022b())) {
                hashMap.put(d24.m111022b(), d24);
            } else {
                throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + d24.m111022b().getCanonicalName());
            }
        }
        if (d24Arr.length > 0) {
            this.f30812c = d24Arr[0].m111022b();
        } else {
            this.f30812c = Void.class;
        }
        this.f30811b = Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: a */
    public V46.EnumC8541b mo79950a() {
        return V46.EnumC8541b.f38570b;
    }

    /* renamed from: b */
    public final Class<?> m88104b() {
        return this.f30812c;
    }

    /* renamed from: c */
    public final Class<KeyProtoT> m88103c() {
        return this.f30810a;
    }

    /* renamed from: d */
    public abstract String mo2659d();

    /* renamed from: e */
    public final <P> P m88102e(KeyProtoT keyprotot, Class<P> cls) throws GeneralSecurityException {
        D24<?, KeyProtoT> d24 = this.f30811b.get(cls);
        if (d24 != null) {
            return (P) d24.mo2650a(keyprotot);
        }
        throw new IllegalArgumentException("Requested primitive class " + cls.getCanonicalName() + " not supported.");
    }

    /* renamed from: f */
    public abstract AbstractC6849a<?, KeyProtoT> mo2658f();

    /* renamed from: g */
    public abstract C42301hk2.EnumC22717c mo2657g();

    /* renamed from: h */
    public abstract KeyProtoT mo2656h(AbstractC18199g abstractC18199g) throws InvalidProtocolBufferException;

    /* renamed from: i */
    public final Set<Class<?>> m88101i() {
        return this.f30811b.keySet();
    }

    /* renamed from: j */
    public abstract void mo2655j(KeyProtoT keyprotot) throws GeneralSecurityException;
}
