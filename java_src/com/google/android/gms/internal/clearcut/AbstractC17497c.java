package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.AbstractC17497c;
import com.google.android.gms.internal.clearcut.AbstractC17497c.AbstractC17498a;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* renamed from: com.google.android.gms.internal.clearcut.c */
/* loaded from: classes5.dex */
public abstract class AbstractC17497c<MessageType extends AbstractC17497c<MessageType, BuilderType>, BuilderType extends AbstractC17498a<MessageType, BuilderType>> extends AbstractC17495a<MessageType, BuilderType> {
    private static Map<Object, AbstractC17497c<?, ?>> zzjr = new ConcurrentHashMap();
    protected C35626Rd8 zzjp = C35626Rd8.m86522h();
    private int zzjq = -1;

    /* renamed from: com.google.android.gms.internal.clearcut.c$a */
    /* loaded from: classes5.dex */
    public static abstract class AbstractC17498a<MessageType extends AbstractC17497c<MessageType, BuilderType>, BuilderType extends AbstractC17498a<MessageType, BuilderType>> extends AbstractC41833gw7<MessageType, BuilderType> {

        /* renamed from: b */
        public final MessageType f70397b;

        /* renamed from: c */
        public MessageType f70398c;

        /* renamed from: d */
        public boolean f70399d = false;

        public AbstractC17498a(MessageType messagetype) {
            this.f70397b = messagetype;
            this.f70398c = (MessageType) messagetype.mo51468d(C17502e.f70406d, null, null);
        }

        /* renamed from: g */
        public static void m51549g(MessageType messagetype, MessageType messagetype2) {
            Y68.m75693a().m75690d(messagetype).mo5808f(messagetype, messagetype2);
        }

        @Override // p000.U28
        /* renamed from: L1 */
        public final /* synthetic */ H28 mo51552L1() {
            AbstractC17497c abstractC17497c = (AbstractC17497c) mo51551c2();
            byte byteValue = ((Byte) abstractC17497c.mo51468d(C17502e.f70403a, null, null)).byteValue();
            boolean z = true;
            if (byteValue != 1) {
                if (byteValue == 0) {
                    z = false;
                } else {
                    z = Y68.m75693a().m75690d(abstractC17497c).mo5807g(abstractC17497c);
                    abstractC17497c.mo51468d(C17502e.f70404b, z ? abstractC17497c : null, null);
                }
            }
            if (z) {
                return abstractC17497c;
            }
            throw new zzew(abstractC17497c);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.AbstractC41833gw7
        public /* synthetic */ Object clone() throws CloneNotSupportedException {
            AbstractC17498a abstractC17498a = (AbstractC17498a) this.f70397b.mo51468d(C17502e.f70407e, null, null);
            abstractC17498a.mo37305d((AbstractC17497c) mo51551c2());
            return abstractC17498a;
        }

        @Override // p000.AbstractC41833gw7
        /* renamed from: e */
        public final /* synthetic */ AbstractC41833gw7 mo37304e() {
            return (AbstractC17498a) clone();
        }

        @Override // p000.AbstractC41833gw7
        /* renamed from: f */
        public final BuilderType mo37305d(MessageType messagetype) {
            m51548h();
            m51549g(this.f70398c, messagetype);
            return this;
        }

        /* renamed from: h */
        public void m51548h() {
            if (this.f70399d) {
                MessageType messagetype = (MessageType) this.f70398c.mo51468d(C17502e.f70406d, null, null);
                m51549g(messagetype, this.f70398c);
                this.f70398c = messagetype;
                this.f70399d = false;
            }
        }

        @Override // p000.U28
        /* renamed from: j */
        public MessageType mo51551c2() {
            if (this.f70399d) {
                return this.f70398c;
            }
            MessageType messagetype = this.f70398c;
            Y68.m75693a().m75690d(messagetype).zzc(messagetype);
            this.f70399d = true;
            return this.f70398c;
        }

        /* renamed from: p */
        public final MessageType m51546p() {
            MessageType messagetype = (MessageType) mo51551c2();
            byte byteValue = ((Byte) messagetype.mo51468d(C17502e.f70403a, null, null)).byteValue();
            boolean z = true;
            if (byteValue != 1) {
                if (byteValue == 0) {
                    z = false;
                } else {
                    z = Y68.m75693a().m75690d(messagetype).mo5807g(messagetype);
                    messagetype.mo51468d(C17502e.f70404b, z ? messagetype : null, null);
                }
            }
            if (z) {
                return messagetype;
            }
            throw new zzew(messagetype);
        }

        @Override // p000.InterfaceC43682k38
        /* renamed from: v */
        public final /* synthetic */ H28 mo29386v() {
            return this.f70397b;
        }
    }

