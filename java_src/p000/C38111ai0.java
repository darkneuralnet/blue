package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\u0010\f\n\u0002\u0010\b\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¨\u0006\u0003"}, m28432d2 = {"", "", C17296a.f69688o, "extension_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: ai0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C38111ai0 {
    /* renamed from: a */
    public static final int m70832a(char c) {
        int i;
        char lowerCase = Character.toLowerCase(c);
        if (Intrinsics.compare((int) lowerCase, 97) >= 0) {
            i = (lowerCase - 'a') + 10;
        } else {
            i = lowerCase - '0';
        }
        return i & 15;
    }
}
