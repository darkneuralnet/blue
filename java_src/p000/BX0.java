package p000;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.appboy.p027ui.R$layout;
import com.braze.p028ui.inappmessage.views.InAppMessageHtmlView;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.C43664k20;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0017R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, m28432d2 = {"LBX0;", "LFO1;", "Landroid/app/Activity;", "activity", "LwO1;", "inAppMessage", "Lcom/braze/ui/inappmessage/views/InAppMessageHtmlView;", "b", "LJO1;", C17296a.f69688o, "LJO1;", "inAppMessageWebViewClientListener", "<init>", "(LJO1;)V", "android-sdk-ui_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: BX0 */
/* loaded from: classes5.dex */
public final class BX0 implements FO1 {

    /* renamed from: a */
    public final JO1 f2482a;

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: BX0$a */
    /* loaded from: classes5.dex */
    public static final class C0633a extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C0633a f2483g = new C0633a();

        public C0633a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "The device is not currently in touch mode. This message requires user touch interaction to display properly.";
        }
    }

    public BX0(JO1 inAppMessageWebViewClientListener) {
        Intrinsics.checkNotNullParameter(inAppMessageWebViewClientListener, "inAppMessageWebViewClientListener");
        this.f2482a = inAppMessageWebViewClientListener;
    }

    @Override // p000.FO1
    @SuppressLint({"AddJavascriptInterface"})
    /* renamed from: b */
    public InAppMessageHtmlView mo1260a(Activity activity, InterfaceC50985wO1 inAppMessage) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        Context context = activity.getApplicationContext();
        View inflate = activity.getLayoutInflater().inflate(R$layout.com_braze_inappmessage_html, (ViewGroup) null);
        if (inflate != null) {
            InAppMessageHtmlView inAppMessageHtmlView = (InAppMessageHtmlView) inflate;
            Intrinsics.checkNotNullExpressionValue(context, "context");
            if (new X10(context).isTouchModeRequiredForHtmlInAppMessages() && C36938Wt6.m77736h(inAppMessageHtmlView)) {
                C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, null, false, C0633a.f2483g, 6, null);
                return null;
            }
            C46935pZ1 c46935pZ1 = (C46935pZ1) inAppMessage;
            C50491vZ1 c50491vZ1 = new C50491vZ1(context, c46935pZ1);
            inAppMessageHtmlView.setWebViewContent(c46935pZ1.getMessage());
            Context applicationContext = activity.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "activity.applicationContext");
            inAppMessageHtmlView.setInAppMessageWebViewClient(new EZ1(applicationContext, c46935pZ1, this.f2482a));
            inAppMessageHtmlView.getMessageWebView().addJavascriptInterface(c50491vZ1, "brazeInternalBridge");
            return inAppMessageHtmlView;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.braze.ui.inappmessage.views.InAppMessageHtmlView");
    }
}