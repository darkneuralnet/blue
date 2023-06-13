.class public final LOc5$i;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LOc5;->a(Lco/bird/android/model/wire/WireBird;Lut4;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LOc5$i$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/Triple<",
        "+",
        "Lco/bird/android/buava/Optional<",
        "Lco/bird/android/model/WorkOrder;",
        ">;+",
        "Lco/bird/android/model/wire/WireRoute;",
        "+",
        "Lco/bird/android/buava/Optional<",
        "Lco/bird/android/model/constant/ServiceCenterRoute;",
        ">;>;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0008\u001a\u00020\u00072v\u0010\u0006\u001ar\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u000c\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0004*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00010\u0001 \u0004*8\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u000c\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0004*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00010\u0001\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0008\u0010\t"
    }
    d2 = {
        "Lkotlin/Triple;",
        "Lco/bird/android/buava/Optional;",
        "Lco/bird/android/model/WorkOrder;",
        "Lco/bird/android/model/wire/WireRoute;",
        "kotlin.jvm.PlatformType",
        "Lco/bird/android/model/constant/ServiceCenterRoute;",
        "<name for destructuring parameter 0>",
        "",
        "a",
        "(Lkotlin/Triple;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LOc5;

.field public final synthetic h:Lut4;

.field public final synthetic i:Lco/bird/android/model/wire/WireBird;


# direct methods
.method public constructor <init>(LOc5;Lut4;Lco/bird/android/model/wire/WireBird;)V
    .locals 0

    iput-object p1, p0, LOc5$i;->g:LOc5;

    iput-object p2, p0, LOc5$i;->h:Lut4;

    iput-object p3, p0, LOc5$i;->i:Lco/bird/android/model/wire/WireBird;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lkotlin/Triple;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Triple<",
            "Lco/bird/android/buava/Optional<",
            "Lco/bird/android/model/WorkOrder;",
            ">;",
            "Lco/bird/android/model/wire/WireRoute;",
            "Lco/bird/android/buava/Optional<",
            "Lco/bird/android/model/constant/ServiceCenterRoute;",
            ">;>;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lkotlin/Triple;->component1()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/buava/Optional;

    invoke-virtual {p1}, Lkotlin/Triple;->component2()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/wire/WireRoute;

    invoke-virtual {p1}, Lkotlin/Triple;->component3()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/buava/Optional;

    iget-object p1, p0, LOc5$i;->g:LOc5;

    invoke-static {p1}, LOc5;->access$getUi$p(LOc5;)LSc5;

    move-result-object p1

    const-wide/16 v2, 0xfa

    invoke-interface {p1, v2, v3}, LLo6;->vibrate(J)V

    iget-object p1, p0, LOc5$i;->g:LOc5;

    invoke-static {p1}, LOc5;->access$getUi$p(LOc5;)LSc5;

    move-result-object p1

    invoke-interface {p1}, LSc5;->r()V

    iget-object p1, p0, LOc5$i;->h:Lut4;

    if-nez p1, :cond_0

    iget-object p1, p0, LOc5$i;->g:LOc5;

    invoke-static {p1}, LOc5;->access$getNavigator$p(LOc5;)Le13;

    move-result-object p1

    const/4 v0, -0x1

    invoke-interface {p1, v0}, Le13;->b1(I)V

    goto :goto_1

    :cond_0
    iget-object p1, p0, LOc5$i;->g:LOc5;

    invoke-static {p1}, LOc5;->access$getReactiveConfig$p(LOc5;)LTq4;

    move-result-object p1

    invoke-virtual {p1}, LTq4;->f8()LZ84;

    move-result-object p1

    invoke-virtual {p1}, LZ84;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/Config;->getOperatorConfig()Lco/bird/android/model/wire/configs/OperatorConfig;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/OperatorConfig;->getFeatures()Lco/bird/android/model/wire/configs/OperatorFeatureConfig;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/OperatorFeatureConfig;->getWorkOrders()Lco/bird/android/model/wire/configs/OperatorWorkOrderConfig;

    move-result-object p1

    iget-object v2, p0, LOc5$i;->g:LOc5;

    invoke-static {v2}, LOc5;->access$getOriginalRoute$p(LOc5;)Lco/bird/android/model/constant/ServiceCenterRoute;

    move-result-object v2

    sget-object v3, Lco/bird/android/model/constant/ServiceCenterRoute;->CHECK_IN:Lco/bird/android/model/constant/ServiceCenterRoute;

    if-ne v2, v3, :cond_2

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireRoute;->getRoute()Lco/bird/android/model/constant/ServiceCenterRoute;

    move-result-object v1

    sget-object v2, Lco/bird/android/model/constant/ServiceCenterRoute;->REPAIR:Lco/bird/android/model/constant/ServiceCenterRoute;

    if-ne v1, v2, :cond_2

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/OperatorWorkOrderConfig;->getEnableInspection()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/OperatorWorkOrderConfig;->getInspectionFlow()Lco/bird/android/model/constant/InspectionFlow;

    move-result-object p1

    sget-object v1, LOc5$i$a;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v1, p1

    const/4 v1, 0x1

    if-ne p1, v1, :cond_1

    iget-object p1, p0, LOc5$i;->g:LOc5;

    invoke-static {p1}, LOc5;->access$getNavigator$p(LOc5;)Le13;

    move-result-object v1

    iget-object v2, p0, LOc5$i;->i:Lco/bird/android/model/wire/WireBird;

    invoke-virtual {v0}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object p1

    move-object v3, p1

    check-cast v3, Lco/bird/android/model/WorkOrder;

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Le13$a;->goToWorkOrderInspection$default(Le13;Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/WorkOrder;ZILjava/lang/Object;)V

    goto :goto_0

    :cond_1
    iget-object p1, p0, LOc5$i;->g:LOc5;

    invoke-static {p1}, LOc5;->access$getNavigator$p(LOc5;)Le13;

    move-result-object v1

    iget-object v2, p0, LOc5$i;->i:Lco/bird/android/model/wire/WireBird;

    invoke-virtual {v0}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object p1

    move-object v3, p1

    check-cast v3, Lco/bird/android/model/WorkOrder;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0xc

    const/4 v7, 0x0

    invoke-static/range {v1 .. v7}, Le13$a;->goToLegacyWorkOrderInspection$default(Le13;Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/WorkOrder;ZZILjava/lang/Object;)V

    :cond_2
    :goto_0
    iget-object p1, p0, LOc5$i;->h:Lut4;

    invoke-interface {p1}, Lut4;->refresh()V

    :goto_1
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Triple;

    invoke-virtual {p0, p1}, LOc5$i;->a(Lkotlin/Triple;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
