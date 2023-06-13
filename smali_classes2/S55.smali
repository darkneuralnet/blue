.class public final LS55;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0007\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\u000c\u0010\u0004\u001a\u00020\u0001*\u0004\u0018\u00010\u0003\"\u001d\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0002\u0010\u0007\u001a\u0004\u0008\u0008\u0010\t\"\u001d\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u0007\u001a\u0004\u0008\u000b\u0010\t\u00a8\u0006\r"
    }
    d2 = {
        "Lco/bird/android/model/User;",
        "",
        "a",
        "Lco/bird/android/model/wire/WireBird;",
        "d",
        "",
        "Lco/bird/android/model/AgreementRole;",
        "Ljava/util/List;",
        "c",
        "()Ljava/util/List;",
        "REQUIRED_RIDER_AGREEMENTS",
        "b",
        "REQUIRED_PRIVATE_BIRD_RIDER_AGREEMENTS",
        "app_birdRelease"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lco/bird/android/model/AgreementRole;",
            ">;"
        }
    .end annotation
.end field

.field public static final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lco/bird/android/model/AgreementRole;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    const/4 v0, 0x4

    new-array v0, v0, [Lco/bird/android/model/AgreementRole;

    sget-object v1, Lco/bird/android/model/AgreementRole;->RIDER:Lco/bird/android/model/AgreementRole;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/4 v2, 0x1

    sget-object v3, Lco/bird/android/model/AgreementRole;->PRELOAD:Lco/bird/android/model/AgreementRole;

    aput-object v3, v0, v2

    const/4 v2, 0x2

    sget-object v3, Lco/bird/android/model/AgreementRole;->MULTI_RIDE_HOST:Lco/bird/android/model/AgreementRole;

    aput-object v3, v0, v2

    const/4 v2, 0x3

    sget-object v3, Lco/bird/android/model/AgreementRole;->MULTI_RIDE_GUEST:Lco/bird/android/model/AgreementRole;

    aput-object v3, v0, v2

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, LS55;->a:Ljava/util/List;

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, LS55;->b:Ljava/util/List;

    return-void
.end method

.method public static final a(Lco/bird/android/model/User;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/User;->isCashPay()Ljava/lang/Boolean;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final b()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/model/AgreementRole;",
            ">;"
        }
    .end annotation

    sget-object v0, LS55;->b:Ljava/util/List;

    return-object v0
.end method

.method public static final c()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/model/AgreementRole;",
            ">;"
        }
    .end annotation

    sget-object v0, LS55;->a:Ljava/util/List;

    return-object v0
.end method

.method public static final d(Lco/bird/android/model/wire/WireBird;)Z
    .locals 0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireBird;->getPrivateBird()Lco/bird/android/model/wire/WirePrivateBird;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    if-eqz p0, :cond_1

    const/4 p0, 0x1

    goto :goto_1

    :cond_1
    const/4 p0, 0x0

    :goto_1
    return p0
.end method
