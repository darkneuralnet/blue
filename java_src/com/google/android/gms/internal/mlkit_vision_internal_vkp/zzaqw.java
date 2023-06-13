package com.google.android.gms.internal.mlkit_vision_internal_vkp;

import java.io.IOException;
/* loaded from: classes5.dex */
public class zzaqw extends IOException {

    /* renamed from: b */
    public InterfaceC41230fv7 f70908b;

    /* renamed from: c */
    public boolean f70909c;

    public zzaqw(IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.f70908b = null;
    }

    /* renamed from: a */
    public static zzaqv m51287a() {
        return new zzaqv("Protocol message tag had invalid wire type.");
    }

    /* renamed from: b */
    public static zzaqw m51286b() {
        return new zzaqw("Protocol message end-group tag did not match expected tag.");
    }

    /* renamed from: c */
    public static zzaqw m51285c() {
        return new zzaqw("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: d */
    public static zzaqw m51284d() {
        return new zzaqw("Protocol message had invalid UTF-8.");
    }

    /* renamed from: e */
    public static zzaqw m51283e() {
        return new zzaqw("CodedInputStream encountered a malformed varint.");
    }

    /* renamed from: f */
    public static zzaqw m51282f() {
        return new zzaqw("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: g */
    public static zzaqw m51281g() {
        return new zzaqw("Failed to parse the message.");
    }

    /* renamed from: i */
    public static zzaqw m51279i() {
        return new zzaqw("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    /* renamed from: j */
    public static zzaqw m51278j() {
        return new zzaqw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* renamed from: h */
    public final zzaqw m51280h(InterfaceC41230fv7 interfaceC41230fv7) {
        this.f70908b = interfaceC41230fv7;
        return this;
    }

    /* renamed from: k */
    public final void m51277k() {
        this.f70909c = true;
    }

    /* renamed from: l */
    public final boolean m51276l() {
        return this.f70909c;
    }

    public zzaqw(String str) {
        super(str);
        this.f70908b = null;
    }
}
