package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.io.IOException;
/* loaded from: classes5.dex */
public class zbuw extends IOException {

    /* renamed from: b */
    public InterfaceC36075Tb7 f70970b;

    public zbuw(IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.f70970b = null;
    }

    /* renamed from: a */
    public static zbuv m51262a() {
        return new zbuv("Protocol message tag had invalid wire type.");
    }

    /* renamed from: b */
    public static zbuw m51261b() {
        return new zbuw("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: c */
    public static zbuw m51260c() {
        return new zbuw("Protocol message had invalid UTF-8.");
    }

    /* renamed from: d */
    public static zbuw m51259d() {
        return new zbuw("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: e */
    public static zbuw m51258e() {
        return new zbuw("Failed to parse the message.");
    }

    /* renamed from: g */
    public static zbuw m51256g() {
        return new zbuw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* renamed from: f */
    public final zbuw m51257f(InterfaceC36075Tb7 interfaceC36075Tb7) {
        this.f70970b = interfaceC36075Tb7;
        return this;
    }

    public zbuw(String str) {
        super(str);
        this.f70970b = null;
    }
}
