package p000;

import android.graphics.Paint;
import android.graphics.PathEffect;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000.LS5;
import p000.NS5;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u0019\u0010\t\u001a\u00020\b*\u00020\u0007H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\f*\u00020\u000bH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0013\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\t\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0016"}, m28432d2 = {"LK61;", "Landroid/text/style/CharacterStyle;", "Landroid/text/style/UpdateAppearance;", "Landroid/text/TextPaint;", "textPaint", "", "updateDrawState", "LNS5;", "Landroid/graphics/Paint$Join;", "b", "(I)Landroid/graphics/Paint$Join;", "LLS5;", "Landroid/graphics/Paint$Cap;", C17296a.f69688o, "(I)Landroid/graphics/Paint$Cap;", "LJ61;", "LJ61;", "getDrawStyle", "()LJ61;", "drawStyle", "<init>", "(LJ61;)V", "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: K61 */
/* loaded from: classes.dex */
public final class K61 extends CharacterStyle implements UpdateAppearance {

    /* renamed from: b */
    public final J61 f19081b;

    public K61(J61 drawStyle) {
        Intrinsics.checkNotNullParameter(drawStyle, "drawStyle");
        this.f19081b = drawStyle;
    }

    /* renamed from: a */
    public final Paint.Cap m99235a(int i) {
        LS5.C4927a c4927a = LS5.f21441b;
        if (LS5.m96924g(i, c4927a.m96920a())) {
            return Paint.Cap.BUTT;
        }
        if (LS5.m96924g(i, c4927a.m96919b())) {
            return Paint.Cap.ROUND;
        }
        if (LS5.m96924g(i, c4927a.m96918c())) {
            return Paint.Cap.SQUARE;
        }
        return Paint.Cap.BUTT;
    }

    /* renamed from: b */
    public final Paint.Join m99234b(int i) {
        NS5.C5579a c5579a = NS5.f24612b;
        if (NS5.m93883g(i, c5579a.m93878b())) {
            return Paint.Join.MITER;
        }
        if (NS5.m93883g(i, c5579a.m93877c())) {
            return Paint.Join.ROUND;
        }
        if (NS5.m93883g(i, c5579a.m93879a())) {
            return Paint.Join.BEVEL;
        }
        return Paint.Join.MITER;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        PathEffect pathEffect;
        if (textPaint != null) {
            J61 j61 = this.f19081b;
            if (Intrinsics.areEqual(j61, C52982zl1.f122162a)) {
                textPaint.setStyle(Paint.Style.FILL);
            } else if (j61 instanceof KS5) {
                textPaint.setStyle(Paint.Style.STROKE);
                textPaint.setStrokeWidth(((KS5) this.f19081b).m98859f());
                textPaint.setStrokeMiter(((KS5) this.f19081b).m98861d());
                textPaint.setStrokeJoin(m99234b(((KS5) this.f19081b).m98862c()));
                textPaint.setStrokeCap(m99235a(((KS5) this.f19081b).m98863b()));
                InterfaceC42642iJ3 m98860e = ((KS5) this.f19081b).m98860e();
                if (m98860e != null) {
                    pathEffect = C27639qd.m17318a(m98860e);
                } else {
                    pathEffect = null;
                }
                textPaint.setPathEffect(pathEffect);
            }
        }
    }
}
