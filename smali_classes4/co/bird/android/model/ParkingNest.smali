.class public final Lco/bird/android/model/ParkingNest;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008*\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u0095\u0001\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0008\u0002\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\n\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u000e\u0012\u0010\u0008\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0006\u0012\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u0012\u0012\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u00a2\u0006\u0002\u0010\u0018J\t\u0010/\u001a\u00020\u0003H\u00c6\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u00101\u001a\u0004\u0018\u00010\u0015H\u00c6\u0003\u00a2\u0006\u0002\u0010-J\u0010\u00102\u001a\u0004\u0018\u00010\u0017H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001eJ\u000b\u00103\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000f\u00104\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u00106\u001a\u00020\nH\u00c6\u0003J\t\u00107\u001a\u00020\u000cH\u00c6\u0003J\t\u00108\u001a\u00020\u000eH\u00c6\u0003J\u0011\u00109\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0006H\u00c6\u0003J\t\u0010:\u001a\u00020\u0012H\u00c6\u0003J\u009e\u0001\u0010;\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\u0008\u0002\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\t\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000e2\u0010\u0008\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00062\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u00122\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u00c6\u0001\u00a2\u0006\u0002\u0010<J\u0013\u0010=\u001a\u00020\u00152\u0008\u0010>\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010?\u001a\u00020\u0017H\u00d6\u0001J\u0008\u0010@\u001a\u00020\u0003H\u0016R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u001aR\u001e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u001cR\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u001f\u001a\u0004\u0008\u001d\u0010\u001eR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008 \u0010\u001aR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008!\u0010\"R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008#\u0010\u001aR\u0018\u0010\u0008\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008$\u0010\u001aR\u0016\u0010\u0011\u001a\u00020\u00128\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008%\u0010&R\u001c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\'\u0010\u001cR\u0016\u0010\u000b\u001a\u00020\u000c8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008(\u0010)R\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008*\u0010+R\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010.\u001a\u0004\u0008,\u0010-\u00a8\u0006A"
    }
    d2 = {
        "Lco/bird/android/model/ParkingNest;",
        "",
        "id",
        "",
        "name",
        "photos",
        "",
        "Lco/bird/android/model/wire/WireNestPhoto;",
        "notes",
        "location",
        "Lco/bird/android/model/wire/WireLocation;",
        "radius",
        "",
        "shape",
        "Lco/bird/android/model/Polygon;",
        "arPolygons",
        "Lco/bird/android/model/wire/WireArPolygon;",
        "parkingIncentiveValue",
        "",
        "address",
        "showsInventoryToRiders",
        "",
        "availableParkingCapacity",
        "",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lco/bird/android/model/wire/WireLocation;DLco/bird/android/model/Polygon;Ljava/util/List;JLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;)V",
        "getAddress",
        "()Ljava/lang/String;",
        "getArPolygons",
        "()Ljava/util/List;",
        "getAvailableParkingCapacity",
        "()Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "getId",
        "getLocation",
        "()Lco/bird/android/model/wire/WireLocation;",
        "getName",
        "getNotes",
        "getParkingIncentiveValue",
        "()J",
        "getPhotos",
        "getRadius",
        "()D",
        "getShape",
        "()Lco/bird/android/model/Polygon;",
        "getShowsInventoryToRiders",
        "()Ljava/lang/Boolean;",
        "Ljava/lang/Boolean;",
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
        "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lco/bird/android/model/wire/WireLocation;DLco/bird/android/model/Polygon;Ljava/util/List;JLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;)Lco/bird/android/model/ParkingNest;",
        "equals",
        "other",
        "hashCode",
        "toString",
        "model_release"
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
.field private final address:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "address"
    .end annotation

    .annotation runtime Lft5;
        value = "address"
    .end annotation
.end field

.field private final arPolygons:Ljava/util/List;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "ar_polygons"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireArPolygon;",
            ">;"
        }
    .end annotation

    .annotation runtime Lft5;
        value = "ar_polygons"
    .end annotation
.end field

.field private final availableParkingCapacity:Ljava/lang/Integer;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "available_parking_capacity"
    .end annotation

    .annotation runtime Lft5;
        value = "available_parking_capacity"
    .end annotation
.end field

.field private final id:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "id"
    .end annotation

    .annotation runtime Lft5;
        value = "id"
    .end annotation
.end field

.field private final location:Lco/bird/android/model/wire/WireLocation;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "location"
    .end annotation

    .annotation runtime Lft5;
        value = "location"
    .end annotation
