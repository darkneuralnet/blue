package com.appboy.p027ui.widget;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.appboy.models.cards.BannerImageCard;
import com.appboy.p027ui.R$drawable;
import com.appboy.p027ui.R$id;
import com.appboy.p027ui.R$layout;
import com.appboy.p027ui.feed.view.BaseFeedCardView;
import com.appboy.p027ui.widget.BannerImageCardView;
/* renamed from: com.appboy.ui.widget.BannerImageCardView */
/* loaded from: classes.dex */
public class BannerImageCardView extends BaseFeedCardView<BannerImageCard> {
    private static final String TAG = C43664k20.m29433n(BannerImageCardView.class);
    private float mAspectRatio;
    private VN1 mCardAction;
    private final ImageView mImage;

    public BannerImageCardView(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onSetCard$0(BannerImageCard bannerImageCard, View view) {
        handleCardClick(this.applicationContext, bannerImageCard, this.mCardAction);
    }

    @Override // com.appboy.p027ui.feed.view.BaseFeedCardView
    public int getLayoutResource() {
        return R$layout.com_appboy_banner_image_card;
    }

    public BannerImageCardView(Context context, BannerImageCard bannerImageCard) {
        super(context);
        this.mAspectRatio = 6.0f;
        ImageView imageView = (ImageView) getProperViewFromInflatedStub(R$id.com_appboy_banner_image_card_imageview_stub);
        this.mImage = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setAdjustViewBounds(true);
        if (bannerImageCard != null) {
            setCard(bannerImageCard);
        }
        setBackground(getResources().getDrawable(R$drawable.com_appboy_card_background));
    }

    @Override // com.appboy.p027ui.feed.view.BaseFeedCardView
    public void onSetCard(final BannerImageCard bannerImageCard) {
        if (bannerImageCard.getAspectRatio() != 0.0f) {
            this.mAspectRatio = bannerImageCard.getAspectRatio();
        }
        setImageViewToUrl(this.mImage, bannerImageCard.getImageUrl(), this.mAspectRatio, bannerImageCard);
        this.mCardAction = BaseCardView.getUriActionForCard(bannerImageCard);
        setOnClickListener(new View.OnClickListener() { // from class: px
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BannerImageCardView.this.lambda$onSetCard$0(bannerImageCard, view);
            }
        });
    }
}
