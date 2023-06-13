package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;
/* loaded from: classes6.dex */
public class InvalidProtocolBufferException extends IOException {
    private static final long serialVersionUID = -1616151763072450476L;

    /* renamed from: b */
    public InterfaceC18149F f74048b;

    /* renamed from: c */
    public boolean f74049c;

    /* loaded from: classes6.dex */
    public static class InvalidWireTypeException extends InvalidProtocolBufferException {
        private static final long serialVersionUID = 3283890091615336259L;

        public InvalidWireTypeException(String str) {
            super(str);
        }
    }

    public InvalidProtocolBufferException(String str) {
        super(str);
        this.f74048b = null;
    }

    /* renamed from: b */
    public static InvalidProtocolBufferException m48010b() {
        return new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
    }

    /* renamed from: c */
    public static InvalidProtocolBufferException m48009c() {
        return new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: d */
    public static InvalidProtocolBufferException m48008d() {
        return new InvalidProtocolBufferException("Protocol message had invalid UTF-8.");
    }

    /* renamed from: e */
    public static InvalidWireTypeException m48007e() {
        return new InvalidWireTypeException("Protocol message tag had invalid wire type.");
    }

    /* renamed from: f */
    public static InvalidProtocolBufferException m48006f() {
        return new InvalidProtocolBufferException("CodedInputStream encountered a malformed varint.");
    }

    /* renamed from: g */
    public static InvalidProtocolBufferException m48005g() {
        return new InvalidProtocolBufferException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: h */
    public static InvalidProtocolBufferException m48004h() {
        return new InvalidProtocolBufferException("Failed to parse the message.");
    }

    /* renamed from: i */
    public static InvalidProtocolBufferException m48003i() {
        return new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    /* renamed from: k */
    public static InvalidProtocolBufferException m48001k() {
        return new InvalidProtocolBufferException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* renamed from: a */
    public boolean m48011a() {
        return this.f74049c;
    }

    /* renamed from: j */
    public InvalidProtocolBufferException m48002j(InterfaceC18149F interfaceC18149F) {
        this.f74048b = interfaceC18149F;
        return this;
    }

    public InvalidProtocolBufferException(IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.f74048b = null;
    }
}
