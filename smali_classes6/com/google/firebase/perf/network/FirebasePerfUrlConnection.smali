.class public Lcom/google/firebase/perf/network/FirebasePerfUrlConnection;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lkd6;Lga6;Lcom/google/firebase/perf/util/Timer;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p2}, Lcom/google/firebase/perf/util/Timer;->h()V

    invoke-virtual {p2}, Lcom/google/firebase/perf/util/Timer;->e()J

    move-result-wide v0

    invoke-static {p1}, LM73;->c(Lga6;)LM73;

    move-result-object p1

    :try_start_0
    invoke-virtual {p0}, Lkd6;->a()Ljava/net/URLConnection;

    move-result-object v2

    instance-of v3, v2, Ljavax/net/ssl/HttpsURLConnection;

    if-eqz v3, :cond_0

    new-instance v3, Lk52;

    check-cast v2, Ljavax/net/ssl/HttpsURLConnection;

    invoke-direct {v3, v2, p2, p1}, Lk52;-><init>(Ljavax/net/ssl/HttpsURLConnection;Lcom/google/firebase/perf/util/Timer;LM73;)V

    invoke-virtual {v3}, Lk52;->getContent()Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_0
    instance-of v3, v2, Ljava/net/HttpURLConnection;

    if-eqz v3, :cond_1

    new-instance v3, Lj52;

    check-cast v2, Ljava/net/HttpURLConnection;

    invoke-direct {v3, v2, p2, p1}, Lj52;-><init>(Ljava/net/HttpURLConnection;Lcom/google/firebase/perf/util/Timer;LM73;)V

    invoke-virtual {v3}, Lj52;->getContent()Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_1
    invoke-virtual {v2}, Ljava/net/URLConnection;->getContent()Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception v2

    invoke-virtual {p1, v0, v1}, LM73;->o(J)LM73;

    invoke-virtual {p2}, Lcom/google/firebase/perf/util/Timer;->c()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, LM73;->s(J)LM73;

    invoke-virtual {p0}, Lkd6;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, LM73;->u(Ljava/lang/String;)LM73;

    invoke-static {p1}, LN73;->d(LM73;)V

    throw v2
.end method

