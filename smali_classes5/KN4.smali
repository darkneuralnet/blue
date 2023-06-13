.class public final LKN4;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LKN4$a;,
        LKN4$b;,
        LKN4$c;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0008\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u0000 \u00102\u00020\u0001:\u0002\u000b\u0003B\u001b\u0008\u0007\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0008\u0008\u0002\u0010 \u001a\u00020\u0011\u00a2\u0006\u0004\u0008!\u0010\"J\u0013\u0010\u0003\u001a\u00020\u0002H\u0080@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\u0008\u001a\u00020\u0005H\u0002J\u001b\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0005H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0005H\u0002J\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005H\u0002J\u0010\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0011H\u0002R\u0014\u0010\u0012\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00168BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u001c\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006#"
    }
    d2 = {
        "LKN4;",
        "",
        "",
        "b",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "",
        "fallback",
        "c",
        "time",
        "h",
        "threshold",
        "a",
        "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "now",
        "",
        "f",
        "e",
        "LKN4$b;",
        "period",
        "g",
        "J",
        "cleanupFrequency",
        "Landroid/content/SharedPreferences;",
        "Lkotlin/Lazy;",
        "d",
        "()Landroid/content/SharedPreferences;",
        "prefs",
        "LSX2;",
        "LSX2;",
        "maintenanceMutex",
        "Landroid/content/Context;",
        "context",
        "retentionPeriod",
        "<init>",
        "(Landroid/content/Context;LKN4$b;)V",
        "com.github.ChuckerTeam.Chucker.library"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nRetentionManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RetentionManager.kt\ncom/chuckerteam/chucker/api/RetentionManager\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 3 SharedPreferences.kt\nandroidx/core/content/SharedPreferencesKt\n*L\n1#1,107:1\n107#2,10:108\n39#3,12:118\n*S KotlinDebug\n*F\n+ 1 RetentionManager.kt\ncom/chuckerteam/chucker/api/RetentionManager\n*L\n47#1:108,10\n67#1:118,12\n*E\n"
    }
.end annotation


# static fields
.field public static final e:LKN4$a;

.field public static f:J


# instance fields
.field public final a:J

.field public final b:J

.field public final c:Lkotlin/Lazy;

