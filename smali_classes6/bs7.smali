.class public final Lbs7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LQs8;

.field public final synthetic c:LTs7;


# direct methods
.method public constructor <init>(LTs7;LQs8;)V
    .locals 0

    iput-object p1, p0, Lbs7;->c:LTs7;

    iput-object p2, p0, Lbs7;->b:LQs8;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lbs7;->b:LQs8;

    invoke-interface {v0}, LQs8;->C()LFg7;

    invoke-static {}, LFg7;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbs7;->b:LQs8;

    invoke-interface {v0}, LQs8;->c()Ldn8;

    move-result-object v0

    invoke-virtual {v0, p0}, Ldn8;->w(Ljava/lang/Runnable;)V

    return-void

    :cond_0
    iget-object v0, p0, Lbs7;->c:LTs7;

    invoke-virtual {v0}, LTs7;->e()Z

    move-result v0

    iget-object v1, p0, Lbs7;->c:LTs7;

    const-wide/16 v2, 0x0

    invoke-static {v1, v2, v3}, LTs7;->a(LTs7;J)V

    if-eqz v0, :cond_1

    iget-object v0, p0, Lbs7;->c:LTs7;

    invoke-virtual {v0}, LTs7;->c()V

    :cond_1
    return-void
.end method
