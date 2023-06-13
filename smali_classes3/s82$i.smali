.class public final Ls82$i;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ls82;->a(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/User;",
        "Lio/reactivex/K<",
        "+",
        "Lkotlin/Pair<",
        "+",
        "Lco/bird/android/model/Warehouse;",
        "+",
        "Lco/bird/api/response/WarehouseInventory;",
        ">;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0007\u001a\u009a\u0001\u0012F\u0008\u0001\u0012B\u0012\u000c\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\u000c\u0012\n \u0005*\u0004\u0018\u00010\u00060\u0006 \u0005* \u0012\u000c\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\u000c\u0012\n \u0005*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00030\u0003 \u0005*L\u0012F\u0008\u0001\u0012B\u0012\u000c\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\u000c\u0012\n \u0005*\u0004\u0018\u00010\u00060\u0006 \u0005* \u0012\u000c\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\u000c\u0012\n \u0005*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0007\u0010\u0008"
    }
    d2 = {
        "Lco/bird/android/model/User;",
        "user",
        "Lio/reactivex/K;",
        "Lkotlin/Pair;",
        "Lco/bird/android/model/Warehouse;",
        "kotlin.jvm.PlatformType",
        "Lco/bird/api/response/WarehouseInventory;",
        "a",
        "(Lco/bird/android/model/User;)Lio/reactivex/K;"
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

.field public final synthetic h:Lco/bird/android/model/InventorySku;


# direct methods
.method public constructor <init>(Ls82;Lco/bird/android/model/InventorySku;)V
    .locals 0

    iput-object p1, p0, Ls82$i;->g:Ls82;

    iput-object p2, p0, Ls82$i;->h:Lco/bird/android/model/InventorySku;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/User;)Lio/reactivex/K;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/User;",
            ")",
            "Lio/reactivex/K<",
            "+",
            "Lkotlin/Pair<",
            "Lco/bird/android/model/Warehouse;",
            "Lco/bird/api/response/WarehouseInventory;",
            ">;>;"
        }
    .end annotation

    const-string v0, "user"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lio/reactivex/rxkotlin/g;->a:Lio/reactivex/rxkotlin/g;

    iget-object v1, p0, Ls82$i;->g:Ls82;

    invoke-static {v1}, Ls82;->access$getServiceCenterManager$p(Ls82;)LGt5;

    move-result-object v1

    invoke-virtual {p1}, Lco/bird/android/model/User;->getWarehouseId()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-interface {v1, v2}, LGt5;->a(Ljava/lang/String;)Lio/reactivex/F;

    move-result-object v1

    invoke-static {v1}, Lag5;->l(Lio/reactivex/F;)Lio/reactivex/F;

    move-result-object v1

    iget-object v2, p0, Ls82$i;->g:Ls82;

    invoke-static {v2}, Ls82;->access$getInventoryManager$p(Ls82;)LI82;

    move-result-object v2

    invoke-virtual {p1}, Lco/bird/android/model/User;->getWarehouseId()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget-object v3, p0, Ls82$i;->h:Lco/bird/android/model/InventorySku;

    invoke-virtual {v3}, Lco/bird/android/model/InventorySku;->getSku()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, p1, v3}, LI82;->a(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/F;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lio/reactivex/rxkotlin/g;->a(Lio/reactivex/K;Lio/reactivex/K;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/User;

    invoke-virtual {p0, p1}, Ls82$i;->a(Lco/bird/android/model/User;)Lio/reactivex/K;

    move-result-object p1

    return-object p1
.end method
