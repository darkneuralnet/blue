.class public final Lio/reactivex/E$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/E$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation


# instance fields
.field public final b:Ljava/lang/Runnable;

.field public final c:Lio/reactivex/internal/disposables/h;

.field public final d:J

.field public e:J

.field public f:J

.field public g:J

.field public final synthetic h:Lio/reactivex/E$c;


# direct methods
.method public constructor <init>(Lio/reactivex/E$c;JLjava/lang/Runnable;JLio/reactivex/internal/disposables/h;J)V
    .locals 0

    iput-object p1, p0, Lio/reactivex/E$c$a;->h:Lio/reactivex/E$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p4, p0, Lio/reactivex/E$c$a;->b:Ljava/lang/Runnable;

    iput-object p7, p0, Lio/reactivex/E$c$a;->c:Lio/reactivex/internal/disposables/h;

    iput-wide p8, p0, Lio/reactivex/E$c$a;->d:J

    iput-wide p5, p0, Lio/reactivex/E$c$a;->f:J

    iput-wide p2, p0, Lio/reactivex/E$c$a;->g:J

    return-void
.end method


# virtual methods
.method public run()V
    .locals 12

    iget-object v0, p0, Lio/reactivex/E$c$a;->b:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    iget-object v0, p0, Lio/reactivex/E$c$a;->c:Lio/reactivex/internal/disposables/h;

    invoke-virtual {v0}, Lio/reactivex/internal/disposables/h;->e()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lio/reactivex/E$c$a;->h:Lio/reactivex/E$c;

    sget-object v1, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1}, Lio/reactivex/E$c;->a(Ljava/util/concurrent/TimeUnit;)J

    move-result-wide v2

    sget-wide v4, Lio/reactivex/E;->c:J

    add-long v6, v2, v4

    iget-wide v8, p0, Lio/reactivex/E$c$a;->f:J

    cmp-long v0, v6, v8

    const-wide/16 v6, 0x1

    if-ltz v0, :cond_1

    iget-wide v10, p0, Lio/reactivex/E$c$a;->d:J

    add-long/2addr v8, v10

    add-long/2addr v8, v4

    cmp-long v0, v2, v8

    if-ltz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-wide v4, p0, Lio/reactivex/E$c$a;->g:J

    iget-wide v8, p0, Lio/reactivex/E$c$a;->e:J

    add-long/2addr v8, v6

    iput-wide v8, p0, Lio/reactivex/E$c$a;->e:J

    mul-long/2addr v8, v10

    add-long/2addr v4, v8

    goto :goto_1

    :cond_1
    :goto_0
    iget-wide v4, p0, Lio/reactivex/E$c$a;->d:J

    add-long v8, v2, v4

    iget-wide v10, p0, Lio/reactivex/E$c$a;->e:J

    add-long/2addr v10, v6

    iput-wide v10, p0, Lio/reactivex/E$c$a;->e:J

    mul-long/2addr v4, v10

    sub-long v4, v8, v4

    iput-wide v4, p0, Lio/reactivex/E$c$a;->g:J

    move-wide v4, v8

    :goto_1
    iput-wide v2, p0, Lio/reactivex/E$c$a;->f:J

    sub-long/2addr v4, v2

    iget-object v0, p0, Lio/reactivex/E$c$a;->c:Lio/reactivex/internal/disposables/h;

    iget-object v2, p0, Lio/reactivex/E$c$a;->h:Lio/reactivex/E$c;

    invoke-virtual {v2, p0, v4, v5, v1}, Lio/reactivex/E$c;->c(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Lio/reactivex/disposables/c;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/internal/disposables/h;->a(Lio/reactivex/disposables/c;)Z

    :cond_2
    return-void
.end method
