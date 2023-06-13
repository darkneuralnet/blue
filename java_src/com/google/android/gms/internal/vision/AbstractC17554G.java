package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.AbstractC17554G;
import com.google.android.gms.internal.vision.AbstractC17554G.AbstractC17556b;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* renamed from: com.google.android.gms.internal.vision.G */
/* loaded from: classes6.dex */
public abstract class AbstractC17554G<MessageType extends AbstractC17554G<MessageType, BuilderType>, BuilderType extends AbstractC17556b<MessageType, BuilderType>> extends AbstractC17549C<MessageType, BuilderType> {
    private static Map<Object, AbstractC17554G<?, ?>> zzd = new ConcurrentHashMap();
    protected HY8 zzb = HY8.m103758a();
    private int zzc = -1;

    /* renamed from: com.google.android.gms.internal.vision.G$a */
    /* loaded from: classes6.dex */
    public static class C17555a<T extends AbstractC17554G<T, ?>> extends C48347rv8<T> {

        /* renamed from: b */
        public final T f71222b;

        public C17555a(T t) {
            this.f71222b = t;
        }
    }

    /* renamed from: com.google.android.gms.internal.vision.G$b */
    /* loaded from: classes6.dex */
    public static abstract class AbstractC17556b<MessageType extends AbstractC17554G<MessageType, BuilderType>, BuilderType extends AbstractC17556b<MessageType, BuilderType>> extends AbstractC35779Ru8<MessageType, BuilderType> {

        /* renamed from: b */
        public final MessageType f71223b;

        /* renamed from: c */
        public MessageType f71224c;

        /* renamed from: d */
        public boolean f71225d = false;

        public AbstractC17556b(MessageType messagetype) {
            this.f71223b = messagetype;
            this.f71224c = (MessageType) messagetype.mo50854l(C17560f.f71234d, null, null);
        }

        /* renamed from: n */
        public static void m50977n(MessageType messagetype, MessageType messagetype2) {
            C40365eT8.m42854a().m42852c(messagetype).mo1309f(messagetype, messagetype2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.AbstractC35779Ru8
        public /* synthetic */ Object clone() throws CloneNotSupportedException {
            AbstractC17556b abstractC17556b = (AbstractC17556b) this.f71223b.mo50854l(C17560f.f71235e, null, null);
            abstractC17556b.mo50982g((AbstractC17554G) zze());
            return abstractC17556b;
        }

        @Override // p000.AbstractC35779Ru8
        /* renamed from: f */
        public final /* synthetic */ AbstractC35779Ru8 mo50983f() {
            return (AbstractC17556b) clone();
        }

        @Override // p000.HQ8
        /* renamed from: k */
        public final /* synthetic */ InterfaceC44489lQ8 mo50980k() {
            return this.f71223b;
        }

        @Override // p000.AbstractC35779Ru8
        /* renamed from: l */
        public final /* synthetic */ AbstractC35779Ru8 mo50979l(byte[] bArr, int i, int i2, C17551E c17551e) throws zzjk {
            return m50975p(bArr, 0, i2, c17551e);
        }

        @Override // p000.AbstractC35779Ru8
        /* renamed from: m */
        public final BuilderType mo50982g(MessageType messagetype) {
            if (this.f71225d) {
                m50974q();
                this.f71225d = false;
            }
            m50977n(this.f71224c, messagetype);
            return this;
        }

        @Override // p000.AbstractC35779Ru8
        /* renamed from: o */
        public final BuilderType mo50981j(WB8 wb8, C17551E c17551e) throws IOException {
            if (this.f71225d) {
                m50974q();
                this.f71225d = false;
            }
            try {
                C40365eT8.m42854a().m42852c(this.f71224c).mo1311d(this.f71224c, C42584iC8.m34342I(wb8), c17551e);
                return this;
            } catch (RuntimeException e) {
                if (e.getCause() instanceof IOException) {
                    throw ((IOException) e.getCause());
                }
                throw e;
            }
        }

        /* renamed from: p */
        public final BuilderType m50975p(byte[] bArr, int i, int i2, C17551E c17551e) throws zzjk {
            if (this.f71225d) {
                m50974q();
                this.f71225d = false;
            }
            try {
                C40365eT8.m42854a().m42852c(this.f71224c).mo1310e(this.f71224c, bArr, 0, i2, new C41844gx8(c17551e));
                return this;
            } catch (zzjk e) {
                throw e;
            } catch (IOException e2) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
            } catch (IndexOutOfBoundsException unused) {
                throw zzjk.m50764a();
            }
        }

        /* renamed from: q */
        public void m50974q() {
            MessageType messagetype = (MessageType) this.f71224c.mo50854l(C17560f.f71234d, null, null);
            m50977n(messagetype, this.f71224c);
            this.f71224c = messagetype;
        }

        @Override // p000.SQ8
        /* renamed from: r */
        public MessageType zze() {
            if (this.f71225d) {
                return this.f71224c;
            }
            MessageType messagetype = this.f71224c;
            C40365eT8.m42854a().m42852c(messagetype).zzc(messagetype);
            this.f71225d = true;
            return this.f71224c;
        }

        @Override // p000.SQ8
        /* renamed from: t */
        public final MessageType mo50971x() {
            MessageType messagetype = (MessageType) zze();
            if (messagetype.mo50995a()) {
                return messagetype;
            }
            throw new zzlv(messagetype);
        }
    }

