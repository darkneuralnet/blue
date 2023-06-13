package p000;

import ch.qos.logback.core.CoreConstants;
import p000.C47175px2;
/* renamed from: Nx2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C34864Nx2 {

    /* renamed from: a */
    public final int f25401a;

    /* renamed from: b */
    public final int f25402b;

    /* renamed from: c */
    public final int f25403c;

    /* renamed from: d */
    public final boolean f25404d;

    /* renamed from: e */
    public final boolean f25405e;

    /* renamed from: f */
    public final C47175px2.InterfaceC27423b f25406f;

    public C34864Nx2(int i, int i2, int i3, boolean z, boolean z2, C47175px2.InterfaceC27423b interfaceC27423b) {
        this.f25401a = i;
        this.f25402b = i2;
        this.f25403c = i3;
        this.f25404d = z;
        this.f25405e = z2;
        this.f25406f = interfaceC27423b;
    }

    /* renamed from: a */
    public C34864Nx2 m93166a(C47175px2 c47175px2) {
        int i;
        int i2;
        int i3;
        boolean z;
        boolean z2;
        C47175px2.InterfaceC27423b interfaceC27423b;
        if (c47175px2.m18406a() != null) {
            i = c47175px2.m18406a().intValue();
        } else {
            i = this.f25401a;
        }
        int i4 = i;
        if (c47175px2.m18404c() != null) {
            i2 = c47175px2.m18404c().intValue();
        } else {
            i2 = this.f25402b;
        }
        int i5 = i2;
        if (c47175px2.m18401f() != null) {
            i3 = c47175px2.m18401f().intValue();
        } else {
            i3 = this.f25403c;
        }
        int i6 = i3;
        if (c47175px2.m18403d() != null) {
            z = c47175px2.m18403d().booleanValue();
        } else {
            z = this.f25404d;
        }
        boolean z3 = z;
        if (c47175px2.m18402e() != null) {
            z2 = c47175px2.m18402e().booleanValue();
        } else {
            z2 = this.f25405e;
        }
        boolean z4 = z2;
        if (c47175px2.m18405b() != null) {
            interfaceC27423b = c47175px2.m18405b();
        } else {
            interfaceC27423b = this.f25406f;
        }
        return new C34864Nx2(i4, i5, i6, z3, z4, interfaceC27423b);
    }

    public String toString() {
        return "LoggerSetup{logLevel=" + this.f25401a + ", macAddressLogSetting=" + this.f25402b + ", uuidLogSetting=" + this.f25403c + ", shouldLogAttributeValues=" + this.f25404d + ", shouldLogScannedPeripherals=" + this.f25405e + ", logger=" + this.f25406f + CoreConstants.CURLY_RIGHT;
    }
}
