.class public final synthetic LGZ0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LQZ0$c;


# instance fields
.field public final synthetic a:LPZ0;

.field public final synthetic b:Ljava/lang/Runnable;

.field public final synthetic c:J

.field public final synthetic d:Ljava/util/concurrent/TimeUnit;


# direct methods
.method public synthetic constructor <init>(LPZ0;Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LGZ0;->a:LPZ0;

    iput-object p2, p0, LGZ0;->b:Ljava/lang/Runnable;

    iput-wide p3, p0, LGZ0;->c:J

    iput-object p5, p0, LGZ0;->d:Ljava/util/concurrent/TimeUnit;

    return-void
.end method


# virtual methods
.method public final a(LQZ0$b;)Ljava/util/concurrent/ScheduledFuture;
    .locals 6

    iget-object v0, p0, LGZ0;->a:LPZ0;

    iget-object v1, p0, LGZ0;->b:Ljava/lang/Runnable;

    iget-wide v2, p0, LGZ0;->c:J

    iget-object v4, p0, LGZ0;->d:Ljava/util/concurrent/TimeUnit;

    move-object v5, p1

    invoke-static/range {v0 .. v5}, LPZ0;->a(LPZ0;Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;LQZ0$b;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p1

    return-object p1
.end method