    /* renamed from: com.google.android.gms.internal.vision.G$c */
    /* loaded from: classes6.dex */
    public static abstract class AbstractC17557c<MessageType extends AbstractC17557c<MessageType, BuilderType>, BuilderType> extends AbstractC17554G<MessageType, BuilderType> implements HQ8 {
        protected C47355qF8<C17559e> zzc = C47355qF8.m17727e();

        /* renamed from: u */
        public final C47355qF8<C17559e> m50970u() {
            if (this.zzc.m17718n()) {
                this.zzc = (C47355qF8) this.zzc.clone();
            }
            return this.zzc;
        }
    }

    /* renamed from: com.google.android.gms.internal.vision.G$d */
    /* loaded from: classes6.dex */
    public static class C17558d<ContainingType extends InterfaceC44489lQ8, Type> extends AD8<ContainingType, Type> {

        /* renamed from: a */
        public final InterfaceC44489lQ8 f71226a;

        /* renamed from: b */
        public final C17559e f71227b;
    }

    /* renamed from: com.google.android.gms.internal.vision.G$e */
    /* loaded from: classes6.dex */
    public static final class C17559e implements OF8<C17559e> {

        /* renamed from: b */
        public final int f71228b;

        /* renamed from: c */
        public final T19 f71229c;

        /* renamed from: d */
        public final boolean f71230d;

        @Override // java.lang.Comparable
        public final /* synthetic */ int compareTo(Object obj) {
            return this.f71228b - ((C17559e) obj).f71228b;
        }

        @Override // p000.OF8
        /* renamed from: l3 */
        public final InterfaceC39153cS8 mo50969l3(InterfaceC39153cS8 interfaceC39153cS8, InterfaceC39153cS8 interfaceC39153cS82) {
            throw new UnsupportedOperationException();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.OF8
        /* renamed from: v0 */
        public final SQ8 mo50968v0(SQ8 sq8, InterfaceC44489lQ8 interfaceC44489lQ8) {
            return ((AbstractC17556b) sq8).mo50982g((AbstractC17554G) interfaceC44489lQ8);
        }

        @Override // p000.OF8
        public final int zza() {
            return this.f71228b;
        }

        @Override // p000.OF8
        public final T19 zzb() {
            return this.f71229c;
        }

        @Override // p000.OF8
        public final EnumC51380x29 zzc() {
            return this.f71229c.m84416a();
        }

        @Override // p000.OF8
        public final boolean zzd() {
            return this.f71230d;
        }

        @Override // p000.OF8
        public final boolean zze() {
            return false;
        }
    }

    /* renamed from: com.google.android.gms.internal.vision.G$f */
    /* loaded from: classes6.dex */
    public enum C17560f {

        /* renamed from: a */
        public static final int f71231a = 1;

        /* renamed from: b */
        public static final int f71232b = 2;

        /* renamed from: c */
        public static final int f71233c = 3;

        /* renamed from: d */
        public static final int f71234d = 4;

        /* renamed from: e */
        public static final int f71235e = 5;

        /* renamed from: f */
        public static final int f71236f = 6;

        /* renamed from: g */
        public static final int f71237g = 7;

        /* renamed from: h */
        public static final /* synthetic */ int[] f71238h = {1, 2, 3, 4, 5, 6, 7};

        /* renamed from: a */
        public static int[] m50967a() {
            return (int[]) f71238h.clone();
        }
    }

