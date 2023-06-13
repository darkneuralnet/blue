package p000;

import com.google.protobuf.InterfaceC18462D;
/* renamed from: rn4  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C48263rn4 implements InterfaceC47475qT2 {

    /* renamed from: a */
    public final InterfaceC18462D f107617a;

    /* renamed from: b */
    public final String f107618b;

    /* renamed from: c */
    public final Object[] f107619c;

    /* renamed from: d */
    public final int f107620d;

    public C48263rn4(InterfaceC18462D interfaceC18462D, String str, Object[] objArr) {
        this.f107617a = interfaceC18462D;
        this.f107618b = str;
        this.f107619c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f107620d = charAt;
            return;
        }
        int i = charAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char charAt2 = str.charAt(i3);
            if (charAt2 >= 55296) {
                i |= (charAt2 & 8191) << i2;
                i2 += 13;
                i3 = i4;
            } else {
                this.f107620d = i | (charAt2 << i2);
                return;
            }
        }
    }

    @Override // p000.InterfaceC47475qT2
    /* renamed from: a */
    public boolean mo15391a() {
        return (this.f107620d & 2) == 2;
    }

    @Override // p000.InterfaceC47475qT2
    /* renamed from: b */
    public InterfaceC18462D mo15390b() {
        return this.f107617a;
    }

    @Override // p000.InterfaceC47475qT2
    /* renamed from: c */
    public I94 mo15389c() {
        return (this.f107620d & 1) == 1 ? I94.PROTO2 : I94.PROTO3;
    }

    /* renamed from: d */
    public Object[] m15388d() {
        return this.f107619c;
    }

    /* renamed from: e */
    public String m15387e() {
        return this.f107618b;
    }
}
