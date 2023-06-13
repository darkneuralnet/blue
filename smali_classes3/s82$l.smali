.class public final Ls82$l;
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
        "Lkotlin/Pair<",
        "+",
        "Lco/bird/android/model/Warehouse;",
        "+",
        "Lco/bird/api/response/WarehouseInventory;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012F\u0010\u0002\u001aB\u0012\u000c\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\u000c\u0012\n \u0005*\u0004\u0018\u00010\u00060\u0006 \u0005* \u0012\u000c\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\u000c\u0012\n \u0005*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\u0008\u0007"
    }
    d2 = {
        "<anonymous>",
        "",
        "<name for destructuring parameter 0>",
        "Lkotlin/Pair;",
        "Lco/bird/android/model/Warehouse;",
        "kotlin.jvm.PlatformType",
        "Lco/bird/api/response/WarehouseInventory;",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic g:Ls82;

.field public final synthetic h:Lco/bird/android/model/InventorySku;


# direct methods
.method public constructor <init>(Ls82;Lco/bird/android/model/InventorySku;)V
    .locals 0

    iput-object p1, p0, Ls82$l;->g:Ls82;

    iput-object p2, p0, Ls82$l;->h:Lco/bird/android/model/InventorySku;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Pair;

    invoke-virtual {p0, p1}, Ls82$l;->invoke(Lkotlin/Pair;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lkotlin/Pair;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "Lco/bird/android/model/Warehouse;",
            "Lco/bird/api/response/WarehouseInventory;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/Warehouse;

    invoke-virtual {p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/api/response/WarehouseInventory;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lco/bird/api/response/WarehouseInventory;->getBinDefinition()Lco/bird/api/response/WireBinDefinition;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lco/bird/api/response/WireBinDefinition;->getSku()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    move-object v7, v1

    if-nez v7, :cond_1

    iget-object p1, p0, Ls82$l;->g:Ls82;

    iget-object v0, p0, Ls82$l;->h:Lco/bird/android/model/InventorySku;

    invoke-virtual {v0}, Lco/bird/android/model/InventorySku;->getSku()Ljava/lang/String;

    move-result-object v0

    const-string v1, "no_bin_definition"

    invoke-static {p1, v0, v1}, Ls82;->access$trackScanFailedEvent(Ls82;Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Ls82$l;->g:Ls82;

    invoke-static {p1}, Ls82;->access$getNavigator$p(Ls82;)Le13;

    move-result-object p1

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const/4 v1, 0x0

    invoke-interface {p1, v1, v0}, Le13;->e4(ILandroid/content/Intent;)V

    iget-object p1, p0, Ls82$l;->g:Ls82;

    invoke-static {p1}, Ls82;->access$getUi$p(Ls82;)LA82;

    move-result-object p1

    sget v0, Lnl4;->inventory_bins_not_found:I

    sget-object v1, Lf56;->d:Lf56;

    invoke-interface {p1, v0, v1}, Lh56;->topToast(ILf56;)V

    goto :goto_1

    :cond_1
    iget-object v1, p0, Ls82$l;->g:Ls82;

    invoke-static {v1}, Ls82;->access$getWarehouseInventorySubject$p(Ls82;)Lio/reactivex/subjects/a;

    move-result-object v1

    invoke-virtual {v1, p1}, Lio/reactivex/subjects/a;->onNext(Ljava/lang/Object;)V

    iget-object p1, p0, Ls82$l;->g:Ls82;

    invoke-static {p1}, Ls82;->access$getWarehouseSubject$p(Ls82;)Lio/reactivex/subjects/a;

    move-result-object p1

    invoke-virtual {p1, v0}, Lio/reactivex/subjects/a;->onNext(Ljava/lang/Object;)V

    iget-object p1, p0, Ls82$l;->g:Ls82;

    invoke-static {p1}, Ls82;->access$getAnalyticsManager$p(Ls82;)LEa;

    move-result-object p1

    new-instance v0, LQj2;

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v1, "randomUUID().toString()"

    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Ls82$l;->g:Ls82;

    invoke-static {v1}, Ls82;->access$getSessionId$p(Ls82;)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v8, 0xc

    const/4 v9, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v9}, LQj2;-><init>(Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p1, v0}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    :goto_1
    return-void
.end method
