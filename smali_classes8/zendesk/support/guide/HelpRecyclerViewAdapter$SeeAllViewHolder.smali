.class Lzendesk/support/guide/HelpRecyclerViewAdapter$SeeAllViewHolder;
.super Lzendesk/support/guide/HelpRecyclerViewAdapter$HelpViewHolder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lzendesk/support/guide/HelpRecyclerViewAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "SeeAllViewHolder"
.end annotation


# instance fields
.field private progressBar:Landroid/widget/ProgressBar;

.field final synthetic this$0:Lzendesk/support/guide/HelpRecyclerViewAdapter;


# direct methods
.method public constructor <init>(Lzendesk/support/guide/HelpRecyclerViewAdapter;Landroid/view/View;)V
    .locals 0

    iput-object p1, p0, Lzendesk/support/guide/HelpRecyclerViewAdapter$SeeAllViewHolder;->this$0:Lzendesk/support/guide/HelpRecyclerViewAdapter;

    invoke-direct {p0, p2}, Lzendesk/support/guide/HelpRecyclerViewAdapter$HelpViewHolder;-><init>(Landroid/view/View;)V

    sget p1, LMi4;->help_section_action_button:I

    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lzendesk/support/guide/HelpRecyclerViewAdapter$HelpViewHolder;->textView:Landroid/widget/TextView;

    sget p1, LMi4;->help_section_loading_progress:I

    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ProgressBar;

    iput-object p1, p0, Lzendesk/support/guide/HelpRecyclerViewAdapter$SeeAllViewHolder;->progressBar:Landroid/widget/ProgressBar;

    return-void
.end method

.method public static synthetic access$800(Lzendesk/support/guide/HelpRecyclerViewAdapter$SeeAllViewHolder;)Landroid/widget/ProgressBar;
    .locals 0

    iget-object p0, p0, Lzendesk/support/guide/HelpRecyclerViewAdapter$SeeAllViewHolder;->progressBar:Landroid/widget/ProgressBar;

    return-object p0
.end method


# virtual methods
.method public bindTo(Lzendesk/support/HelpItem;I)V
    .locals 5

    instance-of p2, p1, Lzendesk/support/SeeAllArticlesItem;

    const/4 v0, 0x0

    if-nez p2, :cond_0

    const-string p1, "SeeAll item was null, cannot bind"

    new-array p2, v0, [Ljava/lang/Object;

    const-string v0, "HelpCenterActivity"

    invoke-static {v0, p1, p2}, LIx2;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_0
    move-object p2, p1

    check-cast p2, Lzendesk/support/SeeAllArticlesItem;

    invoke-virtual {p2}, Lzendesk/support/SeeAllArticlesItem;->isLoading()Z

    move-result v1

    const/16 v2, 0x8

    if-eqz v1, :cond_1

    iget-object v1, p0, Lzendesk/support/guide/HelpRecyclerViewAdapter$HelpViewHolder;->textView:Landroid/widget/TextView;

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object v1, p0, Lzendesk/support/guide/HelpRecyclerViewAdapter$SeeAllViewHolder;->progressBar:Landroid/widget/ProgressBar;

    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lzendesk/support/guide/HelpRecyclerViewAdapter$HelpViewHolder;->textView:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    iget-object v1, p0, Lzendesk/support/guide/HelpRecyclerViewAdapter$SeeAllViewHolder;->progressBar:Landroid/widget/ProgressBar;

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    :goto_0
    invoke-virtual {p2}, Lzendesk/support/SeeAllArticlesItem;->getSection()Lzendesk/support/SectionItem;

    move-result-object v1

    if-eqz v1, :cond_2

    iget-object v2, p0, Lzendesk/support/guide/HelpRecyclerViewAdapter$SeeAllViewHolder;->this$0:Lzendesk/support/guide/HelpRecyclerViewAdapter;

    invoke-static {v2}, Lzendesk/support/guide/HelpRecyclerViewAdapter;->access$000(Lzendesk/support/guide/HelpRecyclerViewAdapter;)Landroid/content/Context;

    move-result-object v2

    sget v3, Lfl4;->support_help_see_all_n_articles_label:I

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    invoke-virtual {v1}, Lzendesk/support/SectionItem;->getTotalArticlesCount()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v4, v0

    invoke-virtual {v2, v3, v4}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lzendesk/support/guide/HelpRecyclerViewAdapter$SeeAllViewHolder;->this$0:Lzendesk/support/guide/HelpRecyclerViewAdapter;

    invoke-static {v0}, Lzendesk/support/guide/HelpRecyclerViewAdapter;->access$000(Lzendesk/support/guide/HelpRecyclerViewAdapter;)Landroid/content/Context;

    move-result-object v0

    sget v1, Lfl4;->support_help_see_all_articles_label:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_1
    iget-object v1, p0, Lzendesk/support/guide/HelpRecyclerViewAdapter$HelpViewHolder;->textView:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lzendesk/support/guide/HelpRecyclerViewAdapter$HelpViewHolder;->textView:Landroid/widget/TextView;

    new-instance v1, Lzendesk/support/guide/HelpRecyclerViewAdapter$SeeAllViewHolder$1;

    invoke-direct {v1, p0, p1, p2}, Lzendesk/support/guide/HelpRecyclerViewAdapter$SeeAllViewHolder$1;-><init>(Lzendesk/support/guide/HelpRecyclerViewAdapter$SeeAllViewHolder;Lzendesk/support/HelpItem;Lzendesk/support/SeeAllArticlesItem;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method
