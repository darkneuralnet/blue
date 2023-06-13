.class public final Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008(\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u0012\n\u0008\u0003\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u0008\u0012\n\u0008\u0003\u0010\u000c\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u0008\u0012\n\u0008\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u0008\u0012\n\u0008\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0011J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0015J\t\u0010 \u001a\u00020\u0008H\u00c6\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0015J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0015J\t\u0010$\u001a\u00020\u0008H\u00c6\u0003J\t\u0010%\u001a\u00020\u0008H\u00c6\u0003J\u0010\u0010&\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0015J\t\u0010\'\u001a\u00020\u0008H\u00c6\u0003J\u0010\u0010(\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0015J\t\u0010)\u001a\u00020\u0008H\u00c6\u0003J\u0094\u0001\u0010*\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00082\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\n\u0008\u0003\u0010\n\u001a\u0004\u0018\u00010\u00062\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u00082\n\u0008\u0003\u0010\u000c\u001a\u0004\u0018\u00010\u00062\u0008\u0008\u0002\u0010\r\u001a\u00020\u00082\n\u0008\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00082\n\u0008\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001\u00a2\u0006\u0002\u0010+J\u0013\u0010,\u001a\u00020\u00082\u0008\u0010-\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010.\u001a\u00020\u0006H\u00d6\u0001J\t\u0010/\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\u0013R\u0011\u0010\u000f\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0013R\u0011\u0010\r\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u0013R\u0015\u0010\u000c\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\n\n\u0002\u0010\u0016\u001a\u0004\u0008\u0014\u0010\u0015R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\n\n\u0002\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\n\n\u0002\u0010\u0016\u001a\u0004\u0008\u001a\u0010\u0015R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\n\n\u0002\u0010\u0016\u001a\u0004\u0008\u001b\u0010\u0015R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u0019R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\n\n\u0002\u0010\u0016\u001a\u0004\u0008\u001d\u0010\u0015\u00a8\u00060"
    }
    d2 = {
        "Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;",
        "",
        "title",
        "",
        "notes",
        "titleColor",
        "",
        "canShowInfoWindow",
        "",
        "isNoRide",
        "noRideColor",
        "isNoPark",
        "noParkColor",
        "isSlow",
        "slowColor",
        "isParkingSpot",
        "parkingColor",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ZZLjava/lang/Integer;ZLjava/lang/Integer;ZLjava/lang/Integer;ZLjava/lang/Integer;)V",
        "getCanShowInfoWindow",
        "()Z",
        "getNoParkColor",
        "()Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "getNoRideColor",
        "getNotes",
        "()Ljava/lang/String;",
        "getParkingColor",
        "getSlowColor",
        "getTitle",
        "getTitleColor",
        "component1",
        "component10",
        "component11",
        "component12",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ZZLjava/lang/Integer;ZLjava/lang/Integer;ZLjava/lang/Integer;ZLjava/lang/Integer;)Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;",
        "equals",
        "other",
        "hashCode",
        "toString",
        "co.bird.android.feature.map"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final canShowInfoWindow:Z

.field private final isNoPark:Z

.field private final isNoRide:Z

.field private final isParkingSpot:Z

.field private final isSlow:Z

.field private final noParkColor:Ljava/lang/Integer;

.field private final noRideColor:Ljava/lang/Integer;

.field private final notes:Ljava/lang/String;

.field private final parkingColor:Ljava/lang/Integer;

.field private final slowColor:Ljava/lang/Integer;

.field private final title:Ljava/lang/String;

