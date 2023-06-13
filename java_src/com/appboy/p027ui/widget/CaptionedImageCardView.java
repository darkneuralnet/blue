package com.appboy.p027ui.widget;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.appboy.models.cards.CaptionedImageCard;
import com.appboy.p027ui.R$drawable;
import com.appboy.p027ui.R$id;
import com.appboy.p027ui.R$layout;
import com.appboy.p027ui.feed.view.BaseFeedCardView;
import com.appboy.p027ui.widget.CaptionedImageCardView;
/* renamed from: com.appboy.ui.widget.CaptionedImageCardView */
/* loaded from: classes.dex */
public class CaptionedImageCardView extends BaseFeedCardView<CaptionedImageCard> {
    private static final String TAG = C43664k20.m29433n(CaptionedImageCardView.class);
    private float mAspectRatio;
    private VN1 mCardAction;
    private final TextView mDescription;
    private final TextView mDomain;
    private final ImageView mImage;
    private final TextView mTitle;

    public CaptionedImageCardView(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onSetCard$0(CaptionedImageCard captionedImageCard, View view) {
        handleCardClick(this.applicationContext, captionedImageCard, this.mCardAction);
    }

    @Override // com.appboy.p027ui.feed.view.BaseFeedCardView
    public int getLayoutResource() {
        return R$layout.com_appboy_captioned_image_card;
    }

    public CaptionedImageCardView(Context context, CaptionedImageCard captionedImageCard) {
        super(context);
        this.mAspectRatio = 1.3333334f;
        ImageView imageView = (ImageView) getProperViewFromInflatedStub(R$id.com_appboy_captioned_image_card_imageview_stub);
        this.mImage = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setAdjustViewBounds(true);
        this.mTitle = (TextView) findViewById(R$id.com_appboy_captioned_image_title);
        this.mDescription = (TextView) findViewById(R$id.com_appboy_captioned_image_description);
        this.mDomain = (TextView) findViewById(R$id.com_appboy_captioned_image_card_domain);
        if (captionedImageCard != null) {
            setCard(captionedImageCard);
        }
        setBackground(getResources().getDrawable(R$drawable.com_appboy_card_background));
    }

    @Override // com.appboy.p027ui.feed.view.BaseFeedCardView
    public void onSetCard(final CaptionedImageCard captionedImageCard) {
        this.mTitle.setText(captionedImageCard.getTitle());
        this.mDescription.setText(captionedImageCard.getDescription());
        setOptionalTextView(this.mDomain, captionedImageCard.getDomain());
        this.mCardAction = BaseCardView.getUriActionForCard(captionedImageCard);
        setOnClickListener(new View.OnClickListener() { // from class: Ae0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CaptionedImageCardView.this.lambda$onSetCard$0(captionedImageCard, view);
            }
        });
        this.mAspectRatio = captionedImageCard.getAspectRatio();
        setImageViewToUrl(this.mImage, captionedImageCard.getImageUrl(), this.mAspectRatio, captionedImageCard);
    }
}
