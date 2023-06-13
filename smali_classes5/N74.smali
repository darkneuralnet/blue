.class public final LN74;
.super Ljava/io/FilterOutputStream;
.source "SourceFile"

# interfaces
.implements LZI4;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\t\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010$\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u00012\u00020\u0002B3\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010\"\u001a\u00020\u001f\u0012\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001b0#\u0012\u0006\u0010\'\u001a\u00020\u000f\u00a2\u0006\u0004\u0008*\u0010+J\u0012\u0010\u0006\u001a\u00020\u00052\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u0007H\u0016J \u0010\t\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000c\u001a\u00020\nH\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\nH\u0016J\u0008\u0010\u000e\u001a\u00020\u0005H\u0016J\u0010\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u0008\u0010\u0012\u001a\u00020\u0005H\u0002R\u0014\u0010\u0015\u001a\u00020\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R$\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u000f8\u0006@BX\u0086\u000e\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0014\u001a\u0004\u0008\u0017\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0014R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008 \u0010!R \u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001b0#8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010$R\u0017\u0010\'\u001a\u00020\u000f8\u0006\u00a2\u0006\u000c\n\u0004\u0008&\u0010\u0014\u001a\u0004\u0008 \u0010\u0018\u00a8\u0006,"
    }
    d2 = {
        "LN74;",
        "Ljava/io/FilterOutputStream;",
        "LZI4;",
        "Lcom/facebook/GraphRequest;",
        "request",
        "",
        "a",
        "",
        "buffer",
        "write",
        "",
        "offset",
        "length",
        "oneByte",
        "close",
        "",
        "size",
        "c",
        "g",
        "b",
        "J",
        "threshold",
        "<set-?>",
        "d",
        "()J",
        "batchProgress",
        "lastReportedProgress",
        "LdJ4;",
        "e",
        "LdJ4;",
        "currentRequestProgress",
        "LVD1;",
        "f",
        "LVD1;",
        "requests",
        "",
        "Ljava/util/Map;",
        "progressMap",
        "h",
        "maxProgress",
        "Ljava/io/OutputStream;",
        "out",
        "<init>",
        "(Ljava/io/OutputStream;LVD1;Ljava/util/Map;J)V",
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
.field public final b:J

.field public c:J

.field public d:J

.field public e:LdJ4;

.field public final f:LVD1;

.field public final g:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/facebook/GraphRequest;",
            "LdJ4;",
            ">;"
        }
    .end annotation
.end field

.field public final h:J


# direct methods
.method public constructor <init>(Ljava/io/OutputStream;LVD1;Ljava/util/Map;J)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/OutputStream;",
            "LVD1;",
            "Ljava/util/Map<",
            "Lcom/facebook/GraphRequest;",
            "LdJ4;",
            ">;J)V"
        }
    .end annotation

    const-string v0, "out"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "requests"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "progressMap"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Ljava/io/FilterOutputStream;-><init>(Ljava/io/OutputStream;)V

    iput-object p2, p0, LN74;->f:LVD1;

    iput-object p3, p0, LN74;->g:Ljava/util/Map;

    iput-wide p4, p0, LN74;->h:J

    invoke-static {}, Lcom/facebook/a;->t()J

    move-result-wide p1

    iput-wide p1, p0, LN74;->b:J

    return-void
.end method

.method public static final synthetic b(LN74;)LVD1;
    .locals 0

    iget-object p0, p0, LN74;->f:LVD1;

    return-object p0
.end method


# virtual methods
.method public a(Lcom/facebook/GraphRequest;)V
    .locals 1

    if-eqz p1, :cond_0

    iget-object v0, p0, LN74;->g:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LdJ4;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, LN74;->e:LdJ4;

    return-void
.end method

.method public final c(J)V
    .locals 4

    iget-object v0, p0, LN74;->e:LdJ4;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, LdJ4;->a(J)V

    :cond_0
    iget-wide v0, p0, LN74;->c:J

    add-long/2addr v0, p1

    iput-wide v0, p0, LN74;->c:J

    iget-wide p1, p0, LN74;->d:J

    iget-wide v2, p0, LN74;->b:J

    add-long/2addr p1, v2

    cmp-long p1, v0, p1

    if-gez p1, :cond_1

    iget-wide p1, p0, LN74;->h:J

    cmp-long p1, v0, p1

    if-ltz p1, :cond_2

    :cond_1
    invoke-virtual {p0}, LN74;->g()V

    :cond_2
    return-void
.end method

.method public close()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-super {p0}, Ljava/io/FilterOutputStream;->close()V

    iget-object v0, p0, LN74;->g:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LdJ4;

    invoke-virtual {v1}, LdJ4;->c()V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LN74;->g()V

    return-void
.end method

.method public final d()J
    .locals 2

    iget-wide v0, p0, LN74;->c:J

    return-wide v0
.end method

.method public final f()J
    .locals 2

    iget-wide v0, p0, LN74;->h:J

    return-wide v0
.end method

.method public final g()V
    .locals 10

    iget-wide v0, p0, LN74;->c:J

    iget-wide v2, p0, LN74;->d:J

    cmp-long v0, v0, v2

    if-lez v0, :cond_3

    iget-object v0, p0, LN74;->f:LVD1;

    invoke-virtual {v0}, LVD1;->w()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LVD1$a;

    instance-of v2, v1, LVD1$c;

    if-eqz v2, :cond_0

    iget-object v2, p0, LN74;->f:LVD1;

    invoke-virtual {v2}, LVD1;->v()Landroid/os/Handler;

    move-result-object v2

    if-eqz v2, :cond_1

    new-instance v3, LN74$a;

    invoke-direct {v3, p0, v1}, LN74$a;-><init>(LN74;LVD1$a;)V

    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_1
    move-object v4, v1

    check-cast v4, LVD1$c;

    iget-object v5, p0, LN74;->f:LVD1;

    iget-wide v6, p0, LN74;->c:J

    iget-wide v8, p0, LN74;->h:J

    invoke-interface/range {v4 .. v9}, LVD1$c;->b(LVD1;JJ)V

    goto :goto_0

    :cond_2
    iget-wide v0, p0, LN74;->c:J

    iput-wide v0, p0, LN74;->d:J

    :cond_3
    return-void
.end method

.method public write(I)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, Ljava/io/FilterOutputStream;->out:Ljava/io/OutputStream;

    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write(I)V

    const-wide/16 v0, 0x1

    invoke-virtual {p0, v0, v1}, LN74;->c(J)V

    return-void
.end method

.method public write([B)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "buffer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ljava/io/FilterOutputStream;->out:Ljava/io/OutputStream;

    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write([B)V

    array-length p1, p1

    int-to-long v0, p1

    invoke-virtual {p0, v0, v1}, LN74;->c(J)V

    return-void
.end method

.method public write([BII)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "buffer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ljava/io/FilterOutputStream;->out:Ljava/io/OutputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/OutputStream;->write([BII)V

    int-to-long p1, p3

    invoke-virtual {p0, p1, p2}, LN74;->c(J)V

    return-void
.end method
