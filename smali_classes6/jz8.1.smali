.class public final Ljz8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Ljava/util/concurrent/atomic/AtomicReference;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Z

.field public final synthetic f:LRC8;


# direct methods
.method public constructor <init>(LRC8;Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    iput-object p1, p0, Ljz8;->f:LRC8;

    iput-object p2, p0, Ljz8;->b:Ljava/util/concurrent/atomic/AtomicReference;

    iput-object p4, p0, Ljz8;->c:Ljava/lang/String;

    iput-object p5, p0, Ljz8;->d:Ljava/lang/String;

    iput-boolean p6, p0, Ljz8;->e:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    iget-object v0, p0, Ljz8;->f:LRC8;

    iget-object v0, v0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->L()LQM8;

    move-result-object v1

    iget-object v2, p0, Ljz8;->b:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v3, 0x0

    iget-object v4, p0, Ljz8;->c:Ljava/lang/String;

    iget-object v5, p0, Ljz8;->d:Ljava/lang/String;

    iget-boolean v6, p0, Ljz8;->e:Z

    invoke-virtual/range {v1 .. v6}, LQM8;->W(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method
