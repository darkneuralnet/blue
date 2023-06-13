.class public final LYE6$j;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYE6;->c(Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/WorkOrder;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lwb4<",
        "+",
        "Lco/bird/android/buava/Optional<",
        "Lco/bird/android/model/WorkOrder;",
        ">;+",
        "Ljava/util/List<",
        "+",
        "Lco/bird/android/model/Issue;",
        ">;+",
        "Ljava/lang/Integer;",
        "+",
        "Ljava/util/List<",
        "+",
        "Lco/bird/android/model/Issue;",
        ">;>;",
        "Lio/reactivex/K<",
        "+",
        "Lkotlin/Triple<",
        "+",
        "Lco/bird/android/buava/Optional<",
        "Lco/bird/android/model/WorkOrder;",
        ">;+",
        "Ljava/util/List<",
        "+",
        "Lco/bird/android/model/Issue;",
        ">;+",
        "Ljava/lang/Integer;",
        ">;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\n\u001a\u00a2\u0001\u0012J\u0008\u0001\u0012F\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00020\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0005 \u0006*\"\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00020\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t0\t \u0006*P\u0012J\u0008\u0001\u0012F\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00020\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0005 \u0006*\"\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00020\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t0\t\u0018\u00010\u00080\u00082>\u0010\u0007\u001a:\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00020\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0006*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u00030\u0000H\n\u00a2\u0006\u0004\u0008\n\u0010\u000b"
    }
    d2 = {
        "Lwb4;",
        "Lco/bird/android/buava/Optional;",
        "Lco/bird/android/model/WorkOrder;",
        "",
        "Lco/bird/android/model/Issue;",
        "",
        "kotlin.jvm.PlatformType",
        "<name for destructuring parameter 0>",
        "Lio/reactivex/K;",
        "Lkotlin/Triple;",
        "b",
        "(Lwb4;)Lio/reactivex/K;"
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
        "SMAP\nWorkOrderInspectionPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkOrderInspectionPresenter.kt\nco/bird/android/feature/workorders/inspection/WorkOrderInspectionPresenterImpl$onCreate$13\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,384:1\n766#2:385\n857#2,2:386\n1726#2,3:388\n2624#2,3:391\n*S KotlinDebug\n*F\n+ 1 WorkOrderInspectionPresenter.kt\nco/bird/android/feature/workorders/inspection/WorkOrderInspectionPresenterImpl$onCreate$13\n*L\n257#1:385\n257#1:386,2\n258#1:388,3\n259#1:391,3\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/model/WorkOrder;

.field public final synthetic h:LYE6;


# direct methods
.method public constructor <init>(Lco/bird/android/model/WorkOrder;LYE6;)V
    .locals 0

    iput-object p1, p0, LYE6$j;->g:Lco/bird/android/model/WorkOrder;

    iput-object p2, p0, LYE6$j;->h:LYE6;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Triple;
    .locals 0

    invoke-static {p0, p1}, LYE6$j;->c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Triple;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Triple;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lkotlin/Triple;

    return-object p0
.end method


# virtual methods
.method public final b(Lwb4;)Lio/reactivex/K;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwb4<",
            "Lco/bird/android/buava/Optional<",
            "Lco/bird/android/model/WorkOrder;",
            ">;+",
            "Ljava/util/List<",
            "Lco/bird/android/model/Issue;",
            ">;",
            "Ljava/lang/Integer;",
            "+",
            "Ljava/util/List<",
            "Lco/bird/android/model/Issue;",
            ">;>;)",
            "Lio/reactivex/K<",
            "+",
            "Lkotlin/Triple<",
            "Lco/bird/android/buava/Optional<",
            "Lco/bird/android/model/WorkOrder;",
            ">;",
            "Ljava/util/List<",
            "Lco/bird/android/model/Issue;",
            ">;",
            "Ljava/lang/Integer;",
            ">;>;"
        }
    .end annotation

    const-string v0, "<name for destructuring parameter 0>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lwb4;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/buava/Optional;

    invoke-virtual {p1}, Lwb4;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-virtual {p1}, Lwb4;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    invoke-virtual {p1}, Lwb4;->d()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    iget-object v3, p0, LYE6$j;->g:Lco/bird/android/model/WorkOrder;

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Lco/bird/android/model/WorkOrder;->getId()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_0

    goto :goto_1

    :cond_0
    :goto_0
    move-object v5, v3

    goto :goto_2

    :cond_1
    :goto_1
    invoke-virtual {v0}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lco/bird/android/model/WorkOrder;

    if-eqz v3, :cond_2

    invoke-virtual {v3}, Lco/bird/android/model/WorkOrder;->getId()Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    :cond_2
    const/4 v3, 0x0

    goto :goto_0

    :goto_2
    iget-object v3, p0, LYE6$j;->h:LYE6;

    const-string v4, "issues"

    invoke-static {p1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3, p1}, LYE6;->access$flattenSubIssues(LYE6;Ljava/util/List;)Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    iget-object v4, p0, LYE6$j;->h:LYE6;

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_3
    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    const/4 v8, 0x0

    const/4 v9, 0x1

    if-eqz v7, :cond_5

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    move-object v10, v7

    check-cast v10, Lco/bird/android/model/Issue;

    invoke-static {v4}, LYE6;->access$getExistingIssues$p(LYE6;)Ljava/util/Map;

    move-result-object v11

    invoke-virtual {v10}, Lco/bird/android/model/Issue;->getIssueTypeId()Ljava/lang/String;

    move-result-object v10

    invoke-interface {v11, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    if-eqz v10, :cond_4

    move v8, v9

    :cond_4
    if-eqz v8, :cond_3

    invoke-interface {v6, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_5
    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_7

    :cond_6
    move v3, v9

    goto :goto_5

    :cond_7
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_8
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lco/bird/android/model/Issue;

    invoke-virtual {v4}, Lco/bird/android/model/Issue;->getStatus()Lco/bird/android/model/IssueStatus;

    move-result-object v4

    sget-object v6, Lco/bird/android/model/IssueStatus;->DISPUTED:Lco/bird/android/model/IssueStatus;

    if-ne v4, v6, :cond_9

    move v4, v9

    goto :goto_4

    :cond_9
    move v4, v8

    :goto_4
    if-nez v4, :cond_8

    move v3, v8

    :goto_5
    if-eqz v3, :cond_e

    iget-object v3, p0, LYE6$j;->h:LYE6;

    invoke-static {v3, p1}, LYE6;->access$flattenSubIssues(LYE6;Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    iget-object v3, p0, LYE6$j;->h:LYE6;

    instance-of v4, p1, Ljava/util/Collection;

    if-eqz v4, :cond_b

    move-object v4, p1

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_b

    :cond_a
    move p1, v9

    goto :goto_7

    :cond_b
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_c
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_a

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lco/bird/android/model/Issue;

    invoke-virtual {v4}, Lco/bird/android/model/Issue;->getStatus()Lco/bird/android/model/IssueStatus;

    move-result-object v6

    sget-object v7, Lco/bird/android/model/IssueStatus;->OPEN:Lco/bird/android/model/IssueStatus;

    if-ne v6, v7, :cond_d

    invoke-static {v3}, LYE6;->access$getExistingIssues$p(LYE6;)Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v6

    invoke-virtual {v4}, Lco/bird/android/model/Issue;->getIssueTypeId()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v6, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_d

    move v4, v9

    goto :goto_6

    :cond_d
    move v4, v8

    :goto_6
    if-eqz v4, :cond_c

    move p1, v8

    :goto_7
    if-eqz p1, :cond_e

    move v8, v9

    :cond_e
    if-eqz v5, :cond_f

    if-eqz v8, :cond_f

    iget-object p1, p0, LYE6$j;->h:LYE6;

    invoke-static {p1}, LYE6;->access$getWorkOrderManager$p(LYE6;)LaG6;

    move-result-object v4

    sget-object v6, Lco/bird/android/model/WorkOrderStatus;->QUALITY_CONTROL:Lco/bird/android/model/WorkOrderStatus;

    const/4 v7, 0x0

    const/4 v8, 0x4

    const/4 v9, 0x0

    invoke-static/range {v4 .. v9}, LaG6$b;->updateWorkOrderStatus$default(LaG6;Ljava/lang/String;Lco/bird/android/model/WorkOrderStatus;Lco/bird/android/model/WorkOrderStatusReason;ILjava/lang/Object;)Lio/reactivex/F;

    move-result-object p1

    invoke-static {p1}, Lag5;->l(Lio/reactivex/F;)Lio/reactivex/F;

    move-result-object p1

    new-instance v0, LYE6$j$a;

    invoke-direct {v0, v1, v2}, LYE6$j$a;-><init>(Ljava/util/List;I)V

    new-instance v1, LdF6;

    invoke-direct {v1, v0}, LdF6;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/F;->I(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object p1

    goto :goto_8

    :cond_f
    new-instance p1, Lkotlin/Triple;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {p1, v0, v1, v2}, Lkotlin/Triple;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p1}, Lio/reactivex/F;->H(Ljava/lang/Object;)Lio/reactivex/F;

    move-result-object p1

    :goto_8
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lwb4;

    invoke-virtual {p0, p1}, LYE6$j;->b(Lwb4;)Lio/reactivex/K;

    move-result-object p1

    return-object p1
.end method
