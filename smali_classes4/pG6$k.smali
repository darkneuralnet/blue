.class public final LpG6$k;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LpG6;->s(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lco/bird/android/model/WorkOrderCreateSource;Lco/bird/android/model/RepairSource;Lco/bird/android/model/IssueCreateSource;)Lio/reactivex/F;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/WorkOrder;",
        "Lio/reactivex/K<",
        "+",
        "Lco/bird/android/model/WorkOrder;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/WorkOrder;",
        "workOrder",
        "Lio/reactivex/K;",
        "kotlin.jvm.PlatformType",
        "b",
        "(Lco/bird/android/model/WorkOrder;)Lio/reactivex/K;"
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
        "SMAP\nWorkOrderManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkOrderManagerImpl.kt\nco/bird/android/manager/workorder/WorkOrderManagerImpl$logRepairs$logRepairSingle$3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,399:1\n1549#2:400\n1620#2,2:401\n288#2,2:403\n1622#2:405\n*S KotlinDebug\n*F\n+ 1 WorkOrderManagerImpl.kt\nco/bird/android/manager/workorder/WorkOrderManagerImpl$logRepairs$logRepairSingle$3\n*L\n276#1:400\n276#1:401,2\n277#1:403,2\n276#1:405\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lco/bird/android/model/RepairType;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic h:LpG6;

.field public final synthetic i:Lco/bird/android/model/RepairSource;


# direct methods
.method public constructor <init>(Ljava/util/List;LpG6;Lco/bird/android/model/RepairSource;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/model/RepairType;",
            ">;",
            "LpG6;",
            "Lco/bird/android/model/RepairSource;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, LpG6$k;->g:Ljava/util/List;

    iput-object p2, p0, LpG6$k;->h:LpG6;

    iput-object p3, p0, LpG6$k;->i:Lco/bird/android/model/RepairSource;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/WorkOrder;
    .locals 0

    invoke-static {p0, p1}, LpG6$k;->c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/WorkOrder;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/WorkOrder;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lco/bird/android/model/WorkOrder;

    return-object p0
.end method


# virtual methods
.method public final b(Lco/bird/android/model/WorkOrder;)Lio/reactivex/K;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/WorkOrder;",
            ")",
            "Lio/reactivex/K<",
            "+",
            "Lco/bird/android/model/WorkOrder;",
            ">;"
        }
    .end annotation

    const-string v0, "workOrder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LpG6$k;->g:Ljava/util/List;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    const/4 v2, 0x1

    xor-int/2addr v0, v2

    if-ne v0, v2, :cond_0

    move v1, v2

    :cond_0
    if-eqz v1, :cond_5

    iget-object v0, p0, LpG6$k;->h:LpG6;

    invoke-virtual {p1}, Lco/bird/android/model/WorkOrder;->getId()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, LpG6$k;->g:Ljava/util/List;

    check-cast v2, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v2, v4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lco/bird/android/model/RepairType;

    invoke-virtual {p1}, Lco/bird/android/model/WorkOrder;->getIssues()Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/lang/Iterable;

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    const/4 v7, 0x0

    if-eqz v6, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v8, v6

    check-cast v8, Lco/bird/android/model/Issue;

    invoke-virtual {v8}, Lco/bird/android/model/Issue;->getIssueTypeId()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v4}, Lco/bird/android/model/RepairType;->getIssueTypeId()Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1

    goto :goto_1

    :cond_2
    move-object v6, v7

    :goto_1
    check-cast v6, Lco/bird/android/model/Issue;

    if-eqz v6, :cond_3

    invoke-virtual {v6}, Lco/bird/android/model/Issue;->getId()Ljava/lang/String;

    move-result-object v7

    :cond_3
    invoke-static {v4, v7}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_4
    iget-object v2, p0, LpG6$k;->i:Lco/bird/android/model/RepairSource;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0, v1, v3, v2}, LpG6;->K(Ljava/lang/String;Ljava/util/List;Lco/bird/android/model/RepairSource;)Lio/reactivex/F;

    move-result-object v0

    invoke-static {v0}, Lag5;->l(Lio/reactivex/F;)Lio/reactivex/F;

    move-result-object v0

    new-instance v1, LpG6$k$a;

    invoke-direct {v1, p1}, LpG6$k$a;-><init>(Lco/bird/android/model/WorkOrder;)V

    new-instance p1, LxG6;

    invoke-direct {p1, v1}, LxG6;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, p1}, Lio/reactivex/F;->I(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object p1

    goto :goto_2

    :cond_5
    invoke-static {p1}, Lio/reactivex/F;->H(Ljava/lang/Object;)Lio/reactivex/F;

    move-result-object p1

    :goto_2
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/WorkOrder;

    invoke-virtual {p0, p1}, LpG6$k;->b(Lco/bird/android/model/WorkOrder;)Lio/reactivex/K;

    move-result-object p1

    return-object p1
.end method
