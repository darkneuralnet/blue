package p000;

import android.graphics.Paint;
import android.text.Layout;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a\u001e\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0000\u001a\u001e\u0010\u0007\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0000¨\u0006\b"}, m28432d2 = {"Landroid/text/Layout;", "", "lineIndex", "Landroid/graphics/Paint;", "paint", "", C17296a.f69688o, "c", "ui-text_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: n12  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C45435n12 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: n12$a */
    /* loaded from: classes.dex */
    public /* synthetic */ class C26335a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            try {
                iArr[Layout.Alignment.ALIGN_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: a */
    public static final float m24581a(Layout layout, int i, Paint paint) {
        int i2;
        float abs;
        float width;
        Intrinsics.checkNotNullParameter(layout, "<this>");
        Intrinsics.checkNotNullParameter(paint, "paint");
        float lineLeft = layout.getLineLeft(i);
        if (!C41891h26.m36884k(layout, i) || layout.getParagraphDirection(i) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        float primaryHorizontal = (layout.getPrimaryHorizontal(layout.getLineStart(i) + layout.getEllipsisStart(i)) - lineLeft) + paint.measureText("…");
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if (paragraphAlignment == null) {
            i2 = -1;
        } else {
            i2 = C26335a.$EnumSwitchMapping$0[paragraphAlignment.ordinal()];
        }
        if (i2 == 1) {
            abs = Math.abs(lineLeft);
            width = (layout.getWidth() - primaryHorizontal) / 2.0f;
        } else {
            abs = Math.abs(lineLeft);
            width = layout.getWidth() - primaryHorizontal;
        }
        return abs + width;
    }

    /* renamed from: b */
    public static /* synthetic */ float m24580b(Layout layout, int i, Paint paint, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            paint = layout.getPaint();
            Intrinsics.checkNotNullExpressionValue(paint, "this.paint");
        }
        return m24581a(layout, i, paint);
    }

    /* renamed from: c */
    public static final float m24579c(Layout layout, int i, Paint paint) {
        float width;
        float width2;
        Intrinsics.checkNotNullParameter(layout, "<this>");
        Intrinsics.checkNotNullParameter(paint, "paint");
        if (C41891h26.m36884k(layout, i)) {
            int i2 = -1;
            if (layout.getParagraphDirection(i) == -1 && layout.getWidth() < layout.getLineRight(i)) {
                float lineRight = (layout.getLineRight(i) - layout.getPrimaryHorizontal(layout.getLineStart(i) + layout.getEllipsisStart(i))) + paint.measureText("…");
                Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
                if (paragraphAlignment != null) {
                    i2 = C26335a.$EnumSwitchMapping$0[paragraphAlignment.ordinal()];
                }
                if (i2 == 1) {
                    width = layout.getWidth() - layout.getLineRight(i);
                    width2 = (layout.getWidth() - lineRight) / 2.0f;
                } else {
                    width = layout.getWidth() - layout.getLineRight(i);
                    width2 = layout.getWidth() - lineRight;
                }
                return width - width2;
            }
            return 0.0f;
        }
        return 0.0f;
    }

    /* renamed from: d */
    public static /* synthetic */ float m24578d(Layout layout, int i, Paint paint, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            paint = layout.getPaint();
            Intrinsics.checkNotNullExpressionValue(paint, "this.paint");
        }
        return m24579c(layout, i, paint);
    }
}
