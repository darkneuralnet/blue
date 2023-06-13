.class public final synthetic LIZ0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LQZ0$c;


# instance fields
.field public final synthetic a:LPZ0;

.field public final synthetic b:Ljava/lang/Runnable;

.field public final synthetic c:J

.field public final synthetic d:J

.field public final synthetic e:Ljava/util/concurrent/TimeUnit;


# direct methods
.method public synthetic constructor <init>(LPZ0;Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LIZ0;->a:LPZ0;

    iput-object p2, p0, LIZ0;->b:Ljava/lang/Runnable;

    iput-wide p3, p0, LIZ0;->c:J

    iput-wide p5, p0, LIZ0;->d:J

    iput-object p7, p0, LIZ0;->e:Ljava/util/concurrent/TimeUnit;

    return-void
.end method


# virtual methods
.method public final a(LQZ0$b;)Ljava/util/concurrent/ScheduledFuture;
    .locals 8

    iget-object v0, p0, LIZ0;->a:LPZ0;

    iget-object v1, p0, LIZ0;->b:Ljava/lang/Runnable;

    iget-wide v2, p0, LIZ0;->c:J

    iget-wide v4, p0, LIZ0;->d:J

    iget-object v6, p0, LIZ0;->e:Ljava/util/concurrent/TimeUnit;

    move-object v7, p1

    invoke-static/range {v0 .. v7}, LPZ0;->e(LPZ0;Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;LQZ0$b;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p1

    return-object p1
.end method
