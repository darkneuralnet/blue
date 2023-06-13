package com.google.protobuf;

import java.util.List;
/* loaded from: classes6.dex */
public class UninitializedMessageException extends RuntimeException {
    private static final long serialVersionUID = -7466929953374883507L;

    /* renamed from: b */
    public final List<String> f74791b;

    public UninitializedMessageException(InterfaceC18462D interfaceC18462D) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.f74791b = null;
    }

    /* renamed from: a */
    public InvalidProtocolBufferException m46337a() {
        return new InvalidProtocolBufferException(getMessage());
    }
}
