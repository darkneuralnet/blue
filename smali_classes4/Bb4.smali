.class public final LBb4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LAb4;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\n\u0018\u00002\u00020\u0001B\u0011\u0008\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0016\u0010\u000b\u001a\u00020\u00062\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008H\u0016J\u001e\u0010\u0010\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000c2\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\u0008H\u0016R\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u0012R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0015R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0017R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u001e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00088\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001b\u00a8\u0006\u001e"
    }
    d2 = {
        "LBb4;",
        "LAb4;",
        "Lco/bird/android/model/wire/WireBird;",
        "bird",
        "Lco/bird/android/model/constant/QualityControlFlow;",
        "flow",
        "",
        "b",
        "",
        "Lco/bird/android/model/QCAutoCheck;",
        "qcAutoChecks",
        "a",
        "",
        "passed",
        "Lco/bird/android/model/QCInspection;",
        "qcInspections",
        "c",
        "LEa;",
        "LEa;",
        "analyticsManager",
        "",
        "Ljava/lang/String;",
        "sessionId",
        "Lco/bird/android/model/wire/WireBird;",
        "d",
        "Lco/bird/android/model/constant/QualityControlFlow;",
        "e",
        "Ljava/util/List;",
        "<init>",
        "(LEa;)V",
        "quality-control-analytics_release"
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
        "SMAP\nQualityControlAnalyticsManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QualityControlAnalyticsManagerImpl.kt\nco/bird/android/manager/qualitycontrolanalytics/QualityControlAnalyticsManagerImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,70:1\n1#2:71\n1774#3,4:72\n1774#3,4:76\n1774#3,4:80\n1774#3,4:84\n*S KotlinDebug\n*F\n+ 1 QualityControlAnalyticsManagerImpl.kt\nco/bird/android/manager/qualitycontrolanalytics/QualityControlAnalyticsManagerImpl\n*L\n56#1:72,4\n57#1:76,4\n59#1:80,4\n60#1:84,4\n*E\n"
    }
.end annotation


# instance fields
.field public final a:LEa;

.field public b:Ljava/lang/String;

.field public c:Lco/bird/android/model/wire/WireBird;

.field public d:Lco/bird/android/model/constant/QualityControlFlow;

.field public e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lco/bird/android/model/QCAutoCheck;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LEa;)V
    .locals 1

    const-string v0, "analyticsManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LBb4;->a:LEa;

    return-void
.end method


# virtual methods
.method public a(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/model/QCAutoCheck;",
            ">;)V"
        }
    .end annotation

    const-string v0, "qcAutoChecks"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LBb4;->e:Ljava/util/List;

    return-void
.end method

.method public b(Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/constant/QualityControlFlow;)V
    .locals 10

    const-string v0, "bird"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v5

    const-string v0, "randomUUID().toString()"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v5, p0, LBb4;->b:Ljava/lang/String;

    iput-object p1, p0, LBb4;->c:Lco/bird/android/model/wire/WireBird;

    iput-object p2, p0, LBb4;->d:Lco/bird/android/model/constant/QualityControlFlow;

    const/4 p2, 0x0

    iput-object p2, p0, LBb4;->e:Ljava/util/List;

    iget-object p2, p0, LBb4;->a:LEa;

    new-instance v0, LOc4;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireBird;->getId()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireBird;->getModel()Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x7

    const/4 v9, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v9}, LOc4;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p2, v0}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    return-void
.end method

