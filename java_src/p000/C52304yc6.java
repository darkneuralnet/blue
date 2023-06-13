package p000;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import androidx.emoji2.text.C11581c;
/* renamed from: yc6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C52304yc6 extends AbstractC33018Ga1 {

    /* renamed from: h */
    public static Paint f119846h;

    /* renamed from: g */
    public TextPaint f119847g;

    public C52304yc6(C51711xc6 c51711xc6) {
        super(c51711xc6);
    }

    /* renamed from: e */
    public static Paint m3166e() {
        if (f119846h == null) {
            TextPaint textPaint = new TextPaint();
            f119846h = textPaint;
            textPaint.setColor(C11581c.m67529c().m67527e());
            f119846h.setStyle(Paint.Style.FILL);
        }
        return f119846h;
    }

    /* renamed from: c */
    public final TextPaint m3168c(CharSequence charSequence, int i, int i2, Paint paint) {
        if (charSequence instanceof Spanned) {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i, i2, CharacterStyle.class);
            if (characterStyleArr.length != 0) {
                if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                    TextPaint textPaint = this.f119847g;
                    if (textPaint == null) {
                        textPaint = new TextPaint();
                        this.f119847g = textPaint;
                    }
                    textPaint.set(paint);
                    for (CharacterStyle characterStyle : characterStyleArr) {
                        characterStyle.updateDrawState(textPaint);
                    }
                    return textPaint;
                }
            }
            if (!(paint instanceof TextPaint)) {
                return null;
            }
            return (TextPaint) paint;
        } else if (!(paint instanceof TextPaint)) {
            return null;
        } else {
            return (TextPaint) paint;
        }
    }

    /* renamed from: d */
    public void m3167d(Canvas canvas, TextPaint textPaint, float f, float f2, float f3, float f4) {
        int color = textPaint.getColor();
        Paint.Style style = textPaint.getStyle();
        textPaint.setColor(textPaint.bgColor);
        textPaint.setStyle(Paint.Style.FILL);
        canvas.drawRect(f, f3, f2, f4, textPaint);
        textPaint.setStyle(style);
        textPaint.setColor(color);
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Paint paint2 = paint;
        TextPaint m3168c = m3168c(charSequence, i, i2, paint2);
        if (m3168c != null && m3168c.bgColor != 0) {
            m3167d(canvas, m3168c, f, f + m105000b(), i3, i5);
        }
        if (C11581c.m67529c().m67520l()) {
            canvas.drawRect(f, i3, f + m105000b(), i5, m3166e());
        }
        C51711xc6 m105001a = m105001a();
        float f2 = i4;
        if (m3168c != null) {
            paint2 = m3168c;
        }
        m105001a.m4946a(canvas, f, f2, paint2);
    }
}
