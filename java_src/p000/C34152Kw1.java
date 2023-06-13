package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a\u001e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003¨\u0006\u0006"}, m28432d2 = {"LJw1;", "start", "stop", "", "fraction", C17296a.f69688o, "ui-text_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: Kw1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C34152Kw1 {
    /* renamed from: a */
    public static final C33918Jw1 m98122a(C33918Jw1 start, C33918Jw1 stop, float f) {
        int coerceIn;
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(stop, "stop");
        coerceIn = RangesKt___RangesKt.coerceIn(YM2.m75145b(start.m99544k(), stop.m99544k(), f), 1, 1000);
        return new C33918Jw1(coerceIn);
    }
}
