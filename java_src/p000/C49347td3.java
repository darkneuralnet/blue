package p000;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0012\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\"\u0015\u0010\b\u001a\u00020\u0003*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\"\u0015\u0010\n\u001a\u00020\u0003*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007¨\u0006\u000b"}, m28432d2 = {"", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", C17296a.f69688o, DateTokenConverter.CONVERTER_KEY, "b", "(Ljava/lang/Number;)F", "dpToPx", "c", "spToPx", "extension_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: td3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C49347td3 {
    /* renamed from: a */
    public static final float m12002a(Number number, Context context) {
        Intrinsics.checkNotNullParameter(number, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        return TypedValue.applyDimension(1, number.floatValue(), context.getResources().getDisplayMetrics());
    }

    /* renamed from: b */
    public static final float m12001b(Number number) {
        Intrinsics.checkNotNullParameter(number, "<this>");
        return Resources.getSystem().getDisplayMetrics().density * number.floatValue();
    }

    /* renamed from: c */
    public static final float m12000c(Number number) {
        Intrinsics.checkNotNullParameter(number, "<this>");
        return Resources.getSystem().getDisplayMetrics().scaledDensity * number.floatValue();
    }

    /* renamed from: d */
    public static final float m11999d(Number number, Context context) {
        Intrinsics.checkNotNullParameter(number, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        return TypedValue.applyDimension(2, number.floatValue(), context.getResources().getDisplayMetrics());
    }
}
