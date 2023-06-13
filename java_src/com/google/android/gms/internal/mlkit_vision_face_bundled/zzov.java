package com.google.android.gms.internal.mlkit_vision_face_bundled;

import java.io.IOException;
/* loaded from: classes5.dex */
public class zzov extends IOException {

    /* renamed from: b */
    public InterfaceC47012pg9 f70907b;

    public zzov(IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.f70907b = null;
    }

    /* renamed from: a */
    public static zzou m51295a() {
        return new zzou("Protocol message tag had invalid wire type.");
    }

    /* renamed from: b */
    public static zzov m51294b() {
        return new zzov("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: c */
    public static zzov m51293c() {
        return new zzov("Protocol message had invalid UTF-8.");
    }

    /* renamed from: d */
    public static zzov m51292d() {
        return new zzov("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: e */
    public static zzov m51291e() {
        return new zzov("Failed to parse the message.");
    }

    /* renamed from: g */
    public static zzov m51289g() {
        return new zzov("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* renamed from: f */
    public final zzov m51290f(InterfaceC47012pg9 interfaceC47012pg9) {
        this.f70907b = interfaceC47012pg9;
        return this;
    }

    public zzov(String str) {
        super(str);
        this.f70907b = null;
    }
}
