package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.api.error.RetrofitException;
import co.bird.api.exception.HttpException;
import com.facebook.share.internal.C17296a;
import io.reactivex.exceptions.CompositeException;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\n\u0010\u0001\u001a\u00020\u0000*\u00020\u0000\u001a\n\u0010\u0003\u001a\u00020\u0002*\u00020\u0000\u001a\f\u0010\u0005\u001a\u0004\u0018\u00010\u0004*\u00020\u0000\u001a\u000e\u0010\u0006\u001a\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\u0000¨\u0006\u0007"}, m28432d2 = {"", "c", "", "b", "", DateTokenConverter.CONVERTER_KEY, C17296a.f69688o, "extension_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nThrowable+.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Throwable+.kt\nco/bird/android/library/extension/Throwable_Kt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,25:1\n288#2,2:26\n*S KotlinDebug\n*F\n+ 1 Throwable+.kt\nco/bird/android/library/extension/Throwable_Kt\n*L\n10#1:26,2\n*E\n"})
/* renamed from: R36 */
/* loaded from: classes3.dex */
public final class R36 {
    /* renamed from: a */
    public static final Throwable m87364a(Throwable th) {
        if (th instanceof HttpException) {
            return (HttpException) th;
        }
        return null;
    }

    /* renamed from: b */
    public static final boolean m87363b(Throwable th) {
        Intrinsics.checkNotNullParameter(th, "<this>");
        if ((th instanceof RetrofitException) && ((RetrofitException) th).m53928b() == RetrofitException.EnumC16708a.NETWORK) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static final Throwable m87362c(Throwable th) {
        Object obj;
        Intrinsics.checkNotNullParameter(th, "<this>");
        if (th instanceof CompositeException) {
            CompositeException compositeException = (CompositeException) th;
            List<Throwable> exceptions = compositeException.m33015b();
            Intrinsics.checkNotNullExpressionValue(exceptions, "exceptions");
            Iterator<T> it = exceptions.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((Throwable) obj) instanceof RetrofitException) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            Throwable th2 = (Throwable) obj;
            if (th2 == null) {
                th = compositeException.m33015b().get(0);
            } else {
                th = th2;
            }
            Intrinsics.checkNotNullExpressionValue(th, "{\n    exceptions.firstOr…on } ?: exceptions[0]\n  }");
        }
        return th;
    }

    /* renamed from: d */
    public static final String m87361d(Throwable th) {
        RetrofitException retrofitException;
        C49375tg1 c49375tg1;
        Intrinsics.checkNotNullParameter(th, "<this>");
        Throwable m87362c = m87362c(th);
        if (m87362c instanceof RetrofitException) {
            retrofitException = (RetrofitException) m87362c;
        } else {
            retrofitException = null;
        }
        if (retrofitException == null || (c49375tg1 = (C49375tg1) retrofitException.m53929a(C49375tg1.class)) == null) {
            return null;
        }
        return c49375tg1.m11932c();
    }
}
