package p000;

import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0002¨\u0006\u0005"}, m28432d2 = {"", "high", "low", "", "b", "ui-text_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: O91 */
/* loaded from: classes.dex */
public final class O91 {
    /* renamed from: b */
    public static final boolean m92713b(char c, char c2) {
        return Character.isHighSurrogate(c) && Character.isLowSurrogate(c2);
    }
}
