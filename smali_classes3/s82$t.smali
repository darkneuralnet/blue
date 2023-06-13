.class public final Ls82$t;
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
        "Ljava/lang/Throwable;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\u0008\u0005"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "",
        "kotlin.jvm.PlatformType",
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

.field public final synthetic h:I


# direct methods
.method public constructor <init>(Ls82;I)V
    .locals 0

    iput-object p1, p0, Ls82$t;->g:Ls82;

    iput p2, p0, Ls82$t;->h:I

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Ls82$t;->invoke(Ljava/lang/Throwable;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Ljava/lang/Throwable;)V
    .locals 12

    iget-object v0, p0, Ls82$t;->g:Ls82;

    invoke-static {v0}, Ls82;->access$getAnalyticsManager$p(Ls82;)LEa;

    move-result-object v0

    new-instance v11, LOj2;

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v1, "randomUUID().toString()"

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Ls82$t;->g:Ls82;

    invoke-static {v1}, Ls82;->access$getSessionId$p(Ls82;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    iget-object v1, p0, Ls82$t;->g:Ls82;

    invoke-static {v1}, Ls82;->access$getWarehouseInventorySubject$p(Ls82;)Lio/reactivex/subjects/a;

    move-result-object v1

    invoke-virtual {v1}, Lio/reactivex/subjects/a;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/api/response/WarehouseInventory;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lco/bird/api/response/WarehouseInventory;->getBinDefinition()Lco/bird/api/response/WireBinDefinition;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lco/bird/api/response/WireBinDefinition;->getSku()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    move-object v6, v1

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget v7, p0, Ls82$t;->h:I

    iget-object v1, p0, Ls82$t;->g:Ls82;

    invoke-static {v1}, Ls82;->access$getWarehouseInventorySubject$p(Ls82;)Lio/reactivex/subjects/a;

    move-result-object v1

    invoke-virtual {v1}, Lio/reactivex/subjects/a;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/api/response/WarehouseInventory;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lco/bird/api/response/WarehouseInventory;->getBinCount()Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    sub-int v8, v7, v1

    const/16 v9, 0xc

    const/4 v10, 0x0

    move-object v1, v11

    invoke-direct/range {v1 .. v10}, LOj2;-><init>(Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v11}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    invoke-static {p1}, Lg46;->e(Ljava/lang/Throwable;)V

    return-void
.end method
