.class public final LFe6;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LFe6$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u000e\u0008\u0000\u0018\u0000 \"2\u00020\u0001:\u0001\u000eB\u0007\u00a2\u0006\u0004\u0008 \u0010!JO\u0010\u000b\u001a\u00020\u00072!\u0010\u0008\u001a\u001d\u0012\u0013\u0012\u00110\u0003\u00a2\u0006\u000c\u0008\u0004\u0012\u0008\u0008\u0005\u0012\u0004\u0008\u0008(\u0006\u0012\u0004\u0012\u00020\u00070\u00022\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00070\tH\u0086@\u00f8\u0001\u0000\u0082\u0002\u0008\n\u0006\u0008\u0001\u0012\u0002\u0010\u0001\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\"\u0010\u001f\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u001c\"\u0004\u0008\u001d\u0010\u001e\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006#"
    }
    d2 = {
        "LFe6;",
        "",
        "Lkotlin/Function1;",
        "",
        "Lkotlin/ParameterName;",
        "name",
        "valueDelta",
        "",
        "beforeFrame",
        "Lkotlin/Function0;",
        "afterFrame",
        "h",
        "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "",
        "a",
        "J",
        "lastFrameTime",
        "Lsf;",
        "b",
        "Lsf;",
        "lastVelocity",
        "",
        "c",
        "Z",
        "isRunning",
        "d",
        "F",
        "i",
        "()F",
        "j",
        "(F)V",
        "value",
        "<init>",
        "()V",
        "e",
        "foundation_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final e:LFe6$a;

.field public static final f:Lsf;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final g:Lvk6;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lvk6<",
            "Lsf;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# instance fields
.field public a:J

.field public b:Lsf;

.field public c:Z

.field public d:F


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, LFe6$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LFe6$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LFe6;->e:LFe6$a;

    new-instance v0, Lsf;

    const/4 v2, 0x0

    invoke-direct {v0, v2}, Lsf;-><init>(F)V

    sput-object v0, LFe6;->f:Lsf;

    const/4 v0, 0x7

    invoke-static {v2, v2, v1, v0, v1}, Lmf;->i(FFLjava/lang/Object;ILjava/lang/Object;)LjO5;

    move-result-object v0

    sget-object v1, Lkotlin/jvm/internal/FloatCompanionObject;->INSTANCE:Lkotlin/jvm/internal/FloatCompanionObject;

    invoke-static {v1}, LXj6;->i(Lkotlin/jvm/internal/FloatCompanionObject;)Lwb6;

    move-result-object v1

    invoke-virtual {v0, v1}, LjO5;->i(Lwb6;)Lvk6;

    move-result-object v0

    sput-object v0, LFe6;->g:Lvk6;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/high16 v0, -0x8000000000000000L

    iput-wide v0, p0, LFe6;->a:J

    sget-object v0, LFe6;->f:Lsf;

    iput-object v0, p0, LFe6;->b:Lsf;

    return-void
.end method

.method public static final synthetic a()LFe6$a;
    .locals 1

    sget-object v0, LFe6;->e:LFe6$a;

    return-object v0
.end method

.method public static final synthetic b(LFe6;)J
    .locals 2

    iget-wide v0, p0, LFe6;->a:J

    return-wide v0
.end method

.method public static final synthetic c(LFe6;)Lsf;
    .locals 0

    iget-object p0, p0, LFe6;->b:Lsf;

    return-object p0
.end method

.method public static final synthetic d()Lvk6;
    .locals 1

    sget-object v0, LFe6;->g:Lvk6;

    return-object v0
.end method

.method public static final synthetic e()Lsf;
    .locals 1

    sget-object v0, LFe6;->f:Lsf;

    return-object v0
.end method

.method public static final synthetic f(LFe6;J)V
    .locals 0

    iput-wide p1, p0, LFe6;->a:J

    return-void
.end method

.method public static final synthetic g(LFe6;Lsf;)V
    .locals 0

    iput-object p1, p0, LFe6;->b:Lsf;

    return-void
.end method


# virtual methods
.method public final h(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Float;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, LFe6$b;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, LFe6$b;

    iget v1, v0, LFe6$b;->n:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LFe6$b;->n:I

    goto :goto_0

    :cond_0
    new-instance v0, LFe6$b;

    invoke-direct {v0, p0, p3}, LFe6$b;-><init>(LFe6;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p3, v0, LFe6$b;->l:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LFe6$b;->n:I

    const/4 v3, 0x0

    const-wide/high16 v4, -0x8000000000000000L

    const/4 v6, 0x2

    const/4 v7, 0x0

    const/4 v8, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v8, :cond_2

    if-ne v2, v6, :cond_1

    iget-object p1, v0, LFe6$b;->i:Ljava/lang/Object;

    check-cast p1, Lkotlin/jvm/functions/Function0;

    iget-object p2, v0, LFe6$b;->h:Ljava/lang/Object;

    check-cast p2, LFe6;

    :try_start_0
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_6

    :catchall_0
    move-exception p1

    goto/16 :goto_7

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget p1, v0, LFe6$b;->k:F

    iget-object p2, v0, LFe6$b;->j:Ljava/lang/Object;

    check-cast p2, Lkotlin/jvm/functions/Function0;

    iget-object v2, v0, LFe6$b;->i:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    iget-object v9, v0, LFe6$b;->h:Ljava/lang/Object;

    check-cast v9, LFe6;

    :try_start_1
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-object p3, v9

    move-object v11, v0

    move-object v0, p2

    move-object p2, v2

    move-object v2, v1

    move-object v1, v11

    goto :goto_2

    :catchall_1
    move-exception p1

    move-object p2, v9

    goto/16 :goto_7

    :cond_3
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-boolean p3, p0, LFe6;->c:Z

    xor-int/2addr p3, v8

    if-eqz p3, :cond_c

    invoke-interface {v0}, Lkotlin/coroutines/Continuation;->getContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object p3

    sget-object v2, LPV2;->d0:LPV2$b;

    invoke-interface {p3, v2}, Lkotlin/coroutines/CoroutineContext;->get(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;

    move-result-object p3

    check-cast p3, LPV2;

    if-eqz p3, :cond_4

    invoke-interface {p3}, LPV2;->I()F

    move-result p3

    goto :goto_1

    :cond_4
    const/high16 p3, 0x3f800000    # 1.0f

    :goto_1
    iput-boolean v8, p0, LFe6;->c:Z

    move-object v2, v1

    move-object v1, v0

    move-object v0, p2

    move-object p2, p1

    move p1, p3

    move-object p3, p0

    :cond_5
    :try_start_2
    sget-object v9, LFe6;->e:LFe6$a;

    iget v10, p3, LFe6;->d:F

    invoke-virtual {v9, v10}, LFe6$a;->c(F)Z

    move-result v9

    if-nez v9, :cond_8

    new-instance v9, LFe6$c;

    invoke-direct {v9, p3, p1, p2}, LFe6$c;-><init>(LFe6;FLkotlin/jvm/functions/Function1;)V

    iput-object p3, v1, LFe6$b;->h:Ljava/lang/Object;

    iput-object p2, v1, LFe6$b;->i:Ljava/lang/Object;

    iput-object v0, v1, LFe6$b;->j:Ljava/lang/Object;

    iput p1, v1, LFe6$b;->k:F

    iput v8, v1, LFe6$b;->n:I

    invoke-static {v9, v1}, LJV2;->b(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v2, :cond_6

    return-object v2

    :cond_6
    :goto_2
    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    cmpg-float v9, p1, v3

    if-nez v9, :cond_7

    move v9, v8

    goto :goto_3

    :cond_7
    move v9, v7

    :goto_3
    if-eqz v9, :cond_5

    :cond_8
    move-object p1, v0

    move-object v11, p3

    move-object p3, p2

    move-object p2, v11

    goto :goto_4

    :catchall_2
    move-exception p1

    move-object p2, p3

    goto :goto_7

    :goto_4
    :try_start_3
    iget v0, p2, LFe6;->d:F

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    cmpg-float v0, v0, v3

    if-nez v0, :cond_9

    goto :goto_5

    :cond_9
    move v8, v7

    :goto_5
    if-nez v8, :cond_b

    new-instance v0, LFe6$d;

    invoke-direct {v0, p2, p3}, LFe6$d;-><init>(LFe6;Lkotlin/jvm/functions/Function1;)V

    iput-object p2, v1, LFe6$b;->h:Ljava/lang/Object;

    iput-object p1, v1, LFe6$b;->i:Ljava/lang/Object;

    const/4 p3, 0x0

    iput-object p3, v1, LFe6$b;->j:Ljava/lang/Object;

    iput v6, v1, LFe6$b;->n:I

    invoke-static {v0, v1}, LJV2;->b(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v2, :cond_a

    return-object v2

    :cond_a
    :goto_6
    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :cond_b
    iput-wide v4, p2, LFe6;->a:J

    sget-object p1, LFe6;->f:Lsf;

    iput-object p1, p2, LFe6;->b:Lsf;

    iput-boolean v7, p2, LFe6;->c:Z

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    :goto_7
    iput-wide v4, p2, LFe6;->a:J

    sget-object p3, LFe6;->f:Lsf;

    iput-object p3, p2, LFe6;->b:Lsf;

    iput-boolean v7, p2, LFe6;->c:Z

    throw p1

    :cond_c
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Check failed."

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final i()F
    .locals 1

    iget v0, p0, LFe6;->d:F

    return v0
.end method

.method public final j(F)V
    .locals 0

    iput p1, p0, LFe6;->d:F

    return-void
.end method
