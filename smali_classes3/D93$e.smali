.class public final LD93$e;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD93;->s(LE93;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LRe4<",
        "+",
        "Ljava/lang/String;",
        "+",
        "Lco/bird/android/model/RepairCategory;",
        "+",
        "Lco/bird/android/model/NonRepair;",
        "+",
        "Lco/bird/android/model/NonRepairReason;",
        "+",
        "Lco/bird/android/buava/Optional<",
        "Lco/bird/android/model/NonRepairReason;",
        ">;>;",
        "Lio/reactivex/K<",
        "+",
        "Lco/bird/android/model/RepairFlow;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\n\u001a*\u0012\u000e\u0008\u0001\u0012\n \t*\u0004\u0018\u00010\u00080\u0008 \t*\u0014\u0012\u000e\u0008\u0001\u0012\n \t*\u0004\u0018\u00010\u00080\u0008\u0018\u00010\u00070\u00072*\u0010\u0006\u001a&\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00040\u00050\u0000H\n\u00a2\u0006\u0004\u0008\n\u0010\u000b"
    }
    d2 = {
        "LRe4;",
        "",
        "Lco/bird/android/model/RepairCategory;",
        "Lco/bird/android/model/NonRepair;",
        "Lco/bird/android/model/NonRepairReason;",
        "Lco/bird/android/buava/Optional;",
        "<name for destructuring parameter 0>",
        "Lio/reactivex/K;",
        "Lco/bird/android/model/RepairFlow;",
        "kotlin.jvm.PlatformType",
        "a",
        "(LRe4;)Lio/reactivex/K;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LD93;


# direct methods
.method public constructor <init>(LD93;)V
    .locals 0

    iput-object p1, p0, LD93$e;->g:LD93;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LRe4;)Lio/reactivex/K;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LRe4<",
            "Ljava/lang/String;",
            "Lco/bird/android/model/RepairCategory;",
            "Lco/bird/android/model/NonRepair;",
            "Lco/bird/android/model/NonRepairReason;",
            "Lco/bird/android/buava/Optional<",
            "Lco/bird/android/model/NonRepairReason;",
            ">;>;)",
            "Lio/reactivex/K<",
            "+",
            "Lco/bird/android/model/RepairFlow;",
            ">;"
        }
    .end annotation

    const-string v0, "<name for destructuring parameter 0>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LRe4;->a()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    invoke-virtual {p1}, LRe4;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/RepairCategory;

    invoke-virtual {p1}, LRe4;->c()Ljava/lang/Object;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Lco/bird/android/model/NonRepair;

    invoke-virtual {p1}, LRe4;->d()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/NonRepairReason;

    invoke-virtual {p1}, LRe4;->e()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/buava/Optional;

    iget-object v3, p0, LD93$e;->g:LD93;

    invoke-static {v3}, LD93;->access$getVehicleServicingManager$p(LD93;)Lrn6;

    move-result-object v3

    invoke-virtual {v0}, Lco/bird/android/model/RepairCategory;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/NonRepairReason;

    if-nez p1, :cond_0

    move-object v6, v1

    goto :goto_0

    :cond_0
    move-object v6, p1

    :goto_0
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v4

    const/4 v7, 0x0

    move-object v1, v3

    move-object v3, v0

    invoke-interface/range {v1 .. v7}, Lrn6;->e(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lco/bird/android/model/NonRepair;Lco/bird/android/model/NonRepairReason;Ljava/lang/String;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LRe4;

    invoke-virtual {p0, p1}, LD93$e;->a(LRe4;)Lio/reactivex/K;

    move-result-object p1

    return-object p1
.end method
