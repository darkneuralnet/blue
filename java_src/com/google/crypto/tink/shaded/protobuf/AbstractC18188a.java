package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.AbstractC18188a;
import com.google.crypto.tink.shaded.protobuf.AbstractC18188a.AbstractC18189a;
import com.google.crypto.tink.shaded.protobuf.AbstractC18199g;
import com.google.crypto.tink.shaded.protobuf.InterfaceC18149F;
import java.io.IOException;
/* renamed from: com.google.crypto.tink.shaded.protobuf.a */
/* loaded from: classes6.dex */
public abstract class AbstractC18188a<MessageType extends AbstractC18188a<MessageType, BuilderType>, BuilderType extends AbstractC18189a<MessageType, BuilderType>> implements InterfaceC18149F {
    protected int memoizedHashCode = 0;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.a$a */
    /* loaded from: classes6.dex */
    public static abstract class AbstractC18189a<MessageType extends AbstractC18188a<MessageType, BuilderType>, BuilderType extends AbstractC18189a<MessageType, BuilderType>> implements InterfaceC18149F.InterfaceC18150a {
        /* renamed from: k */
        public static UninitializedMessageException m47791k(InterfaceC18149F interfaceC18149F) {
            return new UninitializedMessageException(interfaceC18149F);
        }

        @Override // 
        /* renamed from: g */
        public abstract BuilderType clone();

        /* renamed from: h */
        public abstract BuilderType mo47454h(MessageType messagetype);

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18149F.InterfaceC18150a
        /* renamed from: j */
        public BuilderType mo47793f3(InterfaceC18149F interfaceC18149F) {
            if (getDefaultInstanceForType().getClass().isInstance(interfaceC18149F)) {
                return (BuilderType) mo47454h((AbstractC18188a) interfaceC18149F);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
    }

    /* renamed from: a */
    int mo47476a() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public int m47798b(InterfaceC18157M interfaceC18157M) {
        int mo47476a = mo47476a();
        if (mo47476a == -1) {
            int mo47987h = interfaceC18157M.mo47987h(this);
            mo47474h(mo47987h);
            return mo47987h;
        }
        return mo47476a;
    }

    /* renamed from: c */
    public final String m47797c(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18149F
    /* renamed from: d */
    public AbstractC18199g mo47796d() {
        try {
            AbstractC18199g.C18207h m47695w = AbstractC18199g.m47695w(getSerializedSize());
            mo47475f(m47695w.m47690b());
            return m47695w.m47691a();
        } catch (IOException e) {
            throw new RuntimeException(m47797c("ByteString"), e);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18149F
    /* renamed from: e */
    public byte[] mo47795e() {
        try {
            byte[] bArr = new byte[getSerializedSize()];
            CodedOutputStream m48157d0 = CodedOutputStream.m48157d0(bArr);
            mo47475f(m48157d0);
            m48157d0.m48160c();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException(m47797c("byte array"), e);
        }
    }

    /* renamed from: g */
    public UninitializedMessageException m47794g() {
        return new UninitializedMessageException(this);
    }

    /* renamed from: h */
    void mo47474h(int i) {
        throw new UnsupportedOperationException();
    }
}
