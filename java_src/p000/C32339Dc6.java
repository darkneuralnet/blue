package p000;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\bH\u0002R\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, m28432d2 = {"LDc6;", "Landroid/text/style/MetricAffectingSpan;", "Landroid/text/TextPaint;", "ds", "", "updateDrawState", "paint", "updateMeasureState", "Landroid/graphics/Paint;", C17296a.f69688o, "Landroid/graphics/Typeface;", "b", "Landroid/graphics/Typeface;", "getTypeface", "()Landroid/graphics/Typeface;", "typeface", "<init>", "(Landroid/graphics/Typeface;)V", "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Dc6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32339Dc6 extends MetricAffectingSpan {

    /* renamed from: b */
    public final Typeface f6059b;

    public C32339Dc6(Typeface typeface) {
        Intrinsics.checkNotNullParameter(typeface, "typeface");
        this.f6059b = typeface;
    }

    /* renamed from: a */
    public final void m110106a(Paint paint) {
        paint.setTypeface(this.f6059b);
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint ds) {
        Intrinsics.checkNotNullParameter(ds, "ds");
        m110106a(ds);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        m110106a(paint);
    }
}