.method public c(ZLjava/util/List;)V
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ljava/util/List<",
            "Lco/bird/android/model/QCInspection;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    const-string v2, "qcInspections"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v7, v0, LBb4;->b:Ljava/lang/String;

    iget-object v2, v0, LBb4;->c:Lco/bird/android/model/wire/WireBird;

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v7, :cond_0

    if-eqz v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    move v2, v4

    :goto_0
    if-eqz v2, :cond_13

    iget-object v2, v0, LBb4;->a:LEa;

    iget-object v5, v0, LBb4;->e:Ljava/util/List;

    if-eqz v5, :cond_1

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    move v9, v5

    goto :goto_1

    :cond_1
    move v9, v4

    :goto_1
    iget-object v5, v0, LBb4;->e:Ljava/util/List;

    if-eqz v5, :cond_5

    check-cast v5, Ljava/lang/Iterable;

    instance-of v6, v5, Ljava/util/Collection;

    if-eqz v6, :cond_2

    move-object v6, v5

    check-cast v6, Ljava/util/Collection;

    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_2

    move v6, v4

    goto :goto_3

    :cond_2
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    move v6, v4

    :cond_3
    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_4

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lco/bird/android/model/QCAutoCheck;

    invoke-virtual {v8}, Lco/bird/android/model/QCAutoCheck;->getPassed()Z

    move-result v8

    if-eqz v8, :cond_3

    add-int/lit8 v6, v6, 0x1

    if-gez v6, :cond_3

    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwCountOverflow()V

    goto :goto_2

    :cond_4
    :goto_3
    move v11, v6

    goto :goto_4

    :cond_5
    move v11, v4

    :goto_4
    iget-object v5, v0, LBb4;->e:Ljava/util/List;

    if-eqz v5, :cond_9

    check-cast v5, Ljava/lang/Iterable;

    instance-of v6, v5, Ljava/util/Collection;

    if-eqz v6, :cond_6

    move-object v6, v5

    check-cast v6, Ljava/util/Collection;

    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_6

    move v6, v4

    goto :goto_6

    :cond_6
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    move v6, v4

    :cond_7
    :goto_5
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_8

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lco/bird/android/model/QCAutoCheck;

    invoke-virtual {v8}, Lco/bird/android/model/QCAutoCheck;->getPassed()Z

    move-result v8

    xor-int/2addr v8, v3

    if-eqz v8, :cond_7

    add-int/lit8 v6, v6, 0x1

    if-gez v6, :cond_7

    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwCountOverflow()V

    goto :goto_5

    :cond_8
    :goto_6
    move v10, v6

    goto :goto_7

    :cond_9
    move v10, v4

    :goto_7
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v12

    check-cast v1, Ljava/lang/Iterable;

    instance-of v5, v1, Ljava/util/Collection;

    if-eqz v5, :cond_a

    move-object v6, v1

    check-cast v6, Ljava/util/Collection;

    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_a

    move v14, v4

    goto :goto_a

    :cond_a
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    move v8, v4

    :cond_b
    :goto_8
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_d

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lco/bird/android/model/QCInspection;

    invoke-virtual {v13}, Lco/bird/android/model/QCInspection;->getStatus()Lco/bird/android/model/constant/QCStatus;

    move-result-object v13

    sget-object v14, Lco/bird/android/model/constant/QCStatus;->PASSED:Lco/bird/android/model/constant/QCStatus;

    if-ne v13, v14, :cond_c

    move v13, v3

    goto :goto_9

    :cond_c
    move v13, v4

    :goto_9
    if-eqz v13, :cond_b

    add-int/lit8 v8, v8, 0x1

    if-gez v8, :cond_b

    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwCountOverflow()V

    goto :goto_8

    :cond_d
    move v14, v8

    :goto_a
    if-eqz v5, :cond_e

    move-object v5, v1

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_e

    move v13, v4

    goto :goto_d

    :cond_e
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    move v5, v4

    :cond_f
    :goto_b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_11

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lco/bird/android/model/QCInspection;

    invoke-virtual {v6}, Lco/bird/android/model/QCInspection;->getStatus()Lco/bird/android/model/constant/QCStatus;

    move-result-object v6

    sget-object v8, Lco/bird/android/model/constant/QCStatus;->FAILED:Lco/bird/android/model/constant/QCStatus;

    if-ne v6, v8, :cond_10

    move v6, v3

    goto :goto_c

    :cond_10
    move v6, v4

    :goto_c
    if-eqz v6, :cond_f

    add-int/lit8 v5, v5, 0x1

    if-gez v5, :cond_f

    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwCountOverflow()V

    goto :goto_b

    :cond_11
    move v13, v5

    :goto_d
    iget-object v1, v0, LBb4;->d:Lco/bird/android/model/constant/QualityControlFlow;

    const/4 v15, 0x0

    if-eqz v1, :cond_12

    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_12

    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v1

    const-string v3, "this as java.lang.String).toLowerCase()"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_e

    :cond_12
    move-object v1, v15

    :goto_e
    new-instance v8, LCb4;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v16, 0x7

    const/16 v17, 0x0

    move-object v3, v8

    move-object/from16 v18, v8

    move/from16 v8, p1

    move-object v15, v1

    invoke-direct/range {v3 .. v17}, LCb4;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;ZIIIIIILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v1, v18

    invoke-interface {v2, v1}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    const/4 v1, 0x0

    iput-object v1, v0, LBb4;->b:Ljava/lang/String;

    iput-object v1, v0, LBb4;->c:Lco/bird/android/model/wire/WireBird;

    iput-object v1, v0, LBb4;->e:Ljava/util/List;

    return-void

    :cond_13
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Cannot complete quality control without starting one first"

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
