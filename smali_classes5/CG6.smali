.class public final LCG6;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LCG6$c;,
        LCG6$b;,
        LCG6$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u0000 #2\u00020\u0001:\u0003\u0010\u0013\u0016B\u001d\u0008\u0007\u0012\u0008\u0008\u0002\u0010\u001d\u001a\u00020\u0018\u0012\u0008\u0008\u0002\u0010 \u001a\u00020\u001e\u00a2\u0006\u0004\u0008!\u0010\"J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004H\u0007J\u0008\u0010\t\u001a\u00020\u0008H\u0002J\u0016\u0010\u000c\u001a\u00020\u00082\u000c\u0010\u000b\u001a\u0008\u0018\u00010\nR\u00020\u0000H\u0002J\u0014\u0010\u000e\u001a\u00020\u00082\n\u0010\r\u001a\u00060\nR\u00020\u0000H\u0002R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011R\u001c\u0010\u0015\u001a\u0008\u0018\u00010\nR\u00020\u00008\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u001c\u0010\u0017\u001a\u0008\u0018\u00010\nR\u00020\u00008\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0014R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00188\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001aR\u0014\u0010 \u001a\u00020\u001e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u001f\u00a8\u0006$"
    }
    d2 = {
        "LCG6;",
        "",
        "Ljava/lang/Runnable;",
        "callback",
        "",
        "addToFront",
        "LCG6$b;",
        "f",
        "",
        "j",
        "LCG6$c;",
        "finished",
        "i",
        "node",
        "h",
        "Ljava/util/concurrent/locks/ReentrantLock;",
        "a",
        "Ljava/util/concurrent/locks/ReentrantLock;",
        "workLock",
        "b",
        "LCG6$c;",
        "pendingJobs",
        "c",
        "runningJobs",
        "",
        "d",
        "I",
        "runningCount",
        "e",
        "maxConcurrent",
        "Ljava/util/concurrent/Executor;",
        "Ljava/util/concurrent/Executor;",
        "executor",
        "<init>",
        "(ILjava/util/concurrent/Executor;)V",
        "g",
        "facebook-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x0
    }
.end annotation


# static fields
.field public static final g:LCG6$a;


# instance fields
.field public final a:Ljava/util/concurrent/locks/ReentrantLock;

.field public b:LCG6$c;

.field public c:LCG6$c;

.field public d:I

.field public final e:I

.field public final f:Ljava/util/concurrent/Executor;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LCG6$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LCG6$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LCG6;->g:LCG6$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 3
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-direct {p0, v2, v0, v1, v0}, LCG6;-><init>(ILjava/util/concurrent/Executor;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 2
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-direct {p0, p1, v0, v1, v0}, LCG6;-><init>(ILjava/util/concurrent/Executor;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(ILjava/util/concurrent/Executor;)V
    .locals 1
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "executor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, LCG6;->e:I

    iput-object p2, p0, LCG6;->f:Ljava/util/concurrent/Executor;

    new-instance p1, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {p1}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object p1, p0, LCG6;->a:Ljava/util/concurrent/locks/ReentrantLock;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/util/concurrent/Executor;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    const/16 p1, 0x8

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    invoke-static {}, Lcom/facebook/a;->o()Ljava/util/concurrent/Executor;

    move-result-object p2

    const-string p3, "FacebookSdk.getExecutor()"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_1
    invoke-direct {p0, p1, p2}, LCG6;-><init>(ILjava/util/concurrent/Executor;)V

    return-void
.end method

.method public static final synthetic a(LCG6;LCG6$c;)V
    .locals 0

    invoke-virtual {p0, p1}, LCG6;->i(LCG6$c;)V

    return-void
.end method

.method public static final synthetic b(LCG6;)LCG6$c;
    .locals 0

    iget-object p0, p0, LCG6;->b:LCG6$c;

    return-object p0
.end method

.method public static final synthetic c(LCG6;)Ljava/util/concurrent/locks/ReentrantLock;
    .locals 0

    iget-object p0, p0, LCG6;->a:Ljava/util/concurrent/locks/ReentrantLock;

    return-object p0
.end method

.method public static final synthetic d(LCG6;LCG6$c;)V
    .locals 0

    iput-object p1, p0, LCG6;->b:LCG6$c;

    return-void
.end method

.method public static synthetic g(LCG6;Ljava/lang/Runnable;ZILjava/lang/Object;)LCG6$b;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x1

    :cond_0
    invoke-virtual {p0, p1, p2}, LCG6;->f(Ljava/lang/Runnable;Z)LCG6$b;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final e(Ljava/lang/Runnable;)LCG6$b;
    .locals 3
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p0, p1, v2, v0, v1}, LCG6;->g(LCG6;Ljava/lang/Runnable;ZILjava/lang/Object;)LCG6$b;

    move-result-object p1

    return-object p1
.end method

.method public final f(Ljava/lang/Runnable;Z)LCG6$b;
    .locals 2
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "callback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LCG6$c;

    invoke-direct {v0, p0, p1}, LCG6$c;-><init>(LCG6;Ljava/lang/Runnable;)V

    iget-object p1, p0, LCG6;->a:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    iget-object v1, p0, LCG6;->b:LCG6$c;

    invoke-virtual {v0, v1, p2}, LCG6$c;->b(LCG6$c;Z)LCG6$c;

    move-result-object p2

    iput-object p2, p0, LCG6;->b:LCG6$c;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    invoke-virtual {p0}, LCG6;->j()V

    return-object v0

    :catchall_0
    move-exception p2

    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p2
.end method

.method public final h(LCG6$c;)V
    .locals 2

    iget-object v0, p0, LCG6;->f:Ljava/util/concurrent/Executor;

    new-instance v1, LCG6$d;

    invoke-direct {v1, p0, p1}, LCG6$d;-><init>(LCG6;LCG6$c;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final i(LCG6$c;)V
    .locals 2

    iget-object v0, p0, LCG6;->a:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    if-eqz p1, :cond_0

    iget-object v0, p0, LCG6;->c:LCG6$c;

    invoke-virtual {p1, v0}, LCG6$c;->e(LCG6$c;)LCG6$c;

    move-result-object p1

    iput-object p1, p0, LCG6;->c:LCG6$c;

    iget p1, p0, LCG6;->d:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, LCG6;->d:I

    :cond_0
    iget p1, p0, LCG6;->d:I

    iget v0, p0, LCG6;->e:I

    if-ge p1, v0, :cond_1

    iget-object p1, p0, LCG6;->b:LCG6$c;

    if-eqz p1, :cond_2

    invoke-virtual {p1, p1}, LCG6$c;->e(LCG6$c;)LCG6$c;

    move-result-object v0

    iput-object v0, p0, LCG6;->b:LCG6$c;

    iget-object v0, p0, LCG6;->c:LCG6$c;

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, LCG6$c;->b(LCG6$c;Z)LCG6$c;

    move-result-object v0

    iput-object v0, p0, LCG6;->c:LCG6$c;

    iget v0, p0, LCG6;->d:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, LCG6;->d:I

    invoke-virtual {p1, v1}, LCG6$c;->f(Z)V

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :cond_2
    :goto_0
    iget-object v0, p0, LCG6;->a:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    if-eqz p1, :cond_3

    invoke-virtual {p0, p1}, LCG6;->h(LCG6$c;)V

    :cond_3
    return-void
.end method

.method public final j()V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, LCG6;->i(LCG6$c;)V

    return-void
.end method
