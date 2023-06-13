.class public final Ls82$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ls82;-><init>(Llh6;LA82;Lcom/uber/autodispose/ScopeProvider;LI82;LGt5;LEa;Le13;Lwi2;LD82;)V
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


# direct methods
.method public constructor <init>(Ls82;)V
    .locals 0

    iput-object p1, p0, Ls82$b;->g:Ls82;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Pair;

    invoke-virtual {p0, p1}, Ls82$b;->invoke(Lkotlin/Pair;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lkotlin/Pair;)V
    .locals 12
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

    invoke-virtual {p1}, Lco/bird/api/response/WarehouseInventory;->getBinDefinition()Lco/bird/api/response/WireBinDefinition;

    move-result-object v1

    if-eqz v1, :cond_4

    iget-object v2, p0, Ls82$b;->g:Ls82;

    invoke-static {v2}, Ls82;->access$getUi$p(Ls82;)LA82;

    move-result-object v3

    invoke-virtual {v0}, Lco/bird/android/model/Warehouse;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v4, ""

    if-nez v0, :cond_0

    move-object v0, v4

    :cond_0
    invoke-virtual {p1}, Lco/bird/api/response/WarehouseInventory;->getName()Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_1

    move-object v5, v4

    :cond_1
    invoke-virtual {v1}, Lco/bird/api/response/WireBinDefinition;->getSku()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1}, Lco/bird/api/response/WireBinDefinition;->getSize()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1}, Lco/bird/api/response/WireBinDefinition;->getMaxQuantity()I

    move-result v8

    invoke-static {v2}, Ls82;->access$getCountSubject$p(Ls82;)Lio/reactivex/subjects/a;

    move-result-object v1

    invoke-virtual {v1}, Lio/reactivex/subjects/a;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    if-nez v1, :cond_2

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    :cond_2
    const-string v2, "countSubject.value ?: 0"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v9

    invoke-virtual {p1}, Lco/bird/api/response/WarehouseInventory;->getExcessInventoryQuantity()I

    move-result v10

    invoke-virtual {p1}, Lco/bird/api/response/WarehouseInventory;->getBinWeight()Ljava/lang/Float;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    goto :goto_0

    :cond_3
    const/4 p1, 0x0

    :goto_0
    move v11, p1

    move-object v4, v0

    invoke-interface/range {v3 .. v11}, LA82;->U9(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIF)V

    :cond_4
    return-void
.end method
