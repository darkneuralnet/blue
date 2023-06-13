.class public abstract Lco/bird/android/app/feature/map/renderer/AbstractMarkerClusterRenderer;
.super LEW0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "T:",
        "Lco/bird/android/app/feature/map/cluster/MarkerClusterItem<",
        "TK;>;>",
        "LEW0<",
        "TT;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008&\u0018\u0000*\u0004\u0008\u0000\u0010\u0001*\u000e\u0008\u0001\u0010\u0003*\u0008\u0012\u0004\u0012\u00028\u00000\u00022\u0008\u0012\u0004\u0012\u00028\u00010\u0004B%\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001f\u0010\t\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00028\u00012\u0006\u0010\u0007\u001a\u00020\u0006H&\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u0013"
    }
    d2 = {
        "Lco/bird/android/app/feature/map/renderer/AbstractMarkerClusterRenderer;",
        "K",
        "Lco/bird/android/app/feature/map/cluster/MarkerClusterItem;",
        "T",
        "LEW0;",
        "item",
        "LfM2;",
        "marker",
        "",
        "updateItem",
        "(Lco/bird/android/app/feature/map/cluster/MarkerClusterItem;LfM2;)V",
        "Landroid/content/Context;",
        "context",
        "LcD1;",
        "map",
        "LGl0;",
        "clusterManager",
        "<init>",
        "(Landroid/content/Context;LcD1;LGl0;)V",
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
.method public constructor <init>(Landroid/content/Context;LcD1;LGl0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "LcD1;",
            "LGl0<",
            "TT;>;)V"
        }
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "map"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clusterManager"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2, p3}, LEW0;-><init>(Landroid/content/Context;LcD1;LGl0;)V

    return-void
.end method


# virtual methods
.method public abstract updateItem(Lco/bird/android/app/feature/map/cluster/MarkerClusterItem;LfM2;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "LfM2;",
            ")V"
        }
    .end annotation
.end method