.end field

.field private final name:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "name"
    .end annotation

    .annotation runtime Lft5;
        value = "name"
    .end annotation
.end field

.field private final notes:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "notes"
    .end annotation

    .annotation runtime Lft5;
        value = "notes"
    .end annotation
.end field

.field private final parkingIncentiveValue:J
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "parking_incentive_value"
    .end annotation

    .annotation runtime Lft5;
        value = "parking_incentive_value"
    .end annotation
.end field

.field private final photos:Ljava/util/List;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "photos"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireNestPhoto;",
            ">;"
        }
    .end annotation

    .annotation runtime Lft5;
        value = "photos"
    .end annotation
.end field

.field private final radius:D
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "radius"
    .end annotation

    .annotation runtime Lft5;
        value = "radius"
    .end annotation
.end field

.field private final shape:Lco/bird/android/model/Polygon;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "shape"
    .end annotation

    .annotation runtime Lft5;
        value = "shape"
    .end annotation
.end field

.field private final showsInventoryToRiders:Ljava/lang/Boolean;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "shows_inventory_to_riders"
    .end annotation

    .annotation runtime Lft5;
        value = "shows_inventory_to_riders"
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 17

    move-object/from16 v0, p0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v15, 0xfff

    const/16 v16, 0x0

    invoke-direct/range {v0 .. v16}, Lco/bird/android/model/ParkingNest;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lco/bird/android/model/wire/WireLocation;DLco/bird/android/model/Polygon;Ljava/util/List;JLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lco/bird/android/model/wire/WireLocation;DLco/bird/android/model/Polygon;Ljava/util/List;JLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireNestPhoto;",
            ">;",
            "Ljava/lang/String;",
            "Lco/bird/android/model/wire/WireLocation;",
            "D",
            "Lco/bird/android/model/Polygon;",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireArPolygon;",
            ">;J",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Integer;",
            ")V"
        }
    .end annotation

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "photos"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "shape"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/model/ParkingNest;->id:Ljava/lang/String;

    iput-object p2, p0, Lco/bird/android/model/ParkingNest;->name:Ljava/lang/String;

    iput-object p3, p0, Lco/bird/android/model/ParkingNest;->photos:Ljava/util/List;

    iput-object p4, p0, Lco/bird/android/model/ParkingNest;->notes:Ljava/lang/String;

    iput-object p5, p0, Lco/bird/android/model/ParkingNest;->location:Lco/bird/android/model/wire/WireLocation;

    iput-wide p6, p0, Lco/bird/android/model/ParkingNest;->radius:D

    iput-object p8, p0, Lco/bird/android/model/ParkingNest;->shape:Lco/bird/android/model/Polygon;

    iput-object p9, p0, Lco/bird/android/model/ParkingNest;->arPolygons:Ljava/util/List;

    iput-wide p10, p0, Lco/bird/android/model/ParkingNest;->parkingIncentiveValue:J

    iput-object p12, p0, Lco/bird/android/model/ParkingNest;->address:Ljava/lang/String;

    iput-object p13, p0, Lco/bird/android/model/ParkingNest;->showsInventoryToRiders:Ljava/lang/Boolean;

    iput-object p14, p0, Lco/bird/android/model/ParkingNest;->availableParkingCapacity:Ljava/lang/Integer;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lco/bird/android/model/wire/WireLocation;DLco/bird/android/model/Polygon;Ljava/util/List;JLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 21

    move/from16 v0, p15

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    const-string v1, ""

    goto :goto_0

    :cond_0
    move-object/from16 v1, p1

    :goto_0
    and-int/lit8 v2, v0, 0x2

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    move-object v2, v3

    goto :goto_1

    :cond_1
    move-object/from16 v2, p2

    :goto_1
    and-int/lit8 v4, v0, 0x4

    if-eqz v4, :cond_2

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v4

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v0, 0x8

    if-eqz v5, :cond_3

    move-object v5, v3

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v0, 0x10

    if-eqz v6, :cond_4

    new-instance v6, Lco/bird/android/model/wire/WireLocation;

    const-wide/16 v8, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x1ff

    const/16 v20, 0x0

    move-object v7, v6

    invoke-direct/range {v7 .. v20}, Lco/bird/android/model/wire/WireLocation;-><init>(DDLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;ZLorg/joda/time/DateTime;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v0, 0x20

    if-eqz v7, :cond_5

    const-wide/high16 v7, 0x403e000000000000L    # 30.0

    goto :goto_5

    :cond_5
    move-wide/from16 v7, p6

    :goto_5
    and-int/lit8 v9, v0, 0x40

    if-eqz v9, :cond_6

    new-instance v9, Lco/bird/android/model/Polygon;

    invoke-direct {v9}, Lco/bird/android/model/Polygon;-><init>()V

    goto :goto_6

    :cond_6
    move-object/from16 v9, p8

    :goto_6
    and-int/lit16 v10, v0, 0x80

    if-eqz v10, :cond_7

    move-object v10, v3

    goto :goto_7

    :cond_7
    move-object/from16 v10, p9

    :goto_7
    and-int/lit16 v11, v0, 0x100

    if-eqz v11, :cond_8

    const-wide/16 v11, 0x0

    goto :goto_8

    :cond_8
    move-wide/from16 v11, p10

    :goto_8
    and-int/lit16 v13, v0, 0x200

    if-eqz v13, :cond_9

    move-object v13, v3

    goto :goto_9

    :cond_9
    move-object/from16 v13, p12

    :goto_9
    and-int/lit16 v14, v0, 0x400

    if-eqz v14, :cond_a

    move-object v14, v3

    goto :goto_a

    :cond_a
    move-object/from16 v14, p13

    :goto_a
    and-int/lit16 v0, v0, 0x800

    if-eqz v0, :cond_b

    goto :goto_b

    :cond_b
    move-object/from16 v3, p14

    :goto_b
    move-object/from16 p1, p0

    move-object/from16 p2, v1

    move-object/from16 p3, v2

    move-object/from16 p4, v4

    move-object/from16 p5, v5

    move-object/from16 p6, v6

    move-wide/from16 p7, v7

    move-object/from16 p9, v9

    move-object/from16 p10, v10

    move-wide/from16 p11, v11

    move-object/from16 p13, v13

    move-object/from16 p14, v14

    move-object/from16 p15, v3

    invoke-direct/range {p1 .. p15}, Lco/bird/android/model/ParkingNest;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lco/bird/android/model/wire/WireLocation;DLco/bird/android/model/Polygon;Ljava/util/List;JLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/ParkingNest;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lco/bird/android/model/wire/WireLocation;DLco/bird/android/model/Polygon;Ljava/util/List;JLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;ILjava/lang/Object;)Lco/bird/android/model/ParkingNest;
    .locals 15

    move-object v0, p0

    move/from16 v1, p15

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lco/bird/android/model/ParkingNest;->id:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lco/bird/android/model/ParkingNest;->name:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lco/bird/android/model/ParkingNest;->photos:Ljava/util/List;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lco/bird/android/model/ParkingNest;->notes:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lco/bird/android/model/ParkingNest;->location:Lco/bird/android/model/wire/WireLocation;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-wide v7, v0, Lco/bird/android/model/ParkingNest;->radius:D

    goto :goto_5

    :cond_5
    move-wide/from16 v7, p6

    :goto_5
    and-int/lit8 v9, v1, 0x40

    if-eqz v9, :cond_6

    iget-object v9, v0, Lco/bird/android/model/ParkingNest;->shape:Lco/bird/android/model/Polygon;

    goto :goto_6

    :cond_6
    move-object/from16 v9, p8

    :goto_6
    and-int/lit16 v10, v1, 0x80

    if-eqz v10, :cond_7

    iget-object v10, v0, Lco/bird/android/model/ParkingNest;->arPolygons:Ljava/util/List;

    goto :goto_7

    :cond_7
    move-object/from16 v10, p9

    :goto_7
    and-int/lit16 v11, v1, 0x100

    if-eqz v11, :cond_8

    iget-wide v11, v0, Lco/bird/android/model/ParkingNest;->parkingIncentiveValue:J

    goto :goto_8

    :cond_8
    move-wide/from16 v11, p10

    :goto_8
    and-int/lit16 v13, v1, 0x200

    if-eqz v13, :cond_9

    iget-object v13, v0, Lco/bird/android/model/ParkingNest;->address:Ljava/lang/String;

    goto :goto_9

    :cond_9
    move-object/from16 v13, p12

    :goto_9
    and-int/lit16 v14, v1, 0x400

    if-eqz v14, :cond_a

    iget-object v14, v0, Lco/bird/android/model/ParkingNest;->showsInventoryToRiders:Ljava/lang/Boolean;

    goto :goto_a

    :cond_a
    move-object/from16 v14, p13

    :goto_a
    and-int/lit16 v1, v1, 0x800

    if-eqz v1, :cond_b

    iget-object v1, v0, Lco/bird/android/model/ParkingNest;->availableParkingCapacity:Ljava/lang/Integer;

    goto :goto_b

    :cond_b
    move-object/from16 v1, p14

    :goto_b
    move-object/from16 p1, v2

    move-object/from16 p2, v3

    move-object/from16 p3, v4

    move-object/from16 p4, v5

    move-object/from16 p5, v6

    move-wide/from16 p6, v7

    move-object/from16 p8, v9

    move-object/from16 p9, v10

    move-wide/from16 p10, v11

    move-object/from16 p12, v13

    move-object/from16 p13, v14

    move-object/from16 p14, v1

    invoke-virtual/range {p0 .. p14}, Lco/bird/android/model/ParkingNest;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lco/bird/android/model/wire/WireLocation;DLco/bird/android/model/Polygon;Ljava/util/List;JLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;)Lco/bird/android/model/ParkingNest;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/ParkingNest;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/ParkingNest;->address:Ljava/lang/String;

    return-object v0
