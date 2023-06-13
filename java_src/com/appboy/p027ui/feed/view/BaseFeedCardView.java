package com.appboy.p027ui.feed.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.ViewSwitcher;
import com.appboy.models.cards.Card;
import com.appboy.models.cards.ICardListener;
import com.appboy.p027ui.R$id;
import com.appboy.p027ui.feed.AppboyFeedManager;
import com.appboy.p027ui.feed.AppboyImageSwitcher;
import com.appboy.p027ui.feed.view.BaseFeedCardView;
import com.appboy.p027ui.widget.BaseCardView;
/* renamed from: com.appboy.ui.feed.view.BaseFeedCardView */
/* loaded from: classes.dex */
public abstract class BaseFeedCardView<T extends Card> extends BaseCardView<T> {
    private static final String TAG = C43664k20.m29433n(BaseCardView.class);

    public BaseFeedCardView(Context context) {
        super(context);
        AppboyImageSwitcher appboyImageSwitcher;
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(getLayoutResource(), this);
        AppboyImageSwitcher appboyImageSwitcher2 = (AppboyImageSwitcher) findViewById(R$id.com_appboy_newsfeed_item_read_indicator_image_switcher);
        this.imageSwitcher = appboyImageSwitcher2;
        if (appboyImageSwitcher2 != null) {
            appboyImageSwitcher2.setFactory(new ViewSwitcher.ViewFactory() { // from class: JA
                @Override // android.widget.ViewSwitcher.ViewFactory
                public final View makeView() {
                    View lambda$new$0;
                    lambda$new$0 = BaseFeedCardView.this.lambda$new$0();
                    return lambda$new$0;
                }
            });
        }
        if (!isUnreadIndicatorEnabled() && (appboyImageSwitcher = this.imageSwitcher) != null) {
            appboyImageSwitcher.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ View lambda$new$0() {
        return new ImageView(this.applicationContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setCard$1() {
        setCardViewedIndicator(this.imageSwitcher, getCard());
    }

    public Card getCard() {
        return this.card;
    }

    public abstract int getLayoutResource();

    public View getProperViewFromInflatedStub(int i) {
        ((ViewStub) findViewById(i)).inflate();
        return findViewById(R$id.com_appboy_stubbed_feed_image_view);
    }

    @Override // com.appboy.p027ui.widget.BaseCardView
    public boolean isClickHandled(Context context, Card card, VN1 vn1) {
        return AppboyFeedManager.getInstance().getFeedCardClickActionListener().onFeedCardClicked(context, card, vn1);
    }

    public abstract void onSetCard(T t);

    public void setCard(T t) {
        this.card = t;
        onSetCard(t);
        this.card.setListener(new ICardListener() { // from class: IA
            @Override // com.appboy.models.cards.ICardListener
            public final void onCardUpdate() {
                BaseFeedCardView.this.lambda$setCard$1();
            }
        });
        setCardViewedIndicator(this.imageSwitcher, getCard());
    }
}
