package com.braze.p028ui.contentcards.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.appboy.models.cards.BannerImageCard;
import com.appboy.p027ui.R$id;
import com.appboy.p027ui.R$layout;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\u0010"}, m28432d2 = {"Lcom/braze/ui/contentcards/view/BannerImageContentCardView;", "Lcom/braze/ui/contentcards/view/BaseContentCardView;", "Lcom/appboy/models/cards/BannerImageCard;", "Landroid/view/ViewGroup;", "viewGroup", "LbA0;", DateTokenConverter.CONVERTER_KEY, "viewHolder", "card", "", "g", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", C17296a.f69688o, "android-sdk-ui_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: com.braze.ui.contentcards.view.BannerImageContentCardView */
/* loaded from: classes5.dex */
public class BannerImageContentCardView extends BaseContentCardView<BannerImageCard> {

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, m28432d2 = {"Lcom/braze/ui/contentcards/view/BannerImageContentCardView$a;", "LbA0;", "Landroid/widget/ImageView;", "e", "Landroid/widget/ImageView;", "j", "()Landroid/widget/ImageView;", "imageView", "Landroid/view/View;", "view", "<init>", "(Lcom/braze/ui/contentcards/view/BannerImageContentCardView;Landroid/view/View;)V", "android-sdk-ui_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: com.braze.ui.contentcards.view.BannerImageContentCardView$a */
    /* loaded from: classes5.dex */
    public final class C17090a extends C38390bA0 {

        /* renamed from: e */
        public final ImageView f69055e;

        /* renamed from: f */
        public final /* synthetic */ BannerImageContentCardView f69056f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17090a(BannerImageContentCardView this$0, View view) {
            super(view, this$0.isUnreadIndicatorEnabled());
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(view, "view");
            this.f69056f = this$0;
            this.f69055e = (ImageView) view.findViewById(R$id.com_braze_content_cards_banner_image_card_image);
        }

        /* renamed from: j */
        public final ImageView m53203j() {
            return this.f69055e;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerImageContentCardView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.braze.p028ui.contentcards.view.BaseContentCardView
    /* renamed from: d */
    public C38390bA0 mo53189d(ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.com_braze_banner_image_content_card, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(view, "view");
        m53199f(view);
        return new C17090a(this, view);
    }

    @Override // com.braze.p028ui.contentcards.view.BaseContentCardView
    /* renamed from: g */
    public void mo53190b(C38390bA0 viewHolder, BannerImageCard card) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(card, "card");
        super.mo53190b(viewHolder, card);
        setOptionalCardImage(((C17090a) viewHolder).m53203j(), card.getAspectRatio(), card.getImageUrl(), card);
    }
}