    /* renamed from: j */
    public static <T extends AbstractC17554G<?, ?>> T m50992j(Class<T> cls) {
        AbstractC17554G<?, ?> abstractC17554G = zzd.get(cls);
        if (abstractC17554G == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC17554G = zzd.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (abstractC17554G == null) {
            abstractC17554G = (T) ((AbstractC17554G) SZ8.m85261c(cls)).mo50854l(C17560f.f71236f, null, null);
            if (abstractC17554G != null) {
                zzd.put(cls, abstractC17554G);
            } else {
                throw new IllegalStateException();
            }
        }
        return (T) abstractC17554G;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public static Object m50991m(Method method, Object obj, Object... objArr) {
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

    /* renamed from: n */
    public static Object m50990n(InterfaceC44489lQ8 interfaceC44489lQ8, String str, Object[] objArr) {
        return new C39171cU8(interfaceC44489lQ8, str, objArr);
    }

    /* renamed from: o */
    public static <E> RJ8<E> m50989o(RJ8<E> rj8) {
        int i;
        int size = rj8.size();
        if (size == 0) {
            i = 10;
        } else {
            i = size << 1;
        }
        return rj8.zza(i);
    }

    /* renamed from: p */
    public static <T extends AbstractC17554G<?, ?>> void m50988p(Class<T> cls, T t) {
        zzd.put(cls, t);
    }

    /* renamed from: q */
    public static final <T extends AbstractC17554G<T, ?>> boolean m50987q(T t, boolean z) {
        Object obj;
        byte byteValue = ((Byte) t.mo50854l(C17560f.f71231a, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean mo1314a = C40365eT8.m42854a().m42852c(t).mo1314a(t);
        if (z) {
            int i = C17560f.f71232b;
            if (mo1314a) {
                obj = t;
            } else {
                obj = null;
            }
            t.mo50854l(i, obj, null);
        }
        return mo1314a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [aI8, uJ8] */
    /* renamed from: s */
    public static InterfaceC49762uJ8 m50985s() {
        return C37877aI8.m71671e();
    }

    /* renamed from: t */
    public static <E> RJ8<E> m50984t() {
        return C46304oU8.m20985e();
    }

    @Override // p000.HQ8
    /* renamed from: a */
    public final boolean mo50995a() {
        return m50987q(this, true);
    }

    @Override // p000.InterfaceC44489lQ8
    /* renamed from: b */
    public final int mo27298b() {
        if (this.zzc == -1) {
            this.zzc = C40365eT8.m42854a().m42852c(this).zzb(this);
        }
        return this.zzc;
    }

    @Override // p000.InterfaceC44489lQ8
    /* renamed from: d */
    public final /* synthetic */ SQ8 mo27297d() {
        AbstractC17556b abstractC17556b = (AbstractC17556b) mo50854l(C17560f.f71235e, null, null);
        abstractC17556b.mo50982g(this);
        return abstractC17556b;
    }

    @Override // p000.InterfaceC44489lQ8
    /* renamed from: e */
    public final void mo27296e(zzii zziiVar) throws IOException {
        C40365eT8.m42854a().m42852c(this).mo1313b(this, C46151oD8.m21601N(zziiVar));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return C40365eT8.m42854a().m42852c(this).mo1312c(this, (AbstractC17554G) obj);
    }

    @Override // com.google.android.gms.internal.vision.AbstractC17549C
    /* renamed from: f */
    public final void mo50994f(int i) {
        this.zzc = i;
    }

    @Override // p000.InterfaceC44489lQ8
    /* renamed from: h */
    public final /* synthetic */ SQ8 mo27295h() {
        return (AbstractC17556b) mo50854l(C17560f.f71235e, null, null);
    }

    public int hashCode() {
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int zza = C40365eT8.m42854a().m42852c(this).zza(this);
        this.zza = zza;
        return zza;
    }

    @Override // com.google.android.gms.internal.vision.AbstractC17549C
    /* renamed from: i */
    final int mo50993i() {
        return this.zzc;
    }

    @Override // p000.HQ8
    /* renamed from: k */
    public final /* synthetic */ InterfaceC44489lQ8 mo50980k() {
        return (AbstractC17554G) mo50854l(C17560f.f71236f, null, null);
    }

    /* renamed from: l */
    public abstract Object mo50854l(int i, Object obj, Object obj2);

    /* renamed from: r */
    public final <MessageType extends AbstractC17554G<MessageType, BuilderType>, BuilderType extends AbstractC17556b<MessageType, BuilderType>> BuilderType m50986r() {
        return (BuilderType) mo50854l(C17560f.f71235e, null, null);
    }

    public String toString() {
        return C17562I.m50926b(this, super.toString());
    }
}
