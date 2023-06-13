package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.AbstractC18188a;
import com.google.crypto.tink.shaded.protobuf.AbstractC18230t;
import com.google.crypto.tink.shaded.protobuf.AbstractC18230t.AbstractC18231a;
import com.google.crypto.tink.shaded.protobuf.C18178U;
import com.google.crypto.tink.shaded.protobuf.C18192d;
import com.google.crypto.tink.shaded.protobuf.C18225q;
import com.google.crypto.tink.shaded.protobuf.C18238v;
import com.google.crypto.tink.shaded.protobuf.InterfaceC18149F;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* renamed from: com.google.crypto.tink.shaded.protobuf.t */
/* loaded from: classes6.dex */
public abstract class AbstractC18230t<MessageType extends AbstractC18230t<MessageType, BuilderType>, BuilderType extends AbstractC18231a<MessageType, BuilderType>> extends AbstractC18188a<MessageType, BuilderType> {
    private static Map<Object, AbstractC18230t<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    protected C18170Q unknownFields = C18170Q.m47894c();
    protected int memoizedSerializedSize = -1;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.t$a */
    /* loaded from: classes6.dex */
    public static abstract class AbstractC18231a<MessageType extends AbstractC18230t<MessageType, BuilderType>, BuilderType extends AbstractC18231a<MessageType, BuilderType>> extends AbstractC18188a.AbstractC18189a<MessageType, BuilderType> {

        /* renamed from: b */
        public final MessageType f74195b;

        /* renamed from: c */
        public MessageType f74196c;

        /* renamed from: d */
        public boolean f74197d = false;

