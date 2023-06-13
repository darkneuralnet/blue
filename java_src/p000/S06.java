package p000;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\f\u0010\n¨\u0006\u000f"}, m28432d2 = {"LS06;", "Landroid/text/style/CharacterStyle;", "Landroid/text/TextPaint;", "textPaint", "", "updateDrawState", "", C17296a.f69688o, "Z", "isUnderlineText", "()Z", "b", "isStrikethroughText", "<init>", "(ZZ)V", "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: S06 */
/* loaded from: classes.dex */
public final class S06 extends CharacterStyle {

    /* renamed from: a */
    public final boolean f33007a;

    /* renamed from: b */
    public final boolean f33008b;

    public S06(boolean z, boolean z2) {
        this.f33007a = z;
        this.f33008b = z2;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        Intrinsics.checkNotNullParameter(textPaint, "textPaint");
        textPaint.setUnderlineText(this.f33007a);
        textPaint.setStrikeThruText(this.f33008b);
    }
}
