package com.appboy.p027ui.widget;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.appboy.models.cards.TextAnnouncementCard;
import com.appboy.p027ui.R$drawable;
import com.appboy.p027ui.R$id;
import com.appboy.p027ui.R$layout;
import com.appboy.p027ui.feed.view.BaseFeedCardView;
import com.appboy.p027ui.widget.TextAnnouncementCardView;
/* renamed from: com.appboy.ui.widget.TextAnnouncementCardView */
/* loaded from: classes.dex */
public class TextAnnouncementCardView extends BaseFeedCardView<TextAnnouncementCard> {
    private static final String TAG = C43664k20.m29433n(TextAnnouncementCardView.class);
    private VN1 mCardAction;
    private final TextView mDescription;
    private final TextView mDomain;
    private final TextView mTitle;

    public TextAnnouncementCardView(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onSetCard$0(TextAnnouncementCard textAnnouncementCard, View view) {
        handleCardClick(this.applicationContext, textAnnouncementCard, this.mCardAction);
    }

    @Override // com.appboy.p027ui.feed.view.BaseFeedCardView
    public int getLayoutResource() {
        return R$layout.com_appboy_text_announcement_card;
    }

    public TextAnnouncementCardView(Context context, TextAnnouncementCard textAnnouncementCard) {
        super(context);
        this.mTitle = (TextView) findViewById(R$id.com_appboy_text_announcement_card_title);
        this.mDescription = (TextView) findViewById(R$id.com_appboy_text_announcement_card_description);
        this.mDomain = (TextView) findViewById(R$id.com_appboy_text_announcement_card_domain);
        if (textAnnouncementCard != null) {
            setCard(textAnnouncementCard);
        }
        setBackground(getResources().getDrawable(R$drawable.com_appboy_card_background));
    }

    @Override // com.appboy.p027ui.feed.view.BaseFeedCardView
    public void onSetCard(final TextAnnouncementCard textAnnouncementCard) {
        this.mTitle.setText(textAnnouncementCard.getTitle());
        this.mDescription.setText(textAnnouncementCard.getDescription());
        setOptionalTextView(this.mDomain, textAnnouncementCard.getDomain());
        this.mCardAction = BaseCardView.getUriActionForCard(textAnnouncementCard);
        setOnClickListener(new View.OnClickListener() { // from class: M06
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TextAnnouncementCardView.this.lambda$onSetCard$0(textAnnouncementCard, view);
            }
        });
    }
}