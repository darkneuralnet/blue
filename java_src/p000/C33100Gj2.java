package p000;

import com.facebook.share.internal.C17296a;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001a\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000*\f\b\u0000\u0010\u0006\"\u00020\u00052\u00020\u0005¨\u0006\u0007"}, m28432d2 = {"", "obj", "", "name", C17296a.f69688o, "Ljava/util/concurrent/atomic/AtomicInteger;", "AtomicInt", "ui_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: Gj2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C33100Gj2 {
    /* renamed from: a */
    public static final String m104826a(Object obj, String str) {
        Intrinsics.checkNotNullParameter(obj, "obj");
        if (str == null) {
            if (obj.getClass().isAnonymousClass()) {
                str = obj.getClass().getName();
            } else {
                str = obj.getClass().getSimpleName();
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('@');
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
        sb.append(format);
        return sb.toString();
    }
}