    /* renamed from: com.google.android.gms.internal.clearcut.c$b */
    /* loaded from: classes5.dex */
    public static class C17499b<T extends AbstractC17497c<T, ?>> extends C36732Vw7<T> {

        /* renamed from: b */
        public T f70400b;

        public C17499b(T t) {
            this.f70400b = t;
        }
    }

    /* renamed from: com.google.android.gms.internal.clearcut.c$c */
    /* loaded from: classes5.dex */
    public static abstract class AbstractC17500c<MessageType extends AbstractC17500c<MessageType, BuilderType>, BuilderType> extends AbstractC17497c<MessageType, BuilderType> implements InterfaceC43682k38 {
        protected TO7<C17501d> zzjv = TO7.m83686k();
    }

    /* renamed from: com.google.android.gms.internal.clearcut.c$d */
    /* loaded from: classes5.dex */
    public static final class C17501d implements HQ7<C17501d> {

        /* renamed from: b */
        public final int f70401b;

        /* renamed from: c */
        public final EnumC44659li8 f70402c;

        @Override // p000.HQ7
        /* renamed from: A */
        public final boolean mo51545A() {
            return false;
        }

        @Override // p000.HQ7
        /* renamed from: I */
        public final D48 mo51544I(D48 d48, D48 d482) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.HQ7
        /* renamed from: V */
        public final EnumC31936Bj8 mo51543V() {
            return this.f70402c.m26926a();
        }

        @Override // java.lang.Comparable
        public final /* synthetic */ int compareTo(Object obj) {
            return this.f70401b - ((C17501d) obj).f70401b;
        }

        @Override // p000.HQ7
        /* renamed from: i3 */
        public final EnumC44659li8 mo51542i3() {
            return this.f70402c;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.HQ7
        /* renamed from: t3 */
        public final U28 mo51541t3(U28 u28, H28 h28) {
            return ((AbstractC17498a) u28).mo37305d((AbstractC17497c) h28);
        }

        @Override // p000.HQ7
        /* renamed from: z */
        public final boolean mo51540z() {
            return false;
        }

        @Override // p000.HQ7
        public final int zzc() {
            return this.f70401b;
        }
    }

    /* renamed from: com.google.android.gms.internal.clearcut.c$e */
    /* loaded from: classes5.dex */
    public enum C17502e {

        /* renamed from: a */
        public static final int f70403a = 1;

        /* renamed from: b */
        public static final int f70404b = 2;

        /* renamed from: c */
        public static final int f70405c = 3;

        /* renamed from: d */
        public static final int f70406d = 4;

        /* renamed from: e */
        public static final int f70407e = 5;

        /* renamed from: f */
        public static final int f70408f = 6;

        /* renamed from: g */
        public static final int f70409g = 7;

        /* renamed from: i */
        public static final int f70411i = 1;

        /* renamed from: j */
        public static final int f70412j = 2;

        /* renamed from: l */
        public static final int f70414l = 1;

        /* renamed from: m */
        public static final int f70415m = 2;

        /* renamed from: h */
        public static final /* synthetic */ int[] f70410h = {1, 2, 3, 4, 5, 6, 7};

        /* renamed from: k */
        public static final /* synthetic */ int[] f70413k = {1, 2};

        /* renamed from: n */
        public static final /* synthetic */ int[] f70416n = {1, 2};

        /* renamed from: a */
        public static int[] m51539a() {
            return (int[]) f70410h.clone();
        }
    }

