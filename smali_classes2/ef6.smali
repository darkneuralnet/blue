.class public interface abstract Lef6;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lef6$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\u0008\u0004\n\u0002\u0010$\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008f\u0018\u00002\u00020\u0001JN\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\n0\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00082\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000cH&J.\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008H&JN\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\n0\u000f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00082\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000cH&J:\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u000f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00082\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH&J*\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\n0\u000f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u00082\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH&J.\u0010\u001e\u001a\u00020\u001d2\u0014\u0008\u0002\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u00182\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001bH&\u00a8\u0006\u001f"
    }
    d2 = {
        "Lef6;",
        "",
        "Ljava/io/File;",
        "file",
        "Lco/bird/android/model/constant/ContentKind;",
        "contentKind",
        "Lco/bird/android/model/constant/UploadKind;",
        "uploadKind",
        "Lco/bird/android/model/Folder;",
        "s3Folder",
        "",
        "filename",
        "",
        "useSignedUrlUpload",
        "needAssetId",
        "Lio/reactivex/F;",
        "e",
        "Lco/bird/android/model/FileUploadReceipt;",
        "h",
        "",
        "bytes",
        "c",
        "g",
        "f",
        "",
        "headers",
        "signedUrl",
        "Landroid/net/Uri;",
        "uri",
        "Lio/reactivex/c;",
        "d",
        "core-interface_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# virtual methods
.method public abstract c([BLco/bird/android/model/constant/ContentKind;Lco/bird/android/model/constant/UploadKind;Lco/bird/android/model/Folder;Ljava/lang/String;ZZ)Lio/reactivex/F;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([B",
            "Lco/bird/android/model/constant/ContentKind;",
            "Lco/bird/android/model/constant/UploadKind;",
            "Lco/bird/android/model/Folder;",
            "Ljava/lang/String;",
            "ZZ)",
            "Lio/reactivex/F<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end method

.method public abstract d(Ljava/util/Map;Ljava/lang/String;Landroid/net/Uri;)Lio/reactivex/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Landroid/net/Uri;",
            ")",
            "Lio/reactivex/c;"
        }
    .end annotation
.end method

.method public abstract e(Ljava/io/File;Lco/bird/android/model/constant/ContentKind;Lco/bird/android/model/constant/UploadKind;Lco/bird/android/model/Folder;Ljava/lang/String;ZZ)Lio/reactivex/F;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/File;",
            "Lco/bird/android/model/constant/ContentKind;",
            "Lco/bird/android/model/constant/UploadKind;",
            "Lco/bird/android/model/Folder;",
            "Ljava/lang/String;",
            "ZZ)",
            "Lio/reactivex/F<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end method

.method public abstract f([BLco/bird/android/model/Folder;Ljava/lang/String;)Lio/reactivex/F;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([B",
            "Lco/bird/android/model/Folder;",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/F<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end method

.method public abstract g([BLco/bird/android/model/constant/ContentKind;Lco/bird/android/model/constant/UploadKind;Lco/bird/android/model/Folder;Ljava/lang/String;)Lio/reactivex/F;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([B",
            "Lco/bird/android/model/constant/ContentKind;",
            "Lco/bird/android/model/constant/UploadKind;",
            "Lco/bird/android/model/Folder;",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/F<",
            "Lco/bird/android/model/FileUploadReceipt;",
            ">;"
        }
    .end annotation
.end method

.method public abstract h(Ljava/io/File;Lco/bird/android/model/constant/ContentKind;Lco/bird/android/model/constant/UploadKind;Lco/bird/android/model/Folder;)Lio/reactivex/F;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/File;",
            "Lco/bird/android/model/constant/ContentKind;",
            "Lco/bird/android/model/constant/UploadKind;",
            "Lco/bird/android/model/Folder;",
            ")",
            "Lio/reactivex/F<",
            "Lco/bird/android/model/FileUploadReceipt;",
            ">;"
        }
    .end annotation
.end method
