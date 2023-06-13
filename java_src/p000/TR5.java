package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0010\r\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u001a\u0014\u0010\u0004\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u001a\u001e\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0001H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, m28432d2 = {"", "", "startIndex", "b", C17296a.f69688o, "index", "Ls26;", "c", "(Ljava/lang/CharSequence;I)J", "foundation_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: TR5 */
/* loaded from: classes.dex */
public final class TR5 {
    /* renamed from: a */
    public static final int m83605a(CharSequence charSequence, int i) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        int length = charSequence.length();
        for (int i2 = i + 1; i2 < length; i2++) {
            if (charSequence.charAt(i2) == '\n') {
                return i2;
            }
        }
        return charSequence.length();
    }

    /* renamed from: b */
    public static final int m83604b(CharSequence charSequence, int i) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        for (int i2 = i - 1; i2 > 0; i2--) {
            if (charSequence.charAt(i2 - 1) == '\n') {
                return i2;
            }
        }
        return 0;
    }

    /* renamed from: c */
    public static final long m83603c(CharSequence charSequence, int i) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return C49006t26.m13200b(m83604b(charSequence, i), m83605a(charSequence, i));
    }
}
