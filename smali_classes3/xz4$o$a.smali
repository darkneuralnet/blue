.class public final Lxz4$o$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxz4$o;->b(Lkotlin/Pair;)Lio/reactivex/K;
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
        "Lkotlin/Pair<",
        "+",
        "Lco/bird/android/model/Issue;",
        "+",
        "Ljava/util/List<",
        "+",
        "Lco/bird/android/model/LegacyRepair;",
        ">;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0007\u001a>\u0012\u000c\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00060\u0005 \u0004*\u001e\u0012\u000c\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0007\u0010\u0008"
    }
    d2 = {
        "Lco/bird/android/model/WorkOrder;",
        "workOrder",
        "Lkotlin/Pair;",
        "Lco/bird/android/model/Issue;",
        "kotlin.jvm.PlatformType",
        "",
        "Lco/bird/android/model/LegacyRepair;",
        "a",
        "(Lco/bird/android/model/WorkOrder;)Lkotlin/Pair;"
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
        "SMAP\nRepairIssueSubtypesPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairIssueSubtypesPresenter.kt\nco/bird/android/feature/repair/v2/subtypes/RepairIssueSubtypesPresenterImpl$addPart$2$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,403:1\n1#2:404\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/model/Issue;

.field public final synthetic h:Lco/bird/android/model/Issue;


# direct methods
.method public constructor <init>(Lco/bird/android/model/Issue;Lco/bird/android/model/Issue;)V
    .locals 0

    iput-object p1, p0, Lxz4$o$a;->g:Lco/bird/android/model/Issue;

    iput-object p2, p0, Lxz4$o$a;->h:Lco/bird/android/model/Issue;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/WorkOrder;)Lkotlin/Pair;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/WorkOrder;",
            ")",
            "Lkotlin/Pair<",
            "Lco/bird/android/model/Issue;",
            "Ljava/util/List<",
            "Lco/bird/android/model/LegacyRepair;",
            ">;>;"
        }
    .end annotation

    const-string v0, "workOrder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lxz4$o$a;->g:Lco/bird/android/model/Issue;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lxz4$o$a;->h:Lco/bird/android/model/Issue;

    const-string v2, "supertype"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v0}, LEz4;->access$resolveSubtype(Lco/bird/android/model/Issue;Lco/bird/android/model/Issue;)Lco/bird/android/model/Issue;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    iget-object v0, p0, Lxz4$o$a;->h:Lco/bird/android/model/Issue;

    :cond_1
    invoke-virtual {p1}, Lco/bird/android/model/WorkOrder;->getRepairs()Ljava/util/List;

    move-result-object p1

    invoke-static {v0, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/WorkOrder;

    invoke-virtual {p0, p1}, Lxz4$o$a;->a(Lco/bird/android/model/WorkOrder;)Lkotlin/Pair;

    move-result-object p1

    return-object p1
.end method