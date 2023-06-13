.class public final LSL4$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LSL4;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015Jk\u0010\u0012\u001a\u00020\u00112\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00062\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u00042\u0008\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0016"
    }
    d2 = {
        "LSL4$a;",
        "",
        "Lcom/google/ar/core/GeospatialPose;",
        "vpsLocation",
        "",
        "vpsRequiredAccuracy",
        "",
        "vpsMeetsAccuracy",
        "Landroid/location/Location;",
        "gpsLocation",
        "gpsRequiredAccuracy",
        "gpsMeetsAccuracy",
        "vpsAdjustedHeading",
        "sensorHeading",
        "geospatialModeAvailableAtLocation",
        "geospatialModeSupported",
        "arCoreAvailable",
        "LSL4;",
        "a",
        "(Lcom/google/ar/core/GeospatialPose;DZLandroid/location/Location;DZLjava/lang/Double;Ljava/lang/Double;ZZZ)LSL4;",
        "<init>",
        "()V",
        "co.bird.android.feature.ar-parking"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nResolvedLocation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResolvedLocation.kt\nco/bird/android/feature/ar/model/ResolvedLocation$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,95:1\n1#2:96\n*E\n"
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

    invoke-direct {p0}, LSL4$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/ar/core/GeospatialPose;DZLandroid/location/Location;DZLjava/lang/Double;Ljava/lang/Double;ZZZ)LSL4;
    .locals 22

    const-string v0, "gpsLocation"

    move-object/from16 v15, p5

    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    if-eqz p4, :cond_0

    move-object/from16 v1, p1

    goto :goto_0

    :cond_0
    move-object v1, v0

    :goto_0
    if-eqz v1, :cond_1

    new-instance v2, Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {v1}, Lcom/google/ar/core/GeospatialPose;->getLatitude()D

    move-result-wide v3

    invoke-virtual {v1}, Lcom/google/ar/core/GeospatialPose;->getLongitude()D

    move-result-wide v5

    invoke-direct {v2, v3, v4, v5, v6}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    goto :goto_1

    :cond_1
    invoke-static/range {p5 .. p5}, Lcm2;->d(Landroid/location/Location;)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v2

    :goto_1
    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lcom/google/ar/core/GeospatialPose;->getAltitude()D

    move-result-wide v3

    goto :goto_2

    :cond_2
    invoke-virtual/range {p5 .. p5}, Landroid/location/Location;->getAltitude()D

    move-result-wide v3

    :goto_2
    if-eqz v1, :cond_3

    invoke-virtual {v1}, Lcom/google/ar/core/GeospatialPose;->getHorizontalAccuracy()D

    move-result-wide v5

    goto :goto_3

    :cond_3
    invoke-virtual/range {p5 .. p5}, Landroid/location/Location;->getAccuracy()F

    move-result v5

    float-to-double v5, v5

    :goto_3
    if-eqz v1, :cond_4

    invoke-virtual {v1}, Lcom/google/ar/core/GeospatialPose;->getVerticalAccuracy()D

    move-result-wide v7

    goto :goto_4

    :cond_4
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v8, 0x1a

    if-lt v7, v8, :cond_5

    invoke-static/range {p5 .. p5}, LRL4;->a(Landroid/location/Location;)F

    move-result v7

    float-to-double v7, v7

    goto :goto_4

    :cond_5
    const-wide/16 v7, 0x0

    :goto_4
    if-nez p9, :cond_6

    move-object/from16 v9, p10

    goto :goto_5

    :cond_6
    move-object/from16 v9, p9

    :goto_5
    if-nez v1, :cond_7

    invoke-virtual/range {p5 .. p5}, Landroid/location/Location;->hasBearing()Z

    move-result v10

    if-eqz v10, :cond_7

    invoke-virtual/range {p5 .. p5}, Landroid/location/Location;->getBearing()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    :cond_7
    move-object v10, v0

    if-eqz v1, :cond_8

    sget-object v0, LTL4;->c:LTL4;

    goto :goto_6

    :cond_8
    sget-object v0, LTL4;->b:LTL4;

    :goto_6
    move-object v11, v0

    if-eqz v1, :cond_9

    const-string v0, "VPS"

    goto :goto_7

    :cond_9
    invoke-virtual/range {p5 .. p5}, Landroid/location/Location;->getProvider()Ljava/lang/String;

    move-result-object v0

    :goto_7
    move-object v12, v0

    if-eqz v1, :cond_a

    invoke-static {}, Lorg/joda/time/DateTime;->now()Lorg/joda/time/DateTime;

    move-result-object v0

    invoke-virtual {v0}, Lorg/joda/time/base/BaseDateTime;->getMillis()J

    move-result-wide v13

    goto :goto_8

    :cond_a
    invoke-virtual/range {p5 .. p5}, Landroid/location/Location;->getTime()J

    move-result-wide v13

    :goto_8
    if-eqz v1, :cond_b

    move-wide/from16 v19, p2

    goto :goto_9

    :cond_b
    move-wide/from16 v19, p6

    :goto_9
    if-nez p4, :cond_d

    if-eqz p8, :cond_c

    goto :goto_a

    :cond_c
    const/4 v0, 0x0

    goto :goto_b

    :cond_d
    :goto_a
    const/4 v0, 0x1

    :goto_b
    move/from16 v21, v0

    new-instance v0, LSL4;

    move-object v1, v0

    move-object/from16 v15, p5

    move/from16 v16, p11

    move/from16 v17, p12

    move/from16 v18, p13

    invoke-direct/range {v1 .. v21}, LSL4;-><init>(Lcom/google/android/gms/maps/model/LatLng;DDDLjava/lang/Double;Ljava/lang/Float;LTL4;Ljava/lang/String;JLandroid/location/Location;ZZZDZ)V

    return-object v0
.end method
