package p000;

import android.content.res.Resources;
import co.bird.api.error.RetrofitException;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p000.H31;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0010\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0004\u001a\u00020\u0003*\u00020\u0000\u001aj\u0010\u0012\u001a\u00020\u000e*\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u00072:\b\u0002\u0010\u000f\u001a4\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\t2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0010¨\u0006\u0013"}, m28432d2 = {"", "", "b", "", C17296a.f69688o, "LH31;", "ui", "Landroid/content/res/Resources;", "resources", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "errorKind", "errorDesc", "", "fireTrackEvent", "Lkotlin/Function0;", "onNonRetrofitException", "c", "app_birdRelease"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: Q36 */
/* loaded from: classes2.dex */
public final class Q36 {
    /* renamed from: a */
    public static final String m88990a(Throwable th) {
        Intrinsics.checkNotNullParameter(th, "<this>");
        if (th instanceof RetrofitException) {
            String message = th.getMessage();
            if (message == null) {
                return "RetrofitException: no message available";
            }
            return message;
        }
        return th.toString();
    }

    /* renamed from: b */
    public static final boolean m88989b(Throwable th) {
        Intrinsics.checkNotNullParameter(th, "<this>");
        if ((th instanceof RetrofitException) && ((RetrofitException) th).m53928b() == RetrofitException.EnumC16708a.NETWORK) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m88988c(Throwable th, H31 h31, Resources resources, Function2<? super String, ? super String, Unit> function2, Function0<Unit> function0) {
        String m11932c;
        String str;
        String string;
        Intrinsics.checkNotNullParameter(th, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        if (th instanceof RetrofitException) {
            RetrofitException retrofitException = (RetrofitException) th;
            C49375tg1 c49375tg1 = (C49375tg1) retrofitException.m53929a(C49375tg1.class);
            String str2 = "";
            if (function2 != null) {
                function2.invoke(retrofitException.m53928b().name(), (c49375tg1 == null || (r6 = c49375tg1.m11932c()) == null) ? "" : "");
            }
            if (retrofitException.m53928b() == RetrofitException.EnumC16708a.NETWORK) {
                str2 = resources.getString(C45871nl4.error_network);
            } else if (c49375tg1 != null && (m11932c = c49375tg1.m11932c()) != null) {
                str = m11932c;
                Intrinsics.checkNotNullExpressionValue(str, "if (this.kind == Retrofi…rror?.message ?: \"\"\n    }");
                if (h31 == null) {
                    if (c49375tg1 == null || (string = c49375tg1.m11931d()) == null) {
                        string = resources.getString(C45871nl4.something_went_wrong_dialog_title);
                        Intrinsics.checkNotNullExpressionValue(string, "resources.getString(L.st…_went_wrong_dialog_title)");
                    }
                    H31.C3014a.showDialog$default(h31, string, str, 17039360, null, false, false, null, null, null, 504, null);
                    return;
                }
                return;
            }
            str = str2;
            Intrinsics.checkNotNullExpressionValue(str, "if (this.kind == Retrofi…rror?.message ?: \"\"\n    }");
            if (h31 == null) {
            }
        } else {
            if (function0 != null) {
                function0.invoke();
            }
            if (function2 != null) {
                String simpleName = th.getClass().getSimpleName();
                Intrinsics.checkNotNullExpressionValue(simpleName, "this.javaClass.simpleName");
                String message = th.getMessage();
                if (message == null) {
                    message = "Unknown error";
                }
                function2.invoke(simpleName, message);
            }
        }
    }

    public static /* synthetic */ void showRetrofitExceptionDialog$default(Throwable th, H31 h31, Resources resources, Function2 function2, Function0 function0, int i, Object obj) {
        if ((i & 4) != 0) {
            function2 = null;
        }
        if ((i & 8) != 0) {
            function0 = null;
        }
        m88988c(th, h31, resources, function2, function0);
    }
}
