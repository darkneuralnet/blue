.class public final LiC5;
.super Lf86;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LiC5$a;,
        LiC5$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0018\u00002\u00020\u0001:\u0002\u0018\u0019B\u0007\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008J\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u0008J\n\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016R\"\u0010\u0013\u001a\u0010\u0012\u000c\u0012\n \u0010*\u0004\u0018\u00010\t0\t0\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R\"\u0010\u0015\u001a\u0010\u0012\u000c\u0012\n \u0010*\u0004\u0018\u00010\u000b0\u000b0\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0012\u00a8\u0006\u001a"
    }
    d2 = {
        "LiC5;",
        "Lf86;",
        "Landroid/view/ViewGroup;",
        "parent",
        "",
        "viewType",
        "Lw1;",
        "onCreateViewHolder",
        "Lio/reactivex/Observable;",
        "",
        "y",
        "",
        "A",
        "LF6;",
        "r",
        "Lio/reactivex/subjects/d;",
        "kotlin.jvm.PlatformType",
        "d",
        "Lio/reactivex/subjects/d;",
        "skuOrderClicksSubject",
        "e",
        "vehiclesInOrderClickSubject",
        "<init>",
        "()V",
        "a",
        "b",
        "co.bird.android.feature.transfer-order"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final d:Lio/reactivex/subjects/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/d<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Lio/reactivex/subjects/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/d<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lf86;-><init>()V

    invoke-static {}, Lio/reactivex/subjects/d;->e()Lio/reactivex/subjects/d;

    move-result-object v0

    const-string v1, "create<Unit>()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, LiC5;->d:Lio/reactivex/subjects/d;

    invoke-static {}, Lio/reactivex/subjects/d;->e()Lio/reactivex/subjects/d;

    move-result-object v0

    const-string v1, "create<String>()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, LiC5;->e:Lio/reactivex/subjects/d;

    return-void
.end method

.method public static final synthetic access$getAdapterData(LiC5;)LE6;
    .locals 0

    invoke-virtual {p0}, LMy;->o()LE6;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getSkuOrderClicksSubject$p(LiC5;)Lio/reactivex/subjects/d;
    .locals 0

    iget-object p0, p0, LiC5;->d:Lio/reactivex/subjects/d;

    return-object p0
.end method

.method public static final synthetic access$getVehiclesInOrderClickSubject$p(LiC5;)Lio/reactivex/subjects/d;
    .locals 0

    iget-object p0, p0, LiC5;->e:Lio/reactivex/subjects/d;

    return-object p0
.end method


# virtual methods
.method public final A()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LiC5;->e:Lio/reactivex/subjects/d;

    invoke-virtual {v0}, Lio/reactivex/Observable;->hide()Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "vehiclesInOrderClickSubject.hide()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$D;
    .locals 0

    invoke-virtual {p0, p1, p2}, LiC5;->onCreateViewHolder(Landroid/view/ViewGroup;I)Lw1;

    move-result-object p1

    return-object p1
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Lw1;
    .locals 3

    const-string v0, "parent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "parent.context"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    invoke-static {v0, p2, p1, v1}, LfB0;->u(Landroid/content/Context;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    sget v0, LQj4;->item_container_order_details_header:I

    if-ne p2, v0, :cond_0

    new-instance p2, LUl0$a;

    invoke-direct {p2, p0, p1}, LUl0$a;-><init>(LUl0;Landroid/view/View;)V

    goto :goto_2

    :cond_0
    sget v0, LQj4;->item_container_order_status:I

    const/4 v2, 0x1

    if-ne p2, v0, :cond_1

    :goto_0
    move v1, v2

    goto :goto_1

    :cond_1
    sget v0, LQj4;->item_sku_order_status:I

    if-ne p2, v0, :cond_2

    goto :goto_0

    :cond_2
    :goto_1
    if-eqz v1, :cond_3

    new-instance p2, Lf86$e;

    invoke-direct {p2, p0, p1}, Lf86$e;-><init>(Lf86;Landroid/view/View;)V

    goto :goto_2

    :cond_3
    sget v0, LQj4;->item_container_order_sku_order:I

    if-ne p2, v0, :cond_4

    new-instance p2, Lf86$g;

    invoke-direct {p2, p0, p1}, Lf86$g;-><init>(Lf86;Landroid/view/View;)V

    goto :goto_2

    :cond_4
    sget v0, LQj4;->item_header_spannable_status_cta:I

    if-ne p2, v0, :cond_5

    new-instance p2, LiC5$a;

    invoke-direct {p2, p0, p1}, LiC5$a;-><init>(LiC5;Landroid/view/View;)V

    goto :goto_2

    :cond_5
    sget v0, LQj4;->item_header_value:I

    if-ne p2, v0, :cond_6

    new-instance p2, Lf86$d;

    invoke-direct {p2, p0, p1}, Lf86$d;-><init>(Lf86;Landroid/view/View;)V

    goto :goto_2

    :cond_6
    sget v0, LQj4;->item_transfer_order:I

    if-ne p2, v0, :cond_7

    new-instance p2, Lf86$h;

    invoke-direct {p2, p0, p1}, Lf86$h;-><init>(Lf86;Landroid/view/View;)V

    goto :goto_2

    :cond_7
    sget v0, LQj4;->item_vehicles_in_order:I

    if-ne p2, v0, :cond_8

    new-instance p2, LiC5$b;

    invoke-direct {p2, p0, p1}, LiC5$b;-><init>(LiC5;Landroid/view/View;)V

    goto :goto_2

    :cond_8
    new-instance p2, Lw1;

    invoke-direct {p2, p1}, Lw1;-><init>(Landroid/view/View;)V

    :goto_2
    return-object p2
.end method

.method public r()LF6;
    .locals 1

    new-instance v0, LjC5;

    invoke-direct {v0}, LjC5;-><init>()V

    return-object v0
.end method

.method public final y()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LiC5;->d:Lio/reactivex/subjects/d;

    invoke-virtual {v0}, Lio/reactivex/Observable;->hide()Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "skuOrderClicksSubject.hide()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
