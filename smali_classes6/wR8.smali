.class public final LwR8;
.super LTs7;
.source "SourceFile"


# instance fields
.field public final synthetic e:LGR8;


# direct methods
.method public constructor <init>(LGR8;LQs8;)V
    .locals 0

    iput-object p1, p0, LwR8;->e:LGR8;

    invoke-direct {p0, p2}, LTs7;-><init>(LQs8;)V

    return-void
.end method


# virtual methods
.method public final c()V
    .locals 2

    iget-object v0, p0, LwR8;->e:LGR8;

    invoke-virtual {v0}, LGR8;->j()V

    iget-object v0, p0, LwR8;->e:LGR8;

    iget-object v0, v0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->a()LFc8;

    move-result-object v0

    invoke-virtual {v0}, LFc8;->s()Lec8;

    move-result-object v0

    const-string v1, "Starting upload from DelayedRunnable"

    invoke-virtual {v0, v1}, Lec8;->a(Ljava/lang/String;)V

    iget-object v0, p0, LwR8;->e:LGR8;

    iget-object v0, v0, LIR8;->b:LhV8;

    invoke-virtual {v0}, LhV8;->B()V

    return-void
.end method
