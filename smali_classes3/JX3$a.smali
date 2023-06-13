.class public final LJX3$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJX3;->d(Lcom/google/android/gms/maps/model/LatLng;Lco/bird/android/model/Polygon;II)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/Integer;",
        "Ljava/util/List<",
        "+",
        "Lcom/google/android/gms/maps/model/LatLng;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\u0010\u0000\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n\u00a2\u0006\u0002\u0008\u0005"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lcom/google/android/gms/maps/model/LatLng;",
        "i",
        "",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nPolygon+.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Polygon+.kt\nco/bird/android/geo/extension/Polygon_Kt$contains$insideRings$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,64:1\n11335#2:65\n11670#2,3:66\n*S KotlinDebug\n*F\n+ 1 Polygon+.kt\nco/bird/android/geo/extension/Polygon_Kt$contains$insideRings$1\n*L\n19#1:65\n19#1:66,3\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/model/Polygon;


# direct methods
.method public constructor <init>(Lco/bird/android/model/Polygon;)V
    .locals 0

    iput-object p1, p0, LJX3$a;->g:Lco/bird/android/model/Polygon;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, LJX3$a;->invoke(I)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(I)Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/List<",
            "Lcom/google/android/gms/maps/model/LatLng;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LJX3$a;->g:Lco/bird/android/model/Polygon;

    invoke-virtual {v0, p1}, Lco/bird/android/model/Polygon;->getRing(I)Lco/bird/android/model/LinearRing;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/PointComposedGeom;->getPoints()[Lco/bird/android/model/Point;

    move-result-object p1

    const-string v0, "getRing(i).points"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    array-length v1, p1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    array-length v1, p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, p1, v2

    new-instance v4, Lcom/google/android/gms/maps/model/LatLng;

    iget-wide v5, v3, Lco/bird/android/model/Point;->y:D

    iget-wide v7, v3, Lco/bird/android/model/Point;->x:D

    invoke-direct {v4, v5, v6, v7, v8}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    invoke-interface {v0, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method
