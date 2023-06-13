package com.appboy.p027ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.appboy.enums.CardCategory;
import com.appboy.events.FeedUpdatedEvent;
import com.appboy.events.IEventSubscriber;
import com.appboy.models.cards.Card;
import com.appboy.p027ui.AppboyFeedFragment;
import com.appboy.p027ui.adapters.AppboyListAdapter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
/* renamed from: com.appboy.ui.AppboyFeedFragment */
/* loaded from: classes.dex */
public class AppboyFeedFragment extends C37384Yr2 implements SwipeRefreshLayout.InterfaceC11985j {
    private static final String TAG = C43664k20.m29433n(AppboyFeedFragment.class);
    private AppboyListAdapter mAdapter;
    private EnumSet<CardCategory> mCategories;
    private LinearLayout mEmptyFeedLayout;
    private RelativeLayout mFeedRootLayout;
    private SwipeRefreshLayout mFeedSwipeLayout;
    private IEventSubscriber<FeedUpdatedEvent> mFeedUpdatedSubscriber;
    private C43170jC1 mGestureDetector;
    private ProgressBar mLoadingSpinner;
    private LinearLayout mNetworkErrorLayout;
    private View mTransparentFullBoundsContainerView;
    private final Handler mMainThreadLooper = new Handler(Looper.getMainLooper());
    private final Runnable mShowNetworkError = new Runnable() { // from class: com.appboy.ui.AppboyFeedFragment.1
        @Override // java.lang.Runnable
        public void run() {
            if (AppboyFeedFragment.this.mLoadingSpinner != null) {
                AppboyFeedFragment.this.mLoadingSpinner.setVisibility(8);
            }
            if (AppboyFeedFragment.this.mNetworkErrorLayout != null) {
                AppboyFeedFragment.this.mNetworkErrorLayout.setVisibility(0);
            }
        }
    };
    private boolean mSortEnabled = false;
    boolean mSkipCardImpressionsReset = false;
    int mPreviousVisibleHeadCardIndex = 0;
    int mCurrentCardIndexAtBottomOfScreen = 0;

