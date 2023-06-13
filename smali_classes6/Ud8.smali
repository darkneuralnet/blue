.class public final LUd8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final b:Ljava/net/URL;

.field public final c:[B

.field public final d:Lpd8;

.field public final e:Ljava/lang/String;

.field public final f:Ljava/util/Map;

.field public final synthetic g:Lbf8;


# direct methods
.method public constructor <init>(Lbf8;Ljava/lang/String;Ljava/net/URL;[BLjava/util/Map;Lpd8;)V
    .locals 0

    iput-object p1, p0, LUd8;->g:Lbf8;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p2}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotEmpty(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {p3}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p6}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p3, p0, LUd8;->b:Ljava/net/URL;

    iput-object p4, p0, LUd8;->c:[B

    iput-object p6, p0, LUd8;->d:Lpd8;

    iput-object p2, p0, LUd8;->e:Ljava/lang/String;

    iput-object p5, p0, LUd8;->f:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 14

    const-string v0, "Error closing HTTP compressed POST connection output stream. appId"

    iget-object v1, p0, LUd8;->g:Lbf8;

    invoke-virtual {v1}, Lns8;->d()V

    const/4 v1, 0x0

    const/4 v2, 0x0

    :try_start_0
    iget-object v3, p0, LUd8;->g:Lbf8;

    iget-object v4, p0, LUd8;->b:Ljava/net/URL;

    invoke-virtual {v4}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v4

    instance-of v5, v4, Ljava/net/HttpURLConnection;

    if-eqz v5, :cond_4

    check-cast v4, Ljava/net/HttpURLConnection;

    invoke-virtual {v4, v1}, Ljava/net/URLConnection;->setDefaultUseCaches(Z)V

    iget-object v5, v3, Lns8;->a:LPn8;

    invoke-virtual {v5}, LPn8;->w()Lgl7;

    const v5, 0xea60

    invoke-virtual {v4, v5}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    iget-object v3, v3, Lns8;->a:LPn8;

    invoke-virtual {v3}, LPn8;->w()Lgl7;

    const v3, 0xee48

    invoke-virtual {v4, v3}, Ljava/net/URLConnection;->setReadTimeout(I)V

    invoke-virtual {v4, v1}, Ljava/net/HttpURLConnection;->setInstanceFollowRedirects(Z)V

    const/4 v3, 0x1

    invoke-virtual {v4, v3}, Ljava/net/URLConnection;->setDoInput(Z)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_5
    .catchall {:try_start_0 .. :try_end_0} :catchall_6

    :try_start_1
    iget-object v5, p0, LUd8;->f:Ljava/util/Map;

    if-eqz v5, :cond_0

    invoke-interface {v5}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/Map$Entry;

    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-virtual {v4, v7, v6}, Ljava/net/URLConnection;->addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    iget-object v5, p0, LUd8;->c:[B

    if-eqz v5, :cond_1

    iget-object v5, p0, LUd8;->g:Lbf8;

    iget-object v5, v5, LIR8;->b:LhV8;

    invoke-virtual {v5}, LhV8;->g0()LDV8;

    move-result-object v5

    iget-object v6, p0, LUd8;->c:[B

    invoke-virtual {v5, v6}, LDV8;->O([B)[B

    move-result-object v5

    iget-object v6, p0, LUd8;->g:Lbf8;

    iget-object v6, v6, Lns8;->a:LPn8;

    invoke-virtual {v6}, LPn8;->a()LFc8;

    move-result-object v6

    invoke-virtual {v6}, LFc8;->s()Lec8;

    move-result-object v6

    const-string v7, "Uploading data. size"

    array-length v8, v5

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-virtual {v6, v7, v9}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v4, v3}, Ljava/net/URLConnection;->setDoOutput(Z)V

    const-string v3, "Content-Encoding"

    const-string v6, "gzip"

    invoke-virtual {v4, v3, v6}, Ljava/net/URLConnection;->addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v4, v8}, Ljava/net/HttpURLConnection;->setFixedLengthStreamingMode(I)V

    invoke-virtual {v4}, Ljava/net/URLConnection;->connect()V

    invoke-virtual {v4}, Ljava/net/URLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v3
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_3
    .catchall {:try_start_1 .. :try_end_1} :catchall_5

    :try_start_2
    invoke-virtual {v3, v5}, Ljava/io/OutputStream;->write([B)V

    invoke-virtual {v3}, Ljava/io/OutputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v5

    move v9, v1

    move-object v12, v2

    move-object v2, v3

    goto/16 :goto_5

    :catch_0
    move-exception v5

    move v9, v1

    move-object v12, v2

    move-object v2, v3

    goto/16 :goto_7

    :cond_1
    :goto_1
    :try_start_3
    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v8
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_5

    :try_start_4
    invoke-virtual {v4}, Ljava/net/URLConnection;->getHeaderFields()Ljava/util/Map;

    move-result-object v11
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    :try_start_5
    new-instance v3, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v3}, Ljava/io/ByteArrayOutputStream;-><init>()V

    invoke-virtual {v4}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v5
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    const/16 v6, 0x400

    :try_start_6
    new-array v6, v6, [B

    :goto_2
    invoke-virtual {v5, v6}, Ljava/io/InputStream;->read([B)I

    move-result v7

    if-lez v7, :cond_2

    invoke-virtual {v3, v6, v1, v7}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v10
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    :try_start_7
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_1
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->disconnect()V

    iget-object v0, p0, LUd8;->g:Lbf8;

    iget-object v0, v0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->c()Ldn8;

    move-result-object v0

    new-instance v1, LGd8;

    iget-object v6, p0, LUd8;->e:Ljava/lang/String;

    iget-object v7, p0, LUd8;->d:Lpd8;

    const/4 v9, 0x0

    const/4 v12, 0x0

    move-object v5, v1

    invoke-direct/range {v5 .. v12}, LGd8;-><init>(Ljava/lang/String;Lpd8;ILjava/lang/Throwable;[BLjava/util/Map;Ltd8;)V

    :goto_3
    invoke-virtual {v0, v1}, Ldn8;->w(Ljava/lang/Runnable;)V

    return-void

    :catchall_1
    move-exception v1

    goto :goto_4

    :catchall_2
    move-exception v1

    move-object v5, v2

    :goto_4
    if-eqz v5, :cond_3

    :try_start_8
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V

    :cond_3
    throw v1
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_1
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    :catchall_3
    move-exception v1

    move-object v5, v1

    move v9, v8

    move-object v12, v11

    goto :goto_5

    :catch_1
    move-exception v1

    move-object v5, v1

    move-object v10, v5

    move v9, v8

    move-object v12, v11

    goto/16 :goto_8

    :catchall_4
    move-exception v5

    move-object v12, v2

    move v9, v8

    goto :goto_5

    :catch_2
    move-exception v5

    move-object v12, v2

    move-object v10, v5

    move v9, v8

    goto/16 :goto_8

    :catchall_5
    move-exception v3

    move v9, v1

    move-object v12, v2

    move-object v5, v3

    goto :goto_5

    :catch_3
    move-exception v3

    move v9, v1

    move-object v12, v2

    move-object v10, v3

    goto :goto_8

    :cond_4
    :try_start_9
    new-instance v3, Ljava/io/IOException;

    const-string v4, "Failed to obtain HTTP connection"

    invoke-direct {v3, v4}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v3
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_5
    .catchall {:try_start_9 .. :try_end_9} :catchall_6

    :catchall_6
    move-exception v3

    move-object v5, v3

    move v9, v1

    move-object v4, v2

    move-object v12, v4

    :goto_5
    if-eqz v2, :cond_5

    :try_start_a
    invoke-virtual {v2}, Ljava/io/OutputStream;->close()V
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_4

    goto :goto_6

    :catch_4
    move-exception v1

    iget-object v2, p0, LUd8;->g:Lbf8;

    iget-object v2, v2, Lns8;->a:LPn8;

    invoke-virtual {v2}, LPn8;->a()LFc8;

    move-result-object v2

    invoke-virtual {v2}, LFc8;->o()Lec8;

    move-result-object v2

    iget-object v3, p0, LUd8;->e:Ljava/lang/String;

    invoke-static {v3}, LFc8;->w(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v0, v3, v1}, Lec8;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_5
    :goto_6
    if-eqz v4, :cond_6

    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->disconnect()V

    :cond_6
    iget-object v0, p0, LUd8;->g:Lbf8;

    iget-object v0, v0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->c()Ldn8;

    move-result-object v0

    new-instance v1, LGd8;

    iget-object v7, p0, LUd8;->e:Ljava/lang/String;

    iget-object v8, p0, LUd8;->d:Lpd8;

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    move-object v6, v1

    invoke-direct/range {v6 .. v13}, LGd8;-><init>(Ljava/lang/String;Lpd8;ILjava/lang/Throwable;[BLjava/util/Map;Ltd8;)V

    invoke-virtual {v0, v1}, Ldn8;->w(Ljava/lang/Runnable;)V

    throw v5

    :catch_5
    move-exception v3

    move-object v5, v3

    move v9, v1

    move-object v4, v2

    move-object v12, v4

    :goto_7
    move-object v10, v5

    :goto_8
    if-eqz v2, :cond_7

    :try_start_b
    invoke-virtual {v2}, Ljava/io/OutputStream;->close()V
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_6

    goto :goto_9

    :catch_6
    move-exception v1

    iget-object v2, p0, LUd8;->g:Lbf8;

    iget-object v2, v2, Lns8;->a:LPn8;

    invoke-virtual {v2}, LPn8;->a()LFc8;

    move-result-object v2

    invoke-virtual {v2}, LFc8;->o()Lec8;

    move-result-object v2

    iget-object v3, p0, LUd8;->e:Ljava/lang/String;

    invoke-static {v3}, LFc8;->w(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v0, v3, v1}, Lec8;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_7
    :goto_9
    if-eqz v4, :cond_8

    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->disconnect()V

    :cond_8
    iget-object v0, p0, LUd8;->g:Lbf8;

    iget-object v0, v0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->c()Ldn8;

    move-result-object v0

    new-instance v1, LGd8;

    iget-object v7, p0, LUd8;->e:Ljava/lang/String;

    iget-object v8, p0, LUd8;->d:Lpd8;

    const/4 v11, 0x0

    const/4 v13, 0x0

    move-object v6, v1

    invoke-direct/range {v6 .. v13}, LGd8;-><init>(Ljava/lang/String;Lpd8;ILjava/lang/Throwable;[BLjava/util/Map;Ltd8;)V

    goto/16 :goto_3
.end method
