package co.bird.android.lib.webview.bridge;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002\u0006\u0007B\u000f\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005\u0082\u0001\u0002\b\t¨\u0006\n"}, m28432d2 = {"Lco/bird/android/lib/webview/bridge/WebError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "message", "", "(Ljava/lang/String;)V", "Callback", "Javascript", "Lco/bird/android/lib/webview/bridge/WebError$Callback;", "Lco/bird/android/lib/webview/bridge/WebError$Javascript;", "bridge_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes3.dex */
public abstract class WebError extends Exception {

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m28432d2 = {"Lco/bird/android/lib/webview/bridge/WebError$Callback;", "Lco/bird/android/lib/webview/bridge/WebError;", "message", "", "(Ljava/lang/String;)V", "bridge_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes3.dex */
    public static final class Callback extends WebError {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Callback(String message) {
            super("Command failed: " + message, null);
            Intrinsics.checkNotNullParameter(message, "message");
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m28432d2 = {"Lco/bird/android/lib/webview/bridge/WebError$Javascript;", "Lco/bird/android/lib/webview/bridge/WebError;", "bridge_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* loaded from: classes3.dex */
    public static final class Javascript extends WebError {
    }

    public /* synthetic */ WebError(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public WebError(String str) {
        super(str);
    }
}
