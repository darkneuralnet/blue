.class public final LK56;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a3\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u001b\u0008\u0002\u0010\u0008\u001a\u0015\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004\u00a2\u0006\u0002\u0008\u0007\u00a8\u0006\u000b"
    }
    d2 = {
        "Landroid/content/Context;",
        "context",
        "",
        "text",
        "Lkotlin/Function1;",
        "Lcom/skydoves/balloon/Balloon$a;",
        "",
        "Lkotlin/ExtensionFunctionType;",
        "additionalConfig",
        "Lcom/skydoves/balloon/Balloon;",
        "a",
        "app_birdRelease"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nTooltip+.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tooltip+.kt\nco/bird/android/utility/misc/Tooltip_Kt\n+ 2 Balloon.kt\ncom/skydoves/balloon/BalloonKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,39:1\n133#2:40\n1#3:41\n*S KotlinDebug\n*F\n+ 1 Tooltip+.kt\nco/bird/android/utility/misc/Tooltip_Kt\n*L\n24#1:40\n*E\n"
    }
.end annotation


# direct methods
.method public static final a(Landroid/content/Context;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lcom/skydoves/balloon/Balloon;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/skydoves/balloon/Balloon$a;",
            "Lkotlin/Unit;",
            ">;)",
            "Lcom/skydoves/balloon/Balloon;"
        }
    .end annotation

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/skydoves/balloon/Balloon$a;

    invoke-direct {v0, p0}, Lcom/skydoves/balloon/Balloon$a;-><init>(Landroid/content/Context;)V

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Lcom/skydoves/balloon/Balloon$a;->U0(I)Lcom/skydoves/balloon/Balloon$a;

    sget-object v1, LDo;->c:LDo;

    invoke-virtual {v0, v1}, Lcom/skydoves/balloon/Balloon$a;->R0(LDo;)Lcom/skydoves/balloon/Balloon$a;

    sget-object v1, LFo;->c:LFo;

    invoke-virtual {v0, v1}, Lcom/skydoves/balloon/Balloon$a;->T0(LFo;)Lcom/skydoves/balloon/Balloon$a;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/skydoves/balloon/Balloon$a;->c1(I)Lcom/skydoves/balloon/Balloon$a;

    const/high16 v1, 0x3f000000    # 0.5f

    invoke-virtual {v0, v1}, Lcom/skydoves/balloon/Balloon$a;->S0(F)Lcom/skydoves/balloon/Balloon$a;

    const/high16 v1, 0x40800000    # 4.0f

    invoke-virtual {v0, v1}, Lcom/skydoves/balloon/Balloon$a;->Y0(F)Lcom/skydoves/balloon/Balloon$a;

    const/high16 v1, 0x41600000    # 14.0f

    invoke-virtual {v0, v1}, Lcom/skydoves/balloon/Balloon$a;->j1(F)Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v0, p1}, Lcom/skydoves/balloon/Balloon$a;->h1(Ljava/lang/CharSequence;)Lcom/skydoves/balloon/Balloon$a;

    sget p1, LDf4;->birdWhite:I

    invoke-virtual {v0, p1}, Lcom/skydoves/balloon/Balloon$a;->i1(I)Lcom/skydoves/balloon/Balloon$a;

    sget p1, LDf4;->birdNewRoad:I

    invoke-virtual {v0, p1}, Lcom/skydoves/balloon/Balloon$a;->W0(I)Lcom/skydoves/balloon/Balloon$a;

    sget-object p1, LVw;->d:LVw;

    invoke-virtual {v0, p1}, Lcom/skydoves/balloon/Balloon$a;->X0(LVw;)Lcom/skydoves/balloon/Balloon$a;

    instance-of p1, p0, LLifecycleOwner;

    if-eqz p1, :cond_0

    check-cast p0, LLifecycleOwner;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    invoke-virtual {v0, p0}, Lcom/skydoves/balloon/Balloon$a;->a1(LLifecycleOwner;)Lcom/skydoves/balloon/Balloon$a;

    if-eqz p2, :cond_1

    invoke-interface {p2, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    invoke-virtual {v0}, Lcom/skydoves/balloon/Balloon$a;->a()Lcom/skydoves/balloon/Balloon;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic createBirdTooltip$default(Landroid/content/Context;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lcom/skydoves/balloon/Balloon;
    .locals 0

    and-int/lit8 p3, p3, 0x4

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-static {p0, p1, p2}, LK56;->a(Landroid/content/Context;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lcom/skydoves/balloon/Balloon;

    move-result-object p0

    return-object p0
.end method
