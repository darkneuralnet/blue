.class Lzendesk/support/guide/HelpSearchRecyclerViewAdapter;
.super Landroidx/recyclerview/widget/RecyclerView$h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lzendesk/support/guide/HelpSearchRecyclerViewAdapter$PaddingViewHolder;,
        Lzendesk/support/guide/HelpSearchRecyclerViewAdapter$NoResultsViewHolder;,
        Lzendesk/support/guide/HelpSearchRecyclerViewAdapter$HelpSearchViewHolder;
    }
.end annotation


# static fields
.field private static final TYPE_ARTICLE:I = 0x213

.field private static final TYPE_NO_RESULTS:I = 0x1b9

.field private static final TYPE_PADDING:I = 0x1a7


# instance fields
.field private final helpCenterProvider:Lzendesk/support/HelpCenterProvider;

.field private final helpCenterUiConfig:Lzendesk/support/guide/HelpCenterConfiguration;

.field private query:Ljava/lang/String;

.field private resultsCleared:Z

.field private searchArticles:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lzendesk/support/SearchArticle;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/List;Ljava/lang/String;Lzendesk/support/guide/HelpCenterConfiguration;Lzendesk/support/HelpCenterProvider;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lzendesk/support/SearchArticle;",
            ">;",
            "Ljava/lang/String;",
            "Lzendesk/support/guide/HelpCenterConfiguration;",
            "Lzendesk/support/HelpCenterProvider;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$h;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lzendesk/support/guide/HelpSearchRecyclerViewAdapter;->resultsCleared:Z

    iput-object p1, p0, Lzendesk/support/guide/HelpSearchRecyclerViewAdapter;->searchArticles:Ljava/util/List;

    iput-object p2, p0, Lzendesk/support/guide/HelpSearchRecyclerViewAdapter;->query:Ljava/lang/String;

    iput-object p3, p0, Lzendesk/support/guide/HelpSearchRecyclerViewAdapter;->helpCenterUiConfig:Lzendesk/support/guide/HelpCenterConfiguration;

    iput-object p4, p0, Lzendesk/support/guide/HelpSearchRecyclerViewAdapter;->helpCenterProvider:Lzendesk/support/HelpCenterProvider;

    return-void
.end method

