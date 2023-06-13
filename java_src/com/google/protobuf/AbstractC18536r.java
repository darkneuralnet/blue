package com.google.protobuf;

import com.google.protobuf.AbstractC18499a;
import com.google.protobuf.AbstractC18536r;
import com.google.protobuf.AbstractC18536r.AbstractC18537a;
import com.google.protobuf.C18489P;
import com.google.protobuf.C18531o;
import com.google.protobuf.C18544t;
import com.google.protobuf.InterfaceC18462D;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* renamed from: com.google.protobuf.r */
/* loaded from: classes6.dex */
public abstract class AbstractC18536r<MessageType extends AbstractC18536r<MessageType, BuilderType>, BuilderType extends AbstractC18537a<MessageType, BuilderType>> extends AbstractC18499a<MessageType, BuilderType> {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, AbstractC18536r<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected C18481M unknownFields = C18481M.m46437c();

    /* renamed from: com.google.protobuf.r$a */
    /* loaded from: classes6.dex */
    public static abstract class AbstractC18537a<MessageType extends AbstractC18536r<MessageType, BuilderType>, BuilderType extends AbstractC18537a<MessageType, BuilderType>> extends AbstractC18499a.AbstractC18500a<MessageType, BuilderType> {

        /* renamed from: b */
        public final MessageType f74851b;

        /* renamed from: c */
        public MessageType f74852c;

        public AbstractC18537a(MessageType messagetype) {
            this.f74851b = messagetype;
            if (!messagetype.m46063H()) {
                this.f74852c = m46029J();
                return;
            }
            throw new IllegalArgumentException("Default instance must be immutable.");
        }

        /* renamed from: I */
        public static <MessageType> void m46030I(MessageType messagetype, MessageType messagetype2) {
            L94.m97649a().m97646d(messagetype).mo46555c(messagetype, messagetype2);
        }

        /* renamed from: J */
        private MessageType m46029J() {
            return (MessageType) this.f74851b.m46056O();
        }

        /* renamed from: A */
        public final void m46037A() {
            if (!this.f74852c.m46063H()) {
                m46036B();
            }
        }

        /* renamed from: B */
        public void m46036B() {
            MessageType m46029J = m46029J();
            m46030I(m46029J, this.f74852c);
            this.f74852c = m46029J;
        }

        @Override // p000.InterfaceC51031wT2
        /* renamed from: C */
        public MessageType getDefaultInstanceForType() {
            return this.f74851b;
        }

        @Override // com.google.protobuf.AbstractC18499a.AbstractC18500a
        /* renamed from: D */
        public BuilderType mo46026p(MessageType messagetype) {
            return m46031H(messagetype);
        }

        @Override // com.google.protobuf.AbstractC18499a.AbstractC18500a
        /* renamed from: G */
        public BuilderType mo46025q(AbstractC18516f abstractC18516f, C18525k c18525k) throws IOException {
            m46037A();
            try {
                L94.m97649a().m97646d(this.f74852c).mo46548j(this.f74852c, C18519g.m46219Q(abstractC18516f), c18525k);
                return this;
            } catch (RuntimeException e) {
                if (e.getCause() instanceof IOException) {
                    throw ((IOException) e.getCause());
                }
                throw e;
            }
        }

        /* renamed from: H */
        public BuilderType m46031H(MessageType messagetype) {
            if (getDefaultInstanceForType().equals(messagetype)) {
                return this;
            }
            m46037A();
            m46030I(this.f74852c, messagetype);
            return this;
        }

        @Override // p000.InterfaceC51031wT2
        public final boolean isInitialized() {
            return AbstractC18536r.m46064G(this.f74852c, false);
        }

        @Override // com.google.protobuf.InterfaceC18462D.InterfaceC18463a
        /* renamed from: w */
        public final MessageType build() {
            MessageType mo46033E = mo46033E();
            if (mo46033E.isInitialized()) {
                return mo46033E;
            }
            throw AbstractC18499a.AbstractC18500a.m46327t(mo46033E);
        }

        @Override // com.google.protobuf.InterfaceC18462D.InterfaceC18463a
        /* renamed from: y */
        public MessageType mo46033E() {
            if (!this.f74852c.m46063H()) {
                return this.f74852c;
            }
            this.f74852c.m46062I();
            return this.f74852c;
        }

        @Override // com.google.protobuf.AbstractC18499a.AbstractC18500a
        /* renamed from: z */
        public BuilderType mo46027o() {
            BuilderType buildertype = (BuilderType) getDefaultInstanceForType().newBuilderForType();
            buildertype.f74852c = mo46033E();
            return buildertype;
        }
    }