.field private final titleColor:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ZZLjava/lang/Integer;ZLjava/lang/Integer;ZLjava/lang/Integer;ZLjava/lang/Integer;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;->title:Ljava/lang/String;

    iput-object p2, p0, Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;->notes:Ljava/lang/String;

    iput-object p3, p0, Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;->titleColor:Ljava/lang/Integer;

    iput-boolean p4, p0, Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;->canShowInfoWindow:Z

    iput-boolean p5, p0, Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;->isNoRide:Z

    iput-object p6, p0, Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;->noRideColor:Ljava/lang/Integer;

    iput-boolean p7, p0, Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;->isNoPark:Z

    iput-object p8, p0, Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;->noParkColor:Ljava/lang/Integer;

    iput-boolean p9, p0, Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;->isSlow:Z

    iput-object p10, p0, Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;->slowColor:Ljava/lang/Integer;

    iput-boolean p11, p0, Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;->isParkingSpot:Z

    iput-object p12, p0, Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;->parkingColor:Ljava/lang/Integer;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ZZLjava/lang/Integer;ZLjava/lang/Integer;ZLjava/lang/Integer;ZLjava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 16

    move/from16 v0, p13

    and-int/lit8 v1, v0, 0x4

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v6, v2

    goto :goto_0

    :cond_0
    move-object/from16 v6, p3

    :goto_0
    and-int/lit8 v1, v0, 0x8

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    move v7, v1

    goto :goto_1

    :cond_1
    move/from16 v7, p4

    :goto_1
    and-int/lit8 v1, v0, 0x10

    const/4 v3, 0x0

    if-eqz v1, :cond_2

    move v8, v3

    goto :goto_2

    :cond_2
    move/from16 v8, p5

    :goto_2
    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_3

    move-object v9, v2

    goto :goto_3

    :cond_3
    move-object/from16 v9, p6

    :goto_3
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_4

    move v10, v3

    goto :goto_4

    :cond_4
    move/from16 v10, p7

    :goto_4
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_5

    move-object v11, v2

    goto :goto_5

    :cond_5
    move-object/from16 v11, p8

    :goto_5
    and-int/lit16 v1, v0, 0x100

    if-eqz v1, :cond_6

    move v12, v3

    goto :goto_6

    :cond_6
    move/from16 v12, p9

    :goto_6
    and-int/lit16 v1, v0, 0x200

    if-eqz v1, :cond_7

    move-object v13, v2

    goto :goto_7

    :cond_7
    move-object/from16 v13, p10

    :goto_7
    and-int/lit16 v1, v0, 0x400

    if-eqz v1, :cond_8

    move v14, v3

    goto :goto_8

    :cond_8
    move/from16 v14, p11

    :goto_8
    and-int/lit16 v0, v0, 0x800

    if-eqz v0, :cond_9

    move-object v15, v2

    goto :goto_9

    :cond_9
    move-object/from16 v15, p12

    :goto_9
    move-object/from16 v3, p0

    move-object/from16 v4, p1

    move-object/from16 v5, p2

    invoke-direct/range {v3 .. v15}, Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ZZLjava/lang/Integer;ZLjava/lang/Integer;ZLjava/lang/Integer;ZLjava/lang/Integer;)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ZZLjava/lang/Integer;ZLjava/lang/Integer;ZLjava/lang/Integer;ZLjava/lang/Integer;ILjava/lang/Object;)Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;
    .locals 13

    move-object v0, p0

    move/from16 v1, p13

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;->title:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;->notes:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;->titleColor:Ljava/lang/Integer;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-boolean v5, v0, Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;->canShowInfoWindow:Z

    goto :goto_3

    :cond_3
    move/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-boolean v6, v0, Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;->isNoRide:Z

    goto :goto_4

    :cond_4
    move/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;->noRideColor:Ljava/lang/Integer;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-boolean v8, v0, Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;->isNoPark:Z

    goto :goto_6

    :cond_6
    move/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;->noParkColor:Ljava/lang/Integer;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-boolean v10, v0, Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;->isSlow:Z

    goto :goto_8

    :cond_8
    move/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-object v11, v0, Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;->slowColor:Ljava/lang/Integer;

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-boolean v12, v0, Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;->isParkingSpot:Z

    goto :goto_a

    :cond_a
    move/from16 v12, p11

    :goto_a
    and-int/lit16 v1, v1, 0x800

    if-eqz v1, :cond_b

    iget-object v1, v0, Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;->parkingColor:Ljava/lang/Integer;

    goto :goto_b

    :cond_b
    move-object/from16 v1, p12

    :goto_b
    move-object p1, v2

    move-object p2, v3

    move-object/from16 p3, v4

    move/from16 p4, v5

    move/from16 p5, v6

    move-object/from16 p6, v7

    move/from16 p7, v8

    move-object/from16 p8, v9

    move/from16 p9, v10

    move-object/from16 p10, v11

    move/from16 p11, v12

    move-object/from16 p12, v1

    invoke-virtual/range {p0 .. p12}, Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ZZLjava/lang/Integer;ZLjava/lang/Integer;ZLjava/lang/Integer;ZLjava/lang/Integer;)Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;->slowColor:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component11()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;->isParkingSpot:Z

    return v0
.end method

.method public final component12()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;->parkingColor:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;->notes:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;->titleColor:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;->canShowInfoWindow:Z

    return v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;->isNoRide:Z

    return v0
.end method

.method public final component6()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;->noRideColor:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component7()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;->isNoPark:Z

    return v0
.end method

