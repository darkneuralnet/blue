.class public final Lbo/app/o0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbo/app/e2;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lbo/app/o0$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001:\u0001\u0008B/\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u00a2\u0006\u0004\u0008!\u0010\"J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u0008\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000c\u001a\u00020\u000bH\u0016J\u0006\u0010\u0005\u001a\u00020\rJ\u0013\u0010\u0008\u001a\u00020\u000bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0008\u0010\u000eJ\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000bH\u0007J\u0010\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000bH\u0007R\u0011\u0010\u0013\u001a\u00020\u00118G\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\u0012R\u0011\u0010\u0016\u001a\u00020\r8G\u00a2\u0006\u0006\u001a\u0004\u0008\u0014\u0010\u0015\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006#"
    }
    d2 = {
        "Lbo/app/o0;",
        "Lbo/app/e2;",
        "Lbo/app/u1;",
        "event",
        "",
        "b",
        "Lbo/app/f5;",
        "sessionId",
        "a",
        "Lbo/app/g2;",
        "internalEventPublisher",
        "Lbo/app/z1;",
        "request",
        "",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "d",
        "brazeRequest",
        "Lbo/app/k;",
        "()Lbo/app/k;",
        "brazeEventsForDispatch",
        "c",
        "()Z",
        "isNetworkRequestsOffline",
        "Lbo/app/p6;",
        "userCache",
        "Lbo/app/c2;",
        "deviceDataProvider",
        "LX10;",
        "configurationProvider",
        "Lbo/app/u4;",
        "sdkAuthenticationCache",
        "Lbo/app/w4;",
        "sdkMetadataCache",
        "<init>",
        "(Lbo/app/p6;Lbo/app/c2;LX10;Lbo/app/u4;Lbo/app/w4;)V",
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
.field public static final i:Lbo/app/o0$a;


# instance fields
.field private final a:Lbo/app/p6;

.field private final b:Lbo/app/c2;

.field private final c:LX10;

.field private final d:Lbo/app/u4;

.field private final e:Lbo/app/w4;

.field private final f:LFh0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LFh0<",
            "Lbo/app/z1;",
            ">;"
        }
    .end annotation
.end field

.field private final g:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Lbo/app/u1;",
            ">;"
        }
    .end annotation
.end field

.field private final h:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Lbo/app/u1;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lbo/app/o0$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lbo/app/o0$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lbo/app/o0;->i:Lbo/app/o0$a;

    return-void
.end method

.method public constructor <init>(Lbo/app/p6;Lbo/app/c2;LX10;Lbo/app/u4;Lbo/app/w4;)V
    .locals 1

    const-string v0, "userCache"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deviceDataProvider"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "configurationProvider"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sdkAuthenticationCache"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sdkMetadataCache"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbo/app/o0;->a:Lbo/app/p6;

    iput-object p2, p0, Lbo/app/o0;->b:Lbo/app/c2;

    iput-object p3, p0, Lbo/app/o0;->c:LX10;

    iput-object p4, p0, Lbo/app/o0;->d:Lbo/app/u4;

    iput-object p5, p0, Lbo/app/o0;->e:Lbo/app/w4;

    const/4 p1, 0x0

    const/4 p2, 0x6

    const/16 p3, 0x3e8

    invoke-static {p3, p1, p1, p2, p1}, LPh0;->b(ILk30;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)LFh0;

    move-result-object p1

    iput-object p1, p0, Lbo/app/o0;->f:LFh0;

    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object p1, p0, Lbo/app/o0;->g:Ljava/util/concurrent/ConcurrentHashMap;

    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object p1, p0, Lbo/app/o0;->h:Ljava/util/concurrent/ConcurrentHashMap;

    return-void
.end method


