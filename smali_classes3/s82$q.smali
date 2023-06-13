.class public final Ls82$q;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ls82;->O(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/Pair<",
        "+",
        "Lco/bird/android/model/User;",
        "+",
        "Lco/bird/api/response/WarehouseInventory;",
        ">;",
        "Lio/reactivex/K<",
        "+",
        "Lco/bird/api/response/WarehouseInventory;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0006\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00050\u00052\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\u000c\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "Lkotlin/Pair;",
        "Lco/bird/android/model/User;",
        "Lco/bird/api/response/WarehouseInventory;",
        "kotlin.jvm.PlatformType",
        "<name for destructuring parameter 0>",
        "Lio/reactivex/K;",
        "b",
        "(Lkotlin/Pair;)Lio/reactivex/K;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Ls82;

.field public final synthetic h:I


# direct methods
.method public constructor <init>(Ls82;I)V
    .locals 0

    iput-object p1, p0, Ls82$q;->g:Ls82;

    iput p2, p0, Ls82$q;->h:I

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/api/response/WarehouseInventory;
    .locals 0

    invoke-static {p0, p1}, Ls82$q;->c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/api/response/WarehouseInventory;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/api/response/WarehouseInventory;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lco/bird/api/response/WarehouseInventory;

    return-object p0
.end method


# virtual methods
.method public final b(Lkotlin/Pair;)Lio/reactivex/K;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "Lco/bird/android/model/User;",
            "Lco/bird/api/response/WarehouseInventory;",
            ">;)",
            "Lio/reactivex/K<",
            "+",
            "Lco/bird/api/response/WarehouseInventory;",
            ">;"
        }
    .end annotation

    const-string v0, "<name for destructuring parameter 0>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/User;

    invoke-virtual {p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/api/response/WarehouseInventory;

    iget-object v1, p0, Ls82$q;->g:Ls82;

    invoke-static {v1}, Ls82;->access$getInventoryManager$p(Ls82;)LI82;

    move-result-object v1

    invoke-virtual {v0}, Lco/bird/android/model/User;->getWarehouseId()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_0

    const-string v2, ""

    :cond_0
    invoke-virtual {p1}, Lco/bird/api/response/WarehouseInventory;->getBinDefinition()Lco/bird/api/response/WireBinDefinition;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v3}, Lco/bird/api/response/WireBinDefinition;->getSku()Ljava/lang/String;

    move-result-object v3

    iget v4, p0, Ls82$q;->h:I

    invoke-virtual {p1}, Lco/bird/api/response/WarehouseInventory;->getBinCount()Ljava/lang/Integer;

    move-result-object v5

    if-eqz v5, :cond_1

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    goto :goto_0

    :cond_1
    const/4 v5, 0x0

    :goto_0
    sub-int/2addr v4, v5

    invoke-virtual {v0}, Lco/bird/android/model/User;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v2, v3, v4, v0}, LI82;->c(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Lio/reactivex/F;

    move-result-object v0

    invoke-static {v0}, Lag5;->l(Lio/reactivex/F;)Lio/reactivex/F;

    move-result-object v0

    new-instance v1, Ls82$q$a;

    invoke-direct {v1, p1}, Ls82$q$a;-><init>(Lco/bird/api/response/WarehouseInventory;)V

    new-instance p1, Lv82;

    invoke-direct {p1, v1}, Lv82;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, p1}, Lio/reactivex/F;->I(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Pair;

    invoke-virtual {p0, p1}, Ls82$q;->b(Lkotlin/Pair;)Lio/reactivex/K;

    move-result-object p1

    return-object p1
.end method
