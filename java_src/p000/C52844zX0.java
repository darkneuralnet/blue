package p000;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.appboy.p027ui.R$id;
import com.appboy.p027ui.R$layout;
import com.braze.p028ui.inappmessage.views.InAppMessageBaseView;
import com.braze.p028ui.inappmessage.views.InAppMessageFullView;
import com.braze.p028ui.inappmessage.views.InAppMessageImageView;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0007J \u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0006H\u0002¨\u0006\u0010"}, m28432d2 = {"LzX0;", "LFO1;", "Landroid/app/Activity;", "activity", "LwO1;", "inAppMessage", "Lcom/braze/ui/inappmessage/views/InAppMessageFullView;", "c", "", "isGraphic", "e", "view", "f", "<init>", "()V", C17296a.f69688o, "android-sdk-ui_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: zX0  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C52844zX0 implements FO1 {

    /* renamed from: a */
    public static final C31034a f121487a = new C31034a(null);

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"LzX0$a;", "", "", "BUTTONS_PRESENT_SCROLLVIEW_EXCESS_HEIGHT_VALUE_IN_DP", "I", "<init>", "()V", "android-sdk-ui_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: zX0$a */
    /* loaded from: classes5.dex */
    public static final class C31034a {
        public /* synthetic */ C31034a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C31034a() {
        }
    }

    /* renamed from: d */
    public static final void m1257d(View view, InAppMessageFullView view2, C45749nZ1 inAppMessageFull, Context applicationContext, View scrollView) {
        Intrinsics.checkNotNullParameter(view2, "$view");
        Intrinsics.checkNotNullParameter(inAppMessageFull, "$inAppMessageFull");
        int height = view.getHeight() / 2;
        ViewGroup.LayoutParams layoutParams = view2.findViewById(R$id.com_braze_inappmessage_full_text_and_button_content_parent).getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int i = marginLayoutParams.bottomMargin + marginLayoutParams.topMargin;
            if (!inAppMessageFull.mo14016M().isEmpty()) {
                Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
                i += (int) C36938Wt6.m77743a(applicationContext, 64.0d);
            }
            int min = Math.min(scrollView.getHeight(), height - i);
            Intrinsics.checkNotNullExpressionValue(scrollView, "scrollView");
            C36938Wt6.m77731m(scrollView, min);
            scrollView.requestLayout();
            view2.getMessageImageView().requestLayout();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    @Override // p000.FO1
    /* renamed from: c */
    public InAppMessageFullView mo1260a(Activity activity, InterfaceC50985wO1 inAppMessage) {
        boolean z;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        final Context applicationContext = activity.getApplicationContext();
        final C45749nZ1 c45749nZ1 = (C45749nZ1) inAppMessage;
        boolean z2 = false;
        if (c45749nZ1.mo14015Y() == ZX1.GRAPHIC) {
            z = true;
        } else {
            z = false;
        }
        final InAppMessageFullView m1256e = m1256e(activity, z);
        m1256e.createAppropriateViews(activity, c45749nZ1, z);
        String imageUrl = InAppMessageBaseView.getAppropriateImageUrl(c45749nZ1);
        if (imageUrl == null || imageUrl.length() == 0) {
            z2 = true;
        }
        if (!z2) {
            InterfaceC40313eO1 imageLoader = P10.getInstance(applicationContext).getImageLoader();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
            Intrinsics.checkNotNullExpressionValue(imageUrl, "imageUrl");
            ImageView messageImageView = m1256e.getMessageImageView();
            Intrinsics.checkNotNullExpressionValue(messageImageView, "view.messageImageView");
            imageLoader.mo10199a(applicationContext, inAppMessage, imageUrl, messageImageView, EnumC50778w20.NO_BOUNDS);
        }
        m1256e.getFrameView().setOnClickListener(null);
        m1256e.setMessageBackgroundColor(c45749nZ1.getBackgroundColor());
        m1256e.setFrameColor(c45749nZ1.m14012x0());
        m1256e.setMessageButtons(c45749nZ1.mo14016M());
        m1256e.setMessageCloseButtonColor(c45749nZ1.m14013w0());
        if (!z) {
            m1256e.setMessage(c45749nZ1.getMessage());
            m1256e.setMessageTextColor(c45749nZ1.mo6950J());
            m1256e.setMessageHeaderText(c45749nZ1.mo14021E());
            m1256e.setMessageHeaderTextColor(c45749nZ1.m14010z0());
            m1256e.setMessageHeaderTextAlignment(c45749nZ1.m14011y0());
            m1256e.setMessageTextAlign(c45749nZ1.m36214D());
            m1256e.resetMessageMargins(c45749nZ1.m106949u0());
            ImageView messageImageView2 = m1256e.getMessageImageView();
            if (messageImageView2 != null) {
                ((InAppMessageImageView) messageImageView2).setToHalfParentHeight(true);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.braze.ui.inappmessage.views.InAppMessageImageView");
            }
        }
        m1256e.setLargerCloseButtonClickArea(m1256e.getMessageCloseButtonView());
        m1255f(activity, c45749nZ1, m1256e);
        m1256e.setupDirectionalNavigation(c45749nZ1.mo14016M().size());
        final View findViewById = m1256e.findViewById(R$id.com_braze_inappmessage_full_scrollview);
        if (findViewById != null) {
            final View findViewById2 = m1256e.findViewById(R$id.com_braze_inappmessage_full_all_content_parent);
            findViewById.post(new Runnable() { // from class: yX0
                @Override // java.lang.Runnable
                public final void run() {
                    C52844zX0.m1257d(findViewById2, m1256e, c45749nZ1, applicationContext, findViewById);
                }
            });
        }
        return m1256e;
    }

    @SuppressLint({"InflateParams"})
    /* renamed from: e */
    public final InAppMessageFullView m1256e(Activity activity, boolean z) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (z) {
            View inflate = activity.getLayoutInflater().inflate(R$layout.com_braze_inappmessage_full_graphic, (ViewGroup) null);
            if (inflate != null) {
                return (InAppMessageFullView) inflate;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.braze.ui.inappmessage.views.InAppMessageFullView");
        }
        View inflate2 = activity.getLayoutInflater().inflate(R$layout.com_braze_inappmessage_full, (ViewGroup) null);
        if (inflate2 != null) {
            return (InAppMessageFullView) inflate2;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.braze.ui.inappmessage.views.InAppMessageFullView");
    }

    /* renamed from: f */
    public final boolean m1255f(Activity activity, InterfaceC50985wO1 interfaceC50985wO1, InAppMessageFullView inAppMessageFullView) {
        RelativeLayout.LayoutParams layoutParams;
        if (!C36938Wt6.m77735i(activity) || interfaceC50985wO1.mo6952F() == EnumC32300Cy3.ANY) {
            return false;
        }
        int longEdge = inAppMessageFullView.getLongEdge();
        int shortEdge = inAppMessageFullView.getShortEdge();
        if (longEdge <= 0 || shortEdge <= 0) {
            return false;
        }
        if (interfaceC50985wO1.mo6952F() == EnumC32300Cy3.LANDSCAPE) {
            layoutParams = new RelativeLayout.LayoutParams(longEdge, shortEdge);
        } else {
            layoutParams = new RelativeLayout.LayoutParams(shortEdge, longEdge);
        }
        layoutParams.addRule(13, -1);
        inAppMessageFullView.getMessageBackgroundObject().setLayoutParams(layoutParams);
        return true;
    }
}
