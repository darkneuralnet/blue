.class public final Lh06;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LAN5;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0002\u0008\u0006\u0008\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u0001\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0008\u0010\u0008\u001a\u00020\u0007H\u0016J\u0008\u0010\n\u001a\u00020\tH\u0016J\u0018\u0010\u000c\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0004H\u0002J\u0008\u0010\r\u001a\u00020\u0007H\u0002R\u0014\u0010\u000f\u001a\u00020\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001d"
    }
    d2 = {
        "Lh06;",
        "LAN5;",
        "Li30;",
        "sink",
        "",
        "byteCount",
        "read",
        "",
        "close",
        "LJ46;",
        "timeout",
        "bytesRead",
        "a",
        "b",
        "LAN5;",
        "upstream",
        "LwB5;",
        "c",
        "LwB5;",
        "sideStream",
        "d",
        "Li30;",
        "tempBuffer",
        "",
        "e",
        "Z",
        "isFailure",
        "<init>",
        "(LAN5;LwB5;)V",
        "com.github.ChuckerTeam.Chucker.library"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final b:LAN5;

.field public final c:LwB5;

.field public final d:Li30;

.field public e:Z


# direct methods
.method public constructor <init>(LAN5;LwB5;)V
    .locals 1

    const-string v0, "upstream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sideStream"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh06;->b:LAN5;

    iput-object p2, p0, Lh06;->c:LwB5;

    new-instance p1, Li30;

    invoke-direct {p1}, Li30;-><init>()V

    iput-object p1, p0, Lh06;->d:Li30;

    return-void
.end method


# virtual methods
.method public final a(Li30;J)V
    .locals 8

    invoke-virtual {p1}, Li30;->size()J

    move-result-wide v0

    sub-long v4, v0, p2

    iget-object v3, p0, Lh06;->d:Li30;

    move-object v2, p1

    move-wide v6, p2

    invoke-virtual/range {v2 .. v7}, Li30;->l(Li30;JJ)Li30;

    :try_start_0
    iget-object p1, p0, Lh06;->c:LwB5;

    iget-object v0, p0, Lh06;->d:Li30;

    invoke-interface {p1, v0, p2, p3}, LwB5;->write(Li30;J)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 p1, 0x1

    iput-boolean p1, p0, Lh06;->e:Z

    invoke-virtual {p0}, Lh06;->b()V

    :goto_0
    return-void
.end method

.method public final b()V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lh06;->c:LwB5;

    invoke-interface {v0}, LwB5;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lh06;->e:Z

    :goto_0
    return-void
.end method

.method public close()V
    .locals 1

    invoke-virtual {p0}, Lh06;->b()V

    iget-object v0, p0, Lh06;->b:LAN5;

    invoke-interface {v0}, LAN5;->close()V

    return-void
.end method

.method public read(Li30;J)J
    .locals 3

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lh06;->b:LAN5;

    invoke-interface {v0, p1, p2, p3}, LAN5;->read(Li30;J)J

    move-result-wide p2

    const-wide/16 v0, -0x1

    cmp-long v2, p2, v0

    if-nez v2, :cond_0

    invoke-virtual {p0}, Lh06;->b()V

    return-wide v0

    :cond_0
    iget-boolean v0, p0, Lh06;->e:Z

    if-nez v0, :cond_1

    invoke-virtual {p0, p1, p2, p3}, Lh06;->a(Li30;J)V

    :cond_1
    return-wide p2
.end method

.method public timeout()LJ46;
    .locals 1

    iget-object v0, p0, Lh06;->b:LAN5;

    invoke-interface {v0}, LAN5;->timeout()LJ46;

    move-result-object v0

    return-object v0
.end method
