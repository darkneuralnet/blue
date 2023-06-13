package p000;

import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.stripe.android.financialconnections.domain.Entry;
import com.stripe.android.model.Stripe3ds2AuthResult;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__IndentKt;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001d\u001a\u00020\u001a¢\u0006\u0004\b2\u00103J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0016J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0016J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0016J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u000fH\u0016J\b\u0010\u0015\u001a\u00020\u0004H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\fH\u0016J\u0010\u0010\u0019\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0016R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010(R\u0014\u0010-\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010(R\u0014\u00101\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00064"}, m28432d2 = {"Lfv0;", "Lev0;", "Landroid/webkit/WebView$FindListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "A", "Lio/reactivex/Observable;", "LX26;", "y", "v", "u", "w", "", Entry.TYPE_TEXT, "B", "", "shown", "x", "D", "forward", "E", "z", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "config", "F", "t", "Lco/bird/android/core/mvp/BaseActivity;", C17296a.f69688o, "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Landroid/webkit/WebView;", "b", "Landroid/webkit/WebView;", "webview", "Landroid/widget/EditText;", "c", "Landroid/widget/EditText;", "searchView", "Landroid/widget/Button;", DateTokenConverter.CONVERTER_KEY, "Landroid/widget/Button;", "previousButton", "e", "nextButton", "f", "clearButton", "Landroid/widget/TextView;", "g", "Landroid/widget/TextView;", "searchStatusTextView", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nConfigExplorerUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConfigExplorerUi.kt\nco/bird/android/app/feature/settings/config/ConfigExplorerUiImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,155:1\n1#2:156\n*E\n"})
/* renamed from: fv0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C41223fv0 implements InterfaceC40630ev0 {

    /* renamed from: a */
    public final BaseActivity f81053a;

    /* renamed from: b */
    public final WebView f81054b;

    /* renamed from: c */
    public final EditText f81055c;

    /* renamed from: d */
    public final Button f81056d;

    /* renamed from: e */
    public final Button f81057e;

    /* renamed from: f */
    public final Button f81058f;

    /* renamed from: g */
    public final TextView f81059g;

    public C41223fv0(BaseActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f81053a = activity;
        WebView webView = (WebView) C40788fB0.m41779c(activity, C36585Vg4.webview);
        this.f81054b = webView;
        this.f81055c = (EditText) C40788fB0.m41779c(activity, C36585Vg4.searchView);
        this.f81056d = (Button) C40788fB0.m41779c(activity, C36585Vg4.previousButton);
        this.f81057e = (Button) C40788fB0.m41779c(activity, C36585Vg4.nextButton);
        this.f81058f = (Button) C40788fB0.m41779c(activity, C36585Vg4.clearButton);
        this.f81059g = (TextView) C40788fB0.m41779c(activity, C36585Vg4.searchStatusTextView);
        webView.getSettings().setJavaScriptEnabled(true);
    }

    @Override // p000.InterfaceC40630ev0
    /* renamed from: A */
    public void mo40556A(WebView.FindListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f81054b.setFindListener(listener);
    }

    @Override // p000.InterfaceC40630ev0
    /* renamed from: B */
    public void mo40555B(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f81059g.setText(text);
    }

    @Override // p000.InterfaceC40630ev0
    /* renamed from: C */
    public void mo40554C() {
        this.f81054b.scrollTo(0, 0);
    }

    @Override // p000.InterfaceC40630ev0
    /* renamed from: D */
    public void mo40553D(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f81054b.findAllAsync(text);
    }

    @Override // p000.InterfaceC40630ev0
    /* renamed from: E */
    public void mo40552E(boolean z) {
        this.f81054b.findNext(z);
    }

    @Override // p000.InterfaceC40630ev0
    /* renamed from: F */
    public void mo40551F(String config) {
        boolean isBlank;
        String trimIndent;
        Intrinsics.checkNotNullParameter(config, "config");
        isBlank = StringsKt__StringsJVMKt.isBlank(config);
        if (!(!isBlank)) {
            config = null;
        }
        if (config == null) {
            config = "{}";
        }
        trimIndent = StringsKt__IndentKt.trimIndent("\n        <html>\n          <head>\n            <style>\n              body {\n                 border: 1px 0 0 0 solid black;\n                 }\n              pre {\n                 /* background-color: white; */\n                 /* border: 1px solid silver; */\n                 /* padding: 10px 20px; */\n                 /* margin: 20px; */\n                 word-wrap: break-word;\n                 white-space: pre-wrap;\n                 }\n              .json-key {\n                 color: brown;\n                 }\n              .json-value {\n                 color: navy;\n                 }\n              .json-string {\n                 color: olive;\n                 }\n            </style>\n          </head>\n          <body>\n            <pre><code id=json></code></pre>\n            <script>\n                if (!library)\n                  var library = {};\n                library.json = {\n                   replacer: function(match, pIndent, pKey, pVal, pEnd) {\n                      var key = '<span class=json-key>';\n                      var val = '<span class=json-value>';\n                      var str = '<span class=json-string>';\n                      var r = pIndent || '';\n                      if (pKey)\n                         r = r + key + pKey.replace(/[\": ]/g, '') + '</span>: ';\n                      if (pVal)\n                         r = r + (pVal[0] == '\"' ? str : val) + pVal + '</span>';\n                      return r + (pEnd || '');\n                      },\n                   prettyPrint: function(obj) {\n                      var jsonLine = /^( *)(\"[\\w]+\": )?(\"[^\"]*\"|[\\w.+-]*)?([,[{])?$/mg;\n                      return JSON.stringify(obj, null, 3)\n                         .replace(/&/g, '&amp;').replace(/\\\\\"/g, '&quot;')\n                         .replace(/</g, '&lt;').replace(/>/g, '&gt;')\n                         .replace(jsonLine, library.json.replacer);\n                      }\n                   };\n                var config = " + config + ";\n                document.getElementById(\"json\").innerHTML = library.json.prettyPrint(config);\n            </script>\n          </body>\n        </html>\n      ");
        this.f81054b.loadData(trimIndent, "text/html; charset=UTF-8", null);
    }

    @Override // p000.InterfaceC40630ev0
    /* renamed from: t */
    public void mo40550t(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f81053a.setTitle(text);
    }

    @Override // p000.InterfaceC40630ev0
    /* renamed from: u */
    public Observable<Unit> mo40549u() {
        return C44626lf5.clicksThrottle$default(this.f81057e, 0L, 1, null);
    }

    @Override // p000.InterfaceC40630ev0
    /* renamed from: v */
    public Observable<Unit> mo40548v() {
        return C44626lf5.clicksThrottle$default(this.f81056d, 0L, 1, null);
    }

    @Override // p000.InterfaceC40630ev0
    /* renamed from: w */
    public Observable<Unit> mo40547w() {
        return C44626lf5.clicksThrottle$default(this.f81058f, 0L, 1, null);
    }

    @Override // p000.InterfaceC40630ev0
    /* renamed from: x */
    public void mo40546x(boolean z) {
        C49520tu6.show$default(this.f81056d, z, 0, 2, null);
        C49520tu6.show$default(this.f81057e, z, 0, 2, null);
        C49520tu6.show$default(this.f81059g, z, 0, 2, null);
        C49520tu6.show$default(this.f81058f, z, 0, 2, null);
    }

    @Override // p000.InterfaceC40630ev0
    /* renamed from: y */
    public Observable<X26> mo40545y() {
        return C40475ef5.m42644c(this.f81055c);
    }

    @Override // p000.InterfaceC40630ev0
    /* renamed from: z */
    public void mo40544z() {
        this.f81054b.clearMatches();
        this.f81055c.getText().clear();
    }
}
