package com.google.android.gms.internal.places;

import java.io.IOException;
/* loaded from: classes5.dex */
public class zzbk extends IOException {

    /* renamed from: b */
    public InterfaceC52815zT7 f71198b;

    public zzbk(String str) {
        super(str);
        this.f71198b = null;
    }

    /* renamed from: a */
    public static zzbk m51038a() {
        return new zzbk("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* renamed from: b */
    public static zzbk m51037b() {
        return new zzbk("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: c */
    public static zzbk m51036c() {
        return new zzbk("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: d */
    public static zzbj m51035d() {
        return new zzbj("Protocol message tag had invalid wire type.");
    }

    /* renamed from: e */
    public static zzbk m51034e() {
        return new zzbk("Failed to parse the message.");
    }

    /* renamed from: f */
    public static zzbk m51033f() {
        return new zzbk("Protocol message had invalid UTF-8.");
    }

    /* renamed from: g */
    public final zzbk m51032g(InterfaceC52815zT7 interfaceC52815zT7) {
        this.f71198b = interfaceC52815zT7;
        return this;
    }
}
