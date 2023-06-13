.class public final LSY3;
.super LxE;
.source "SourceFile"

# interfaces
.implements LRY3;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LSY3$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u000f\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0008\u0010\u0004\u001a\u00020\u0003H\u0016J\u0008\u0010\u0005\u001a\u00020\u0003H\u0016J\u0016\u0010\t\u001a\u00020\u00032\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u000e\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00030\nH\u0016R\u0014\u0010\u000f\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u001c"
    }
    d2 = {
        "LSY3;",
        "LxE;",
        "LRY3;",
        "",
        "h6",
        "Wa",
        "",
        "Lco/bird/android/model/BirdProblem;",
        "issues",
        "Mf",
        "Lio/reactivex/Observable;",
        "xj",
        "LO4;",
        "b",
        "LO4;",
        "binding",
        "LfS0;",
        "c",
        "LfS0;",
        "adapter",
        "Lco/bird/android/model/constant/PotentialIssuesScreenType;",
        "d",
        "Lco/bird/android/model/constant/PotentialIssuesScreenType;",
        "uiType",
        "Lco/bird/android/core/mvp/BaseActivity;",
        "activity",
        "<init>",
        "(Lco/bird/android/core/mvp/BaseActivity;LO4;)V",
        "app_birdRelease"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final b:LO4;

.field public final c:LfS0;

.field public d:Lco/bird/android/model/constant/PotentialIssuesScreenType;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lco/bird/android/core/mvp/BaseActivity;LO4;)V
    .locals 4

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "binding"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LxE;-><init>(Lco/bird/android/core/mvp/BaseActivity;)V

    iput-object p2, p0, LSY3;->b:LO4;

    new-instance v0, LfS0;

    invoke-direct {v0, p1}, LfS0;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, LSY3;->c:LfS0;

    iget-object v1, p2, LO4;->g:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v2, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-direct {v2, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$p;)V

    iget-object v1, p2, LO4;->g:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v2, Landroidx/recyclerview/widget/g;

    invoke-direct {v2}, Landroidx/recyclerview/widget/g;-><init>()V

    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setItemAnimator(Landroidx/recyclerview/widget/RecyclerView$m;)V

    iget-object v1, p2, LO4;->g:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v2, LFN5;

    sget v3, LXf4;->activity_vertical_margin:I

    invoke-direct {v2, p1, v3}, LFN5;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$o;)V

    iget-object p1, p2, LO4;->g:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$h;)V

    return-void
.end method


