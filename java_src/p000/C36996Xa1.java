package p000;

import java.util.Arrays;
/* renamed from: Xa1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C36996Xa1 {

    /* renamed from: a */
    public final InterfaceC40525ek5[] f43420a;

    /* renamed from: b */
    public final boolean f43421b;

    public C36996Xa1(InterfaceC40525ek5... interfaceC40525ek5Arr) {
        boolean z;
        this.f43420a = interfaceC40525ek5Arr;
        if (interfaceC40525ek5Arr != null && interfaceC40525ek5Arr.length != 0) {
            z = false;
            for (InterfaceC40525ek5 interfaceC40525ek5 : interfaceC40525ek5Arr) {
                if (!interfaceC40525ek5.mo42593a()) {
                    break;
                }
            }
        }
        z = true;
        this.f43421b = z;
    }

    /* renamed from: a */
    public boolean m76849a() {
        return this.f43421b;
    }

    /* renamed from: b */
    public boolean m76848b(C51730xe5 c51730xe5) {
        InterfaceC40525ek5[] interfaceC40525ek5Arr = this.f43420a;
        if (interfaceC40525ek5Arr == null || interfaceC40525ek5Arr.length == 0) {
            return true;
        }
        for (InterfaceC40525ek5 interfaceC40525ek5 : interfaceC40525ek5Arr) {
            if (interfaceC40525ek5.mo42592b(c51730xe5)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return "emulatedFilters=" + Arrays.toString(this.f43420a);
    }
}
