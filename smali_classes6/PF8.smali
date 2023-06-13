.class public final LPF8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LwE8;

.field public final synthetic c:J

.field public final synthetic d:LnG8;


# direct methods
.method public constructor <init>(LnG8;LwE8;J)V
    .locals 0

    iput-object p1, p0, LPF8;->d:LnG8;

    iput-object p2, p0, LPF8;->b:LwE8;

    iput-wide p3, p0, LPF8;->c:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, LPF8;->d:LnG8;

    iget-object v1, p0, LPF8;->b:LwE8;

    const/4 v2, 0x0

    iget-wide v3, p0, LPF8;->c:J

    invoke-static {v0, v1, v2, v3, v4}, LnG8;->u(LnG8;LwE8;ZJ)V

    iget-object v0, p0, LPF8;->d:LnG8;

    const/4 v1, 0x0

    iput-object v1, v0, LnG8;->e:LwE8;

    iget-object v0, v0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->L()LQM8;

    move-result-object v0

    invoke-virtual {v0, v1}, LQM8;->r(LwE8;)V

    return-void
.end method
