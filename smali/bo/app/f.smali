.class public final Lbo/app/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbo/app/e2;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lbo/app/f$a;,
        Lbo/app/f$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001:\u0001\u0007B1\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u000b\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0008\u0008\u0002\u0010\u001c\u001a\u00020\u001b\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0008\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u0008\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u0008\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000bJ\u0006\u0010\u0010\u001a\u00020\u0006R\u0014\u0010\u0013\u001a\u00020\u00118BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\u0012\u00a8\u0006\u001f"
    }
    d2 = {
        "Lbo/app/f;",
        "Lbo/app/e2;",
        "Lzh2;",
        "c",
        "Lbo/app/z1;",
        "request",
        "",
        "a",
        "b",
        "Lbo/app/u1;",
        "event",
        "Lbo/app/g2;",
        "internalEventPublisher",
        "Lbo/app/f5;",
        "sessionId",
        "eventMessenger",
        "d",
        "Lbo/app/g0;",
        "()Lbo/app/g0;",
        "dataSyncRequest",
        "LX10;",
        "appConfigurationProvider",
        "internalIEventMessenger",
        "Lbo/app/m2;",
        "requestExecutor",
        "Lbo/app/o0;",
        "dispatchManager",
        "",
        "mockAllNetworkRequests",
        "<init>",
        "(LX10;Lbo/app/g2;Lbo/app/m2;Lbo/app/o0;Z)V",
        "android-sdk-base_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# static fields
.field public static final i:Lbo/app/f$a;

.field private static final j:Ljava/lang/String;


# instance fields
.field private final a:LX10;

.field private final b:Lbo/app/m2;

.field private final c:Lbo/app/o0;

.field private final d:Z

.field private final e:Ljava/util/concurrent/locks/ReentrantLock;

.field private final f:Lbo/app/q0;

.field private volatile g:Z

.field private volatile h:Lzh2;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lbo/app/f$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lbo/app/f$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lbo/app/f;->i:Lbo/app/f$a;

    const-class v0, Lbo/app/f;

    invoke-static {v0}, Lk20;->n(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lbo/app/f;->j:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(LX10;Lbo/app/g2;Lbo/app/m2;Lbo/app/o0;Z)V
    .locals 1

    const-string v0, "appConfigurationProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "internalIEventMessenger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "requestExecutor"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dispatchManager"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbo/app/f;->a:LX10;

    iput-object p3, p0, Lbo/app/f;->b:Lbo/app/m2;

    iput-object p4, p0, Lbo/app/f;->c:Lbo/app/o0;

    iput-boolean p5, p0, Lbo/app/f;->d:Z

    new-instance p1, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {p1}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object p1, p0, Lbo/app/f;->e:Ljava/util/concurrent/locks/ReentrantLock;

    new-instance p1, Lbo/app/q0;

    invoke-direct {p1, p2, p5}, Lbo/app/q0;-><init>(Lbo/app/g2;Z)V

    iput-object p1, p0, Lbo/app/f;->f:Lbo/app/q0;

    new-instance p1, LoN6;

    invoke-direct {p1, p0, p2}, LoN6;-><init>(Lbo/app/f;Lbo/app/g2;)V

    const-class p3, Lbo/app/m0;

    invoke-interface {p2, p1, p3}, Lbo/app/g2;->b(Lcom/appboy/events/IEventSubscriber;Ljava/lang/Class;)Z

    return-void
.end method

.method public static final synthetic a(Lbo/app/f;)Lbo/app/o0;
    .locals 0

    iget-object p0, p0, Lbo/app/f;->c:Lbo/app/o0;

    return-object p0
.end method

.method public static final synthetic a()Ljava/lang/String;
    .locals 1

    sget-object v0, Lbo/app/f;->j:Ljava/lang/String;

    return-object v0
.end method

.method private static final a(Lbo/app/f;Lbo/app/g2;Lbo/app/m0;)V
    .locals 4

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$internalIEventMessenger"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lbo/app/m0;->a()Lbo/app/m0$b;

    move-result-object v0

    invoke-virtual {p2}, Lbo/app/m0;->b()Lbo/app/u1;

    move-result-object v1

    invoke-virtual {p2}, Lbo/app/m0;->c()Lbo/app/f5;

    move-result-object v2

    invoke-virtual {p2}, Lbo/app/m0;->d()Lbo/app/z1;

    move-result-object p2

    sget-object v3, Lbo/app/f$b;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v3, v0

    const/4 v3, 0x1

    if-eq v0, v3, :cond_6

    const/4 v3, 0x2

    if-eq v0, v3, :cond_4

    const/4 v1, 0x3

    if-eq v0, v1, :cond_2

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    if-nez p2, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p0, p1, p2}, Lbo/app/f;->a(Lbo/app/g2;Lbo/app/z1;)V

    goto :goto_0

    :cond_2
    if-nez v2, :cond_3

    goto :goto_0

    :cond_3
    invoke-virtual {p0, v2}, Lbo/app/f;->a(Lbo/app/f5;)V

    goto :goto_0

    :cond_4
    if-nez v1, :cond_5

    goto :goto_0

    :cond_5
    invoke-virtual {p0, v1}, Lbo/app/f;->a(Lbo/app/u1;)V

    goto :goto_0

    :cond_6
    if-nez v1, :cond_7

    goto :goto_0

    :cond_7
    invoke-virtual {p0, v1}, Lbo/app/f;->b(Lbo/app/u1;)V

    :goto_0
    return-void
.end method

.method public static final synthetic a(Lbo/app/f;Lbo/app/z1;)V
    .locals 0

    invoke-direct {p0, p1}, Lbo/app/f;->a(Lbo/app/z1;)V

    return-void
.end method

.method private final a(Lbo/app/z1;)V
    .locals 1

    invoke-interface {p1}, Lbo/app/z1;->b()Z

    move-result v0

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lbo/app/f;->d:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lbo/app/f;->b:Lbo/app/m2;

    invoke-interface {v0, p1}, Lbo/app/m2;->b(Lbo/app/l2;)V

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lbo/app/f;->f:Lbo/app/q0;

    invoke-virtual {v0, p1}, Lbo/app/q0;->b(Lbo/app/l2;)V

    :goto_1
    return-void
.end method

.method private final b()Lbo/app/g0;
    .locals 4

    new-instance v0, Lbo/app/g0;

    iget-object v1, p0, Lbo/app/f;->a:LX10;

    invoke-virtual {v1}, LX10;->getBaseUrlForRequests()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-direct {v0, v1, v2, v3, v2}, Lbo/app/g0;-><init>(Ljava/lang/String;Lbo/app/v3;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public static synthetic b(Lbo/app/f;Lbo/app/g2;Lbo/app/m0;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lbo/app/f;->a(Lbo/app/f;Lbo/app/g2;Lbo/app/m0;)V

    return-void
.end method

.method private final b(Lbo/app/z1;)V
    .locals 1

    invoke-interface {p1}, Lbo/app/z1;->b()Z

    move-result v0

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lbo/app/f;->d:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lbo/app/f;->b:Lbo/app/m2;

    invoke-interface {v0, p1}, Lbo/app/m2;->a(Lbo/app/l2;)V

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lbo/app/f;->f:Lbo/app/q0;

    invoke-virtual {v0, p1}, Lbo/app/q0;->a(Lbo/app/l2;)V

    :goto_1
    return-void
.end method

.method private final c()Lzh2;
    .locals 6

    sget-object v0, LZ10;->b:LZ10;

    new-instance v3, Lbo/app/f$c;

    const/4 v1, 0x0

    invoke-direct {v3, p0, v1}, Lbo/app/f$c;-><init>(Lbo/app/f;Lkotlin/coroutines/Continuation;)V

    const/4 v2, 0x0

    const/4 v4, 0x3

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a(Lbo/app/f5;)V
    .locals 1

    const-string v0, "sessionId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lbo/app/f;->c:Lbo/app/o0;

    invoke-virtual {v0, p1}, Lbo/app/o0;->a(Lbo/app/f5;)V

    return-void
.end method

.method public final a(Lbo/app/g2;)V
    .locals 4

    const-string v0, "eventMessenger"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lbo/app/f;->e:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    iget-object v1, p0, Lbo/app/f;->h:Lzh2;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x1

    invoke-static {v1, v2, v3, v2}, Lzh2$a;->a(Lzh2;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    :goto_0
    iput-object v2, p0, Lbo/app/f;->h:Lzh2;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    iget-object v0, p0, Lbo/app/f;->c:Lbo/app/o0;

    invoke-virtual {v0}, Lbo/app/o0;->b()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lbo/app/f;->c:Lbo/app/o0;

    invoke-direct {p0}, Lbo/app/f;->b()Lbo/app/g0;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lbo/app/o0;->a(Lbo/app/g2;Lbo/app/z1;)V

    :cond_1
    iget-object v0, p0, Lbo/app/f;->c:Lbo/app/o0;

    invoke-virtual {v0}, Lbo/app/o0;->d()Lbo/app/z1;

    move-result-object v0

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    invoke-direct {p0, v0}, Lbo/app/f;->b(Lbo/app/z1;)V

    :goto_1
    invoke-interface {p1}, Lbo/app/g2;->a()V

    return-void

    :catchall_0
    move-exception p1

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p1
.end method

.method public a(Lbo/app/g2;Lbo/app/z1;)V
    .locals 1

    const-string v0, "internalEventPublisher"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "request"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lbo/app/f;->c:Lbo/app/o0;

    invoke-virtual {v0, p1, p2}, Lbo/app/o0;->a(Lbo/app/g2;Lbo/app/z1;)V

    return-void
.end method

.method public a(Lbo/app/u1;)V
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lbo/app/f;->c:Lbo/app/o0;

    invoke-virtual {v0, p1}, Lbo/app/o0;->a(Lbo/app/u1;)V

    return-void
.end method

.method public b(Lbo/app/u1;)V
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lbo/app/f;->c:Lbo/app/o0;

    invoke-virtual {v0, p1}, Lbo/app/o0;->b(Lbo/app/u1;)V

    return-void
.end method

.method public final d()V
    .locals 10

    iget-object v0, p0, Lbo/app/f;->e:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    iget-boolean v1, p0, Lbo/app/f;->g:Z

    if-eqz v1, :cond_0

    sget-object v2, Lk20;->a:Lk20;

    sget-object v3, Lbo/app/f;->j:Ljava/lang/String;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    sget-object v7, Lbo/app/f$d;->b:Lbo/app/f$d;

    const/16 v8, 0xe

    const/4 v9, 0x0

    invoke-static/range {v2 .. v9}, Lk20;->f(Lk20;Ljava/lang/String;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :cond_0
    :try_start_1
    invoke-direct {p0}, Lbo/app/f;->c()Lzh2;

    move-result-object v1

    iput-object v1, p0, Lbo/app/f;->h:Lzh2;

    const/4 v1, 0x1

    iput-boolean v1, p0, Lbo/app/f;->g:Z

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :catchall_0
    move-exception v1

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v1
.end method