# virtual methods
.method public final declared-synchronized a()Lbo/app/k;
    .locals 13

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lbo/app/o0;->g:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    const-string v1, "brazeEventMap.values"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ljava/util/LinkedHashSet;

    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lbo/app/u1;

    const-string v4, "event"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v1, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    invoke-interface {v0, v3}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    sget-object v4, Lk20;->a:Lk20;

    new-instance v10, Lbo/app/o0$e;

    invoke-direct {v10, v3}, Lbo/app/o0$e;-><init>(Lbo/app/u1;)V

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x7

    const/4 v12, 0x0

    move-object v5, v4

    move-object v6, p0

    invoke-static/range {v5 .. v12}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    invoke-interface {v1}, Ljava/util/Set;->size()I

    move-result v3

    const/16 v5, 0x20

    if-lt v3, v5, :cond_0

    sget-object v7, Lk20$a;->d:Lk20$a;

    sget-object v10, Lbo/app/o0$f;->b:Lbo/app/o0$f;

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x6

    const/4 v12, 0x0

    move-object v5, v4

    move-object v6, p0

    invoke-static/range {v5 .. v12}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    :cond_1
    new-instance v0, Lbo/app/k;

    invoke-direct {v0, v1}, Lbo/app/k;-><init>(Ljava/util/Set;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final a(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lbo/app/z1;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lbo/app/o0$h;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lbo/app/o0$h;

    iget v1, v0, Lbo/app/o0$h;->e:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lbo/app/o0$h;->e:I

    goto :goto_0

    :cond_0
    new-instance v0, Lbo/app/o0$h;

    invoke-direct {v0, p0, p1}, Lbo/app/o0$h;-><init>(Lbo/app/o0;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p1, v0, Lbo/app/o0$h;->c:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lbo/app/o0$h;->e:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v0, v0, Lbo/app/o0$h;->b:Ljava/lang/Object;

    check-cast v0, Lbo/app/o0;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p1, p0, Lbo/app/o0;->f:LFh0;

    iput-object p0, v0, Lbo/app/o0$h;->b:Ljava/lang/Object;

    iput v3, v0, Lbo/app/o0$h;->e:I

    invoke-interface {p1, v0}, Lks4;->G(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p0

    :goto_1
    check-cast p1, Lbo/app/z1;

    invoke-virtual {v0, p1}, Lbo/app/o0;->b(Lbo/app/z1;)Lbo/app/z1;

    move-result-object p1

    return-object p1
.end method

.method public declared-synchronized a(Lbo/app/f5;)V
    .locals 9

    monitor-enter p0

    :try_start_0
    const-string v0, "sessionId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lbo/app/o0;->h:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->isEmpty()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    sget-object v1, Lk20;->a:Lk20;

    sget-object v6, Lbo/app/o0$g;->b:Lbo/app/o0$g;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x7

    const/4 v8, 0x0

    move-object v2, p0

    invoke-static/range {v1 .. v8}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    iget-object v0, p0, Lbo/app/o0;->h:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    const-string v1, "pendingBrazeEventMap.values"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lbo/app/u1;

    invoke-interface {v1, p1}, Lbo/app/u1;->a(Lbo/app/f5;)V

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lbo/app/o0;->g:Ljava/util/concurrent/ConcurrentHashMap;

    iget-object v0, p0, Lbo/app/o0;->h:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->putAll(Ljava/util/Map;)V

    iget-object p1, p0, Lbo/app/o0;->h:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p1}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public a(Lbo/app/g2;Lbo/app/z1;)V
    .locals 9

    const-string v0, "internalEventPublisher"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "request"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lbo/app/o0;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v1, Lk20;->a:Lk20;

    sget-object v3, Lk20$a;->d:Lk20$a;

    sget-object v6, Lbo/app/o0$b;->b:Lbo/app/o0$b;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x6

    const/4 v8, 0x0

    move-object v2, p0

    invoke-static/range {v1 .. v8}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    return-void

    :cond_0
    invoke-interface {p2}, Lbo/app/z1;->l()Lorg/json/JSONObject;

    move-result-object v0

    invoke-static {v0}, LAj2;->i(Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, p1}, Lbo/app/l2;->a(Lbo/app/g2;)V

    iget-object v1, p0, Lbo/app/o0;->f:LFh0;

    invoke-interface {v1, p2}, Lys5;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, LQh0;->j(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    sget-object v1, Lk20;->a:Lk20;

    sget-object v3, Lk20$a;->f:Lk20$a;

    new-instance v6, Lbo/app/o0$c;

    invoke-direct {v6, v0}, Lbo/app/o0$c;-><init>(Ljava/lang/String;)V

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x6

    const/4 v8, 0x0

    move-object v2, p0

    invoke-static/range {v1 .. v8}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    goto :goto_0

    :cond_1
    sget-object v1, Lk20;->a:Lk20;

    sget-object v3, Lk20$a;->e:Lk20$a;

    new-instance v6, Lbo/app/o0$d;

    invoke-direct {v6, v0}, Lbo/app/o0$d;-><init>(Ljava/lang/String;)V

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x6

    const/4 v8, 0x0

    move-object v2, p0

    invoke-static/range {v1 .. v8}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    invoke-interface {p2, p1}, Lbo/app/l2;->b(Lbo/app/g2;)V

    :goto_0
    return-void
.end method

.method public declared-synchronized a(Lbo/app/u1;)V
    .locals 2

    monitor-enter p0

    :try_start_0
    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lbo/app/o0;->g:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-interface {p1}, Lbo/app/u1;->r()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized a(Lbo/app/z1;)V
    .locals 2

    monitor-enter p0

    :try_start_0
    const-string v0, "brazeRequest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lbo/app/o0;->b:Lbo/app/c2;

    invoke-interface {v0}, Lbo/app/c2;->c()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lbo/app/z1;->c(Ljava/lang/String;)V

    iget-object v0, p0, Lbo/app/o0;->c:LX10;

    invoke-virtual {v0}, LX10;->getSdkFlavor()Lcom/appboy/enums/SdkFlavor;

    move-result-object v0

    invoke-interface {p1, v0}, Lbo/app/z1;->a(Lcom/appboy/enums/SdkFlavor;)V

    iget-object v0, p0, Lbo/app/o0;->b:Lbo/app/c2;

    invoke-interface {v0}, Lbo/app/c2;->a()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lbo/app/z1;->e(Ljava/lang/String;)V

    iget-object v0, p0, Lbo/app/o0;->b:Lbo/app/c2;

    invoke-interface {v0}, Lbo/app/c2;->b()Lbo/app/h0;

    move-result-object v0

    invoke-interface {p1, v0}, Lbo/app/z1;->a(Lbo/app/h0;)V

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lbo/app/h0;->v()Z

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x0

    :goto_1
    if-eqz v1, :cond_2

    iget-object v0, p0, Lbo/app/o0;->a:Lbo/app/p6;

    invoke-virtual {v0}, Lbo/app/p6;->h()V

    :cond_2
    iget-object v0, p0, Lbo/app/o0;->a:Lbo/app/p6;

    invoke-virtual {v0}, Lbo/app/a;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbo/app/w3;

    invoke-interface {p1, v0}, Lbo/app/z1;->a(Lbo/app/w3;)V

    invoke-virtual {p0}, Lbo/app/o0;->a()Lbo/app/k;

    move-result-object v0

    invoke-interface {p1, v0}, Lbo/app/z1;->a(Lbo/app/k;)V

    invoke-virtual {v0}, Lbo/app/k;->a()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lbo/app/o0;->e:Lbo/app/w4;

    iget-object v1, p0, Lbo/app/o0;->c:LX10;

    invoke-virtual {v1}, LX10;->getSdkMetadata()Ljava/util/EnumSet;

    move-result-object v1

    invoke-virtual {v0, v1}, Lbo/app/w4;->b(Ljava/util/EnumSet;)Ljava/util/EnumSet;

    move-result-object v0

    invoke-interface {p1, v0}, Lbo/app/z1;->a(Ljava/util/EnumSet;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_3
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized b(Lbo/app/z1;)Lbo/app/z1;
    .locals 4

    monitor-enter p0

    :try_start_0
    const-string v0, "brazeRequest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lbo/app/o0;->a:Lbo/app/p6;

    invoke-virtual {v0}, Lbo/app/p6;->f()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lbo/app/z1;->a(Ljava/lang/String;)V

    sget-object v0, Lbo/app/o0;->i:Lbo/app/o0$a;

    iget-object v1, p0, Lbo/app/o0;->b:Lbo/app/c2;

    iget-object v2, p0, Lbo/app/o0;->c:LX10;

    iget-object v3, p0, Lbo/app/o0;->d:Lbo/app/u4;

    invoke-virtual {v0, v1, v2, v3, p1}, Lbo/app/o0$a;->a(Lbo/app/c2;LX10;Lbo/app/u4;Lbo/app/z1;)V

    invoke-interface {p1}, Lbo/app/z1;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lbo/app/o0;->a(Lbo/app/z1;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized b(Lbo/app/u1;)V
    .locals 2

    monitor-enter p0

    :try_start_0
    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lbo/app/o0;->h:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-interface {p1}, Lbo/app/u1;->r()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final b()Z
    .locals 1

    iget-object v0, p0, Lbo/app/o0;->f:LFh0;

    invoke-interface {v0}, Lks4;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final c()Z
    .locals 1

    invoke-static {}, Lcom/appboy/Appboy;->getOutboundNetworkRequestsOffline()Z

    move-result v0

    return v0
.end method

.method public final d()Lbo/app/z1;
    .locals 1

    iget-object v0, p0, Lbo/app/o0;->f:LFh0;

    invoke-interface {v0}, Lks4;->l()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, LQh0;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbo/app/z1;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v0}, Lbo/app/o0;->b(Lbo/app/z1;)Lbo/app/z1;

    :goto_0
    return-object v0
.end method
