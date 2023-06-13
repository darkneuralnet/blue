.class public final Lco/bird/android/model/ReleasedDropKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000c\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "toReleasedDrop",
        "Lco/bird/android/model/ReleasedDrop;",
        "Lco/bird/android/model/wire/WireDrop;",
        "model_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final toReleasedDrop(Lco/bird/android/model/wire/WireDrop;)Lco/bird/android/model/ReleasedDrop;
    .locals 7

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireDrop;->getReleasedAt()Lorg/joda/time/DateTime;

    move-result-object v5

    if-eqz v5, :cond_0

    new-instance v0, Lco/bird/android/model/ReleasedDrop;

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireDrop;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireDrop;->getQuantity()I

    move-result v3

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireDrop;->getPhotoUrl()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireDrop;->getAddress()Ljava/lang/String;

    move-result-object v6

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lco/bird/android/model/ReleasedDrop;-><init>(Ljava/lang/String;ILjava/lang/String;Lorg/joda/time/DateTime;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method
