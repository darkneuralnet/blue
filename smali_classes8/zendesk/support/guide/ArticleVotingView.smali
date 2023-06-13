.class Lzendesk/support/guide/ArticleVotingView;
.super Landroid/widget/RelativeLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lzendesk/support/guide/ArticleVotingView$VoteState;
    }
.end annotation


# instance fields
.field private articleId:Ljava/lang/Long;

.field private articleVote:Lzendesk/support/ArticleVote;

.field private articleVoteStorage:Lzendesk/support/ArticleVoteStorage;

.field private downvoteButton:Landroid/widget/ImageButton;

.field private downvoteButtonFrame:Landroid/view/ViewGroup;

.field private helpCenterProvider:Lzendesk/support/HelpCenterProvider;

.field private upvoteButton:Landroid/widget/ImageButton;

.field private upvoteButtonFrame:Landroid/view/ViewGroup;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    invoke-direct {p0, p1}, Lzendesk/support/guide/ArticleVotingView;->setupViews(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    invoke-direct {p0, p1}, Lzendesk/support/guide/ArticleVotingView;->setupViews(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    invoke-direct {p0, p1}, Lzendesk/support/guide/ArticleVotingView;->setupViews(Landroid/content/Context;)V

    return-void
.end method

.method public static synthetic access$000(Lzendesk/support/guide/ArticleVotingView;Z)V
    .locals 0

    invoke-direct {p0, p1}, Lzendesk/support/guide/ArticleVotingView;->setVotingButtonsClickable(Z)V

    return-void
.end method

.method public static synthetic access$100(Lzendesk/support/guide/ArticleVotingView;)Lzendesk/support/ArticleVote;
    .locals 0

    iget-object p0, p0, Lzendesk/support/guide/ArticleVotingView;->articleVote:Lzendesk/support/ArticleVote;

    return-object p0
.end method

.method public static synthetic access$102(Lzendesk/support/guide/ArticleVotingView;Lzendesk/support/ArticleVote;)Lzendesk/support/ArticleVote;
    .locals 0

    iput-object p1, p0, Lzendesk/support/guide/ArticleVotingView;->articleVote:Lzendesk/support/ArticleVote;

    return-object p1
.end method

.method public static synthetic access$200(Lzendesk/support/guide/ArticleVotingView;)V
    .locals 0

    invoke-direct {p0}, Lzendesk/support/guide/ArticleVotingView;->removeVote()V

    return-void
.end method

.method public static synthetic access$300(Lzendesk/support/guide/ArticleVotingView;)V
    .locals 0

    invoke-direct {p0}, Lzendesk/support/guide/ArticleVotingView;->upvoteArticle()V

    return-void
.end method

.method public static synthetic access$400(Lzendesk/support/guide/ArticleVotingView;Lzendesk/support/guide/ArticleVotingView$VoteState;)V
    .locals 0

    invoke-direct {p0, p1}, Lzendesk/support/guide/ArticleVotingView;->updateButtons(Lzendesk/support/guide/ArticleVotingView$VoteState;)V

    return-void
.end method

.method public static synthetic access$500(Lzendesk/support/guide/ArticleVotingView;)V
    .locals 0

    invoke-direct {p0}, Lzendesk/support/guide/ArticleVotingView;->downvoteArticle()V

    return-void
.end method

.method public static synthetic access$600(Lzendesk/support/guide/ArticleVotingView;)Ljava/lang/Long;
    .locals 0

    iget-object p0, p0, Lzendesk/support/guide/ArticleVotingView;->articleId:Ljava/lang/Long;

    return-object p0
.end method

.method public static synthetic access$700(Lzendesk/support/guide/ArticleVotingView;)Lzendesk/support/ArticleVoteStorage;
    .locals 0

    iget-object p0, p0, Lzendesk/support/guide/ArticleVotingView;->articleVoteStorage:Lzendesk/support/ArticleVoteStorage;

    return-object p0
.end method

.method private buildButtonBackground(Landroid/content/Context;I)Landroid/graphics/drawable/GradientDrawable;
    .locals 4

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, LQf4;->zs_help_voting_button_border_corner_radius:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    sget v1, LKf4;->zs_help_voting_button_border:I

    invoke-static {p1, v1}, LNA0;->c(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget v2, LQf4;->zs_help_voting_button_border_width:I

    invoke-virtual {p1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p1

    new-instance v2, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v2}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    int-to-float v0, v0

    invoke-virtual {v2, v0}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    invoke-virtual {v2, p2}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    invoke-virtual {v2, p1, v1}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    return-object v2
.end method

.method private colorStateList(II)Landroid/content/res/ColorStateList;
    .locals 6

    const/4 v0, 0x3

    new-array v1, v0, [[I

    const/4 v2, 0x1

    new-array v3, v2, [I

    const v4, 0x10102fe

    const/4 v5, 0x0

    aput v4, v3, v5

    aput-object v3, v1, v5

    new-array v3, v2, [I

    const v4, 0x10100a7

    aput v4, v3, v5

    aput-object v3, v1, v2

    new-array v3, v5, [I

    const/4 v4, 0x2

    aput-object v3, v1, v4

    new-array v0, v0, [I

    aput p1, v0, v5

    aput p1, v0, v2

    aput p2, v0, v4

    new-instance p1, Landroid/content/res/ColorStateList;

    invoke-direct {p1, v1, v0}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    return-object p1
.end method

.method private downvoteArticle()V
    .locals 4

    iget-object v0, p0, Lzendesk/support/guide/ArticleVotingView;->articleId:Ljava/lang/Long;

    const-string v1, "ViewArticleActivity"

    const/4 v2, 0x0

    if-nez v0, :cond_0

    const-string v0, "Cannot downvote article, articleId is null. Make sure you\'ve called bindTo()!"

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v1, v0, v2}, LIx2;->l(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "hcp == null -> "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lzendesk/support/guide/ArticleVotingView;->helpCenterProvider:Lzendesk/support/HelpCenterProvider;

    if-nez v3, :cond_1

    const/4 v3, 0x1

    goto :goto_0

    :cond_1
    move v3, v2

    :goto_0
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v1, v0, v2}, LIx2;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lzendesk/support/guide/ArticleVotingView;->helpCenterProvider:Lzendesk/support/HelpCenterProvider;

    iget-object v1, p0, Lzendesk/support/guide/ArticleVotingView;->articleId:Ljava/lang/Long;

    new-instance v2, Lzendesk/support/guide/ArticleVotingView$4;

    invoke-direct {v2, p0}, Lzendesk/support/guide/ArticleVotingView$4;-><init>(Lzendesk/support/guide/ArticleVotingView;)V

    invoke-interface {v0, v1, v2}, Lzendesk/support/HelpCenterProvider;->downvoteArticle(Ljava/lang/Long;LlI6;)V

    return-void
.end method

.method private getVotingButtonBackground(I)Landroid/graphics/drawable/StateListDrawable;
    .locals 6

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p0, v0, p1}, Lzendesk/support/guide/ArticleVotingView;->buildButtonBackground(Landroid/content/Context;I)Landroid/graphics/drawable/GradientDrawable;

    move-result-object p1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const/4 v1, -0x1

    invoke-direct {p0, v0, v1}, Lzendesk/support/guide/ArticleVotingView;->buildButtonBackground(Landroid/content/Context;I)Landroid/graphics/drawable/GradientDrawable;

    move-result-object v0

    new-instance v1, Landroid/graphics/drawable/StateListDrawable;

    invoke-direct {v1}, Landroid/graphics/drawable/StateListDrawable;-><init>()V

    const/4 v2, 0x1

    new-array v3, v2, [I

    const v4, 0x10102fe

    const/4 v5, 0x0

    aput v4, v3, v5

    invoke-virtual {v1, v3, p1}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    new-array v2, v2, [I

    const v3, 0x10100a7

    aput v3, v2, v5

    invoke-virtual {v1, v2, p1}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    new-array p1, v5, [I

    invoke-virtual {v1, p1, v0}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    return-object v1
.end method

.method private removeVote()V
    .locals 3

    iget-object v0, p0, Lzendesk/support/guide/ArticleVotingView;->articleId:Ljava/lang/Long;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "ViewArticleActivity"

    const-string v2, "Article vote was null, could not remove vote"

    invoke-static {v1, v2, v0}, LIx2;->l(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_0
    iget-object v0, p0, Lzendesk/support/guide/ArticleVotingView;->articleVote:Lzendesk/support/ArticleVote;

    invoke-virtual {v0}, Lzendesk/support/ArticleVote;->getId()Ljava/lang/Long;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lzendesk/support/guide/ArticleVotingView;->helpCenterProvider:Lzendesk/support/HelpCenterProvider;

    iget-object v1, p0, Lzendesk/support/guide/ArticleVotingView;->articleVote:Lzendesk/support/ArticleVote;

    invoke-virtual {v1}, Lzendesk/support/ArticleVote;->getId()Ljava/lang/Long;

    move-result-object v1

    new-instance v2, Lzendesk/support/guide/ArticleVotingView$5;

    invoke-direct {v2, p0}, Lzendesk/support/guide/ArticleVotingView$5;-><init>(Lzendesk/support/guide/ArticleVotingView;)V

    invoke-interface {v0, v1, v2}, Lzendesk/support/HelpCenterProvider;->deleteVote(Ljava/lang/Long;LlI6;)V

    :cond_1
    return-void
.end method

.method private setVotingButtonsClickable(Z)V
    .locals 1

    iget-object v0, p0, Lzendesk/support/guide/ArticleVotingView;->upvoteButton:Landroid/widget/ImageButton;

    invoke-virtual {v0, p1}, Landroid/view/View;->setClickable(Z)V

    iget-object v0, p0, Lzendesk/support/guide/ArticleVotingView;->downvoteButton:Landroid/widget/ImageButton;

    invoke-virtual {v0, p1}, Landroid/view/View;->setClickable(Z)V

    return-void
.end method

.method private setupViews(Landroid/content/Context;)V
    .locals 2

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    sget v0, Lyk4;->zs_view_article_voting:I

    invoke-virtual {p1, v0, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    sget p1, LMi4;->upvote_button_frame:I

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/view/ViewGroup;

    iput-object p1, p0, Lzendesk/support/guide/ArticleVotingView;->upvoteButtonFrame:Landroid/view/ViewGroup;

    sget p1, LMi4;->upvote_button:I

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageButton;

    iput-object p1, p0, Lzendesk/support/guide/ArticleVotingView;->upvoteButton:Landroid/widget/ImageButton;

    sget p1, LMi4;->downvote_button_frame:I

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/view/ViewGroup;

    iput-object p1, p0, Lzendesk/support/guide/ArticleVotingView;->downvoteButtonFrame:Landroid/view/ViewGroup;

    sget p1, LMi4;->downvote_button:I

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageButton;

    iput-object p1, p0, Lzendesk/support/guide/ArticleVotingView;->downvoteButton:Landroid/widget/ImageButton;

    sget p1, Ljf4;->colorPrimary:I

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, LKf4;->zs_fallback_text_color:I

    invoke-static {p1, v0, v1}, LAd6;->e(ILandroid/content/Context;I)I

    move-result p1

    iget-object v0, p0, Lzendesk/support/guide/ArticleVotingView;->upvoteButton:Landroid/widget/ImageButton;

    sget v1, LCg4;->zs_ic_thumb_up:I

    invoke-direct {p0, v0, v1, p1}, Lzendesk/support/guide/ArticleVotingView;->themeVotingButton(Landroid/widget/ImageButton;II)V

    iget-object v0, p0, Lzendesk/support/guide/ArticleVotingView;->downvoteButton:Landroid/widget/ImageButton;

    sget v1, LCg4;->zs_ic_thumb_down:I

    invoke-direct {p0, v0, v1, p1}, Lzendesk/support/guide/ArticleVotingView;->themeVotingButton(Landroid/widget/ImageButton;II)V

    iget-object p1, p0, Lzendesk/support/guide/ArticleVotingView;->upvoteButton:Landroid/widget/ImageButton;

    new-instance v0, Lzendesk/support/guide/ArticleVotingView$1;

    invoke-direct {v0, p0}, Lzendesk/support/guide/ArticleVotingView$1;-><init>(Lzendesk/support/guide/ArticleVotingView;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object p1, p0, Lzendesk/support/guide/ArticleVotingView;->downvoteButton:Landroid/widget/ImageButton;

    new-instance v0, Lzendesk/support/guide/ArticleVotingView$2;

    invoke-direct {v0, p0}, Lzendesk/support/guide/ArticleVotingView$2;-><init>(Lzendesk/support/guide/ArticleVotingView;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private themeVotingButton(Landroid/widget/ImageButton;II)V
    .locals 1

    invoke-direct {p0, p3}, Lzendesk/support/guide/ArticleVotingView;->getVotingButtonBackground(I)Landroid/graphics/drawable/StateListDrawable;

    move-result-object v0

    invoke-static {p1, v0}, Lbq6;->A0(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p2}, LNA0;->e(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    invoke-static {p2}, LP61;->r(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    const/4 v0, -0x1

    invoke-direct {p0, v0, p3}, Lzendesk/support/guide/ArticleVotingView;->colorStateList(II)Landroid/content/res/ColorStateList;

    move-result-object p3

    invoke-static {p2, p3}, LP61;->o(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V

    sget-object p3, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-static {p2, p3}, LP61;->p(Landroid/graphics/drawable/Drawable;Landroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method private updateButtons(Lzendesk/support/guide/ArticleVotingView$VoteState;)V
    .locals 3

    sget-object v0, Lzendesk/support/guide/ArticleVotingView$VoteState;->NONE:Lzendesk/support/guide/ArticleVotingView$VoteState;

    const/4 v1, 0x0

    if-ne p1, v0, :cond_0

    iget-object v0, p0, Lzendesk/support/guide/ArticleVotingView;->upvoteButtonFrame:Landroid/view/ViewGroup;

    invoke-virtual {v0, v1}, Landroid/view/View;->setActivated(Z)V

    iget-object v0, p0, Lzendesk/support/guide/ArticleVotingView;->downvoteButtonFrame:Landroid/view/ViewGroup;

    invoke-virtual {v0, v1}, Landroid/view/View;->setActivated(Z)V

    goto :goto_0

    :cond_0
    sget-object v0, Lzendesk/support/guide/ArticleVotingView$VoteState;->UPVOTED:Lzendesk/support/guide/ArticleVotingView$VoteState;

    const/4 v2, 0x1

    if-ne p1, v0, :cond_1

    iget-object v0, p0, Lzendesk/support/guide/ArticleVotingView;->upvoteButtonFrame:Landroid/view/ViewGroup;

    invoke-virtual {v0, v2}, Landroid/view/View;->setActivated(Z)V

    iget-object v0, p0, Lzendesk/support/guide/ArticleVotingView;->downvoteButtonFrame:Landroid/view/ViewGroup;

    invoke-virtual {v0, v1}, Landroid/view/View;->setActivated(Z)V

    goto :goto_0

    :cond_1
    sget-object v0, Lzendesk/support/guide/ArticleVotingView$VoteState;->DOWNVOTED:Lzendesk/support/guide/ArticleVotingView$VoteState;

    if-ne p1, v0, :cond_2

    iget-object v0, p0, Lzendesk/support/guide/ArticleVotingView;->upvoteButtonFrame:Landroid/view/ViewGroup;

    invoke-virtual {v0, v1}, Landroid/view/View;->setActivated(Z)V

    iget-object v0, p0, Lzendesk/support/guide/ArticleVotingView;->downvoteButtonFrame:Landroid/view/ViewGroup;

    invoke-virtual {v0, v2}, Landroid/view/View;->setActivated(Z)V

    :cond_2
    :goto_0
    invoke-direct {p0, p1}, Lzendesk/support/guide/ArticleVotingView;->updateContentDesc(Lzendesk/support/guide/ArticleVotingView$VoteState;)V

    return-void
.end method

.method private updateContentDesc(Lzendesk/support/guide/ArticleVotingView$VoteState;)V
    .locals 2

    sget-object v0, Lzendesk/support/guide/ArticleVotingView$6;->$SwitchMap$zendesk$support$guide$ArticleVotingView$VoteState:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_2

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 v0, 0x3

    if-eq p1, v0, :cond_0

    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/Object;

    const-string v0, "ViewArticleActivity"

    const-string v1, "Unhandled voteState case"

    invoke-static {v0, v1, p1}, LIx2;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lzendesk/support/guide/ArticleVotingView;->upvoteButton:Landroid/widget/ImageButton;

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lfl4;->zs_view_article_vote_yes_accessibility:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    iget-object p1, p0, Lzendesk/support/guide/ArticleVotingView;->downvoteButton:Landroid/widget/ImageButton;

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lfl4;->zs_view_article_vote_yes_remove_accessibility:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lzendesk/support/guide/ArticleVotingView;->upvoteButton:Landroid/widget/ImageButton;

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lfl4;->zs_view_article_vote_no_remove_accessibility:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    iget-object p1, p0, Lzendesk/support/guide/ArticleVotingView;->downvoteButton:Landroid/widget/ImageButton;

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lfl4;->zs_view_article_vote_no_accessibility:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lzendesk/support/guide/ArticleVotingView;->upvoteButton:Landroid/widget/ImageButton;

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lfl4;->zs_view_article_vote_yes_accessibility:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    iget-object p1, p0, Lzendesk/support/guide/ArticleVotingView;->downvoteButton:Landroid/widget/ImageButton;

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lfl4;->zs_view_article_vote_no_accessibility:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    :goto_0
    return-void
.end method

.method private upvoteArticle()V
    .locals 3

    iget-object v0, p0, Lzendesk/support/guide/ArticleVotingView;->articleId:Ljava/lang/Long;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "ViewArticleActivity"

    const-string v2, "Cannot upvote article, articleId is null. Make sure you\'ve called bindTo()!"

    invoke-static {v1, v2, v0}, LIx2;->l(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_0
    iget-object v1, p0, Lzendesk/support/guide/ArticleVotingView;->helpCenterProvider:Lzendesk/support/HelpCenterProvider;

    new-instance v2, Lzendesk/support/guide/ArticleVotingView$3;

    invoke-direct {v2, p0}, Lzendesk/support/guide/ArticleVotingView$3;-><init>(Lzendesk/support/guide/ArticleVotingView;)V

    invoke-interface {v1, v0, v2}, Lzendesk/support/HelpCenterProvider;->upvoteArticle(Ljava/lang/Long;LlI6;)V

    return-void
.end method


# virtual methods
.method public bindTo(Ljava/lang/Long;Lzendesk/support/ArticleVoteStorage;Lzendesk/support/HelpCenterProvider;)V
    .locals 0

    iput-object p2, p0, Lzendesk/support/guide/ArticleVotingView;->articleVoteStorage:Lzendesk/support/ArticleVoteStorage;

    iput-object p3, p0, Lzendesk/support/guide/ArticleVotingView;->helpCenterProvider:Lzendesk/support/HelpCenterProvider;

    iput-object p1, p0, Lzendesk/support/guide/ArticleVotingView;->articleId:Ljava/lang/Long;

    if-eqz p1, :cond_0

    invoke-interface {p2, p1}, Lzendesk/support/ArticleVoteStorage;->getStoredArticleVote(Ljava/lang/Long;)Lzendesk/support/ArticleVote;

    move-result-object p1

    iput-object p1, p0, Lzendesk/support/guide/ArticleVotingView;->articleVote:Lzendesk/support/ArticleVote;

    invoke-static {p1}, Lzendesk/support/guide/ArticleVotingView$VoteState;->fromArticleVote(Lzendesk/support/ArticleVote;)Lzendesk/support/guide/ArticleVotingView$VoteState;

    move-result-object p1

    invoke-direct {p0, p1}, Lzendesk/support/guide/ArticleVotingView;->updateButtons(Lzendesk/support/guide/ArticleVotingView$VoteState;)V

    :cond_0
    return-void
.end method
