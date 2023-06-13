.class public final Lmp0;
.super LxE;
.source "SourceFile"

# interfaces
.implements Llp0;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0008\u0007\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010\u0005R\u001a\u0010\u000c\u001a\u00020\u00078\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\u0011"
    }
    d2 = {
        "Lmp0;",
        "LxE;",
        "Llp0;",
        "LKZ;",
        "b",
        "LKZ;",
        "binding",
        "LYm0;",
        "c",
        "LYm0;",
        "Pl",
        "()LYm0;",
        "adapter",
        "Lco/bird/android/core/mvp/BaseActivity;",
        "activity",
        "<init>",
        "(Lco/bird/android/core/mvp/BaseActivity;LKZ;)V",
        "co.bird.android.feature.lib.command"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final b:LKZ;

.field public final c:LYm0;


# direct methods
.method public constructor <init>(Lco/bird/android/core/mvp/BaseActivity;LKZ;)V
    .locals 2

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "binding"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LxE;-><init>(Lco/bird/android/core/mvp/BaseActivity;)V

    iput-object p2, p0, Lmp0;->b:LKZ;

    new-instance v0, LYm0;

    invoke-direct {v0}, LYm0;-><init>()V

    iput-object v0, p0, Lmp0;->c:LYm0;

    iget-object v0, p2, LKZ;->b:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-direct {v1, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$p;)V

    iget-object p1, p2, LKZ;->b:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p0}, Lmp0;->Pl()LYm0;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$h;)V

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

    invoke-static {p0}, Llp0$a;->c(Llp0;)Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public Jd(Lco/bird/android/model/VehicleCommand;)V
    .locals 0

    invoke-static {p0, p1}, Llp0$a;->d(Llp0;Lco/bird/android/model/VehicleCommand;)V

    return-void
.end method

.method public M3(Lco/bird/android/model/VehicleCommand;)V
    .locals 0

    invoke-static {p0, p1}, Llp0$a;->h(Llp0;Lco/bird/android/model/VehicleCommand;)V

    return-void
.end method

.method public Pl()LYm0;
    .locals 1

    iget-object v0, p0, Lmp0;->c:LYm0;

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

    invoke-static {p0, p1}, Llp0$a;->f(Llp0;Ljava/util/List;)Lio/reactivex/p;

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

    invoke-virtual {p0}, Lmp0;->Pl()LYm0;

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

    invoke-static {p0, p1}, Llp0$a;->e(Llp0;Ljava/util/Collection;)V

    return-void
.end method

.method public t1()V
    .locals 0

    invoke-static {p0}, Llp0$a;->b(Llp0;)V

    return-void
.end method

.method public v9(Lco/bird/android/model/VehicleCommand;)V
    .locals 0

    invoke-static {p0, p1}, Llp0$a;->i(Llp0;Lco/bird/android/model/VehicleCommand;)V

    return-void
.end method
