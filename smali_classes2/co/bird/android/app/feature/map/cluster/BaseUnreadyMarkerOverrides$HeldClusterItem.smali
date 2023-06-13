.class public final Lco/bird/android/app/feature/map/cluster/BaseUnreadyMarkerOverrides$HeldClusterItem;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/app/feature/map/cluster/BaseUnreadyMarkerOverrides;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "HeldClusterItem"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0004\u0018\u0000*\u0004\u0008\u0001\u0010\u00012\u00020\u0002B\u001d\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u001d\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\u0005\u001a\u0004\u0008\u0006\u0010\u0007R\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u000f"
    }
    d2 = {
        "Lco/bird/android/app/feature/map/cluster/BaseUnreadyMarkerOverrides$HeldClusterItem;",
        "T",
        "",
        "Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;",
        "item",
        "Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;",
        "getItem",
        "()Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;",
        "LLt2;",
        "loadingOverride",
        "LLt2;",
        "getLoadingOverride",
        "()LLt2;",
        "<init>",
        "(Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;LLt2;)V",
        "co.bird.android.feature.map"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field private final item:Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem<",
            "TT;>;"
        }
    .end annotation
.end field

.field private final loadingOverride:LLt2;


# direct methods
.method public constructor <init>(Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;LLt2;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem<",
            "TT;>;",
            "LLt2;",
            ")V"
        }
    .end annotation

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "loadingOverride"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/app/feature/map/cluster/BaseUnreadyMarkerOverrides$HeldClusterItem;->item:Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;

    iput-object p2, p0, Lco/bird/android/app/feature/map/cluster/BaseUnreadyMarkerOverrides$HeldClusterItem;->loadingOverride:LLt2;

    return-void
.end method


# virtual methods
.method public final getItem()Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/app/feature/map/cluster/BaseUnreadyMarkerOverrides$HeldClusterItem;->item:Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;

    return-object v0
.end method

.method public final getLoadingOverride()LLt2;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/cluster/BaseUnreadyMarkerOverrides$HeldClusterItem;->loadingOverride:LLt2;

    return-object v0
.end method
