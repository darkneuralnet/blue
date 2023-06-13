package p000;

import java.util.Objects;
/* renamed from: gA8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C41380gA8 {
    /* renamed from: a */
    public static void m39952a(Object obj, Object obj2) {
        if (obj != null) {
            if (obj2 != null) {
                return;
            }
            throw new NullPointerException("null value in entry: " + obj + "=null");
        }
        Objects.toString(obj2);
        throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
    }
}
