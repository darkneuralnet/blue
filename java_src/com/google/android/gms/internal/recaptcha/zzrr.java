package com.google.android.gms.internal.recaptcha;

import java.io.IOException;
/* loaded from: classes6.dex */
public class zzrr extends IOException {

    /* renamed from: b */
    public Np9 f71209b;

    /* renamed from: c */
    public boolean f71210c;

    public zzrr(IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.f71209b = null;
    }

    /* renamed from: a */
    public static zzrq m51030a() {
        return new zzrq("Protocol message tag had invalid wire type.");
    }

    /* renamed from: b */
    public static zzrr m51029b() {
        return new zzrr("Protocol message end-group tag did not match expected tag.");
    }

    /* renamed from: c */
    public static zzrr m51028c() {
        return new zzrr("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: d */
    public static zzrr m51027d() {
        return new zzrr("Protocol message had invalid UTF-8.");
    }

    /* renamed from: e */
    public static zzrr m51026e() {
        return new zzrr("CodedInputStream encountered a malformed varint.");
    }

    /* renamed from: f */
    public static zzrr m51025f() {
        return new zzrr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: g */
    public static zzrr m51024g() {
        return new zzrr("Failed to parse the message.");
    }

    /* renamed from: i */
    public static zzrr m51022i() {
        return new zzrr("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    /* renamed from: j */
    public static zzrr m51021j() {
        return new zzrr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* renamed from: h */
    public final zzrr m51023h(Np9 np9) {
        this.f71209b = np9;
        return this;
    }

    /* renamed from: k */
    public final void m51020k() {
        this.f71210c = true;
    }

    /* renamed from: l */
    public final boolean m51019l() {
        return this.f71210c;
    }

    public zzrr(String str) {
        super(str);
        this.f71209b = null;
    }
}