# virtual methods
.method public Mf(Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/model/BirdProblem;",
            ">;)V"
        }
    .end annotation

    const-string v0, "issues"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    const/4 v2, 0x1

    xor-int/2addr v1, v2

    if-eqz v1, :cond_1

    iget-object v1, p0, LSY3;->c:LfS0;

    invoke-virtual {v1}, Lct4;->getItemCount()I

    move-result v1

    if-nez v1, :cond_0

    iget-object p1, p0, LSY3;->c:LfS0;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1, v0}, Lct4;->C(Ljava/util/List;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, LSY3;->c:LfS0;

    invoke-virtual {v0, p1}, Lct4;->p(Ljava/util/List;)V

    :cond_1
    :goto_0
    iget-object p1, p0, LSY3;->d:Lco/bird/android/model/constant/PotentialIssuesScreenType;

    if-nez p1, :cond_2

    const-string p1, "uiType"

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 p1, 0x0

    :cond_2
    sget-object v0, LSY3$a;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x0

    if-ne p1, v2, :cond_3

    iget-object p1, p0, LSY3;->b:LO4;

    iget-object p1, p1, LO4;->d:Landroid/widget/TextView;

    invoke-virtual {p0}, LxE;->getActivity()Lco/bird/android/core/mvp/BaseActivity;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v3, Lnl4;->potential_issues_with_count:I

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v4, p0, LSY3;->c:LfS0;

    invoke-virtual {v4}, Lct4;->getItemCount()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v0

    invoke-virtual {v1, v3, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_3
    iget-object p1, p0, LSY3;->c:LfS0;

    invoke-virtual {p1}, Lct4;->getItemCount()I

    move-result p1

    if-nez p1, :cond_4

    iget-object p1, p0, LSY3;->b:LO4;

    iget-object p1, p1, LO4;->g:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$p;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->s2()I

    iget-object p1, p0, LSY3;->b:LO4;

    iget-object p1, p1, LO4;->g:Landroidx/recyclerview/widget/RecyclerView;

    const/4 v0, 0x2

    invoke-virtual {p1, v0}, Landroid/view/View;->setOverScrollMode(I)V

    goto :goto_1

    :cond_4
    iget-object p1, p0, LSY3;->b:LO4;

    iget-object p1, p1, LO4;->g:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1, v0}, Landroid/view/View;->setOverScrollMode(I)V

    :goto_1
    return-void
.end method

.method public Wa()V
    .locals 3

    sget-object v0, Lco/bird/android/model/constant/PotentialIssuesScreenType;->CONNECTION_ERROR:Lco/bird/android/model/constant/PotentialIssuesScreenType;

    iput-object v0, p0, LSY3;->d:Lco/bird/android/model/constant/PotentialIssuesScreenType;

    iget-object v0, p0, LSY3;->b:LO4;

    iget-object v0, v0, LO4;->c:Landroid/widget/TextView;

    invoke-virtual {p0}, LxE;->getActivity()Lco/bird/android/core/mvp/BaseActivity;

    move-result-object v1

    sget v2, Lnl4;->potential_issues_connection_error_title:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, LSY3;->b:LO4;

    iget-object v0, v0, LO4;->h:Landroid/widget/TextView;

    invoke-virtual {p0}, LxE;->getActivity()Lco/bird/android/core/mvp/BaseActivity;

    move-result-object v1

    sget v2, Lnl4;->potential_issues_listed_below:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, LSY3;->b:LO4;

    iget-object v0, v0, LO4;->d:Landroid/widget/TextView;

    invoke-virtual {p0}, LxE;->getActivity()Lco/bird/android/core/mvp/BaseActivity;

    move-result-object v1

    sget v2, Lnl4;->potential_issues_with_count:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, LSY3;->b:LO4;

    iget-object v0, v0, LO4;->f:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public h6()V
    .locals 3

    sget-object v0, Lco/bird/android/model/constant/PotentialIssuesScreenType;->POTENTIAL_ISSUES:Lco/bird/android/model/constant/PotentialIssuesScreenType;

    iput-object v0, p0, LSY3;->d:Lco/bird/android/model/constant/PotentialIssuesScreenType;

    iget-object v0, p0, LSY3;->b:LO4;

    iget-object v0, v0, LO4;->c:Landroid/widget/TextView;

    invoke-virtual {p0}, LxE;->getActivity()Lco/bird/android/core/mvp/BaseActivity;

    move-result-object v1

    sget v2, Lnl4;->potential_issues_title:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, LSY3;->b:LO4;

    iget-object v0, v0, LO4;->h:Landroid/widget/TextView;

    invoke-virtual {p0}, LxE;->getActivity()Lco/bird/android/core/mvp/BaseActivity;

    move-result-object v1

    sget v2, Lnl4;->potential_issues_please_review_subheader:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, LSY3;->b:LO4;

    iget-object v0, v0, LO4;->d:Landroid/widget/TextView;

    invoke-virtual {p0}, LxE;->getActivity()Lco/bird/android/core/mvp/BaseActivity;

    move-result-object v1

    sget v2, Lnl4;->possible_issues:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, LSY3;->b:LO4;

    iget-object v0, v0, LO4;->f:Landroid/widget/TextView;

    invoke-virtual {p0}, LxE;->getActivity()Lco/bird/android/core/mvp/BaseActivity;

    move-result-object v1

    sget v2, Lnl4;->potential_issues_please_review_description:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public xj()Lio/reactivex/Observable;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LSY3;->b:LO4;

    iget-object v0, v0, LO4;->b:Landroid/widget/Button;

    const-string v1, "binding.cantFixButton"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x1

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    invoke-static {v0, v3, v4, v1, v2}, Llf5;->clicksThrottle$default(Landroid/view/View;JILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method
