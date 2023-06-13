.class public final Lec4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcc4;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000b\u0018\u00002\u00020\u0001B\t\u0008\u0007\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJT\u0010\u000f\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000e0\u00040\r2\u0006\u0010\u0003\u001a\u00020\u00022\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00042\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00042\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u0004H\u0016J\u0018\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u0008\u0010\u0014\u001a\u00020\u000eH\u0002J4\u0010\u0015\u001a\u0004\u0018\u00010\u000e2\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00042\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0004H\u0002J\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u000e2\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u0004H\u0002J\n\u0010\u0017\u001a\u0004\u0018\u00010\u000eH\u0002J\u0010\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002\u00a8\u0006\u001b"
    }
    d2 = {
        "Lec4;",
        "Lcc4;",
        "",
        "birdModel",
        "",
        "Lco/bird/android/model/QCInspection;",
        "inspections",
        "Lco/bird/android/model/IssueType;",
        "issueTypes",
        "Lco/bird/android/model/RepairType;",
        "repairTypes",
        "Lco/bird/android/model/QCAutoCheck;",
        "qcAutoChecks",
        "Lio/reactivex/F;",
        "LH6;",
        "a",
        "",
        "passedQC",
        "i",
        "j",
        "d",
        "h",
        "g",
        "e",
        "f",
        "<init>",
        "()V",
        "qualitycontrol_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nQualityControlResultConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QualityControlResultConverter.kt\nco/bird/android/qualitycontrol/result/adapters/QualityControlResultConverterImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,92:1\n766#2:93\n857#2,2:94\n1549#2:96\n1620#2,2:97\n288#2,2:99\n288#2,2:101\n1622#2:103\n766#2:105\n857#2,2:106\n1549#2:108\n1620#2,3:109\n1726#2,3:112\n1726#2,3:115\n1#3:104\n*S KotlinDebug\n*F\n+ 1 QualityControlResultConverter.kt\nco/bird/android/qualitycontrol/result/adapters/QualityControlResultConverterImpl\n*L\n55#1:93\n55#1:94,2\n58#1:96\n58#1:97,2\n60#1:99,2\n61#1:101,2\n58#1:103\n72#1:105\n72#1:106,2\n74#1:108\n74#1:109,3\n25#1:112,3\n26#1:115,3\n*E\n"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic b(Ljava/util/List;Ljava/util/List;Lec4;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Ljava/util/List;
    .locals 0

    invoke-static/range {p0 .. p5}, Lec4;->c(Ljava/util/List;Ljava/util/List;Lec4;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Ljava/util/List;Ljava/util/List;Lec4;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Ljava/util/List;
    .locals 6

    const-string v0, "$inspections"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$qcAutoChecks"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "this$0"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$birdModel"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$issueTypes"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$repairTypes"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p0

    check-cast v0, Ljava/lang/Iterable;

    instance-of v1, v0, Ljava/util/Collection;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    move v0, v3

    goto :goto_1

    :cond_1
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/QCInspection;

    invoke-virtual {v1}, Lco/bird/android/model/QCInspection;->getStatus()Lco/bird/android/model/constant/QCStatus;

    move-result-object v1

    sget-object v4, Lco/bird/android/model/constant/QCStatus;->PASSED:Lco/bird/android/model/constant/QCStatus;

    if-ne v1, v4, :cond_3

    move v1, v3

    goto :goto_0

    :cond_3
    move v1, v2

    :goto_0
    if-nez v1, :cond_2

    move v0, v2

    :goto_1
    move-object v1, p1

    check-cast v1, Ljava/lang/Iterable;

    instance-of v4, v1, Ljava/util/Collection;

    if-eqz v4, :cond_5

    move-object v4, v1

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_5

    :cond_4
    move v1, v3

    goto :goto_2

    :cond_5
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lco/bird/android/model/QCAutoCheck;

    invoke-virtual {v4}, Lco/bird/android/model/QCAutoCheck;->getPassed()Z

    move-result v4

    if-nez v4, :cond_6

    move v1, v2

    :goto_2
    if-eqz v0, :cond_7

    if-eqz v1, :cond_7

    move v0, v3

    goto :goto_3

    :cond_7
    move v0, v2

    :goto_3
    invoke-virtual {p2, v0, p3}, Lec4;->i(ZLjava/lang/String;)LH6;

    move-result-object p3

    invoke-virtual {p2, v0}, Lec4;->j(Z)LH6;

    move-result-object v1

    const/4 v4, 0x0

    if-nez v0, :cond_8

    invoke-virtual {p2}, Lec4;->d()LH6;

    move-result-object v5

    goto :goto_4

    :cond_8
    move-object v5, v4

    :goto_4
    invoke-virtual {p2, p0, p4, p5}, Lec4;->h(Ljava/util/List;Ljava/util/List;Ljava/util/List;)LH6;

    move-result-object p0

    invoke-virtual {p2, p1}, Lec4;->g(Ljava/util/List;)LH6;

    move-result-object p1

    if-nez v0, :cond_9

    invoke-virtual {p2}, Lec4;->e()LH6;

    move-result-object v4

    :cond_9
    invoke-virtual {p2, v0}, Lec4;->f(Z)LH6;

    move-result-object p2

    const/4 p4, 0x7

    new-array p4, p4, [LH6;

    aput-object p3, p4, v2

    aput-object v1, p4, v3

    const/4 p3, 0x2

    aput-object v5, p4, p3

    const/4 p3, 0x3

    aput-object p0, p4, p3

    const/4 p0, 0x4

    aput-object p1, p4, p0

    const/4 p0, 0x5

    aput-object v4, p4, p0

    const/4 p0, 0x6

    aput-object p2, p4, p0

    invoke-static {p4}, Lkotlin/collections/CollectionsKt;->listOfNotNull([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lio/reactivex/F;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lco/bird/android/model/QCInspection;",
            ">;",
            "Ljava/util/List<",
            "Lco/bird/android/model/IssueType;",
            ">;",
            "Ljava/util/List<",
            "Lco/bird/android/model/RepairType;",
            ">;",
            "Ljava/util/List<",
            "Lco/bird/android/model/QCAutoCheck;",
            ">;)",
            "Lio/reactivex/F<",
            "Ljava/util/List<",
            "LH6;",
            ">;>;"
        }
    .end annotation

    const-string v0, "birdModel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "inspections"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "issueTypes"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "repairTypes"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "qcAutoChecks"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ldc4;

    move-object v1, v0

    move-object v2, p2

    move-object v3, p5

    move-object v4, p0

    move-object v5, p1

    move-object v6, p3

    move-object v7, p4

    invoke-direct/range {v1 .. v7}, Ldc4;-><init>(Ljava/util/List;Ljava/util/List;Lec4;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V

    invoke-static {v0}, Lio/reactivex/F;->E(Ljava/util/concurrent/Callable;)Lio/reactivex/F;

    move-result-object p1

    invoke-static {}, Lio/reactivex/schedulers/a;->a()Lio/reactivex/E;

    move-result-object p2

    invoke-virtual {p1, p2}, Lio/reactivex/F;->Y(Lio/reactivex/E;)Lio/reactivex/F;

    move-result-object p1

    const-string p2, "fromCallable {\n      val\u2026Schedulers.computation())"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final d()LH6;
    .locals 13

    new-instance v6, LH6;

    const/4 v0, 0x1

    new-array v0, v0, [LG6;

    new-instance v1, LG6;

    sget-object v8, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    sget v9, Lmk4;->item_button_secondary:I

    const/4 v10, 0x0

    const/4 v11, 0x4

    const/4 v12, 0x0

    move-object v7, v1

    invoke-direct/range {v7 .. v12}, LG6;-><init>(Ljava/lang/Object;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->mutableListOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x6

    const/4 v5, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, LH6;-><init>(Ljava/util/List;LG6;LG6;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v6
.end method

.method public final e()LH6;
    .locals 13

    new-instance v6, LH6;

    const/4 v0, 0x1

    new-array v0, v0, [LG6;

    new-instance v1, LG6;

    const/4 v8, 0x0

    sget v9, Ljk4;->item_add_notes:I

    const/4 v10, 0x0

    const/4 v11, 0x4

    const/4 v12, 0x0

    move-object v7, v1

    invoke-direct/range {v7 .. v12}, LG6;-><init>(Ljava/lang/Object;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->mutableListOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x6

    const/4 v5, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, LH6;-><init>(Ljava/util/List;LG6;LG6;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v6
.end method

.method public final f(Z)LH6;
    .locals 14

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p1, :cond_0

    new-instance p1, LH6;

    new-array v1, v1, [LG6;

    new-instance v8, LG6;

    const/4 v3, 0x0

    sget v4, Ljk4;->item_passed_qc_buttons:I

    const/4 v5, 0x0

    const/4 v6, 0x4

    const/4 v7, 0x0

    move-object v2, v8

    invoke-direct/range {v2 .. v7}, LG6;-><init>(Ljava/lang/Object;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    aput-object v8, v1, v0

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->mutableListOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x6

    move-object v2, p1

    invoke-direct/range {v2 .. v7}, LH6;-><init>(Ljava/util/List;LG6;LG6;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_0

    :cond_0
    new-instance p1, LH6;

    new-array v1, v1, [LG6;

    new-instance v8, LG6;

    const/4 v3, 0x0

    sget v4, Lmk4;->item_button:I

    const/4 v5, 0x0

    const/4 v6, 0x4

    const/4 v7, 0x0

    move-object v2, v8

    invoke-direct/range {v2 .. v7}, LG6;-><init>(Ljava/lang/Object;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    aput-object v8, v1, v0

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->mutableListOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v9

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x6

    const/4 v13, 0x0

    move-object v8, p1

    invoke-direct/range {v8 .. v13}, LH6;-><init>(Ljava/util/List;LG6;LG6;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_0
    return-object p1
.end method

.method public final g(Ljava/util/List;)LH6;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/model/QCAutoCheck;",
            ">;)",
            "LH6;"
        }
    .end annotation

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lco/bird/android/model/QCAutoCheck;

    invoke-virtual {v2}, Lco/bird/android/model/QCAutoCheck;->getPassed()Z

    move-result v2

    xor-int/lit8 v2, v2, 0x1

    if-eqz v2, :cond_0

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, 0x0

    goto :goto_2

    :cond_2
    new-instance p1, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {p1, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Lco/bird/android/model/QCAutoCheck;

    new-instance v1, LG6;

    sget v4, Ljk4;->item_auto_check:I

    const/4 v5, 0x0

    const/4 v6, 0x4

    const/4 v7, 0x0

    move-object v2, v1

    invoke-direct/range {v2 .. v7}, LG6;-><init>(Ljava/lang/Object;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p1, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v9

    new-instance p1, LH6;

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x6

    const/4 v13, 0x0

    move-object v8, p1

    invoke-direct/range {v8 .. v13}, LH6;-><init>(Ljava/util/List;LG6;LG6;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_2
    return-object p1
.end method

.method public final h(Ljava/util/List;Ljava/util/List;Ljava/util/List;)LH6;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/model/QCInspection;",
            ">;",
            "Ljava/util/List<",
            "Lco/bird/android/model/IssueType;",
            ">;",
            "Ljava/util/List<",
            "Lco/bird/android/model/RepairType;",
            ">;)",
            "LH6;"
        }
    .end annotation

    move-object/from16 v0, p1

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lco/bird/android/model/QCInspection;

    invoke-virtual {v3}, Lco/bird/android/model/QCInspection;->getStatus()Lco/bird/android/model/constant/QCStatus;

    move-result-object v3

    sget-object v4, Lco/bird/android/model/constant/QCStatus;->FAILED:Lco/bird/android/model/constant/QCStatus;

    if-ne v3, v4, :cond_1

    const/4 v3, 0x1

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    :goto_1
    if-eqz v3, :cond_0

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/4 v2, 0x0

    if-eqz v0, :cond_3

    goto/16 :goto_6

    :cond_3
    new-instance v0, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v1, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_c

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lco/bird/android/model/QCInspection;

    move-object/from16 v4, p2

    check-cast v4, Ljava/lang/Iterable;

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Lco/bird/android/model/IssueType;

    invoke-virtual {v6}, Lco/bird/android/model/IssueType;->getId()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3}, Lco/bird/android/model/QCInspection;->getIssueTypeId()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    goto :goto_3

    :cond_5
    move-object v5, v2

    :goto_3
    check-cast v5, Lco/bird/android/model/IssueType;

    const-string v4, ""

    if-eqz v5, :cond_6

    invoke-virtual {v5}, Lco/bird/android/model/IssueType;->getDisplay()Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_7

    :cond_6
    move-object v5, v4

    :cond_7
    move-object/from16 v6, p3

    check-cast v6, Ljava/lang/Iterable;

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_8
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_9

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    move-object v8, v7

    check-cast v8, Lco/bird/android/model/RepairType;

    invoke-virtual {v8}, Lco/bird/android/model/RepairType;->getId()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v3}, Lco/bird/android/model/QCInspection;->getRepairTypeId()Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_8

    goto :goto_4

    :cond_9
    move-object v7, v2

    :goto_4
    check-cast v7, Lco/bird/android/model/RepairType;

    if-eqz v7, :cond_b

    invoke-virtual {v7}, Lco/bird/android/model/RepairType;->getDisplay()Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_a

    goto :goto_5

    :cond_a
    move-object v4, v6

    :cond_b
    :goto_5
    invoke-virtual {v3}, Lco/bird/android/model/QCInspection;->getStatus()Lco/bird/android/model/constant/QCStatus;

    move-result-object v3

    new-instance v7, Ljb4;

    invoke-direct {v7, v5, v4, v3}, Ljb4;-><init>(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/QCStatus;)V

    new-instance v3, LG6;

    sget v8, Ljk4;->item_inspection_failed_issue:I

    const/4 v9, 0x0

    const/4 v10, 0x4

    const/4 v11, 0x0

    move-object v6, v3

    invoke-direct/range {v6 .. v11}, LG6;-><init>(Ljava/lang/Object;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto/16 :goto_2

    :cond_c
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v13

    new-instance v2, LH6;

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x6

    const/16 v17, 0x0

    move-object v12, v2

    invoke-direct/range {v12 .. v17}, LH6;-><init>(Ljava/util/List;LG6;LG6;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_6
    return-object v2
.end method

.method public final i(ZLjava/lang/String;)LH6;
    .locals 13

    new-instance v6, LH6;

    const/4 v0, 0x1

    new-array v0, v0, [LG6;

    new-instance v1, LG6;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-static {p1, p2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v8

    sget v9, Ljk4;->item_vehicle_pass_fail:I

    const/4 v10, 0x0

    const/4 v11, 0x4

    const/4 v12, 0x0

    move-object v7, v1

    invoke-direct/range {v7 .. v12}, LG6;-><init>(Ljava/lang/Object;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 p1, 0x0

    aput-object v1, v0, p1

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->mutableListOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x6

    const/4 v5, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, LH6;-><init>(Ljava/util/List;LG6;LG6;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v6
.end method

.method public final j(Z)LH6;
    .locals 13

    new-instance v6, LH6;

    const/4 v0, 0x1

    new-array v0, v0, [LG6;

    new-instance v1, LG6;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v8

    sget v9, Ljk4;->item_qc_pass_fail_text:I

    const/4 v10, 0x0

    const/4 v11, 0x4

    const/4 v12, 0x0

    move-object v7, v1

    invoke-direct/range {v7 .. v12}, LG6;-><init>(Ljava/lang/Object;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 p1, 0x0

    aput-object v1, v0, p1

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->mutableListOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x6

    const/4 v5, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, LH6;-><init>(Ljava/util/List;LG6;LG6;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v6
.end method
