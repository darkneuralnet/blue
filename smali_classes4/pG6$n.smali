.class public final LpG6$n;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LpG6;->u(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Lio/reactivex/F;
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
        "LHM4<",
        "Ljava/util/List<",
        "+",
        "Lco/bird/android/model/Issue;",
        ">;>;+",
        "LHM4<",
        "Lco/bird/android/model/WorkOrder;",
        ">;>;",
        "Lco/bird/android/model/WorkOrder;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0007\u001a\n \u0004*\u0004\u0018\u00010\u00050\u00052F\u0010\u0006\u001aB\u0012$\u0012\"\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u0002 \u0004*\u0010\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0004*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00010\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0007\u0010\u0008"
    }
    d2 = {
        "Lkotlin/Pair;",
        "LHM4;",
        "",
        "Lco/bird/android/model/Issue;",
        "kotlin.jvm.PlatformType",
        "Lco/bird/android/model/WorkOrder;",
        "<name for destructuring parameter 0>",
        "a",
        "(Lkotlin/Pair;)Lco/bird/android/model/WorkOrder;"
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
        "SMAP\nWorkOrderManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkOrderManagerImpl.kt\nco/bird/android/manager/workorder/WorkOrderManagerImpl$submitWorkOrder$5\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,399:1\n12744#2,2:400\n1109#2,2:402\n*S KotlinDebug\n*F\n+ 1 WorkOrderManagerImpl.kt\nco/bird/android/manager/workorder/WorkOrderManagerImpl$submitWorkOrder$5\n*L\n232#1:400,2\n233#1:402,2\n*E\n"
    }
.end annotation


# static fields
.field public static final g:LpG6$n;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LpG6$n;

    invoke-direct {v0}, LpG6$n;-><init>()V

    sput-object v0, LpG6$n;->g:LpG6$n;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lkotlin/Pair;)Lco/bird/android/model/WorkOrder;
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "LHM4<",
            "Ljava/util/List<",
            "Lco/bird/android/model/Issue;",
            ">;>;",
            "LHM4<",
            "Lco/bird/android/model/WorkOrder;",
            ">;>;)",
            "Lco/bird/android/model/WorkOrder;"
        }
    .end annotation

    const-string v0, "<name for destructuring parameter 0>"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LHM4;

    invoke-virtual/range {p1 .. p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LHM4;

    invoke-virtual {v0}, LHM4;->a()Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v17, v2

    check-cast v17, Ljava/util/List;

    invoke-virtual {v1}, LHM4;->a()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lco/bird/android/model/WorkOrder;

    const/4 v2, 0x2

    new-array v4, v2, [LHM4;

    const/4 v5, 0x0

    aput-object v0, v4, v5

    const/4 v0, 0x1

    aput-object v1, v4, v0

    move v1, v5

    :goto_0
    if-ge v1, v2, :cond_1

    aget-object v6, v4, v1

    invoke-virtual {v6}, LHM4;->f()Z

    move-result v6

    xor-int/2addr v6, v0

    if-eqz v6, :cond_0

    move v1, v0

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    move v1, v5

    :goto_1
    if-nez v1, :cond_3

    if-eqz v17, :cond_3

    if-nez v3, :cond_2

    goto :goto_2

    :cond_2
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

    const/16 v18, 0x0

    const/16 v19, 0x5fff

    const/16 v20, 0x0

    invoke-static/range {v3 .. v20}, Lco/bird/android/model/WorkOrder;->copy$default(Lco/bird/android/model/WorkOrder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lco/bird/android/model/WorkOrderCreateSource;Ljava/lang/String;Lco/bird/android/model/WorkOrderStatus;Ljava/lang/String;Lco/bird/android/model/WorkOrderStatusReason;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lco/bird/android/model/User;Ljava/util/List;Ljava/util/List;ILjava/lang/Object;)Lco/bird/android/model/WorkOrder;

    move-result-object v0

    return-object v0

    :cond_3
    :goto_2
    if-ge v5, v2, :cond_5

    aget-object v1, v4, v5

    invoke-virtual {v1}, LHM4;->f()Z

    move-result v3

    xor-int/2addr v3, v0

    if-nez v3, :cond_4

    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    :cond_4
    const-string v0, "responses.first { respon\u2026 !response.isSuccessful }"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/api/exception/HttpException;

    invoke-direct {v0, v1}, Lco/bird/api/exception/HttpException;-><init>(LHM4;)V

    throw v0

    :cond_5
    new-instance v0, Ljava/util/NoSuchElementException;

    const-string v1, "Array contains no element matching the predicate."

    invoke-direct {v0, v1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Pair;

    invoke-virtual {p0, p1}, LpG6$n;->a(Lkotlin/Pair;)Lco/bird/android/model/WorkOrder;

    move-result-object p1

    return-object p1
.end method
