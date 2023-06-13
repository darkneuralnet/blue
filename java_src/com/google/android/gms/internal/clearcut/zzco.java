package com.google.android.gms.internal.clearcut;

import java.io.IOException;
/* loaded from: classes5.dex */
public class zzco extends IOException {

    /* renamed from: b */
    public H28 f70516b;

    public zzco(String str) {
        super(str);
        this.f70516b = null;
    }

    /* renamed from: a */
    public static zzco m51357a() {
        return new zzco("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* renamed from: b */
    public static zzco m51356b() {
        return new zzco("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: c */
    public static zzcp m51355c() {
        return new zzcp("Protocol message tag had invalid wire type.");
    }

    /* renamed from: d */
    public static zzco m51354d() {
        return new zzco("Failed to parse the message.");
    }

    /* renamed from: e */
    public static zzco m51353e() {
        return new zzco("Protocol message had invalid UTF-8.");
    }

    /* renamed from: f */
    public final zzco m51352f(H28 h28) {
        this.f70516b = h28;
        return this;
    }
}
