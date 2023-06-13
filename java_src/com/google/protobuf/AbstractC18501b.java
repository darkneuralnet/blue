package com.google.protobuf;

import com.google.protobuf.InterfaceC18462D;
/* renamed from: com.google.protobuf.b */
/* loaded from: classes6.dex */
public abstract class AbstractC18501b<MessageType extends InterfaceC18462D> implements VH3<MessageType> {

    /* renamed from: a */
    public static final C18525k f74792a = C18525k.m46121b();

    /* renamed from: c */
    public final MessageType m46325c(MessageType messagetype) throws InvalidProtocolBufferException {
        if (messagetype != null && !messagetype.isInitialized()) {
            throw m46324d(messagetype).m46337a().m46529j(messagetype);
        }
        return messagetype;
    }

    /* renamed from: d */
    public final UninitializedMessageException m46324d(MessageType messagetype) {
        if (messagetype instanceof AbstractC18499a) {
            return ((AbstractC18499a) messagetype).m46333m();
        }
        return new UninitializedMessageException(messagetype);
    }

    @Override // p000.VH3
    /* renamed from: e */
    public MessageType mo46326a(AbstractC18504e abstractC18504e, C18525k c18525k) throws InvalidProtocolBufferException {
        return m46325c(m46322f(abstractC18504e, c18525k));
    }

    /* renamed from: f */
    public MessageType m46322f(AbstractC18504e abstractC18504e, C18525k c18525k) throws InvalidProtocolBufferException {
        AbstractC18516f mo46281w = abstractC18504e.mo46281w();
        MessageType messagetype = (MessageType) mo46021b(mo46281w, c18525k);
        try {
            mo46281w.mo46256a(0);
            return messagetype;
        } catch (InvalidProtocolBufferException e) {
            throw e.m46529j(messagetype);
        }
    }
}
