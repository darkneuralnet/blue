.class public final LVH4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LwB5;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LVH4$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u000b\n\u0002\u0008\u000b\u0008\u0000\u0018\u00002\u00020\u0001:\u0001\u000eB#\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0008\u0008\u0002\u0010\u001a\u001a\u00020\u0004\u00a2\u0006\u0004\u0008&\u0010\'J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0008\u0010\u0008\u001a\u00020\u0006H\u0016J\u0008\u0010\t\u001a\u00020\u0006H\u0016J\u0008\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000cH\u0002J\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u0006H\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u0019R\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001fR\u0016\u0010\"\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008!\u0010\u001fR\u0018\u0010%\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008#\u0010$\u00a8\u0006("
    }
    d2 = {
        "LVH4;",
        "LwB5;",
        "Li30;",
        "source",
        "",
        "byteCount",
        "",
        "write",
        "flush",
        "close",
        "LJ46;",
        "timeout",
        "Ljava/io/IOException;",
        "exception",
        "a",
        "b",
        "()Lkotlin/Unit;",
        "Ljava/io/File;",
        "Ljava/io/File;",
        "downstreamFile",
        "LVH4$a;",
        "c",
        "LVH4$a;",
        "callback",
        "d",
        "J",
        "writeByteLimit",
        "e",
        "totalByteCount",
        "",
        "f",
        "Z",
        "isFailure",
        "g",
        "isClosed",
        "h",
        "LwB5;",
        "downstream",
        "<init>",
        "(Ljava/io/File;LVH4$a;J)V",
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
.field public final b:Ljava/io/File;

.field public final c:LVH4$a;

.field public final d:J

.field public e:J

.field public f:Z

.field public g:Z

.field public h:LwB5;


# direct methods
.method public constructor <init>(Ljava/io/File;LVH4$a;J)V
    .locals 2

    const-string v0, "callback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LVH4;->b:Ljava/io/File;

    iput-object p2, p0, LVH4;->c:LVH4$a;

    iput-wide p3, p0, LVH4;->d:J

    const/4 p2, 0x0

    if-eqz p1, :cond_0

    const/4 p3, 0x0

    const/4 p4, 0x1

    :try_start_0
    invoke-static {p1, p3, p4, p2}, LOe3;->j(Ljava/io/File;ZILjava/lang/Object;)LwB5;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-object p2, p1

    goto :goto_0

    :catch_0
    move-exception p1

    new-instance p3, Ljava/io/IOException;

    iget-object p4, p0, LVH4;->b:Ljava/io/File;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Failed to use file "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p4, " by Chucker"

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    invoke-direct {p3, p4, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {p0, p3}, LVH4;->a(Ljava/io/IOException;)V

    :cond_0
    :goto_0
    iput-object p2, p0, LVH4;->h:LwB5;

    return-void
.end method


# virtual methods
.method public final a(Ljava/io/IOException;)V
    .locals 2

    iget-boolean v0, p0, LVH4;->f:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, LVH4;->f:Z

    invoke-virtual {p0}, LVH4;->b()Lkotlin/Unit;

    iget-object v0, p0, LVH4;->c:LVH4$a;

    iget-object v1, p0, LVH4;->b:Ljava/io/File;

    invoke-interface {v0, v1, p1}, LVH4$a;->b(Ljava/io/File;Ljava/io/IOException;)V

    :cond_0
    return-void
.end method

.method public final b()Lkotlin/Unit;
    .locals 1

    :try_start_0
    iget-object v0, p0, LVH4;->h:LwB5;

    if-eqz v0, :cond_0

    invoke-interface {v0}, LwB5;->close()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {p0, v0}, LVH4;->a(Ljava/io/IOException;)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :goto_0
    return-object v0
.end method

.method public close()V
    .locals 4

    iget-boolean v0, p0, LVH4;->g:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, LVH4;->g:Z

    invoke-virtual {p0}, LVH4;->b()Lkotlin/Unit;

    iget-object v0, p0, LVH4;->c:LVH4$a;

    iget-object v1, p0, LVH4;->b:Ljava/io/File;

    iget-wide v2, p0, LVH4;->e:J

    invoke-interface {v0, v1, v2, v3}, LVH4$a;->a(Ljava/io/File;J)V

    return-void
.end method

.method public flush()V
    .locals 1

    iget-boolean v0, p0, LVH4;->f:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    :try_start_0
    iget-object v0, p0, LVH4;->h:LwB5;

    if-eqz v0, :cond_1

    invoke-interface {v0}, LwB5;->flush()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {p0, v0}, LVH4;->a(Ljava/io/IOException;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public timeout()LJ46;
    .locals 1

    iget-object v0, p0, LVH4;->h:LwB5;

    if-eqz v0, :cond_0

    invoke-interface {v0}, LwB5;->timeout()LJ46;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    sget-object v0, LJ46;->NONE:LJ46;

    :cond_1
    return-object v0
.end method

.method public write(Li30;J)V
    .locals 6

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-wide v0, p0, LVH4;->e:J

    add-long v2, v0, p2

    iput-wide v2, p0, LVH4;->e:J

    iget-boolean v2, p0, LVH4;->f:Z

    if-nez v2, :cond_3

    iget-wide v2, p0, LVH4;->d:J

    cmp-long v4, v0, v2

    if-ltz v4, :cond_0

    goto :goto_1

    :cond_0
    add-long v4, v0, p2

    cmp-long v4, v4, v2

    if-gtz v4, :cond_1

    goto :goto_0

    :cond_1
    sub-long p2, v2, v0

    :goto_0
    const-wide/16 v0, 0x0

    cmp-long v0, p2, v0

    if-nez v0, :cond_2

    return-void

    :cond_2
    :try_start_0
    iget-object v0, p0, LVH4;->h:LwB5;

    if-eqz v0, :cond_3

    invoke-interface {v0, p1, p2, p3}, LwB5;->write(Li30;J)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    invoke-virtual {p0, p1}, LVH4;->a(Ljava/io/IOException;)V

    :cond_3
    :goto_1
    return-void
.end method
