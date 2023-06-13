package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u000b\n\u0002\b\b\u001a\u001f\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a3\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001b\u0010\r\u001a\u00020\f*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u001b\u0010\u000f\u001a\u00020\u0001*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u000bH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001b\u0010\u0011\u001a\u00020\u0001*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u000bH\u0000¢\u0006\u0004\b\u0011\u0010\u0010\u001a\u000e\u0010\u0012\u001a\u00020\u0001*\u0004\u0018\u00010\u0000H\u0000\u001a\u000e\u0010\u0013\u001a\u00020\u0001*\u0004\u0018\u00010\u0000H\u0000¨\u0006\u0014"}, m28432d2 = {"Landroid/graphics/drawable/Drawable;", "", "tintColor", "g", "(Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;)Landroid/graphics/drawable/Drawable;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "width", "height", "f", "(Landroid/graphics/drawable/Drawable;Landroid/content/Context;Ljava/lang/Integer;Ljava/lang/Integer;)Landroid/graphics/drawable/Drawable;", "", "", "e", "([Landroid/graphics/drawable/Drawable;)Z", "b", "([Landroid/graphics/drawable/Drawable;)I", "c", C17296a.f69688o, DateTokenConverter.CONVERTER_KEY, "balloon_release"}, m28431k = 2, m28430mv = {1, 7, 1})
/* renamed from: T61 */
/* loaded from: classes6.dex */
public final class T61 {
    /* renamed from: a */
    public static final /* synthetic */ int m84317a(Drawable drawable) {
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return 0;
    }

    /* renamed from: b */
    public static final /* synthetic */ int m84316b(Drawable[] drawableArr) {
        int coerceAtLeast;
        Intrinsics.checkNotNullParameter(drawableArr, "<this>");
        coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(m84317a(drawableArr[0]), m84317a(drawableArr[2]));
        return coerceAtLeast;
    }

    /* renamed from: d */
    public static final /* synthetic */ int m84314d(Drawable drawable) {
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return 0;
    }

    /* renamed from: e */
    public static final /* synthetic */ boolean m84313e(Drawable[] drawableArr) {
        Intrinsics.checkNotNullParameter(drawableArr, "<this>");
        if (drawableArr[0] == null && drawableArr[2] == null) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public static final /* synthetic */ Drawable m84312f(Drawable drawable, Context context, Integer num, Integer num2) {
        Intrinsics.checkNotNullParameter(drawable, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        if (num != null && num2 != null) {
            Bitmap createBitmap = Bitmap.createBitmap(num.intValue(), num2.intValue(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            drawable.setBounds(0, 0, num.intValue(), num2.intValue());
            drawable.draw(canvas);
            return new BitmapDrawable(context.getResources(), createBitmap);
        }
        return drawable;
    }

    /* renamed from: g */
    public static final /* synthetic */ Drawable m84311g(Drawable drawable, Integer num) {
        Intrinsics.checkNotNullParameter(drawable, "<this>");
        if (num != null) {
            P61.m90837o(P61.m90834r(drawable), ColorStateList.valueOf(num.intValue()));
        }
        return drawable;
    }
}
