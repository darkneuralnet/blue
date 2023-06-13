.class public final LfS1$n;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LfS1;->K(Lio/reactivex/Observable;)Lio/reactivex/c;
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
        "Lco/bird/android/model/persistence/BrainSwapRecord;",
        ">;",
        "Lio/reactivex/h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "",
        "Lco/bird/android/model/persistence/BrainSwapRecord;",
        "records",
        "Lio/reactivex/h;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Ljava/util/List;)Lio/reactivex/h;"
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
        "SMAP\nIdToolsLandingPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdToolsLandingPresenter.kt\nco/bird/android/feature/servicecenter/idtools/landing/IdToolsLandingPresenter$queryOrUpdatePendingSwaps$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,181:1\n766#2:182\n857#2,2:183\n1549#2:185\n1620#2,3:186\n*S KotlinDebug\n*F\n+ 1 IdToolsLandingPresenter.kt\nco/bird/android/feature/servicecenter/idtools/landing/IdToolsLandingPresenter$queryOrUpdatePendingSwaps$1\n*L\n158#1:182\n158#1:183,2\n164#1:185\n164#1:186,3\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LfS1;


# direct methods
.method public constructor <init>(LfS1;)V
    .locals 0

    iput-object p1, p0, LfS1$n;->g:LfS1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)Lio/reactivex/h;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/BrainSwapRecord;",
            ">;)",
            "Lio/reactivex/h;"
        }
    .end annotation

    const-string v0, "records"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LfS1$n;->g:LfS1;

    invoke-static {v0}, LfS1;->access$getReactiveConfig$p(LfS1;)LTq4;

    move-result-object v0

    invoke-virtual {v0}, LTq4;->f8()LZ84;

    move-result-object v0

    invoke-virtual {v0}, LZ84;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/Config;->getOperatorConfig()Lco/bird/android/model/wire/configs/OperatorConfig;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/OperatorConfig;->getFeatures()Lco/bird/android/model/wire/configs/OperatorFeatureConfig;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/OperatorFeatureConfig;->getIdTool()Lco/bird/android/model/wire/configs/OperatorIdToolConfig;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/OperatorIdToolConfig;->getBrainSwapTimeoutSeconds()I

    move-result v0

    check-cast p1, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lco/bird/android/model/persistence/BrainSwapRecord;

    invoke-virtual {v3}, Lco/bird/android/model/persistence/BrainSwapRecord;->getStatus()Ljava/lang/Boolean;

    move-result-object v3

    if-nez v3, :cond_1

    const/4 v3, 0x1

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    :goto_1
    if-eqz v3, :cond_0

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    iget-object p1, p0, LfS1$n;->g:LfS1;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-static {}, Lio/reactivex/c;->p()Lio/reactivex/c;

    move-result-object p1

    return-object p1

    :cond_3
    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v1, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lco/bird/android/model/persistence/BrainSwapRecord;

    invoke-virtual {v3}, Lco/bird/android/model/persistence/BrainSwapRecord;->getCreatedAt()Lorg/joda/time/DateTime;

    move-result-object v4

    invoke-virtual {v4, v0}, Lorg/joda/time/DateTime;->plusSeconds(I)Lorg/joda/time/DateTime;

    move-result-object v4

    invoke-virtual {v4}, Lorg/joda/time/base/AbstractInstant;->isAfterNow()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-static {p1}, LfS1;->access$getBrainSwapManager$p(LfS1;)Ln10;

    move-result-object v4

    invoke-virtual {v3}, Lco/bird/android/model/persistence/BrainSwapRecord;->getImei()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v4, v3}, Ln10;->B0(Ljava/lang/String;)Lio/reactivex/c;

    move-result-object v3

    goto :goto_3

    :cond_4
    invoke-static {p1}, LfS1;->access$getBrainSwapManager$p(LfS1;)Ln10;

    move-result-object v4

    invoke-virtual {v3}, Lco/bird/android/model/persistence/BrainSwapRecord;->getImei()Ljava/lang/String;

    move-result-object v3

    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {v4, v3, v5}, Ln10;->U(Ljava/lang/String;Ljava/lang/Boolean;)Lio/reactivex/c;

    move-result-object v3

    :goto_3
    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_5
    invoke-static {v2}, Lio/reactivex/c;->L(Ljava/lang/Iterable;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, LfS1$n;->a(Ljava/util/List;)Lio/reactivex/h;

    move-result-object p1

    return-object p1
.end method
