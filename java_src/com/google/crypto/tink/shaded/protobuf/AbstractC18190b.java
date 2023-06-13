package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.InterfaceC18149F;
/* renamed from: com.google.crypto.tink.shaded.protobuf.b */
/* loaded from: classes6.dex */
public abstract class AbstractC18190b<MessageType extends InterfaceC18149F> implements WH3<MessageType> {

    /* renamed from: a */
    public static final C18219m f74125a = C18219m.m47528b();

    /* renamed from: c */
    public final MessageType m47789c(MessageType messagetype) throws InvalidProtocolBufferException {
        if (messagetype != null && !messagetype.isInitialized()) {
            throw m47788d(messagetype).m47799a().m48002j(messagetype);
        }
        return messagetype;
    }

    /* renamed from: d */
    public final UninitializedMessageException m47788d(MessageType messagetype) {
        if (messagetype instanceof AbstractC18188a) {
            return ((AbstractC18188a) messagetype).m47794g();
        }
        return new UninitializedMessageException(messagetype);
    }

    @Override // p000.WH3
    /* renamed from: e */
    public MessageType mo47790a(AbstractC18199g abstractC18199g, C18219m c18219m) throws InvalidProtocolBufferException {
        return m47789c(m47786f(abstractC18199g, c18219m));
    }

    /* renamed from: f */
    public MessageType m47786f(AbstractC18199g abstractC18199g, C18219m c18219m) throws InvalidProtocolBufferException {
        AbstractC18211h mo47680x = abstractC18199g.mo47680x();
        MessageType messagetype = (MessageType) mo47444b(mo47680x, c18219m);
        try {
            mo47680x.mo47656a(0);
            return messagetype;
        } catch (InvalidProtocolBufferException e) {
            throw e.m48002j(messagetype);
        }
    }
}
