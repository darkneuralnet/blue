.class public final LjJ8;
.super LTs7;
.source "SourceFile"


# instance fields
.field public final synthetic e:LQM8;


# direct methods
.method public constructor <init>(LQM8;LQs8;)V
    .locals 0

    iput-object p1, p0, LjJ8;->e:LQM8;

    invoke-direct {p0, p2}, LTs7;-><init>(LQs8;)V

    return-void
.end method


# virtual methods
.method public final c()V
    .locals 3

    iget-object v0, p0, LjJ8;->e:LQM8;

    invoke-virtual {v0}, Lns8;->e()V

    invoke-virtual {v0}, LQM8;->w()Z

    move-result v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    iget-object v1, v0, Lns8;->a:LPn8;

    invoke-virtual {v1}, LPn8;->a()LFc8;

    move-result-object v1

    invoke-virtual {v1}, LFc8;->s()Lec8;

    move-result-object v1

    const-string v2, "Inactivity, disconnecting from the service"

    invoke-virtual {v1, v2}, Lec8;->a(Ljava/lang/String;)V

    invoke-virtual {v0}, LQM8;->Q()V

    return-void
.end method
