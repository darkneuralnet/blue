package co.bird.android.widget;

import android.text.TextPaint;
import android.text.style.URLSpan;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m28432d2 = {"Lco/bird/android/widget/URLSpanNoUnderline;", "Landroid/text/style/URLSpan;", "url", "", "(Ljava/lang/String;)V", "updateDrawState", "", "ds", "Landroid/text/TextPaint;", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class URLSpanNoUnderline extends URLSpan {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public URLSpanNoUnderline(String url) {
        super(url);
        Intrinsics.checkNotNullParameter(url, "url");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint ds) {
        Intrinsics.checkNotNullParameter(ds, "ds");
        super.updateDrawState(ds);
        ds.setUnderlineText(false);
    }
}
