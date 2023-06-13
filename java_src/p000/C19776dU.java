package p000;

import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.domain.Entry;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a9\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000b"}, m28432d2 = {"LMW1;", Entry.TYPE_IMAGE, "LA52;", "srcOffset", "LG52;", "srcSize", "LRl1;", "filterQuality", "LcU;", C17296a.f69688o, "(LMW1;JJI)LcU;", "ui-graphics_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: dU */
/* loaded from: classes.dex */
public final class C19776dU {
    /* renamed from: a */
    public static final C13582cU m44222a(MW1 image, long j, long j2, int i) {
        Intrinsics.checkNotNullParameter(image, "image");
        C13582cU c13582cU = new C13582cU(image, j, j2, null);
        c13582cU.m61285a(i);
        return c13582cU;
    }

    /* renamed from: b */
    public static /* synthetic */ C13582cU m44221b(MW1 mw1, long j, long j2, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j = A52.f130b.m116106a();
        }
        long j3 = j;
        if ((i2 & 4) != 0) {
            j2 = H52.m104430a(mw1.getWidth(), mw1.getHeight());
        }
        long j4 = j2;
        if ((i2 & 8) != 0) {
            i = C35691Rl1.f32551a.m86328a();
        }
        return m44222a(mw1, j3, j4, i);
    }
}
