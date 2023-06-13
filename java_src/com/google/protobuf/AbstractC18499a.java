package com.google.protobuf;

import com.google.protobuf.AbstractC18499a;
import com.google.protobuf.AbstractC18499a.AbstractC18500a;
import com.google.protobuf.AbstractC18504e;
import com.google.protobuf.InterfaceC18462D;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* renamed from: com.google.protobuf.a */
/* loaded from: classes6.dex */
public abstract class AbstractC18499a<MessageType extends AbstractC18499a<MessageType, BuilderType>, BuilderType extends AbstractC18500a<MessageType, BuilderType>> implements InterfaceC18462D {
    protected int memoizedHashCode = 0;

    /* renamed from: com.google.protobuf.a$a */
    /* loaded from: classes6.dex */
    public static abstract class AbstractC18500a<MessageType extends AbstractC18499a<MessageType, BuilderType>, BuilderType extends AbstractC18500a<MessageType, BuilderType>> implements InterfaceC18462D.InterfaceC18463a {
        /* renamed from: m */
        public static <T> void m46330m(Iterable<T> iterable, List<? super T> list) {
            C18544t.m46000a(iterable);
            if (iterable instanceof InterfaceC35017Oo2) {
                List<?> underlyingElements = ((InterfaceC35017Oo2) iterable).getUnderlyingElements();
                InterfaceC35017Oo2 interfaceC35017Oo2 = (InterfaceC35017Oo2) list;
                int size = list.size();
                for (Object obj : underlyingElements) {
                    if (obj == null) {
                        String str = "Element at index " + (interfaceC35017Oo2.size() - size) + " is null.";
                        for (int size2 = interfaceC35017Oo2.size() - 1; size2 >= size; size2--) {
                            interfaceC35017Oo2.remove(size2);
                        }
                        throw new NullPointerException(str);
                    } else if (obj instanceof AbstractC18504e) {
                        interfaceC35017Oo2.mo13910P((AbstractC18504e) obj);
                    } else {
                        interfaceC35017Oo2.add((String) obj);
                    }
                }
            } else if (iterable instanceof F24) {
                list.addAll((Collection) iterable);
            } else {
                m46329n(iterable, list);
            }
        }

        /* renamed from: n */
        public static <T> void m46329n(Iterable<T> iterable, List<? super T> list) {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size = list.size();
            for (T t : iterable) {
                if (t == null) {
                    String str = "Element at index " + (list.size() - size) + " is null.";
                    for (int size2 = list.size() - 1; size2 >= size; size2--) {
                        list.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                list.add(t);
            }
        }

        /* renamed from: t */
        public static UninitializedMessageException m46327t(InterfaceC18462D interfaceC18462D) {
            return new UninitializedMessageException(interfaceC18462D);
        }

        @Override // 
        /* renamed from: o */
        public abstract BuilderType clone();

        /* renamed from: p */
        public abstract BuilderType mo46026p(MessageType messagetype);

        @Override // com.google.protobuf.InterfaceC18462D.InterfaceC18463a
        /* renamed from: q */
        public abstract BuilderType mo46028l2(AbstractC18516f abstractC18516f, C18525k c18525k) throws IOException;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.protobuf.InterfaceC18462D.InterfaceC18463a
        /* renamed from: r */
        public BuilderType mo46331j0(InterfaceC18462D interfaceC18462D) {
            if (getDefaultInstanceForType().getClass().isInstance(interfaceC18462D)) {
                return (BuilderType) mo46026p((AbstractC18499a) interfaceC18462D);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
    }

    /* renamed from: a */
    public static <T> void m46336a(Iterable<T> iterable, List<? super T> list) {
        AbstractC18500a.m46330m(iterable, list);
    }

    /* renamed from: i */
    private String m46334i(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    /* renamed from: b */
    int mo46051b() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: c */
    public int mo46050c(InterfaceC33832Jm5 interfaceC33832Jm5) {
        int mo46051b = mo46051b();
        if (mo46051b == -1) {
            int mo46550h = interfaceC33832Jm5.mo46550h(this);
            mo46048n(mo46550h);
            return mo46550h;
        }
        return mo46051b;
    }

    @Override // com.google.protobuf.InterfaceC18462D
    /* renamed from: d */
    public AbstractC18504e mo46335d() {
        try {
            AbstractC18504e.C18512h m46295v = AbstractC18504e.m46295v(getSerializedSize());
            mo46049f(m46295v.m46290b());
            return m46295v.m46291a();
        } catch (IOException e) {
            throw new RuntimeException(m46334i("ByteString"), e);
        }
    }

    /* renamed from: m */
    public UninitializedMessageException m46333m() {
        return new UninitializedMessageException(this);
    }

    /* renamed from: n */
    void mo46048n(int i) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: o */
    public byte[] m46332o() {
        try {
            byte[] bArr = new byte[getSerializedSize()];
            CodedOutputStream m46690c0 = CodedOutputStream.m46690c0(bArr);
            mo46049f(m46690c0);
            m46690c0.m46691c();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException(m46334i("byte array"), e);
        }
    }
}
