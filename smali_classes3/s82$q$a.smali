.class public final Ls82$q$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ls82$q;->b(Lkotlin/Pair;)Lio/reactivex/K;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/api/response/WireInventoryCount;",
        "Lco/bird/api/response/WarehouseInventory;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/api/response/WireInventoryCount;",
        "it",
        "Lco/bird/api/response/WarehouseInventory;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lco/bird/api/response/WireInventoryCount;)Lco/bird/api/response/WarehouseInventory;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/api/response/WarehouseInventory;


# direct methods
.method public constructor <init>(Lco/bird/api/response/WarehouseInventory;)V
    .locals 0

    iput-object p1, p0, Ls82$q$a;->g:Lco/bird/api/response/WarehouseInventory;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/api/response/WireInventoryCount;)Lco/bird/api/response/WarehouseInventory;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Ls82$q$a;->g:Lco/bird/api/response/WarehouseInventory;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/api/response/WireInventoryCount;

    invoke-virtual {p0, p1}, Ls82$q$a;->a(Lco/bird/api/response/WireInventoryCount;)Lco/bird/api/response/WarehouseInventory;

    move-result-object p1

    return-object p1
.end method
