.class public final Lco/bird/android/feature/ridepass/v4/list/RidePassV4Activity;
.super Lco/bird/android/core/mrp/BaseActivityLite;
.source "SourceFile"

# interfaces
.implements LyX4;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\u00a2\u0006\u0004\u0008!\u0010\"J\u0012\u0010\u0006\u001a\u00020\u00052\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u0007H\u0016J\u000e\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\nH\u0016R\"\u0010\u0014\u001a\u00020\r8\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008\u000e\u0010\u000f\u001a\u0004\u0008\u0010\u0010\u0011\"\u0004\u0008\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001f\u00a8\u0006#"
    }
    d2 = {
        "Lco/bird/android/feature/ridepass/v4/list/RidePassV4Activity;",
        "Lco/bird/android/core/mrp/BaseActivityLite;",
        "LyX4;",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "",
        "onCreate",
        "LzX4;",
        "state",
        "Q",
        "Lio/reactivex/Observable;",
        "Lco/bird/android/model/persistence/RidePassView;",
        "z8",
        "LxX4;",
        "j",
        "LxX4;",
        "P",
        "()LxX4;",
        "setPresenter",
        "(LxX4;)V",
        "presenter",
        "LM5;",
        "k",
        "LM5;",
        "binding",
        "LCW4;",
        "l",
        "LCW4;",
        "converter",
        "LAW4;",
        "m",
        "LAW4;",
        "adapter",
        "<init>",
        "()V",
        "ride-pass_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nRidePassV4Activity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RidePassV4Activity.kt\nco/bird/android/feature/ridepass/v4/list/RidePassV4Activity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,56:1\n1#2:57\n*E\n"
    }
.end annotation


# instance fields
.field public j:LxX4;

.field public k:LM5;

.field public final l:LCW4;

.field public final m:LAW4;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lco/bird/android/core/mrp/BaseActivityLite;-><init>()V

    new-instance v0, LCW4;

    invoke-direct {v0, p0}, LCW4;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lco/bird/android/feature/ridepass/v4/list/RidePassV4Activity;->l:LCW4;

    new-instance v0, LAW4;

    invoke-direct {v0}, LAW4;-><init>()V

    iput-object v0, p0, Lco/bird/android/feature/ridepass/v4/list/RidePassV4Activity;->m:LAW4;

    return-void
.end method


# virtual methods
.method public final P()LxX4;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/ridepass/v4/list/RidePassV4Activity;->j:LxX4;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "presenter"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public Q(LzX4;)V
    .locals 1

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, LUe6;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lco/bird/android/feature/ridepass/v4/list/RidePassV4Activity;->l:LCW4;

    check-cast p1, LUe6;

    invoke-virtual {p1}, LUe6;->b()Ljava/util/List;

    move-result-object p1

    invoke-virtual {v0, p1}, LCW4;->b(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iget-object v0, p0, Lco/bird/android/feature/ridepass/v4/list/RidePassV4Activity;->m:LAW4;

    check-cast p1, Ljava/util/Collection;

    invoke-virtual {v0, p1}, LMy;->u(Ljava/util/Collection;)V

    :cond_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    invoke-super {p0, p1}, Lco/bird/android/core/mrp/BaseActivityLite;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object p1

    invoke-static {p1}, LM5;->c(Landroid/view/LayoutInflater;)LM5;

    move-result-object p1

    const-string v0, "inflate(layoutInflater)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lco/bird/android/feature/ridepass/v4/list/RidePassV4Activity;->k:LM5;

    const/4 v0, 0x0

    const-string v1, "binding"

    if-nez p1, :cond_0

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p1, v0

    :cond_0
    invoke-virtual {p1}, LM5;->b()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->setContentView(Landroid/view/View;)V

    invoke-static {}, LDP0;->a()LBW4$a;

    move-result-object p1

    invoke-virtual {p0}, Lco/bird/android/core/mrp/BaseActivityLite;->H()LlG2;

    move-result-object v2

    invoke-interface {p1, v2}, LBW4$a;->a(LlG2;)LBW4;

    move-result-object p1

    invoke-interface {p1, p0}, LBW4;->b(Lco/bird/android/feature/ridepass/v4/list/RidePassV4Activity;)V

    iget-object p1, p0, Lco/bird/android/feature/ridepass/v4/list/RidePassV4Activity;->k:LM5;

    if-nez p1, :cond_1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p1, v0

    :cond_1
    invoke-virtual {p1}, LM5;->b()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p1

    new-instance v2, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-direct {v2, p0}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {p1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$p;)V

    iget-object p1, p0, Lco/bird/android/feature/ridepass/v4/list/RidePassV4Activity;->k:LM5;

    if-nez p1, :cond_2

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p1, v0

    :cond_2
    invoke-virtual {p1}, LM5;->b()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p1

    iget-object v2, p0, Lco/bird/android/feature/ridepass/v4/list/RidePassV4Activity;->m:LAW4;

    invoke-virtual {p1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$h;)V

    iget-object p1, p0, Lco/bird/android/feature/ridepass/v4/list/RidePassV4Activity;->k:LM5;

    if-nez p1, :cond_3

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    move-object v0, p1

    :goto_0
    invoke-virtual {v0}, LM5;->b()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p1

    new-instance v0, Landroidx/recyclerview/widget/g;

    invoke-direct {v0}, Landroidx/recyclerview/widget/g;-><init>()V

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setItemAnimator(Landroidx/recyclerview/widget/RecyclerView$m;)V

    invoke-virtual {p0}, Lco/bird/android/feature/ridepass/v4/list/RidePassV4Activity;->P()LxX4;

    move-result-object p1

    invoke-virtual {p1, p0}, LxX4;->p(LyX4;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "ride_pass_link_code"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-virtual {p0}, Lco/bird/android/core/mrp/BaseActivityLite;->w()Le13;

    move-result-object v0

    invoke-interface {v0, p1}, Le13;->j1(Ljava/lang/String;)V

    :cond_4
    return-void
.end method

.method public bridge synthetic render(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LzX4;

    invoke-virtual {p0, p1}, Lco/bird/android/feature/ridepass/v4/list/RidePassV4Activity;->Q(LzX4;)V

    return-void
.end method

.method public z8()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/model/persistence/RidePassView;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/feature/ridepass/v4/list/RidePassV4Activity;->m:LAW4;

    invoke-virtual {v0}, LAW4;->z8()Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method
