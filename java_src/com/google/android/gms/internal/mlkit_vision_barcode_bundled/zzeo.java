package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.io.IOException;
/* loaded from: classes5.dex */
public class zzeo extends IOException {

    /* renamed from: b */
    public InterfaceC39926dj8 f70822b;

    public zzeo(IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.f70822b = null;
    }

    /* renamed from: a */
    public static zzen m51321a() {
        return new zzen("Protocol message tag had invalid wire type.");
    }

    /* renamed from: b */
    public static zzeo m51320b() {
        return new zzeo("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: c */
    public static zzeo m51319c() {
        return new zzeo("Protocol message had invalid UTF-8.");
    }

    /* renamed from: d */
    public static zzeo m51318d() {
        return new zzeo("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: e */
    public static zzeo m51317e() {
        return new zzeo("Failed to parse the message.");
    }

    /* renamed from: g */
    public static zzeo m51315g() {
        return new zzeo("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* renamed from: f */
    public final zzeo m51316f(InterfaceC39926dj8 interfaceC39926dj8) {
        this.f70822b = interfaceC39926dj8;
        return this;
    }

    public zzeo(String str) {
        super(str);
        this.f70822b = null;
    }
}