.method public static b(Lkd6;[Ljava/lang/Class;Lga6;Lcom/google/firebase/perf/util/Timer;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p3}, Lcom/google/firebase/perf/util/Timer;->h()V

    invoke-virtual {p3}, Lcom/google/firebase/perf/util/Timer;->e()J

    move-result-wide v0

    invoke-static {p2}, LM73;->c(Lga6;)LM73;

    move-result-object p2

    :try_start_0
    invoke-virtual {p0}, Lkd6;->a()Ljava/net/URLConnection;

    move-result-object v2

    instance-of v3, v2, Ljavax/net/ssl/HttpsURLConnection;

    if-eqz v3, :cond_0

    new-instance v3, Lk52;

    check-cast v2, Ljavax/net/ssl/HttpsURLConnection;

    invoke-direct {v3, v2, p3, p2}, Lk52;-><init>(Ljavax/net/ssl/HttpsURLConnection;Lcom/google/firebase/perf/util/Timer;LM73;)V

    invoke-virtual {v3, p1}, Lk52;->getContent([Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_0
    instance-of v3, v2, Ljava/net/HttpURLConnection;

    if-eqz v3, :cond_1

    new-instance v3, Lj52;

    check-cast v2, Ljava/net/HttpURLConnection;

    invoke-direct {v3, v2, p3, p2}, Lj52;-><init>(Ljava/net/HttpURLConnection;Lcom/google/firebase/perf/util/Timer;LM73;)V

    invoke-virtual {v3, p1}, Lj52;->getContent([Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_1
    invoke-virtual {v2, p1}, Ljava/net/URLConnection;->getContent([Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p1

    invoke-virtual {p2, v0, v1}, LM73;->o(J)LM73;

    invoke-virtual {p3}, Lcom/google/firebase/perf/util/Timer;->c()J

    move-result-wide v0

    invoke-virtual {p2, v0, v1}, LM73;->s(J)LM73;

    invoke-virtual {p0}, Lkd6;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p2, p0}, LM73;->u(Ljava/lang/String;)LM73;

    invoke-static {p2}, LN73;->d(LM73;)V

    throw p1
.end method

.method public static c(Lkd6;Lga6;Lcom/google/firebase/perf/util/Timer;)Ljava/io/InputStream;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p2}, Lcom/google/firebase/perf/util/Timer;->h()V

    invoke-virtual {p2}, Lcom/google/firebase/perf/util/Timer;->e()J

    move-result-wide v0

    invoke-static {p1}, LM73;->c(Lga6;)LM73;

    move-result-object p1

    :try_start_0
    invoke-virtual {p0}, Lkd6;->a()Ljava/net/URLConnection;

    move-result-object v2

    instance-of v3, v2, Ljavax/net/ssl/HttpsURLConnection;

    if-eqz v3, :cond_0

    new-instance v3, Lk52;

    check-cast v2, Ljavax/net/ssl/HttpsURLConnection;

    invoke-direct {v3, v2, p2, p1}, Lk52;-><init>(Ljavax/net/ssl/HttpsURLConnection;Lcom/google/firebase/perf/util/Timer;LM73;)V

    invoke-virtual {v3}, Lk52;->getInputStream()Ljava/io/InputStream;

    move-result-object p0

    return-object p0

    :cond_0
    instance-of v3, v2, Ljava/net/HttpURLConnection;

    if-eqz v3, :cond_1

    new-instance v3, Lj52;

    check-cast v2, Ljava/net/HttpURLConnection;

    invoke-direct {v3, v2, p2, p1}, Lj52;-><init>(Ljava/net/HttpURLConnection;Lcom/google/firebase/perf/util/Timer;LM73;)V

    invoke-virtual {v3}, Lj52;->getInputStream()Ljava/io/InputStream;

    move-result-object p0

    return-object p0

    :cond_1
    invoke-virtual {v2}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception v2

    invoke-virtual {p1, v0, v1}, LM73;->o(J)LM73;

    invoke-virtual {p2}, Lcom/google/firebase/perf/util/Timer;->c()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, LM73;->s(J)LM73;

    invoke-virtual {p0}, Lkd6;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, LM73;->u(Ljava/lang/String;)LM73;

    invoke-static {p1}, LN73;->d(LM73;)V

    throw v2
.end method

.method public static getContent(Ljava/net/URL;)Ljava/lang/Object;
    .locals 2
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    new-instance v0, Lkd6;

    invoke-direct {v0, p0}, Lkd6;-><init>(Ljava/net/URL;)V

    invoke-static {}, Lga6;->k()Lga6;

    move-result-object p0

    new-instance v1, Lcom/google/firebase/perf/util/Timer;

    invoke-direct {v1}, Lcom/google/firebase/perf/util/Timer;-><init>()V

    invoke-static {v0, p0, v1}, Lcom/google/firebase/perf/network/FirebasePerfUrlConnection;->a(Lkd6;Lga6;Lcom/google/firebase/perf/util/Timer;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static getContent(Ljava/net/URL;[Ljava/lang/Class;)Ljava/lang/Object;
    .locals 2
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    new-instance v0, Lkd6;

    invoke-direct {v0, p0}, Lkd6;-><init>(Ljava/net/URL;)V

    invoke-static {}, Lga6;->k()Lga6;

    move-result-object p0

    new-instance v1, Lcom/google/firebase/perf/util/Timer;

    invoke-direct {v1}, Lcom/google/firebase/perf/util/Timer;-><init>()V

    invoke-static {v0, p1, p0, v1}, Lcom/google/firebase/perf/network/FirebasePerfUrlConnection;->b(Lkd6;[Ljava/lang/Class;Lga6;Lcom/google/firebase/perf/util/Timer;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static instrument(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    instance-of v0, p0, Ljavax/net/ssl/HttpsURLConnection;

    if-eqz v0, :cond_0

    new-instance v0, Lk52;

    check-cast p0, Ljavax/net/ssl/HttpsURLConnection;

    new-instance v1, Lcom/google/firebase/perf/util/Timer;

    invoke-direct {v1}, Lcom/google/firebase/perf/util/Timer;-><init>()V

    invoke-static {}, Lga6;->k()Lga6;

    move-result-object v2

    invoke-static {v2}, LM73;->c(Lga6;)LM73;

    move-result-object v2

    invoke-direct {v0, p0, v1, v2}, Lk52;-><init>(Ljavax/net/ssl/HttpsURLConnection;Lcom/google/firebase/perf/util/Timer;LM73;)V

    return-object v0

    :cond_0
    instance-of v0, p0, Ljava/net/HttpURLConnection;

    if-eqz v0, :cond_1

    new-instance v0, Lj52;

    check-cast p0, Ljava/net/HttpURLConnection;

    new-instance v1, Lcom/google/firebase/perf/util/Timer;

    invoke-direct {v1}, Lcom/google/firebase/perf/util/Timer;-><init>()V

    invoke-static {}, Lga6;->k()Lga6;

    move-result-object v2

    invoke-static {v2}, LM73;->c(Lga6;)LM73;

    move-result-object v2

    invoke-direct {v0, p0, v1, v2}, Lj52;-><init>(Ljava/net/HttpURLConnection;Lcom/google/firebase/perf/util/Timer;LM73;)V

    return-object v0

    :cond_1
    return-object p0
.end method

.method public static openStream(Ljava/net/URL;)Ljava/io/InputStream;
    .locals 2
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    new-instance v0, Lkd6;

    invoke-direct {v0, p0}, Lkd6;-><init>(Ljava/net/URL;)V

    invoke-static {}, Lga6;->k()Lga6;

    move-result-object p0

    new-instance v1, Lcom/google/firebase/perf/util/Timer;

    invoke-direct {v1}, Lcom/google/firebase/perf/util/Timer;-><init>()V

    invoke-static {v0, p0, v1}, Lcom/google/firebase/perf/network/FirebasePerfUrlConnection;->c(Lkd6;Lga6;Lcom/google/firebase/perf/util/Timer;)Ljava/io/InputStream;

    move-result-object p0

    return-object p0
.end method
