package com.google.android.gms.internal.places;

import com.google.android.gms.internal.places.AbstractC17530c;
import com.google.android.gms.internal.places.AbstractC17530c.AbstractC17531a;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* renamed from: com.google.android.gms.internal.places.c */
/* loaded from: classes5.dex */
public abstract class AbstractC17530c<MessageType extends AbstractC17530c<MessageType, BuilderType>, BuilderType extends AbstractC17531a<MessageType, BuilderType>> extends AbstractC17544k<MessageType, BuilderType> {
    private static Map<Object, AbstractC17530c<?, ?>> zzij = new ConcurrentHashMap();
    protected C49611u38 zzih = C49611u38.m10923i();
    private int zzii = -1;

    /* renamed from: com.google.android.gms.internal.places.c$a */
    /* loaded from: classes5.dex */
    public static abstract class AbstractC17531a<MessageType extends AbstractC17530c<MessageType, BuilderType>, BuilderType extends AbstractC17531a<MessageType, BuilderType>> extends AbstractC41371g99<MessageType, BuilderType> {

        /* renamed from: b */
        public final MessageType f71149b;

        /* renamed from: c */
        public MessageType f71150c;

        /* renamed from: d */
        public boolean f71151d = false;

        public AbstractC17531a(MessageType messagetype) {
            this.f71149b = messagetype;
            this.f71150c = (MessageType) messagetype.mo51148k(C17534d.f71156d, null, null);
        }

