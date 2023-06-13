.class public final Ln60$x;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ln60;->L(Landroid/content/Intent;)V
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
        "Lco/bird/android/model/persistence/Bird;",
        "+",
        "Ljava/util/List<",
        "+",
        "Lco/bird/android/model/persistence/Bird;",
        ">;>;",
        "Lio/reactivex/u<",
        "+",
        "Lkotlin/Unit;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0010\u0007\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u00042\u0018\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00010\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0007\u0010\u0008"
    }
    d2 = {
        "Lkotlin/Pair;",
        "Lco/bird/android/model/persistence/Bird;",
        "",
        "<name for destructuring parameter 0>",
        "Lio/reactivex/u;",
        "",
        "kotlin.jvm.PlatformType",
        "c",
        "(Lkotlin/Pair;)Lio/reactivex/u;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Ln60;

.field public final synthetic h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ln60;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln60;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ln60$x;->g:Ln60;

    iput-object p2, p0, Ln60$x;->h:Ljava/util/List;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Ln60$x;->d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Ln60$x;->invoke$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final invoke$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final c(Lkotlin/Pair;)Lio/reactivex/u;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "Lco/bird/android/model/persistence/Bird;",
            "+",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/Bird;",
            ">;>;)",
            "Lio/reactivex/u<",
            "+",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p0

    const-string v1, "<name for destructuring parameter 0>"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/persistence/Bird;

    invoke-virtual/range {p1 .. p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    new-instance v17, LKY;

    const/4 v4, 0x0

    invoke-virtual {v1}, Lco/bird/android/model/persistence/Bird;->getId()Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    iget-object v3, v0, Ln60$x;->g:Ln60;

    invoke-static {v3}, Ln60;->access$getBluetoothSessionId$p(Ln60;)Ljava/lang/String;

    move-result-object v9

    iget-object v3, v0, Ln60$x;->g:Ln60;

    invoke-static {v3}, Ln60;->access$getBulkAttemptId$p(Ln60;)Ljava/lang/String;

    move-result-object v10

    sget-object v3, LbH;->c:LbH;

    invoke-virtual {v3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v11

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v15, 0x61d

    const/16 v16, 0x0

    move-object/from16 v3, v17

    invoke-direct/range {v3 .. v16}, LKY;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object v2, v0, Ln60$x;->g:Ln60;

    invoke-static {v2}, Ln60;->access$getRxBleBirdBluetoothManager$p(Ln60;)Lrd5;

    move-result-object v3

    const-string v2, "bird"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, LBT;->g(Lco/bird/android/model/persistence/Bird;)Lco/bird/android/model/VehicleDescriptor;

    move-result-object v4

    const/4 v5, 0x0

    const/16 v8, 0x8

    const/4 v9, 0x0

    move-object/from16 v6, v17

    invoke-static/range {v3 .. v9}, Lrd5$a;->deepSleep$default(Lrd5;Lco/bird/android/model/VehicleDescriptor;ZLKY;LbE5;ILjava/lang/Object;)Lio/reactivex/c;

    move-result-object v2

    const-wide/16 v3, 0x2

    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {v3, v4, v5}, LSN4;->i(JLjava/util/concurrent/TimeUnit;)LSN4$f;

    move-result-object v3

    iget-object v4, v0, Ln60$x;->g:Ln60;

    invoke-static {v4}, Ln60;->access$getReactiveConfig$p(Ln60;)LTq4;

    move-result-object v4

    invoke-virtual {v4}, LTq4;->f8()LZ84;

    move-result-object v4

    invoke-virtual {v4}, LZ84;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v4}, Lco/bird/android/model/wire/configs/Config;->getOperatorConfig()Lco/bird/android/model/wire/configs/OperatorConfig;

    move-result-object v4

    invoke-virtual {v4}, Lco/bird/android/model/wire/configs/OperatorConfig;->getFeatures()Lco/bird/android/model/wire/configs/OperatorFeatureConfig;

    move-result-object v4

    invoke-virtual {v4}, Lco/bird/android/model/wire/configs/OperatorFeatureConfig;->getWakeBirds()Lco/bird/android/model/wire/configs/OperatorWakeBirdsConfig;

    move-result-object v4

    invoke-virtual {v4}, Lco/bird/android/model/wire/configs/OperatorWakeBirdsConfig;->getBulkWakeMaxRetries()I

    move-result v4

    invoke-virtual {v3, v4}, LSN4$f;->g(I)LSN4$f;

    move-result-object v3

    invoke-virtual {v3}, LSN4$f;->a()Lio/reactivex/functions/o;

    move-result-object v3

    invoke-virtual {v2, v3}, Lio/reactivex/c;->V(Lio/reactivex/functions/o;)Lio/reactivex/c;

    move-result-object v2

    sget-object v3, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-static {v3}, Lio/reactivex/p;->G(Ljava/lang/Object;)Lio/reactivex/p;

    move-result-object v3

    invoke-virtual {v2, v3}, Lio/reactivex/c;->k(Lio/reactivex/u;)Lio/reactivex/p;

    move-result-object v2

    new-instance v3, Ln60$x$a;

    iget-object v4, v0, Ln60$x;->g:Ln60;

    invoke-direct {v3, v4}, Ln60$x$a;-><init>(Ln60;)V

    new-instance v4, LF60;

    invoke-direct {v4, v3}, LF60;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v2, v4}, Lio/reactivex/p;->s(Lio/reactivex/functions/g;)Lio/reactivex/p;

    move-result-object v2

    new-instance v3, Ln60$x$b;

    iget-object v4, v0, Ln60$x;->g:Ln60;

    iget-object v5, v0, Ln60$x;->h:Ljava/util/List;

    invoke-direct {v3, v4, v5, v1}, Ln60$x$b;-><init>(Ln60;Ljava/util/List;Lco/bird/android/model/persistence/Bird;)V

    new-instance v1, LG60;

    invoke-direct {v1, v3}, LG60;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v2, v1}, Lio/reactivex/p;->p(Lio/reactivex/functions/g;)Lio/reactivex/p;

    move-result-object v1

    invoke-static {}, Lio/reactivex/p;->u()Lio/reactivex/p;

    move-result-object v2

    invoke-virtual {v1, v2}, Lio/reactivex/p;->L(Lio/reactivex/u;)Lio/reactivex/p;

    move-result-object v1

    return-object v1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Pair;

    invoke-virtual {p0, p1}, Ln60$x;->c(Lkotlin/Pair;)Lio/reactivex/u;

    move-result-object p1

    return-object p1
.end method
