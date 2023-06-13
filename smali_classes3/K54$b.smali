.class public final LK54$b;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LK54;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "b"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u0012"
    }
    d2 = {
        "LK54$b;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "LJe2;",
        "b",
        "LJe2;",
        "binding",
        "LU24;",
        "c",
        "LU24;",
        "privateBirdsAdapter",
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
        "SMAP\nPrivateBirdsOverviewAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrivateBirdsOverviewAdapter.kt\nco/bird/android/feature/ownedbirds/adapters/PrivateBirdsOverviewAdapter$PrivateBirdsViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,123:1\n18#2:124\n9#3,4:125\n*S KotlinDebug\n*F\n+ 1 PrivateBirdsOverviewAdapter.kt\nco/bird/android/feature/ownedbirds/adapters/PrivateBirdsOverviewAdapter$PrivateBirdsViewHolder\n*L\n91#1:124\n91#1:125,4\n*E\n"
    }
.end annotation


# instance fields
.field public final b:LJe2;

.field public final c:LU24;

.field public final synthetic d:LK54;


# direct methods
.method public constructor <init>(LK54;Landroid/view/View;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            ")V"
        }
    .end annotation

    const-string v0, "view"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LK54$b;->d:LK54;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    invoke-static {p2}, LJe2;->a(Landroid/view/View;)LJe2;

    move-result-object p2

    const-string v0, "bind(view)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, LK54$b;->b:LJe2;

    new-instance v0, LU24;

    invoke-direct {v0}, LU24;-><init>()V

    iput-object v0, p0, LK54$b;->c:LU24;

    iget-object p2, p2, LJe2;->b:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v1, LJ44;

    invoke-direct {v1}, LJ44;-><init>()V

    invoke-virtual {p2, v1}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$o;)V

    new-instance v1, Landroidx/recyclerview/widget/g;

    invoke-direct {v1}, Landroidx/recyclerview/widget/g;-><init>()V

    invoke-virtual {p2, v1}, Landroidx/recyclerview/widget/RecyclerView;->setItemAnimator(Landroidx/recyclerview/widget/RecyclerView$m;)V

    invoke-virtual {p2, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$h;)V

    new-instance p2, LK54$b$a;

    invoke-static {p1}, LK54;->access$getInfoClicksSubject$p(LK54;)Lio/reactivex/subjects/d;

    move-result-object v1

    invoke-direct {p2, v1}, LK54$b$a;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, p2}, LU24;->v(Lkotlin/jvm/functions/Function1;)V

    new-instance p2, LK54$b$b;

    invoke-static {p1}, LK54;->access$getPrivateBirdClicksSubject$p(LK54;)Lio/reactivex/subjects/d;

    move-result-object p1

    invoke-direct {p2, p1}, LK54$b$b;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, p2}, LU24;->w(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method


# virtual methods
.method public bind(I)V
    .locals 1

    iget-object v0, p0, LK54$b;->d:LK54;

    invoke-static {v0}, LK54;->access$getAdapterData(LK54;)LE6;

    move-result-object v0

    invoke-virtual {v0, p1}, LE6;->e(I)LG6;

    move-result-object p1

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, LH6;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    check-cast p1, LH6;

    if-eqz p1, :cond_1

    iget-object v0, p0, LK54$b;->c:LU24;

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    invoke-virtual {v0, p1}, LMy;->u(Ljava/util/Collection;)V

    :cond_1
    return-void
.end method
