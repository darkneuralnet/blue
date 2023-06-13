package p000;

import com.google.android.gms.common.annotation.KeepForSdk;
@KeepForSdk
/* renamed from: Xx2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C37204Xx2 {
    private C37204Xx2() {
    }

    /* renamed from: a */
    public static Te9 m76025a(int i) {
        switch (i) {
            case 1:
                return Te9.LATIN;
            case 2:
                return Te9.LATIN_AND_CHINESE;
            case 3:
                return Te9.LATIN_AND_DEVANAGARI;
            case 4:
                return Te9.LATIN_AND_JAPANESE;
            case 5:
                return Te9.LATIN_AND_KOREAN;
            case 6:
                return Te9.CREDIT_CARD;
            case 7:
                return Te9.DOCUMENT;
            default:
                return Te9.TYPE_UNKNOWN;
        }
    }

    /* renamed from: b */
    public static void m76024b(C45293mm9 c45293mm9, final boolean z, final V39 v39) {
        c45293mm9.m25016f(new InterfaceC41735gm9() { // from class: KN8
            @Override // p000.InterfaceC41735gm9
            public final InterfaceC51794xk9 zza() {
                M39 m39;
                boolean z2 = z;
                V39 v392 = v39;
                C44879m49 c44879m49 = new C44879m49();
                if (z2) {
                    m39 = M39.TYPE_THICK;
                } else {
                    m39 = M39.TYPE_THIN;
                }
                c44879m49.m26380e(m39);
                Td9 td9 = new Td9();
                td9.m83243b(v392);
                c44879m49.m26378g(td9.m83242c());
                return Dm9.m109953d(c44879m49);
            }
        }, EnumC40135e49.ON_DEVICE_TEXT_LOAD);
    }
}
