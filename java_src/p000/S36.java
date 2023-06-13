package p000;

import co.bird.api.error.RetrofitException;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¨\u0006\u0003"}, m28432d2 = {"", "", C17296a.f69688o, "app_birdRelease"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: S36 */
/* loaded from: classes2.dex */
public final class S36 {
    /* renamed from: a */
    public static final boolean m86051a(Throwable th) {
        Intrinsics.checkNotNullParameter(th, "<this>");
        if ((th instanceof RetrofitException) && ((RetrofitException) th).m53928b() == RetrofitException.EnumC16708a.NETWORK) {
            return true;
        }
        return false;
    }
}
