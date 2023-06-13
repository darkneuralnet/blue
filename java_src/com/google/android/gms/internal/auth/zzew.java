package com.google.android.gms.internal.auth;

import java.io.IOException;
/* loaded from: classes5.dex */
public final class zzew extends IOException {

    /* renamed from: b */
    public InterfaceC34042Kj8 f70396b;

    public zzew(IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.f70396b = null;
    }

    /* renamed from: a */
    public static zzew m51579a() {
        return new zzew("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: b */
    public static zzew m51578b() {
        return new zzew("Protocol message had invalid UTF-8.");
    }

    /* renamed from: c */
    public static zzew m51577c() {
        return new zzew("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: d */
    public static zzew m51576d() {
        return new zzew("Failed to parse the message.");
    }

    /* renamed from: f */
    public static zzew m51574f() {
        return new zzew("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* renamed from: e */
    public final zzew m51575e(InterfaceC34042Kj8 interfaceC34042Kj8) {
        this.f70396b = interfaceC34042Kj8;
        return this;
    }

    public zzew(String str) {
        super(str);
        this.f70396b = null;
    }
}
