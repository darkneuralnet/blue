.class public LF73;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ly73;

.field public final b:LYD2;


# direct methods
.method public constructor <init>(Ly73;LYD2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LF73;->a:Ly73;

    iput-object p2, p0, LF73;->b:LYD2;

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)LrD2;
    .locals 3

    const/4 v0, 0x0

    if-eqz p3, :cond_3

    iget-object v1, p0, LF73;->a:Ly73;

    if-nez v1, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v1, p2}, Ly73;->a(Ljava/lang/String;)Landroid/util/Pair;

    move-result-object p2

    if-nez p2, :cond_1

    return-object v0

    :cond_1
    iget-object v1, p2, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, Lkl1;

    iget-object p2, p2, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast p2, Ljava/io/InputStream;

    sget-object v2, Lkl1;->d:Lkl1;

    if-ne v1, v2, :cond_2

    new-instance v1, Ljava/util/zip/ZipInputStream;

    invoke-direct {v1, p2}, Ljava/util/zip/ZipInputStream;-><init>(Ljava/io/InputStream;)V

    invoke-static {p1, v1, p3}, LAD2;->y(Landroid/content/Context;Ljava/util/zip/ZipInputStream;Ljava/lang/String;)LbE2;

    move-result-object p1

    goto :goto_0

    :cond_2
    invoke-static {p2, p3}, LAD2;->o(Ljava/io/InputStream;Ljava/lang/String;)LbE2;

    move-result-object p1

    :goto_0
    invoke-virtual {p1}, LbE2;->b()Ljava/lang/Object;

    move-result-object p2

    if-eqz p2, :cond_3

    invoke-virtual {p1}, LbE2;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LrD2;

    return-object p1

    :cond_3
    :goto_1
    return-object v0
.end method