.field public final d:LSX2;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LKN4$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LKN4$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LKN4;->e:LKN4$a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;LKN4$b;)V
    .locals 2
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "retentionPeriod"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0, p2}, LKN4;->g(LKN4$b;)J

    move-result-wide v0

    iput-wide v0, p0, LKN4;->a:J

    new-instance v0, LKN4$e;

    invoke-direct {v0, p1}, LKN4$e;-><init>(Landroid/content/Context;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, LKN4;->c:Lkotlin/Lazy;

    const/4 p1, 0x1

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {v1, p1, v0}, LUX2;->b(ZILjava/lang/Object;)LSX2;

    move-result-object p1

    iput-object p1, p0, LKN4;->d:LSX2;

    sget-object p1, LKN4$b;->b:LKN4$b;

    if-ne p2, p1, :cond_0

    sget-object p1, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v0, 0x1e

    invoke-virtual {p1, v0, v1}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide p1

    goto :goto_0

    :cond_0
    sget-object p1, Ljava/util/concurrent/TimeUnit;->HOURS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v0, 0x2

    invoke-virtual {p1, v0, v1}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide p1

    :goto_0
    iput-wide p1, p0, LKN4;->b:J

    return-void
.end method


# virtual methods
.method public final a(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object v0, LhI4;->a:LhI4;

    invoke-virtual {v0}, LhI4;->b()LNN1;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, LNN1;->c(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final b(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, LKN4$d;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, LKN4$d;

    iget v1, v0, LKN4$d;->m:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LKN4$d;->m:I

    goto :goto_0

    :cond_0
    new-instance v0, LKN4$d;

    invoke-direct {v0, p0, p1}, LKN4$d;-><init>(LKN4;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p1, v0, LKN4$d;->k:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LKN4$d;->m:I

    const/4 v3, 0x1

    const/4 v4, 0x2

    const/4 v5, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v3, :cond_2

    if-ne v2, v4, :cond_1

    iget-wide v1, v0, LKN4$d;->j:J

    iget-object v3, v0, LKN4$d;->i:Ljava/lang/Object;

    check-cast v3, LSX2;

    iget-object v0, v0, LKN4$d;->h:Ljava/lang/Object;

    check-cast v0, LKN4;

    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p1

    goto/16 :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v2, v0, LKN4$d;->i:Ljava/lang/Object;

    check-cast v2, LSX2;

    iget-object v3, v0, LKN4$d;->h:Ljava/lang/Object;

    check-cast v3, LKN4;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object p1, v2

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p1, p0, LKN4;->d:LSX2;

    iput-object p0, v0, LKN4$d;->h:Ljava/lang/Object;

    iput-object p1, v0, LKN4$d;->i:Ljava/lang/Object;

    iput v3, v0, LKN4$d;->m:I

    invoke-interface {p1, v5, v0}, LSX2;->a(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_4

    return-object v1

    :cond_4
    move-object v3, p0

    :goto_1
    :try_start_1
    iget-wide v6, v3, LKN4;->a:J

    const-wide/16 v8, 0x0

    cmp-long v2, v6, v8

    if-lez v2, :cond_6

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    invoke-virtual {v3, v6, v7}, LKN4;->f(J)Z

    move-result v2

    if-eqz v2, :cond_6

    sget-object v2, LEx2;->a:LEx2$a;

    const-string v8, "Performing data retention maintenance..."

    invoke-static {v2, v8, v5, v4, v5}, LEx2$b;->b(LEx2;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    invoke-virtual {v3, v6, v7}, LKN4;->e(J)J

    move-result-wide v8

    iput-object v3, v0, LKN4$d;->h:Ljava/lang/Object;

    iput-object p1, v0, LKN4$d;->i:Ljava/lang/Object;

    iput-wide v6, v0, LKN4$d;->j:J

    iput v4, v0, LKN4$d;->m:I

    invoke-virtual {v3, v8, v9, v0}, LKN4;->a(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne v0, v1, :cond_5

    return-object v1

    :cond_5
    move-object v0, v3

    move-wide v1, v6

    move-object v3, p1

    :goto_2
    :try_start_2
    invoke-virtual {v0, v1, v2}, LKN4;->h(J)V

    goto :goto_3

    :cond_6
    move-object v3, p1

    :goto_3
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-interface {v3, v5}, LSX2;->b(Ljava/lang/Object;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    :catchall_1
    move-exception v0

    move-object v3, p1

    move-object p1, v0

    :goto_4
    invoke-interface {v3, v5}, LSX2;->b(Ljava/lang/Object;)V

    throw p1
.end method

.method public final c(J)J
    .locals 4

    sget-wide v0, LKN4;->f:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    invoke-virtual {p0}, LKN4;->d()Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "last_cleanup"

    invoke-interface {v0, v1, p1, p2}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide p1

    sput-wide p1, LKN4;->f:J

    :cond_0
    sget-wide p1, LKN4;->f:J

    return-wide p1
.end method

.method public final d()Landroid/content/SharedPreferences;
    .locals 2

    iget-object v0, p0, LKN4;->c:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "<get-prefs>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/content/SharedPreferences;

    return-object v0
.end method

.method public final e(J)J
    .locals 4

    iget-wide v0, p0, LKN4;->a:J

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    sub-long/2addr p1, v0

    :goto_0
    return-wide p1
.end method

.method public final f(J)Z
    .locals 2

    invoke-virtual {p0, p1, p2}, LKN4;->c(J)J

    move-result-wide v0

    sub-long/2addr p1, v0

    iget-wide v0, p0, LKN4;->b:J

    cmp-long p1, p1, v0

    if-lez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final g(LKN4$b;)J
    .locals 3

    sget-object v0, LKN4$c;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    const-wide/16 v1, 0x1

    if-eq p1, v0, :cond_3

    const/4 v0, 0x2

    if-eq p1, v0, :cond_2

    const/4 v0, 0x3

    if-eq p1, v0, :cond_1

    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    const-wide/16 v0, 0x0

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    sget-object p1, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v0, 0x7

    invoke-virtual {p1, v0, v1}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    goto :goto_0

    :cond_2
    sget-object p1, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    goto :goto_0

    :cond_3
    sget-object p1, Ljava/util/concurrent/TimeUnit;->HOURS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    :goto_0
    return-wide v0
.end method

.method public final h(J)V
    .locals 2

    sput-wide p1, LKN4;->f:J

    invoke-virtual {p0}, LKN4;->d()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "editor"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "last_cleanup"

    invoke-interface {v0, v1, p1, p2}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method
