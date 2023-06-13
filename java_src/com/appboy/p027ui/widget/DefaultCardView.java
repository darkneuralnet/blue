package com.appboy.p027ui.widget;

import android.content.Context;
import com.appboy.models.cards.Card;
import com.appboy.p027ui.R$layout;
import com.appboy.p027ui.feed.view.BaseFeedCardView;
/* renamed from: com.appboy.ui.widget.DefaultCardView */
/* loaded from: classes.dex */
public class DefaultCardView extends BaseFeedCardView<Card> {
    private static final String TAG = C43664k20.m29433n(DefaultCardView.class);

    public DefaultCardView(Context context) {
        this(context, null);
    }

    @Override // com.appboy.p027ui.feed.view.BaseFeedCardView
    public int getLayoutResource() {
        return R$layout.com_appboy_default_card;
    }

    @Override // com.appboy.p027ui.feed.view.BaseFeedCardView
    public void onSetCard(Card card) {
        String str = TAG;
        C43664k20.m29421z(str, "onSetCard called for blank view with: " + card.toString());
    }

    public DefaultCardView(Context context, Card card) {
        super(context);
        if (card != null) {
            setCard(card);
        }
    }
}
