.class public final LAo0$a$d;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LAo0$a;->c(Ljava/lang/String;)Lio/reactivex/h;
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
        "Lco/bird/android/model/VehicleCommand;",
        ">;",
        "Lio/reactivex/h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0008\u001a\n \u0002*\u0004\u0018\u00010\u00050\u00052\u001a\u0010\u0004\u001a\u0016\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0004\u0012\u00020\u00030\u0000H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "Lkotlin/Pair;",
        "Lco/bird/android/model/persistence/Bird;",
        "kotlin.jvm.PlatformType",
        "Lco/bird/android/model/VehicleCommand;",
        "<name for destructuring parameter 0>",
        "Lio/reactivex/h;",
        "invoke",
        "(Lkotlin/Pair;)Lio/reactivex/h;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LAo0;


# direct methods
.method public constructor <init>(LAo0;)V
    .locals 0

    iput-object p1, p0, LAo0$a$d;->g:LAo0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(LAo0;Lco/bird/android/model/VehicleCommand;)V
    .locals 0

    invoke-static {p0, p1}, LAo0$a$d;->i(LAo0;Lco/bird/android/model/VehicleCommand;)V

    return-void
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 0

    invoke-static {p0, p1}, LAo0$a$d;->h(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LAo0$a$d;->j(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic d(LAo0;Lco/bird/android/model/VehicleCommand;)V
    .locals 0

    invoke-static {p0, p1}, LAo0$a$d;->g(LAo0;Lco/bird/android/model/VehicleCommand;)V

    return-void
.end method

.method public static synthetic e(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 0

    invoke-static {p0, p1}, LAo0$a$d;->invoke$lambda$1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(LAo0;Lco/bird/android/model/persistence/Bird;)Lio/reactivex/h;
    .locals 0

    invoke-static {p0, p1}, LAo0$a$d;->k(LAo0;Lco/bird/android/model/persistence/Bird;)Lio/reactivex/h;

    move-result-object p0

    return-object p0
.end method

.method public static final g(LAo0;Lco/bird/android/model/VehicleCommand;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$command"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LAo0;->access$getUi$p(LAo0;)Llp0;

    move-result-object p0

    invoke-interface {p0, p1}, Llp0;->Jd(Lco/bird/android/model/VehicleCommand;)V

    return-void
.end method

.method public static final h(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/h;

    return-object p0
.end method

.method public static final i(LAo0;Lco/bird/android/model/VehicleCommand;)V
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$command"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LAo0;->access$getUi$p(LAo0;)Llp0;

    move-result-object v0

    invoke-interface {v0, p1}, Llp0;->Jd(Lco/bird/android/model/VehicleCommand;)V

    invoke-static {p0}, LAo0;->access$getUi$p(LAo0;)Llp0;

    move-result-object v0

    invoke-interface {v0, p1}, Llp0;->v9(Lco/bird/android/model/VehicleCommand;)V

    invoke-static {p0}, LAo0;->access$getUi$p(LAo0;)Llp0;

    move-result-object p0

    const-wide/16 v0, 0xfa

    invoke-interface {p0, v0, v1}, LLo6;->vibrate(J)V

    return-void
.end method

.method public static final invoke$lambda$1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/h;

    return-object p0
.end method

.method public static final j(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final k(LAo0;Lco/bird/android/model/persistence/Bird;)Lio/reactivex/h;
    .locals 9

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LAo0;->access$getCommandManager$p(LAo0;)LTo0;

    move-result-object v1

    const-string p0, "bird"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x6

    const/4 v8, 0x0

    move-object v2, p1

    invoke-static/range {v1 .. v8}, LTo0$a;->refreshBirdAckLockStatus$default(LTo0;Lco/bird/android/model/persistence/Bird;JJILjava/lang/Object;)Lio/reactivex/c;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final invoke(Lkotlin/Pair;)Lio/reactivex/h;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "Lco/bird/android/model/persistence/Bird;",
            "+",
            "Lco/bird/android/model/VehicleCommand;",
            ">;)",
            "Lio/reactivex/h;"
        }
    .end annotation

    const-string v0, "<name for destructuring parameter 0>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/persistence/Bird;

    invoke-virtual {p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/VehicleCommand;

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "randomUUID().toString()"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v2, p1, Lco/bird/android/model/LockCommand;

    const/4 v3, 0x1

    const/4 v4, 0x0

    const-string v5, "bird"

    if-eqz v2, :cond_0

    iget-object v1, p0, LAo0$a$d;->g:LAo0;

    invoke-static {v1}, LAo0;->access$getCommandManager$p(LAo0;)LTo0;

    move-result-object v1

    invoke-static {v0, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/model/VehicleCommand;->getMethod()Lco/bird/android/model/CommandMethod;

    move-result-object v5

    invoke-static {v5}, Lco/bird/android/model/VehicleCommandKt;->isBluetooth(Lco/bird/android/model/CommandMethod;)Z

    move-result v5

    invoke-interface {v1, v0, v3, v5}, LTo0;->a(Lco/bird/android/model/persistence/Bird;ZZ)Lio/reactivex/c;

    move-result-object v1

    goto/16 :goto_2

    :cond_0
    instance-of v6, p1, Lco/bird/android/model/UnlockCommand;

    if-eqz v6, :cond_1

    iget-object v1, p0, LAo0$a$d;->g:LAo0;

    invoke-static {v1}, LAo0;->access$getCommandManager$p(LAo0;)LTo0;

    move-result-object v1

    invoke-static {v0, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/model/VehicleCommand;->getMethod()Lco/bird/android/model/CommandMethod;

    move-result-object v3

    invoke-static {v3}, Lco/bird/android/model/VehicleCommandKt;->isBluetooth(Lco/bird/android/model/CommandMethod;)Z

    move-result v3

    invoke-interface {v1, v0, v4, v3}, LTo0;->a(Lco/bird/android/model/persistence/Bird;ZZ)Lio/reactivex/c;

    move-result-object v1

    goto/16 :goto_2

    :cond_1
    instance-of v6, p1, Lco/bird/android/model/UnlockBatteryCommand;

    if-eqz v6, :cond_2

    iget-object v1, p0, LAo0$a$d;->g:LAo0;

    invoke-static {v1}, LAo0;->access$getCommandManager$p(LAo0;)LTo0;

    move-result-object v1

    invoke-static {v0, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/model/VehicleCommand;->getMethod()Lco/bird/android/model/CommandMethod;

    move-result-object v3

    invoke-static {v3}, Lco/bird/android/model/VehicleCommandKt;->isBluetooth(Lco/bird/android/model/CommandMethod;)Z

    move-result v3

    invoke-interface {v1, v0, v3}, LTo0;->k(Lco/bird/android/model/persistence/Bird;Z)Lio/reactivex/c;

    move-result-object v1

    goto/16 :goto_2

    :cond_2
    instance-of v6, p1, Lco/bird/android/model/UnlockCableCommand;

    if-eqz v6, :cond_3

    iget-object v1, p0, LAo0$a$d;->g:LAo0;

    invoke-static {v1}, LAo0;->access$getCommandManager$p(LAo0;)LTo0;

    move-result-object v1

    invoke-static {v0, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/model/VehicleCommand;->getMethod()Lco/bird/android/model/CommandMethod;

    move-result-object v3

    invoke-static {v3}, Lco/bird/android/model/VehicleCommandKt;->isBluetooth(Lco/bird/android/model/CommandMethod;)Z

    move-result v3

    invoke-interface {v1, v0, v3}, LTo0;->c(Lco/bird/android/model/persistence/Bird;Z)Lio/reactivex/c;

    move-result-object v1

    goto/16 :goto_2

    :cond_3
    instance-of v6, p1, Lco/bird/android/model/UnlockHelmetCommand;

    if-eqz v6, :cond_4

    iget-object v1, p0, LAo0$a$d;->g:LAo0;

    invoke-static {v1}, LAo0;->access$getCommandManager$p(LAo0;)LTo0;

    move-result-object v1

    invoke-static {v0, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/model/VehicleCommand;->getMethod()Lco/bird/android/model/CommandMethod;

    move-result-object v3

    invoke-static {v3}, Lco/bird/android/model/VehicleCommandKt;->isBluetooth(Lco/bird/android/model/CommandMethod;)Z

    move-result v3

    invoke-interface {v1, v0, v3}, LTo0;->g(Lco/bird/android/model/persistence/Bird;Z)Lio/reactivex/c;

    move-result-object v1

    goto/16 :goto_2

    :cond_4
    instance-of v6, p1, Lco/bird/android/model/AlarmCommand;

    const-string v7, "@CallSuper\n  override fu\u2026r)\n      .subscribe()\n  }"

    if-eqz v6, :cond_7

    move-object v1, p1

    check-cast v1, Lco/bird/android/model/AlarmCommand;

    invoke-virtual {v1}, Lco/bird/android/model/AlarmCommand;->getOptions()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_5

    move-object v6, v1

    check-cast v6, Ljava/util/Collection;

    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    move-result v6

    xor-int/2addr v6, v3

    if-ne v6, v3, :cond_5

    goto :goto_0

    :cond_5
    move v3, v4

    :goto_0
    if-eqz v3, :cond_6

    iget-object v3, p0, LAo0$a$d;->g:LAo0;

    invoke-static {v3}, LAo0;->access$getUi$p(LAo0;)Llp0;

    move-result-object v3

    invoke-interface {v3, v1}, Llp0;->Sa(Ljava/util/List;)Lio/reactivex/p;

    move-result-object v1

    iget-object v3, p0, LAo0$a$d;->g:LAo0;

    new-instance v5, LCo0;

    invoke-direct {v5, v3, p1}, LCo0;-><init>(LAo0;Lco/bird/android/model/VehicleCommand;)V

    invoke-virtual {v1, v5}, Lio/reactivex/p;->n(Lio/reactivex/functions/a;)Lio/reactivex/p;

    move-result-object v1

    new-instance v3, LAo0$a$d$a;

    iget-object v5, p0, LAo0$a$d;->g:LAo0;

    invoke-direct {v3, v5, v0}, LAo0$a$d$a;-><init>(LAo0;Lco/bird/android/model/persistence/Bird;)V

    new-instance v5, LDo0;

    invoke-direct {v5, v3}, LDo0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v1, v5}, Lio/reactivex/p;->A(Lio/reactivex/functions/o;)Lio/reactivex/c;

    move-result-object v1

    goto :goto_1

    :cond_6
    iget-object v1, p0, LAo0$a$d;->g:LAo0;

    invoke-static {v1}, LAo0;->access$getCommandManager$p(LAo0;)LTo0;

    move-result-object v1

    invoke-static {v0, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/model/VehicleCommand;->getMethod()Lco/bird/android/model/CommandMethod;

    move-result-object v3

    invoke-static {v3}, Lco/bird/android/model/VehicleCommandKt;->isBluetooth(Lco/bird/android/model/CommandMethod;)Z

    move-result v3

    invoke-interface {v1, v0, v3}, LTo0;->b(Lco/bird/android/model/persistence/Bird;Z)Lio/reactivex/c;

    move-result-object v1

    :goto_1
    invoke-static {v1, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_2

    :cond_7
    instance-of v3, p1, Lco/bird/android/model/SleepCommand;

    if-eqz v3, :cond_8

    iget-object v3, p0, LAo0$a$d;->g:LAo0;

    invoke-static {v3}, LAo0;->access$getUi$p(LAo0;)Llp0;

    move-result-object v8

    sget-object v9, LYD5;->d:LYD5;

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x6

    const/4 v13, 0x0

    invoke-static/range {v8 .. v13}, LH31$a;->dialog$default(LH31;LNy;ZZILjava/lang/Object;)Lio/reactivex/F;

    move-result-object v3

    new-instance v5, LAo0$a$d$b;

    iget-object v6, p0, LAo0$a$d;->g:LAo0;

    invoke-direct {v5, v6, v0, p1, v1}, LAo0$a$d$b;-><init>(LAo0;Lco/bird/android/model/persistence/Bird;Lco/bird/android/model/VehicleCommand;Ljava/lang/String;)V

    new-instance v1, LEo0;

    invoke-direct {v1, v5}, LEo0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v3, v1}, Lio/reactivex/F;->B(Lio/reactivex/functions/o;)Lio/reactivex/c;

    move-result-object v1

    invoke-static {v1, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_2

    :cond_8
    instance-of v3, p1, Lco/bird/android/model/WakeCommand;

    if-eqz v3, :cond_9

    iget-object v3, p0, LAo0$a$d;->g:LAo0;

    invoke-static {v3}, LAo0;->access$getCommandManager$p(LAo0;)LTo0;

    move-result-object v3

    invoke-static {v0, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/model/VehicleCommand;->getMethod()Lco/bird/android/model/CommandMethod;

    move-result-object v5

    invoke-static {v5}, Lco/bird/android/model/VehicleCommandKt;->isBluetooth(Lco/bird/android/model/CommandMethod;)Z

    move-result v5

    invoke-interface {v3, v0, v4, v5, v1}, LTo0;->e(Lco/bird/android/model/persistence/Bird;ZZLjava/lang/String;)Lio/reactivex/c;

    move-result-object v1

    goto :goto_2

    :cond_9
    instance-of v1, p1, Lco/bird/android/model/LightsCommand;

    if-eqz v1, :cond_a

    iget-object v1, p0, LAo0$a$d;->g:LAo0;

    invoke-static {v1}, LAo0;->access$getCommandManager$p(LAo0;)LTo0;

    move-result-object v1

    invoke-static {v0, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v1, v0}, LTo0;->j(Lco/bird/android/model/persistence/Bird;)Lio/reactivex/c;

    move-result-object v1

    goto :goto_2

    :cond_a
    instance-of v1, p1, Lco/bird/android/model/SoftResetCommand;

    if-eqz v1, :cond_b

    iget-object v1, p0, LAo0$a$d;->g:LAo0;

    invoke-static {v1}, LAo0;->access$getCommandManager$p(LAo0;)LTo0;

    move-result-object v1

    invoke-static {v0, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v1, v0}, LTo0;->h(Lco/bird/android/model/persistence/Bird;)Lio/reactivex/c;

    move-result-object v1

    goto :goto_2

    :cond_b
    invoke-static {}, Lio/reactivex/c;->p()Lio/reactivex/c;

    move-result-object v1

    const-string v3, "complete()"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_2
    iget-object v3, p0, LAo0$a$d;->g:LAo0;

    invoke-static {v3}, LAo0;->access$getUi$p(LAo0;)Llp0;

    move-result-object v3

    const/4 v5, 0x2

    const/4 v6, 0x0

    invoke-static {v1, v3, v4, v5, v6}, LsD;->progress$default(Lio/reactivex/c;LS74;IILjava/lang/Object;)Lio/reactivex/c;

    move-result-object v1

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v3

    invoke-virtual {v1, v3}, Lio/reactivex/c;->P(Lio/reactivex/E;)Lio/reactivex/c;

    move-result-object v1

    iget-object v3, p0, LAo0$a$d;->g:LAo0;

    new-instance v4, LFo0;

    invoke-direct {v4, v3, p1}, LFo0;-><init>(LAo0;Lco/bird/android/model/VehicleCommand;)V

    invoke-virtual {v1, v4}, Lio/reactivex/c;->z(Lio/reactivex/functions/a;)Lio/reactivex/c;

    move-result-object v1

    const-wide/16 v3, 0x2

    invoke-virtual {v1, v3, v4}, Lio/reactivex/c;->U(J)Lio/reactivex/c;

    move-result-object v1

    new-instance v3, LAo0$a$d$c;

    iget-object v4, p0, LAo0$a$d;->g:LAo0;

    invoke-direct {v3, v4, p1}, LAo0$a$d$c;-><init>(LAo0;Lco/bird/android/model/VehicleCommand;)V

    new-instance v4, LGo0;

    invoke-direct {v4, v3}, LGo0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v1, v4}, Lio/reactivex/c;->B(Lio/reactivex/functions/g;)Lio/reactivex/c;

    move-result-object v1

    if-nez v2, :cond_d

    instance-of p1, p1, Lco/bird/android/model/UnlockCommand;

    if-eqz p1, :cond_c

    goto :goto_3

    :cond_c
    invoke-static {}, Lio/reactivex/c;->p()Lio/reactivex/c;

    move-result-object p1

    goto :goto_4

    :cond_d
    :goto_3
    iget-object p1, p0, LAo0$a$d;->g:LAo0;

    new-instance v2, LHo0;

    invoke-direct {v2, p1, v0}, LHo0;-><init>(LAo0;Lco/bird/android/model/persistence/Bird;)V

    invoke-static {v2}, Lio/reactivex/c;->t(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object p1

    :goto_4
    invoke-virtual {v1, p1}, Lio/reactivex/c;->i(Lio/reactivex/h;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Pair;

    invoke-virtual {p0, p1}, LAo0$a$d;->invoke(Lkotlin/Pair;)Lio/reactivex/h;

    move-result-object p1

    return-object p1
.end method
