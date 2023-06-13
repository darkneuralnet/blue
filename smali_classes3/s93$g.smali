.class public final Ls93$g;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ls93;->l()V
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
        "Lkotlin/Unit;",
        "+",
        "Lco/bird/android/model/NonRepair;",
        "+",
        "Lco/bird/android/buava/Optional<",
        "Lco/bird/android/model/NonRepairReason;",
        ">;+",
        "Lco/bird/android/buava/Optional<",
        "Ljava/lang/String;",
        ">;>;",
        "Lco/bird/android/model/NonRepair;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u0010\u0008\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022N\u0010\u0007\u001aJ\u0012\u0004\u0012\u00020\u0001\u0012\u000c\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0003*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u0003*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00040\u00040\u0000H\n\u00a2\u0006\u0004\u0008\u0008\u0010\t"
    }
    d2 = {
        "Lwb4;",
        "",
        "Lco/bird/android/model/NonRepair;",
        "kotlin.jvm.PlatformType",
        "Lco/bird/android/buava/Optional;",
        "Lco/bird/android/model/NonRepairReason;",
        "",
        "<name for destructuring parameter 0>",
        "a",
        "(Lwb4;)Lco/bird/android/model/NonRepair;"
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
        "SMAP\nNonRepairPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NonRepairPresenter.kt\nco/bird/android/feature/repair/v3/issues/dialogs/nonrepair/NonRepairPresenter$onResume$5\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,93:1\n1549#2:94\n1620#2,3:95\n*S KotlinDebug\n*F\n+ 1 NonRepairPresenter.kt\nco/bird/android/feature/repair/v3/issues/dialogs/nonrepair/NonRepairPresenter$onResume$5\n*L\n78#1:94\n78#1:95,3\n*E\n"
    }
.end annotation


# static fields
.field public static final g:Ls93$g;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ls93$g;

    invoke-direct {v0}, Ls93$g;-><init>()V

    sput-object v0, Ls93$g;->g:Ls93$g;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lwb4;)Lco/bird/android/model/NonRepair;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwb4<",
            "Lkotlin/Unit;",
            "Lco/bird/android/model/NonRepair;",
            "Lco/bird/android/buava/Optional<",
            "Lco/bird/android/model/NonRepairReason;",
            ">;",
            "Lco/bird/android/buava/Optional<",
            "Ljava/lang/String;",
            ">;>;)",
            "Lco/bird/android/model/NonRepair;"
        }
    .end annotation

    const-string v0, "<name for destructuring parameter 0>"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Lwb4;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/NonRepair;

    invoke-virtual/range {p1 .. p1}, Lwb4;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/android/buava/Optional;

    invoke-virtual/range {p1 .. p1}, Lwb4;->d()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/buava/Optional;

    invoke-virtual {v2}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/android/model/NonRepairReason;

    invoke-virtual {v0}, Lco/bird/android/model/NonRepair;->getReasons()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    new-instance v8, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v3, v4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v8, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v9, v4

    check-cast v9, Lco/bird/android/model/NonRepairReason;

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-virtual {v9}, Lco/bird/android/model/NonRepairReason;->getReason()Ljava/lang/String;

    move-result-object v4

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lco/bird/android/model/NonRepairReason;->getReason()Ljava/lang/String;

    move-result-object v5

    goto :goto_1

    :cond_0
    const/4 v5, 0x0

    :goto_1
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v15, 0x1b

    const/16 v16, 0x0

    invoke-static/range {v9 .. v16}, Lco/bird/android/model/NonRepairReason;->copy$default(Lco/bird/android/model/NonRepairReason;Ljava/lang/String;Ljava/lang/String;ZZLjava/util/List;ILjava/lang/Object;)Lco/bird/android/model/NonRepairReason;

    move-result-object v4

    invoke-interface {v8, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Ljava/lang/String;

    const-string v1, "nonRepair"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v9, 0x0

    const/16 v10, 0x9f

    const/4 v11, 0x0

    move-object v1, v0

    invoke-static/range {v1 .. v11}, Lco/bird/android/model/NonRepair;->copy$default(Lco/bird/android/model/NonRepair;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/util/List;ZILjava/lang/Object;)Lco/bird/android/model/NonRepair;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lwb4;

    invoke-virtual {p0, p1}, Ls93$g;->a(Lwb4;)Lco/bird/android/model/NonRepair;

    move-result-object p1

    return-object p1
.end method
