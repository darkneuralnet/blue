.class public Lcom/amazonaws/http/HttpMethodReleaseInputStream;
.super Lcom/amazonaws/internal/SdkInputStream;
.source "SourceFile"


# static fields
.field private static final log:Lcom/amazonaws/logging/Log;


# instance fields
.field private alreadyReleased:Z

.field private httpRequest:Lorg/apache/http/HttpEntityEnclosingRequest;

.field private in:Ljava/io/InputStream;

.field private underlyingStreamConsumed:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/amazonaws/http/HttpMethodReleaseInputStream;

    invoke-static {v0}, Lcom/amazonaws/logging/LogFactory;->getLog(Ljava/lang/Class;)Lcom/amazonaws/logging/Log;

    move-result-object v0

    sput-object v0, Lcom/amazonaws/http/HttpMethodReleaseInputStream;->log:Lcom/amazonaws/logging/Log;

    return-void
.end method

.method public constructor <init>(Lorg/apache/http/HttpEntityEnclosingRequest;)V
    .locals 3

    invoke-direct {p0}, Lcom/amazonaws/internal/SdkInputStream;-><init>()V

    iput-object p1, p0, Lcom/amazonaws/http/HttpMethodReleaseInputStream;->httpRequest:Lorg/apache/http/HttpEntityEnclosingRequest;

    :try_start_0
    invoke-interface {p1}, Lorg/apache/http/HttpEntityEnclosingRequest;->getEntity()Lorg/apache/http/HttpEntity;

    move-result-object v0

    invoke-interface {v0}, Lorg/apache/http/HttpEntity;->getContent()Ljava/io/InputStream;

    move-result-object v0

    iput-object v0, p0, Lcom/amazonaws/http/HttpMethodReleaseInputStream;->in:Ljava/io/InputStream;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    sget-object v1, Lcom/amazonaws/http/HttpMethodReleaseInputStream;->log:Lcom/amazonaws/logging/Log;

    invoke-interface {v1}, Lcom/amazonaws/logging/Log;->isWarnEnabled()Z

    move-result v2

    if-eqz v2, :cond_0

    const-string v2, "Unable to obtain HttpMethod\'s response data stream"

    invoke-interface {v1, v2, v0}, Lcom/amazonaws/logging/Log;->warn(Ljava/lang/Object;Ljava/lang/Throwable;)V

    :cond_0
    :try_start_1
    invoke-interface {p1}, Lorg/apache/http/HttpEntityEnclosingRequest;->getEntity()Lorg/apache/http/HttpEntity;

    move-result-object p1

    invoke-interface {p1}, Lorg/apache/http/HttpEntity;->getContent()Ljava/io/InputStream;

    move-result-object p1

    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    new-instance p1, Ljava/io/ByteArrayInputStream;

    const/4 v0, 0x0

    new-array v0, v0, [B

    invoke-direct {p1, v0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    iput-object p1, p0, Lcom/amazonaws/http/HttpMethodReleaseInputStream;->in:Ljava/io/InputStream;

    :goto_0
    return-void
.end method


# virtual methods
.method public available()I
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    :try_start_0
    iget-object v0, p0, Lcom/amazonaws/http/HttpMethodReleaseInputStream;->in:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->available()I

    move-result v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    move-exception v0

    invoke-virtual {p0}, Lcom/amazonaws/http/HttpMethodReleaseInputStream;->releaseConnection()V

    sget-object v1, Lcom/amazonaws/http/HttpMethodReleaseInputStream;->log:Lcom/amazonaws/logging/Log;

    invoke-interface {v1}, Lcom/amazonaws/logging/Log;->isDebugEnabled()Z

    move-result v2

    if-eqz v2, :cond_0

    const-string v2, "Released HttpMethod as its response data stream threw an exception"

    invoke-interface {v1, v2, v0}, Lcom/amazonaws/logging/Log;->debug(Ljava/lang/Object;Ljava/lang/Throwable;)V

    :cond_0
    throw v0
.end method

.method public close()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-boolean v0, p0, Lcom/amazonaws/http/HttpMethodReleaseInputStream;->alreadyReleased:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/amazonaws/http/HttpMethodReleaseInputStream;->releaseConnection()V

    sget-object v0, Lcom/amazonaws/http/HttpMethodReleaseInputStream;->log:Lcom/amazonaws/logging/Log;

    invoke-interface {v0}, Lcom/amazonaws/logging/Log;->isDebugEnabled()Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "Released HttpMethod as its response data stream is closed"

    invoke-interface {v0, v1}, Lcom/amazonaws/logging/Log;->debug(Ljava/lang/Object;)V

    :cond_0
    iget-object v0, p0, Lcom/amazonaws/http/HttpMethodReleaseInputStream;->in:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    return-void
.end method

.method public finalize()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    iget-boolean v0, p0, Lcom/amazonaws/http/HttpMethodReleaseInputStream;->alreadyReleased:Z

    if-nez v0, :cond_1

    sget-object v0, Lcom/amazonaws/http/HttpMethodReleaseInputStream;->log:Lcom/amazonaws/logging/Log;

    invoke-interface {v0}, Lcom/amazonaws/logging/Log;->isWarnEnabled()Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "Attempting to release HttpMethod in finalize() as its response data stream has gone out of scope. This attempt will not always succeed and cannot be relied upon! Please ensure S3 response data streams are always fully consumed or closed to avoid HTTP connection starvation."

    invoke-interface {v0, v1}, Lcom/amazonaws/logging/Log;->warn(Ljava/lang/Object;)V

    :cond_0
    invoke-virtual {p0}, Lcom/amazonaws/http/HttpMethodReleaseInputStream;->releaseConnection()V

    invoke-interface {v0}, Lcom/amazonaws/logging/Log;->isWarnEnabled()Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v1, "Successfully released HttpMethod in finalize(). You were lucky this time... Please ensure S3 response data streams are always fully consumed or closed."

    invoke-interface {v0, v1}, Lcom/amazonaws/logging/Log;->warn(Ljava/lang/Object;)V

    :cond_1
    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    return-void
.end method

.method public getHttpRequest()Lorg/apache/http/HttpEntityEnclosingRequest;
    .locals 1

    iget-object v0, p0, Lcom/amazonaws/http/HttpMethodReleaseInputStream;->httpRequest:Lorg/apache/http/HttpEntityEnclosingRequest;

    return-object v0
.end method

.method public getWrappedInputStream()Ljava/io/InputStream;
    .locals 1

    iget-object v0, p0, Lcom/amazonaws/http/HttpMethodReleaseInputStream;->in:Ljava/io/InputStream;

    return-object v0
.end method

.method public read()I
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    :try_start_0
    iget-object v0, p0, Lcom/amazonaws/http/HttpMethodReleaseInputStream;->in:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/amazonaws/http/HttpMethodReleaseInputStream;->underlyingStreamConsumed:Z

    iget-boolean v1, p0, Lcom/amazonaws/http/HttpMethodReleaseInputStream;->alreadyReleased:Z

    if-nez v1, :cond_0

    invoke-virtual {p0}, Lcom/amazonaws/http/HttpMethodReleaseInputStream;->releaseConnection()V

    sget-object v1, Lcom/amazonaws/http/HttpMethodReleaseInputStream;->log:Lcom/amazonaws/logging/Log;

    invoke-interface {v1}, Lcom/amazonaws/logging/Log;->isDebugEnabled()Z

    move-result v2

    if-eqz v2, :cond_0

    const-string v2, "Released HttpMethod as its response data stream is fully consumed"

    invoke-interface {v1, v2}, Lcom/amazonaws/logging/Log;->debug(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return v0

    :catch_0
    move-exception v0

    invoke-virtual {p0}, Lcom/amazonaws/http/HttpMethodReleaseInputStream;->releaseConnection()V

    sget-object v1, Lcom/amazonaws/http/HttpMethodReleaseInputStream;->log:Lcom/amazonaws/logging/Log;

    invoke-interface {v1}, Lcom/amazonaws/logging/Log;->isDebugEnabled()Z

    move-result v2

    if-eqz v2, :cond_1

    const-string v2, "Released HttpMethod as its response data stream threw an exception"

    invoke-interface {v1, v2, v0}, Lcom/amazonaws/logging/Log;->debug(Ljava/lang/Object;Ljava/lang/Throwable;)V

    :cond_1
    throw v0
.end method

.method public read([BII)I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    :try_start_0
    iget-object v0, p0, Lcom/amazonaws/http/HttpMethodReleaseInputStream;->in:Ljava/io/InputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/InputStream;->read([BII)I

    move-result p1

    const/4 p2, -0x1

    if-ne p1, p2, :cond_0

    const/4 p2, 0x1

    iput-boolean p2, p0, Lcom/amazonaws/http/HttpMethodReleaseInputStream;->underlyingStreamConsumed:Z

    iget-boolean p2, p0, Lcom/amazonaws/http/HttpMethodReleaseInputStream;->alreadyReleased:Z

    if-nez p2, :cond_0

    invoke-virtual {p0}, Lcom/amazonaws/http/HttpMethodReleaseInputStream;->releaseConnection()V

    sget-object p2, Lcom/amazonaws/http/HttpMethodReleaseInputStream;->log:Lcom/amazonaws/logging/Log;

    invoke-interface {p2}, Lcom/amazonaws/logging/Log;->isDebugEnabled()Z

    move-result p3

    if-eqz p3, :cond_0

    const-string p3, "Released HttpMethod as its response data stream is fully consumed"

    invoke-interface {p2, p3}, Lcom/amazonaws/logging/Log;->debug(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return p1

    :catch_0
    move-exception p1

    invoke-virtual {p0}, Lcom/amazonaws/http/HttpMethodReleaseInputStream;->releaseConnection()V

    sget-object p2, Lcom/amazonaws/http/HttpMethodReleaseInputStream;->log:Lcom/amazonaws/logging/Log;

    invoke-interface {p2}, Lcom/amazonaws/logging/Log;->isDebugEnabled()Z

    move-result p3

    if-eqz p3, :cond_1

    const-string p3, "Released HttpMethod as its response data stream threw an exception"

    invoke-interface {p2, p3, p1}, Lcom/amazonaws/logging/Log;->debug(Ljava/lang/Object;Ljava/lang/Throwable;)V

    :cond_1
    throw p1
.end method

.method public releaseConnection()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-boolean v0, p0, Lcom/amazonaws/http/HttpMethodReleaseInputStream;->alreadyReleased:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lcom/amazonaws/http/HttpMethodReleaseInputStream;->underlyingStreamConsumed:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/amazonaws/http/HttpMethodReleaseInputStream;->httpRequest:Lorg/apache/http/HttpEntityEnclosingRequest;

    instance-of v1, v0, Lorg/apache/http/client/methods/AbortableHttpRequest;

    if-eqz v1, :cond_0

    check-cast v0, Lorg/apache/http/client/methods/AbortableHttpRequest;

    invoke-interface {v0}, Lorg/apache/http/client/methods/AbortableHttpRequest;->abort()V

    :cond_0
    iget-object v0, p0, Lcom/amazonaws/http/HttpMethodReleaseInputStream;->in:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/amazonaws/http/HttpMethodReleaseInputStream;->alreadyReleased:Z

    :cond_1
    return-void
.end method
