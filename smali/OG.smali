.class public final LOG;
.super Lfy0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lfy0<",
        "Lcom/adyen/checkout/card/api/model/BinLookupResponse;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0008\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u000e"
    }
    d2 = {
        "LOG;",
        "Lfy0;",
        "Lcom/adyen/checkout/card/api/model/BinLookupResponse;",
        "i",
        "Lcom/adyen/checkout/card/api/model/BinLookupRequest;",
        "g",
        "Lcom/adyen/checkout/card/api/model/BinLookupRequest;",
        "request",
        "Lcom/adyen/checkout/core/api/Environment;",
        "environment",
        "",
        "clientKey",
        "<init>",
        "(Lcom/adyen/checkout/card/api/model/BinLookupRequest;Lcom/adyen/checkout/core/api/Environment;Ljava/lang/String;)V",
        "card_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
.end annotation


# instance fields
.field public final g:Lcom/adyen/checkout/card/api/model/BinLookupRequest;


# direct methods
.method public constructor <init>(Lcom/adyen/checkout/card/api/model/BinLookupRequest;Lcom/adyen/checkout/core/api/Environment;Ljava/lang/String;)V
    .locals 1

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "environment"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clientKey"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2}, Lcom/adyen/checkout/core/api/Environment;->a()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "v2/bin/binLookup?clientKey="

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p0, p2}, Lfy0;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, LOG;->g:Lcom/adyen/checkout/card/api/model/BinLookupRequest;

    return-void
.end method


# virtual methods
.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LOG;->i()Lcom/adyen/checkout/card/api/model/BinLookupResponse;

    move-result-object v0

    return-object v0
.end method

.method public i()Lcom/adyen/checkout/card/api/model/BinLookupResponse;
    .locals 4

    invoke-static {}, LPG;->a()Ljava/lang/String;

    move-result-object v0

    const-string v1, "call - "

    invoke-virtual {p0}, Lfy0;->d()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, LCx2;->f(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, LPG;->a()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/adyen/checkout/card/api/model/BinLookupRequest;->e:Lcom/adyen/checkout/card/api/model/BinLookupRequest$b;

    invoke-virtual {v1}, Lcom/adyen/checkout/card/api/model/BinLookupRequest$b;->a()Lcom/adyen/checkout/core/model/ModelObject$Serializer;

    move-result-object v2

    iget-object v3, p0, LOG;->g:Lcom/adyen/checkout/card/api/model/BinLookupRequest;

    invoke-interface {v2, v3}, Lcom/adyen/checkout/core/model/ModelObject$Serializer;->serialize(Lcom/adyen/checkout/core/model/ModelObject;)Lorg/json/JSONObject;

    move-result-object v2

    const-string v3, "BinLookupRequest.SERIALIZER.serialize(request)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, Lcom/adyen/checkout/core/model/JsonUtilsKt;->toStringPretty(Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "request - "

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, LCx2;->f(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/adyen/checkout/card/api/model/BinLookupRequest$b;->a()Lcom/adyen/checkout/core/model/ModelObject$Serializer;

    move-result-object v0

    iget-object v1, p0, LOG;->g:Lcom/adyen/checkout/card/api/model/BinLookupRequest;

    invoke-interface {v0, v1}, Lcom/adyen/checkout/core/model/ModelObject$Serializer;->serialize(Lcom/adyen/checkout/core/model/ModelObject;)Lorg/json/JSONObject;

    move-result-object v0

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "BinLookupRequest.SERIALIZER.serialize(request).toString()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lfy0;->e:Ljava/util/Map;

    sget-object v2, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v0, v2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    const-string v3, "(this as java.lang.String).getBytes(charset)"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v1, v0}, Lfy0;->h(Ljava/util/Map;[B)[B

    move-result-object v0

    const-string v1, "post(CONTENT_TYPE_JSON_HEADER, requestString.toByteArray(Charsets.UTF_8))"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lorg/json/JSONObject;

    new-instance v3, Ljava/lang/String;

    invoke-direct {v3, v0, v2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    invoke-direct {v1, v3}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-static {}, LPG;->a()Ljava/lang/String;

    move-result-object v0

    const-string v2, "response: "

    invoke-static {v1}, Lcom/adyen/checkout/core/model/JsonUtilsKt;->toStringPretty(Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, LCx2;->f(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lcom/adyen/checkout/card/api/model/BinLookupResponse;->e:Lcom/adyen/checkout/card/api/model/BinLookupResponse$b;

    invoke-virtual {v0}, Lcom/adyen/checkout/card/api/model/BinLookupResponse$b;->a()Lcom/adyen/checkout/core/model/ModelObject$Serializer;

    move-result-object v0

    invoke-interface {v0, v1}, Lcom/adyen/checkout/core/model/ModelObject$Serializer;->deserialize(Lorg/json/JSONObject;)Lcom/adyen/checkout/core/model/ModelObject;

    move-result-object v0

    const-string v1, "BinLookupResponse.SERIALIZER.deserialize(resultJson)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/adyen/checkout/card/api/model/BinLookupResponse;

    return-object v0
.end method
