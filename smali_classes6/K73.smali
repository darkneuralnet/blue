.class public LK73;
.super LPI4;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LK73$b;,
        LK73$a;
    }
.end annotation


# instance fields
.field public final a:Lb61;

.field public final b:LlQ5;


# direct methods
.method public constructor <init>(Lb61;LlQ5;)V
    .locals 0

    invoke-direct {p0}, LPI4;-><init>()V

    iput-object p1, p0, LK73;->a:Lb61;

    iput-object p2, p0, LK73;->b:LlQ5;

    return-void
.end method

.method public static j(LqI4;I)Lokhttp3/Request;
    .locals 2

    if-eqz p1, :cond_3

    invoke-static {p1}, LJ73;->a(I)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Lokhttp3/CacheControl;->FORCE_CACHE:Lokhttp3/CacheControl;

    goto :goto_0

    :cond_0
    new-instance v0, Lokhttp3/CacheControl$Builder;

    invoke-direct {v0}, Lokhttp3/CacheControl$Builder;-><init>()V

    invoke-static {p1}, LJ73;->b(I)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {v0}, Lokhttp3/CacheControl$Builder;->noCache()Lokhttp3/CacheControl$Builder;

    :cond_1
    invoke-static {p1}, LJ73;->c(I)Z

    move-result p1

    if-nez p1, :cond_2

    invoke-virtual {v0}, Lokhttp3/CacheControl$Builder;->noStore()Lokhttp3/CacheControl$Builder;

    :cond_2
    invoke-virtual {v0}, Lokhttp3/CacheControl$Builder;->build()Lokhttp3/CacheControl;

    move-result-object p1

    goto :goto_0

    :cond_3
    const/4 p1, 0x0

    :goto_0
    new-instance v0, Lokhttp3/Request$Builder;

    invoke-direct {v0}, Lokhttp3/Request$Builder;-><init>()V

    iget-object p0, p0, LqI4;->d:Landroid/net/Uri;

    invoke-virtual {p0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Lokhttp3/Request$Builder;->url(Ljava/lang/String;)Lokhttp3/Request$Builder;

    move-result-object p0

    if-eqz p1, :cond_4

    invoke-virtual {p0, p1}, Lokhttp3/Request$Builder;->cacheControl(Lokhttp3/CacheControl;)Lokhttp3/Request$Builder;

    :cond_4
    invoke-virtual {p0}, Lokhttp3/Request$Builder;->build()Lokhttp3/Request;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public c(LqI4;)Z
    .locals 1

    iget-object p1, p1, LqI4;->d:Landroid/net/Uri;

    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object p1

    const-string v0, "http"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "https"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public e()I
    .locals 1

    const/4 v0, 0x2

    return v0
.end method

.method public f(LqI4;I)LPI4$a;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-static {p1, p2}, LK73;->j(LqI4;I)Lokhttp3/Request;

    move-result-object p2

    iget-object v0, p0, LK73;->a:Lb61;

    invoke-interface {v0, p2}, Lb61;->a(Lokhttp3/Request;)Lokhttp3/Response;

    move-result-object p2

    invoke-virtual {p2}, Lokhttp3/Response;->body()Lokhttp3/ResponseBody;

    move-result-object v0

    invoke-virtual {p2}, Lokhttp3/Response;->isSuccessful()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual {p2}, Lokhttp3/Response;->cacheResponse()Lokhttp3/Response;

    move-result-object p1

    if-nez p1, :cond_0

    sget-object p1, LiT3$e;->e:LiT3$e;

    goto :goto_0

    :cond_0
    sget-object p1, LiT3$e;->d:LiT3$e;

    :goto_0
    sget-object p2, LiT3$e;->d:LiT3$e;

    const-wide/16 v1, 0x0

    if-ne p1, p2, :cond_2

    invoke-virtual {v0}, Lokhttp3/ResponseBody;->contentLength()J

    move-result-wide v3

    cmp-long p2, v3, v1

    if-eqz p2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Lokhttp3/ResponseBody;->close()V

    new-instance p1, LK73$a;

    const-string p2, "Received response with 0 content-length header."

    invoke-direct {p1, p2}, LK73$a;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :goto_1
    sget-object p2, LiT3$e;->e:LiT3$e;

    if-ne p1, p2, :cond_3

    invoke-virtual {v0}, Lokhttp3/ResponseBody;->contentLength()J

    move-result-wide v3

    cmp-long p2, v3, v1

    if-lez p2, :cond_3

    iget-object p2, p0, LK73;->b:LlQ5;

    invoke-virtual {v0}, Lokhttp3/ResponseBody;->contentLength()J

    move-result-wide v1

    invoke-virtual {p2, v1, v2}, LlQ5;->f(J)V

    :cond_3
    new-instance p2, LPI4$a;

    invoke-virtual {v0}, Lokhttp3/ResponseBody;->source()Lo30;

    move-result-object v0

    invoke-direct {p2, v0, p1}, LPI4$a;-><init>(LAN5;LiT3$e;)V

    return-object p2

    :cond_4
    invoke-virtual {v0}, Lokhttp3/ResponseBody;->close()V

    new-instance v0, LK73$b;

    invoke-virtual {p2}, Lokhttp3/Response;->code()I

    move-result p2

    iget p1, p1, LqI4;->c:I

    invoke-direct {v0, p2, p1}, LK73$b;-><init>(II)V

    throw v0
.end method

.method public h(ZLandroid/net/NetworkInfo;)Z
    .locals 0

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public i()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
