.class final Lco/bird/android/model/persistence/Area$jtsRegion$2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/model/persistence/Area;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZZZLjava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Lco/bird/android/model/constant/AreaIconType;Ljava/lang/Integer;Ljava/lang/String;Lco/bird/android/model/Polygon;ILjava/lang/Integer;ILjava/lang/Integer;ILjava/lang/Integer;Lco/bird/android/model/constant/ZoomBehavior;ZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/AreaIconType;Lco/bird/android/model/constant/AreaIconType;Lco/bird/android/model/constant/AreaIconType;Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Lco/bird/android/model/persistence/nestedstructures/Geolocation;Ljava/lang/String;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/Boolean;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "LCX3;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0003\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "LCX3;",
        "invoke",
        "()LCX3;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nArea.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Area.kt\nco/bird/android/model/persistence/Area$jtsRegion$2\n+ 2 JtsGeometry.kt\nco/bird/android/geo/extension/JtsGeometryKt\n*L\n1#1,267:1\n45#2,2:268\n35#2:270\n47#2,3:271\n*S KotlinDebug\n*F\n+ 1 Area.kt\nco/bird/android/model/persistence/Area$jtsRegion$2\n*L\n190#1:268,2\n190#1:270\n190#1:271,3\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lco/bird/android/model/persistence/Area;


# direct methods
.method public constructor <init>(Lco/bird/android/model/persistence/Area;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/model/persistence/Area$jtsRegion$2;->this$0:Lco/bird/android/model/persistence/Area;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()LCX3;
    .locals 2

    iget-object v0, p0, Lco/bird/android/model/persistence/Area$jtsRegion$2;->this$0:Lco/bird/android/model/persistence/Area;

    invoke-virtual {v0}, Lco/bird/android/model/persistence/Area;->getRegion()Lco/bird/android/model/Polygon;

    move-result-object v0

    :try_start_0
    invoke-static {}, LFj2;->d()Landroid/util/LruCache;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/util/LruCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    check-cast v0, LCX3;

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "null cannot be cast to non-null type org.locationtech.jts.geom.Polygon"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    new-instance v0, LbC1;

    invoke-direct {v0}, LbC1;-><init>()V

    invoke-virtual {v0}, LbC1;->v()LCX3;

    move-result-object v0

    const-string v1, "GeometryFactory().createPolygon()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_1
    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/model/persistence/Area$jtsRegion$2;->invoke()LCX3;

    move-result-object v0

    return-object v0
.end method
