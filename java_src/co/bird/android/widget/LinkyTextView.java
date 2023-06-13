package co.bird.android.widget;

import android.content.Context;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.domain.Entry;
import io.reactivex.subjects.C24558d;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u001aB\u0011\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013B\u001b\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0012\u0010\u0016B#\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0018J\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002R\u001e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u001b"}, m28432d2 = {"Lco/bird/android/widget/LinkyTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "", Entry.TYPE_TEXT, "Landroid/widget/TextView$BufferType;", "type", "", "setText", "Landroid/text/SpannableString;", "g", "Lio/reactivex/subjects/d;", "", "f", "b", "Lio/reactivex/subjects/d;", "clickSubject", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "c", C17296a.f69688o, "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class LinkyTextView extends AppCompatTextView {

    /* renamed from: c */
    public static final C16535a f67392c = new C16535a(null);

    /* renamed from: d */
    public static final Regex f67393d = new Regex("^\\$([0-9]+)$");

    /* renamed from: b */
    public C24558d<Integer> f67394b;

    @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, m28432d2 = {"Lco/bird/android/widget/LinkyTextView$a;", "", "Landroid/text/style/URLSpan;", "urlSpan", "Lio/reactivex/subjects/d;", "", "clickSubject", "Landroid/text/style/ClickableSpan;", C17296a.f69688o, "(Landroid/text/style/URLSpan;Lio/reactivex/subjects/d;)Landroid/text/style/ClickableSpan;", "Lkotlin/text/Regex;", "BUTTON_LINK_REGEX", "Lkotlin/text/Regex;", "<init>", "()V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.widget.LinkyTextView$a */
    /* loaded from: classes4.dex */
    public static final class C16535a {

        @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m28432d2 = {"co/bird/android/widget/LinkyTextView$a$a", "Lbk0;", "Landroid/view/View;", "widget", "", "onClick", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.widget.LinkyTextView$a$a */
        /* loaded from: classes4.dex */
        public static final class C16536a extends AbstractC38724bk0 {

            /* renamed from: b */
            public final /* synthetic */ C24558d<Integer> f67395b;

            /* renamed from: c */
            public final /* synthetic */ MatchResult f67396c;

            public C16536a(C24558d<Integer> c24558d, MatchResult matchResult) {
                this.f67395b = c24558d;
                this.f67396c = matchResult;
            }

            @Override // android.text.style.ClickableSpan
            public void onClick(View widget) {
                Intrinsics.checkNotNullParameter(widget, "widget");
                this.f67395b.onNext(Integer.valueOf(Integer.parseInt(this.f67396c.getGroupValues().get(1))));
            }
        }

        public /* synthetic */ C16535a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final ClickableSpan m54543a(URLSpan urlSpan, C24558d<Integer> clickSubject) {
            Intrinsics.checkNotNullParameter(urlSpan, "urlSpan");
            Intrinsics.checkNotNullParameter(clickSubject, "clickSubject");
            Regex regex = LinkyTextView.f67393d;
            String url = urlSpan.getURL();
            Intrinsics.checkNotNullExpressionValue(url, "urlSpan.url");
            MatchResult find$default = Regex.find$default(regex, url, 0, 2, null);
            if (find$default != null) {
                return new C16536a(clickSubject, find$default);
            }
            String url2 = urlSpan.getURL();
            Intrinsics.checkNotNullExpressionValue(url2, "urlSpan.url");
            return new URLSpanNoUnderline(url2);
        }

        private C16535a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkyTextView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        setMovementMethod(LinkMovementMethod.getInstance());
    }

    /* renamed from: f */
    public final C24558d<Integer> m54545f() {
        if (this.f67394b == null) {
            this.f67394b = C24558d.m31902e();
        }
        C24558d<Integer> c24558d = this.f67394b;
        Intrinsics.checkNotNull(c24558d);
        return c24558d;
    }

    /* renamed from: g */
    public final SpannableString m54544g(CharSequence charSequence) {
        SpannableString spannableString = new SpannableString(charSequence);
        URLSpan[] spans = (URLSpan[]) spannableString.getSpans(0, spannableString.length(), URLSpan.class);
        Intrinsics.checkNotNullExpressionValue(spans, "spans");
        for (URLSpan span : spans) {
            int spanStart = spannableString.getSpanStart(span);
            int spanEnd = spannableString.getSpanEnd(span);
            spannableString.removeSpan(span);
            C16535a c16535a = f67392c;
            Intrinsics.checkNotNullExpressionValue(span, "span");
            spannableString.setSpan(c16535a.m54543a(span, m54545f()), spanStart, spanEnd, 0);
        }
        return spannableString;
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(m54544g(charSequence), TextView.BufferType.SPANNABLE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkyTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        setMovementMethod(LinkMovementMethod.getInstance());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkyTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        setMovementMethod(LinkMovementMethod.getInstance());
    }
}
