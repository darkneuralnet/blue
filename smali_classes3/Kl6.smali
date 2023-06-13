.class public final LKl6;
.super LxE;
.source "SourceFile"

# interfaces
.implements LJl6;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0008\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0008\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0017\u0010\u0008\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\u0005\u001a\u0004\u0008\u0006\u0010\u0007R\u001a\u0010\u000e\u001a\u00020\t8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\u000c\u0010\r\u00a8\u0006\u0013"
    }
    d2 = {
        "LKl6;",
        "LxE;",
        "LJl6;",
        "Landroidx/recyclerview/widget/RecyclerView;",
        "b",
        "Landroidx/recyclerview/widget/RecyclerView;",
        "getRecyclerView",
        "()Landroidx/recyclerview/widget/RecyclerView;",
        "recyclerView",
        "LoA;",
        "c",
        "LoA;",
        "getAdapter",
        "()LoA;",
        "adapter",
        "Lco/bird/android/core/mvp/BaseActivity;",
        "activity",
        "<init>",
        "(Lco/bird/android/core/mvp/BaseActivity;Landroidx/recyclerview/widget/RecyclerView;)V",
        "repair_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final b:Landroidx/recyclerview/widget/RecyclerView;

.field public final c:LoA;


# direct methods
.method public constructor <init>(Lco/bird/android/core/mvp/BaseActivity;Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 1

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "recyclerView"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LxE;-><init>(Lco/bird/android/core/mvp/BaseActivity;)V

    iput-object p2, p0, LKl6;->b:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v0, LKl6$a;

    invoke-direct {v0}, LKl6$a;-><init>()V

    iput-object v0, p0, LKl6;->c:LoA;

    new-instance v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-direct {v0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {p2, v0}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$p;)V

    new-instance p1, Landroidx/recyclerview/widget/g;

    invoke-direct {p1}, Landroidx/recyclerview/widget/g;-><init>()V

    invoke-virtual {p2, p1}, Landroidx/recyclerview/widget/RecyclerView;->setItemAnimator(Landroidx/recyclerview/widget/RecyclerView$m;)V

    invoke-virtual {p0}, LKl6;->getAdapter()LoA;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$h;)V

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

    invoke-static {p0}, LJl6$a;->b(LJl6;)Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public Jd(Lco/bird/android/model/VehicleCommand;)V
    .locals 0

    invoke-static {p0, p1}, LJl6$a;->c(LJl6;Lco/bird/android/model/VehicleCommand;)V

    return-void
.end method

.method public M3(Lco/bird/android/model/VehicleCommand;)V
    .locals 0

    invoke-static {p0, p1}, LJl6$a;->f(LJl6;Lco/bird/android/model/VehicleCommand;)V

    return-void
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

    invoke-static {p0, p1}, LJl6$a;->e(LJl6;Ljava/util/List;)Lio/reactivex/p;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic getActivity()Lco/bird/android/core/base/BaseCoreActivity;
    .locals 1

    invoke-virtual {p0}, LxE;->getActivity()Lco/bird/android/core/mvp/BaseActivity;

    move-result-object v0

    return-object v0
.end method

.method public getAdapter()LoA;
    .locals 1

    iget-object v0, p0, LKl6;->c:LoA;

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

    invoke-static {p0, p1}, LJl6$a;->d(LJl6;Ljava/util/Collection;)V

    return-void
.end method

.method public t1()V
    .locals 0

    invoke-static {p0}, LJl6$a;->a(LJl6;)V

    return-void
.end method

.method public v9(Lco/bird/android/model/VehicleCommand;)V
    .locals 0

    invoke-static {p0, p1}, LJl6$a;->g(LJl6;Lco/bird/android/model/VehicleCommand;)V

    return-void
.end method
