package p000;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import com.stripe.android.financialconnections.domain.Entry;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016Jp\u0010\u0017\u001a\u00020\u00162\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¨\u0006\u001a"}, m28432d2 = {"Lm12;", "Landroid/text/style/LeadingMarginSpan;", "", "firstLine", "", "getLeadingMargin", "Landroid/graphics/Canvas;", "canvas", "Landroid/graphics/Paint;", "paint", "left", "dir", "top", "baseline", "bottom", "", Entry.TYPE_TEXT, "start", "end", "first", "Landroid/text/Layout;", "layout", "", "drawLeadingMargin", "<init>", "()V", "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: m12  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C44842m12 implements LeadingMarginSpan {
    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        if (layout != null && paint != null) {
            int lineForOffset = layout.getLineForOffset(i6);
            boolean z2 = true;
            if (lineForOffset == layout.getLineCount() - 1 && C41891h26.m36884k(layout, lineForOffset)) {
                float m24581a = C45435n12.m24581a(layout, lineForOffset, paint) + C45435n12.m24579c(layout, lineForOffset, paint);
                if (m24581a != 0.0f) {
                    z2 = false;
                }
                if (!z2) {
                    Intrinsics.checkNotNull(canvas);
                    canvas.translate(m24581a, 0.0f);
                }
            }
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z) {
        return 0;
    }
}
