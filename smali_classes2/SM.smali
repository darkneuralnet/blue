.class public interface abstract LSM;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0008\u0008\u0008f\u0018\u00002\u00020\u0001J0\u0010\n\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\t0\u00080\u00072\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&J&\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\u00072\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000cH&J\"\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\t0\u00110\u00080\u00072\u0006\u0010\u0010\u001a\u00020\u0002H&J,\u0010\u0015\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000e0\u00080\u00072\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000eH&J&\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\u00072\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000eH&J$\u0010\u0018\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000e0\u00080\u00072\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0005H&\u00a8\u0006\u0019"
    }
    d2 = {
        "LSM;",
        "",
        "",
        "id",
        "key",
        "Lco/bird/android/model/constant/PartKind;",
        "kind",
        "Lio/reactivex/F;",
        "LHM4;",
        "Lco/bird/android/model/wire/WireBirdPart;",
        "a",
        "raw",
        "",
        "warehouseSpecific",
        "Lco/bird/android/model/wire/WirePart;",
        "d",
        "birdId",
        "",
        "b",
        "sourcePart",
        "identifyingPart",
        "c",
        "f",
        "partKind",
        "e",
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
.method public abstract a(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/PartKind;)Lio/reactivex/F;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lco/bird/android/model/constant/PartKind;",
            ")",
            "Lio/reactivex/F<",
            "LHM4<",
            "Lco/bird/android/model/wire/WireBirdPart;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract b(Ljava/lang/String;)Lio/reactivex/F;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/F<",
            "LHM4<",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireBirdPart;",
            ">;>;>;"
        }
    .end annotation
.end method

.method public abstract c(Ljava/lang/String;Lco/bird/android/model/wire/WirePart;Lco/bird/android/model/wire/WirePart;)Lio/reactivex/F;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lco/bird/android/model/wire/WirePart;",
            "Lco/bird/android/model/wire/WirePart;",
            ")",
            "Lio/reactivex/F<",
            "LHM4<",
            "Lco/bird/android/model/wire/WirePart;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract d(Ljava/lang/String;Lco/bird/android/model/constant/PartKind;Z)Lio/reactivex/F;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lco/bird/android/model/constant/PartKind;",
            "Z)",
            "Lio/reactivex/F<",
            "Lco/bird/android/model/wire/WirePart;",
            ">;"
        }
    .end annotation
.end method

.method public abstract e(Ljava/lang/String;Lco/bird/android/model/constant/PartKind;)Lio/reactivex/F;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lco/bird/android/model/constant/PartKind;",
            ")",
            "Lio/reactivex/F<",
            "LHM4<",
            "Lco/bird/android/model/wire/WirePart;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract f(Ljava/lang/String;Lco/bird/android/model/wire/WirePart;Lco/bird/android/model/wire/WirePart;)Lio/reactivex/F;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lco/bird/android/model/wire/WirePart;",
            "Lco/bird/android/model/wire/WirePart;",
            ")",
            "Lio/reactivex/F<",
            "Lco/bird/android/model/wire/WirePart;",
            ">;"
        }
    .end annotation
.end method
