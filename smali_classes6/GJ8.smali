.class public final LGJ8;
.super LTs7;
.source "SourceFile"


# instance fields
.field public final synthetic e:LQM8;


# direct methods
.method public constructor <init>(LQM8;LQs8;)V
    .locals 0

    iput-object p1, p0, LGJ8;->e:LQM8;

    invoke-direct {p0, p2}, LTs7;-><init>(LQs8;)V

    return-void
.end method


# virtual methods
.method public final c()V
    .locals 2

    iget-object v0, p0, LGJ8;->e:LQM8;

    iget-object v0, v0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->a()LFc8;

    move-result-object v0

    invoke-virtual {v0}, LFc8;->t()Lec8;

    move-result-object v0

    const-string v1, "Tasks have been queued for a long time"

    invoke-virtual {v0, v1}, Lec8;->a(Ljava/lang/String;)V

    return-void
.end method
