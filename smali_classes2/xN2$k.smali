.class public final LxN2$k;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LxN2;->d(LEu1;LSC0;Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function2;)Lzh2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function3<",
        "LGu1<",
        "-TT;>;",
        "Ljava/lang/Throwable;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0007\u001a\u00020\u0006\"\u0004\u0008\u0000\u0010\u0000\"\u0008\u0008\u0001\u0010\u0002*\u00020\u0001*\u0008\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u008a@"
    }
    d2 = {
        "T",
        "LAN2;",
        "S",
        "LGu1;",
        "",
        "error",
        "",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.airbnb.mvrx.MavericksRepository$execute$9"
    f = "MavericksRepository.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field public h:I

.field public synthetic i:Ljava/lang/Object;

.field public final synthetic j:LxN2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LxN2<",
            "TS;>;"
        }
    .end annotation
.end field

.field public final synthetic k:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "TS;",
            "Ldp<",
            "+TT;>;TS;>;"
        }
    .end annotation
.end field

.field public final synthetic l:Lkotlin/reflect/KProperty1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/reflect/KProperty1<",
            "TS;",
            "Ldp<",
            "TT;>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LxN2;Lkotlin/jvm/functions/Function2;Lkotlin/reflect/KProperty1;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LxN2<",
            "TS;>;",
            "Lkotlin/jvm/functions/Function2<",
            "-TS;-",
            "Ldp<",
            "+TT;>;+TS;>;",
            "Lkotlin/reflect/KProperty1<",
            "TS;+",
            "Ldp<",
            "+TT;>;>;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "LxN2$k;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, LxN2$k;->j:LxN2;

    iput-object p2, p0, LxN2$k;->k:Lkotlin/jvm/functions/Function2;

    iput-object p3, p0, LxN2$k;->l:Lkotlin/reflect/KProperty1;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final e(LGu1;Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LGu1<",
            "-TT;>;",
            "Ljava/lang/Throwable;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance p1, LxN2$k;

    iget-object v0, p0, LxN2$k;->j:LxN2;

    iget-object v1, p0, LxN2$k;->k:Lkotlin/jvm/functions/Function2;

    iget-object v2, p0, LxN2$k;->l:Lkotlin/reflect/KProperty1;

    invoke-direct {p1, v0, v1, v2, p3}, LxN2$k;-><init>(LxN2;Lkotlin/jvm/functions/Function2;Lkotlin/reflect/KProperty1;Lkotlin/coroutines/Continuation;)V

    iput-object p2, p1, LxN2$k;->i:Ljava/lang/Object;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, LxN2$k;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LGu1;

    check-cast p2, Ljava/lang/Throwable;

    check-cast p3, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2, p3}, LxN2$k;->e(LGu1;Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    iget v0, p0, LxN2$k;->h:I

    if-nez v0, :cond_0

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p1, p0, LxN2$k;->i:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Throwable;

    iget-object v0, p0, LxN2$k;->j:LxN2;

    new-instance v1, LxN2$k$a;

    iget-object v2, p0, LxN2$k;->k:Lkotlin/jvm/functions/Function2;

    iget-object v3, p0, LxN2$k;->l:Lkotlin/reflect/KProperty1;

    invoke-direct {v1, v2, p1, v3}, LxN2$k$a;-><init>(Lkotlin/jvm/functions/Function2;Ljava/lang/Throwable;Lkotlin/reflect/KProperty1;)V

    invoke-virtual {v0, v1}, LxN2;->j(Lkotlin/jvm/functions/Function1;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
