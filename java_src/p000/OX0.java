package p000;

import android.net.Uri;
import android.os.Bundle;
import com.appboy.enums.Channel;
/* renamed from: OX0 */
/* loaded from: classes5.dex */
public class OX0 implements JO1 {
    private static final String TAG = C43664k20.m29433n(OX0.class);

    private C42478i20 getInAppMessageManager() {
        return C42478i20.m35358s();
    }

    public static void logHtmlInAppMessageClick(InterfaceC50985wO1 interfaceC50985wO1, Bundle bundle) {
        if (bundle != null && bundle.containsKey("abButtonId")) {
            ((InterfaceC52171yO1) interfaceC50985wO1).mo3528d0(bundle.getString("abButtonId"));
        } else if (interfaceC50985wO1.mo5008h0() == EnumC52810zT2.HTML_FULL) {
            interfaceC50985wO1.logClick();
        }
    }

    public static String parseCustomEventNameFromQueryBundle(Bundle bundle) {
        return bundle.getString("name");
    }

    public static C48407s20 parsePropertiesFromQueryBundle(Bundle bundle) {
        C48407s20 c48407s20 = new C48407s20();
        for (String str : bundle.keySet()) {
            if (!str.equals("name")) {
                String string = bundle.getString(str, null);
                if (!C43318jS5.m30597g(string)) {
                    c48407s20.m14860a(str, string);
                }
            }
        }
        return c48407s20;
    }

    public static boolean parseUseWebViewFromQueryBundle(InterfaceC50985wO1 interfaceC50985wO1, Bundle bundle) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = true;
        if (bundle.containsKey("abDeepLink")) {
            z = Boolean.parseBoolean(bundle.getString("abDeepLink"));
            z2 = true;
        } else {
            z = false;
            z2 = false;
        }
        if (bundle.containsKey("abExternalOpen")) {
            z3 = Boolean.parseBoolean(bundle.getString("abExternalOpen"));
            z2 = true;
        } else {
            z3 = false;
        }
        boolean openUriInWebView = interfaceC50985wO1.getOpenUriInWebView();
        if (z2) {
            if (z || z3) {
                z4 = false;
            }
            return z4;
        }
        return openUriInWebView;
    }

    @Override // p000.JO1
    public void onCloseAction(InterfaceC50985wO1 interfaceC50985wO1, String str, Bundle bundle) {
        C43664k20.m29438i(TAG, "IInAppMessageWebViewClientListener.onCloseAction called.");
        logHtmlInAppMessageClick(interfaceC50985wO1, bundle);
        getInAppMessageManager().m35357t(true);
        getInAppMessageManager().m6653g().mo8532b(interfaceC50985wO1, str, bundle);
    }

    @Override // p000.JO1
    public void onCustomEventAction(InterfaceC50985wO1 interfaceC50985wO1, String str, Bundle bundle) {
        String str2 = TAG;
        C43664k20.m29438i(str2, "IInAppMessageWebViewClientListener.onCustomEventAction called.");
        if (getInAppMessageManager().m6659a() == null) {
            C43664k20.m29421z(str2, "Can't perform custom event action because the activity is null.");
        } else if (!getInAppMessageManager().m6653g().mo8533a(interfaceC50985wO1, str, bundle)) {
            String parseCustomEventNameFromQueryBundle = parseCustomEventNameFromQueryBundle(bundle);
            if (C43318jS5.m30597g(parseCustomEventNameFromQueryBundle)) {
                return;
            }
            P10.getInstance(getInAppMessageManager().m6659a()).logCustomEvent(parseCustomEventNameFromQueryBundle, parsePropertiesFromQueryBundle(bundle));
        }
    }

    @Override // p000.JO1
    public void onNewsfeedAction(InterfaceC50985wO1 interfaceC50985wO1, String str, Bundle bundle) {
        String str2 = TAG;
        C43664k20.m29438i(str2, "IInAppMessageWebViewClientListener.onNewsfeedAction called.");
        if (getInAppMessageManager().m6659a() == null) {
            C43664k20.m29421z(str2, "Can't perform news feed action because the cached activity is null.");
            return;
        }
        logHtmlInAppMessageClick(interfaceC50985wO1, bundle);
        if (!getInAppMessageManager().m6653g().mo8531c(interfaceC50985wO1, str, bundle)) {
            interfaceC50985wO1.mo6949K(false);
            getInAppMessageManager().m35357t(false);
            C38310b20.m65098h().mo44323d(getInAppMessageManager().m6659a(), new C39577d83(C40156e70.m43273a(interfaceC50985wO1.getExtras()), Channel.INAPP_MESSAGE));
        }
    }

    @Override // p000.JO1
    public void onOtherUrlAction(InterfaceC50985wO1 interfaceC50985wO1, String str, Bundle bundle) {
        String str2 = TAG;
        C43664k20.m29438i(str2, "IInAppMessageWebViewClientListener.onOtherUrlAction called.");
        if (getInAppMessageManager().m6659a() == null) {
            C43664k20.m29421z(str2, "Can't perform other url action because the cached activity is null. Url: " + str);
            return;
        }
        logHtmlInAppMessageClick(interfaceC50985wO1, bundle);
        if (getInAppMessageManager().m6653g().onOtherUrlAction(interfaceC50985wO1, str, bundle)) {
            C43664k20.m29424w(str2, "HTML message action listener handled url in onOtherUrlAction. Doing nothing further. Url: " + str);
            return;
        }
        boolean parseUseWebViewFromQueryBundle = parseUseWebViewFromQueryBundle(interfaceC50985wO1, bundle);
        Bundle m43273a = C40156e70.m43273a(interfaceC50985wO1.getExtras());
        m43273a.putAll(bundle);
        C32132Cf6 mo44325b = C38310b20.m65098h().mo44325b(str, m43273a, parseUseWebViewFromQueryBundle, Channel.INAPP_MESSAGE);
        if (mo44325b == null) {
            C43664k20.m29421z(str2, "UriAction is null. Not passing any URI to BrazeDeeplinkHandler. Url: " + str);
            return;
        }
        Uri m111916f = mo44325b.m111916f();
        if (C38903c20.m62017e(m111916f)) {
            C43664k20.m29421z(str2, "Not passing local uri to BrazeDeeplinkHandler. Got local uri: " + m111916f + " for url: " + str);
            return;
        }
        interfaceC50985wO1.mo6949K(false);
        getInAppMessageManager().m35357t(false);
        C38310b20.m65098h().mo44324c(getInAppMessageManager().m6659a(), mo44325b);
    }
}
