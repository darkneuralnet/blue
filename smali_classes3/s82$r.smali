.class public final Ls82$r;
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
        "Lco/bird/api/response/WarehouseInventory;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/api/response/WarehouseInventory;",
        "kotlin.jvm.PlatformType",
        "warehouseInventory",
        "",
        "a",
        "(Lco/bird/api/response/WarehouseInventory;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ls82;


# direct methods
.method public constructor <init>(ILs82;)V
    .locals 0

    iput p1, p0, Ls82$r;->g:I

    iput-object p2, p0, Ls82$r;->h:Ls82;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/api/response/WarehouseInventory;)V
    .locals 13

    iget v0, p0, Ls82$r;->g:I

    invoke-virtual {p1}, Lco/bird/api/response/WarehouseInventory;->getBinCount()Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    if-ge v0, v1, :cond_1

    invoke-virtual {p1}, Lco/bird/api/response/WarehouseInventory;->getExcessInventoryQuantity()I

    move-result v0

    if-lez v0, :cond_1

    iget-object v0, p0, Ls82$r;->h:Ls82;

    invoke-static {v0}, Ls82;->access$getUi$p(Ls82;)LA82;

    move-result-object v0

    new-instance v1, Lih1;

    invoke-virtual {p1}, Lco/bird/api/response/WarehouseInventory;->getExcessInventoryQuantity()I

    move-result v3

    invoke-direct {v1, v3}, Lih1;-><init>(I)V

    const/4 v3, 0x1

    invoke-interface {v0, v1, v2, v3}, LH31;->dialog(LNy;ZZ)Lio/reactivex/F;

    move-result-object v0

    invoke-virtual {v0}, Lio/reactivex/F;->subscribe()Lio/reactivex/disposables/c;

    :cond_1
    iget-object v0, p0, Ls82$r;->h:Ls82;

    invoke-static {v0}, Ls82;->access$getAnalyticsManager$p(Ls82;)LEa;

    move-result-object v0

    new-instance v1, LPj2;

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v4

    const-string v3, "randomUUID().toString()"

    invoke-static {v4, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, p0, Ls82$r;->h:Ls82;

    invoke-static {v3}, Ls82;->access$getSessionId$p(Ls82;)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-virtual {p1}, Lco/bird/api/response/WarehouseInventory;->getBinDefinition()Lco/bird/api/response/WireBinDefinition;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v3}, Lco/bird/api/response/WireBinDefinition;->getSku()Ljava/lang/String;

    move-result-object v8

    iget v9, p0, Ls82$r;->g:I

    invoke-virtual {p1}, Lco/bird/api/response/WarehouseInventory;->getBinCount()Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v2

    :cond_2
    sub-int v10, v9, v2

    const/16 v11, 0xc

    const/4 v12, 0x0

    move-object v3, v1

    invoke-direct/range {v3 .. v12}, LPj2;-><init>(Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v1}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/api/response/WarehouseInventory;

    invoke-virtual {p0, p1}, Ls82$r;->a(Lco/bird/api/response/WarehouseInventory;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
