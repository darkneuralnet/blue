package com.google.android.gms.internal.vision;

import java.io.IOException;
/* loaded from: classes6.dex */
public class zzjk extends IOException {

    /* renamed from: b */
    public InterfaceC44489lQ8 f71346b;

    public zzjk(String str) {
        super(str);
        this.f71346b = null;
    }

    /* renamed from: a */
    public static zzjk m50764a() {
        return new zzjk("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* renamed from: b */
    public static zzjk m50763b() {
        return new zzjk("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: c */
    public static zzjk m50762c() {
        return new zzjk("CodedInputStream encountered a malformed varint.");
    }

    /* renamed from: d */
    public static zzjk m50761d() {
        return new zzjk("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: e */
    public static zzjk m50760e() {
        return new zzjk("Protocol message end-group tag did not match expected tag.");
    }

    /* renamed from: f */
    public static zzjn m50759f() {
        return new zzjn("Protocol message tag had invalid wire type.");
    }

    /* renamed from: g */
    public static zzjk m50758g() {
        return new zzjk("Failed to parse the message.");
    }

    /* renamed from: h */
    public static zzjk m50757h() {
        return new zzjk("Protocol message had invalid UTF-8.");
    }
}
