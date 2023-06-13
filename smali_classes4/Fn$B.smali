.class public final LFn$B;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LFn;->f(DLjava/lang/String;Landroid/location/Location;)Lio/reactivex/F;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LHM4<",
        "Ljava/util/List<",
        "+",
        "Lco/bird/android/model/ParkingNest;",
        ">;>;",
        "LHM4<",
        "Ljava/util/List<",
        "+",
        "Lco/bird/android/model/ParkingNest;",
        ">;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0010\u0005\u001a\"\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00020\u0001 \u0004*\u0010\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00020\u0001\u0018\u00010\u00000\u00002\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "LHM4;",
        "",
        "Lco/bird/android/model/ParkingNest;",
        "response",
        "kotlin.jvm.PlatformType",
        "a",
        "(LHM4;)LHM4;"
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
        "SMAP\nAreaManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AreaManagerImpl.kt\nco/bird/android/manager/ride/AreaManagerImpl$nearbyParkingNests$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,642:1\n1549#2:643\n1620#2,3:644\n*S KotlinDebug\n*F\n+ 1 AreaManagerImpl.kt\nco/bird/android/manager/ride/AreaManagerImpl$nearbyParkingNests$1\n*L\n300#1:643\n300#1:644,3\n*E\n"
    }
.end annotation


# static fields
.field public static final g:LFn$B;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LFn$B;

    invoke-direct {v0}, LFn$B;-><init>()V

    sput-object v0, LFn$B;->g:LFn$B;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LHM4;)LHM4;
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LHM4<",
            "Ljava/util/List<",
            "Lco/bird/android/model/ParkingNest;",
            ">;>;)",
            "LHM4<",
            "Ljava/util/List<",
            "Lco/bird/android/model/ParkingNest;",
            ">;>;"
        }
    .end annotation

    const-string v0, "response"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, LHM4;->f()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual/range {p1 .. p1}, LHM4;->b()I

    move-result v0

    invoke-virtual/range {p1 .. p1}, LHM4;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    if-eqz v1, :cond_1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v1, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lco/bird/android/model/ParkingNest;

    invoke-virtual {v4}, Lco/bird/android/model/ParkingNest;->getShape()Lco/bird/android/model/Polygon;

    move-result-object v3

    invoke-virtual {v3}, Lco/bird/android/model/ComposedGeom;->numPoints()I

    move-result v3

    if-nez v3, :cond_0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const-wide/16 v10, 0x0

    invoke-virtual {v4}, Lco/bird/android/model/ParkingNest;->getLocation()Lco/bird/android/model/wire/WireLocation;

    move-result-object v3

    invoke-virtual {v3}, Lco/bird/android/model/wire/WireLocation;->fromLocation()Landroid/location/Location;

    move-result-object v3

    invoke-virtual {v4}, Lco/bird/android/model/ParkingNest;->getRadius()D

    move-result-wide v12

    invoke-static {v3, v12, v13}, LFj2;->b(Landroid/location/Location;D)Lco/bird/android/model/Polygon;

    move-result-object v12

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0xfbf

    const/16 v20, 0x0

    invoke-static/range {v4 .. v20}, Lco/bird/android/model/ParkingNest;->copy$default(Lco/bird/android/model/ParkingNest;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lco/bird/android/model/wire/WireLocation;DLco/bird/android/model/Polygon;Ljava/util/List;JLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;ILjava/lang/Object;)Lco/bird/android/model/ParkingNest;

    move-result-object v4

    :cond_0
    invoke-interface {v2, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :cond_2
    invoke-static {v0, v2}, LHM4;->i(ILjava/lang/Object;)LHM4;

    move-result-object v0

    goto :goto_1

    :cond_3
    move-object v0, v1

    :goto_1
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LHM4;

    invoke-virtual {p0, p1}, LFn$B;->a(LHM4;)LHM4;

    move-result-object p1

    return-object p1
.end method
