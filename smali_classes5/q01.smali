.class public final Lq01;
.super LPx1;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0008\u0010\u0008\u001a\u00020\u0007H\u0016R\u0016\u0010\u000c\u001a\u00020\t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u000b\u00a8\u0006\u0011"
    }
    d2 = {
        "Lq01;",
        "LPx1;",
        "Li30;",
        "sink",
        "",
        "byteCount",
        "read",
        "",
        "close",
        "",
        "b",
        "Z",
        "shouldDeplete",
        "LAN5;",
        "delegate",
        "<init>",
        "(LAN5;)V",
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
.field public b:Z


# direct methods
.method public constructor <init>(LAN5;)V
    .locals 1

    const-string v0, "delegate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LPx1;-><init>(LAN5;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lq01;->b:Z

    return-void
.end method


# virtual methods
.method public close()V
    .locals 3

    iget-boolean v0, p0, Lq01;->b:Z

    if-eqz v0, :cond_0

    :try_start_0
    invoke-virtual {p0}, LPx1;->delegate()LAN5;

    move-result-object v0

    invoke-static {v0}, LOe3;->d(LAN5;)Lo30;

    move-result-object v0

    invoke-static {}, LOe3;->b()LwB5;

    move-result-object v1

    invoke-interface {v0, v1}, Lo30;->Z2(LwB5;)J
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    sget-object v1, LEx2;->a:LEx2$a;

    const-string v2, "An error occurred while depleting the source"

    invoke-virtual {v1, v2, v0}, LEx2$a;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    :goto_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lq01;->b:Z

    invoke-super {p0}, LPx1;->close()V

    return-void
.end method

.method public read(Li30;J)J
    .locals 3

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    :try_start_0
    invoke-super {p0, p1, p2, p3}, LPx1;->read(Li30;J)J

    move-result-wide p1

    const-wide/16 v1, -0x1

    cmp-long p3, p1, v1

    if-nez p3, :cond_0

    iput-boolean v0, p0, Lq01;->b:Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-wide p1

    :catch_0
    move-exception p1

    iput-boolean v0, p0, Lq01;->b:Z

    throw p1
.end method
