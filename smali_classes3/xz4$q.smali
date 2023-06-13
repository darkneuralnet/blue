.class public final Lxz4$q;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxz4;->N(Lco/bird/android/model/RepairType;Lco/bird/android/model/wire/WirePart;)V
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
        "Lkotlin/Pair<",
        "+",
        "Lco/bird/android/model/Issue;",
        "+",
        "Ljava/util/List<",
        "+",
        "Lco/bird/android/model/LegacyRepair;",
        ">;>;+",
        "Ljava/util/List<",
        "+",
        "Lco/bird/android/model/RepairTypeLock;",
        ">;>;",
        "Lkotlin/Pair<",
        "+",
        "Lco/bird/android/model/Issue;",
        "+",
        "Ljava/util/List<",
        "+",
        "Lco/bird/android/model/RepairTypeLock;",
        ">;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a>\u0012\u000c\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u0004 \u0003*\u001e\u0012\u000c\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00010\u00012b\u0010\u0006\u001a^\u0012@\u0012>\u0012\u000c\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070\u0004 \u0003*\u001e\u0012\u000c\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0003*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u00040\u0001H\n\u00a2\u0006\u0002\u0008\u0008"
    }
    d2 = {
        "<anonymous>",
        "Lkotlin/Pair;",
        "Lco/bird/android/model/Issue;",
        "kotlin.jvm.PlatformType",
        "",
        "Lco/bird/android/model/RepairTypeLock;",
        "<name for destructuring parameter 0>",
        "Lco/bird/android/model/LegacyRepair;",
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

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nRepairIssueSubtypesPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairIssueSubtypesPresenter.kt\nco/bird/android/feature/repair/v2/subtypes/RepairIssueSubtypesPresenterImpl$addPart$4\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,403:1\n37#2,2:404\n*S KotlinDebug\n*F\n+ 1 RepairIssueSubtypesPresenter.kt\nco/bird/android/feature/repair/v2/subtypes/RepairIssueSubtypesPresenterImpl$addPart$4\n*L\n352#1:404,2\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/model/RepairType;

.field public final synthetic h:Lco/bird/android/model/wire/WirePart;


# direct methods
.method public constructor <init>(Lco/bird/android/model/RepairType;Lco/bird/android/model/wire/WirePart;)V
    .locals 0

    iput-object p1, p0, Lxz4$q;->g:Lco/bird/android/model/RepairType;

    iput-object p2, p0, Lxz4$q;->h:Lco/bird/android/model/wire/WirePart;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Pair;

    invoke-virtual {p0, p1}, Lxz4$q;->invoke(Lkotlin/Pair;)Lkotlin/Pair;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlin/Pair;)Lkotlin/Pair;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "+",
            "Lkotlin/Pair<",
            "Lco/bird/android/model/Issue;",
            "+",
            "Ljava/util/List<",
            "Lco/bird/android/model/LegacyRepair;",
            ">;>;+",
            "Ljava/util/List<",
            "Lco/bird/android/model/RepairTypeLock;",
            ">;>;)",
            "Lkotlin/Pair<",
            "Lco/bird/android/model/Issue;",
            "Ljava/util/List<",
            "Lco/bird/android/model/RepairTypeLock;",
            ">;>;"
        }
    .end annotation

    move-object/from16 v0, p0

    const-string v1, "<name for destructuring parameter 0>"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlin/Pair;

    invoke-virtual/range {p1 .. p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    new-instance v3, Lkotlin/Pair;

    invoke-virtual {v1}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v1

    new-instance v4, Lkotlin/jvm/internal/SpreadBuilder;

    const/4 v5, 0x2

    invoke-direct {v4, v5}, Lkotlin/jvm/internal/SpreadBuilder;-><init>(I)V

    const-string v5, "selectedRepairs"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ljava/util/Collection;

    const/4 v5, 0x0

    new-array v5, v5, [Lco/bird/android/model/RepairTypeLock;

    invoke-interface {v2, v5}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/SpreadBuilder;->addSpread(Ljava/lang/Object;)V

    new-instance v2, Lco/bird/android/model/RepairTypeLock;

    iget-object v5, v0, Lxz4$q;->g:Lco/bird/android/model/RepairType;

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    iget-object v15, v0, Lxz4$q;->h:Lco/bird/android/model/wire/WirePart;

    invoke-virtual {v15}, Lco/bird/android/model/wire/WirePart;->getKey()Ljava/lang/String;

    move-result-object v15

    const/16 v16, 0x1ff

    const/16 v17, 0x0

    invoke-static/range {v5 .. v17}, Lco/bird/android/model/RepairType;->copy$default(Lco/bird/android/model/RepairType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/lang/String;Lco/bird/android/model/constant/PartKind;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lco/bird/android/model/RepairType;

    move-result-object v5

    const/4 v6, 0x1

    invoke-direct {v2, v5, v6}, Lco/bird/android/model/RepairTypeLock;-><init>(Lco/bird/android/model/RepairType;Z)V

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/SpreadBuilder;->add(Ljava/lang/Object;)V

    invoke-virtual {v4}, Lkotlin/jvm/internal/SpreadBuilder;->size()I

    move-result v2

    new-array v2, v2, [Lco/bird/android/model/RepairTypeLock;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/SpreadBuilder;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-direct {v3, v1, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v3
.end method
