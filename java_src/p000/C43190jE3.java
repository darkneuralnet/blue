package p000;

import android.graphics.Paint;
import android.graphics.Rect;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.domain.Entry;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ0\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¨\u0006\u000f"}, m28432d2 = {"LjE3;", "", "Landroid/graphics/Paint;", "paint", "", Entry.TYPE_TEXT, "", "start", "end", "Landroid/graphics/Rect;", "rect", "", C17296a.f69688o, "<init>", "()V", "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: jE3  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C43190jE3 {

    /* renamed from: a */
    public static final C43190jE3 f92305a = new C43190jE3();

    private C43190jE3() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m30968a(Paint paint, CharSequence text, int i, int i2, Rect rect) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(rect, "rect");
        paint.getTextBounds(text, i, i2, rect);
    }
}
