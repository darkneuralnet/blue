.class public final Lez2;
.super Lzy0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lez2$b;,
        Lez2$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lzy0<",
        "Landroid/graphics/drawable/BitmapDrawable;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\u0018\u0000 \u000b2\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001f B\u001f\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0015\u001a\u00020\u0011\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0008\u0010\u0004\u001a\u00020\u0003H\u0014J\u000e\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0008\u001a\u00020\u0002H\u0002J\u0008\u0010\n\u001a\u00020\u0003H\u0002J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0008\u001a\u00020\u0002H\u0002J\u0008\u0010\u000c\u001a\u00020\u0003H\u0002R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000fR\u0017\u0010\u0015\u001a\u00020\u00118\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0012\u0010\u0014R2\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0016j\u0008\u0012\u0004\u0012\u00020\u0005`\u00178\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u000c\u0010\u0018\u001a\u0004\u0008\u000e\u0010\u0019\"\u0004\u0008\u001a\u0010\u001b\u00a8\u0006!"
    }
    d2 = {
        "Lez2;",
        "Lzy0;",
        "Landroid/graphics/drawable/BitmapDrawable;",
        "",
        "done",
        "Lez2$b;",
        "callback",
        "c",
        "drawable",
        "j",
        "h",
        "g",
        "f",
        "LZy2;",
        "d",
        "LZy2;",
        "logoApi",
        "",
        "e",
        "Ljava/lang/String;",
        "()Ljava/lang/String;",
        "logoUrl",
        "Ljava/util/HashSet;",
        "Lkotlin/collections/HashSet;",
        "Ljava/util/HashSet;",
        "()Ljava/util/HashSet;",
        "setCallbacks",
        "(Ljava/util/HashSet;)V",
        "callbacks",
        "<init>",
        "(LZy2;Ljava/lang/String;Lez2$b;)V",
        "a",
        "b",
        "components-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
.end annotation


# static fields
.field public static final g:Lez2$a;

.field public static final h:Ljava/lang/String;


# instance fields
.field public final d:LZy2;

.field public final e:Ljava/lang/String;

.field public f:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Lez2$b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lez2$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lez2$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lez2;->g:Lez2$a;

    invoke-static {}, Lux2;->c()Ljava/lang/String;

    move-result-object v0

    const-string v1, "getTag()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Lez2;->h:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(LZy2;Ljava/lang/String;Lez2$b;)V
    .locals 1

    const-string v0, "logoApi"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logoUrl"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Laz2;

    invoke-direct {v0, p2}, Laz2;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lzy0;-><init>(Lfy0;)V

    iput-object p1, p0, Lez2;->d:LZy2;

    iput-object p2, p0, Lez2;->e:Ljava/lang/String;

    const/4 p1, 0x1

    new-array p1, p1, [Lez2$b;

    const/4 p2, 0x0

    aput-object p3, p1, p2

    invoke-static {p1}, Lkotlin/collections/SetsKt;->hashSetOf([Ljava/lang/Object;)Ljava/util/HashSet;

    move-result-object p1

    iput-object p1, p0, Lez2;->f:Ljava/util/HashSet;

    return-void
.end method

.method public static synthetic a(Lez2;)V
    .locals 0

    invoke-static {p0}, Lez2;->i(Lez2;)V

    return-void
.end method

.method public static synthetic b(Lez2;Landroid/graphics/drawable/BitmapDrawable;)V
    .locals 0

    invoke-static {p0, p1}, Lez2;->k(Lez2;Landroid/graphics/drawable/BitmapDrawable;)V

    return-void
.end method

.method public static final i(Lez2;)V
    .locals 3

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lez2;->d:LZy2;

    invoke-virtual {p0}, Lez2;->e()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, LZy2;->k(Ljava/lang/String;Landroid/graphics/drawable/BitmapDrawable;)V

    invoke-virtual {p0}, Lez2;->f()V

    return-void
.end method

.method public static final k(Lez2;Landroid/graphics/drawable/BitmapDrawable;)V
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$drawable"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lez2;->d:LZy2;

    invoke-virtual {p0}, Lez2;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, LZy2;->k(Ljava/lang/String;Landroid/graphics/drawable/BitmapDrawable;)V

    invoke-virtual {p0, p1}, Lez2;->g(Landroid/graphics/drawable/BitmapDrawable;)V

    return-void
.end method


# virtual methods
.method public final c(Lez2$b;)V
    .locals 1

    const-string v0, "callback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Lez2;->d()Ljava/util/HashSet;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final d()Ljava/util/HashSet;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashSet<",
            "Lez2$b;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lez2;->f:Ljava/util/HashSet;

    return-object v0
.end method

.method public done()V
    .locals 3

    sget-object v0, Lez2;->h:Ljava/lang/String;

    const-string v1, "done"

    invoke-static {v0, v1}, LCx2;->f(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/util/concurrent/FutureTask;->isCancelled()Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "canceled"

    invoke-static {v0, v1}, LCx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Lez2;->h()V

    return-void

    :cond_0
    :try_start_0
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x64

    invoke-virtual {p0, v1, v2, v0}, Ljava/util/concurrent/FutureTask;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/BitmapDrawable;

    const-string v1, "result"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lez2;->j(Landroid/graphics/drawable/BitmapDrawable;)V
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    sget-object v1, Lez2;->h:Ljava/lang/String;

    const-string v2, "Execution timed out."

    invoke-static {v1, v2, v0}, LCx2;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {p0}, Lez2;->h()V

    goto :goto_0

    :catch_1
    move-exception v0

    sget-object v1, Lez2;->h:Ljava/lang/String;

    const-string v2, "Execution interrupted."

    invoke-static {v1, v2, v0}, LCx2;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {p0}, Lez2;->h()V

    goto :goto_0

    :catch_2
    sget-object v0, Lez2;->h:Ljava/lang/String;

    const-string v1, "Execution failed for logo  - "

    iget-object v2, p0, Lez2;->e:Ljava/lang/String;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, LCx2;->c(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Lez2;->h()V

    :goto_0
    return-void
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lez2;->e:Ljava/lang/String;

    return-object v0
.end method

.method public final f()V
    .locals 2

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Lez2;->d()Ljava/util/HashSet;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lez2$b;

    invoke-interface {v1}, Lez2$b;->a()V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lez2;->d()Ljava/util/HashSet;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/HashSet;->clear()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final g(Landroid/graphics/drawable/BitmapDrawable;)V
    .locals 2

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Lez2;->d()Ljava/util/HashSet;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lez2$b;

    invoke-interface {v1, p1}, Lez2$b;->b(Landroid/graphics/drawable/BitmapDrawable;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lez2;->d()Ljava/util/HashSet;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/HashSet;->clear()V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final h()V
    .locals 2

    sget-object v0, Ly36;->a:Landroid/os/Handler;

    new-instance v1, Lcz2;

    invoke-direct {v1, p0}, Lcz2;-><init>(Lez2;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final j(Landroid/graphics/drawable/BitmapDrawable;)V
    .locals 2

    sget-object v0, Ly36;->a:Landroid/os/Handler;

    new-instance v1, Ldz2;

    invoke-direct {v1, p0, p1}, Ldz2;-><init>(Lez2;Landroid/graphics/drawable/BitmapDrawable;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
