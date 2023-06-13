package p000;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.appboy.p027ui.R$layout;
import com.braze.p028ui.inappmessage.views.InAppMessageBaseView;
import com.braze.p028ui.inappmessage.views.InAppMessageSlideupView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.C43664k20;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\n"}, m28432d2 = {"LFX0;", "LFO1;", "Landroid/app/Activity;", "activity", "LwO1;", "inAppMessage", "Lcom/braze/ui/inappmessage/views/InAppMessageSlideupView;", "b", "<init>", "()V", "android-sdk-ui_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: FX0 */
/* loaded from: classes5.dex */
public final class FX0 implements FO1 {

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: FX0$a */
    /* loaded from: classes5.dex */
    public static final class C2344a extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C2344a f9593g = new C2344a();

        public C2344a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "The device is not currently in touch mode. This message requires user touch interaction to display properly.";
        }
    }

    @Override // p000.FO1
    /* renamed from: b */
    public InAppMessageSlideupView mo1260a(Activity activity, InterfaceC50985wO1 inAppMessage) {
        boolean z;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        View inflate = activity.getLayoutInflater().inflate(R$layout.com_braze_inappmessage_slideup, (ViewGroup) null);
        if (inflate != null) {
            InAppMessageSlideupView inAppMessageSlideupView = (InAppMessageSlideupView) inflate;
            if (C36938Wt6.m77736h(inAppMessageSlideupView)) {
                C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, null, false, C2344a.f9593g, 6, null);
                return null;
            }
            BZ1 bz1 = (BZ1) inAppMessage;
            Context applicationContext = activity.getApplicationContext();
            inAppMessageSlideupView.applyInAppMessageParameters(inAppMessage);
            String imageUrl = InAppMessageBaseView.getAppropriateImageUrl(bz1);
            if (imageUrl != null && imageUrl.length() != 0) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                InterfaceC40313eO1 imageLoader = P10.getInstance(applicationContext).getImageLoader();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
                Intrinsics.checkNotNullExpressionValue(imageUrl, "imageUrl");
                ImageView messageImageView = inAppMessageSlideupView.getMessageImageView();
                Intrinsics.checkNotNullExpressionValue(messageImageView, "view.messageImageView");
                imageLoader.mo10199a(applicationContext, inAppMessage, imageUrl, messageImageView, EnumC50778w20.IN_APP_MESSAGE_SLIDEUP);
            }
            inAppMessageSlideupView.setMessageBackgroundColor(bz1.getBackgroundColor());
            inAppMessageSlideupView.setMessage(bz1.getMessage());
            inAppMessageSlideupView.setMessageTextColor(bz1.mo6950J());
            inAppMessageSlideupView.setMessageTextAlign(bz1.m36214D());
            inAppMessageSlideupView.setMessageIcon(bz1.getIcon(), bz1.mo6940g0(), bz1.mo6935p0());
            inAppMessageSlideupView.setMessageChevron(bz1.m113866w0(), bz1.mo6947P());
            inAppMessageSlideupView.resetMessageMargins(bz1.m106949u0());
            return inAppMessageSlideupView;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.braze.ui.inappmessage.views.InAppMessageSlideupView");
    }
}
