package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a\b\u0010\u0001\u001a\u00020\u0000H\u0002\u001a\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002\"\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000b"}, m28432d2 = {"", DateTokenConverter.CONVERTER_KEY, "", "index", "size", "", "e", "", C17296a.f69688o, "Ljava/lang/Object;", "sync", "runtime_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: NM5 */
/* loaded from: classes.dex */
public final class NM5 {

    /* renamed from: a */
    public static final Object f24485a = new Object();

    /* renamed from: d */
    public static final Void m94012d() {
        throw new IllegalStateException("Cannot modify a state list through an iterator".toString());
    }

    /* renamed from: e */
    public static final void m94011e(int i, int i2) {
        boolean z = false;
        if (i >= 0 && i < i2) {
            z = true;
        }
        if (z) {
            return;
        }
        throw new IndexOutOfBoundsException("index (" + i + ") is out of bound of [0, " + i2 + CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
