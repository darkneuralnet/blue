.class public final Lkf6$e;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkf6;->h(Ljava/io/File;Lco/bird/android/model/constant/ContentKind;Lco/bird/android/model/constant/UploadKind;Lco/bird/android/model/Folder;)Lio/reactivex/F;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/wire/WireSignedUrlUploadConfigResponse;",
        "Lio/reactivex/K<",
        "+",
        "Lco/bird/android/model/FileUploadReceipt;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Lco/bird/android/model/wire/WireSignedUrlUploadConfigResponse;",
        "uploadConfigResponse",
        "Lio/reactivex/K;",
        "Lco/bird/android/model/FileUploadReceipt;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lco/bird/android/model/wire/WireSignedUrlUploadConfigResponse;)Lio/reactivex/K;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/model/constant/ContentKind;

.field public final synthetic h:Ljava/io/File;

.field public final synthetic i:Lkf6;


# direct methods
.method public constructor <init>(Lco/bird/android/model/constant/ContentKind;Ljava/io/File;Lkf6;)V
    .locals 0

    iput-object p1, p0, Lkf6$e;->g:Lco/bird/android/model/constant/ContentKind;

    iput-object p2, p0, Lkf6$e;->h:Ljava/io/File;

    iput-object p3, p0, Lkf6$e;->i:Lkf6;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/wire/WireSignedUrlUploadConfigResponse;)Lio/reactivex/K;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/wire/WireSignedUrlUploadConfigResponse;",
            ")",
            "Lio/reactivex/K<",
            "+",
            "Lco/bird/android/model/FileUploadReceipt;",
            ">;"
        }
    .end annotation

    const-string v0, "uploadConfigResponse"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireSignedUrlUploadConfigResponse;->getFileUrlSigned()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireSignedUrlUploadConfigResponse;->getFileUrl()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Ljava/net/URLConnection;->getFileNameMap()Ljava/net/FileNameMap;

    move-result-object v2

    iget-object v3, p0, Lkf6$e;->g:Lco/bird/android/model/constant/ContentKind;

    invoke-virtual {v3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/net/FileNameMap;->getContentTypeFor(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lokhttp3/MediaType;->Companion:Lokhttp3/MediaType$Companion;

    const-string v4, "mimeType"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Lokhttp3/MediaType$Companion;->parse(Ljava/lang/String;)Lokhttp3/MediaType;

    move-result-object v4

    if-nez v4, :cond_0

    invoke-virtual {v3, v2}, Lokhttp3/MediaType$Companion;->get(Ljava/lang/String;)Lokhttp3/MediaType;

    move-result-object v4

    :cond_0
    sget-object v2, Lokhttp3/RequestBody;->Companion:Lokhttp3/RequestBody$Companion;

    iget-object v3, p0, Lkf6$e;->h:Ljava/io/File;

    invoke-virtual {v2, v3, v4}, Lokhttp3/RequestBody$Companion;->create(Ljava/io/File;Lokhttp3/MediaType;)Lokhttp3/RequestBody;

    move-result-object v2

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireSignedUrlUploadConfigResponse;->getHeaders()Ljava/util/Map;

    move-result-object v3

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireSignedUrlUploadConfigResponse;->getMethod()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    move-result v5

    const v6, 0x136ef

    if-eq v5, v6, :cond_5

    const v6, 0x2590a0

    if-eq v5, v6, :cond_3

    const v6, 0x4862828

    if-eq v5, v6, :cond_1

    goto :goto_0

    :cond_1
    const-string v5, "PATCH"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    goto :goto_0

    :cond_2
    iget-object v4, p0, Lkf6$e;->i:Lkf6;

    invoke-static {v4}, Lkf6;->access$getAssetUploadClient$p(Lkf6;)LZo;

    move-result-object v4

    invoke-interface {v4, v3, v0, v2}, LZo;->a(Ljava/util/Map;Ljava/lang/String;Lokhttp3/RequestBody;)Lio/reactivex/c;

    move-result-object v0

    goto :goto_1

    :cond_3
    const-string v5, "POST"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_4

    goto :goto_0

    :cond_4
    iget-object v4, p0, Lkf6$e;->i:Lkf6;

    invoke-static {v4}, Lkf6;->access$getAssetUploadClient$p(Lkf6;)LZo;

    move-result-object v4

    invoke-interface {v4, v3, v0, v2}, LZo;->c(Ljava/util/Map;Ljava/lang/String;Lokhttp3/RequestBody;)Lio/reactivex/c;

    move-result-object v0

    goto :goto_1

    :cond_5
    const-string v5, "PUT"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_6

    :goto_0
    new-instance v0, Lkotlin/TypeCastException;

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireSignedUrlUploadConfigResponse;->getMethod()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Unable to process method for asset upload: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Lkotlin/TypeCastException;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lio/reactivex/c;->F(Ljava/lang/Throwable;)Lio/reactivex/c;

    move-result-object v0

    goto :goto_1

    :cond_6
    iget-object v4, p0, Lkf6$e;->i:Lkf6;

    invoke-static {v4}, Lkf6;->access$getAssetUploadClient$p(Lkf6;)LZo;

    move-result-object v4

    invoke-interface {v4, v3, v0, v2}, LZo;->b(Ljava/util/Map;Ljava/lang/String;Lokhttp3/RequestBody;)Lio/reactivex/c;

    move-result-object v0

    :goto_1
    new-instance v2, Lco/bird/android/model/FileUploadReceipt;

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireSignedUrlUploadConfigResponse;->getAssetId()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, p1, v1}, Lco/bird/android/model/FileUploadReceipt;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v2}, Lio/reactivex/F;->H(Ljava/lang/Object;)Lio/reactivex/F;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/reactivex/c;->m(Lio/reactivex/K;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/wire/WireSignedUrlUploadConfigResponse;

    invoke-virtual {p0, p1}, Lkf6$e;->a(Lco/bird/android/model/wire/WireSignedUrlUploadConfigResponse;)Lio/reactivex/K;

    move-result-object p1

    return-object p1
.end method