    /* renamed from: com.google.protobuf.r$b */
    /* loaded from: classes6.dex */
    public static class C18538b<T extends AbstractC18536r<T, ?>> extends AbstractC18501b<T> {

        /* renamed from: b */
        public final T f74853b;

        public C18538b(T t) {
            this.f74853b = t;
        }

        @Override // p000.VH3
        /* renamed from: g */
        public T mo46021b(AbstractC18516f abstractC18516f, C18525k c18525k) throws InvalidProtocolBufferException {
            return (T) AbstractC18536r.m46055P(this.f74853b, abstractC18516f, c18525k);
        }
    }

    /* renamed from: com.google.protobuf.r$c */
    /* loaded from: classes6.dex */
    public static abstract class AbstractC18539c<MessageType extends AbstractC18539c<MessageType, BuilderType>, BuilderType> extends AbstractC18536r<MessageType, BuilderType> implements InterfaceC51031wT2 {
        protected C18531o<C18540d> extensions = C18531o.m46101h();

        /* renamed from: T */
        public C18531o<C18540d> m46019T() {
            if (this.extensions.m46094o()) {
                this.extensions = this.extensions.clone();
            }
            return this.extensions;
        }

        @Override // com.google.protobuf.AbstractC18536r, p000.InterfaceC51031wT2
        public /* bridge */ /* synthetic */ InterfaceC18462D getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.google.protobuf.AbstractC18536r, com.google.protobuf.InterfaceC18462D
        public /* bridge */ /* synthetic */ InterfaceC18462D.InterfaceC18463a newBuilderForType() {
            return super.newBuilderForType();
        }

        @Override // com.google.protobuf.AbstractC18536r, com.google.protobuf.InterfaceC18462D
        public /* bridge */ /* synthetic */ InterfaceC18462D.InterfaceC18463a toBuilder() {
            return super.toBuilder();
        }
    }

    /* renamed from: com.google.protobuf.r$d */
    /* loaded from: classes6.dex */
    public static final class C18540d implements C18531o.InterfaceC18533b<C18540d> {

        /* renamed from: b */
        public final C18544t.InterfaceC18548d<?> f74854b;

        /* renamed from: c */
        public final int f74855c;

        /* renamed from: d */
        public final C18489P.EnumC18491b f74856d;

        /* renamed from: e */
        public final boolean f74857e;

        /* renamed from: f */
        public final boolean f74858f;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.protobuf.C18531o.InterfaceC18533b
        /* renamed from: S */
        public InterfaceC18462D.InterfaceC18463a mo46018S(InterfaceC18462D.InterfaceC18463a interfaceC18463a, InterfaceC18462D interfaceC18462D) {
            return ((AbstractC18537a) interfaceC18463a).m46031H((AbstractC18536r) interfaceC18462D);
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(C18540d c18540d) {
            return this.f74855c - c18540d.f74855c;
        }

        /* renamed from: b */
        public C18544t.InterfaceC18548d<?> m46016b() {
            return this.f74854b;
        }

        @Override // com.google.protobuf.C18531o.InterfaceC18533b
        public C18489P.EnumC18496c getLiteJavaType() {
            return this.f74856d.m46341b();
        }

        @Override // com.google.protobuf.C18531o.InterfaceC18533b
        public C18489P.EnumC18491b getLiteType() {
            return this.f74856d;
        }

        @Override // com.google.protobuf.C18531o.InterfaceC18533b
        public int getNumber() {
            return this.f74855c;
        }

        @Override // com.google.protobuf.C18531o.InterfaceC18533b
        public boolean isPacked() {
            return this.f74858f;
        }

        @Override // com.google.protobuf.C18531o.InterfaceC18533b
        public boolean isRepeated() {
            return this.f74857e;
        }
    }

    /* renamed from: com.google.protobuf.r$e */
    /* loaded from: classes6.dex */
    public static class C18541e<ContainingType extends InterfaceC18462D, Type> extends AbstractC18524j<ContainingType, Type> {

        /* renamed from: a */
        public final InterfaceC18462D f74859a;

        /* renamed from: b */
        public final C18540d f74860b;

        /* renamed from: a */
        public C18489P.EnumC18491b m46015a() {
            return this.f74860b.getLiteType();
        }

        /* renamed from: b */
        public InterfaceC18462D m46014b() {
            return this.f74859a;
        }

        /* renamed from: c */
        public int m46013c() {
            return this.f74860b.getNumber();
        }

