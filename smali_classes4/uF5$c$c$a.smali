.class public final LuF5$c$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LGu1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LuF5$c$c;->collect(LGu1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
        "SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 SmartlockNokeDeviceManager.kt\nco/bird/android/smartlock/impl/SmartLockNokeDeviceManager$SmartlockNokeGattCallback\n*L\n1#1,222:1\n48#2:223\n259#3,6:224\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic b:LGu1;

.field public final synthetic c:LuF5;


# direct methods
.method public constructor <init>(LGu1;LuF5;)V
    .locals 0

    iput-object p1, p0, LuF5$c$c$a;->b:LGu1;

    iput-object p2, p0, LuF5$c$c$a;->c:LuF5;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 9

    instance-of v0, p2, LuF5$c$c$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, LuF5$c$c$a$a;

    iget v1, v0, LuF5$c$c$a$a;->i:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LuF5$c$c$a$a;->i:I

    goto :goto_0

    :cond_0
    new-instance v0, LuF5$c$c$a$a;

    invoke-direct {v0, p0, p2}, LuF5$c$c$a$a;-><init>(LuF5$c$c$a;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, v0, LuF5$c$c$a$a;->h:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LuF5$c$c$a$a;->i:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, LuF5$c$c$a$a;->j:Ljava/lang/Object;

    check-cast p1, LGu1;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p2, p0, LuF5$c$c$a;->b:LGu1;

    check-cast p1, Lco/bird/android/smartlock/impl/SmartlockNokeNotificationResponse;

    iget-object v2, p0, LuF5$c$c$a;->c:LuF5;

    invoke-static {v2}, LuF5;->access$getSmartLockClient$p(LuF5;)LhI5;

    move-result-object v2

    new-instance v5, Lco/bird/api/request/NokelockMessage;

    iget-object v6, p0, LuF5$c$c$a;->c:LuF5;

    invoke-static {v6}, LuF5;->access$getSmartLock$p(LuF5;)LsE5;

    move-result-object v6

    invoke-virtual {v6}, LsE5;->d()Ljava/lang/String;

    move-result-object v6

    iget-object v7, p0, LuF5$c$c$a;->c:LuF5;

    invoke-virtual {p1}, Lco/bird/android/smartlock/impl/SmartlockNokeNotificationResponse;->e()[B

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {v7, p1}, LuF5;->access$decode(LuF5;[B)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v5, v6, p1}, Lco/bird/api/request/NokelockMessage;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v2, v5}, LhI5;->e(Lco/bird/api/request/NokelockMessage;)Lio/reactivex/F;

    move-result-object p1

    iput-object p2, v0, LuF5$c$c$a$a;->j:Ljava/lang/Object;

    iput v4, v0, LuF5$c$c$a$a;->i:I

    invoke-static {p1, v0}, Lmd5;->a(Lio/reactivex/K;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    return-object v1

    :cond_4
    move-object v8, p2

    move-object p2, p1

    move-object p1, v8

    :goto_1
    const/4 v2, 0x0

    iput-object v2, v0, LuF5$c$c$a$a;->j:Ljava/lang/Object;

    iput v3, v0, LuF5$c$c$a$a;->i:I

    invoke-interface {p1, p2, v0}, LGu1;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    return-object v1

    :cond_5
    :goto_2
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
