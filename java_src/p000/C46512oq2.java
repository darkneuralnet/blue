package p000;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\f\u0010\u0007\u001a\u00020\u0004*\u00020\u0002H\u0002R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, m28432d2 = {"Loq2;", "Landroid/text/style/MetricAffectingSpan;", "Landroid/text/TextPaint;", "textPaint", "", "updateDrawState", "updateMeasureState", C17296a.f69688o, "", "b", "F", "getLetterSpacing", "()F", "letterSpacing", "<init>", "(F)V", "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: oq2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C46512oq2 extends MetricAffectingSpan {

    /* renamed from: b */
    public final float f102544b;

    public C46512oq2(float f) {
        this.f102544b = f;
    }

    /* renamed from: a */
    public final void m20466a(TextPaint textPaint) {
        boolean z;
        float textSize = textPaint.getTextSize() * textPaint.getTextScaleX();
        if (textSize == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            textPaint.setLetterSpacing(this.f102544b / textSize);
        }
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        Intrinsics.checkNotNullParameter(textPaint, "textPaint");
        m20466a(textPaint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        Intrinsics.checkNotNullParameter(textPaint, "textPaint");
        m20466a(textPaint);
    }
}
