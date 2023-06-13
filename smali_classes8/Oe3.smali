.class public final LOe3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "Qe3",
        "Re3"
    }
    d2 = {}
    k = 0x4
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# direct methods
.method public static final a(Ljava/io/File;)LwB5;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/FileNotFoundException;
        }
    .end annotation

    invoke-static {p0}, LQe3;->b(Ljava/io/File;)LwB5;

    move-result-object p0

    return-object p0
.end method

.method public static final b()LwB5;
    .locals 1
    .annotation build Lkotlin/jvm/JvmName;
        name = "blackhole"
    .end annotation

    invoke-static {}, LRe3;->a()LwB5;

    move-result-object v0

    return-object v0
.end method

.method public static final c(LwB5;)Ln30;
    .locals 0

    invoke-static {p0}, LRe3;->b(LwB5;)Ln30;

    move-result-object p0

    return-object p0
.end method

.method public static final d(LAN5;)Lo30;
    .locals 0

    invoke-static {p0}, LRe3;->c(LAN5;)Lo30;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Ljava/lang/AssertionError;)Z
    .locals 0

    invoke-static {p0}, LQe3;->c(Ljava/lang/AssertionError;)Z

    move-result p0

    return p0
.end method

.method public static final f(Ljava/io/File;)LwB5;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/FileNotFoundException;
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    invoke-static {p0}, LQe3;->d(Ljava/io/File;)LwB5;

    move-result-object p0

    return-object p0
.end method

.method public static final g(Ljava/io/File;Z)LwB5;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/FileNotFoundException;
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    invoke-static {p0, p1}, LQe3;->e(Ljava/io/File;Z)LwB5;

    move-result-object p0

    return-object p0
.end method

.method public static final h(Ljava/io/OutputStream;)LwB5;
    .locals 0

    invoke-static {p0}, LQe3;->f(Ljava/io/OutputStream;)LwB5;

    move-result-object p0

    return-object p0
.end method

.method public static final i(Ljava/net/Socket;)LwB5;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-static {p0}, LQe3;->g(Ljava/net/Socket;)LwB5;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Ljava/io/File;ZILjava/lang/Object;)LwB5;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/FileNotFoundException;
        }
    .end annotation

    invoke-static {p0, p1, p2, p3}, LQe3;->h(Ljava/io/File;ZILjava/lang/Object;)LwB5;

    move-result-object p0

    return-object p0
.end method

.method public static final k(Ljava/io/File;)LAN5;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/FileNotFoundException;
        }
    .end annotation

    invoke-static {p0}, LQe3;->i(Ljava/io/File;)LAN5;

    move-result-object p0

    return-object p0
.end method

.method public static final l(Ljava/io/InputStream;)LAN5;
    .locals 0

    invoke-static {p0}, LQe3;->j(Ljava/io/InputStream;)LAN5;

    move-result-object p0

    return-object p0
.end method

.method public static final m(Ljava/net/Socket;)LAN5;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-static {p0}, LQe3;->k(Ljava/net/Socket;)LAN5;

    move-result-object p0

    return-object p0
.end method