.end method

.method public final component11()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/ParkingNest;->showsInventoryToRiders:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component12()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/ParkingNest;->availableParkingCapacity:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/ParkingNest;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireNestPhoto;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/ParkingNest;->photos:Ljava/util/List;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/ParkingNest;->notes:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Lco/bird/android/model/wire/WireLocation;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/ParkingNest;->location:Lco/bird/android/model/wire/WireLocation;

    return-object v0
.end method

.method public final component6()D
    .locals 2

    iget-wide v0, p0, Lco/bird/android/model/ParkingNest;->radius:D

    return-wide v0
.end method

.method public final component7()Lco/bird/android/model/Polygon;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/ParkingNest;->shape:Lco/bird/android/model/Polygon;

    return-object v0
.end method

.method public final component8()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireArPolygon;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/ParkingNest;->arPolygons:Ljava/util/List;

    return-object v0
.end method

.method public final component9()J
    .locals 2

    iget-wide v0, p0, Lco/bird/android/model/ParkingNest;->parkingIncentiveValue:J

    return-wide v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lco/bird/android/model/wire/WireLocation;DLco/bird/android/model/Polygon;Ljava/util/List;JLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;)Lco/bird/android/model/ParkingNest;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireNestPhoto;",
            ">;",
            "Ljava/lang/String;",
            "Lco/bird/android/model/wire/WireLocation;",
            "D",
            "Lco/bird/android/model/Polygon;",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireArPolygon;",
            ">;J",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Integer;",
            ")",
            "Lco/bird/android/model/ParkingNest;"
        }
    .end annotation

    const-string v0, "id"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "photos"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "shape"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/ParkingNest;

    move-object v1, v0

    move-object/from16 v3, p2

    move-object/from16 v5, p4

    move-wide/from16 v7, p6

    move-object/from16 v10, p9

    move-wide/from16 v11, p10

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    invoke-direct/range {v1 .. v15}, Lco/bird/android/model/ParkingNest;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lco/bird/android/model/wire/WireLocation;DLco/bird/android/model/Polygon;Ljava/util/List;JLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/model/ParkingNest;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/ParkingNest;

    iget-object v1, p0, Lco/bird/android/model/ParkingNest;->id:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/ParkingNest;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/android/model/ParkingNest;->name:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/ParkingNest;->name:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/bird/android/model/ParkingNest;->photos:Ljava/util/List;

    iget-object v3, p1, Lco/bird/android/model/ParkingNest;->photos:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lco/bird/android/model/ParkingNest;->notes:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/ParkingNest;->notes:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lco/bird/android/model/ParkingNest;->location:Lco/bird/android/model/wire/WireLocation;

    iget-object v3, p1, Lco/bird/android/model/ParkingNest;->location:Lco/bird/android/model/wire/WireLocation;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-wide v3, p0, Lco/bird/android/model/ParkingNest;->radius:D

    iget-wide v5, p1, Lco/bird/android/model/ParkingNest;->radius:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lco/bird/android/model/ParkingNest;->shape:Lco/bird/android/model/Polygon;

    iget-object v3, p1, Lco/bird/android/model/ParkingNest;->shape:Lco/bird/android/model/Polygon;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lco/bird/android/model/ParkingNest;->arPolygons:Ljava/util/List;

    iget-object v3, p1, Lco/bird/android/model/ParkingNest;->arPolygons:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-wide v3, p0, Lco/bird/android/model/ParkingNest;->parkingIncentiveValue:J

    iget-wide v5, p1, Lco/bird/android/model/ParkingNest;->parkingIncentiveValue:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lco/bird/android/model/ParkingNest;->address:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/ParkingNest;->address:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lco/bird/android/model/ParkingNest;->showsInventoryToRiders:Ljava/lang/Boolean;

    iget-object v3, p1, Lco/bird/android/model/ParkingNest;->showsInventoryToRiders:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lco/bird/android/model/ParkingNest;->availableParkingCapacity:Ljava/lang/Integer;

    iget-object p1, p1, Lco/bird/android/model/ParkingNest;->availableParkingCapacity:Ljava/lang/Integer;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_d

    return v2

    :cond_d
    return v0
