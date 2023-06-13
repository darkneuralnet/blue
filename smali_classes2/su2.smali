.class public interface abstract Lsu2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lsu2$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008f\u0018\u00002\u00020\u0001J(\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00082\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006H&J4\u0010\u0010\u001a\u00020\u000f2\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH&J\u001c\u0010\u0015\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00140\u00130\u00082\u0006\u0010\u0012\u001a\u00020\u0011H&J\u001c\u0010\u0018\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00170\u00130\u00082\u0006\u0010\u0016\u001a\u00020\u0002H&J\u0010\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0002H&Jb\u0010!\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0008\u0008\u0002\u0010\u001c\u001a\u00020\u001b2\n\u0008\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010 \u001a\u0004\u0018\u00010\r2\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH&J\u0016\u0010\"\u001a\u0008\u0012\u0004\u0012\u00020\r0\u00082\u0006\u0010\u0005\u001a\u00020\u0004H&J\u001e\u0010%\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u00082\u0006\u0010$\u001a\u00020#2\u0006\u0010\u0005\u001a\u00020\u0004H&R \u0010)\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00110\u000b0&8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\'\u0010(\u00a8\u0006*"
    }
    d2 = {
        "Lsu2;",
        "",
        "",
        "assetId",
        "Lco/bird/android/model/constant/AssetManagerType;",
        "manager",
        "Lco/bird/android/model/constant/TaskPriority;",
        "priority",
        "Lio/reactivex/F;",
        "Lco/bird/android/model/LocalAsset;",
        "a",
        "",
        "assetIds",
        "Lorg/joda/time/DateTime;",
        "manifestDate",
        "Lio/reactivex/c;",
        "c",
        "Lco/bird/android/model/AssetTask;",
        "task",
        "LHM4;",
        "Lco/bird/api/response/WireSignedUrl;",
        "d",
        "dynamicUrl",
        "Lokhttp3/ResponseBody;",
        "f",
        "e",
        "id",
        "",
        "fileSize",
        "mediaType",
        "filePath",
        "createdBy",
        "downloadedAt",
        "h",
        "g",
        "Ljava/io/File;",
        "file",
        "i",
        "Lio/reactivex/Observable;",
        "b",
        "()Lio/reactivex/Observable;",
        "tasks",
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
.method public abstract a(Ljava/lang/String;Lco/bird/android/model/constant/AssetManagerType;Lco/bird/android/model/constant/TaskPriority;)Lio/reactivex/F;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lco/bird/android/model/constant/AssetManagerType;",
            "Lco/bird/android/model/constant/TaskPriority;",
            ")",
            "Lio/reactivex/F<",
            "Lco/bird/android/model/LocalAsset;",
            ">;"
        }
    .end annotation
.end method

.method public abstract b()Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Ljava/util/List<",
            "Lco/bird/android/model/AssetTask;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract c(Ljava/util/List;Lco/bird/android/model/constant/AssetManagerType;Lco/bird/android/model/constant/TaskPriority;Lorg/joda/time/DateTime;)Lio/reactivex/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lco/bird/android/model/constant/AssetManagerType;",
            "Lco/bird/android/model/constant/TaskPriority;",
            "Lorg/joda/time/DateTime;",
            ")",
            "Lio/reactivex/c;"
        }
    .end annotation
.end method

.method public abstract d(Lco/bird/android/model/AssetTask;)Lio/reactivex/F;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/AssetTask;",
            ")",
            "Lio/reactivex/F<",
            "LHM4<",
            "Lco/bird/api/response/WireSignedUrl;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract e(Ljava/lang/String;)Lio/reactivex/c;
.end method

.method public abstract f(Ljava/lang/String;)Lio/reactivex/F;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/F<",
            "LHM4<",
            "Lokhttp3/ResponseBody;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract g(Lco/bird/android/model/constant/AssetManagerType;)Lio/reactivex/F;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/constant/AssetManagerType;",
            ")",
            "Lio/reactivex/F<",
            "Lorg/joda/time/DateTime;",
            ">;"
        }
    .end annotation
.end method

.method public abstract h(Ljava/lang/String;Lco/bird/android/model/constant/AssetManagerType;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;)Lio/reactivex/c;
.end method

.method public abstract i(Ljava/io/File;Lco/bird/android/model/constant/AssetManagerType;)Lio/reactivex/F;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/File;",
            "Lco/bird/android/model/constant/AssetManagerType;",
            ")",
            "Lio/reactivex/F<",
            "Lco/bird/api/response/WireSignedUrl;",
            ">;"
        }
    .end annotation
.end method
