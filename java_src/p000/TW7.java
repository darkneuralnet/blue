package p000;

import com.google.android.gms.internal.places.AbstractC17530c;
/* renamed from: TW7 */
/* loaded from: classes5.dex */
public final class TW7 implements WS7 {

    /* renamed from: a */
    public final InterfaceC52815zT7 f35601a;

    /* renamed from: b */
    public final String f35602b;

    /* renamed from: c */
    public final Object[] f35603c;

    /* renamed from: d */
    public final int f35604d;

    public TW7(InterfaceC52815zT7 interfaceC52815zT7, String str, Object[] objArr) {
        this.f35601a = interfaceC52815zT7;
        this.f35602b = str;
        this.f35603c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f35604d = charAt;
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
                this.f35604d = i | (charAt2 << i2);
                return;
            }
        }
    }

    @Override // p000.WS7
    /* renamed from: a */
    public final int mo78373a() {
        return (this.f35604d & 1) == 1 ? AbstractC17530c.C17534d.f71161i : AbstractC17530c.C17534d.f71162j;
    }

    @Override // p000.WS7
    /* renamed from: b */
    public final boolean mo78372b() {
        return (this.f35604d & 2) == 2;
    }

    @Override // p000.WS7
    /* renamed from: c */
    public final InterfaceC52815zT7 mo78371c() {
        return this.f35601a;
    }

    /* renamed from: d */
    public final String m83485d() {
        return this.f35602b;
    }

    /* renamed from: e */
    public final Object[] m83484e() {
        return this.f35603c;
    }
}
