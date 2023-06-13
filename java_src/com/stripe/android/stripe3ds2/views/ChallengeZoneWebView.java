package com.stripe.android.stripe3ds2.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.stripe3ds2.databinding.StripeChallengeZoneWebViewBinding;
import com.stripe.android.stripe3ds2.views.ChallengeZoneWebView;
import com.stripe.android.stripe3ds2.views.ThreeDS2WebViewClient;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
@Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\b\u0000\u0018\u0000 !2\u00020\u00012\u00020\u0002:\u0001!B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0010\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0011J\u0012\u0010\u001c\u001a\u00020\u001a2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u0010\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u0011H\u0002J\u0010\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u0011H\u0002J\u0015\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u0011H\u0001¢\u0006\u0002\b R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0011@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006\""}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/views/ChallengeZoneWebView;", "Landroid/widget/FrameLayout;", "Lcom/stripe/android/stripe3ds2/views/FormField;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "onClickListener", "Landroid/view/View$OnClickListener;", "getOnClickListener$3ds2sdk_release", "()Landroid/view/View$OnClickListener;", "setOnClickListener$3ds2sdk_release", "(Landroid/view/View$OnClickListener;)V", "<set-?>", "", "userEntry", "getUserEntry", "()Ljava/lang/String;", "webView", "Lcom/stripe/android/stripe3ds2/views/ThreeDS2WebView;", "getWebView", "()Lcom/stripe/android/stripe3ds2/views/ThreeDS2WebView;", "loadHtml", "", "html", "setOnClickListener", "transformFormActionUrl", "transformFormMethod", "transformHtml", "transformHtml$3ds2sdk_release", "Companion", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class ChallengeZoneWebView extends FrameLayout implements FormField {
    @Deprecated
    private static final String ENCODING = "UTF-8";
    @Deprecated
    private static final String HTML_MIME_TYPE = "text/html";
    @Deprecated
    private static final String METHOD_GET = "method=\"get\"";
    private View.OnClickListener onClickListener;
    private String userEntry;
    private final ThreeDS2WebView webView;
    private static final Companion Companion = new Companion(null);
    @Deprecated
    private static final Pattern PATTERN_METHOD_POST = Pattern.compile("method=\"post\"", 10);
    @Deprecated
    private static final Pattern PATTERN_FORM_ACTION = Pattern.compile("action=\"(.+?)\"", 10);

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/views/ChallengeZoneWebView$Companion;", "", "()V", "ENCODING", "", "HTML_MIME_TYPE", "METHOD_GET", "PATTERN_FORM_ACTION", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "PATTERN_METHOD_POST", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ChallengeZoneWebView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(ChallengeZoneWebView this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (str == null) {
            str = "";
        }
        this$0.userEntry = str;
        View.OnClickListener onClickListener = this$0.onClickListener;
        if (onClickListener != null) {
            onClickListener.onClick(this$0);
        }
    }

    private final String transformFormActionUrl(String str) {
        String group;
        Matcher matcher = PATTERN_FORM_ACTION.matcher(str);
        if (matcher.find() && (group = matcher.group(1)) != null && !Intrinsics.areEqual(ThreeDS2WebViewClient.CHALLENGE_URL, group)) {
            return new Regex(group).replace(str, ThreeDS2WebViewClient.CHALLENGE_URL);
        }
        return str;
    }

    private final String transformFormMethod(String str) {
        String replaceAll = PATTERN_METHOD_POST.matcher(str).replaceAll(METHOD_GET);
        Intrinsics.checkNotNullExpressionValue(replaceAll, "methodMatcher.replaceAll(METHOD_GET)");
        return replaceAll;
    }

    public final View.OnClickListener getOnClickListener$3ds2sdk_release() {
        return this.onClickListener;
    }

    @Override // com.stripe.android.stripe3ds2.views.FormField
    public String getUserEntry() {
        return this.userEntry;
    }

    public final ThreeDS2WebView getWebView() {
        return this.webView;
    }

    public final void loadHtml(String str) {
        if (str == null) {
            return;
        }
        this.webView.loadDataWithBaseURL(null, transformHtml$3ds2sdk_release(str), "text/html", "UTF-8", null);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

    public final void setOnClickListener$3ds2sdk_release(View.OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

    public final String transformHtml$3ds2sdk_release(String html) {
        Intrinsics.checkNotNullParameter(html, "html");
        return transformFormActionUrl(transformFormMethod(html));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ChallengeZoneWebView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ChallengeZoneWebView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ChallengeZoneWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.userEntry = "";
        StripeChallengeZoneWebViewBinding inflate = StripeChallengeZoneWebViewBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(\n            Lay…           this\n        )");
        ThreeDS2WebView threeDS2WebView = inflate.webView;
        Intrinsics.checkNotNullExpressionValue(threeDS2WebView, "viewBinding.webView");
        this.webView = threeDS2WebView;
        threeDS2WebView.setOnHtmlSubmitListener$3ds2sdk_release(new ThreeDS2WebViewClient.OnHtmlSubmitListener() { // from class: Ch0
            @Override // com.stripe.android.stripe3ds2.views.ThreeDS2WebViewClient.OnHtmlSubmitListener
            public final void onHtmlSubmit(String str) {
                ChallengeZoneWebView._init_$lambda$0(ChallengeZoneWebView.this, str);
            }
        });
    }
}
