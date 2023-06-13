package com.appboy.p027ui.widget;

import android.content.Context;
import android.os.Bundle;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import com.appboy.models.cards.Card;
import com.appboy.p027ui.R$drawable;
import com.appboy.p027ui.R$string;
import com.appboy.p027ui.feed.AppboyImageSwitcher;
import com.stripe.android.financialconnections.domain.Entry;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import p000.C43664k20;
@Metadata(m28433d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\b&\u0018\u0000 ,*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0001,B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b*\u0010+J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J&\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0001J\u0016\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u0001J\"\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0004J\"\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H$R\u0014\u0010\u001b\u001a\u00020\u00148\u0004X\u0085\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0017\u0010\u001d\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0018\u0010\u000f\u001a\u0004\u0018\u00018\u00008\u0004@\u0004X\u0085\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010!R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\"R\u0016\u0010$\u001a\u00020#8\u0004@\u0004X\u0085\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010&\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0011\u0010(\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006-"}, m28432d2 = {"Lcom/appboy/ui/widget/BaseCardView;", "Lcom/appboy/models/cards/Card;", "T", "Landroid/widget/RelativeLayout;", "Landroid/widget/TextView;", "view", "", Entry.TYPE_TEXT, "", "setOptionalTextView", "Landroid/widget/ImageView;", "imageView", "imageUrl", "", "placeholderAspectRatio", "card", "setImageViewToUrl", "Lcom/appboy/ui/feed/AppboyImageSwitcher;", "imageSwitcher", "setCardViewedIndicator", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "LVN1;", "cardAction", "handleCardClick", "", "isClickHandled", "applicationContext", "Landroid/content/Context;", "classLogTag", "Ljava/lang/String;", "getClassLogTag", "()Ljava/lang/String;", "Lcom/appboy/models/cards/Card;", "Lcom/appboy/ui/feed/AppboyImageSwitcher;", "LX10;", "configurationProvider", "LX10;", "isUnreadCardVisualIndicatorEnabled", "Z", "isUnreadIndicatorEnabled", "()Z", "<init>", "(Landroid/content/Context;)V", "Companion", "android-sdk-ui_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: com.appboy.ui.widget.BaseCardView */
/* loaded from: classes.dex */
public abstract class BaseCardView<T extends Card> extends RelativeLayout {
    public static final Companion Companion = new Companion(null);
    @JvmField
    protected final Context applicationContext;
    @JvmField
    protected T card;
    private final String classLogTag;
    @JvmField
    protected X10 configurationProvider;
    @JvmField
    public AppboyImageSwitcher imageSwitcher;
    private boolean isUnreadCardVisualIndicatorEnabled;

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0005R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, m28432d2 = {"Lcom/appboy/ui/widget/BaseCardView$Companion;", "", "Lcom/appboy/models/cards/Card;", "card", "LCf6;", "getUriActionForCard", "", "ICON_READ_TAG", "Ljava/lang/String;", "ICON_UNREAD_TAG", "", "SQUARE_ASPECT_RATIO", "F", "<init>", "()V", "android-sdk-ui_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: com.appboy.ui.widget.BaseCardView$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final C32132Cf6 getUriActionForCard(Card card) {
            Intrinsics.checkNotNullParameter(card, "card");
            Bundle bundle = new Bundle();
            for (String str : card.getExtras().keySet()) {
                bundle.putString(str, card.getExtras().get(str));
            }
            String url = card.getUrl();
            if (url == null) {
                C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.V, null, false, BaseCardView$Companion$getUriActionForCard$1.INSTANCE, 6, null);
                return null;
            }
            return C38310b20.f56803a.m65097a().mo44325b(url, bundle, card.getOpenUriInWebView(), card.getChannel());
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseCardView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        this.applicationContext = applicationContext;
        this.classLogTag = C43664k20.m29433n(getClass());
        X10 x10 = new X10(context);
        this.configurationProvider = x10;
        this.isUnreadCardVisualIndicatorEnabled = x10.isNewsfeedVisualIndicatorOn();
    }

    @JvmStatic
    public static final C32132Cf6 getUriActionForCard(Card card) {
        return Companion.getUriActionForCard(card);
    }

    public final void handleCardClick(Context context, Card card, VN1 vn1) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(card, "card");
        C43664k20 c43664k20 = C43664k20.f93782a;
        C43664k20.EnumC25082a enumC25082a = C43664k20.EnumC25082a.V;
        C43664k20.m29442e(c43664k20, this, enumC25082a, null, false, new BaseCardView$handleCardClick$1(card), 6, null);
        card.setIndicatorHighlighted(true);
        if (!isClickHandled(context, card, vn1)) {
            if (vn1 != null) {
                card.logClick();
                C43664k20.m29442e(c43664k20, this, enumC25082a, null, false, new BaseCardView$handleCardClick$2(card), 6, null);
                if (vn1 instanceof C32132Cf6) {
                    C38310b20.f56803a.m65097a().mo44324c(context, (C32132Cf6) vn1);
                    return;
                }
                C43664k20.m29442e(c43664k20, this, null, null, false, new BaseCardView$handleCardClick$3(card), 7, null);
                vn1.mo44583a(context);
                return;
            }
            C43664k20.m29442e(c43664k20, this, enumC25082a, null, false, new BaseCardView$handleCardClick$4(card), 6, null);
            return;
        }
        C43664k20.m29442e(c43664k20, this, null, null, false, new BaseCardView$handleCardClick$5(card), 7, null);
        card.logClick();
    }

    public abstract boolean isClickHandled(Context context, Card card, VN1 vn1);

    public final boolean isUnreadIndicatorEnabled() {
        return this.isUnreadCardVisualIndicatorEnabled;
    }

    public final void setCardViewedIndicator(AppboyImageSwitcher imageSwitcher, Card card) {
        Intrinsics.checkNotNullParameter(imageSwitcher, "imageSwitcher");
        Intrinsics.checkNotNullParameter(card, "card");
        int i = R$string.com_braze_image_is_read_tag_key;
        Object tag = imageSwitcher.getTag(i);
        if (tag == null) {
            tag = "";
        }
        if (card.isIndicatorHighlighted()) {
            if (!Intrinsics.areEqual(tag, "icon_read")) {
                if (imageSwitcher.getReadIcon() != null) {
                    imageSwitcher.setImageDrawable(imageSwitcher.getReadIcon());
                } else {
                    imageSwitcher.setImageResource(R$drawable.com_braze_content_card_icon_read);
                }
                imageSwitcher.setTag(i, "icon_read");
            }
        } else if (!Intrinsics.areEqual(tag, "icon_unread")) {
            if (imageSwitcher.getUnReadIcon() != null) {
                imageSwitcher.setImageDrawable(imageSwitcher.getUnReadIcon());
            } else {
                imageSwitcher.setImageResource(R$drawable.com_braze_content_card_icon_unread);
            }
            imageSwitcher.setTag(i, "icon_unread");
        }
    }

    public final void setImageViewToUrl(final ImageView imageView, String imageUrl, final float f, Card card) {
        boolean z;
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(card, "card");
        int i = R$string.com_braze_image_resize_tag_key;
        if (!Intrinsics.areEqual(imageUrl, imageView.getTag(i))) {
            boolean z2 = true;
            if (f == 1.0f) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                if (f != 0.0f) {
                    z2 = false;
                }
                if (!z2) {
                    ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.appboy.ui.widget.BaseCardView$setImageViewToUrl$1
                            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                            public void onGlobalLayout() {
                                int width = imageView.getWidth();
                                imageView.setLayoutParams(new RelativeLayout.LayoutParams(width, (int) (width / f)));
                                imageView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                            }
                        });
                    }
                }
            }
            imageView.setImageResource(17170445);
            InterfaceC40313eO1 imageLoader = P10.getInstance(getContext()).getImageLoader();
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            imageLoader.mo10197c(context, card, imageUrl, imageView, EnumC50778w20.BASE_CARD_VIEW);
            imageView.setTag(i, imageUrl);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0014  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setOptionalTextView(TextView view, String str) {
        boolean z;
        boolean isBlank;
        Intrinsics.checkNotNullParameter(view, "view");
        if (str != null) {
            isBlank = StringsKt__StringsJVMKt.isBlank(str);
            if (!isBlank) {
                z = false;
                if (z) {
                    view.setText(str);
                    view.setVisibility(0);
                    return;
                }
                view.setText("");
                view.setVisibility(8);
                return;
            }
        }
        z = true;
        if (z) {
        }
    }
}
