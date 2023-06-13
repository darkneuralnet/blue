package p000;

import com.google.crypto.tink.shaded.protobuf.InterfaceC18149F;
/* renamed from: sn4  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C48855sn4 implements InterfaceC48068rT2 {

    /* renamed from: a */
    public final InterfaceC18149F f109241a;

    /* renamed from: b */
    public final String f109242b;

    /* renamed from: c */
    public final Object[] f109243c;

    /* renamed from: d */
    public final int f109244d;

    public C48855sn4(InterfaceC18149F interfaceC18149F, String str, Object[] objArr) {
        this.f109241a = interfaceC18149F;
        this.f109242b = str;
        this.f109243c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f109244d = charAt;
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
                this.f109244d = i | (charAt2 << i2);
                return;
            }
        }
    }

    @Override // p000.InterfaceC48068rT2
    /* renamed from: a */
    public boolean mo13676a() {
        return (this.f109244d & 2) == 2;
    }

    @Override // p000.InterfaceC48068rT2
    /* renamed from: b */
    public InterfaceC18149F mo13675b() {
        return this.f109241a;
    }

    @Override // p000.InterfaceC48068rT2
    /* renamed from: c */
    public J94 mo13674c() {
        return (this.f109244d & 1) == 1 ? J94.PROTO2 : J94.PROTO3;
    }

    /* renamed from: d */
    public Object[] m13673d() {
        return this.f109243c;
    }

    /* renamed from: e */
    public String m13672e() {
        return this.f109242b;
    }
}
