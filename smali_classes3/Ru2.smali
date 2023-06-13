.class public final LRu2;
.super LyS0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LRu2$a;,
        LRu2$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\r\u0018\u00002\u00020\u0001:\u0002\u001e\u001fB\u0007\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\n\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0016J\u0012\u0010\r\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000c0\u000b0\nJ\u0018\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e0\nJ\u001a\u0010\u0012\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u000e0\nR.\u0010\u0017\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u000c \u0014*\n\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u000b0\u000b0\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R:\u0010\u0019\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010 \u0014*\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000e0\u000e0\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0016R>\u0010\u001b\u001a,\u0012(\u0012&\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0004 \u0014*\u0012\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u000e0\u000e0\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u0016\u00a8\u0006 "
    }
    d2 = {
        "LRu2;",
        "LyS0;",
        "Landroid/view/ViewGroup;",
        "parent",
        "",
        "viewType",
        "Lw1;",
        "onCreateViewHolder",
        "LF6;",
        "r",
        "Lio/reactivex/Observable;",
        "Lco/bird/android/buava/Optional;",
        "",
        "y5",
        "Lkotlin/Pair;",
        "LfN1;",
        "",
        "I7",
        "j8",
        "Lma4;",
        "kotlin.jvm.PlatformType",
        "c",
        "Lma4;",
        "localAddressChangesRelay",
        "d",
        "hostEnablesRelay",
        "e",
        "hostPortChangesRelay",
        "<init>",
        "()V",
        "a",
        "b",
        "co.bird.android.feature.localhost"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final c:Lma4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lma4<",
            "Lco/bird/android/buava/Optional<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field public final d:Lma4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lma4<",
            "Lkotlin/Pair<",
            "LfN1;",
            "Ljava/lang/Boolean;",
            ">;>;"
        }
    .end annotation
.end field

.field public final e:Lma4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lma4<",
            "Lkotlin/Pair<",
            "LfN1;",
            "Ljava/lang/Integer;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, LyS0;-><init>()V

    invoke-static {}, Lma4;->g()Lma4;

    move-result-object v0

    const-string v1, "create<Optional<String>>()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, LRu2;->c:Lma4;

    invoke-static {}, Lma4;->g()Lma4;

    move-result-object v0

    const-string v1, "create<Pair<Host, Boolean>>()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, LRu2;->d:Lma4;

    invoke-static {}, Lma4;->g()Lma4;

    move-result-object v0

    const-string v1, "create<Pair<Host, Int?>>()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, LRu2;->e:Lma4;

    return-void
.end method

.method public static final synthetic access$getAdapterData(LRu2;)LE6;
    .locals 0

    invoke-virtual {p0}, LMy;->o()LE6;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getHostEnablesRelay$p(LRu2;)Lma4;
    .locals 0

    iget-object p0, p0, LRu2;->d:Lma4;

    return-object p0
.end method

.method public static final synthetic access$getHostPortChangesRelay$p(LRu2;)Lma4;
    .locals 0

    iget-object p0, p0, LRu2;->e:Lma4;

    return-object p0
.end method

.method public static final synthetic access$getLocalAddressChangesRelay$p(LRu2;)Lma4;
    .locals 0

    iget-object p0, p0, LRu2;->c:Lma4;

    return-object p0
.end method


# virtual methods
.method public final I7()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Pair<",
            "LfN1;",
            "Ljava/lang/Boolean;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, LRu2;->d:Lma4;

    invoke-virtual {v0}, Lio/reactivex/Observable;->hide()Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "hostEnablesRelay.hide()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final j8()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Pair<",
            "LfN1;",
            "Ljava/lang/Integer;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, LRu2;->e:Lma4;

    invoke-virtual {v0}, Lio/reactivex/Observable;->hide()Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "hostPortChangesRelay.hide()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$D;
    .locals 0

    invoke-virtual {p0, p1, p2}, LRu2;->onCreateViewHolder(Landroid/view/ViewGroup;I)Lw1;

    move-result-object p1

    return-object p1
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Lw1;
    .locals 2

    const-string v0, "parent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "parent.context"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    invoke-static {v0, p2, p1, v1}, LfB0;->u(Landroid/content/Context;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    sget v0, Ljj4;->item_local_address:I

    if-ne p2, v0, :cond_0

    new-instance p2, LRu2$b;

    invoke-direct {p2, p0, p1}, LRu2$b;-><init>(LRu2;Landroid/view/View;)V

    goto :goto_0

    :cond_0
    sget v0, Ljj4;->item_host:I

    if-ne p2, v0, :cond_1

    new-instance p2, LRu2$a;

    invoke-direct {p2, p0, p1}, LRu2$a;-><init>(LRu2;Landroid/view/View;)V

    goto :goto_0

    :cond_1
    new-instance p2, Lw1;

    invoke-direct {p2, p1}, Lw1;-><init>(Landroid/view/View;)V

    :goto_0
    return-object p2
.end method

.method public r()LF6;
    .locals 1

    new-instance v0, LSu2;

    invoke-direct {v0}, LSu2;-><init>()V

    return-object v0
.end method

.method public final y5()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/buava/Optional<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, LRu2;->c:Lma4;

    invoke-virtual {v0}, Lio/reactivex/Observable;->hide()Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "localAddressChangesRelay.hide()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
