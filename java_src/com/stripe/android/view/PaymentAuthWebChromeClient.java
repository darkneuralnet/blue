package com.stripe.android.view;

import android.app.Activity;
import android.content.DialogInterface;
import android.webkit.ConsoleMessage;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import androidx.appcompat.app.DialogInterfaceC10997b;
import com.stripe.android.C18606R;
import com.stripe.android.core.Logger;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.view.PaymentAuthWebChromeClient;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J0\u0010\u000b\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m28432d2 = {"Lcom/stripe/android/view/PaymentAuthWebChromeClient;", "Landroid/webkit/WebChromeClient;", "activity", "Landroid/app/Activity;", "logger", "Lcom/stripe/android/core/Logger;", "(Landroid/app/Activity;Lcom/stripe/android/core/Logger;)V", "onConsoleMessage", "", "consoleMessage", "Landroid/webkit/ConsoleMessage;", "onJsConfirm", "view", "Landroid/webkit/WebView;", "url", "", "message", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "Landroid/webkit/JsResult;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nPaymentAuthWebChromeClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentAuthWebChromeClient.kt\ncom/stripe/android/view/PaymentAuthWebChromeClient\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,36:1\n1#2:37\n*E\n"})
/* loaded from: classes7.dex */
public final class PaymentAuthWebChromeClient extends WebChromeClient {
    private final Activity activity;
    private final Logger logger;

    public PaymentAuthWebChromeClient(Activity activity, Logger logger) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.activity = activity;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onJsConfirm$lambda$0(JsResult jsResult, DialogInterface dialogInterface, int i) {
        if (jsResult != null) {
            jsResult.confirm();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onJsConfirm$lambda$1(JsResult jsResult, DialogInterface dialogInterface, int i) {
        if (jsResult != null) {
            jsResult.cancel();
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String message;
        if (consoleMessage != null && (message = consoleMessage.message()) != null) {
            this.logger.debug(message);
        }
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsConfirm(WebView webView, String str, String str2, final JsResult jsResult) {
        new DialogInterfaceC10997b.C10998a(this.activity, C18606R.style.AlertDialogStyle).mo70294h(str2).mo70289m(17039370, new DialogInterface.OnClickListener() { // from class: AL3
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                PaymentAuthWebChromeClient.onJsConfirm$lambda$0(jsResult, dialogInterface, i);
            }
        }).mo70293i(17039360, new DialogInterface.OnClickListener() { // from class: BL3
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                PaymentAuthWebChromeClient.onJsConfirm$lambda$1(jsResult, dialogInterface, i);
            }
        }).mo70301a().show();
        return true;
    }
}