.end method

.method public final getAddress()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/ParkingNest;->address:Ljava/lang/String;

    return-object v0
.end method

.method public final getArPolygons()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireArPolygon;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/ParkingNest;->arPolygons:Ljava/util/List;

    return-object v0
.end method

.method public final getAvailableParkingCapacity()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/ParkingNest;->availableParkingCapacity:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/ParkingNest;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getLocation()Lco/bird/android/model/wire/WireLocation;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/ParkingNest;->location:Lco/bird/android/model/wire/WireLocation;

    return-object v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/ParkingNest;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final getNotes()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/ParkingNest;->notes:Ljava/lang/String;

    return-object v0
.end method

.method public final getParkingIncentiveValue()J
    .locals 2

    iget-wide v0, p0, Lco/bird/android/model/ParkingNest;->parkingIncentiveValue:J

    return-wide v0
.end method

.method public final getPhotos()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireNestPhoto;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/ParkingNest;->photos:Ljava/util/List;

    return-object v0
.end method

.method public final getRadius()D
    .locals 2

    iget-wide v0, p0, Lco/bird/android/model/ParkingNest;->radius:D

    return-wide v0
.end method

.method public final getShape()Lco/bird/android/model/Polygon;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/ParkingNest;->shape:Lco/bird/android/model/Polygon;

    return-object v0
