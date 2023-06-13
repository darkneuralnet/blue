.class public final Lql6;
.super LxE;
.source "SourceFile"

# interfaces
.implements Lpl6;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0008\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u000b\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u000e\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u000e\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0003H\u0016R\u0014\u0010\u000b\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\nR\u001a\u0010\u0011\u001a\u00020\u000c8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0016"
    }
    d2 = {
        "Lql6;",
        "LxE;",
        "Lpl6;",
        "Lio/reactivex/Observable;",
        "Lco/bird/android/model/CommandCenterButton;",
        "B1",
        "",
        "K",
        "LDy1;",
        "b",
        "LDy1;",
        "binding",
        "LRk6;",
        "c",
        "LRk6;",
        "Pl",
        "()LRk6;",
        "adapter",
        "Lco/bird/android/core/mvp/BaseActivity;",
        "activity",
        "<init>",
        "(Lco/bird/android/core/mvp/BaseActivity;LDy1;)V",
        "co.bird.android.feature.commandcenter"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final b:LDy1;

.field public final c:LRk6;


# direct methods
.method public constructor <init>(Lco/bird/android/core/mvp/BaseActivity;LDy1;)V
    .locals 2

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "binding"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LxE;-><init>(Lco/bird/android/core/mvp/BaseActivity;)V

    iput-object p2, p0, Lql6;->b:LDy1;

    new-instance v0, LRk6;

    invoke-direct {v0}, LRk6;-><init>()V

    iput-object v0, p0, Lql6;->c:LRk6;

    iget-object v0, p2, LDy1;->b:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p0}, Lql6;->Pl()LRk6;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$h;)V

    iget-object v0, p2, LDy1;->b:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-direct {v1, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$p;)V

    iget-object p1, p2, LDy1;->b:Landroidx/recyclerview/widget/RecyclerView;

    new-instance p2, Landroidx/recyclerview/widget/g;

    invoke-direct {p2}, Landroidx/recyclerview/widget/g;-><init>()V

    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->setItemAnimator(Landroidx/recyclerview/widget/RecyclerView$m;)V

    return-void
.end method


# virtual methods
.method public B()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/model/VehicleCommand;",
            ">;"
        }
    .end annotation

    invoke-static {p0}, Lpl6$a;->b(Lpl6;)Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public B1()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/model/CommandCenterButton;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lql6;->Pl()LRk6;

    move-result-object v0

    invoke-virtual {v0}, LqA;->C()Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public Jd(Lco/bird/android/model/VehicleCommand;)V
    .locals 0

    invoke-static {p0, p1}, Lpl6$a;->c(Lpl6;Lco/bird/android/model/VehicleCommand;)V

    return-void
.end method

.method public K()Lio/reactivex/Observable;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance v0, Lhn5;

    invoke-direct {v0}, Lhn5;-><init>()V

    invoke-virtual {p0}, LxE;->getActivity()Lco/bird/android/core/mvp/BaseActivity;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v1

    const-string v2, "ScrapCompleteBottomSheetDialog"

    invoke-virtual {v0, v1, v2}, Landroidx/fragment/app/c;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    invoke-virtual {v0}, Lhn5;->a5()Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public M3(Lco/bird/android/model/VehicleCommand;)V
    .locals 0

    invoke-static {p0, p1}, Lpl6$a;->f(Lpl6;Lco/bird/android/model/VehicleCommand;)V

    return-void
.end method

.method public Pl()LRk6;
    .locals 1

    iget-object v0, p0, Lql6;->c:LRk6;

    return-object v0
.end method

.method public Sa(Ljava/util/List;)Lio/reactivex/p;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/model/AlarmOption;",
            ">;)",
            "Lio/reactivex/p<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    invoke-static {p0, p1}, Lpl6$a;->e(Lpl6;Ljava/util/List;)Lio/reactivex/p;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic getActivity()Lco/bird/android/core/base/BaseCoreActivity;
    .locals 1

    invoke-virtual {p0}, LxE;->getActivity()Lco/bird/android/core/mvp/BaseActivity;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getAdapter()LoA;
    .locals 1

    invoke-virtual {p0}, Lql6;->Pl()LRk6;

    move-result-object v0

    return-object v0
.end method

.method public o(Ljava/util/Collection;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "LH6;",
            ">;)V"
        }
    .end annotation

    invoke-static {p0, p1}, Lpl6$a;->d(Lpl6;Ljava/util/Collection;)V

    return-void
.end method

.method public t1()V
    .locals 0

    invoke-static {p0}, Lpl6$a;->a(Lpl6;)V

    return-void
.end method

.method public v9(Lco/bird/android/model/VehicleCommand;)V
    .locals 0

    invoke-static {p0, p1}, Lpl6$a;->g(Lpl6;Lco/bird/android/model/VehicleCommand;)V

    return-void
.end method
