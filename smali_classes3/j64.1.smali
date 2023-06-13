.class public final Lj64;
.super LxE;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u0019\u0008\u0007\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002J\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0002J\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002J\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0002J\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002J\u0014\u0010\u000e\u001a\u00020\u00032\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000bR\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u001a"
    }
    d2 = {
        "Lj64;",
        "LxE;",
        "Lio/reactivex/Observable;",
        "",
        "ul",
        "LTk5;",
        "Pl",
        "Ql",
        "Lco/bird/android/model/persistence/Bird;",
        "Rl",
        "Sl",
        "",
        "LH6;",
        "sections",
        "b",
        "LR4;",
        "LR4;",
        "binding",
        "LK54;",
        "c",
        "LK54;",
        "overviewAdapter",
        "Lco/bird/android/core/mvp/BaseActivity;",
        "activity",
        "<init>",
        "(Lco/bird/android/core/mvp/BaseActivity;LR4;)V",
        "ownedbirds_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final b:LR4;

.field public final c:LK54;


# direct methods
.method public constructor <init>(Lco/bird/android/core/mvp/BaseActivity;LR4;)V
    .locals 1

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "binding"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LxE;-><init>(Lco/bird/android/core/mvp/BaseActivity;)V

    iput-object p2, p0, Lj64;->b:LR4;

    new-instance p1, LK54;

    invoke-direct {p1}, LK54;-><init>()V

    iput-object p1, p0, Lj64;->c:LK54;

    iget-object p2, p2, LR4;->c:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p2, p1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$h;)V

    new-instance p1, LFA3;

    invoke-direct {p1}, LFA3;-><init>()V

    invoke-virtual {p2, p1}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$o;)V

    return-void
.end method


# virtual methods
.method public final Pl()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "LTk5;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lj64;->c:LK54;

    invoke-virtual {v0}, LK54;->v()Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public final Ql()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lj64;->c:LK54;

    invoke-virtual {v0}, LK54;->w()Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public final Rl()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/model/persistence/Bird;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lj64;->c:LK54;

    invoke-virtual {v0}, LK54;->x()Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public final Sl()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lj64;->c:LK54;

    invoke-virtual {v0}, LK54;->y()Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public final b(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "LH6;",
            ">;)V"
        }
    .end annotation

    const-string v0, "sections"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lj64;->c:LK54;

    check-cast p1, Ljava/util/Collection;

    invoke-virtual {v0, p1}, LMy;->u(Ljava/util/Collection;)V

    return-void
.end method

.method public final ul()Lio/reactivex/Observable;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lj64;->b:LR4;

    iget-object v0, v0, LR4;->b:Landroid/widget/Button;

    const-string v1, "binding.helpButton"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x1

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    invoke-static {v0, v3, v4, v1, v2}, Llf5;->clicksThrottle$default(Landroid/view/View;JILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    iget-object v1, p0, Lj64;->c:LK54;

    invoke-virtual {v1}, LK54;->g0()Lio/reactivex/Observable;

    move-result-object v1

    invoke-static {v0, v1}, Lio/reactivex/Observable;->merge(Lio/reactivex/B;Lio/reactivex/B;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "merge(binding.helpButton\u2026viewAdapter.infoClicks())"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
