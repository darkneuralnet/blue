.class public final LLB8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LXm7;

.field public final synthetic c:J

.field public final synthetic d:I

.field public final synthetic e:J

.field public final synthetic f:Z

.field public final synthetic g:LXm7;

.field public final synthetic h:LRC8;


# direct methods
.method public constructor <init>(LRC8;LXm7;JIJZLXm7;)V
    .locals 0

    iput-object p1, p0, LLB8;->h:LRC8;

    iput-object p2, p0, LLB8;->b:LXm7;

    iput-wide p3, p0, LLB8;->c:J

    iput p5, p0, LLB8;->d:I

    iput-wide p6, p0, LLB8;->e:J

    iput-boolean p8, p0, LLB8;->f:Z

    iput-object p9, p0, LLB8;->g:LXm7;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 11

    iget-object v0, p0, LLB8;->h:LRC8;

    iget-object v1, p0, LLB8;->b:LXm7;

    invoke-virtual {v0, v1}, LRC8;->J(LXm7;)V

    iget-object v0, p0, LLB8;->h:LRC8;

    iget-wide v1, p0, LLB8;->c:J

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, LRC8;->w(JZ)V

    iget-object v4, p0, LLB8;->h:LRC8;

    iget-object v5, p0, LLB8;->b:LXm7;

    iget v6, p0, LLB8;->d:I

    iget-wide v7, p0, LLB8;->e:J

    const/4 v9, 0x1

    iget-boolean v10, p0, LLB8;->f:Z

    invoke-static/range {v4 .. v10}, LRC8;->c0(LRC8;LXm7;IJZZ)V

    invoke-static {}, Ltk9;->b()Z

    iget-object v0, p0, LLB8;->h:LRC8;

    iget-object v0, v0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->w()Lgl7;

    move-result-object v0

    const/4 v1, 0x0

    sget-object v2, La98;->p0:LL88;

    invoke-virtual {v0, v1, v2}, Lgl7;->y(Ljava/lang/String;LL88;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LLB8;->h:LRC8;

    iget-object v1, p0, LLB8;->b:LXm7;

    iget-object v2, p0, LLB8;->g:LXm7;

    invoke-static {v0, v1, v2}, LRC8;->b0(LRC8;LXm7;LXm7;)V

    :cond_0
    return-void
.end method
