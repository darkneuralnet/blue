.class public final Lml6$e;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lml6;->refresh()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/persistence/Bird;",
        "Lio/reactivex/K<",
        "+",
        "Lje3<",
        "+",
        "Lkotlin/Unit;",
        "+",
        "Lco/bird/android/buava/Optional<",
        "Lco/bird/android/model/MobilePartner;",
        ">;+",
        "Lco/bird/android/model/BirdSummaryBody;",
        "+",
        "Lco/bird/android/model/CommandCenterBody;",
        "+",
        "Ljava/util/List<",
        "+",
        "Lco/bird/android/model/CommandCenterNotice;",
        ">;+",
        "Lco/bird/android/buava/Optional<",
        "Lco/bird/android/model/WorkOrder;",
        ">;+",
        "Ljava/util/List<",
        "+",
        "Lco/bird/android/model/WorkOrder;",
        ">;+",
        "Ljava/util/List<",
        "+",
        "Lco/bird/android/model/VehicleScrapRequest;",
        ">;>;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u000e\u001a\u00e1\u0005\u0012\u00e8\u0002\u0008\u0001\u0012\u00e3\u0002\u0012\u000c\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0005*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0006\u0012\u000c\u0012\n \u0005*\u0004\u0018\u00010\u00080\u0008\u0012\u000c\u0012\n \u0005*\u0004\u0018\u00010\t0\t\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u000b \u0005*\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n0\n\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u000c \u0005*\n\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u00060\u0006\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u000c \u0005*\n\u0012\u0004\u0012\u00020\u000c\u0018\u00010\n0\n\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\r \u0005*\n\u0012\u0004\u0012\u00020\r\u0018\u00010\n0\n \u0005*\u00b0\u0001\u0012\u000c\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0005*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0006\u0012\u000c\u0012\n \u0005*\u0004\u0018\u00010\u00080\u0008\u0012\u000c\u0012\n \u0005*\u0004\u0018\u00010\t0\t\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u000b \u0005*\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n0\n\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u000c \u0005*\n\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u00060\u0006\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u000c \u0005*\n\u0012\u0004\u0012\u00020\u000c\u0018\u00010\n0\n\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\r \u0005*\n\u0012\u0004\u0012\u00020\r\u0018\u00010\n0\n\u0018\u00010\u00030\u0003 \u0005*\u00ef\u0002\u0012\u00e8\u0002\u0008\u0001\u0012\u00e3\u0002\u0012\u000c\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0005*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0006\u0012\u000c\u0012\n \u0005*\u0004\u0018\u00010\u00080\u0008\u0012\u000c\u0012\n \u0005*\u0004\u0018\u00010\t0\t\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u000b \u0005*\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n0\n\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u000c \u0005*\n\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u00060\u0006\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u000c \u0005*\n\u0012\u0004\u0012\u00020\u000c\u0018\u00010\n0\n\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\r \u0005*\n\u0012\u0004\u0012\u00020\r\u0018\u00010\n0\n \u0005*\u00b0\u0001\u0012\u000c\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0005*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0006\u0012\u000c\u0012\n \u0005*\u0004\u0018\u00010\u00080\u0008\u0012\u000c\u0012\n \u0005*\u0004\u0018\u00010\t0\t\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u000b \u0005*\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n0\n\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u000c \u0005*\n\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u00060\u0006\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u000c \u0005*\n\u0012\u0004\u0012\u00020\u000c\u0018\u00010\n0\n\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\r \u0005*\n\u0012\u0004\u0012\u00020\r\u0018\u00010\n0\n\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u000e\u0010\u000f"
    }
    d2 = {
        "Lco/bird/android/model/persistence/Bird;",
        "bird",
        "Lio/reactivex/K;",
        "Lje3;",
        "",
        "kotlin.jvm.PlatformType",
        "Lco/bird/android/buava/Optional;",
        "Lco/bird/android/model/MobilePartner;",
        "Lco/bird/android/model/BirdSummaryBody;",
        "Lco/bird/android/model/CommandCenterBody;",
        "",
        "Lco/bird/android/model/CommandCenterNotice;",
        "Lco/bird/android/model/WorkOrder;",
        "Lco/bird/android/model/VehicleScrapRequest;",
        "b",
        "(Lco/bird/android/model/persistence/Bird;)Lio/reactivex/K;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lml6;


# direct methods
.method public constructor <init>(Lml6;)V
    .locals 0

    iput-object p1, p0, Lml6$e;->g:Lml6;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/buava/Optional;
    .locals 0

    invoke-static {p0, p1}, Lml6$e;->c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/buava/Optional;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/buava/Optional;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lco/bird/android/buava/Optional;

    return-object p0
.end method


# virtual methods
.method public final b(Lco/bird/android/model/persistence/Bird;)Lio/reactivex/K;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/persistence/Bird;",
            ")",
            "Lio/reactivex/K<",
            "+",
            "Lje3<",
            "Lkotlin/Unit;",
            "Lco/bird/android/buava/Optional<",
            "Lco/bird/android/model/MobilePartner;",
            ">;",
            "Lco/bird/android/model/BirdSummaryBody;",
            "Lco/bird/android/model/CommandCenterBody;",
            "Ljava/util/List<",
            "Lco/bird/android/model/CommandCenterNotice;",
            ">;",
            "Lco/bird/android/buava/Optional<",
            "Lco/bird/android/model/WorkOrder;",
            ">;",
            "Ljava/util/List<",
            "Lco/bird/android/model/WorkOrder;",
            ">;",
            "Ljava/util/List<",
            "Lco/bird/android/model/VehicleScrapRequest;",
            ">;>;>;"
        }
    .end annotation

    const-string v0, "bird"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lml6$e;->g:Lml6;

    invoke-static {v0}, Lml6;->access$getReactiveConfig$p(Lml6;)LTq4;

    move-result-object v0

    invoke-virtual {v0}, LTq4;->f8()LZ84;

    move-result-object v0

    invoke-virtual {v0}, LZ84;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/Config;->getOperatorConfig()Lco/bird/android/model/wire/configs/OperatorConfig;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/OperatorConfig;->getFeatures()Lco/bird/android/model/wire/configs/OperatorFeatureConfig;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/OperatorFeatureConfig;->getWorkOrders()Lco/bird/android/model/wire/configs/OperatorWorkOrderConfig;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/OperatorWorkOrderConfig;->getEnableInspection()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lml6$e;->g:Lml6;

    invoke-static {v0}, Lml6;->access$getWorkOrderManager$p(Lml6;)LaG6;

    move-result-object v0

    invoke-virtual {p1}, Lco/bird/android/model/persistence/Bird;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, LaG6;->h(Ljava/lang/String;)Lio/reactivex/F;

    move-result-object v0

    goto :goto_0

    :cond_0
    sget-object v0, Lco/bird/android/buava/Optional;->c:Lco/bird/android/buava/Optional$a;

    invoke-virtual {v0}, Lco/bird/android/buava/Optional$a;->a()Lco/bird/android/buava/Optional;

    move-result-object v0

    invoke-static {v0}, Lio/reactivex/F;->H(Ljava/lang/Object;)Lio/reactivex/F;

    move-result-object v0

    const-string v1, "{\n          Single.just(\u2026ional.absent())\n        }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    move-object v8, v0

    iget-object v0, p0, Lml6$e;->g:Lml6;

    invoke-static {v0}, Lml6;->access$getReactiveConfig$p(Lml6;)LTq4;

    move-result-object v0

    invoke-virtual {v0}, LTq4;->f8()LZ84;

    move-result-object v0

    invoke-virtual {v0}, LZ84;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/Config;->getOperatorConfig()Lco/bird/android/model/wire/configs/OperatorConfig;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/OperatorConfig;->getFeatures()Lco/bird/android/model/wire/configs/OperatorFeatureConfig;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/OperatorFeatureConfig;->getWorkOrders()Lco/bird/android/model/wire/configs/OperatorWorkOrderConfig;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/OperatorWorkOrderConfig;->getEnableWorkOrderHistory()Z

    move-result v0

    const-string v1, "{\n          Single.just(emptyList())\n        }"

    if-eqz v0, :cond_1

    iget-object v0, p0, Lml6$e;->g:Lml6;

    invoke-static {v0}, Lml6;->access$getWorkOrderManager$p(Lml6;)LaG6;

    move-result-object v0

    invoke-virtual {p1}, Lco/bird/android/model/persistence/Bird;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, LaG6;->r(Ljava/lang/String;)Lio/reactivex/F;

    move-result-object v0

    goto :goto_1

    :cond_1
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lio/reactivex/F;->H(Ljava/lang/Object;)Lio/reactivex/F;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_1
    move-object v9, v0

    iget-object v0, p0, Lml6$e;->g:Lml6;

    invoke-static {v0}, Lml6;->access$getPartnerSubject$p(Lml6;)Lio/reactivex/subjects/a;

    move-result-object v0

    invoke-virtual {v0}, Lio/reactivex/subjects/a;->i()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p1}, Lco/bird/android/model/persistence/Bird;->getPartnerId()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lml6$e;->g:Lml6;

    invoke-static {v0}, Lml6;->access$getPartnerManager$p(Lml6;)LGI3;

    move-result-object v0

    invoke-virtual {p1}, Lco/bird/android/model/persistence/Bird;->getPartnerId()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-interface {v0, v2}, LGI3;->u(Ljava/lang/String;)Lio/reactivex/F;

    move-result-object v0

    sget-object v2, Lml6$e$a;->g:Lml6$e$a;

    new-instance v3, Lnl6;

    invoke-direct {v3, v2}, Lnl6;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v3}, Lio/reactivex/F;->I(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object v0

    goto :goto_2

    :cond_2
    iget-object v0, p0, Lml6$e;->g:Lml6;

    invoke-static {v0}, Lml6;->access$getPartnerSubject$p(Lml6;)Lio/reactivex/subjects/a;

    move-result-object v0

    invoke-virtual {v0}, Lio/reactivex/subjects/a;->i()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lml6$e;->g:Lml6;

    invoke-static {v0}, Lml6;->access$getPartnerSubject$p(Lml6;)Lio/reactivex/subjects/a;

    move-result-object v0

    invoke-virtual {v0}, Lio/reactivex/Observable;->firstOrError()Lio/reactivex/F;

    move-result-object v0

    goto :goto_2

    :cond_3
    sget-object v0, Lco/bird/android/buava/Optional;->c:Lco/bird/android/buava/Optional$a;

    invoke-virtual {v0}, Lco/bird/android/buava/Optional$a;->a()Lco/bird/android/buava/Optional;

    move-result-object v0

    invoke-static {v0}, Lio/reactivex/F;->H(Ljava/lang/Object;)Lio/reactivex/F;

    move-result-object v0

    :goto_2
    move-object v4, v0

    iget-object v0, p0, Lml6$e;->g:Lml6;

    invoke-static {v0}, Lml6;->access$getReactiveConfig$p(Lml6;)LTq4;

    move-result-object v0

    invoke-virtual {v0}, LTq4;->f8()LZ84;

    move-result-object v0

    invoke-virtual {v0}, LZ84;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/Config;->getServiceCenterConfig()Lco/bird/android/model/wire/configs/ServiceCenterConfig;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/ServiceCenterConfig;->getScrap()Lco/bird/android/model/wire/configs/ScrapConfig;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/ScrapConfig;->getEnabled()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lml6$e;->g:Lml6;

    invoke-static {v0}, Lml6;->access$getScrapManager$p(Lml6;)Leo5;

    move-result-object v0

    invoke-virtual {p1}, Lco/bird/android/model/persistence/Bird;->getId()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {v0, v1, v3, v2, v3}, Leo5$a;->getScrapRequestsForBird$default(Leo5;Ljava/lang/String;Lco/bird/android/model/constant/ScrapRequestReviewStatus;ILjava/lang/Object;)Lio/reactivex/F;

    move-result-object v0

    invoke-static {v0}, Lag5;->l(Lio/reactivex/F;)Lio/reactivex/F;

    move-result-object v0

    goto :goto_3

    :cond_4
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lio/reactivex/F;->H(Ljava/lang/Object;)Lio/reactivex/F;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_3
    move-object v10, v0

    sget-object v2, LsB5;->a:LsB5;

    iget-object v0, p0, Lml6$e;->g:Lml6;

    invoke-static {v0}, Lml6;->access$getOperatorManager$p(Lml6;)Lom3;

    move-result-object v0

    invoke-virtual {p1}, Lco/bird/android/model/persistence/Bird;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lom3;->S0(Ljava/lang/String;)Lio/reactivex/c;

    move-result-object v0

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-static {v1}, Lio/reactivex/F;->H(Ljava/lang/Object;)Lio/reactivex/F;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/c;->m(Lio/reactivex/K;)Lio/reactivex/F;

    move-result-object v3

    const-string v0, "operatorManager.fetchBir\u2026ndThen(Single.just(Unit))"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "partnerSingle"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lml6$e;->g:Lml6;

    invoke-static {v0}, Lml6;->access$getBirdManager$p(Lml6;)LaM;

    move-result-object v0

    invoke-virtual {p1}, Lco/bird/android/model/persistence/Bird;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, LaM;->o(Ljava/lang/String;)Lio/reactivex/F;

    move-result-object v0

    invoke-static {v0}, Lag5;->l(Lio/reactivex/F;)Lio/reactivex/F;

    move-result-object v5

    iget-object v0, p0, Lml6$e;->g:Lml6;

    invoke-static {v0}, Lml6;->access$getCommandCenterManager$p(Lml6;)LTn0;

    move-result-object v0

    invoke-virtual {p1}, Lco/bird/android/model/persistence/Bird;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, LTn0;->b(Ljava/lang/String;)Lio/reactivex/F;

    move-result-object v0

    invoke-static {v0}, Lag5;->l(Lio/reactivex/F;)Lio/reactivex/F;

    move-result-object v6

    iget-object v0, p0, Lml6$e;->g:Lml6;

    invoke-static {v0}, Lml6;->access$getCommandCenterManager$p(Lml6;)LTn0;

    move-result-object v0

    invoke-virtual {p1}, Lco/bird/android/model/persistence/Bird;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, LTn0;->a(Ljava/lang/String;)Lio/reactivex/F;

    move-result-object p1

    invoke-static {p1}, Lag5;->l(Lio/reactivex/F;)Lio/reactivex/F;

    move-result-object v7

    invoke-virtual/range {v2 .. v10}, LsB5;->f(Lio/reactivex/K;Lio/reactivex/K;Lio/reactivex/K;Lio/reactivex/K;Lio/reactivex/K;Lio/reactivex/K;Lio/reactivex/K;Lio/reactivex/K;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/persistence/Bird;

    invoke-virtual {p0, p1}, Lml6$e;->b(Lco/bird/android/model/persistence/Bird;)Lio/reactivex/K;

    move-result-object p1

    return-object p1
.end method
