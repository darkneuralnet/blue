.class public final Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction$a;,
        Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008J\n\u0002\u0010\u0008\n\u0002\u0008\u001c\n\u0002\u0010\u0012\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0014\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0001\u0018\u00002\u00020\u0001:\u0002\u00b0\u0001B\u00bc\u0002\u0012\u0008\u0008\u0002\u0010+\u001a\u00020\u000f\u0012\u0008\u00101\u001a\u0004\u0018\u00010\u000f\u0012\u0008\u00107\u001a\u0004\u0018\u00010\u000f\u0012\u0008\u0010:\u001a\u0004\u0018\u00010\u000f\u0012\u0008\u0010=\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010C\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010F\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010I\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010L\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010O\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010R\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010U\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010X\u001a\u0004\u0018\u00010\u000f\u0012\u0008\u0010[\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010^\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010`\u001a\u0004\u0018\u00010\u000f\u0012\u0008\u0010c\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0008\u0002\u0010f\u001a\u00020\u0017\u0012\u0008\u0010l\u001a\u0004\u0018\u00010k\u0012\u0008\u0010r\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010u\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010x\u001a\u0004\u0018\u00010\u000f\u0012\u0008\u0010{\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010~\u001a\u0004\u0018\u00010\u0007\u0012\t\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u000f\u0012\t\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u0007\u0012\t\u0008\u0002\u0010\u0086\u0001\u001a\u00020\u0017\u0012\n\u0010\u0089\u0001\u001a\u0005\u0018\u00010\u0088\u0001\u0012\t\u0008\u0002\u0010\u008f\u0001\u001a\u00020\u0017\u0012\t\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0006\u0008\u00ad\u0001\u0010\u00ae\u0001B\u000b\u0008\u0017\u00a2\u0006\u0006\u0008\u00ad\u0001\u0010\u00af\u0001J\u0016\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001a\u0010\n\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\u00072\u0008\u0010\t\u001a\u0004\u0018\u00010\u0007H\u0002J$\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0008\u001a\u00020\u000b2\u0008\u0010\t\u001a\u0004\u0018\u00010\u00072\u0008\u0010\r\u001a\u0004\u0018\u00010\u000cH\u0002J\u0010\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u000e\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0002J\u0014\u0010\u0013\u001a\u00020\u00122\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004J\u000e\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004J\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004J\u000e\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0017J\u000e\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0002J\u0014\u0010\u001a\u001a\u00020\u00122\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004J\u000e\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0017J\u0006\u0010\u001c\u001a\u00020\u0007J\u0010\u0010\u001d\u001a\u00020\u000b2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000cJ\u0006\u0010\u001e\u001a\u00020\u0007J\u0010\u0010\u001f\u001a\u00020\u000b2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000cJ\u000e\u0010\"\u001a\u00020\u00002\u0006\u0010!\u001a\u00020 J\u000e\u0010$\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u0017J\u000e\u0010%\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u0017J\u0006\u0010&\u001a\u00020\u000fJ\u0006\u0010\'\u001a\u00020\u000fJ\u0006\u0010(\u001a\u00020\u000fJ\u0010\u0010*\u001a\u00020\u00172\u0008\u0010)\u001a\u0004\u0018\u00010\u0000R\"\u0010+\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\u0008+\u0010,\u001a\u0004\u0008-\u0010.\"\u0004\u0008/\u00100R$\u00101\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\u00081\u00102\u001a\u0004\u00083\u00104\"\u0004\u00085\u00106R$\u00107\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\u00087\u00102\u001a\u0004\u00088\u00104\"\u0004\u00089\u00106R$\u0010:\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\u0008:\u00102\u001a\u0004\u0008;\u00104\"\u0004\u0008<\u00106R$\u0010=\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\u0008=\u0010>\u001a\u0004\u0008?\u0010@\"\u0004\u0008A\u0010BR$\u0010C\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\u0008C\u0010>\u001a\u0004\u0008D\u0010@\"\u0004\u0008E\u0010BR$\u0010F\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\u0008F\u0010>\u001a\u0004\u0008G\u0010@\"\u0004\u0008H\u0010BR$\u0010I\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\u0008I\u0010>\u001a\u0004\u0008J\u0010@\"\u0004\u0008K\u0010BR$\u0010L\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\u0008L\u0010>\u001a\u0004\u0008M\u0010@\"\u0004\u0008N\u0010BR$\u0010O\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\u0008O\u0010>\u001a\u0004\u0008P\u0010@\"\u0004\u0008Q\u0010BR$\u0010R\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\u0008R\u0010>\u001a\u0004\u0008S\u0010@\"\u0004\u0008T\u0010BR$\u0010U\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\u0008U\u0010>\u001a\u0004\u0008V\u0010@\"\u0004\u0008W\u0010BR$\u0010X\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\u0008X\u00102\u001a\u0004\u0008Y\u00104\"\u0004\u0008Z\u00106R$\u0010[\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\u0008[\u0010>\u001a\u0004\u0008\\\u0010@\"\u0004\u0008]\u0010BR$\u0010^\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\u0008^\u0010>\u001a\u0004\u0008_\u0010@\"\u0004\u0008\u0013\u0010BR$\u0010`\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\u0008`\u00102\u001a\u0004\u0008a\u00104\"\u0004\u0008b\u00106R$\u0010c\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\u0008c\u0010>\u001a\u0004\u0008d\u0010@\"\u0004\u0008e\u0010BR\"\u0010f\u001a\u00020\u00178\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\u0008f\u0010g\u001a\u0004\u0008f\u0010h\"\u0004\u0008i\u0010jR$\u0010l\u001a\u0004\u0018\u00010k8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\u0008l\u0010m\u001a\u0004\u0008n\u0010o\"\u0004\u0008p\u0010qR$\u0010r\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\u0008r\u0010>\u001a\u0004\u0008s\u0010@\"\u0004\u0008t\u0010BR$\u0010u\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\u0008u\u0010>\u001a\u0004\u0008v\u0010@\"\u0004\u0008w\u0010BR$\u0010x\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\u0008x\u00102\u001a\u0004\u0008y\u00104\"\u0004\u0008z\u00106R$\u0010{\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\u0008{\u0010>\u001a\u0004\u0008|\u0010@\"\u0004\u0008}\u0010BR$\u0010~\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\u0008~\u0010>\u001a\u0004\u0008\u007f\u0010@\"\u0004\u0008\u001a\u0010BR(\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0015\n\u0005\u0008\u0080\u0001\u00102\u001a\u0005\u0008\u0081\u0001\u00104\"\u0005\u0008\u0082\u0001\u00106R(\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0015\n\u0005\u0008\u0083\u0001\u0010>\u001a\u0005\u0008\u0084\u0001\u0010@\"\u0005\u0008\u0085\u0001\u0010BR&\u0010\u0086\u0001\u001a\u00020\u00178\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0015\n\u0005\u0008\u0086\u0001\u0010g\u001a\u0005\u0008\u0086\u0001\u0010h\"\u0005\u0008\u0087\u0001\u0010jR,\u0010\u0089\u0001\u001a\u0005\u0018\u00010\u0088\u00018\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0018\n\u0006\u0008\u0089\u0001\u0010\u008a\u0001\u001a\u0006\u0008\u008b\u0001\u0010\u008c\u0001\"\u0006\u0008\u008d\u0001\u0010\u008e\u0001R&\u0010\u008f\u0001\u001a\u00020\u00178\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0015\n\u0005\u0008\u008f\u0001\u0010g\u001a\u0005\u0008\u0090\u0001\u0010h\"\u0005\u0008\u0091\u0001\u0010jR\'\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0005\u0008\u0092\u0001\u0010>\u001a\u0005\u0008\u0093\u0001\u0010@\"\u0004\u0008\u0014\u0010BR\u0015\u0010\u0097\u0001\u001a\u00030\u0094\u00018F\u00a2\u0006\u0008\u001a\u0006\u0008\u0095\u0001\u0010\u0096\u0001R\u0015\u0010\u0099\u0001\u001a\u0004\u0018\u00010\u00078F\u00a2\u0006\u0007\u001a\u0005\u0008\u0098\u0001\u0010@R\u0015\u0010\u009b\u0001\u001a\u0004\u0018\u00010\u00078F\u00a2\u0006\u0007\u001a\u0005\u0008\u009a\u0001\u0010@R\u0015\u0010\u009d\u0001\u001a\u0004\u0018\u00010\u00078F\u00a2\u0006\u0007\u001a\u0005\u0008\u009c\u0001\u0010@R\u0013\u0010\u009f\u0001\u001a\u00020\u00078F\u00a2\u0006\u0007\u001a\u0005\u0008\u009e\u0001\u0010@R\u0015\u0010\u00a1\u0001\u001a\u0004\u0018\u00010\u00078F\u00a2\u0006\u0007\u001a\u0005\u0008\u00a0\u0001\u0010@R\u0013\u0010\u00a3\u0001\u001a\u00020\u00078F\u00a2\u0006\u0007\u001a\u0005\u0008\u00a2\u0001\u0010@R\u0015\u0010\u00a5\u0001\u001a\u0004\u0018\u00010\u00078F\u00a2\u0006\u0007\u001a\u0005\u0008\u00a4\u0001\u0010@R\u0013\u0010\u00a7\u0001\u001a\u00020\u00078F\u00a2\u0006\u0007\u001a\u0005\u0008\u00a6\u0001\u0010@R\u0013\u0010\u00a8\u0001\u001a\u00020\u00178F\u00a2\u0006\u0007\u001a\u0005\u0008\u00a8\u0001\u0010hR\u0017\u0010\u00ac\u0001\u001a\u0005\u0018\u00010\u00a9\u00018F\u00a2\u0006\u0008\u001a\u0006\u0008\u00aa\u0001\u0010\u00ab\u0001\u00a8\u0006\u00b1\u0001"
    }
    d2 = {
        "Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;",
        "",
        "Lokhttp3/Headers;",
        "headers",
        "",
        "LDN1;",
        "toHttpHeaderList",
        "",
        "body",
        "contentType",
        "formatBody",
        "",
        "Landroid/content/Context;",
        "context",
        "spanBody",
        "",
        "bytes",
        "formatBytes",
        "",
        "setRequestHeaders",
        "setGraphQlOperationName",
        "getParsedRequestHeaders",
        "getParsedResponseHeaders",
        "",
        "withMarkup",
        "getRequestHeadersString",
        "setResponseHeaders",
        "getResponseHeadersString",
        "getFormattedRequestBody",
        "getSpannedRequestBody",
        "getFormattedResponseBody",
        "getSpannedResponseBody",
        "Lokhttp3/HttpUrl;",
        "httpUrl",
        "populateUrl",
        "encode",
        "getFormattedUrl",
        "getFormattedPath",
        "getRequestTotalSize",
        "getResponseTotalSize",
        "getHarResponseBodySize",
        "other",
        "hasTheSameContent",
        "id",
        "J",
        "getId",
        "()J",
        "setId",
        "(J)V",
        "requestDate",
        "Ljava/lang/Long;",
        "getRequestDate",
        "()Ljava/lang/Long;",
        "setRequestDate",
        "(Ljava/lang/Long;)V",
        "responseDate",
        "getResponseDate",
        "setResponseDate",
        "tookMs",
        "getTookMs",
        "setTookMs",
        "protocol",
        "Ljava/lang/String;",
        "getProtocol",
        "()Ljava/lang/String;",
        "setProtocol",
        "(Ljava/lang/String;)V",
        "method",
        "getMethod",
        "setMethod",
        "url",
        "getUrl",
        "setUrl",
        "host",
        "getHost",
        "setHost",
        "path",
        "getPath",
        "setPath",
        "scheme",
        "getScheme",
        "setScheme",
        "responseTlsVersion",
        "getResponseTlsVersion",
        "setResponseTlsVersion",
        "responseCipherSuite",
        "getResponseCipherSuite",
        "setResponseCipherSuite",
        "requestPayloadSize",
        "getRequestPayloadSize",
        "setRequestPayloadSize",
        "requestContentType",
        "getRequestContentType",
        "setRequestContentType",
        "requestHeaders",
        "getRequestHeaders",
        "requestHeadersSize",
        "getRequestHeadersSize",
        "setRequestHeadersSize",
        "requestBody",
        "getRequestBody",
        "setRequestBody",
        "isRequestBodyEncoded",
        "Z",
        "()Z",
        "setRequestBodyEncoded",
        "(Z)V",
        "",
        "responseCode",
        "Ljava/lang/Integer;",
        "getResponseCode",
        "()Ljava/lang/Integer;",
        "setResponseCode",
        "(Ljava/lang/Integer;)V",
        "responseMessage",
        "getResponseMessage",
        "setResponseMessage",
        "error",
        "getError",
        "setError",
        "responsePayloadSize",
        "getResponsePayloadSize",
        "setResponsePayloadSize",
        "responseContentType",
        "getResponseContentType",
        "setResponseContentType",
        "responseHeaders",
        "getResponseHeaders",
        "responseHeadersSize",
        "getResponseHeadersSize",
        "setResponseHeadersSize",
        "responseBody",
        "getResponseBody",
        "setResponseBody",
        "isResponseBodyEncoded",
        "setResponseBodyEncoded",
        "",
        "responseImageData",
        "[B",
        "getResponseImageData",
        "()[B",
        "setResponseImageData",
        "([B)V",
        "graphQlDetected",
        "getGraphQlDetected",
        "setGraphQlDetected",
        "graphQlOperationName",
        "getGraphQlOperationName",
        "Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction$a;",
        "getStatus",
        "()Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction$a;",
        "status",
        "getRequestDateString",
        "requestDateString",
        "getResponseDateString",
        "responseDateString",
        "getDurationString",
        "durationString",
        "getRequestSizeString",
        "requestSizeString",
        "getResponseSizeString",
        "responseSizeString",
        "getTotalSizeString",
        "totalSizeString",
        "getResponseSummaryText",
        "responseSummaryText",
        "getNotificationText",
        "notificationText",
        "isSsl",
        "Landroid/graphics/Bitmap;",
        "getResponseImageBitmap",
        "()Landroid/graphics/Bitmap;",
        "responseImageBitmap",
        "<init>",
        "(JLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Z[BZLjava/lang/String;)V",
        "()V",
        "a",
        "com.github.ChuckerTeam.Chucker.library"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nHttpTransaction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpTransaction.kt\ncom/chuckerteam/chucker/internal/data/entity/HttpTransaction\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,339:1\n1#2:340\n*E\n"
    }
.end annotation


# instance fields
.field private error:Ljava/lang/String;

.field private graphQlDetected:Z

.field private graphQlOperationName:Ljava/lang/String;

.field private host:Ljava/lang/String;

.field private id:J

.field private isRequestBodyEncoded:Z

.field private isResponseBodyEncoded:Z

.field private method:Ljava/lang/String;

.field private path:Ljava/lang/String;

.field private protocol:Ljava/lang/String;

.field private requestBody:Ljava/lang/String;

.field private requestContentType:Ljava/lang/String;

.field private requestDate:Ljava/lang/Long;

.field private requestHeaders:Ljava/lang/String;

.field private requestHeadersSize:Ljava/lang/Long;

.field private requestPayloadSize:Ljava/lang/Long;

.field private responseBody:Ljava/lang/String;

.field private responseCipherSuite:Ljava/lang/String;

.field private responseCode:Ljava/lang/Integer;

.field private responseContentType:Ljava/lang/String;

.field private responseDate:Ljava/lang/Long;

.field private responseHeaders:Ljava/lang/String;

.field private responseHeadersSize:Ljava/lang/Long;

.field private responseImageData:[B

.field private responseMessage:Ljava/lang/String;

.field private responsePayloadSize:Ljava/lang/Long;

.field private responseTlsVersion:Ljava/lang/String;

.field private scheme:Ljava/lang/String;

.field private tookMs:Ljava/lang/Long;

.field private url:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 34

    move-object/from16 v0, p0

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const v32, 0x14020001

    const/16 v33, 0x0

    invoke-direct/range {v0 .. v33}, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;-><init>(JLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Z[BZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(JLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Z[BZLjava/lang/String;)V
    .locals 3

    move-object v0, p0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-wide v1, p1

    iput-wide v1, v0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->id:J

    move-object v1, p3

    iput-object v1, v0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->requestDate:Ljava/lang/Long;

    move-object v1, p4

    iput-object v1, v0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->responseDate:Ljava/lang/Long;

    move-object v1, p5

    iput-object v1, v0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->tookMs:Ljava/lang/Long;

    move-object v1, p6

    iput-object v1, v0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->protocol:Ljava/lang/String;

    move-object v1, p7

    iput-object v1, v0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->method:Ljava/lang/String;

    move-object v1, p8

    iput-object v1, v0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->url:Ljava/lang/String;

    move-object v1, p9

    iput-object v1, v0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->host:Ljava/lang/String;

    move-object v1, p10

    iput-object v1, v0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->path:Ljava/lang/String;

    move-object v1, p11

    iput-object v1, v0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->scheme:Ljava/lang/String;

    move-object v1, p12

    iput-object v1, v0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->responseTlsVersion:Ljava/lang/String;

    move-object/from16 v1, p13

    iput-object v1, v0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->responseCipherSuite:Ljava/lang/String;

    move-object/from16 v1, p14

    iput-object v1, v0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->requestPayloadSize:Ljava/lang/Long;

    move-object/from16 v1, p15

    iput-object v1, v0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->requestContentType:Ljava/lang/String;

    move-object/from16 v1, p16

    iput-object v1, v0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->requestHeaders:Ljava/lang/String;

    move-object/from16 v1, p17

    iput-object v1, v0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->requestHeadersSize:Ljava/lang/Long;

    move-object/from16 v1, p18

    iput-object v1, v0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->requestBody:Ljava/lang/String;

    move/from16 v1, p19

    iput-boolean v1, v0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->isRequestBodyEncoded:Z

    move-object/from16 v1, p20

    iput-object v1, v0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->responseCode:Ljava/lang/Integer;

    move-object/from16 v1, p21

    iput-object v1, v0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->responseMessage:Ljava/lang/String;

    move-object/from16 v1, p22

    iput-object v1, v0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->error:Ljava/lang/String;

    move-object/from16 v1, p23

    iput-object v1, v0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->responsePayloadSize:Ljava/lang/Long;

    move-object/from16 v1, p24

    iput-object v1, v0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->responseContentType:Ljava/lang/String;

    move-object/from16 v1, p25

    iput-object v1, v0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->responseHeaders:Ljava/lang/String;

    move-object/from16 v1, p26

    iput-object v1, v0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->responseHeadersSize:Ljava/lang/Long;

    move-object/from16 v1, p27

    iput-object v1, v0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->responseBody:Ljava/lang/String;

    move/from16 v1, p28

    iput-boolean v1, v0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->isResponseBodyEncoded:Z

    move-object/from16 v1, p29

    iput-object v1, v0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->responseImageData:[B

    move/from16 v1, p30

    iput-boolean v1, v0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->graphQlDetected:Z

    move-object/from16 v1, p31

    iput-object v1, v0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->graphQlOperationName:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(JLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Z[BZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 34

    and-int/lit8 v0, p32, 0x1

    if-eqz v0, :cond_0

    const-wide/16 v0, 0x0

    move-wide v3, v0

    goto :goto_0

    :cond_0
    move-wide/from16 v3, p1

    :goto_0
    const/high16 v0, 0x20000

    and-int v0, p32, v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    move/from16 v21, v1

    goto :goto_1

    :cond_1
    move/from16 v21, p19

    :goto_1
    const/high16 v0, 0x4000000

    and-int v0, p32, v0

    if-eqz v0, :cond_2

    move/from16 v30, v1

    goto :goto_2

    :cond_2
    move/from16 v30, p28

    :goto_2
    const/high16 v0, 0x10000000

    and-int v0, p32, v0

    if-eqz v0, :cond_3

    move/from16 v32, v1

    goto :goto_3

    :cond_3
    move/from16 v32, p30

    :goto_3
    move-object/from16 v2, p0

    move-object/from16 v5, p3

    move-object/from16 v6, p4

    move-object/from16 v7, p5

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    move-object/from16 v10, p8

    move-object/from16 v11, p9

    move-object/from16 v12, p10

    move-object/from16 v13, p11

    move-object/from16 v14, p12

    move-object/from16 v15, p13

    move-object/from16 v16, p14

    move-object/from16 v17, p15

    move-object/from16 v18, p16

    move-object/from16 v19, p17

    move-object/from16 v20, p18

    move-object/from16 v22, p20

    move-object/from16 v23, p21

    move-object/from16 v24, p22

    move-object/from16 v25, p23

    move-object/from16 v26, p24

    move-object/from16 v27, p25

    move-object/from16 v28, p26

    move-object/from16 v29, p27

    move-object/from16 v31, p29

    move-object/from16 v33, p31

    invoke-direct/range {v2 .. v33}, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;-><init>(JLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Z[BZLjava/lang/String;)V

    return-void
.end method

.method private final formatBody(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const/4 v0, 0x1

    if-eqz p2, :cond_1

    invoke-static {p2}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    move v1, v0

    :goto_1
    if-eqz v1, :cond_2

    goto :goto_2

    :cond_2
    const-string v1, "json"

    invoke-static {p2, v1, v0}, Lkotlin/text/StringsKt;->contains(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v1

    if-eqz v1, :cond_3

    sget-object p2, Lvx1;->a:Lvx1;

    invoke-virtual {p2, p1}, Lvx1;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_2

    :cond_3
    const-string v1, "xml"

    invoke-static {p2, v1, v0}, Lkotlin/text/StringsKt;->contains(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v1

    if-eqz v1, :cond_4

    sget-object p2, Lvx1;->a:Lvx1;

    invoke-virtual {p2, p1}, Lvx1;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_2

    :cond_4
    const-string v1, "x-www-form-urlencoded"

    invoke-static {p2, v1, v0}, Lkotlin/text/StringsKt;->contains(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result p2

    if-eqz p2, :cond_5

    sget-object p2, Lvx1;->a:Lvx1;

    invoke-virtual {p2, p1}, Lvx1;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :cond_5
    :goto_2
    return-object p1
.end method

.method private final formatBytes(J)Ljava/lang/String;
    .locals 2

    sget-object v0, Lvx1;->a:Lvx1;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, p2, v1}, Lvx1;->a(JZ)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private final spanBody(Ljava/lang/CharSequence;Ljava/lang/String;Landroid/content/Context;)Ljava/lang/CharSequence;
    .locals 2

    const/4 v0, 0x1

    if-eqz p2, :cond_1

    invoke-static {p2}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    move v1, v0

    :goto_1
    if-eqz v1, :cond_2

    goto :goto_2

    :cond_2
    const-string v1, "json"

    invoke-static {p2, v1, v0}, Lkotlin/text/StringsKt;->contains(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-eqz v0, :cond_3

    if-eqz p3, :cond_3

    new-instance p2, Lcom/chuckerteam/chucker/internal/support/SpanTextUtil;

    invoke-direct {p2, p3}, Lcom/chuckerteam/chucker/internal/support/SpanTextUtil;-><init>(Landroid/content/Context;)V

    invoke-virtual {p2, p1}, Lcom/chuckerteam/chucker/internal/support/SpanTextUtil;->f(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    move-result-object p1

    goto :goto_2

    :cond_3
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1, p2}, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->formatBody(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :goto_2
    return-object p1
.end method

.method private final toHttpHeaderList(Lokhttp3/Headers;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lokhttp3/Headers;",
            ")",
            "Ljava/util/List<",
            "LDN1;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p1}, Lokhttp3/Headers;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    new-instance v3, LDN1;

    invoke-virtual {p1, v2}, Lokhttp3/Headers;->name(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1, v2}, Lokhttp3/Headers;->value(I)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v3, v4, v5}, LDN1;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method


# virtual methods
.method public final getDurationString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->tookMs:Ljava/lang/Long;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, " ms"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final getError()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->error:Ljava/lang/String;

    return-object v0
.end method

.method public final getFormattedPath(Z)Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->url:Ljava/lang/String;

    if-eqz v0, :cond_1

    sget-object v1, Lokhttp3/HttpUrl;->Companion:Lokhttp3/HttpUrl$Companion;

    invoke-virtual {v1, v0}, Lokhttp3/HttpUrl$Companion;->get(Ljava/lang/String;)Lokhttp3/HttpUrl;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object v1, Lwx1;->f:Lwx1$a;

    invoke-virtual {v1, v0, p1}, Lwx1$a;->c(Lokhttp3/HttpUrl;Z)Lwx1;

    move-result-object p1

    invoke-virtual {p1}, Lwx1;->b()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_1
    :goto_0
    const-string p1, ""

    return-object p1
.end method

.method public final getFormattedRequestBody()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->requestBody:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->requestContentType:Ljava/lang/String;

    invoke-direct {p0, v0, v1}, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->formatBody(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    const-string v0, ""

    :cond_1
    return-object v0
.end method

.method public final getFormattedResponseBody()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->responseBody:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->responseContentType:Ljava/lang/String;

    invoke-direct {p0, v0, v1}, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->formatBody(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    const-string v0, ""

    :cond_1
    return-object v0
.end method

.method public final getFormattedUrl(Z)Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->url:Ljava/lang/String;

    if-eqz v0, :cond_1

    sget-object v1, Lokhttp3/HttpUrl;->Companion:Lokhttp3/HttpUrl$Companion;

    invoke-virtual {v1, v0}, Lokhttp3/HttpUrl$Companion;->get(Ljava/lang/String;)Lokhttp3/HttpUrl;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object v1, Lwx1;->f:Lwx1$a;

    invoke-virtual {v1, v0, p1}, Lwx1$a;->c(Lokhttp3/HttpUrl;Z)Lwx1;

    move-result-object p1

    invoke-virtual {p1}, Lwx1;->d()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_1
    :goto_0
    const-string p1, ""

    return-object p1
.end method

.method public final getGraphQlDetected()Z
    .locals 1

    iget-boolean v0, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->graphQlDetected:Z

    return v0
.end method

.method public final getGraphQlOperationName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->graphQlOperationName:Ljava/lang/String;

    return-object v0
.end method

.method public final getHarResponseBodySize()J
    .locals 4

    iget-object v0, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->responseCode:Ljava/lang/Integer;

    const-wide/16 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v3, 0x130

    if-ne v0, v3, :cond_1

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->responsePayloadSize:Ljava/lang/Long;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    :cond_2
    :goto_1
    return-wide v1
.end method

.method public final getHost()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->host:Ljava/lang/String;

    return-object v0
.end method

.method public final getId()J
    .locals 2

    iget-wide v0, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->id:J

    return-wide v0
.end method

.method public final getMethod()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->method:Ljava/lang/String;

    return-object v0
.end method

.method public final getNotificationText()Ljava/lang/String;
    .locals 5

    invoke-virtual {p0}, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->getStatus()Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction$a;

    move-result-object v0

    sget-object v1, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction$b;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    const-string v2, " "

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->responseCode:Ljava/lang/Integer;

    iget-object v1, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->method:Ljava/lang/String;

    iget-object v3, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->path:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->method:Ljava/lang/String;

    iget-object v1, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->path:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, " . . .  "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->method:Ljava/lang/String;

    iget-object v1, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->path:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, " ! ! !  "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public final getParsedRequestHeaders()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "LDN1;",
            ">;"
        }
    .end annotation

    sget-object v0, Lli2;->a:Lli2;

    invoke-virtual {v0}, Lli2;->a()LoE1;

    move-result-object v0

    iget-object v1, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->requestHeaders:Ljava/lang/String;

    new-instance v2, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction$c;

    invoke-direct {v2}, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction$c;-><init>()V

    invoke-virtual {v2}, LFb6;->getType()Ljava/lang/reflect/Type;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, LoE1;->o(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public final getParsedResponseHeaders()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "LDN1;",
            ">;"
        }
    .end annotation

    sget-object v0, Lli2;->a:Lli2;

    invoke-virtual {v0}, Lli2;->a()LoE1;

    move-result-object v0

    iget-object v1, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->responseHeaders:Ljava/lang/String;

    new-instance v2, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction$d;

    invoke-direct {v2}, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction$d;-><init>()V

    invoke-virtual {v2}, LFb6;->getType()Ljava/lang/reflect/Type;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, LoE1;->o(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public final getPath()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->path:Ljava/lang/String;

    return-object v0
.end method

.method public final getProtocol()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->protocol:Ljava/lang/String;

    return-object v0
.end method

.method public final getRequestBody()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->requestBody:Ljava/lang/String;

    return-object v0
.end method

.method public final getRequestContentType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->requestContentType:Ljava/lang/String;

    return-object v0
.end method

.method public final getRequestDate()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->requestDate:Ljava/lang/Long;

    return-object v0
.end method

.method public final getRequestDateString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->requestDate:Ljava/lang/Long;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    new-instance v2, Ljava/util/Date;

    invoke-direct {v2, v0, v1}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v2}, Ljava/util/Date;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final getRequestHeaders()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->requestHeaders:Ljava/lang/String;

    return-object v0
.end method

.method public final getRequestHeadersSize()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->requestHeadersSize:Ljava/lang/Long;

    return-object v0
.end method

.method public final getRequestHeadersString(Z)Ljava/lang/String;
    .locals 2

    sget-object v0, Lvx1;->a:Lvx1;

    invoke-virtual {p0}, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->getParsedRequestHeaders()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lvx1;->b(Ljava/util/List;Z)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final getRequestPayloadSize()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->requestPayloadSize:Ljava/lang/Long;

    return-object v0
.end method

.method public final getRequestSizeString()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->requestPayloadSize:Ljava/lang/Long;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x0

    :goto_0
    invoke-direct {p0, v0, v1}, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->formatBytes(J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getRequestTotalSize()J
    .locals 5

    iget-object v0, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->requestHeadersSize:Ljava/lang/Long;

    const-wide/16 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    goto :goto_0

    :cond_0
    move-wide v3, v1

    :goto_0
    iget-object v0, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->requestPayloadSize:Ljava/lang/Long;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    :cond_1
    add-long/2addr v3, v1

    return-wide v3
.end method

.method public final getResponseBody()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->responseBody:Ljava/lang/String;

    return-object v0
.end method

.method public final getResponseCipherSuite()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->responseCipherSuite:Ljava/lang/String;

    return-object v0
.end method

.method public final getResponseCode()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->responseCode:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getResponseContentType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->responseContentType:Ljava/lang/String;

    return-object v0
.end method

.method public final getResponseDate()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->responseDate:Ljava/lang/Long;

    return-object v0
.end method

.method public final getResponseDateString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->responseDate:Ljava/lang/Long;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    new-instance v2, Ljava/util/Date;

    invoke-direct {v2, v0, v1}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v2}, Ljava/util/Date;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final getResponseHeaders()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->responseHeaders:Ljava/lang/String;

    return-object v0
.end method

.method public final getResponseHeadersSize()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->responseHeadersSize:Ljava/lang/Long;

    return-object v0
.end method

.method public final getResponseHeadersString(Z)Ljava/lang/String;
    .locals 2

    sget-object v0, Lvx1;->a:Lvx1;

    invoke-virtual {p0}, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->getParsedResponseHeaders()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lvx1;->b(Ljava/util/List;Z)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final getResponseImageBitmap()Landroid/graphics/Bitmap;
    .locals 3

    iget-object v0, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->responseImageData:[B

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    array-length v2, v0

    invoke-static {v0, v1, v2}, Landroid/graphics/BitmapFactory;->decodeByteArray([BII)Landroid/graphics/Bitmap;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final getResponseImageData()[B
    .locals 1

    iget-object v0, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->responseImageData:[B

    return-object v0
.end method

.method public final getResponseMessage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->responseMessage:Ljava/lang/String;

    return-object v0
.end method

.method public final getResponsePayloadSize()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->responsePayloadSize:Ljava/lang/Long;

    return-object v0
.end method

.method public final getResponseSizeString()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->responsePayloadSize:Ljava/lang/Long;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->formatBytes(J)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final getResponseSummaryText()Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->getStatus()Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction$a;

    move-result-object v0

    sget-object v1, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction$b;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->responseCode:Ljava/lang/Integer;

    iget-object v1, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->responseMessage:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->error:Ljava/lang/String;

    :goto_0
    return-object v0
.end method

.method public final getResponseTlsVersion()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->responseTlsVersion:Ljava/lang/String;

    return-object v0
.end method

.method public final getResponseTotalSize()J
    .locals 4

    iget-object v0, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->responseHeadersSize:Ljava/lang/Long;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x0

    :goto_0
    invoke-virtual {p0}, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->getHarResponseBodySize()J

    move-result-wide v2

    add-long/2addr v0, v2

    return-wide v0
.end method

.method public final getScheme()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->scheme:Ljava/lang/String;

    return-object v0
.end method

.method public final getSpannedRequestBody(Landroid/content/Context;)Ljava/lang/CharSequence;
    .locals 2

    iget-object v0, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->requestBody:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->requestContentType:Ljava/lang/String;

    invoke-direct {p0, v0, v1, p1}, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->spanBody(Ljava/lang/CharSequence;Ljava/lang/String;Landroid/content/Context;)Ljava/lang/CharSequence;

    move-result-object p1

    if-nez p1, :cond_1

    :cond_0
    const-string p1, ""

    invoke-static {p1}, Landroid/text/SpannableStringBuilder;->valueOf(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    move-result-object p1

    const-string v0, "valueOf(\"\")"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_1
    return-object p1
.end method

.method public final getSpannedResponseBody(Landroid/content/Context;)Ljava/lang/CharSequence;
    .locals 2

    iget-object v0, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->responseBody:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->responseContentType:Ljava/lang/String;

    invoke-direct {p0, v0, v1, p1}, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->spanBody(Ljava/lang/CharSequence;Ljava/lang/String;Landroid/content/Context;)Ljava/lang/CharSequence;

    move-result-object p1

    if-nez p1, :cond_1

    :cond_0
    const-string p1, ""

    invoke-static {p1}, Landroid/text/SpannableStringBuilder;->valueOf(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    move-result-object p1

    const-string v0, "valueOf(\"\")"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_1
    return-object p1
.end method

.method public final getStatus()Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction$a;
    .locals 1

    iget-object v0, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->error:Ljava/lang/String;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction$a;->d:Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction$a;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->responseCode:Ljava/lang/Integer;

    if-nez v0, :cond_1

    sget-object v0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction$a;->b:Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction$a;

    goto :goto_0

    :cond_1
    sget-object v0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction$a;->c:Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction$a;

    :goto_0
    return-object v0
.end method

.method public final getTookMs()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->tookMs:Ljava/lang/Long;

    return-object v0
.end method

.method public final getTotalSizeString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->requestPayloadSize:Ljava/lang/Long;

    const-wide/16 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    goto :goto_0

    :cond_0
    move-wide v3, v1

    :goto_0
    iget-object v0, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->responsePayloadSize:Ljava/lang/Long;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    :cond_1
    add-long/2addr v3, v1

    invoke-direct {p0, v3, v4}, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->formatBytes(J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->url:Ljava/lang/String;

    return-object v0
.end method

.method public final hasTheSameContent(Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;)Z
    .locals 6

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-nez p1, :cond_1

    return v1

    :cond_1
    iget-wide v2, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->id:J

    iget-wide v4, p1, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->id:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_4

    iget-object v2, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->requestDate:Ljava/lang/Long;

    iget-object v3, p1, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->requestDate:Ljava/lang/Long;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    iget-object v2, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->responseDate:Ljava/lang/Long;

    iget-object v3, p1, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->responseDate:Ljava/lang/Long;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    iget-object v2, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->tookMs:Ljava/lang/Long;

    iget-object v3, p1, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->tookMs:Ljava/lang/Long;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    iget-object v2, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->protocol:Ljava/lang/String;

    iget-object v3, p1, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->protocol:Ljava/lang/String;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    iget-object v2, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->method:Ljava/lang/String;

    iget-object v3, p1, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->method:Ljava/lang/String;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    iget-object v2, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->url:Ljava/lang/String;

    iget-object v3, p1, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->url:Ljava/lang/String;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    iget-object v2, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->host:Ljava/lang/String;

    iget-object v3, p1, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->host:Ljava/lang/String;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    iget-object v2, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->path:Ljava/lang/String;

    iget-object v3, p1, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->path:Ljava/lang/String;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    iget-object v2, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->scheme:Ljava/lang/String;

    iget-object v3, p1, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->scheme:Ljava/lang/String;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    iget-object v2, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->responseTlsVersion:Ljava/lang/String;

    iget-object v3, p1, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->responseTlsVersion:Ljava/lang/String;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    iget-object v2, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->responseCipherSuite:Ljava/lang/String;

    iget-object v3, p1, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->responseCipherSuite:Ljava/lang/String;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    iget-object v2, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->requestPayloadSize:Ljava/lang/Long;

    iget-object v3, p1, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->requestPayloadSize:Ljava/lang/Long;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    iget-object v2, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->requestContentType:Ljava/lang/String;

    iget-object v3, p1, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->requestContentType:Ljava/lang/String;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    iget-object v2, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->requestHeaders:Ljava/lang/String;

    iget-object v3, p1, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->requestHeaders:Ljava/lang/String;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    iget-object v2, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->requestHeadersSize:Ljava/lang/Long;

    iget-object v3, p1, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->requestHeadersSize:Ljava/lang/Long;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    iget-object v2, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->requestBody:Ljava/lang/String;

    iget-object v3, p1, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->requestBody:Ljava/lang/String;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    iget-boolean v2, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->isRequestBodyEncoded:Z

    iget-boolean v3, p1, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->isRequestBodyEncoded:Z

    if-ne v2, v3, :cond_4

    iget-object v2, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->responseCode:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->responseCode:Ljava/lang/Integer;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    iget-object v2, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->responseMessage:Ljava/lang/String;

    iget-object v3, p1, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->responseMessage:Ljava/lang/String;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    iget-object v2, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->error:Ljava/lang/String;

    iget-object v3, p1, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->error:Ljava/lang/String;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    iget-object v2, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->responsePayloadSize:Ljava/lang/Long;

    iget-object v3, p1, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->responsePayloadSize:Ljava/lang/Long;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    iget-object v2, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->responseContentType:Ljava/lang/String;

    iget-object v3, p1, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->responseContentType:Ljava/lang/String;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    iget-object v2, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->responseHeaders:Ljava/lang/String;

    iget-object v3, p1, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->responseHeaders:Ljava/lang/String;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    iget-object v2, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->responseHeadersSize:Ljava/lang/Long;

    iget-object v3, p1, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->responseHeadersSize:Ljava/lang/Long;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    iget-object v2, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->responseBody:Ljava/lang/String;

    iget-object v3, p1, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->responseBody:Ljava/lang/String;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    iget-boolean v2, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->isResponseBodyEncoded:Z

    iget-boolean v3, p1, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->isResponseBodyEncoded:Z

    if-ne v2, v3, :cond_4

    iget-object v2, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->responseImageData:[B

    if-eqz v2, :cond_3

    iget-object v3, p1, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->responseImageData:[B

    if-nez v3, :cond_2

    new-array v3, v1, [B

    :cond_2
    invoke-static {v2, v3}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v2

    if-nez v2, :cond_3

    move v2, v0

    goto :goto_0

    :cond_3
    move v2, v1

    :goto_0
    if-nez v2, :cond_4

    iget-object v2, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->graphQlOperationName:Ljava/lang/String;

    iget-object v3, p1, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->graphQlOperationName:Ljava/lang/String;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    iget-boolean v2, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->graphQlDetected:Z

    iget-boolean p1, p1, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->graphQlDetected:Z

    if-ne v2, p1, :cond_4

    goto :goto_1

    :cond_4
    move v0, v1

    :goto_1
    return v0
.end method

.method public final isRequestBodyEncoded()Z
    .locals 1

    iget-boolean v0, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->isRequestBodyEncoded:Z

    return v0
.end method

.method public final isResponseBodyEncoded()Z
    .locals 1

    iget-boolean v0, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->isResponseBodyEncoded:Z

    return v0
.end method

.method public final isSsl()Z
    .locals 3

    iget-object v0, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->scheme:Ljava/lang/String;

    const-string v1, "https"

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lkotlin/text/StringsKt;->equals(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public final populateUrl(Lokhttp3/HttpUrl;)Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;
    .locals 2

    const-string v0, "httpUrl"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lwx1;->f:Lwx1$a;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lwx1$a;->c(Lokhttp3/HttpUrl;Z)Lwx1;

    move-result-object p1

    invoke-virtual {p1}, Lwx1;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->url:Ljava/lang/String;

    invoke-virtual {p1}, Lwx1;->a()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->host:Ljava/lang/String;

    invoke-virtual {p1}, Lwx1;->b()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->path:Ljava/lang/String;

    invoke-virtual {p1}, Lwx1;->c()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->scheme:Ljava/lang/String;

    return-object p0
.end method

.method public final setError(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->error:Ljava/lang/String;

    return-void
.end method

.method public final setGraphQlDetected(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->graphQlDetected:Z

    return-void
.end method

.method public final setGraphQlOperationName(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->graphQlOperationName:Ljava/lang/String;

    return-void
.end method

.method public final setGraphQlOperationName(Lokhttp3/Headers;)V
    .locals 6

    const-string v0, "headers"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->toHttpHeaderList(Lokhttp3/Headers;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, LDN1;

    invoke-virtual {v2}, LDN1;->a()Ljava/lang/String;

    move-result-object v2

    sget-object v3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v2, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "this as java.lang.String).toLowerCase(Locale.ROOT)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    const/4 v4, 0x2

    const-string v5, "operation-name"

    invoke-static {v2, v5, v3, v4, v1}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_1
    move-object v0, v1

    :goto_0
    check-cast v0, LDN1;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, LDN1;->b()Ljava/lang/String;

    move-result-object v1

    :cond_2
    iput-object v1, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->graphQlOperationName:Ljava/lang/String;

    return-void
.end method

.method public final setHost(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->host:Ljava/lang/String;

    return-void
.end method

.method public final setId(J)V
    .locals 0

    iput-wide p1, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->id:J

    return-void
.end method

.method public final setMethod(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->method:Ljava/lang/String;

    return-void
.end method

.method public final setPath(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->path:Ljava/lang/String;

    return-void
.end method

.method public final setProtocol(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->protocol:Ljava/lang/String;

    return-void
.end method

.method public final setRequestBody(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->requestBody:Ljava/lang/String;

    return-void
.end method

.method public final setRequestBodyEncoded(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->isRequestBodyEncoded:Z

    return-void
.end method

.method public final setRequestContentType(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->requestContentType:Ljava/lang/String;

    return-void
.end method

.method public final setRequestDate(Ljava/lang/Long;)V
    .locals 0

    iput-object p1, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->requestDate:Ljava/lang/Long;

    return-void
.end method

.method public final setRequestHeaders(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->requestHeaders:Ljava/lang/String;

    return-void
.end method

.method public final setRequestHeaders(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "LDN1;",
            ">;)V"
        }
    .end annotation

    const-string v0, "headers"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lli2;->a:Lli2;

    invoke-virtual {v0}, Lli2;->a()LoE1;

    move-result-object v0

    invoke-virtual {v0, p1}, LoE1;->x(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->requestHeaders:Ljava/lang/String;

    return-void
.end method

.method public final setRequestHeaders(Lokhttp3/Headers;)V
    .locals 1

    const-string v0, "headers"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->toHttpHeaderList(Lokhttp3/Headers;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->setRequestHeaders(Ljava/util/List;)V

    return-void
.end method

.method public final setRequestHeadersSize(Ljava/lang/Long;)V
    .locals 0

    iput-object p1, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->requestHeadersSize:Ljava/lang/Long;

    return-void
.end method

.method public final setRequestPayloadSize(Ljava/lang/Long;)V
    .locals 0

    iput-object p1, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->requestPayloadSize:Ljava/lang/Long;

    return-void
.end method

.method public final setResponseBody(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->responseBody:Ljava/lang/String;

    return-void
.end method

.method public final setResponseBodyEncoded(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->isResponseBodyEncoded:Z

    return-void
.end method

.method public final setResponseCipherSuite(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->responseCipherSuite:Ljava/lang/String;

    return-void
.end method

.method public final setResponseCode(Ljava/lang/Integer;)V
    .locals 0

    iput-object p1, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->responseCode:Ljava/lang/Integer;

    return-void
.end method

.method public final setResponseContentType(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->responseContentType:Ljava/lang/String;

    return-void
.end method

.method public final setResponseDate(Ljava/lang/Long;)V
    .locals 0

    iput-object p1, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->responseDate:Ljava/lang/Long;

    return-void
.end method

.method public final setResponseHeaders(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->responseHeaders:Ljava/lang/String;

    return-void
.end method

.method public final setResponseHeaders(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "LDN1;",
            ">;)V"
        }
    .end annotation

    const-string v0, "headers"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lli2;->a:Lli2;

    invoke-virtual {v0}, Lli2;->a()LoE1;

    move-result-object v0

    invoke-virtual {v0, p1}, LoE1;->x(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->responseHeaders:Ljava/lang/String;

    return-void
.end method

.method public final setResponseHeaders(Lokhttp3/Headers;)V
    .locals 1

    const-string v0, "headers"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->toHttpHeaderList(Lokhttp3/Headers;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->setResponseHeaders(Ljava/util/List;)V

    return-void
.end method

.method public final setResponseHeadersSize(Ljava/lang/Long;)V
    .locals 0

    iput-object p1, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->responseHeadersSize:Ljava/lang/Long;

    return-void
.end method

.method public final setResponseImageData([B)V
    .locals 0

    iput-object p1, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->responseImageData:[B

    return-void
.end method

.method public final setResponseMessage(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->responseMessage:Ljava/lang/String;

    return-void
.end method

.method public final setResponsePayloadSize(Ljava/lang/Long;)V
    .locals 0

    iput-object p1, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->responsePayloadSize:Ljava/lang/Long;

    return-void
.end method

.method public final setResponseTlsVersion(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->responseTlsVersion:Ljava/lang/String;

    return-void
.end method

.method public final setScheme(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->scheme:Ljava/lang/String;

    return-void
.end method

.method public final setTookMs(Ljava/lang/Long;)V
    .locals 0

    iput-object p1, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->tookMs:Ljava/lang/Long;

    return-void
.end method

.method public final setUrl(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->url:Ljava/lang/String;

    return-void
.end method
