package p000;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.domain.Entry;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J8\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016R\u0017\u0010\b\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, m28432d2 = {"Lnr2;", "Landroid/text/style/LineHeightSpan;", "", Entry.TYPE_TEXT, "", "start", "end", "spanstartVertical", "lineHeight", "Landroid/graphics/Paint$FontMetricsInt;", "fontMetricsInt", "", "chooseHeight", "", C17296a.f69688o, "F", "getLineHeight", "()F", "<init>", "(F)V", "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: nr2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C45929nr2 implements LineHeightSpan {

    /* renamed from: a */
    public final float f100921a;

    public C45929nr2(float f) {
        this.f100921a = f;
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(CharSequence text, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(fontMetricsInt, "fontMetricsInt");
        int m16908a = C47708qr2.m16908a(fontMetricsInt);
        if (m16908a <= 0) {
            return;
        }
        int ceil = (int) Math.ceil(this.f100921a);
        int ceil2 = (int) Math.ceil(fontMetricsInt.descent * ((ceil * 1.0f) / m16908a));
        fontMetricsInt.descent = ceil2;
        fontMetricsInt.ascent = ceil2 - ceil;
    }
}