        /* renamed from: m */
        public static void m51217m(MessageType messagetype, MessageType messagetype2) {
            C48692sW7.m14115a().m14113c(messagetype).zzd(messagetype, messagetype2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.AbstractC41371g99
        public /* synthetic */ Object clone() throws CloneNotSupportedException {
            AbstractC17531a abstractC17531a = (AbstractC17531a) this.f71149b.mo51148k(C17534d.f71157e, null, null);
            abstractC17531a.mo39964j((AbstractC17530c) mo27251v());
            return abstractC17531a;
        }

        @Override // p000.ZT7
        /* renamed from: d */
        public final /* synthetic */ InterfaceC52815zT7 mo51219d() {
            return this.f71149b;
        }

        @Override // p000.AbstractC41371g99
        /* renamed from: k */
        public final /* synthetic */ AbstractC41371g99 mo39963k() {
            return (AbstractC17531a) clone();
        }

        @Override // p000.AbstractC41371g99
        /* renamed from: l */
        public final BuilderType mo39964j(MessageType messagetype) {
            if (this.f71151d) {
                MessageType messagetype2 = (MessageType) this.f71150c.mo51148k(C17534d.f71156d, null, null);
                m51217m(messagetype2, this.f71150c);
                this.f71150c = messagetype2;
                this.f71151d = false;
            }
            m51217m(this.f71150c, messagetype);
            return this;
        }

        @Override // p000.InterfaceC44515lT7
        /* renamed from: n */
        public MessageType mo27251v() {
            if (this.f71151d) {
                return this.f71150c;
            }
            this.f71150c.m51229c();
            this.f71151d = true;
            return this.f71150c;
        }

        @Override // p000.InterfaceC44515lT7
        /* renamed from: o */
        public final MessageType mo27252j1() {
            MessageType messagetype = (MessageType) mo27251v();
            if (messagetype.isInitialized()) {
                return messagetype;
            }
            throw new zzdp(messagetype);
        }
    }

    /* renamed from: com.google.android.gms.internal.places.c$b */
    /* loaded from: classes5.dex */
    public static abstract class AbstractC17532b<MessageType extends AbstractC17532b<MessageType, BuilderType>, BuilderType> extends AbstractC17530c<MessageType, BuilderType> implements ZT7 {
        protected C33231Gx7<Object> zzik = C33231Gx7.m104563f();

        /* renamed from: s */
        public final C33231Gx7<Object> m51214s() {
            if (this.zzik.m104567b()) {
                this.zzik = (C33231Gx7) this.zzik.clone();
            }
            return this.zzik;
        }
    }

    /* renamed from: com.google.android.gms.internal.places.c$c */
    /* loaded from: classes5.dex */
    public static class C17533c<T extends AbstractC17530c<T, ?>> extends J49<T> {

        /* renamed from: b */
        public final T f71152b;

        public C17533c(T t) {
            this.f71152b = t;
        }
    }

    /* renamed from: com.google.android.gms.internal.places.c$d */
    /* loaded from: classes5.dex */
    public enum C17534d {

        /* renamed from: a */
        public static final int f71153a = 1;

        /* renamed from: b */
        public static final int f71154b = 2;

        /* renamed from: c */
        public static final int f71155c = 3;

        /* renamed from: d */
        public static final int f71156d = 4;

        /* renamed from: e */
        public static final int f71157e = 5;

        /* renamed from: f */
        public static final int f71158f = 6;

        /* renamed from: g */
        public static final int f71159g = 7;

        /* renamed from: i */
        public static final int f71161i = 1;

        /* renamed from: j */
        public static final int f71162j = 2;

        /* renamed from: l */
        public static final int f71164l = 1;

        /* renamed from: m */
        public static final int f71165m = 2;

        /* renamed from: h */
        public static final /* synthetic */ int[] f71160h = {1, 2, 3, 4, 5, 6, 7};

        /* renamed from: k */
        public static final /* synthetic */ int[] f71163k = {1, 2};

        /* renamed from: n */
        public static final /* synthetic */ int[] f71166n = {1, 2};

        /* renamed from: a */
        public static int[] m51213a() {
            return (int[]) f71160h.clone();
        }
    }

    /* renamed from: com.google.android.gms.internal.places.c$e */
    /* loaded from: classes5.dex */
    public static class C17535e<ContainingType extends InterfaceC52815zT7, Type> extends C44155kr7<ContainingType, Type> {
    }

    /* renamed from: i */
    public static <T extends AbstractC17530c<T, ?>> T m51228i(T t, byte[] bArr) throws zzbk {
        T t2 = (T) m51227j(t, bArr, 0, bArr.length, C17527a.m51231b());
        if (t2 != null && !t2.isInitialized()) {
            throw new zzbk(new zzdp(t2).getMessage()).m51032g(t2);
        }
        return t2;
    }

    /* renamed from: j */
    public static <T extends AbstractC17530c<T, ?>> T m51227j(T t, byte[] bArr, int i, int i2, C17527a c17527a) throws zzbk {
        T t2 = (T) t.mo51148k(C17534d.f71156d, null, null);
        try {
            C48692sW7.m14115a().m14113c(t2).mo51170c(t2, bArr, 0, i2, new C49433tl9(c17527a));
            t2.m51229c();
            if (t2.zzdt == 0) {
                return t2;
            }
            throw new RuntimeException();
        } catch (IOException e) {
            if (e.getCause() instanceof zzbk) {
                throw ((zzbk) e.getCause());
            }
            throw new zzbk(e.getMessage()).m51032g(t2);
        } catch (IndexOutOfBoundsException unused) {
            throw zzbk.m51038a().m51032g(t2);
        }
    }

    /* renamed from: l */
    public static Object m51226l(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    /* renamed from: m */
    public static Object m51225m(InterfaceC52815zT7 interfaceC52815zT7, String str, Object[] objArr) {
        return new TW7(interfaceC52815zT7, str, objArr);
    }

    /* renamed from: n */
    public static <T extends AbstractC17530c<?, ?>> void m51224n(Class<T> cls, T t) {
        zzij.put(cls, t);
    }

    /* renamed from: o */
    public static final <T extends AbstractC17530c<T, ?>> boolean m51223o(T t, boolean z) {
        Object obj;
        byte byteValue = ((Byte) t.mo51148k(C17534d.f71153a, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean mo51167f = C48692sW7.m14115a().m14113c(t).mo51167f(t);
        if (z) {
            int i = C17534d.f71154b;
            if (mo51167f) {
                obj = t;
            } else {
                obj = null;
            }
            t.mo51148k(i, obj, null);
        }
        return mo51167f;
    }

    /* renamed from: p */
    public static InterfaceC48575sJ7 m51222p() {
        return C38451bG7.m64734c();
    }

    /* renamed from: q */
    public static <E> BI7<E> m51221q() {
        return C42179hX7.m36224b();
    }

    /* renamed from: r */
    public static <T extends AbstractC17530c<?, ?>> T m51220r(Class<T> cls) {
        AbstractC17530c<?, ?> abstractC17530c = zzij.get(cls);
        if (abstractC17530c == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC17530c = zzij.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (abstractC17530c == null) {
            abstractC17530c = (T) ((AbstractC17530c) C49038t58.m13097x(cls)).mo51148k(C17534d.f71158f, null, null);
            if (abstractC17530c != null) {
                zzij.put(cls, abstractC17530c);
            } else {
                throw new IllegalStateException();
            }
        }
        return (T) abstractC17530c;
    }

    @Override // com.google.android.gms.internal.places.AbstractC17544k
    /* renamed from: a */
    final void mo51140a(int i) {
        this.zzii = i;
    }

    @Override // com.google.android.gms.internal.places.AbstractC17544k
    /* renamed from: b */
    public final int mo51139b() {
        return this.zzii;
    }

    /* renamed from: c */
    public final void m51229c() {
        C48692sW7.m14115a().m14113c(this).mo51172a(this);
    }

    @Override // p000.ZT7
    /* renamed from: d */
    public final /* synthetic */ InterfaceC52815zT7 mo51219d() {
        return (AbstractC17530c) mo51148k(C17534d.f71158f, null, null);
    }

    @Override // p000.InterfaceC52815zT7
    /* renamed from: e */
    public final /* synthetic */ InterfaceC44515lT7 mo1331e() {
        AbstractC17531a abstractC17531a = (AbstractC17531a) mo51148k(C17534d.f71157e, null, null);
        abstractC17531a.mo39964j(this);
        return abstractC17531a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!((AbstractC17530c) mo51148k(C17534d.f71158f, null, null)).getClass().isInstance(obj)) {
            return false;
        }
        return C48692sW7.m14115a().m14113c(this).mo51171b(this, (AbstractC17530c) obj);
    }

    @Override // p000.InterfaceC52815zT7
    /* renamed from: f */
    public final /* synthetic */ InterfaceC44515lT7 mo1330f() {
        return (AbstractC17531a) mo51148k(C17534d.f71157e, null, null);
    }

    @Override // p000.InterfaceC52815zT7
    /* renamed from: g */
    public final int mo1329g() {
        if (this.zzii == -1) {
            this.zzii = C48692sW7.m14115a().m14113c(this).mo51165h(this);
        }
        return this.zzii;
    }

    @Override // p000.InterfaceC52815zT7
    /* renamed from: h */
    public final void mo1328h(zzaj zzajVar) throws IOException {
        C48692sW7.m14115a().m14114b(getClass()).mo51166g(this, C48296rq7.m15197f(zzajVar));
    }

    public int hashCode() {
        int i = this.zzdt;
        if (i != 0) {
            return i;
        }
        int mo51168e = C48692sW7.m14115a().m14113c(this).mo51168e(this);
        this.zzdt = mo51168e;
        return mo51168e;
    }

    @Override // p000.ZT7
    public final boolean isInitialized() {
        return m51223o(this, true);
    }

    /* renamed from: k */
    public abstract Object mo51148k(int i, Object obj, Object obj2);

    public String toString() {
        return C17536d.m51212a(this, super.toString());
    }
}
