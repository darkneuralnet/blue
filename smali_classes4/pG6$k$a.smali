.class public final LpG6$k$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LpG6$k;->b(Lco/bird/android/model/WorkOrder;)Lio/reactivex/K;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/util/List<",
        "+",
        "Lco/bird/android/model/LegacyRepair;",
        ">;",
        "Lco/bird/android/model/WorkOrder;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "",
        "Lco/bird/android/model/LegacyRepair;",
        "repairs",
        "Lco/bird/android/model/WorkOrder;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Ljava/util/List;)Lco/bird/android/model/WorkOrder;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nWorkOrderManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkOrderManagerImpl.kt\nco/bird/android/manager/workorder/WorkOrderManagerImpl$logRepairs$logRepairSingle$3$2\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,399:1\n37#2,2:400\n*S KotlinDebug\n*F\n+ 1 WorkOrderManagerImpl.kt\nco/bird/android/manager/workorder/WorkOrderManagerImpl$logRepairs$logRepairSingle$3$2\n*L\n282#1:400,2\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/model/WorkOrder;


# direct methods
.method public constructor <init>(Lco/bird/android/model/WorkOrder;)V
    .locals 0

    iput-object p1, p0, LpG6$k$a;->g:Lco/bird/android/model/WorkOrder;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)Lco/bird/android/model/WorkOrder;
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/model/LegacyRepair;",
            ">;)",
            "Lco/bird/android/model/WorkOrder;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "repairs"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v0, LpG6$k$a;->g:Lco/bird/android/model/WorkOrder;

    move-object v3, v2

    const-string v4, "workOrder"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    new-instance v2, Lkotlin/jvm/internal/SpreadBuilder;

    const/4 v4, 0x2

    invoke-direct {v2, v4}, Lkotlin/jvm/internal/SpreadBuilder;-><init>(I)V

    iget-object v4, v0, LpG6$k$a;->g:Lco/bird/android/model/WorkOrder;

    invoke-virtual {v4}, Lco/bird/android/model/WorkOrder;->getRepairs()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/util/Collection;

    const/4 v5, 0x0

    new-array v6, v5, [Lco/bird/android/model/LegacyRepair;

    invoke-interface {v4, v6}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v2, v4}, Lkotlin/jvm/internal/SpreadBuilder;->addSpread(Ljava/lang/Object;)V

    check-cast v1, Ljava/util/Collection;

    new-array v4, v5, [Lco/bird/android/model/LegacyRepair;

    invoke-interface {v1, v4}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/SpreadBuilder;->addSpread(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lkotlin/jvm/internal/SpreadBuilder;->size()I

    move-result v1

    new-array v1, v1, [Lco/bird/android/model/LegacyRepair;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/SpreadBuilder;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v18

    const/16 v19, 0x3fff

    const/16 v20, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v20}, Lco/bird/android/model/WorkOrder;->copy$default(Lco/bird/android/model/WorkOrder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lco/bird/android/model/WorkOrderCreateSource;Ljava/lang/String;Lco/bird/android/model/WorkOrderStatus;Ljava/lang/String;Lco/bird/android/model/WorkOrderStatusReason;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lco/bird/android/model/User;Ljava/util/List;Ljava/util/List;ILjava/lang/Object;)Lco/bird/android/model/WorkOrder;

    move-result-object v1

    return-object v1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, LpG6$k$a;->a(Ljava/util/List;)Lco/bird/android/model/WorkOrder;

    move-result-object p1

    return-object p1
.end method
