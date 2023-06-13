package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\"\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, m28432d2 = {"", "distance", "", "isInLayer", "LI51;", C17296a.f69688o, "(FZ)J", "ui_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: SM1 */
/* loaded from: classes.dex */
public final class SM1 {
    /* renamed from: a */
    public static final long m85702a(float f, boolean z) {
        long j;
        long floatToIntBits = Float.floatToIntBits(f);
        if (z) {
            j = 1;
        } else {
            j = 0;
        }
        return I51.m102993b((j & 4294967295L) | (floatToIntBits << 32));
    }
}
