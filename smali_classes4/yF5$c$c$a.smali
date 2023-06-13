.class public final LyF5$c$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LGu1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LyF5$c$c;->collect(LGu1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "LGu1;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\u0008\u0000\u0010\u0000\"\u0004\u0008\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "T",
        "R",
        "value",
        "",
        "emit",
        "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "<anonymous>"
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
        "SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 SmartlockSolebeDeviceManager.kt\nco/bird/android/smartlock/impl/SmartLockSolebeDeviceManager$SmartlockSolebeGattCallback\n*L\n1#1,222:1\n48#2:223\n266#3,17:224\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic b:LGu1;

.field public final synthetic c:LyF5;


# direct methods
.method public constructor <init>(LGu1;LyF5;)V
    .locals 0

    iput-object p1, p0, LyF5$c$c$a;->b:LGu1;

    iput-object p2, p0, LyF5$c$c$a;->c:LyF5;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 10

    instance-of v0, p2, LyF5$c$c$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, LyF5$c$c$a$a;

    iget v1, v0, LyF5$c$c$a$a;->i:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LyF5$c$c$a$a;->i:I

    goto :goto_0

    :cond_0
    new-instance v0, LyF5$c$c$a$a;

    invoke-direct {v0, p0, p2}, LyF5$c$c$a$a;-><init>(LyF5$c$c$a;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, v0, LyF5$c$c$a$a;->h:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LyF5$c$c$a$a;->i:I

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, LyF5$c$c$a$a;->j:Ljava/lang/Object;

    check-cast p1, LGu1;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p2, p0, LyF5$c$c$a;->b:LGu1;

    check-cast p1, Lco/bird/android/smartlock/impl/SmartlockSolebeNotificationResponse;

    invoke-virtual {p1}, Lco/bird/android/smartlock/impl/SmartlockSolebeNotificationResponse;->e()[B

    move-result-object v2

    if-eqz v2, :cond_4

    invoke-static {v2}, LtF5;->k([B)Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    :cond_4
    move-object v2, v3

    :goto_1
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "smartlock solebe response: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v6, 0x0

    new-array v6, v6, [Ljava/lang/Object;

    invoke-static {v2, v6}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v2, p0, LyF5$c$c$a;->c:LyF5;

    invoke-static {v2}, LyF5;->access$getSmartLockClient$p(LyF5;)LhI5;

    move-result-object v2

    new-instance v6, Lco/bird/api/request/NokelockMessage;

    iget-object v7, p0, LyF5$c$c$a;->c:LyF5;

    invoke-static {v7}, LyF5;->access$getSmartLock$p(LyF5;)LsE5;

    move-result-object v7

    invoke-virtual {v7}, LsE5;->d()Ljava/lang/String;

    move-result-object v7

    iget-object v8, p0, LyF5$c$c$a;->c:LyF5;

    invoke-virtual {p1}, Lco/bird/android/smartlock/impl/SmartlockSolebeNotificationResponse;->e()[B

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {v8, p1}, LyF5;->access$decode(LyF5;[B)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v6, v7, p1}, Lco/bird/api/request/NokelockMessage;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v2, v6}, LhI5;->e(Lco/bird/api/request/NokelockMessage;)Lio/reactivex/F;

    move-result-object p1

    sget-object v2, LyF5$c$d;->g:LyF5$c$d;

    new-instance v6, LDK5$a;

    invoke-direct {v6, v2}, LDK5$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v6}, Lio/reactivex/F;->P(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object p1

    const-string v2, "smartLockClient.handleNo\u2026          }\n            }"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, v0, LyF5$c$c$a$a;->j:Ljava/lang/Object;

    iput v5, v0, LyF5$c$c$a$a;->i:I

    invoke-static {p1, v0}, Lmd5;->a(Lio/reactivex/K;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    return-object v1

    :cond_5
    move-object v9, p2

    move-object p2, p1

    move-object p1, v9

    :goto_2
    iput-object v3, v0, LyF5$c$c$a$a;->j:Ljava/lang/Object;

    iput v4, v0, LyF5$c$c$a$a;->i:I

    invoke-interface {p1, p2, v0}, LGu1;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    return-object v1

    :cond_6
    :goto_3
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
