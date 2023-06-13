package p000;

import java.util.Comparator;
import p000.InterfaceC35858Sd6;
/* renamed from: Ud6  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C36326Ud6<U extends InterfaceC35858Sd6<?>> implements Comparator<U> {
    @Override // java.util.Comparator
    /* renamed from: a */
    public int compare(U u, U u2) {
        if (u.getName() != null && u.getName().equals(u2.getName())) {
            return u.toString().compareTo(u2.toString());
        }
        return u.toString().compareTo(u2.toString());
    }
}
