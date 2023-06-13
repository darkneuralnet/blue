package p000;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.appboy.p027ui.R$layout;
import com.braze.p028ui.inappmessage.views.InAppMessageBaseView;
import com.braze.p028ui.inappmessage.views.InAppMessageImageView;
import com.braze.p028ui.inappmessage.views.InAppMessageModalView;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.C43664k20;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0003¨\u0006\u000e"}, m28432d2 = {"LEX0;", "LFO1;", "Landroid/app/Activity;", "activity", "LwO1;", "inAppMessage", "Lcom/braze/ui/inappmessage/views/InAppMessageModalView;", "c", "", "isGraphic", "e", "<init>", "()V", C17296a.f69688o, "android-sdk-ui_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: EX0 */
/* loaded from: classes5.dex */
public final class EX0 implements FO1 {

    /* renamed from: a */
    public static final C1855a f7631a = new C1855a(null);

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"LEX0$a;", "", "", "NON_GRAPHIC_ASPECT_RATIO", "F", "<init>", "()V", "android-sdk-ui_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: EX0$a */
    /* loaded from: classes5.dex */
    public static final class C1855a {
        public /* synthetic */ C1855a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C1855a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: EX0$b */
    /* loaded from: classes5.dex */
    public static final class C1856b extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C1856b f7632g = new C1856b();

        public C1856b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Dismissing modal after frame click";
        }
    }

    /* renamed from: d */
    public static final void m108869d(EX0 this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (C42478i20.m35358s().m6654f()) {
            C43664k20.m29442e(C43664k20.f93782a, this$0, C43664k20.EnumC25082a.I, null, false, C1856b.f7632g, 6, null);
            C42478i20.m35358s().m35357t(true);
        }
    }

    @Override // p000.FO1
    /* renamed from: c */
    public InAppMessageModalView mo1260a(Activity activity, InterfaceC50985wO1 inAppMessage) {
        boolean z;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        Context applicationContext = activity.getApplicationContext();
        C51677xZ1 c51677xZ1 = (C51677xZ1) inAppMessage;
        boolean z2 = true;
        if (c51677xZ1.mo14015Y() == ZX1.GRAPHIC) {
            z = true;
        } else {
            z = false;
        }
        InAppMessageModalView m108868e = m108868e(activity, z);
        m108868e.applyInAppMessageParameters(applicationContext, c51677xZ1);
        String imageUrl = InAppMessageBaseView.getAppropriateImageUrl(c51677xZ1);
        if (imageUrl != null && imageUrl.length() != 0) {
            z2 = false;
        }
        if (!z2) {
            InterfaceC40313eO1 imageLoader = P10.getInstance(applicationContext).getImageLoader();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
            Intrinsics.checkNotNullExpressionValue(imageUrl, "imageUrl");
            ImageView messageImageView = m108868e.getMessageImageView();
            Intrinsics.checkNotNullExpressionValue(messageImageView, "view.messageImageView");
            imageLoader.mo10199a(applicationContext, inAppMessage, imageUrl, messageImageView, EnumC50778w20.IN_APP_MESSAGE_MODAL);
        }
        m108868e.getFrameView().setOnClickListener(new View.OnClickListener() { // from class: DX0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EX0.m108869d(EX0.this, view);
            }
        });
        m108868e.setMessageBackgroundColor(inAppMessage.getBackgroundColor());
        m108868e.setFrameColor(c51677xZ1.m14012x0());
        m108868e.setMessageButtons(c51677xZ1.mo14016M());
        m108868e.setMessageCloseButtonColor(c51677xZ1.m14013w0());
        if (!z) {
            m108868e.setMessage(inAppMessage.getMessage());
            m108868e.setMessageTextColor(inAppMessage.mo6950J());
            m108868e.setMessageHeaderText(c51677xZ1.mo14021E());
            m108868e.setMessageHeaderTextColor(c51677xZ1.m14010z0());
            m108868e.setMessageIcon(inAppMessage.getIcon(), inAppMessage.mo6940g0(), inAppMessage.mo6935p0());
            m108868e.setMessageHeaderTextAlignment(c51677xZ1.m14011y0());
            m108868e.setMessageTextAlign(c51677xZ1.m36214D());
            m108868e.resetMessageMargins(c51677xZ1.m106949u0());
            ImageView messageImageView2 = m108868e.getMessageImageView();
            if (messageImageView2 != null) {
                ((InAppMessageImageView) messageImageView2).setAspectRatio(2.9f);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.braze.ui.inappmessage.views.InAppMessageImageView");
            }
        }
        m108868e.setLargerCloseButtonClickArea(m108868e.getMessageCloseButtonView());
        m108868e.setupDirectionalNavigation(c51677xZ1.mo14016M().size());
        return m108868e;
    }

    @SuppressLint({"InflateParams"})
    /* renamed from: e */
    public final InAppMessageModalView m108868e(Activity activity, boolean z) {
        if (z) {
            View inflate = activity.getLayoutInflater().inflate(R$layout.com_braze_inappmessage_modal_graphic, (ViewGroup) null);
            if (inflate != null) {
                return (InAppMessageModalView) inflate;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.braze.ui.inappmessage.views.InAppMessageModalView");
        }
        View inflate2 = activity.getLayoutInflater().inflate(R$layout.com_braze_inappmessage_modal, (ViewGroup) null);
        if (inflate2 != null) {
            return (InAppMessageModalView) inflate2;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.braze.ui.inappmessage.views.InAppMessageModalView");
    }
}