.method public static synthetic access$000(Lzendesk/support/guide/HelpSearchRecyclerViewAdapter;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lzendesk/support/guide/HelpSearchRecyclerViewAdapter;->query:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic access$100(Lzendesk/support/guide/HelpSearchRecyclerViewAdapter;)Lzendesk/support/HelpCenterProvider;
    .locals 0

    iget-object p0, p0, Lzendesk/support/guide/HelpSearchRecyclerViewAdapter;->helpCenterProvider:Lzendesk/support/HelpCenterProvider;

    return-object p0
.end method

.method public static synthetic access$200(Lzendesk/support/guide/HelpSearchRecyclerViewAdapter;)Lzendesk/support/guide/HelpCenterConfiguration;
    .locals 0

    iget-object p0, p0, Lzendesk/support/guide/HelpSearchRecyclerViewAdapter;->helpCenterUiConfig:Lzendesk/support/guide/HelpCenterConfiguration;

    return-object p0
.end method

.method private getPaddingExtraItem()I
    .locals 1

    iget-object v0, p0, Lzendesk/support/guide/HelpSearchRecyclerViewAdapter;->helpCenterUiConfig:Lzendesk/support/guide/HelpCenterConfiguration;

    invoke-virtual {v0}, Lzendesk/support/guide/HelpCenterConfiguration;->isContactUsButtonVisible()Z

    move-result v0

    return v0
.end method


# virtual methods
.method public clearResults()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lzendesk/support/guide/HelpSearchRecyclerViewAdapter;->resultsCleared:Z

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lzendesk/support/guide/HelpSearchRecyclerViewAdapter;->searchArticles:Ljava/util/List;

    const-string v0, ""

    iput-object v0, p0, Lzendesk/support/guide/HelpSearchRecyclerViewAdapter;->query:Ljava/lang/String;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$h;->notifyDataSetChanged()V

    return-void
.end method

.method public getItemCount()I
    .locals 2

    iget-boolean v0, p0, Lzendesk/support/guide/HelpSearchRecyclerViewAdapter;->resultsCleared:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget-object v0, p0, Lzendesk/support/guide/HelpSearchRecyclerViewAdapter;->searchArticles:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-direct {p0}, Lzendesk/support/guide/HelpSearchRecyclerViewAdapter;->getPaddingExtraItem()I

    move-result v1

    add-int/2addr v0, v1

    const/4 v1, 0x1

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    return v0
.end method

.method public getItemViewType(I)I
    .locals 1

    if-nez p1, :cond_0

    iget-object v0, p0, Lzendesk/support/guide/HelpSearchRecyclerViewAdapter;->searchArticles:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    const/16 p1, 0x1b9

    return p1

    :cond_0
    if-lez p1, :cond_1

    iget-object v0, p0, Lzendesk/support/guide/HelpSearchRecyclerViewAdapter;->searchArticles:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ne p1, v0, :cond_1

    const/16 p1, 0x1a7

    return p1

    :cond_1
    const/16 p1, 0x213

    return p1
.end method

.method public onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$D;I)V
    .locals 2

    const/16 v0, 0x213

    invoke-virtual {p0, p2}, Lzendesk/support/guide/HelpSearchRecyclerViewAdapter;->getItemViewType(I)I

    move-result v1

    if-ne v0, v1, :cond_0

    check-cast p1, Lzendesk/support/guide/HelpSearchRecyclerViewAdapter$HelpSearchViewHolder;

    iget-object v0, p0, Lzendesk/support/guide/HelpSearchRecyclerViewAdapter;->searchArticles:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lzendesk/support/SearchArticle;

    invoke-virtual {p1, p2}, Lzendesk/support/guide/HelpSearchRecyclerViewAdapter$HelpSearchViewHolder;->bindTo(Lzendesk/support/SearchArticle;)V

    :cond_0
    return-void
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$D;
    .locals 2

    const/16 v0, 0x1a7

    const/4 v1, 0x0

    if-eq p2, v0, :cond_2

    const/16 v0, 0x1b9

    if-eq p2, v0, :cond_1

    const/16 v0, 0x213

    if-eq p2, v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    sget v0, Lyk4;->zs_row_search_article:I

    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    new-instance v0, Lzendesk/support/guide/HelpSearchRecyclerViewAdapter$HelpSearchViewHolder;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {v0, p0, p2, p1}, Lzendesk/support/guide/HelpSearchRecyclerViewAdapter$HelpSearchViewHolder;-><init>(Lzendesk/support/guide/HelpSearchRecyclerViewAdapter;Landroid/view/View;Landroid/content/Context;)V

    return-object v0

    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    sget v0, Lyk4;->zs_row_no_articles_found:I

    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    new-instance p2, Lzendesk/support/guide/HelpSearchRecyclerViewAdapter$NoResultsViewHolder;

    invoke-direct {p2, p0, p1}, Lzendesk/support/guide/HelpSearchRecyclerViewAdapter$NoResultsViewHolder;-><init>(Lzendesk/support/guide/HelpSearchRecyclerViewAdapter;Landroid/view/View;)V

    return-object p2

    :cond_2
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    sget v0, Lyk4;->zs_row_padding:I

    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    new-instance p2, Lzendesk/support/guide/HelpSearchRecyclerViewAdapter$PaddingViewHolder;

    invoke-direct {p2, p0, p1}, Lzendesk/support/guide/HelpSearchRecyclerViewAdapter$PaddingViewHolder;-><init>(Lzendesk/support/guide/HelpSearchRecyclerViewAdapter;Landroid/view/View;)V

    return-object p2
.end method

.method public update(Ljava/util/List;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lzendesk/support/SearchArticle;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const/4 v0, 0x0

    iput-boolean v0, p0, Lzendesk/support/guide/HelpSearchRecyclerViewAdapter;->resultsCleared:Z

    iput-object p1, p0, Lzendesk/support/guide/HelpSearchRecyclerViewAdapter;->searchArticles:Ljava/util/List;

    iput-object p2, p0, Lzendesk/support/guide/HelpSearchRecyclerViewAdapter;->query:Ljava/lang/String;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$h;->notifyDataSetChanged()V

    return-void
.end method
