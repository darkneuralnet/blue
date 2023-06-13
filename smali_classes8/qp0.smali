.class public Lqp0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqp0$b;,
        Lqp0$a;
    }
.end annotation


# instance fields
.field public a:LyB0;

.field public b:Lqp0$a;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lqp0$a;

    invoke-direct {v0}, Lqp0$a;-><init>()V

    iput-object v0, p0, Lqp0;->b:Lqp0$a;

    return-void
.end method


# virtual methods
.method public a(LWB1;)V
    .locals 1

    iget-object v0, p0, Lqp0;->b:Lqp0$a;

    invoke-virtual {p1, v0}, LWB1;->d(LCB0;)V

    iget-object p1, p0, Lqp0;->b:Lqp0$a;

    invoke-virtual {p1}, Lqp0$a;->b()LyB0;

    move-result-object p1

    iput-object p1, p0, Lqp0;->a:LyB0;

    return-void
.end method

.method public b(LWB1;)V
    .locals 2

    new-instance v0, Lqp0$b;

    iget-object v1, p0, Lqp0;->a:LyB0;

    invoke-direct {v0, v1}, Lqp0$b;-><init>(LyB0;)V

    invoke-virtual {p1, v0}, LWB1;->e(LGB0;)V

    invoke-virtual {p1}, LWB1;->H()V

    return-void
.end method

.method public c(LWB1;)LWB1;
    .locals 5

    iget-object v0, p0, Lqp0;->a:LyB0;

    iget-wide v1, v0, LyB0;->b:D

    const-wide/16 v3, 0x0

    cmpl-double v1, v1, v3

    if-nez v1, :cond_0

    iget-wide v1, v0, LyB0;->c:D

    cmpl-double v1, v1, v3

    if-nez v1, :cond_0

    return-object p1

    :cond_0
    new-instance v1, LyB0;

    invoke-direct {v1, v0}, LyB0;-><init>(LyB0;)V

    iget-wide v2, v1, LyB0;->b:D

    neg-double v2, v2

    iput-wide v2, v1, LyB0;->b:D

    iget-wide v2, v1, LyB0;->c:D

    neg-double v2, v2

    iput-wide v2, v1, LyB0;->c:D

    new-instance v0, Lqp0$b;

    invoke-direct {v0, v1}, Lqp0$b;-><init>(LyB0;)V

    invoke-virtual {p1, v0}, LWB1;->e(LGB0;)V

    invoke-virtual {p1}, LWB1;->H()V

    return-object p1
.end method
