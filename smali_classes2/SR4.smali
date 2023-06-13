.class public final LSR4;
.super LxE;
.source "SourceFile"

# interfaces
.implements LRR4;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\'\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0016\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0016\u0010\u0007\u001a\u00020\u00062\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u000e\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0008H\u0016R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000cR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u001b"
    }
    d2 = {
        "LSR4;",
        "LxE;",
        "LRR4;",
        "",
        "Lco/bird/api/response/RideSummary;",
        "data",
        "",
        "N1",
        "Lio/reactivex/Observable;",
        "Vj",
        "LI5;",
        "b",
        "LI5;",
        "binding",
        "LxR4;",
        "c",
        "LxR4;",
        "getAdapter",
        "()LxR4;",
        "adapter",
        "Lco/bird/android/core/mvp/BaseActivity;",
        "activity",
        "",
        "billedMinutes",
        "hideTime",
        "<init>",
        "(Lco/bird/android/core/mvp/BaseActivity;LI5;ZZ)V",
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
.field public final b:LI5;

.field public final c:LxR4;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lco/bird/android/core/mvp/BaseActivity;LI5;ZZ)V
    .locals 2

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "binding"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LxE;-><init>(Lco/bird/android/core/mvp/BaseActivity;)V

    iput-object p2, p0, LSR4;->b:LI5;

    new-instance v0, LxR4;

    invoke-direct {v0, p1, p3, p4}, LxR4;-><init>(Landroid/content/Context;ZZ)V

    iput-object v0, p0, LSR4;->c:LxR4;

    iget-object p3, p2, LI5;->d:Landroidx/recyclerview/widget/RecyclerView;

    new-instance p4, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-direct {p4, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {p3, p4}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$p;)V

    iget-object p3, p2, LI5;->d:Landroidx/recyclerview/widget/RecyclerView;

    new-instance p4, LMf0;

    sget-object v1, LD62;->f:LD62;

    invoke-virtual {v1}, LD62;->b()Landroid/view/animation/Interpolator;

    move-result-object v1

    invoke-direct {p4, v1}, LMf0;-><init>(Landroid/view/animation/Interpolator;)V

    invoke-virtual {p3, p4}, Landroidx/recyclerview/widget/RecyclerView;->setItemAnimator(Landroidx/recyclerview/widget/RecyclerView$m;)V

    iget-object p3, p2, LI5;->d:Landroidx/recyclerview/widget/RecyclerView;

    new-instance p4, LFN5;

    sget v1, LXf4;->card_spacing:I

    invoke-direct {p4, p1, v1}, LFN5;-><init>(Landroid/content/Context;I)V

    invoke-virtual {p3, p4}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$o;)V

    iget-object p1, p2, LI5;->d:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$h;)V

    return-void
.end method


# virtual methods
.method public N1(Ljava/util/List;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/api/response/RideSummary;",
            ">;)V"
        }
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LSR4;->c:LxR4;

    invoke-virtual {v0}, Lct4;->x()Z

    move-result v0

    const-string v1, "binding.recyclerView"

    const/4 v2, 0x1

    const-string v3, "binding.emptyView"

    const/4 v4, 0x0

    const/4 v5, 0x2

    const/4 v6, 0x0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, LSR4;->b:LI5;

    iget-object p1, p1, LI5;->b:Landroid/widget/LinearLayout;

    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v2, v6, v5, v4}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    iget-object p1, p0, LSR4;->b:LI5;

    iget-object p1, p1, LI5;->d:Landroidx/recyclerview/widget/RecyclerView;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v6, v6, v5, v4}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, LSR4;->b:LI5;

    iget-object v0, v0, LI5;->b:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, LSR4;->b:LI5;

    iget-object v0, v0, LI5;->b:Landroid/widget/LinearLayout;

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v6, v6, v5, v4}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    :cond_1
    iget-object v0, p0, LSR4;->b:LI5;

    iget-object v0, v0, LI5;->d:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    const/16 v3, 0x8

    if-ne v0, v3, :cond_2

    iget-object v0, p0, LSR4;->b:LI5;

    iget-object v0, v0, LI5;->d:Landroidx/recyclerview/widget/RecyclerView;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v2, v6, v5, v4}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    :cond_2
    iget-object v0, p0, LSR4;->c:LxR4;

    invoke-virtual {v0}, Lct4;->getItemCount()I

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, LSR4;->c:LxR4;

    invoke-virtual {v0, p1}, Lct4;->C(Ljava/util/List;)V

    goto :goto_0

    :cond_3
    iget-object v0, p0, LSR4;->c:LxR4;

    invoke-virtual {v0, p1}, Lct4;->p(Ljava/util/List;)V

    :goto_0
    return-void
.end method

.method public Vj()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lco/bird/api/response/RideSummary;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LSR4;->c:LxR4;

    invoke-virtual {v0}, Lct4;->t()Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method
