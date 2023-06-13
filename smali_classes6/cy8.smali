.class public final Lcy8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:J

.field public final synthetic c:LRC8;


# direct methods
.method public constructor <init>(LRC8;J)V
    .locals 0

    iput-object p1, p0, Lcy8;->c:LRC8;

    iput-wide p2, p0, Lcy8;->b:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lcy8;->c:LRC8;

    iget-wide v1, p0, Lcy8;->b:J

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v2, v3}, LRC8;->w(JZ)V

    iget-object v0, p0, Lcy8;->c:LRC8;

    iget-object v0, v0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->L()LQM8;

    move-result-object v0

    new-instance v1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    invoke-virtual {v0, v1}, LQM8;->S(Ljava/util/concurrent/atomic/AtomicReference;)V

    return-void
.end method
