.class public LLN1$e;
.super Lbf1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LLN1;-><init>(LEb5;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lbf1<",
        "Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic d:LLN1;


# direct methods
.method public constructor <init>(LLN1;LEb5;)V
    .locals 0

    iput-object p1, p0, LLN1$e;->d:LLN1;

    invoke-direct {p0, p2}, Lbf1;-><init>(LEb5;)V

    return-void
.end method


# virtual methods
.method public e()Ljava/lang/String;
    .locals 1

    const-string v0, "UPDATE OR REPLACE `transactions` SET `id` = ?,`requestDate` = ?,`responseDate` = ?,`tookMs` = ?,`protocol` = ?,`method` = ?,`url` = ?,`host` = ?,`path` = ?,`scheme` = ?,`responseTlsVersion` = ?,`responseCipherSuite` = ?,`requestPayloadSize` = ?,`requestContentType` = ?,`requestHeaders` = ?,`requestHeadersSize` = ?,`requestBody` = ?,`isRequestBodyEncoded` = ?,`responseCode` = ?,`responseMessage` = ?,`error` = ?,`responsePayloadSize` = ?,`responseContentType` = ?,`responseHeaders` = ?,`responseHeadersSize` = ?,`responseBody` = ?,`isResponseBodyEncoded` = ?,`responseImageData` = ?,`graphQlDetected` = ?,`graphQlOperationName` = ? WHERE `id` = ?"

    return-object v0
.end method

.method public bridge synthetic i(LqV5;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;

    invoke-virtual {p0, p1, p2}, LLN1$e;->m(LqV5;Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;)V

    return-void
.end method

.method public m(LqV5;Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;)V
    .locals 4

    invoke-virtual {p2}, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->getId()J

    move-result-wide v0

    const/4 v2, 0x1

    invoke-interface {p1, v2, v0, v1}, LoV5;->S0(IJ)V

    invoke-virtual {p2}, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->getRequestDate()Ljava/lang/Long;

    move-result-object v0

    const/4 v1, 0x2

    if-nez v0, :cond_0

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->getRequestDate()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-interface {p1, v1, v2, v3}, LoV5;->S0(IJ)V

    :goto_0
    invoke-virtual {p2}, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->getResponseDate()Ljava/lang/Long;

    move-result-object v0

    const/4 v1, 0x3

    if-nez v0, :cond_1

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p2}, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->getResponseDate()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-interface {p1, v1, v2, v3}, LoV5;->S0(IJ)V

    :goto_1
    invoke-virtual {p2}, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->getTookMs()Ljava/lang/Long;

    move-result-object v0

    const/4 v1, 0x4

    if-nez v0, :cond_2

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_2

    :cond_2
    invoke-virtual {p2}, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->getTookMs()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-interface {p1, v1, v2, v3}, LoV5;->S0(IJ)V

    :goto_2
    invoke-virtual {p2}, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->getProtocol()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x5

    if-nez v0, :cond_3

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_3

    :cond_3
    invoke-virtual {p2}, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->getProtocol()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_3
    invoke-virtual {p2}, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->getMethod()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x6

    if-nez v0, :cond_4

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_4

    :cond_4
    invoke-virtual {p2}, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->getMethod()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_4
    invoke-virtual {p2}, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->getUrl()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x7

    if-nez v0, :cond_5

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_5

    :cond_5
    invoke-virtual {p2}, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->getUrl()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_5
    invoke-virtual {p2}, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->getHost()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x8

    if-nez v0, :cond_6

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_6

    :cond_6
    invoke-virtual {p2}, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->getHost()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_6
    invoke-virtual {p2}, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->getPath()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x9

    if-nez v0, :cond_7

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_7

    :cond_7
    invoke-virtual {p2}, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_7
    invoke-virtual {p2}, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->getScheme()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xa

    if-nez v0, :cond_8

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_8

    :cond_8
    invoke-virtual {p2}, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->getScheme()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_8
    invoke-virtual {p2}, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->getResponseTlsVersion()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xb

    if-nez v0, :cond_9

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_9

    :cond_9
    invoke-virtual {p2}, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->getResponseTlsVersion()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_9
    invoke-virtual {p2}, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->getResponseCipherSuite()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xc

    if-nez v0, :cond_a

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_a

    :cond_a
    invoke-virtual {p2}, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->getResponseCipherSuite()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_a
    invoke-virtual {p2}, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->getRequestPayloadSize()Ljava/lang/Long;

    move-result-object v0

    const/16 v1, 0xd

    if-nez v0, :cond_b

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_b

    :cond_b
    invoke-virtual {p2}, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->getRequestPayloadSize()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-interface {p1, v1, v2, v3}, LoV5;->S0(IJ)V

    :goto_b
    invoke-virtual {p2}, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->getRequestContentType()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xe

    if-nez v0, :cond_c

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_c

    :cond_c
    invoke-virtual {p2}, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->getRequestContentType()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_c
    invoke-virtual {p2}, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->getRequestHeaders()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xf

    if-nez v0, :cond_d

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_d

    :cond_d
    invoke-virtual {p2}, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->getRequestHeaders()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_d
    invoke-virtual {p2}, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->getRequestHeadersSize()Ljava/lang/Long;

    move-result-object v0

    const/16 v1, 0x10

    if-nez v0, :cond_e

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_e

    :cond_e
    invoke-virtual {p2}, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->getRequestHeadersSize()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-interface {p1, v1, v2, v3}, LoV5;->S0(IJ)V

    :goto_e
    invoke-virtual {p2}, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->getRequestBody()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x11

    if-nez v0, :cond_f

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_f

    :cond_f
    invoke-virtual {p2}, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->getRequestBody()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_f
    invoke-virtual {p2}, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->isRequestBodyEncoded()Z

    move-result v0

    const/16 v1, 0x12

    int-to-long v2, v0

    invoke-interface {p1, v1, v2, v3}, LoV5;->S0(IJ)V

    invoke-virtual {p2}, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->getResponseCode()Ljava/lang/Integer;

    move-result-object v0

    const/16 v1, 0x13

    if-nez v0, :cond_10

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_10

    :cond_10
    invoke-virtual {p2}, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->getResponseCode()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-long v2, v0

    invoke-interface {p1, v1, v2, v3}, LoV5;->S0(IJ)V

    :goto_10
    invoke-virtual {p2}, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->getResponseMessage()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x14

    if-nez v0, :cond_11

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_11

    :cond_11
    invoke-virtual {p2}, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->getResponseMessage()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_11
    invoke-virtual {p2}, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->getError()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x15

    if-nez v0, :cond_12

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_12

    :cond_12
    invoke-virtual {p2}, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->getError()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_12
    invoke-virtual {p2}, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->getResponsePayloadSize()Ljava/lang/Long;

    move-result-object v0

    const/16 v1, 0x16

    if-nez v0, :cond_13

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_13

    :cond_13
    invoke-virtual {p2}, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->getResponsePayloadSize()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-interface {p1, v1, v2, v3}, LoV5;->S0(IJ)V

    :goto_13
    invoke-virtual {p2}, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->getResponseContentType()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x17

    if-nez v0, :cond_14

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_14

    :cond_14
    invoke-virtual {p2}, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->getResponseContentType()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_14
    invoke-virtual {p2}, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->getResponseHeaders()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x18

    if-nez v0, :cond_15

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_15

    :cond_15
    invoke-virtual {p2}, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->getResponseHeaders()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_15
    invoke-virtual {p2}, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->getResponseHeadersSize()Ljava/lang/Long;

    move-result-object v0

    if-nez v0, :cond_16

    const/16 v0, 0x19

    invoke-interface {p1, v0}, LoV5;->m1(I)V

    goto :goto_16

    :cond_16
    invoke-virtual {p2}, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->getResponseHeadersSize()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    const/16 v2, 0x19

    invoke-interface {p1, v2, v0, v1}, LoV5;->S0(IJ)V

    :goto_16
    invoke-virtual {p2}, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->getResponseBody()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_17

    const/16 v0, 0x1a

    invoke-interface {p1, v0}, LoV5;->m1(I)V

    goto :goto_17

    :cond_17
    const/16 v0, 0x1a

    invoke-virtual {p2}, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->getResponseBody()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v0, v1}, LoV5;->G0(ILjava/lang/String;)V

    :goto_17
    invoke-virtual {p2}, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->isResponseBodyEncoded()Z

    move-result v0

    const/16 v1, 0x1b

    int-to-long v2, v0

    invoke-interface {p1, v1, v2, v3}, LoV5;->S0(IJ)V

    invoke-virtual {p2}, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->getResponseImageData()[B

    move-result-object v0

    if-nez v0, :cond_18

    const/16 v0, 0x1c

    invoke-interface {p1, v0}, LoV5;->m1(I)V

    goto :goto_18

    :cond_18
    const/16 v0, 0x1c

    invoke-virtual {p2}, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->getResponseImageData()[B

    move-result-object v1

    invoke-interface {p1, v0, v1}, LoV5;->X0(I[B)V

    :goto_18
    invoke-virtual {p2}, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->getGraphQlDetected()Z

    move-result v0

    const/16 v1, 0x1d

    int-to-long v2, v0

    invoke-interface {p1, v1, v2, v3}, LoV5;->S0(IJ)V

    invoke-virtual {p2}, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->getGraphQlOperationName()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_19

    const/16 v0, 0x1e

    invoke-interface {p1, v0}, LoV5;->m1(I)V

    goto :goto_19

    :cond_19
    const/16 v0, 0x1e

    invoke-virtual {p2}, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->getGraphQlOperationName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v0, v1}, LoV5;->G0(ILjava/lang/String;)V

    :goto_19
    const/16 v0, 0x1f

    invoke-virtual {p2}, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->getId()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, LoV5;->S0(IJ)V

    return-void
.end method
