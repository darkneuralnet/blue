package p000;

import android.content.Context;
import android.webkit.JavascriptInterface;
import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import p000.C43664k20;
@Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0017\u001a\u00020\u0015\u0012\u0006\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b\"\u0010#J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u001c\u0010\u0007\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0007J6\u0010\u000e\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\r\u001a\u00020\f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0007J\u0012\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004H\u0007J\b\u0010\u0011\u001a\u00020\u0002H\u0007J\b\u0010\u0012\u001a\u00020\u0002H\u0007J\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0007R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0017\u0010!\u001a\u00020\u001c8G¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006$"}, m28432d2 = {"LvZ1;", "", "", "requestImmediateDataFlush", "", "eventName", "propertiesJSON", "logCustomEventWithJSON", "productId", "", "price", "currencyCode", "", "quantity", "logPurchaseWithJSON", "buttonId", "logButtonClick", "logClick", "requestPushPermission", "Ls20;", C17296a.f69688o, "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "LyO1;", "b", "LyO1;", "inAppMessage", "LCZ1;", "c", "LCZ1;", "getUser", "()LCZ1;", "user", "<init>", "(Landroid/content/Context;LyO1;)V", "android-sdk-ui_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: vZ1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C50491vZ1 {

    /* renamed from: a */
    public final Context f114280a;

    /* renamed from: b */
    public final InterfaceC52171yO1 f114281b;

    /* renamed from: c */
    public final CZ1 f114282c;

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: vZ1$a */
    /* loaded from: classes5.dex */
    public static final class C29592a extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ String f114283g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29592a(String str) {
            super(0);
            this.f114283g = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return Intrinsics.stringPlus("Failed to parse properties JSON String: ", this.f114283g);
        }
    }

    public C50491vZ1(Context context, InterfaceC52171yO1 inAppMessage) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        this.f114280a = context;
        this.f114281b = inAppMessage;
        this.f114282c = new CZ1(context);
    }

    /* renamed from: a */
    public final C48407s20 m8444a(String str) {
        if (str != null) {
            try {
                if (!Intrinsics.areEqual(str, "undefined") && !Intrinsics.areEqual(str, "null")) {
                    return new C48407s20(new JSONObject(str));
                }
                return null;
            } catch (Exception e) {
                C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.E, e, false, new C29592a(str), 4, null);
                return null;
            }
        }
        return null;
    }

    @JavascriptInterface
    public final CZ1 getUser() {
        return this.f114282c;
    }

    @JavascriptInterface
    public final void logButtonClick(String str) {
        if (str == null) {
            return;
        }
        this.f114281b.mo3528d0(str);
    }

    @JavascriptInterface
    public final void logClick() {
        this.f114281b.logClick();
    }

    @JavascriptInterface
    public final void logCustomEventWithJSON(String str, String str2) {
        P10.getInstance(this.f114280a).logCustomEvent(str, m8444a(str2));
    }

    @JavascriptInterface
    public final void logPurchaseWithJSON(String str, double d, String str2, int i, String str3) {
        P10.getInstance(this.f114280a).logPurchase(str, str2, new BigDecimal(String.valueOf(d)), i, m8444a(str3));
    }

    @JavascriptInterface
    public final void requestImmediateDataFlush() {
        P10.getInstance(this.f114280a).requestImmediateDataFlush();
    }

    @JavascriptInterface
    public final void requestPushPermission() {
        C39750dR3.m44272d(C42478i20.m35358s().m6659a());
    }
}
