.class public final LXB8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LXm7;

.field public final synthetic c:I

.field public final synthetic d:J

.field public final synthetic e:Z

.field public final synthetic f:LXm7;

.field public final synthetic g:LRC8;


# direct methods
.method public constructor <init>(LRC8;LXm7;IJZLXm7;)V
    .locals 0

    iput-object p1, p0, LXB8;->g:LRC8;

    iput-object p2, p0, LXB8;->b:LXm7;

    iput p3, p0, LXB8;->c:I

    iput-wide p4, p0, LXB8;->d:J

    iput-boolean p6, p0, LXB8;->e:Z

    iput-object p7, p0, LXB8;->f:LXm7;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 9

    iget-object v0, p0, LXB8;->g:LRC8;

    iget-object v1, p0, LXB8;->b:LXm7;

    invoke-virtual {v0, v1}, LRC8;->J(LXm7;)V

    iget-object v2, p0, LXB8;->g:LRC8;

    iget-object v3, p0, LXB8;->b:LXm7;

    iget v4, p0, LXB8;->c:I

    iget-wide v5, p0, LXB8;->d:J

    const/4 v7, 0x0

    iget-boolean v8, p0, LXB8;->e:Z

    invoke-static/range {v2 .. v8}, LRC8;->c0(LRC8;LXm7;IJZZ)V

    invoke-static {}, Ltk9;->b()Z

    iget-object v0, p0, LXB8;->g:LRC8;

    iget-object v0, v0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->w()Lgl7;

    move-result-object v0

    const/4 v1, 0x0

    sget-object v2, La98;->p0:LL88;

    invoke-virtual {v0, v1, v2}, Lgl7;->y(Ljava/lang/String;LL88;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LXB8;->g:LRC8;

    iget-object v1, p0, LXB8;->b:LXm7;

    iget-object v2, p0, LXB8;->f:LXm7;

    invoke-static {v0, v1, v2}, LRC8;->b0(LRC8;LXm7;LXm7;)V

    :cond_0
    return-void
.end method
