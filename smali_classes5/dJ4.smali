.class public final LdJ4;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001B\u0019\u0012\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0008R$\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00028\u0006@BX\u0086\u000e\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u0008\u001a\u0004\u0008\u000b\u0010\u000cR\u0016\u0010\u000e\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008R$\u0010\u0011\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00028\u0006@BX\u0086\u000e\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u0008\u001a\u0004\u0008\u0010\u0010\u000cR\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018\u00a8\u0006\u001c"
    }
    d2 = {
        "LdJ4;",
        "",
        "",
        "size",
        "",
        "a",
        "b",
        "c",
        "J",
        "threshold",
        "<set-?>",
        "getProgress",
        "()J",
        "progress",
        "lastReportedProgress",
        "d",
        "getMaxProgress",
        "maxProgress",
        "Landroid/os/Handler;",
        "e",
        "Landroid/os/Handler;",
        "callbackHandler",
        "Lcom/facebook/GraphRequest;",
        "f",
        "Lcom/facebook/GraphRequest;",
        "request",
        "<init>",
        "(Landroid/os/Handler;Lcom/facebook/GraphRequest;)V",
        "facebook-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x0
    }
.end annotation


# instance fields
.field public final a:J

.field public b:J

.field public c:J

.field public d:J

.field public final e:Landroid/os/Handler;

.field public final f:Lcom/facebook/GraphRequest;


# direct methods
.method public constructor <init>(Landroid/os/Handler;Lcom/facebook/GraphRequest;)V
    .locals 1

    const-string v0, "request"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LdJ4;->e:Landroid/os/Handler;

    iput-object p2, p0, LdJ4;->f:Lcom/facebook/GraphRequest;

    invoke-static {}, Lcom/facebook/a;->t()J

    move-result-wide p1

    iput-wide p1, p0, LdJ4;->a:J

    return-void
.end method


# virtual methods
.method public final a(J)V
    .locals 4

    iget-wide v0, p0, LdJ4;->b:J

    add-long/2addr v0, p1

    iput-wide v0, p0, LdJ4;->b:J

    iget-wide p1, p0, LdJ4;->c:J

    iget-wide v2, p0, LdJ4;->a:J

    add-long/2addr p1, v2

    cmp-long p1, v0, p1

    if-gez p1, :cond_0

    iget-wide p1, p0, LdJ4;->d:J

    cmp-long p1, v0, p1

    if-ltz p1, :cond_1

    :cond_0
    invoke-virtual {p0}, LdJ4;->c()V

    :cond_1
    return-void
.end method

.method public final b(J)V
    .locals 2

    iget-wide v0, p0, LdJ4;->d:J

    add-long/2addr v0, p1

    iput-wide v0, p0, LdJ4;->d:J

    return-void
.end method

.method public final c()V
    .locals 8

    iget-wide v0, p0, LdJ4;->b:J

    iget-wide v2, p0, LdJ4;->c:J

    cmp-long v0, v0, v2

    if-lez v0, :cond_1

    iget-object v0, p0, LdJ4;->f:Lcom/facebook/GraphRequest;

    invoke-virtual {v0}, Lcom/facebook/GraphRequest;->m()Lcom/facebook/GraphRequest$b;

    move-result-object v2

    iget-wide v5, p0, LdJ4;->d:J

    const-wide/16 v0, 0x0

    cmp-long v0, v5, v0

    if-lez v0, :cond_1

    instance-of v0, v2, Lcom/facebook/GraphRequest$e;

    if-eqz v0, :cond_1

    iget-wide v3, p0, LdJ4;->b:J

    iget-object v0, p0, LdJ4;->e:Landroid/os/Handler;

    if-eqz v0, :cond_0

    new-instance v7, LdJ4$a;

    move-object v1, v7

    invoke-direct/range {v1 .. v6}, LdJ4$a;-><init>(Lcom/facebook/GraphRequest$b;JJ)V

    invoke-virtual {v0, v7}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_0
    check-cast v2, Lcom/facebook/GraphRequest$e;

    invoke-interface {v2, v3, v4, v5, v6}, Lcom/facebook/GraphRequest$e;->b(JJ)V

    :goto_0
    iget-wide v0, p0, LdJ4;->b:J

    iput-wide v0, p0, LdJ4;->c:J

    :cond_1
    return-void
.end method
