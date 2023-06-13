.class public final LSS$g;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LSS;->F(Ljava/lang/String;Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/constant/MapMode;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/wire/WireBird;",
        "Lio/reactivex/h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/wire/WireBird;",
        "wireBird",
        "Lio/reactivex/h;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lco/bird/android/model/wire/WireBird;)Lio/reactivex/h;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Z

.field public final synthetic h:LSS;


# direct methods
.method public constructor <init>(ZLSS;)V
    .locals 0

    iput-boolean p1, p0, LSS$g;->g:Z

    iput-object p2, p0, LSS$g;->h:LSS;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/wire/WireBird;)Lio/reactivex/h;
    .locals 27

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "wireBird"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "randomUUID().toString()"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v3, v0, LSS$g;->g:Z

    const/16 v17, 0x0

    if-eqz v3, :cond_0

    iget-object v3, v0, LSS$g;->h:LSS;

    invoke-static {v3}, LSS;->access$getReactiveConfig$p(LSS;)LTq4;

    move-result-object v3

    invoke-virtual {v3}, LTq4;->f8()LZ84;

    move-result-object v3

    invoke-virtual {v3}, LZ84;->a()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v3}, Lco/bird/android/model/wire/configs/Config;->getOperatorConfig()Lco/bird/android/model/wire/configs/OperatorConfig;

    move-result-object v3

    invoke-virtual {v3}, Lco/bird/android/model/wire/configs/OperatorConfig;->getFeatures()Lco/bird/android/model/wire/configs/OperatorFeatureConfig;

    move-result-object v3

    invoke-virtual {v3}, Lco/bird/android/model/wire/configs/OperatorFeatureConfig;->getWakeBirds()Lco/bird/android/model/wire/configs/OperatorWakeBirdsConfig;

    move-result-object v3

    invoke-virtual {v3}, Lco/bird/android/model/wire/configs/OperatorWakeBirdsConfig;->getEnableSleepPowerline()Z

    move-result v3

    if-eqz v3, :cond_0

    iget-object v3, v0, LSS$g;->h:LSS;

    invoke-static {v3}, LSS;->access$getBirdManager$p(LSS;)LaM;

    move-result-object v15

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/wire/WireBird;->getId()Ljava/lang/String;

    move-result-object v5

    sget-object v3, LbH;->b:LbH;

    invoke-virtual {v3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v10

    sget-object v3, LXD5;->c:LXD5;

    invoke-virtual {v3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v11

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/wire/WireBird;->getModel()Ljava/lang/String;

    move-result-object v6

    new-instance v14, LbE5;

    const/4 v4, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/16 v16, 0x0

    const/16 v18, 0x719

    const/16 v19, 0x0

    move-object v3, v14

    move-object v9, v2

    move-object/from16 v20, v14

    move-object/from16 v14, v16

    move-object/from16 v21, v15

    move/from16 v15, v18

    move-object/from16 v16, v19

    invoke-direct/range {v3 .. v16}, LbE5;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v4, v20

    move-object/from16 v3, v21

    invoke-interface {v3, v1, v4}, LaM;->O0(Lco/bird/android/model/wire/WireBird;LbE5;)Lio/reactivex/Observable;

    move-result-object v3

    invoke-virtual {v3}, Lio/reactivex/Observable;->ignoreElements()Lio/reactivex/c;

    move-result-object v3

    move-object/from16 v18, v3

    goto :goto_0

    :cond_0
    move-object/from16 v18, v17

    :goto_0
    sget-object v3, Lco/bird/android/model/constant/BirdModel;->Companion:Lco/bird/android/model/constant/BirdModel$Companion;

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/wire/WireBird;->getModel()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lco/bird/android/model/constant/BirdModel$Companion;->fromString(Ljava/lang/String;)Lco/bird/android/model/constant/BirdModel;

    move-result-object v3

    sget-object v4, Lco/bird/android/model/constant/BirdModel;->BD:Lco/bird/android/model/constant/BirdModel;

    if-eq v3, v4, :cond_1

    iget-object v3, v0, LSS$g;->h:LSS;

    invoke-static {v3}, LSS;->access$getBluetoothManagerRxBle$p(LSS;)Lrd5;

    move-result-object v15

    invoke-static/range {p1 .. p1}, LuC6;->b(Lco/bird/android/model/wire/WireBird;)Lco/bird/android/model/VehicleDescriptor;

    move-result-object v14

    iget-boolean v13, v0, LSS$g;->g:Z

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/wire/WireBird;->getId()Ljava/lang/String;

    move-result-object v5

    sget-object v17, LbH;->b:LbH;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v11

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/wire/WireBird;->getModel()Ljava/lang/String;

    move-result-object v6

    new-instance v12, LKY;

    const/4 v4, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/16 v16, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x759

    const/16 v22, 0x0

    move-object v3, v12

    move-object v9, v2

    move-object/from16 v23, v12

    move-object/from16 v12, v16

    move/from16 v24, v13

    move-object/from16 v13, v19

    move-object/from16 v25, v14

    move-object/from16 v14, v20

    move-object/from16 v26, v15

    move/from16 v15, v21

    move-object/from16 v16, v22

    invoke-direct/range {v3 .. v16}, LKY;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/wire/WireBird;->getId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v10

    sget-object v3, LXD5;->b:LXD5;

    invoke-virtual {v3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v11

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/wire/WireBird;->getModel()Ljava/lang/String;

    move-result-object v6

    new-instance v1, LbE5;

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v15, 0x719

    const/16 v16, 0x0

    move-object v3, v1

    invoke-direct/range {v3 .. v16}, LbE5;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v5, v23

    move/from16 v4, v24

    move-object/from16 v3, v25

    move-object/from16 v2, v26

    invoke-interface {v2, v3, v4, v5, v1}, Lrd5;->h(Lco/bird/android/model/VehicleDescriptor;ZLKY;LbE5;)Lio/reactivex/c;

    move-result-object v1

    const-wide/16 v2, 0x2

    sget-object v4, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {v2, v3, v4}, LSN4;->i(JLjava/util/concurrent/TimeUnit;)LSN4$f;

    move-result-object v2

    iget-object v3, v0, LSS$g;->h:LSS;

    invoke-static {v3}, LSS;->access$getReactiveConfig$p(LSS;)LTq4;

    move-result-object v3

    invoke-virtual {v3}, LTq4;->f8()LZ84;

    move-result-object v3

    invoke-virtual {v3}, LZ84;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v3}, Lco/bird/android/model/wire/configs/Config;->getOperatorConfig()Lco/bird/android/model/wire/configs/OperatorConfig;

    move-result-object v3

    invoke-virtual {v3}, Lco/bird/android/model/wire/configs/OperatorConfig;->getFeatures()Lco/bird/android/model/wire/configs/OperatorFeatureConfig;

    move-result-object v3

    invoke-virtual {v3}, Lco/bird/android/model/wire/configs/OperatorFeatureConfig;->getWakeBirds()Lco/bird/android/model/wire/configs/OperatorWakeBirdsConfig;

    move-result-object v3

    invoke-virtual {v3}, Lco/bird/android/model/wire/configs/OperatorWakeBirdsConfig;->getBulkWakeMaxRetries()I

    move-result v3

    invoke-virtual {v2, v3}, LSN4$f;->g(I)LSN4$f;

    move-result-object v2

    invoke-virtual {v2}, LSN4$f;->a()Lio/reactivex/functions/o;

    move-result-object v2

    invoke-virtual {v1, v2}, Lio/reactivex/c;->V(Lio/reactivex/functions/o;)Lio/reactivex/c;

    move-result-object v17

    :cond_1
    const/4 v1, 0x2

    new-array v1, v1, [Lio/reactivex/c;

    const/4 v2, 0x0

    aput-object v18, v1, v2

    const/4 v2, 0x1

    aput-object v17, v1, v2

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOfNotNull([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v1}, Lio/reactivex/c;->r(Ljava/lang/Iterable;)Lio/reactivex/c;

    move-result-object v1

    return-object v1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/wire/WireBird;

    invoke-virtual {p0, p1}, LSS$g;->a(Lco/bird/android/model/wire/WireBird;)Lio/reactivex/h;

    move-result-object p1

    return-object p1
.end method
