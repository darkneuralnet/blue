package p000;

import co.bird.api.error.RetrofitException;
import com.facebook.share.internal.C17296a;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0003¨\u0006\u0004"}, m28432d2 = {"", "e", "Ltg1;", C17296a.f69688o, "app_birdRelease"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: Ry2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C35809Ry2 {
    @Deprecated(message = "Please use standard retrofit response types to avoid exception parsing")
    /* renamed from: a */
    public static final C49375tg1 m86159a(Throwable th) {
        String str;
        String str2;
        C49375tg1 c49375tg1;
        if (th instanceof RetrofitException) {
            if (((RetrofitException) th).m53928b() == RetrofitException.EnumC16708a.NETWORK) {
                String string = H22.f12748a.mo27552R1().getResources().getString(C45871nl4.error_network);
                Intrinsics.checkNotNullExpressionValue(string, "Injector.applicationCont…g(L.string.error_network)");
                c49375tg1 = new C49375tg1(-1, string, null, null, 12, null);
            } else {
                try {
                    c49375tg1 = (C49375tg1) ((RetrofitException) th).m53929a(C49375tg1.class);
                } catch (Throwable th2) {
                    String message = th2.getMessage();
                    if (message == null) {
                        str2 = "";
                    } else {
                        str2 = message;
                    }
                    c49375tg1 = new C49375tg1(500, str2, null, null, 12, null);
                }
            }
            Intrinsics.checkNotNullExpressionValue(c49375tg1, "{\n    if (e.kind == Retr… ?: \"\")\n      }\n    }\n  }");
            return c49375tg1;
        }
        String message2 = th.getMessage();
        if (message2 == null) {
            str = "";
        } else {
            str = message2;
        }
        return new C49375tg1(500, str, null, null, 12, null);
    }
}