        public AbstractC18231a(MessageType messagetype) {
            this.f74195b = messagetype;
            this.f74196c = (MessageType) messagetype.m47470l(EnumC18236f.NEW_MUTABLE_INSTANCE);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18149F.InterfaceC18150a
        /* renamed from: l */
        public final MessageType build() {
            MessageType mo47456E = mo47456E();
            if (mo47456E.isInitialized()) {
                return mo47456E;
            }
            throw AbstractC18188a.AbstractC18189a.m47791k(mo47456E);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18149F.InterfaceC18150a
        /* renamed from: m */
        public MessageType mo47456E() {
            if (this.f74197d) {
                return this.f74196c;
            }
            this.f74196c.m47463t();
            this.f74197d = true;
            return this.f74196c;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18188a.AbstractC18189a
        /* renamed from: n */
        public BuilderType mo47455g() {
            BuilderType buildertype = (BuilderType) getDefaultInstanceForType().newBuilderForType();
            buildertype.m47446t(mo47456E());
            return buildertype;
        }

        /* renamed from: o */
        public final void m47450o() {
            if (this.f74197d) {
                m47449p();
                this.f74197d = false;
            }
        }

        /* renamed from: p */
        public void m47449p() {
            MessageType messagetype = (MessageType) this.f74196c.m47470l(EnumC18236f.NEW_MUTABLE_INSTANCE);
            m47445w(messagetype, this.f74196c);
            this.f74196c = messagetype;
        }

        @Override // p000.InterfaceC51624xT2
        /* renamed from: q */
        public MessageType getDefaultInstanceForType() {
            return this.f74195b;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18188a.AbstractC18189a
        /* renamed from: r */
        public BuilderType mo47454h(MessageType messagetype) {
            return m47446t(messagetype);
        }

        /* renamed from: t */
        public BuilderType m47446t(MessageType messagetype) {
            m47450o();
            m47445w(this.f74196c, messagetype);
            return this;
        }

        /* renamed from: w */
        public final void m47445w(MessageType messagetype, MessageType messagetype2) {
            M94.m95655a().m95651e(messagetype).mo47992c(messagetype, messagetype2);
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.t$b */
    /* loaded from: classes6.dex */
    public static class C18232b<T extends AbstractC18230t<T, ?>> extends AbstractC18190b<T> {

        /* renamed from: b */
        public final T f74198b;

        public C18232b(T t) {
            this.f74198b = t;
        }

        @Override // p000.WH3
        /* renamed from: g */
        public T mo47444b(AbstractC18211h abstractC18211h, C18219m c18219m) throws InvalidProtocolBufferException {
            return (T) AbstractC18230t.m47480A(this.f74198b, abstractC18211h, c18219m);
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.t$c */
    /* loaded from: classes6.dex */
    public static abstract class AbstractC18233c<MessageType extends AbstractC18233c<MessageType, BuilderType>, BuilderType> extends AbstractC18230t<MessageType, BuilderType> implements InterfaceC51624xT2 {
        protected C18225q<C18234d> extensions = C18225q.m47510h();

        /* renamed from: F */
        public C18225q<C18234d> m47442F() {
            if (this.extensions.m47504n()) {
                this.extensions = this.extensions.clone();
            }
            return this.extensions;
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.t$d */
    /* loaded from: classes6.dex */
    public static final class C18234d implements C18225q.InterfaceC18227b<C18234d> {

        /* renamed from: b */
        public final C18238v.InterfaceC18242d<?> f74199b;

        /* renamed from: c */
        public final int f74200c;

        /* renamed from: d */
        public final C18178U.EnumC18180b f74201d;

        /* renamed from: e */
        public final boolean f74202e;

        /* renamed from: f */
        public final boolean f74203f;

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(C18234d c18234d) {
            return this.f74200c - c18234d.f74200c;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.crypto.tink.shaded.protobuf.C18225q.InterfaceC18227b
        /* renamed from: a0 */
        public InterfaceC18149F.InterfaceC18150a mo47440a0(InterfaceC18149F.InterfaceC18150a interfaceC18150a, InterfaceC18149F interfaceC18149F) {
            return ((AbstractC18231a) interfaceC18150a).m47446t((AbstractC18230t) interfaceC18149F);
        }

        /* renamed from: b */
        public C18238v.InterfaceC18242d<?> m47439b() {
            return this.f74199b;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C18225q.InterfaceC18227b
        public C18178U.EnumC18185c getLiteJavaType() {
            return this.f74201d.m47800a();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C18225q.InterfaceC18227b
        public C18178U.EnumC18180b getLiteType() {
            return this.f74201d;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C18225q.InterfaceC18227b
        public int getNumber() {
            return this.f74200c;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C18225q.InterfaceC18227b
        public boolean isPacked() {
            return this.f74203f;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C18225q.InterfaceC18227b
        public boolean isRepeated() {
            return this.f74202e;
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.t$e */
    /* loaded from: classes6.dex */
    public static class C18235e<ContainingType extends InterfaceC18149F, Type> extends AbstractC18218l<ContainingType, Type> {

        /* renamed from: a */
        public final InterfaceC18149F f74204a;

        /* renamed from: b */
        public final C18234d f74205b;

        /* renamed from: a */
        public C18178U.EnumC18180b m47438a() {
            return this.f74205b.getLiteType();
        }

        /* renamed from: b */
        public InterfaceC18149F m47437b() {
            return this.f74204a;
        }

        /* renamed from: c */
        public int m47436c() {
            return this.f74205b.getNumber();
        }

        /* renamed from: d */
        public boolean m47435d() {
            return this.f74205b.f74202e;
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.t$f */
    /* loaded from: classes6.dex */
    public enum EnumC18236f {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    /* renamed from: A */
    public static <T extends AbstractC18230t<T, ?>> T m47480A(T t, AbstractC18211h abstractC18211h, C18219m c18219m) throws InvalidProtocolBufferException {
        T t2 = (T) t.m47470l(EnumC18236f.NEW_MUTABLE_INSTANCE);
        try {
            InterfaceC18157M m95651e = M94.m95655a().m95651e(t2);
            m95651e.mo47986i(t2, C18214i.m47619Q(abstractC18211h), c18219m);
            m95651e.mo47988g(t2);
            return t2;
        } catch (InvalidProtocolBufferException e) {
            e = e;
            if (e.m48011a()) {
                e = new InvalidProtocolBufferException(e);
            }
            throw e.m48002j(t2);
        } catch (IOException e2) {
            if (e2.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e2.getCause());
            }
            throw new InvalidProtocolBufferException(e2).m48002j(t2);
        } catch (RuntimeException e3) {
            if (e3.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e3.getCause());
            }
            throw e3;
        }
    }

    /* renamed from: B */
    public static <T extends AbstractC18230t<T, ?>> T m47479B(T t, byte[] bArr, int i, int i2, C18219m c18219m) throws InvalidProtocolBufferException {
        T t2 = (T) t.m47470l(EnumC18236f.NEW_MUTABLE_INSTANCE);
        try {
            InterfaceC18157M m95651e = M94.m95655a().m95651e(t2);
            m95651e.mo47994a(t2, bArr, i, i + i2, new C18192d.C18194b(c18219m));
            m95651e.mo47988g(t2);
            if (t2.memoizedHashCode == 0) {
                return t2;
            }
            throw new RuntimeException();
        } catch (InvalidProtocolBufferException e) {
            e = e;
            if (e.m48011a()) {
                e = new InvalidProtocolBufferException(e);
            }
            throw e.m48002j(t2);
        } catch (IOException e2) {
            if (e2.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e2.getCause());
            }
            throw new InvalidProtocolBufferException(e2).m48002j(t2);
        } catch (IndexOutOfBoundsException unused) {
            throw InvalidProtocolBufferException.m48001k().m48002j(t2);
        }
    }

    /* renamed from: C */
    public static <T extends AbstractC18230t<?, ?>> void m47478C(Class<T> cls, T t) {
        defaultInstanceMap.put(cls, t);
    }

    /* renamed from: j */
    public static <T extends AbstractC18230t<T, ?>> T m47472j(T t) throws InvalidProtocolBufferException {
        if (t != null && !t.isInitialized()) {
            throw t.m47794g().m47799a().m48002j(t);
        }
        return t;
    }

    /* renamed from: o */
    public static <E> C18238v.InterfaceC18247i<E> m47468o() {
        return C18155K.m47998c();
    }

    /* renamed from: p */
    public static <T extends AbstractC18230t<?, ?>> T m47467p(Class<T> cls) {
        AbstractC18230t<?, ?> abstractC18230t = defaultInstanceMap.get(cls);
        if (abstractC18230t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC18230t = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (abstractC18230t == null) {
            abstractC18230t = (T) ((AbstractC18230t) C52917ze6.m904k(cls)).getDefaultInstanceForType();
            if (abstractC18230t != null) {
                defaultInstanceMap.put(cls, abstractC18230t);
            } else {
                throw new IllegalStateException();
            }
        }
        return (T) abstractC18230t;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public static Object m47465r(Method method, Object obj, Object... objArr) {
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

    /* renamed from: s */
    public static final <T extends AbstractC18230t<T, ?>> boolean m47464s(T t, boolean z) {
        Object obj;
        byte byteValue = ((Byte) t.m47470l(EnumC18236f.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean mo47989f = M94.m95655a().m95651e(t).mo47989f(t);
        if (z) {
            EnumC18236f enumC18236f = EnumC18236f.SET_MEMOIZED_IS_INITIALIZED;
            if (mo47989f) {
                obj = t;
            } else {
                obj = null;
            }
            t.m47469m(enumC18236f, obj);
        }
        return mo47989f;
    }

    /* renamed from: u */
    public static <E> C18238v.InterfaceC18247i<E> m47462u(C18238v.InterfaceC18247i<E> interfaceC18247i) {
        int i;
        int size = interfaceC18247i.size();
        if (size == 0) {
            i = 10;
        } else {
            i = size * 2;
        }
        return interfaceC18247i.mo47397k(i);
    }

    /* renamed from: w */
    public static Object m47460w(InterfaceC18149F interfaceC18149F, String str, Object[] objArr) {
        return new C48855sn4(interfaceC18149F, str, objArr);
    }

    /* renamed from: x */
    public static <T extends AbstractC18230t<T, ?>> T m47459x(T t, AbstractC18199g abstractC18199g, C18219m c18219m) throws InvalidProtocolBufferException {
        return (T) m47472j(m47457z(t, abstractC18199g, c18219m));
    }

    /* renamed from: y */
    public static <T extends AbstractC18230t<T, ?>> T m47458y(T t, byte[] bArr, C18219m c18219m) throws InvalidProtocolBufferException {
        return (T) m47472j(m47479B(t, bArr, 0, bArr.length, c18219m));
    }

    /* renamed from: z */
    public static <T extends AbstractC18230t<T, ?>> T m47457z(T t, AbstractC18199g abstractC18199g, C18219m c18219m) throws InvalidProtocolBufferException {
        AbstractC18211h mo47680x = abstractC18199g.mo47680x();
        T t2 = (T) m47480A(t, mo47680x, c18219m);
        try {
            mo47680x.mo47656a(0);
            return t2;
        } catch (InvalidProtocolBufferException e) {
            throw e.m48002j(t2);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18149F
    /* renamed from: D */
    public final BuilderType toBuilder() {
        BuilderType buildertype = (BuilderType) m47470l(EnumC18236f.NEW_BUILDER);
        buildertype.m47446t(this);
        return buildertype;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18188a
    /* renamed from: a */
    int mo47476a() {
        return this.memoizedSerializedSize;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return M94.m95655a().m95651e(this).mo47993b(this, (AbstractC18230t) obj);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18149F
    /* renamed from: f */
    public void mo47475f(CodedOutputStream codedOutputStream) throws IOException {
        M94.m95655a().m95651e(this).mo47985j(this, C18215j.m47570P(codedOutputStream));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18149F
    public final WH3<MessageType> getParserForType() {
        return (WH3) m47470l(EnumC18236f.GET_PARSER);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18149F
    public int getSerializedSize() {
        if (this.memoizedSerializedSize == -1) {
            this.memoizedSerializedSize = M94.m95655a().m95651e(this).mo47987h(this);
        }
        return this.memoizedSerializedSize;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18188a
    /* renamed from: h */
    void mo47474h(int i) {
        this.memoizedSerializedSize = i;
    }

    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int mo47990e = M94.m95655a().m95651e(this).mo47990e(this);
        this.memoizedHashCode = mo47990e;
        return mo47990e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public Object m47473i() throws Exception {
        return m47470l(EnumC18236f.BUILD_MESSAGE_INFO);
    }

    @Override // p000.InterfaceC51624xT2
    public final boolean isInitialized() {
        return m47464s(this, true);
    }

    /* renamed from: k */
    public final <MessageType extends AbstractC18230t<MessageType, BuilderType>, BuilderType extends AbstractC18231a<MessageType, BuilderType>> BuilderType m47471k() {
        return (BuilderType) m47470l(EnumC18236f.NEW_BUILDER);
    }

    /* renamed from: l */
    public Object m47470l(EnumC18236f enumC18236f) {
        return mo1559n(enumC18236f, null, null);
    }

    /* renamed from: m */
    public Object m47469m(EnumC18236f enumC18236f, Object obj) {
        return mo1559n(enumC18236f, obj, null);
    }

    /* renamed from: n */
    public abstract Object mo1559n(EnumC18236f enumC18236f, Object obj, Object obj2);

    @Override // p000.InterfaceC51624xT2
    /* renamed from: q */
    public final MessageType getDefaultInstanceForType() {
        return (MessageType) m47470l(EnumC18236f.GET_DEFAULT_INSTANCE);
    }

    /* renamed from: t */
    public void m47463t() {
        M94.m95655a().m95651e(this).mo47988g(this);
    }

    public String toString() {
        return C18151G.m48083e(this, super.toString());
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18149F
    /* renamed from: v */
    public final BuilderType newBuilderForType() {
        return (BuilderType) m47470l(EnumC18236f.NEW_BUILDER);
    }
}