.method public final component8()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;->noParkColor:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component9()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;->isSlow:Z

    return v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ZZLjava/lang/Integer;ZLjava/lang/Integer;ZLjava/lang/Integer;ZLjava/lang/Integer;)Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;
    .locals 14

    new-instance v13, Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;

    move-object v0, v13

    move-object v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move/from16 v4, p4

    move/from16 v5, p5

    move-object/from16 v6, p6

    move/from16 v7, p7

    move-object/from16 v8, p8

    move/from16 v9, p9

    move-object/from16 v10, p10

    move/from16 v11, p11

    move-object/from16 v12, p12

    invoke-direct/range {v0 .. v12}, Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ZZLjava/lang/Integer;ZLjava/lang/Integer;ZLjava/lang/Integer;ZLjava/lang/Integer;)V

    return-object v13
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;

    iget-object v1, p0, Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;->title:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;->notes:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;->notes:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;->titleColor:Ljava/lang/Integer;

    iget-object v3, p1, Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;->titleColor:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;->canShowInfoWindow:Z

    iget-boolean v3, p1, Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;->canShowInfoWindow:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;->isNoRide:Z

    iget-boolean v3, p1, Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;->isNoRide:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;->noRideColor:Ljava/lang/Integer;

    iget-object v3, p1, Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;->noRideColor:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-boolean v1, p0, Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;->isNoPark:Z

    iget-boolean v3, p1, Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;->isNoPark:Z

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;->noParkColor:Ljava/lang/Integer;

    iget-object v3, p1, Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;->noParkColor:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-boolean v1, p0, Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;->isSlow:Z

    iget-boolean v3, p1, Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;->isSlow:Z

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;->slowColor:Ljava/lang/Integer;

    iget-object v3, p1, Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;->slowColor:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-boolean v1, p0, Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;->isParkingSpot:Z

    iget-boolean v3, p1, Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;->isParkingSpot:Z

    if-eq v1, v3, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;->parkingColor:Ljava/lang/Integer;

    iget-object p1, p1, Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;->parkingColor:Ljava/lang/Integer;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_d

    return v2

    :cond_d
    return v0
.end method

.method public final getCanShowInfoWindow()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;->canShowInfoWindow:Z

    return v0
.end method

.method public final getNoParkColor()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;->noParkColor:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getNoRideColor()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;->noRideColor:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getNotes()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;->notes:Ljava/lang/String;

    return-object v0
.end method

.method public final getParkingColor()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;->parkingColor:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getSlowColor()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;->slowColor:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitleColor()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;->titleColor:Ljava/lang/Integer;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;->title:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;->notes:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;->titleColor:Ljava/lang/Integer;

    if-nez v2, :cond_2

    move v2, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;->canShowInfoWindow:Z

    const/4 v3, 0x1

    if-eqz v2, :cond_3

    move v2, v3

    :cond_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;->isNoRide:Z

    if-eqz v2, :cond_4

    move v2, v3

    :cond_4
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;->noRideColor:Ljava/lang/Integer;

    if-nez v2, :cond_5

    move v2, v1

    goto :goto_3

    :cond_5
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;->isNoPark:Z

    if-eqz v2, :cond_6

    move v2, v3

    :cond_6
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;->noParkColor:Ljava/lang/Integer;

    if-nez v2, :cond_7

    move v2, v1

    goto :goto_4

    :cond_7
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;->isSlow:Z

    if-eqz v2, :cond_8

    move v2, v3

    :cond_8
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;->slowColor:Ljava/lang/Integer;

    if-nez v2, :cond_9

    move v2, v1

    goto :goto_5

    :cond_9
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;->isParkingSpot:Z

    if-eqz v2, :cond_a

    goto :goto_6

    :cond_a
    move v3, v2

    :goto_6
    add-int/2addr v0, v3

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;->parkingColor:Ljava/lang/Integer;

    if-nez v2, :cond_b

    goto :goto_7

    :cond_b
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_7
    add-int/2addr v0, v1

    return v0
.end method

.method public final isNoPark()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;->isNoPark:Z

    return v0
.end method

.method public final isNoRide()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;->isNoRide:Z

    return v0
.end method

.method public final isParkingSpot()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;->isParkingSpot:Z

    return v0
.end method

.method public final isSlow()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;->isSlow:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 14

    iget-object v0, p0, Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;->title:Ljava/lang/String;

    iget-object v1, p0, Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;->notes:Ljava/lang/String;

    iget-object v2, p0, Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;->titleColor:Ljava/lang/Integer;

    iget-boolean v3, p0, Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;->canShowInfoWindow:Z

    iget-boolean v4, p0, Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;->isNoRide:Z

    iget-object v5, p0, Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;->noRideColor:Ljava/lang/Integer;

    iget-boolean v6, p0, Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;->isNoPark:Z

    iget-object v7, p0, Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;->noParkColor:Ljava/lang/Integer;

    iget-boolean v8, p0, Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;->isSlow:Z

    iget-object v9, p0, Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;->slowColor:Ljava/lang/Integer;

    iget-boolean v10, p0, Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;->isParkingSpot:Z

    iget-object v11, p0, Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;->parkingColor:Ljava/lang/Integer;

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    const-string v13, "PolygonTag(title="

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", notes="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", titleColor="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", canShowInfoWindow="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", isNoRide="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", noRideColor="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", isNoPark="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", noParkColor="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", isSlow="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v8}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", slowColor="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", isParkingSpot="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", parkingColor="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
