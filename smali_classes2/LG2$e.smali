.class public final LLG2$e;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LLG2;->D()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LLG2$e$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/Pair<",
        "+",
        "Lco/bird/android/model/wire/configs/HeadlessScanMode;",
        "+",
        "Lco/bird/android/model/wire/configs/Config;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\u0008\u0007"
    }
    d2 = {
        "<anonymous>",
        "",
        "<name for destructuring parameter 0>",
        "Lkotlin/Pair;",
        "Lco/bird/android/model/wire/configs/HeadlessScanMode;",
        "Lco/bird/android/model/wire/configs/Config;",
        "kotlin.jvm.PlatformType",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic g:LLG2;


# direct methods
.method public constructor <init>(LLG2;)V
    .locals 0

    iput-object p1, p0, LLG2$e;->g:LLG2;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Pair;

    invoke-virtual {p0, p1}, LLG2$e;->invoke(Lkotlin/Pair;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lkotlin/Pair;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "+",
            "Lco/bird/android/model/wire/configs/HeadlessScanMode;",
            "Lco/bird/android/model/wire/configs/Config;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/wire/configs/HeadlessScanMode;

    invoke-virtual {p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/wire/configs/Config;

    new-instance v1, Llz0$a;

    invoke-direct {v1}, Llz0$a;-><init>()V

    sget-object v2, LS73;->c:LS73;

    invoke-virtual {v1, v2}, Llz0$a;->b(LS73;)Llz0$a;

    move-result-object v1

    invoke-virtual {v1}, Llz0$a;->a()Llz0;

    move-result-object v1

    sget-object v2, LLG2$e$a;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v2, v0

    const/4 v2, 0x1

    const-class v3, Lco/bird/android/app/feature/bluetooth/job/HeadlessSweepWorker;

    const-string v4, "co.bird.android.app.feature.bluetooth.job.trigger"

    const-string v5, "periodic_headless_sweep"

    if-eq v0, v2, :cond_2

    const/4 v2, 0x2

    if-eq v0, v2, :cond_1

    const/4 p1, 0x3

    if-eq v0, p1, :cond_0

    const/4 p1, 0x4

    if-eq v0, p1, :cond_0

    goto/16 :goto_0

    :cond_0
    iget-object p1, p0, LLG2$e;->g:LLG2;

    invoke-static {p1}, LLG2;->access$getWorkManager$p(LLG2;)Ldagger/Lazy;

    move-result-object p1

    invoke-interface {p1}, Ldagger/Lazy;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LZC6;

    invoke-virtual {p1, v5}, LZC6;->b(Ljava/lang/String;)LXh3;

    goto/16 :goto_0

    :cond_1
    new-instance v0, Landroidx/work/b$a;

    invoke-direct {v0}, Landroidx/work/b$a;-><init>()V

    sget-object v2, Lco/bird/api/request/BLEScanTrigger;->PERIODIC:Lco/bird/api/request/BLEScanTrigger;

    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v4, v2}, Landroidx/work/b$a;->e(Ljava/lang/String;Ljava/lang/String;)Landroidx/work/b$a;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/work/b$a;->a()Landroidx/work/b;

    move-result-object v0

    const-string v2, "Builder().putString(Extr\u2026er.PERIODIC.name).build()"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, LpQ3$a;

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/Config;->getBeaconConfig()Lco/bird/android/model/wire/configs/BeaconConfig;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/BeaconConfig;->getHeadlessScanPeriodicInterval()J

    move-result-wide v6

    sget-object p1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-direct {v2, v3, v6, v7, p1}, LpQ3$a;-><init>(Ljava/lang/Class;JLjava/util/concurrent/TimeUnit;)V

    invoke-virtual {v2, v1}, LEG6$a;->h(Llz0;)LEG6$a;

    move-result-object p1

    check-cast p1, LpQ3$a;

    invoke-virtual {p1, v0}, LEG6$a;->k(Landroidx/work/b;)LEG6$a;

    move-result-object p1

    check-cast p1, LpQ3$a;

    invoke-virtual {p1}, LEG6$a;->a()LEG6;

    move-result-object p1

    check-cast p1, LpQ3;

    iget-object v0, p0, LLG2$e;->g:LLG2;

    invoke-static {v0}, LLG2;->access$getWorkManager$p(LLG2;)Ldagger/Lazy;

    move-result-object v0

    invoke-interface {v0}, Ldagger/Lazy;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LZC6;

    sget-object v1, Lei1;->b:Lei1;

    invoke-virtual {v0, v5, v1, p1}, LZC6;->e(Ljava/lang/String;Lei1;LpQ3;)LXh3;

    goto :goto_0

    :cond_2
    new-instance p1, Landroidx/work/b$a;

    invoke-direct {p1}, Landroidx/work/b$a;-><init>()V

    sget-object v0, Lco/bird/api/request/BLEScanTrigger;->APP_LAUNCH:Lco/bird/api/request/BLEScanTrigger;

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v4, v0}, Landroidx/work/b$a;->e(Ljava/lang/String;Ljava/lang/String;)Landroidx/work/b$a;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/work/b$a;->a()Landroidx/work/b;

    move-result-object p1

    const-string v0, "Builder().putString(Extr\u2026.APP_LAUNCH.name).build()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LFh3$a;

    invoke-direct {v0, v3}, LFh3$a;-><init>(Ljava/lang/Class;)V

    invoke-virtual {v0, v1}, LEG6$a;->h(Llz0;)LEG6$a;

    move-result-object v0

    check-cast v0, LFh3$a;

    invoke-virtual {v0, p1}, LEG6$a;->k(Landroidx/work/b;)LEG6$a;

    move-result-object p1

    check-cast p1, LFh3$a;

    invoke-virtual {p1}, LEG6$a;->a()LEG6;

    move-result-object p1

    check-cast p1, LFh3;

    iget-object v0, p0, LLG2$e;->g:LLG2;

    invoke-static {v0}, LLG2;->access$getWorkManager$p(LLG2;)Ldagger/Lazy;

    move-result-object v0

    invoke-interface {v0}, Ldagger/Lazy;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LZC6;

    sget-object v1, Lfi1;->b:Lfi1;

    invoke-virtual {v0, v5, v1, p1}, LZC6;->f(Ljava/lang/String;Lfi1;LFh3;)LXh3;

    :goto_0
    return-void
.end method
