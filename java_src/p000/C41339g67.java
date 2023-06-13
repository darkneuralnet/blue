package p000;

import java.util.List;
import java.util.RandomAccess;
/* renamed from: g67  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C41339g67 {
    /* renamed from: a */
    public static List m40007a(List list, F57 f57) {
        if (list instanceof RandomAccess) {
            return new C39561d67(list, f57);
        }
        return new C40746f67(list, f57);
    }
}
