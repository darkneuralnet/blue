.class public final LJD$m;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJD;->b(Lco/bird/android/model/Issue;)V
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
        "Lco/bird/android/model/RepairTypeLock;",
        ">;",
        "Ljava/util/List<",
        "+",
        "Lco/bird/android/model/RepairTypeLock;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0003*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u00002\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "",
        "Lco/bird/android/model/RepairTypeLock;",
        "repairs",
        "kotlin.jvm.PlatformType",
        "a",
        "(Ljava/util/List;)Ljava/util/List;"
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
        "SMAP\nRepairOverviewPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairOverviewPresenter.kt\nco/bird/android/feature/repair/v1/base/BaseRepairOverviewPresenter$updateIssue$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,319:1\n819#2:320\n847#2,2:321\n*S KotlinDebug\n*F\n+ 1 RepairOverviewPresenter.kt\nco/bird/android/feature/repair/v1/base/BaseRepairOverviewPresenter$updateIssue$2\n*L\n300#1:320\n300#1:321,2\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/model/Issue;


# direct methods
.method public constructor <init>(Lco/bird/android/model/Issue;)V
    .locals 0

    iput-object p1, p0, LJD$m;->g:Lco/bird/android/model/Issue;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/model/RepairTypeLock;",
            ">;)",
            "Ljava/util/List<",
            "Lco/bird/android/model/RepairTypeLock;",
            ">;"
        }
    .end annotation

    const-string v0, "repairs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    iget-object v0, p0, LJD$m;->g:Lco/bird/android/model/Issue;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lco/bird/android/model/RepairTypeLock;

    invoke-virtual {v3}, Lco/bird/android/model/RepairTypeLock;->component1()Lco/bird/android/model/RepairType;

    move-result-object v3

    invoke-virtual {v3}, Lco/bird/android/model/RepairType;->getIssueTypeId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Lco/bird/android/model/Issue;->getIssueTypeId()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, LJD$m;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