        /* renamed from: d */
        public boolean m46012d() {
            return this.f74860b.f74857e;
        }
    }

    /* renamed from: com.google.protobuf.r$f */
    /* loaded from: classes6.dex */
    public enum EnumC18542f {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    /* renamed from: A */
    public static <T extends AbstractC18536r<?, ?>> T m46069A(Class<T> cls) {
        AbstractC18536r<?, ?> abstractC18536r = defaultInstanceMap.get(cls);
        if (abstractC18536r == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC18536r = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (abstractC18536r == null) {
            abstractC18536r = (T) ((AbstractC18536r) C52324ye6.m3077k(cls)).getDefaultInstanceForType();
            if (abstractC18536r != null) {
                defaultInstanceMap.put(cls, abstractC18536r);
            } else {
                throw new IllegalStateException();
            }
        }
        return (T) abstractC18536r;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F */
    public static Object m46065F(Method method, Object obj, Object... objArr) {
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

    /* renamed from: G */
    public static final <T extends AbstractC18536r<T, ?>> boolean m46064G(T t, boolean z) {
        Object obj;
        byte byteValue = ((Byte) t.m46041v(EnumC18542f.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean mo46552f = L94.m97649a().m97646d(t).mo46552f(t);
        if (z) {
            EnumC18542f enumC18542f = EnumC18542f.SET_MEMOIZED_IS_INITIALIZED;
            if (mo46552f) {
                obj = t;
            } else {
                obj = null;
            }
            t.m46040w(enumC18542f, obj);
        }
        return mo46552f;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.protobuf.t$g] */
    /* renamed from: K */
    public static C18544t.InterfaceC18551g m46060K(C18544t.InterfaceC18551g interfaceC18551g) {
        int i;
        int size = interfaceC18551g.size();
        if (size == 0) {
            i = 10;
        } else {
            i = size * 2;
        }
        return interfaceC18551g.mo45959k(i);
    }

    /* renamed from: L */
    public static <E> C18544t.InterfaceC18553i<E> m46059L(C18544t.InterfaceC18553i<E> interfaceC18553i) {
        int i;
        int size = interfaceC18553i.size();
        if (size == 0) {
            i = 10;
        } else {
            i = size * 2;
        }
        return interfaceC18553i.mo45959k(i);
    }

    /* renamed from: N */
    public static Object m46057N(InterfaceC18462D interfaceC18462D, String str, Object[] objArr) {
        return new C48263rn4(interfaceC18462D, str, objArr);
    }

    /* renamed from: P */
    public static <T extends AbstractC18536r<T, ?>> T m46055P(T t, AbstractC18516f abstractC18516f, C18525k c18525k) throws InvalidProtocolBufferException {
        T t2 = (T) t.m46056O();
        try {
            InterfaceC33832Jm5 m97646d = L94.m97649a().m97646d(t2);
            m97646d.mo46548j(t2, C18519g.m46219Q(abstractC18516f), c18525k);
            m97646d.mo46551g(t2);
            return t2;
        } catch (InvalidProtocolBufferException e) {
            e = e;
            if (e.m46538a()) {
                e = new InvalidProtocolBufferException(e);
            }
            throw e.m46529j(t2);
        } catch (UninitializedMessageException e2) {
            throw e2.m46337a().m46529j(t2);
        } catch (IOException e3) {
            if (e3.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e3.getCause());
            }
            throw new InvalidProtocolBufferException(e3).m46529j(t2);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e4.getCause());
            }
            throw e4;
        }
    }

    /* renamed from: Q */
    public static <T extends AbstractC18536r<?, ?>> void m46054Q(Class<T> cls, T t) {
        t.m46061J();
        defaultInstanceMap.put(cls, t);
    }

    /* renamed from: y */
    public static C18544t.InterfaceC18551g m46039y() {
        return C18543s.m46007f();
    }

    /* renamed from: z */
    public static <E> C18544t.InterfaceC18553i<E> m46038z() {
        return C18467H.m46542c();
    }

    @Override // p000.InterfaceC51031wT2
    /* renamed from: B */
    public final MessageType getDefaultInstanceForType() {
        return (MessageType) m46041v(EnumC18542f.GET_DEFAULT_INSTANCE);
    }

    /* renamed from: C */
    public int m46067C() {
        return this.memoizedHashCode;
    }

    /* renamed from: D */
    public boolean m46066D() {
        return m46067C() == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H */
    public boolean m46063H() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }

    /* renamed from: I */
    public void m46062I() {
        L94.m97649a().m97646d(this).mo46551g(this);
        m46061J();
    }

    /* renamed from: J */
    public void m46061J() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    @Override // com.google.protobuf.InterfaceC18462D
    /* renamed from: M */
    public final BuilderType newBuilderForType() {
        return (BuilderType) m46041v(EnumC18542f.NEW_BUILDER);
    }

    /* renamed from: O */
    public MessageType m46056O() {
        return (MessageType) m46041v(EnumC18542f.NEW_MUTABLE_INSTANCE);
    }

    /* renamed from: R */
    public void m46053R(int i) {
        this.memoizedHashCode = i;
    }

    @Override // com.google.protobuf.InterfaceC18462D
    /* renamed from: S */
    public final BuilderType toBuilder() {
        return (BuilderType) ((AbstractC18537a) m46041v(EnumC18542f.NEW_BUILDER)).m46031H(this);
    }

    @Override // com.google.protobuf.AbstractC18499a
    /* renamed from: b */
    int mo46051b() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    @Override // com.google.protobuf.AbstractC18499a
    /* renamed from: c */
    public int mo46050c(InterfaceC33832Jm5 interfaceC33832Jm5) {
        if (m46063H()) {
            int m46043t = m46043t(interfaceC33832Jm5);
            if (m46043t >= 0) {
                return m46043t;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + m46043t);
        } else if (mo46051b() != Integer.MAX_VALUE) {
            return mo46051b();
        } else {
            int m46043t2 = m46043t(interfaceC33832Jm5);
            mo46048n(m46043t2);
            return m46043t2;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return L94.m97649a().m97646d(this).mo46556b(this, (AbstractC18536r) obj);
    }

    @Override // com.google.protobuf.InterfaceC18462D
    /* renamed from: f */
    public void mo46049f(CodedOutputStream codedOutputStream) throws IOException {
        L94.m97649a().m97646d(this).mo46549i(this, C18521h.m46167P(codedOutputStream));
    }

    @Override // com.google.protobuf.InterfaceC18462D
    public final VH3<MessageType> getParserForType() {
        return (VH3) m46041v(EnumC18542f.GET_PARSER);
    }

    @Override // com.google.protobuf.InterfaceC18462D
    public int getSerializedSize() {
        return mo46050c(null);
    }

    public int hashCode() {
        if (m46063H()) {
            return m46044s();
        }
        if (m46066D()) {
            m46053R(m46044s());
        }
        return m46067C();
    }

    @Override // p000.InterfaceC51031wT2
    public final boolean isInitialized() {
        return m46064G(this, true);
    }

    @Override // com.google.protobuf.AbstractC18499a
    /* renamed from: n */
    void mo46048n(int i) {
        if (i >= 0) {
            this.memoizedSerializedSize = (i & Integer.MAX_VALUE) | (this.memoizedSerializedSize & Integer.MIN_VALUE);
            return;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public Object m46047p() throws Exception {
        return m46041v(EnumC18542f.BUILD_MESSAGE_INFO);
    }

    /* renamed from: q */
    public void m46046q() {
        this.memoizedHashCode = 0;
    }

    /* renamed from: r */
    public void m46045r() {
        mo46048n(Integer.MAX_VALUE);
    }

    /* renamed from: s */
    public int m46044s() {
        return L94.m97649a().m97646d(this).mo46553e(this);
    }

    /* renamed from: t */
    public final int m46043t(InterfaceC33832Jm5<?> interfaceC33832Jm5) {
        if (interfaceC33832Jm5 == null) {
            return L94.m97649a().m97646d(this).mo46550h(this);
        }
        return interfaceC33832Jm5.mo46550h(this);
    }

    public String toString() {
        return C18464E.m46622f(this, super.toString());
    }

    /* renamed from: u */
    public final <MessageType extends AbstractC18536r<MessageType, BuilderType>, BuilderType extends AbstractC18537a<MessageType, BuilderType>> BuilderType m46042u() {
        return (BuilderType) m46041v(EnumC18542f.NEW_BUILDER);
    }

    /* renamed from: v */
    public Object m46041v(EnumC18542f enumC18542f) {
        return mo23798x(enumC18542f, null, null);
    }

    /* renamed from: w */
    public Object m46040w(EnumC18542f enumC18542f, Object obj) {
        return mo23798x(enumC18542f, obj, null);
    }

    /* renamed from: x */
    public abstract Object mo23798x(EnumC18542f enumC18542f, Object obj, Object obj2);
}