.method public final b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)LbE2;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "LbE2<",
            "LrD2;",
            ">;"
        }
    .end annotation

    const-string v0, "LottieFetchResult close failed "

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Fetching "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, LDx2;->a(Ljava/lang/String;)V

    const/4 v1, 0x0

    :try_start_0
    iget-object v2, p0, LF73;->b:LYD2;

    invoke-interface {v2, p2}, LYD2;->a(Ljava/lang/String;)LSD2;

    move-result-object v1

    invoke-interface {v1}, LSD2;->isSuccessful()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, LSD2;->f2()Ljava/io/InputStream;

    move-result-object v6

    invoke-interface {v1}, LSD2;->Z1()Ljava/lang/String;

    move-result-object v7

    move-object v3, p0

    move-object v4, p1

    move-object v5, p2

    move-object v8, p3

    invoke-virtual/range {v3 .. v8}, LF73;->d(Landroid/content/Context;Ljava/lang/String;Ljava/io/InputStream;Ljava/lang/String;Ljava/lang/String;)LbE2;

    move-result-object p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Completed fetch from network. Success: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, LbE2;->b()Ljava/lang/Object;

    move-result-object p3

    if-eqz p3, :cond_0

    const/4 p3, 0x1

    goto :goto_0

    :cond_0
    const/4 p3, 0x0

    :goto_0
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, LDx2;->a(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-interface {v1}, Ljava/io/Closeable;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :catch_0
    move-exception p2

    invoke-static {v0, p2}, LDx2;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_1
    return-object p1

    :cond_1
    :try_start_2
    new-instance p1, LbE2;

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-interface {v1}, LSD2;->j()Ljava/lang/String;

    move-result-object p3

    invoke-direct {p2, p3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, p2}, LbE2;-><init>(Ljava/lang/Throwable;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    invoke-interface {v1}, Ljava/io/Closeable;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    goto :goto_2

    :catch_1
    move-exception p2

    invoke-static {v0, p2}, LDx2;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_2
    return-object p1

    :catchall_0
    move-exception p1

    goto :goto_4

    :catch_2
    move-exception p1

    :try_start_4
    new-instance p2, LbE2;

    invoke-direct {p2, p1}, LbE2;-><init>(Ljava/lang/Throwable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    if-eqz v1, :cond_2

    :try_start_5
    invoke-interface {v1}, Ljava/io/Closeable;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3

    goto :goto_3

    :catch_3
    move-exception p1

    invoke-static {v0, p1}, LDx2;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_2
    :goto_3
    return-object p2

    :goto_4
    if-eqz v1, :cond_3

    :try_start_6
    invoke-interface {v1}, Ljava/io/Closeable;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_4

    goto :goto_5

    :catch_4
    move-exception p2

    invoke-static {v0, p2}, LDx2;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3
    :goto_5
    throw p1
.end method

.method public c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)LbE2;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "LbE2<",
            "LrD2;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2, p3}, LF73;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)LrD2;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance p1, LbE2;

    invoke-direct {p1, v0}, LbE2;-><init>(Ljava/lang/Object;)V

    return-object p1

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Animation for "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " not found in cache. Fetching from network."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LDx2;->a(Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2, p3}, LF73;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)LbE2;

    move-result-object p1

    return-object p1
.end method

.method public final d(Landroid/content/Context;Ljava/lang/String;Ljava/io/InputStream;Ljava/lang/String;Ljava/lang/String;)LbE2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/io/InputStream;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "LbE2<",
            "LrD2;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    if-nez p4, :cond_0

    const-string p4, "application/json"

    :cond_0
    const-string v0, "application/zip"

    invoke-virtual {p4, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "application/x-zip"

    invoke-virtual {p4, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "application/x-zip-compressed"

    invoke-virtual {p4, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p4

    if-nez p4, :cond_2

    const-string p4, "\\?"

    invoke-virtual {p2, p4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p4

    const/4 v0, 0x0

    aget-object p4, p4, v0

    const-string v0, ".lottie"

    invoke-virtual {p4, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p4

    if-eqz p4, :cond_1

    goto :goto_0

    :cond_1
    const-string p1, "Received json response."

    invoke-static {p1}, LDx2;->a(Ljava/lang/String;)V

    sget-object p1, Lkl1;->c:Lkl1;

    invoke-virtual {p0, p2, p3, p5}, LF73;->e(Ljava/lang/String;Ljava/io/InputStream;Ljava/lang/String;)LbE2;

    move-result-object p3

    goto :goto_1

    :cond_2
    :goto_0
    const-string p4, "Handling zip response."

    invoke-static {p4}, LDx2;->a(Ljava/lang/String;)V

    sget-object p4, Lkl1;->d:Lkl1;

    invoke-virtual {p0, p1, p2, p3, p5}, LF73;->f(Landroid/content/Context;Ljava/lang/String;Ljava/io/InputStream;Ljava/lang/String;)LbE2;

    move-result-object p3

    move-object p1, p4

    :goto_1
    if-eqz p5, :cond_3

    invoke-virtual {p3}, LbE2;->b()Ljava/lang/Object;

    move-result-object p4

    if-eqz p4, :cond_3

    iget-object p4, p0, LF73;->a:Ly73;

    if-eqz p4, :cond_3

    invoke-virtual {p4, p2, p1}, Ly73;->e(Ljava/lang/String;Lkl1;)V

    :cond_3
    return-object p3
.end method

.method public final e(Ljava/lang/String;Ljava/io/InputStream;Ljava/lang/String;)LbE2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/io/InputStream;",
            "Ljava/lang/String;",
            ")",
            "LbE2<",
            "LrD2;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    if-eqz p3, :cond_1

    iget-object p3, p0, LF73;->a:Ly73;

    if-nez p3, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Lkl1;->c:Lkl1;

    invoke-virtual {p3, p1, p2, v0}, Ly73;->f(Ljava/lang/String;Ljava/io/InputStream;Lkl1;)Ljava/io/File;

    move-result-object p2

    new-instance p3, Ljava/io/FileInputStream;

    invoke-virtual {p2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p3, p2}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V

    invoke-static {p3, p1}, LAD2;->o(Ljava/io/InputStream;Ljava/lang/String;)LbE2;

    move-result-object p1

    return-object p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    invoke-static {p2, p1}, LAD2;->o(Ljava/io/InputStream;Ljava/lang/String;)LbE2;

    move-result-object p1

    return-object p1
.end method

.method public final f(Landroid/content/Context;Ljava/lang/String;Ljava/io/InputStream;Ljava/lang/String;)LbE2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/io/InputStream;",
            "Ljava/lang/String;",
            ")",
            "LbE2<",
            "LrD2;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    if-eqz p4, :cond_1

    iget-object p4, p0, LF73;->a:Ly73;

    if-nez p4, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Lkl1;->d:Lkl1;

    invoke-virtual {p4, p2, p3, v0}, Ly73;->f(Ljava/lang/String;Ljava/io/InputStream;Lkl1;)Ljava/io/File;

    move-result-object p3

    new-instance p4, Ljava/util/zip/ZipInputStream;

    new-instance v0, Ljava/io/FileInputStream;

    invoke-direct {v0, p3}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    invoke-direct {p4, v0}, Ljava/util/zip/ZipInputStream;-><init>(Ljava/io/InputStream;)V

    invoke-static {p1, p4, p2}, LAD2;->y(Landroid/content/Context;Ljava/util/zip/ZipInputStream;Ljava/lang/String;)LbE2;

    move-result-object p1

    return-object p1

    :cond_1
    :goto_0
    new-instance p2, Ljava/util/zip/ZipInputStream;

    invoke-direct {p2, p3}, Ljava/util/zip/ZipInputStream;-><init>(Ljava/io/InputStream;)V

    const/4 p3, 0x0

    invoke-static {p1, p2, p3}, LAD2;->y(Landroid/content/Context;Ljava/util/zip/ZipInputStream;Ljava/lang/String;)LbE2;

    move-result-object p1

    return-object p1
.end method
