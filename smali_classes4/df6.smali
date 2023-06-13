.class public interface abstract Ldf6;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008f\u0018\u00002\u00020\u0001J\"\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u0004H\'\u00a8\u0006\t"
    }
    d2 = {
        "Ldf6;",
        "",
        "Lco/bird/android/model/constant/UploadKind;",
        "uploadKind",
        "Lco/bird/android/model/constant/ContentKind;",
        "contentKind",
        "Lio/reactivex/F;",
        "Lco/bird/android/model/wire/WireSignedUrlUploadConfigResponse;",
        "a",
        "co.bird.android.api"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# virtual methods
.method public abstract a(Lco/bird/android/model/constant/UploadKind;Lco/bird/android/model/constant/ContentKind;)Lio/reactivex/F;
    .param p1    # Lco/bird/android/model/constant/UploadKind;
        .annotation runtime LXc4;
            value = "upload_kind"
        .end annotation
    .end param
    .param p2    # Lco/bird/android/model/constant/ContentKind;
        .annotation runtime LXc4;
            value = "mime_type"
        .end annotation
    .end param
    .annotation runtime LNA1;
        value = "v1/signed/upload-config"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/constant/UploadKind;",
            "Lco/bird/android/model/constant/ContentKind;",
            ")",
            "Lio/reactivex/F<",
            "Lco/bird/android/model/wire/WireSignedUrlUploadConfigResponse;",
            ">;"
        }
    .end annotation
.end method
