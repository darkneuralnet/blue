package p000;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00052\u00020\u0001:\u0002\u000b\bB\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0010¨\u0006\u0014"}, m28432d2 = {"LoA6;", "", "Landroid/webkit/WebView;", "view", "", "c", "Ljava/io/PrintWriter;", "writer", "b", "", "LoA6$b;", C17296a.f69688o, "Ljava/util/Set;", "webViews", "", "", "Ljava/util/Map;", "webViewHTMLs", "<init>", "()V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
@SuppressLint({"NewApi", "StringFormatUse", "DefaultLocale", "BadMethodUse-java.lang.String.length"})
/* renamed from: oA6  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C46122oA6 {

    /* renamed from: c */
    public static final C26852a f101550c = new C26852a(null);

    /* renamed from: a */
    public final Set<C26853b> f101551a = new LinkedHashSet();

    /* renamed from: b */
    public final Map<String, String> f101552b = new LinkedHashMap();

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, m28432d2 = {"LoA6$a;", "", "LoA6$b;", MessageExtension.FIELD_DATA, "", "html", "b", "GET_WEBVIEW_HTML_JS_SCRIPT", "Ljava/lang/String;", "<init>", "()V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: oA6$a */
    /* loaded from: classes5.dex */
    public static final class C26852a {
        private C26852a() {
        }

        /* renamed from: b */
        public final String m21672b(C26853b c26853b, String str) {
            String replace$default;
            String replace$default2;
            String replace$default3;
            replace$default = StringsKt__StringsJVMKt.replace$default(str, "\\u003C", "<", false, 4, (Object) null);
            replace$default2 = StringsKt__StringsJVMKt.replace$default(replace$default, "\\n", "", false, 4, (Object) null);
            replace$default3 = StringsKt__StringsJVMKt.replace$default(replace$default2, "\\\"", "\"", false, 4, (Object) null);
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String substring = replace$default3.substring(1, replace$default3.length() - 1);
            Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            String format = String.format("<html id=\"%s\" data-rect=\"%d,%d,%d,%d\">%s</html>", Arrays.copyOf(new Object[]{c26853b.m21670b(), Integer.valueOf(c26853b.m21669c()), Integer.valueOf(c26853b.m21668d()), Integer.valueOf(c26853b.m21667e()), Integer.valueOf(c26853b.m21671a()), substring}, 6));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
            return format;
        }

        public /* synthetic */ C26852a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000 \u00162\u00020\u0001:\u0001\u0003B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u000e\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\t\u001a\u0004\b\r\u0010\u000bR\u0017\u0010\u0010\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\r\u0010\t\u001a\u0004\b\u000f\u0010\u000bR\u0017\u0010\u0011\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\t\u001a\u0004\b\u0003\u0010\u000b¨\u0006\u0017"}, m28432d2 = {"LoA6$b;", "", "", C17296a.f69688o, "Ljava/lang/String;", "b", "()Ljava/lang/String;", "key", "", "I", "c", "()I", "left", DateTokenConverter.CONVERTER_KEY, "top", "e", "width", "height", "Landroid/webkit/WebView;", "webView", "<init>", "(Landroid/webkit/WebView;)V", "g", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: oA6$b */
    /* loaded from: classes5.dex */
    public static final class C26853b {

        /* renamed from: a */
        public final String f101555a;

        /* renamed from: b */
        public final int f101556b;

        /* renamed from: c */
        public final int f101557c;

        /* renamed from: d */
        public final int f101558d;

        /* renamed from: e */
        public final int f101559e;

        /* renamed from: g */
        public static final C26854a f101554g = new C26854a(null);

        /* renamed from: f */
        public static final int[] f101553f = new int[2];

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"LoA6$b$a;", "", "", "location", "[I", "<init>", "()V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
        /* renamed from: oA6$b$a */
        /* loaded from: classes5.dex */
        public static final class C26854a {
            private C26854a() {
            }

            public /* synthetic */ C26854a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public C26853b(WebView webView) {
            Intrinsics.checkNotNullParameter(webView, "webView");
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format("%s{%s}", Arrays.copyOf(new Object[]{webView.getClass().getName(), Integer.toHexString(webView.hashCode())}, 2));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
            this.f101555a = format;
            int[] iArr = f101553f;
            webView.getLocationOnScreen(iArr);
            this.f101556b = iArr[0];
            this.f101557c = iArr[1];
            this.f101558d = webView.getWidth();
            this.f101559e = webView.getHeight();
        }

        /* renamed from: a */
        public final int m21671a() {
            return this.f101559e;
        }

        /* renamed from: b */
        public final String m21670b() {
            return this.f101555a;
        }

        /* renamed from: c */
        public final int m21669c() {
            return this.f101556b;
        }

        /* renamed from: d */
        public final int m21668d() {
            return this.f101557c;
        }

        /* renamed from: e */
        public final int m21667e() {
            return this.f101558d;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "kotlin.jvm.PlatformType", "html", "", C17296a.f69688o, "(Ljava/lang/String;)V"}, m28431k = 3, m28430mv = {1, 4, 0})
    /* renamed from: oA6$c */
    /* loaded from: classes5.dex */
    public static final class C26855c<T> implements ValueCallback<String> {

        /* renamed from: b */
        public final /* synthetic */ C26853b f101561b;

        public C26855c(C26853b c26853b) {
            this.f101561b = c26853b;
        }

        @Override // android.webkit.ValueCallback
        /* renamed from: a */
        public final void onReceiveValue(String html) {
            Map map = C46122oA6.this.f101552b;
            String m21670b = this.f101561b.m21670b();
            Intrinsics.checkNotNullExpressionValue(html, "html");
            map.put(m21670b, html);
        }
    }

    /* renamed from: b */
    public final void m21675b(PrintWriter writer) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        try {
            for (C26853b c26853b : this.f101551a) {
                String str = this.f101552b.get(c26853b.m21670b());
                if (str != null) {
                    writer.print("WebView HTML for ");
                    writer.print(c26853b);
                    writer.println(":");
                    writer.println(f101550c.m21672b(c26853b, str));
                }
            }
        } catch (Exception unused) {
        }
        this.f101551a.clear();
        this.f101552b.clear();
    }

    /* renamed from: c */
    public final void m21674c(WebView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        C26853b c26853b = new C26853b(view);
        this.f101551a.add(c26853b);
        Resources resources = view.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "view.resources");
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format("(function() {  try {    const leftOf = %d;    const topOf = %d;    const density = %f;    const elements = Array.from(document.querySelectorAll('body, body *'));    for (const el of elements) {      const rect = el.getBoundingClientRect();      const left = Math.round(leftOf + rect.left * density);      const top = Math.round(topOf + rect.top * density);      const width = Math.round(rect.width * density);      const height = Math.round(rect.height * density);      el.setAttribute('data-rect', `${left},${top},${width},${height}`);      const style = window.getComputedStyle(el);      const hidden = style.display === 'none' || style.visibility !== 'visible' || el.getAttribute('hidden') === 'true';      const disabled = el.disabled || el.getAttribute('aria-disabled') === 'true';      const focused = el === document.activeElement;      if (hidden || disabled || focused) {        el.setAttribute('data-flag', `${hidden ? 'H' : ''}${disabled ? 'D' : ''}${focused ? 'F' : ''}`);      } else {        el.removeAttribute('data-flag');      }    }    document.activeElement.setAttribute('focused', 'true');    const doc = document.cloneNode(true);    for (const el of Array.from(doc.querySelectorAll('script, link'))) {      el.remove();    }    for (const el of Array.from(doc.querySelectorAll('*'))) {      el.removeAttribute('class');    }    return doc.getElementsByTagName('body')[0].outerHTML.trim();  } catch (e) {    return 'Failed: ' + e;  }})();", Arrays.copyOf(new Object[]{Integer.valueOf(c26853b.m21669c()), Integer.valueOf(c26853b.m21668d()), Float.valueOf(displayMetrics.scaledDensity)}, 3));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        view.evaluateJavascript(format, new C26855c(c26853b));
    }
}
