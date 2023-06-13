.class public interface abstract LRM;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008f\u0018\u00002\u00020\u0001J6\u0010\n\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\t0\u00080\u00072\n\u0008\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0008\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0005H\'J$\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\t0\u000c0\u00080\u00072\u0008\u0008\u0001\u0010\u000b\u001a\u00020\u0002H\'J\u001e\u0010\u0011\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00100\u00080\u00072\u0008\u0008\u0001\u0010\u000f\u001a\u00020\u000eH\'J\u0018\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u00072\u0008\u0008\u0001\u0010\u000f\u001a\u00020\u000eH\'J\u001e\u0010\u0013\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00100\u00080\u00072\u0008\u0008\u0001\u0010\u000f\u001a\u00020\u000eH\'\u00a8\u0006\u0014"
    }
    d2 = {
        "LRM;",
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
        "birdId",
        "",
        "b",
        "Lco/bird/android/model/BirdPartBody;",
        "body",
        "Lco/bird/android/model/wire/WirePart;",
        "c",
        "d",
        "e",
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
.method public abstract a(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/PartKind;)Lio/reactivex/F;
    .param p1    # Ljava/lang/String;
        .annotation runtime LXc4;
            value = "id"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime LXc4;
            value = "key"
        .end annotation
    .end param
    .param p3    # Lco/bird/android/model/constant/PartKind;
        .annotation runtime LXc4;
            value = "kind"
        .end annotation
    .end param
    .annotation runtime LNA1;
        value = "bird-part/by-part"
    .end annotation

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
    .param p1    # Ljava/lang/String;
        .annotation runtime LXc4;
            value = "bird_id"
        .end annotation
    .end param
    .annotation runtime LNA1;
        value = "bird-part/by-bird"
    .end annotation

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

.method public abstract c(Lco/bird/android/model/BirdPartBody;)Lio/reactivex/F;
    .param p1    # Lco/bird/android/model/BirdPartBody;
        .annotation runtime LPY;
        .end annotation
    .end param
    .annotation runtime LAD3;
        value = "bird-part/attach-part"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/BirdPartBody;",
            ")",
            "Lio/reactivex/F<",
            "LHM4<",
            "Lco/bird/android/model/wire/WirePart;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract d(Lco/bird/android/model/BirdPartBody;)Lio/reactivex/F;
    .param p1    # Lco/bird/android/model/BirdPartBody;
        .annotation runtime LPY;
        .end annotation
    .end param
    .annotation runtime LAD3;
        value = "bird-part/brain-swap"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/BirdPartBody;",
            ")",
            "Lio/reactivex/F<",
            "Lco/bird/android/model/wire/WirePart;",
            ">;"
        }
    .end annotation
.end method

.method public abstract e(Lco/bird/android/model/BirdPartBody;)Lio/reactivex/F;
    .param p1    # Lco/bird/android/model/BirdPartBody;
        .annotation runtime LPY;
        .end annotation
    .end param
    .annotation runtime LAD3;
        value = "bird-part/detach-part"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/BirdPartBody;",
            ")",
            "Lio/reactivex/F<",
            "LHM4<",
            "Lco/bird/android/model/wire/WirePart;",
            ">;>;"
        }
    .end annotation
.end method
