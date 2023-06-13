.class public final LN60;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\t\u0008\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000bJ$\u0010\t\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00080\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u00a8\u0006\u000c"
    }
    d2 = {
        "LN60;",
        "",
        "LV60$a;",
        "config",
        "Lco/bird/api/response/OpsBatchJobActionKind;",
        "selectedAction",
        "Lio/reactivex/F;",
        "",
        "LH6;",
        "b",
        "<init>",
        "()V",
        "bulk-scanner_release"
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
        "SMAP\nBulkUpdateConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BulkUpdateConverter.kt\nco/bird/android/feature/bulkscanner/update/BulkUpdateConverter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,42:1\n1855#2,2:43\n1549#2:45\n1620#2,3:46\n*S KotlinDebug\n*F\n+ 1 BulkUpdateConverter.kt\nco/bird/android/feature/bulkscanner/update/BulkUpdateConverter\n*L\n32#1:43,2\n34#1:45\n34#1:46,3\n*E\n"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(LV60$a;Lco/bird/api/response/OpsBatchJobActionKind;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1}, LN60;->c(LV60$a;Lco/bird/api/response/OpsBatchJobActionKind;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final c(LV60$a;Lco/bird/api/response/OpsBatchJobActionKind;)Ljava/util/List;
    .locals 13

    const-string v0, "$config"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0}, LV60$a;->c()Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Ld40;

    sget-object v3, Lco/bird/api/response/OpsBatchJobActionKind;->MARK_FIXED:Lco/bird/api/response/OpsBatchJobActionKind;

    sget v4, Lnl4;->operator_bulk_update_mark_fixed:I

    const/4 v5, 0x0

    const/4 v6, 0x4

    const/4 v7, 0x0

    move-object v2, v1

    invoke-direct/range {v2 .. v7}, Ld40;-><init>(Lco/bird/api/response/OpsBatchJobActionKind;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    invoke-virtual {p0}, LV60$a;->d()Z

    move-result v1

    if-eqz v1, :cond_1

    new-instance v1, Ld40;

    sget-object v3, Lco/bird/api/response/OpsBatchJobActionKind;->WAKE_BLUETOOTH:Lco/bird/api/response/OpsBatchJobActionKind;

    sget v4, Lnl4;->operator_bulk_action_wake_bluetooth:I

    const/4 v5, 0x0

    const/4 v6, 0x4

    const/4 v7, 0x0

    move-object v2, v1

    invoke-direct/range {v2 .. v7}, Ld40;-><init>(Lco/bird/api/response/OpsBatchJobActionKind;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    invoke-virtual {p0}, LV60$a;->b()Z

    move-result p0

    if-eqz p0, :cond_2

    new-instance p0, Ld40;

    sget-object v2, Lco/bird/api/response/OpsBatchJobActionKind;->CHIRP:Lco/bird/api/response/OpsBatchJobActionKind;

    sget v3, Lnl4;->operator_bulk_update_chirp:I

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v1, p0

    invoke-direct/range {v1 .. v6}, Ld40;-><init>(Lco/bird/api/response/OpsBatchJobActionKind;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ld40;

    invoke-virtual {v1}, Ld40;->b()Lco/bird/api/response/OpsBatchJobActionKind;

    move-result-object v2

    if-ne v2, p1, :cond_3

    const/4 v2, 0x1

    goto :goto_1

    :cond_3
    const/4 v2, 0x0

    :goto_1
    invoke-virtual {v1, v2}, Ld40;->e(Z)V

    goto :goto_0

    :cond_4
    new-instance p0, Ljava/util/ArrayList;

    const/16 p1, 0xa

    invoke-static {v0, p1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result p1

    invoke-direct {p0, p1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ld40;

    new-instance v0, LG6;

    sget v3, LSi4;->view_operator_bulk_action:I

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, LG6;-><init>(Ljava/lang/Object;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p0, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_5
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v8

    new-instance p0, LH6;

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x6

    const/4 v12, 0x0

    move-object v7, p0

    invoke-direct/range {v7 .. v12}, LH6;-><init>(Ljava/util/List;LG6;LG6;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final b(LV60$a;Lco/bird/api/response/OpsBatchJobActionKind;)Lio/reactivex/F;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LV60$a;",
            "Lco/bird/api/response/OpsBatchJobActionKind;",
            ")",
            "Lio/reactivex/F<",
            "Ljava/util/List<",
            "LH6;",
            ">;>;"
        }
    .end annotation

    const-string v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LM60;

    invoke-direct {v0, p1, p2}, LM60;-><init>(LV60$a;Lco/bird/api/response/OpsBatchJobActionKind;)V

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
