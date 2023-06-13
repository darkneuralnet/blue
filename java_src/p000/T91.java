package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a%\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0005"}, m28432d2 = {"Ls26;", "target", "deleted", C17296a.f69688o, "(JJ)J", "ui-text_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: T91 */
/* loaded from: classes.dex */
public final class T91 {
    /* renamed from: a */
    public static final long m84272a(long j, long j2) {
        int m14836j;
        int m14834l = C48413s26.m14834l(j);
        int m14835k = C48413s26.m14835k(j);
        if (C48413s26.m14830p(j2, j)) {
            if (C48413s26.m14842d(j2, j)) {
                m14834l = C48413s26.m14834l(j2);
                m14835k = m14834l;
            } else {
                if (C48413s26.m14842d(j, j2)) {
                    m14836j = C48413s26.m14836j(j2);
                } else if (C48413s26.m14841e(j2, m14834l)) {
                    m14834l = C48413s26.m14834l(j2);
                    m14836j = C48413s26.m14836j(j2);
                } else {
                    m14835k = C48413s26.m14834l(j2);
                }
                m14835k -= m14836j;
            }
        } else if (m14835k > C48413s26.m14834l(j2)) {
            m14834l -= C48413s26.m14836j(j2);
            m14836j = C48413s26.m14836j(j2);
            m14835k -= m14836j;
        }
        return C49006t26.m13200b(m14834l, m14835k);
    }
}
