.class public final LK54$a;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LK54;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u0012"
    }
    d2 = {
        "LK54$a;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "Lrd2;",
        "b",
        "Lrd2;",
        "binding",
        "Lu13;",
        "c",
        "Lu13;",
        "birdVehicleAdapter",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(LK54;Landroid/view/View;)V",
        "ownedbirds_release"
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
        "SMAP\nPrivateBirdsOverviewAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrivateBirdsOverviewAdapter.kt\nco/bird/android/feature/ownedbirds/adapters/PrivateBirdsOverviewAdapter$NearbyBirdVehicleViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,123:1\n18#2:124\n9#3,4:125\n1#4:129\n*S KotlinDebug\n*F\n+ 1 PrivateBirdsOverviewAdapter.kt\nco/bird/android/feature/ownedbirds/adapters/PrivateBirdsOverviewAdapter$NearbyBirdVehicleViewHolder\n*L\n116#1:124\n116#1:125,4\n*E\n"
    }
.end annotation


# instance fields
.field public final b:Lrd2;

.field public final c:Lu13;

.field public final synthetic d:LK54;


# direct methods
.method public constructor <init>(LK54;Landroid/view/View;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            ")V"
        }
    .end annotation

    const-string v0, "view"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LK54$a;->d:LK54;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    invoke-static {p2}, Lrd2;->a(Landroid/view/View;)Lrd2;

    move-result-object p2

    const-string v0, "bind(view)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, LK54$a;->b:Lrd2;

    new-instance v0, Lu13;

    invoke-direct {v0}, Lu13;-><init>()V

    iput-object v0, p0, LK54$a;->c:Lu13;

    iget-object v1, p2, Lrd2;->e:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v2, LJ44;

    invoke-direct {v2}, LJ44;-><init>()V

    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$o;)V

    new-instance v2, Landroidx/recyclerview/widget/g;

    invoke-direct {v2}, Landroidx/recyclerview/widget/g;-><init>()V

    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setItemAnimator(Landroidx/recyclerview/widget/RecyclerView$m;)V

    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$h;)V

    iget-object p2, p2, Lrd2;->f:Landroid/widget/ImageView;

    const-string v1, "binding.rescanIcon"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, LK54$a$a;

    invoke-direct {v1, p1}, LK54$a$a;-><init>(LK54;)V

    invoke-static {p2, v1}, LMs2;->j(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    new-instance p2, LK54$a$b;

    invoke-static {p1}, LK54;->access$getNearbyBirdVehicleClicksSubject$p(LK54;)Lio/reactivex/subjects/d;

    move-result-object p1

    invoke-direct {p2, p1}, LK54$a$b;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, p2}, Lu13;->v(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method


# virtual methods
.method public bind(I)V
    .locals 6

    iget-object v0, p0, LK54$a;->d:LK54;

    invoke-static {v0}, LK54;->access$getAdapterData(LK54;)LE6;

    move-result-object v0

    invoke-virtual {v0, p1}, LE6;->e(I)LG6;

    move-result-object p1

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, LH6;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    check-cast p1, LH6;

    const/4 v0, 0x2

    const/4 v2, 0x0

    const-string v3, "binding.nearbyBirdVehicleEmptyState"

    if-eqz p1, :cond_1

    iget-object v4, p0, LK54$a;->b:Lrd2;

    iget-object v4, v4, Lrd2;->c:Landroid/widget/TextView;

    invoke-static {v4, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LH6;->c()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v5

    invoke-static {v4, v5, v2, v0, v1}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    iget-object v4, p0, LK54$a;->c:Lu13;

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    invoke-virtual {v4, p1}, LMy;->u(Ljava/util/Collection;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto :goto_1

    :cond_1
    move-object p1, v1

    :goto_1
    if-nez p1, :cond_2

    iget-object p1, p0, LK54$a;->b:Lrd2;

    iget-object p1, p1, Lrd2;->c:Landroid/widget/TextView;

    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x1

    invoke-static {p1, v3, v2, v0, v1}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    :cond_2
    return-void
.end method
