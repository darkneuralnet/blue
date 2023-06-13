package com.google.crypto.tink.shaded.protobuf;

import java.util.List;
/* loaded from: classes6.dex */
public class UninitializedMessageException extends RuntimeException {
    private static final long serialVersionUID = -7466929953374883507L;

    /* renamed from: b */
    public final List<String> f74121b;

    public UninitializedMessageException(InterfaceC18149F interfaceC18149F) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.f74121b = null;
    }

    /* renamed from: a */
    public InvalidProtocolBufferException m47799a() {
        return new InvalidProtocolBufferException(getMessage());
    }
}
