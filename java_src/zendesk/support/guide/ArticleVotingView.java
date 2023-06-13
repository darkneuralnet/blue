package zendesk.support.guide;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import zendesk.support.ArticleVote;
import zendesk.support.ArticleVoteStorage;
import zendesk.support.HelpCenterProvider;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public class ArticleVotingView extends RelativeLayout {
    private Long articleId;
    private ArticleVote articleVote;
    private ArticleVoteStorage articleVoteStorage;
    private ImageButton downvoteButton;
    private ViewGroup downvoteButtonFrame;
    private HelpCenterProvider helpCenterProvider;
    private ImageButton upvoteButton;
    private ViewGroup upvoteButtonFrame;

    /* renamed from: zendesk.support.guide.ArticleVotingView$6 */
    /* loaded from: classes8.dex */
    public static /* synthetic */ class C313176 {
        static final /* synthetic */ int[] $SwitchMap$zendesk$support$guide$ArticleVotingView$VoteState;

        static {
            int[] iArr = new int[VoteState.values().length];
            $SwitchMap$zendesk$support$guide$ArticleVotingView$VoteState = iArr;
            try {
                iArr[VoteState.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$zendesk$support$guide$ArticleVotingView$VoteState[VoteState.UPVOTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$zendesk$support$guide$ArticleVotingView$VoteState[VoteState.DOWNVOTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: classes8.dex */
    public enum VoteState {
        UPVOTED,
        DOWNVOTED,
        NONE;

        public static VoteState fromArticleVote(ArticleVote articleVote) {
            if (articleVote != null && articleVote.getValue() != null) {
                int intValue = articleVote.getValue().intValue();
                if (intValue > 0) {
                    return UPVOTED;
                }
                if (intValue < 0) {
                    return DOWNVOTED;
                }
                return NONE;
            }
            return NONE;
        }
    }

    public ArticleVotingView(Context context) {
        super(context);
        setupViews(context);
    }

    private GradientDrawable buildButtonBackground(Context context, int i) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(C35406Qf4.zs_help_voting_button_border_corner_radius);
        int m94301c = NA0.m94301c(context, C34002Kf4.zs_help_voting_button_border);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(C35406Qf4.zs_help_voting_button_border_width);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(dimensionPixelSize);
        gradientDrawable.setColor(i);
        gradientDrawable.setStroke(dimensionPixelSize2, m94301c);
        return gradientDrawable;
    }

    private ColorStateList colorStateList(int i, int i2) {
        return new ColorStateList(new int[][]{new int[]{16843518}, new int[]{16842919}, new int[0]}, new int[]{i, i, i2});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void downvoteArticle() {
        boolean z;
        if (this.articleId == null) {
            C33694Ix2.m101447l("ViewArticleActivity", "Cannot downvote article, articleId is null. Make sure you've called bindTo()!", new Object[0]);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("hcp == null -> ");
        if (this.helpCenterProvider == null) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        C33694Ix2.m101454e("ViewArticleActivity", sb.toString(), new Object[0]);
        this.helpCenterProvider.downvoteArticle(this.articleId, new AbstractC44415lI6<ArticleVote>() { // from class: zendesk.support.guide.ArticleVotingView.4
            @Override // p000.AbstractC44415lI6
            public void onError(InterfaceC48782sg1 interfaceC48782sg1) {
                C33694Ix2.m101457b("ViewArticleActivity", "Failed to downvote article. " + interfaceC48782sg1, new Object[0]);
                ArticleVotingView articleVotingView = ArticleVotingView.this;
                articleVotingView.announceForAccessibility(articleVotingView.getResources().getString(C41127fl4.zs_view_article_voted_failed_accessibility_announce));
                ArticleVotingView articleVotingView2 = ArticleVotingView.this;
                articleVotingView2.updateButtons(VoteState.fromArticleVote(articleVotingView2.articleVote));
                ArticleVotingView.this.setVotingButtonsClickable(true);
            }

            @Override // p000.AbstractC44415lI6
            public void onSuccess(ArticleVote articleVote) {
                C33694Ix2.m101457b("ViewArticleActivity", "Successfully downvoted article!", new Object[0]);
                ArticleVotingView.this.articleVote = articleVote;
                ArticleVotingView articleVotingView = ArticleVotingView.this;
                articleVotingView.announceForAccessibility(articleVotingView.getResources().getString(C41127fl4.zs_view_article_voted_no_accessibility_announce));
                ArticleVotingView.this.articleVoteStorage.storeArticleVote(ArticleVotingView.this.articleId, articleVote);
                ArticleVotingView.this.setVotingButtonsClickable(true);
            }
        });
    }

    private StateListDrawable getVotingButtonBackground(int i) {
        GradientDrawable buildButtonBackground = buildButtonBackground(getContext(), i);
        GradientDrawable buildButtonBackground2 = buildButtonBackground(getContext(), -1);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16843518}, buildButtonBackground);
        stateListDrawable.addState(new int[]{16842919}, buildButtonBackground);
        stateListDrawable.addState(new int[0], buildButtonBackground2);
        return stateListDrawable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeVote() {
        if (this.articleId == null) {
            C33694Ix2.m101447l("ViewArticleActivity", "Article vote was null, could not remove vote", new Object[0]);
        } else if (this.articleVote.getId() != null) {
            this.helpCenterProvider.deleteVote(this.articleVote.getId(), new AbstractC44415lI6<Void>() { // from class: zendesk.support.guide.ArticleVotingView.5
                @Override // p000.AbstractC44415lI6
                public void onError(InterfaceC48782sg1 interfaceC48782sg1) {
                    C33694Ix2.m101457b("ViewArticleActivity", "Failed to remove vote. " + interfaceC48782sg1.mo9889e() + "\n" + interfaceC48782sg1.mo9892b() + "\n" + interfaceC48782sg1.mo9893a(), new Object[0]);
                    ArticleVotingView articleVotingView = ArticleVotingView.this;
                    articleVotingView.updateButtons(VoteState.fromArticleVote(articleVotingView.articleVote));
                    ArticleVotingView.this.setVotingButtonsClickable(true);
                }

                @Override // p000.AbstractC44415lI6
                public void onSuccess(Void r3) {
                    C33694Ix2.m101457b("ViewArticleActivity", "Successfully removed vote!", new Object[0]);
                    ArticleVotingView.this.articleVote = null;
                    ArticleVotingView.this.articleVoteStorage.removeStoredArticleVote(ArticleVotingView.this.articleId);
                    ArticleVotingView.this.setVotingButtonsClickable(true);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVotingButtonsClickable(boolean z) {
        this.upvoteButton.setClickable(z);
        this.downvoteButton.setClickable(z);
    }

    private void setupViews(Context context) {
        LayoutInflater.from(context).inflate(C52382yk4.zs_view_article_voting, this);
        this.upvoteButtonFrame = (ViewGroup) findViewById(C34497Mi4.upvote_button_frame);
        this.upvoteButton = (ImageButton) findViewById(C34497Mi4.upvote_button);
        this.downvoteButtonFrame = (ViewGroup) findViewById(C34497Mi4.downvote_button_frame);
        this.downvoteButton = (ImageButton) findViewById(C34497Mi4.downvote_button);
        int m115422e = C31646Ad6.m115422e(C43439jf4.colorPrimary, getContext(), C34002Kf4.zs_fallback_text_color);
        themeVotingButton(this.upvoteButton, C32139Cg4.zs_ic_thumb_up, m115422e);
        themeVotingButton(this.downvoteButton, C32139Cg4.zs_ic_thumb_down, m115422e);
        this.upvoteButton.setOnClickListener(new View.OnClickListener() { // from class: zendesk.support.guide.ArticleVotingView.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                VoteState voteState;
                ArticleVotingView.this.setVotingButtonsClickable(false);
                if (ArticleVotingView.this.articleVote != null && ArticleVotingView.this.articleVote.getValue() != null && ArticleVotingView.this.articleVote.getValue().equals(1)) {
                    voteState = VoteState.NONE;
                    ArticleVotingView.this.removeVote();
                } else {
                    voteState = VoteState.UPVOTED;
                    ArticleVotingView.this.upvoteArticle();
                }
                ArticleVotingView.this.updateButtons(voteState);
            }
        });
        this.downvoteButton.setOnClickListener(new View.OnClickListener() { // from class: zendesk.support.guide.ArticleVotingView.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                VoteState voteState;
                ArticleVotingView.this.setVotingButtonsClickable(false);
                if (ArticleVotingView.this.articleVote != null && ArticleVotingView.this.articleVote.getValue() != null && ArticleVotingView.this.articleVote.getValue().equals(-1)) {
                    voteState = VoteState.NONE;
                    ArticleVotingView.this.removeVote();
                } else {
                    voteState = VoteState.DOWNVOTED;
                    ArticleVotingView.this.downvoteArticle();
                }
                ArticleVotingView.this.updateButtons(voteState);
            }
        });
    }

    private void themeVotingButton(ImageButton imageButton, int i, int i2) {
        C38790bq6.m62553A0(imageButton, getVotingButtonBackground(i2));
        Drawable m90834r = P61.m90834r(NA0.m94299e(getContext(), i));
        P61.m90837o(m90834r, colorStateList(-1, i2));
        P61.m90836p(m90834r, PorterDuff.Mode.SRC_IN);
        imageButton.setImageDrawable(m90834r);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateButtons(VoteState voteState) {
        if (voteState == VoteState.NONE) {
            this.upvoteButtonFrame.setActivated(false);
            this.downvoteButtonFrame.setActivated(false);
        } else if (voteState == VoteState.UPVOTED) {
            this.upvoteButtonFrame.setActivated(true);
            this.downvoteButtonFrame.setActivated(false);
        } else if (voteState == VoteState.DOWNVOTED) {
            this.upvoteButtonFrame.setActivated(false);
            this.downvoteButtonFrame.setActivated(true);
        }
        updateContentDesc(voteState);
    }

    private void updateContentDesc(VoteState voteState) {
        int i = C313176.$SwitchMap$zendesk$support$guide$ArticleVotingView$VoteState[voteState.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    C33694Ix2.m101457b("ViewArticleActivity", "Unhandled voteState case", new Object[0]);
                    return;
                }
                this.upvoteButton.setContentDescription(getResources().getString(C41127fl4.zs_view_article_vote_yes_accessibility));
                this.downvoteButton.setContentDescription(getResources().getString(C41127fl4.zs_view_article_vote_yes_remove_accessibility));
                return;
            }
            this.upvoteButton.setContentDescription(getResources().getString(C41127fl4.zs_view_article_vote_no_remove_accessibility));
            this.downvoteButton.setContentDescription(getResources().getString(C41127fl4.zs_view_article_vote_no_accessibility));
            return;
        }
        this.upvoteButton.setContentDescription(getResources().getString(C41127fl4.zs_view_article_vote_yes_accessibility));
        this.downvoteButton.setContentDescription(getResources().getString(C41127fl4.zs_view_article_vote_no_accessibility));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void upvoteArticle() {
        Long l = this.articleId;
        if (l == null) {
            C33694Ix2.m101447l("ViewArticleActivity", "Cannot upvote article, articleId is null. Make sure you've called bindTo()!", new Object[0]);
        } else {
            this.helpCenterProvider.upvoteArticle(l, new AbstractC44415lI6<ArticleVote>() { // from class: zendesk.support.guide.ArticleVotingView.3
                @Override // p000.AbstractC44415lI6
                public void onError(InterfaceC48782sg1 interfaceC48782sg1) {
                    C33694Ix2.m101457b("ViewArticleActivity", "Failed to upvote article. " + interfaceC48782sg1, new Object[0]);
                    ArticleVotingView articleVotingView = ArticleVotingView.this;
                    articleVotingView.announceForAccessibility(articleVotingView.getResources().getString(C41127fl4.zs_view_article_voted_failed_accessibility_announce));
                    ArticleVotingView articleVotingView2 = ArticleVotingView.this;
                    articleVotingView2.updateButtons(VoteState.fromArticleVote(articleVotingView2.articleVote));
                    ArticleVotingView.this.setVotingButtonsClickable(true);
                }

                @Override // p000.AbstractC44415lI6
                public void onSuccess(ArticleVote articleVote) {
                    C33694Ix2.m101457b("ViewArticleActivity", "Successfully upvoted article!", new Object[0]);
                    ArticleVotingView.this.articleVote = articleVote;
                    ArticleVotingView articleVotingView = ArticleVotingView.this;
                    articleVotingView.announceForAccessibility(articleVotingView.getResources().getString(C41127fl4.zs_view_article_voted_yes_accessibility_announce));
                    ArticleVotingView.this.articleVoteStorage.storeArticleVote(ArticleVotingView.this.articleId, articleVote);
                    ArticleVotingView.this.setVotingButtonsClickable(true);
                }
            });
        }
    }

    public void bindTo(Long l, ArticleVoteStorage articleVoteStorage, HelpCenterProvider helpCenterProvider) {
        this.articleVoteStorage = articleVoteStorage;
        this.helpCenterProvider = helpCenterProvider;
        this.articleId = l;
        if (l != null) {
            ArticleVote storedArticleVote = articleVoteStorage.getStoredArticleVote(l);
            this.articleVote = storedArticleVote;
            updateButtons(VoteState.fromArticleVote(storedArticleVote));
        }
    }

    public ArticleVotingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setupViews(context);
    }

    public ArticleVotingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setupViews(context);
    }
}
