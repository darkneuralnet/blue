.class public final LTu;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LTu$b;,
        LTu$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0008\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0002\u0018\u0000*\u0004\u0008\u0000\u0010\u00012\u00020\u0002:\u0002\u0008\u0004B\u001d\u0012\u0014\u0010\n\u001a\u0010\u0012\u000c\u0008\u0001\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u00070\u0006\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0019\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0003H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\"\u0010\n\u001a\u0010\u0012\u000c\u0008\u0001\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u00070\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\t\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\r"
    }
    d2 = {
        "LTu;",
        "T",
        "",
        "",
        "b",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "",
        "LhZ0;",
        "a",
        "[LhZ0;",
        "deferreds",
        "<init>",
        "([LhZ0;)V",
        "kotlinx-coroutines-core"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# static fields
.field public static final synthetic b:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;


# instance fields
.field public final a:[LhZ0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "LhZ0<",
            "TT;>;"
        }
    .end annotation
.end field

.field volatile synthetic notCompletedCount:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-class v0, LTu;

    const-string v1, "notCompletedCount"

    invoke-static {v0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    sput-object v0, LTu;->b:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    return-void
.end method

.method public constructor <init>([LhZ0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "LhZ0<",
            "+TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LTu;->a:[LhZ0;

    array-length p1, p1

    iput p1, p0, LTu;->notCompletedCount:I

    return-void
.end method

.method public static final synthetic a(LTu;)[LhZ0;
    .locals 0

    iget-object p0, p0, LTu;->a:[LhZ0;

    return-object p0
.end method


# virtual methods
.method public final b(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/util/List<",
            "+TT;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, LXc0;

    invoke-static {p1}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->intercepted(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LXc0;-><init>(Lkotlin/coroutines/Continuation;I)V

    invoke-virtual {v0}, LXc0;->u()V

    invoke-static {p0}, LTu;->a(LTu;)[LhZ0;

    move-result-object v1

    array-length v1, v1

    new-array v2, v1, [LTu$a;

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v4, v1, :cond_0

    invoke-static {p0}, LTu;->a(LTu;)[LhZ0;

    move-result-object v5

    aget-object v5, v5, v4

    invoke-interface {v5}, Lzh2;->start()Z

    new-instance v6, LTu$a;

    invoke-direct {v6, p0, v0}, LTu$a;-><init>(LTu;LWc0;)V

    invoke-interface {v5, v6}, Lzh2;->n(Lkotlin/jvm/functions/Function1;)Lo51;

    move-result-object v5

    invoke-virtual {v6, v5}, LTu$a;->W(Lo51;)V

    sget-object v5, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    aput-object v6, v2, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    new-instance v4, LTu$b;

    invoke-direct {v4, p0, v2}, LTu$b;-><init>(LTu;[LTu$a;)V

    :goto_1
    if-ge v3, v1, :cond_1

    aget-object v5, v2, v3

    invoke-virtual {v5, v4}, LTu$a;->V(LTu$b;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    invoke-interface {v0}, LWc0;->c()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {v4}, LTu$b;->b()V

    goto :goto_2

    :cond_2
    invoke-interface {v0, v4}, LWc0;->H(Lkotlin/jvm/functions/Function1;)V

    :goto_2
    invoke-virtual {v0}, LXc0;->q()Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_3

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/DebugProbesKt;->probeCoroutineSuspended(Lkotlin/coroutines/Continuation;)V

    :cond_3
    return-object v0
.end method