    /* renamed from: com.appboy.ui.AppboyFeedFragment$FeedGestureListener */
    /* loaded from: classes.dex */
    public class FeedGestureListener extends GestureDetector.SimpleOnGestureListener {
        public FeedGestureListener() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            long eventTime = (motionEvent2.getEventTime() - motionEvent.getEventTime()) * 2;
            AppboyFeedFragment.this.getListView().smoothScrollBy(-((int) ((f2 * ((float) eventTime)) / 1000.0f)), (int) (eventTime * 2));
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            AppboyFeedFragment.this.getListView().smoothScrollBy((int) f2, 0);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onRefresh$5() {
        this.mFeedSwipeLayout.setRefreshing(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$onViewCreated$0(View view, MotionEvent motionEvent) {
        return this.mGestureDetector.m31019a(motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$onViewCreated$1(View view, MotionEvent motionEvent) {
        return view.getVisibility() == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onViewCreated$2(FeedUpdatedEvent feedUpdatedEvent, ListView listView) {
        String str = TAG;
        C43664k20.m29424w(str, "Updating feed views in response to FeedUpdatedEvent: " + feedUpdatedEvent);
        this.mMainThreadLooper.removeCallbacks(this.mShowNetworkError);
        this.mNetworkErrorLayout.setVisibility(8);
        if (feedUpdatedEvent.getCardCount(this.mCategories) == 0) {
            listView.setVisibility(8);
            this.mAdapter.clear();
        } else {
            this.mEmptyFeedLayout.setVisibility(8);
            this.mLoadingSpinner.setVisibility(8);
            this.mTransparentFullBoundsContainerView.setVisibility(8);
        }
        if (feedUpdatedEvent.isFromOfflineStorage() && (feedUpdatedEvent.lastUpdatedInSecondsFromEpoch() + 60) * 1000 < System.currentTimeMillis()) {
            C43664k20.m29431p(str, "Feed received was older than the max time to live of 60 seconds, displaying it for now, but requesting an updated view from the server.");
            P10.getInstance(getContext()).requestFeedRefresh();
            if (feedUpdatedEvent.getCardCount(this.mCategories) == 0) {
                C43664k20.m29438i(str, "Old feed was empty, putting up a network spinner and registering the network error message with a delay of 5000ms.");
                this.mEmptyFeedLayout.setVisibility(8);
                this.mLoadingSpinner.setVisibility(0);
                this.mTransparentFullBoundsContainerView.setVisibility(0);
                this.mMainThreadLooper.postDelayed(this.mShowNetworkError, 5000L);
                return;
            }
        }
        if (feedUpdatedEvent.getCardCount(this.mCategories) == 0) {
            this.mLoadingSpinner.setVisibility(8);
            this.mEmptyFeedLayout.setVisibility(0);
            this.mTransparentFullBoundsContainerView.setVisibility(0);
        } else {
            if (this.mSortEnabled && feedUpdatedEvent.getCardCount(this.mCategories) != feedUpdatedEvent.getUnreadCardCount(this.mCategories)) {
                this.mAdapter.replaceFeed(sortFeedCards(feedUpdatedEvent.getFeedCards(this.mCategories)));
            } else {
                this.mAdapter.replaceFeed(feedUpdatedEvent.getFeedCards(this.mCategories));
            }
            listView.setVisibility(0);
        }
        this.mFeedSwipeLayout.setRefreshing(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onViewCreated$3(final ListView listView, final FeedUpdatedEvent feedUpdatedEvent) {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        activity.runOnUiThread(new Runnable() { // from class: Yl
            @Override // java.lang.Runnable
            public final void run() {
                AppboyFeedFragment.this.lambda$onViewCreated$2(feedUpdatedEvent, listView);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$sortFeedCards$4(Card card, Card card2) {
        if (card.isIndicatorHighlighted() == card2.isIndicatorHighlighted()) {
            return 0;
        }
        return card.isIndicatorHighlighted() ? 1 : -1;
    }

    private void setOnScreenCardsToRead() {
        this.mAdapter.batchSetCardsToRead(this.mPreviousVisibleHeadCardIndex, this.mCurrentCardIndexAtBottomOfScreen);
    }

    public void loadFragmentStateFromSavedInstanceState(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if (this.mCategories == null) {
            this.mCategories = CardCategory.getAllCategories();
        }
        this.mPreviousVisibleHeadCardIndex = bundle.getInt("PREVIOUS_VISIBLE_HEAD_CARD_INDEX", 0);
        this.mCurrentCardIndexAtBottomOfScreen = bundle.getInt("CURRENT_CARD_INDEX_AT_BOTTOM_OF_SCREEN", 0);
        this.mSkipCardImpressionsReset = bundle.getBoolean("SKIP_CARD_IMPRESSIONS_RESET", false);
        ArrayList<String> stringArrayList = bundle.getStringArrayList("CARD_CATEGORY");
        if (stringArrayList != null) {
            this.mCategories.clear();
            Iterator<String> it = stringArrayList.iterator();
            while (it.hasNext()) {
                this.mCategories.add(CardCategory.valueOf(it.next()));
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        if (this.mAdapter == null) {
            this.mAdapter = new AppboyListAdapter(context, R$id.tag, new ArrayList());
            this.mCategories = CardCategory.getAllCategories();
        }
        this.mGestureDetector = new C43170jC1(context, new FeedGestureListener());
    }

    @Override // p000.C37384Yr2, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R$layout.com_appboy_feed, viewGroup, false);
        this.mNetworkErrorLayout = (LinearLayout) inflate.findViewById(R$id.com_appboy_feed_network_error);
        this.mLoadingSpinner = (ProgressBar) inflate.findViewById(R$id.com_appboy_feed_loading_spinner);
        this.mEmptyFeedLayout = (LinearLayout) inflate.findViewById(R$id.com_appboy_feed_empty_feed);
        this.mFeedRootLayout = (RelativeLayout) inflate.findViewById(R$id.com_appboy_feed_root);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) inflate.findViewById(R$id.appboy_feed_swipe_container);
        this.mFeedSwipeLayout = swipeRefreshLayout;
        swipeRefreshLayout.setOnRefreshListener(this);
        this.mFeedSwipeLayout.setEnabled(false);
        this.mFeedSwipeLayout.setColorSchemeResources(R$color.com_appboy_newsfeed_swipe_refresh_color_1, R$color.com_appboy_newsfeed_swipe_refresh_color_2, R$color.com_appboy_newsfeed_swipe_refresh_color_3, R$color.com_appboy_newsfeed_swipe_refresh_color_4);
        this.mTransparentFullBoundsContainerView = inflate.findViewById(R$id.com_appboy_feed_transparent_full_bounds_container_view);
        return inflate;
    }

    @Override // p000.C37384Yr2, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        P10.getInstance(getContext()).removeSingleSubscription(this.mFeedUpdatedSubscriber, FeedUpdatedEvent.class);
        setOnScreenCardsToRead();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        setListAdapter(null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        setOnScreenCardsToRead();
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.InterfaceC11985j
    public void onRefresh() {
        P10.getInstance(getContext()).requestFeedRefresh();
        this.mMainThreadLooper.postDelayed(new Runnable() { // from class: Xl
            @Override // java.lang.Runnable
            public final void run() {
                AppboyFeedFragment.this.lambda$onRefresh$5();
            }
        }, 2500L);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        P10.getInstance(getContext()).logFeedDisplayed();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("PREVIOUS_VISIBLE_HEAD_CARD_INDEX", this.mPreviousVisibleHeadCardIndex);
        bundle.putInt("CURRENT_CARD_INDEX_AT_BOTTOM_OF_SCREEN", this.mCurrentCardIndexAtBottomOfScreen);
        bundle.putBoolean("SKIP_CARD_IMPRESSIONS_RESET", this.mSkipCardImpressionsReset);
        if (this.mCategories == null) {
            this.mCategories = CardCategory.getAllCategories();
        }
        ArrayList<String> arrayList = new ArrayList<>(this.mCategories.size());
        Iterator<E> it = this.mCategories.iterator();
        while (it.hasNext()) {
            arrayList.add(((CardCategory) it.next()).name());
        }
        bundle.putStringArrayList("CARD_CATEGORY", arrayList);
        super.onSaveInstanceState(bundle);
        if (isVisible()) {
            this.mSkipCardImpressionsReset = true;
        }
    }

    @Override // p000.C37384Yr2, androidx.fragment.app.Fragment
    @SuppressLint({"InflateParams"})
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        loadFragmentStateFromSavedInstanceState(bundle);
        if (this.mSkipCardImpressionsReset) {
            this.mSkipCardImpressionsReset = false;
        } else {
            this.mAdapter.resetCardImpressionTracker();
            C43664k20.m29438i(TAG, "Resetting card impressions.");
        }
        LayoutInflater from = LayoutInflater.from(getActivity());
        final ListView listView = getListView();
        listView.addHeaderView(from.inflate(R$layout.com_appboy_feed_header, (ViewGroup) null));
        listView.addFooterView(from.inflate(R$layout.com_appboy_feed_footer, (ViewGroup) null));
        this.mFeedRootLayout.setOnTouchListener(new View.OnTouchListener() { // from class: Ul
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                boolean lambda$onViewCreated$0;
                lambda$onViewCreated$0 = AppboyFeedFragment.this.lambda$onViewCreated$0(view2, motionEvent);
                return lambda$onViewCreated$0;
            }
        });
        listView.setOnScrollListener(new AbsListView.OnScrollListener() { // from class: com.appboy.ui.AppboyFeedFragment.2
            @Override // android.widget.AbsListView.OnScrollListener
            public void onScroll(AbsListView absListView, int i, int i2, int i3) {
                boolean z;
                SwipeRefreshLayout swipeRefreshLayout = AppboyFeedFragment.this.mFeedSwipeLayout;
                if (i == 0) {
                    z = true;
                } else {
                    z = false;
                }
                swipeRefreshLayout.setEnabled(z);
                if (i2 == 0) {
                    return;
                }
                int i4 = i - 1;
                AppboyFeedFragment appboyFeedFragment = AppboyFeedFragment.this;
                if (i4 > appboyFeedFragment.mPreviousVisibleHeadCardIndex) {
                    appboyFeedFragment.mAdapter.batchSetCardsToRead(AppboyFeedFragment.this.mPreviousVisibleHeadCardIndex, i4);
                }
                AppboyFeedFragment appboyFeedFragment2 = AppboyFeedFragment.this;
                appboyFeedFragment2.mPreviousVisibleHeadCardIndex = i4;
                appboyFeedFragment2.mCurrentCardIndexAtBottomOfScreen = i + i2;
            }

            @Override // android.widget.AbsListView.OnScrollListener
            public void onScrollStateChanged(AbsListView absListView, int i) {
            }
        });
        this.mTransparentFullBoundsContainerView.setOnTouchListener(new View.OnTouchListener() { // from class: Vl
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                boolean lambda$onViewCreated$1;
                lambda$onViewCreated$1 = AppboyFeedFragment.lambda$onViewCreated$1(view2, motionEvent);
                return lambda$onViewCreated$1;
            }
        });
        P10.getInstance(getContext()).removeSingleSubscription(this.mFeedUpdatedSubscriber, FeedUpdatedEvent.class);
        this.mFeedUpdatedSubscriber = new IEventSubscriber() { // from class: Wl
            @Override // com.appboy.events.IEventSubscriber
            public final void trigger(Object obj) {
                AppboyFeedFragment.this.lambda$onViewCreated$3(listView, (FeedUpdatedEvent) obj);
            }
        };
        P10.getInstance(getContext()).subscribeToFeedUpdates(this.mFeedUpdatedSubscriber);
        listView.setAdapter((ListAdapter) this.mAdapter);
        P10.getInstance(getContext()).requestFeedRefreshFromCache();
    }

    public List<Card> sortFeedCards(List<Card> list) {
        Collections.sort(list, new Comparator() { // from class: Zl
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int lambda$sortFeedCards$4;
                lambda$sortFeedCards$4 = AppboyFeedFragment.lambda$sortFeedCards$4((Card) obj, (Card) obj2);
                return lambda$sortFeedCards$4;
            }
        });
        return list;
    }
}
