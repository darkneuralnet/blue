.class public final Lu83;
.super LBB;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lu83$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0016B!\u0008\u0007\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0014J\u0018\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0014J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0014J\u0018\u0010\u000c\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\tH\u0014\u00a8\u0006\u0017"
    }
    d2 = {
        "Lu83;",
        "LBB;",
        "Lco/bird/android/model/wire/WireBird;",
        "bird",
        "LmM2;",
        "r",
        "Lio/reactivex/F;",
        "LAA3;",
        "t",
        "Lco/bird/android/model/persistence/BirdMapMarker;",
        "birdMarker",
        "q",
        "s",
        "LsP2;",
        "mediaManager",
        "LB95;",
        "bitmapCache",
        "LEa;",
        "analyticsManager",
        "<init>",
        "(LsP2;LB95;LEa;)V",
        "j",
        "a",
        "media_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final j:Lu83$a;

.field public static final k:LmM2;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lu83$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lu83$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lu83;->j:Lu83$a;

    new-instance v0, LmM2;

    const-string v1, ""

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LmM2;-><init>(Ljava/lang/String;Z)V

    sput-object v0, Lu83;->k:LmM2;

    return-void
.end method

.method public constructor <init>(LsP2;LB95;LEa;)V
    .locals 1

    const-string v0, "mediaManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bitmapCache"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsManager"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2, p3}, LBB;-><init>(LsP2;Lwn4;LEa;)V

    return-void
.end method


# virtual methods
.method public q(Lco/bird/android/model/persistence/BirdMapMarker;)LmM2;
    .locals 1

    const-string v0, "birdMarker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lu83;->k:LmM2;

    return-object p1
.end method

.method public r(Lco/bird/android/model/wire/WireBird;)LmM2;
    .locals 1

    const-string v0, "bird"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lu83;->k:LmM2;

    return-object p1
.end method

.method public s(Lco/bird/android/model/persistence/BirdMapMarker;)Lio/reactivex/F;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/persistence/BirdMapMarker;",
            ")",
            "Lio/reactivex/F<",
            "LAA3;",
            ">;"
        }
    .end annotation

    const-string v0, "birdMarker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public t(Lco/bird/android/model/wire/WireBird;)Lio/reactivex/F;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/wire/WireBird;",
            ")",
            "Lio/reactivex/F<",
            "LAA3;",
            ">;"
        }
    .end annotation

    const-string v0, "bird"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method