    /* renamed from: c */
    public static <T extends AbstractC17497c<T, ?>> T m51563c(T t, byte[] bArr) throws zzco {
        T t2 = (T) t.mo51468d(C17502e.f70406d, null, null);
        try {
            Y68.m75693a().m75690d(t2).mo5813a(t2, bArr, 0, bArr.length, new C40786fA7());
            Y68.m75693a().m75690d(t2).zzc(t2);
            if (t2.zzex == 0) {
                return t2;
            }
            throw new RuntimeException();
        } catch (IOException e) {
            if (e.getCause() instanceof zzco) {
                throw ((zzco) e.getCause());
            }
            throw new zzco(e.getMessage()).m51352f(t2);
        } catch (IndexOutOfBoundsException unused) {
            throw zzco.m51357a().m51352f(t2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static Object m51562e(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    /* renamed from: f */
    public static Object m51561f(H28 h28, String str, Object[] objArr) {
        return new C78(h28, str, objArr);
    }

    /* renamed from: g */
    public static <T extends AbstractC17497c<?, ?>> void m51560g(Class<T> cls, T t) {
        zzjr.put(cls, t);
    }

    /* renamed from: h */
    public static <T extends AbstractC17497c<T, ?>> T m51559h(T t, byte[] bArr) throws zzco {
        T t2 = (T) m51563c(t, bArr);
        if (t2 != null) {
            byte byteValue = ((Byte) t2.mo51468d(C17502e.f70403a, null, null)).byteValue();
            boolean z = true;
            if (byteValue != 1) {
                if (byteValue == 0) {
                    z = false;
                } else {
                    z = Y68.m75693a().m75690d(t2).mo5807g(t2);
                    t2.mo51468d(C17502e.f70404b, z ? t2 : null, null);
                }
            }
            if (!z) {
                throw new zzco(new zzew(t2).getMessage()).m51352f(t2);
            }
        }
        return t2;
    }

    /* renamed from: i */
    public static <E> InterfaceC47489qU7<E> m51558i() {
        return C45501n78.m24287b();
    }

    /* renamed from: j */
    public static <T extends AbstractC17497c<?, ?>> T m51557j(Class<T> cls) {
        T t = (T) zzjr.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (T) zzjr.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (t == null) {
            String name = cls.getName();
            throw new IllegalStateException(name.length() != 0 ? "Unable to get default instance for: ".concat(name) : new String("Unable to get default instance for: "));
        }
        return t;
    }

    @Override // com.google.android.gms.internal.clearcut.AbstractC17495a
    /* renamed from: a */
    final void mo51565a(int i) {
        this.zzjq = i;
    }

    @Override // com.google.android.gms.internal.clearcut.AbstractC17495a
    /* renamed from: b */
    final int mo51564b() {
        return this.zzjq;
    }

    /* renamed from: d */
    public abstract Object mo51468d(int i, Object obj, Object obj2);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (((AbstractC17497c) mo51468d(C17502e.f70408f, null, null)).getClass().isInstance(obj)) {
            return Y68.m75693a().m75690d(this).mo5812b(this, (AbstractC17497c) obj);
        }
        return false;
    }

    public int hashCode() {
        int i = this.zzex;
        if (i != 0) {
            return i;
        }
        int mo5809e = Y68.m75693a().m75690d(this).mo5809e(this);
        this.zzex = mo5809e;
        return mo5809e;
    }

    @Override // p000.InterfaceC43682k38
    public final boolean isInitialized() {
        byte byteValue = ((Byte) mo51468d(C17502e.f70403a, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean mo5807g = Y68.m75693a().m75690d(this).mo5807g(this);
        mo51468d(C17502e.f70404b, mo5807g ? this : null, null);
        return mo5807g;
    }

    @Override // p000.H28
    /* renamed from: l */
    public final /* synthetic */ U28 mo51556l() {
        AbstractC17498a abstractC17498a = (AbstractC17498a) mo51468d(C17502e.f70407e, null, null);
        abstractC17498a.mo37305d(this);
        return abstractC17498a;
    }

    @Override // p000.H28
    /* renamed from: m */
    public final /* synthetic */ U28 mo51555m() {
        return (AbstractC17498a) mo51468d(C17502e.f70407e, null, null);
    }

    @Override // p000.H28
    /* renamed from: n */
    public final void mo51554n(zzbn zzbnVar) throws IOException {
        Y68.m75693a().m75692b(getClass()).mo5811c(this, C42673iM7.m34076g(zzbnVar));
    }

    @Override // p000.H28
    /* renamed from: o */
    public final int mo51553o() {
        if (this.zzjq == -1) {
            this.zzjq = Y68.m75693a().m75690d(this).mo5806h(this);
        }
        return this.zzjq;
    }

    public String toString() {
        return C17503d.m51538a(this, super.toString());
    }

    @Override // p000.InterfaceC43682k38
    /* renamed from: v */
    public final /* synthetic */ H28 mo29386v() {
        return (AbstractC17497c) mo51468d(C17502e.f70408f, null, null);
    }
}
