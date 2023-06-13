.class public LX36;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LIS0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LX36$a;,
        LX36$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LIS0<",
        "Ljava/io/InputStream;",
        ">;"
    }
.end annotation


# instance fields
.field public final b:Landroid/net/Uri;

.field public final c:La46;

.field public d:Ljava/io/InputStream;


# direct methods
.method public constructor <init>(Landroid/net/Uri;La46;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LX36;->b:Landroid/net/Uri;

    iput-object p2, p0, LX36;->c:La46;

    return-void
.end method

.method public static c(Landroid/content/Context;Landroid/net/Uri;LY36;)LX36;
    .locals 3

    invoke-static {p0}, Lcom/bumptech/glide/a;->c(Landroid/content/Context;)Lcom/bumptech/glide/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bumptech/glide/a;->e()Lto;

    move-result-object v0

    new-instance v1, La46;

    invoke-static {p0}, Lcom/bumptech/glide/a;->c(Landroid/content/Context;)Lcom/bumptech/glide/a;

    move-result-object v2

    invoke-virtual {v2}, Lcom/bumptech/glide/a;->j()Lcom/bumptech/glide/Registry;

    move-result-object v2

    invoke-virtual {v2}, Lcom/bumptech/glide/Registry;->g()Ljava/util/List;

    move-result-object v2

    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p0

    invoke-direct {v1, v2, p2, v0, p0}, La46;-><init>(Ljava/util/List;LY36;Lto;Landroid/content/ContentResolver;)V

    new-instance p0, LX36;

    invoke-direct {p0, p1, v1}, LX36;-><init>(Landroid/net/Uri;La46;)V

    return-object p0
.end method

.method public static d(Landroid/content/Context;Landroid/net/Uri;)LX36;
    .locals 2

    new-instance v0, LX36$a;

    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    invoke-direct {v0, v1}, LX36$a;-><init>(Landroid/content/ContentResolver;)V

    invoke-static {p0, p1, v0}, LX36;->c(Landroid/content/Context;Landroid/net/Uri;LY36;)LX36;

    move-result-object p0

    return-object p0
.end method

.method public static f(Landroid/content/Context;Landroid/net/Uri;)LX36;
    .locals 2

    new-instance v0, LX36$b;

    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    invoke-direct {v0, v1}, LX36$b;-><init>(Landroid/content/ContentResolver;)V

    invoke-static {p0, p1, v0}, LX36;->c(Landroid/content/Context;Landroid/net/Uri;LY36;)LX36;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Ljava/io/InputStream;",
            ">;"
        }
    .end annotation

    const-class v0, Ljava/io/InputStream;

    return-object v0
.end method

.method public b()LZS0;
    .locals 1

    sget-object v0, LZS0;->b:LZS0;

    return-object v0
.end method

.method public cancel()V
    .locals 0

    return-void
.end method

.method public cleanup()V
    .locals 1

    iget-object v0, p0, LX36;->d:Ljava/io/InputStream;

    if-eqz v0, :cond_0

    :try_start_0
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method

.method public e(LP24;LIS0$a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LP24;",
            "LIS0$a<",
            "-",
            "Ljava/io/InputStream;",
            ">;)V"
        }
    .end annotation

    :try_start_0
    invoke-virtual {p0}, LX36;->g()Ljava/io/InputStream;

    move-result-object p1

    iput-object p1, p0, LX36;->d:Ljava/io/InputStream;

    invoke-interface {p2, p1}, LIS0$a;->c(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const/4 v0, 0x3

    const-string v1, "MediaStoreThumbFetcher"

    invoke-static {v1, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "Failed to find thumbnail file"

    invoke-static {v1, v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_0
    invoke-interface {p2, p1}, LIS0$a;->d(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method

.method public final g()Ljava/io/InputStream;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/FileNotFoundException;
        }
    .end annotation

    iget-object v0, p0, LX36;->c:La46;

    iget-object v1, p0, LX36;->b:Landroid/net/Uri;

    invoke-virtual {v0, v1}, La46;->d(Landroid/net/Uri;)Ljava/io/InputStream;

    move-result-object v0

    const/4 v1, -0x1

    if-eqz v0, :cond_0

    iget-object v2, p0, LX36;->c:La46;

    iget-object v3, p0, LX36;->b:Landroid/net/Uri;

    invoke-virtual {v2, v3}, La46;->a(Landroid/net/Uri;)I

    move-result v2

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    if-eq v2, v1, :cond_1

    new-instance v1, Lai1;

    invoke-direct {v1, v0, v2}, Lai1;-><init>(Ljava/io/InputStream;I)V

    move-object v0, v1

    :cond_1
    return-object v0
.end method
