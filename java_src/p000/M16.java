package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a\u001e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003¨\u0006\u0006"}, m28432d2 = {"LL16;", "start", "stop", "", "fraction", C17296a.f69688o, "ui-text_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: M16 */
/* loaded from: classes.dex */
public final class M16 {
    /* renamed from: a */
    public static final L16 m96007a(L16 start, L16 stop, float f) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(stop, "stop");
        return new L16(YM2.m75146a(start.m97920b(), stop.m97920b(), f), YM2.m75146a(start.m97919c(), stop.m97919c(), f));
    }
}
