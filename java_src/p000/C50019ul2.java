package p000;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* renamed from: ul2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C50019ul2 {

    /* renamed from: a */
    public static final CopyOnWriteArrayList<InterfaceC49426tl2> f112855a = new CopyOnWriteArrayList<>();

    private C50019ul2() {
    }

    /* renamed from: a */
    public static InterfaceC49426tl2 m9800a(String str) throws GeneralSecurityException {
        Iterator<InterfaceC49426tl2> it = f112855a.iterator();
        while (it.hasNext()) {
            InterfaceC49426tl2 next = it.next();
            if (next.mo11805a(str)) {
                return next;
            }
        }
        throw new GeneralSecurityException("No KMS client does support: " + str);
    }
}
