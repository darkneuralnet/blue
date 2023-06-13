package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\u001a\u001c\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000\u001a\u001e\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b\u001a\u001e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b¨\u0006\f"}, m28432d2 = {"LdW3;", "spanStyle", "LZV3;", "paragraphStyle", "LlW3;", C17296a.f69688o, "start", "stop", "", "fraction", "b", "c", "ui-text_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: Sd */
/* loaded from: classes.dex */
public final class C7488Sd {
    /* renamed from: a */
    public static final C44538lW3 m85183a(C39795dW3 c39795dW3, ZV3 zv3) {
        return new C44538lW3(c39795dW3, zv3);
    }

    /* renamed from: b */
    public static final ZV3 m85182b(ZV3 start, ZV3 stop, float f) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(stop, "stop");
        if (start.m73001c() == stop.m73001c()) {
            return start;
        }
        return new ZV3(((C33252Ha1) HN5.m103925c(C33252Ha1.m103714c(start.m73002b()), C33252Ha1.m103714c(stop.m73002b()), f)).m103708i(), ((Boolean) HN5.m103925c(Boolean.valueOf(start.m73001c()), Boolean.valueOf(stop.m73001c()), f)).booleanValue(), null);
    }

    /* renamed from: c */
    public static final C39795dW3 m85181c(C39795dW3 start, C39795dW3 stop, float f) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(stop, "stop");
        return start;
    }
}