.end method

.method public final getShowsInventoryToRiders()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/ParkingNest;->showsInventoryToRiders:Ljava/lang/Boolean;

    return-object v0
.end method

.method public hashCode()I
    .locals 5

    iget-object v0, p0, Lco/bird/android/model/ParkingNest;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/ParkingNest;->name:Ljava/lang/String;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/ParkingNest;->photos:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/ParkingNest;->notes:Ljava/lang/String;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/ParkingNest;->location:Lco/bird/android/model/wire/WireLocation;

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireLocation;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v3, p0, Lco/bird/android/model/ParkingNest;->radius:D

    invoke-static {v3, v4}, Ljava/lang/Double;->hashCode(D)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/ParkingNest;->shape:Lco/bird/android/model/Polygon;

    invoke-virtual {v1}, Lco/bird/android/model/ComposedGeom;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/ParkingNest;->arPolygons:Ljava/util/List;

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v3, p0, Lco/bird/android/model/ParkingNest;->parkingIncentiveValue:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/ParkingNest;->address:Ljava/lang/String;

    if-nez v1, :cond_3

    move v1, v2

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/ParkingNest;->showsInventoryToRiders:Ljava/lang/Boolean;

    if-nez v1, :cond_4

    move v1, v2

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_4
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/ParkingNest;->availableParkingCapacity:Ljava/lang/Integer;

    if-nez v1, :cond_5

    goto :goto_5

    :cond_5
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lco/bird/android/model/ParkingNest;->id:Ljava/lang/String;

    iget-object v1, p0, Lco/bird/android/model/ParkingNest;->name:Ljava/lang/String;

    iget-object v2, p0, Lco/bird/android/model/ParkingNest;->location:Lco/bird/android/model/wire/WireLocation;

    iget-wide v3, p0, Lco/bird/android/model/ParkingNest;->radius:D

    iget-object v5, p0, Lco/bird/android/model/ParkingNest;->shape:Lco/bird/android/model/Polygon;

    invoke-virtual {v5}, Lco/bird/android/model/ComposedGeom;->numPoints()I

    move-result v5

    if-lez v5, :cond_0

    const/4 v5, 0x1

    goto :goto_0

    :cond_0
    const/4 v5, 0x0

    :goto_0
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "ParkingNest(id="

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", name="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", location="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", radius="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v0, ", hasPolygon="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
