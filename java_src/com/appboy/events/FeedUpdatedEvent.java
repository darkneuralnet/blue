package com.appboy.events;

import ch.qos.logback.core.CoreConstants;
import com.appboy.enums.CardCategory;
import com.appboy.models.cards.Card;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
/* loaded from: classes.dex */
public final class FeedUpdatedEvent {
    private static final String TAG = C43664k20.m29433n(FeedUpdatedEvent.class);
    private final List<Card> mFeedCards;
    private final boolean mFromOfflineStorage;
    private final long mTimestamp;
    private final String mUserId;

    public FeedUpdatedEvent(List<Card> list, String str, boolean z, long j) {
        this.mUserId = str;
        this.mFromOfflineStorage = z;
        list.getClass();
        this.mFeedCards = list;
        this.mTimestamp = j;
    }

    public int getCardCount(EnumSet<CardCategory> enumSet) {
        if (enumSet == null) {
            C43664k20.m29431p(TAG, "The categories passed into getCardCount are null, FeedUpdatedEvent is going to return the count of all the cards in cache.");
            return this.mFeedCards.size();
        } else if (enumSet.isEmpty()) {
            C43664k20.m29421z(TAG, "The parameters passed into categories are not valid, Braze is returning 0 in getCardCount().Please pass in a non-empty EnumSet of CardCategory.");
            return 0;
        } else {
            return getFeedCards(enumSet).size();
        }
    }

    public List<Card> getFeedCards(EnumSet<CardCategory> enumSet) {
        if (enumSet == null) {
            try {
                C43664k20.m29431p(TAG, "The categories passed to getFeedCards are null, FeedUpdatedEvent is going to return all the cards in cache.");
                enumSet = CardCategory.getAllCategories();
            } catch (Exception e) {
                String str = TAG;
                C43664k20.m29450A(str, "Unable to get cards with categories[" + enumSet + "]. Ignoring.", e);
                return null;
            }
        }
        if (enumSet.isEmpty()) {
            C43664k20.m29421z(TAG, "The parameter passed into categories is not valid, Braze is returning an empty card list.Please pass in a non-empty EnumSet of CardCategory for getFeedCards().");
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (Card card : this.mFeedCards) {
            if (card.isInCategorySet(enumSet) && !card.isExpired()) {
                arrayList.add(card);
            }
        }
        return arrayList;
    }

    public int getUnreadCardCount(EnumSet<CardCategory> enumSet) {
        if (enumSet == null) {
            C43664k20.m29421z(TAG, "The categories passed to getUnreadCardCount are null, FeedUpdatedEvent is going to return the count of all the unread cards in cache.");
            return getUnreadCardCount(CardCategory.getAllCategories());
        }
        int i = 0;
        if (enumSet.isEmpty()) {
            C43664k20.m29421z(TAG, "The parameters passed into categories are Empty, Braze is returning 0 in getUnreadCardCount().Please pass in a non-empty EnumSet of CardCategory.");
            return 0;
        }
        for (Card card : this.mFeedCards) {
            if (card.isInCategorySet(enumSet) && !card.getViewed() && !card.isExpired()) {
                i++;
            }
        }
        return i;
    }

    public boolean isFromOfflineStorage() {
        return this.mFromOfflineStorage;
    }

    public long lastUpdatedInSecondsFromEpoch() {
        return this.mTimestamp;
    }

    public String toString() {
        return "FeedUpdatedEvent{mFeedCards=" + this.mFeedCards + ", mUserId='" + this.mUserId + CoreConstants.SINGLE_QUOTE_CHAR + ", mFromOfflineStorage=" + this.mFromOfflineStorage + ", mTimestamp=" + this.mTimestamp + CoreConstants.CURLY_RIGHT;
    }
}
