package p000;

import ch.qos.logback.core.CoreConstants;
/* renamed from: Tk5  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C36154Tk5 {

    /* renamed from: a */
    public final InterfaceC45802ne5 f36009a;

    /* renamed from: b */
    public final int f36010b;

    /* renamed from: c */
    public final long f36011c;

    /* renamed from: d */
    public final EnumC44073kj5 f36012d;

    /* renamed from: e */
    public final InterfaceC32176Ck5 f36013e;

    /* renamed from: f */
    public final Y92 f36014f;

    public C36154Tk5(InterfaceC45802ne5 interfaceC45802ne5, int i, long j, EnumC44073kj5 enumC44073kj5, InterfaceC32176Ck5 interfaceC32176Ck5, Y92 y92) {
        this.f36009a = interfaceC45802ne5;
        this.f36010b = i;
        this.f36011c = j;
        this.f36012d = enumC44073kj5;
        this.f36013e = interfaceC32176Ck5;
        this.f36014f = y92;
    }

    /* renamed from: a */
    public InterfaceC45802ne5 m83016a() {
        return this.f36009a;
    }

    /* renamed from: b */
    public int m83015b() {
        return this.f36010b;
    }

    /* renamed from: c */
    public InterfaceC32176Ck5 m83014c() {
        return this.f36013e;
    }

    public String toString() {
        return "ScanResult{bleDevice=" + this.f36009a + ", rssi=" + this.f36010b + ", timestampNanos=" + this.f36011c + ", callbackType=" + this.f36012d + ", scanRecord=" + C35098Ox2.m91175a(this.f36013e.mo106631a()) + ", isConnectable=" + this.f36014f + CoreConstants.CURLY_RIGHT;
    }
}
