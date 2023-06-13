.class public final Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0016\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\n\u0010\u0004\u001a\u0006\u0012\u0002\u0008\u00030\u0003\u00a8\u0006\t"
    }
    d2 = {
        "Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager$Companion;",
        "",
        "LfM2;",
        "Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;",
        "item",
        "",
        "showInfoWindow",
        "<init>",
        "()V",
        "co.bird.android.feature.map"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final showInfoWindow(LfM2;Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LfM2;",
            "Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem<",
            "*>;)V"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "item"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, LfM2;->p(Ljava/lang/Object;)V

    invoke-virtual {p1}, LfM2;->t()V

    return-void
.end method
