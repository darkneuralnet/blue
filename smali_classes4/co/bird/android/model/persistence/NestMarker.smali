.class public final Lco/bird/android/model/persistence/NestMarker;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008#\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u0087\u0008\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\r\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u000c\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u0016\u00a2\u0006\u0002\u0010\u0018J\t\u0010.\u001a\u00020\u0003H\u00c6\u0003J\t\u0010/\u001a\u00020\u0014H\u00c6\u0003J\u000f\u00100\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u0016H\u00c6\u0003J\t\u00101\u001a\u00020\u0005H\u00c6\u0003J\t\u00102\u001a\u00020\u0007H\u00c6\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003J\u0089\u0001\u00109\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\r2\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u00142\u000e\u0008\u0002\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u0016H\u00c6\u0001J\u0013\u0010:\u001a\u00020;2\u0008\u0010<\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\t\u0010=\u001a\u00020\u0007H\u00d6\u0001J\t\u0010>\u001a\u00020\u0003H\u00d6\u0001R\u001c\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u00168\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u001aR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u001cR\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u001eR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010 R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008!\u0010\"R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008#\u0010$R\u0018\u0010\u000c\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008%\u0010&R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\'\u0010(R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008)\u0010(R\u0018\u0010\u0008\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008*\u0010+R\u0016\u0010\u0013\u001a\u00020\u00148\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008,\u0010-\u00a8\u0006?"
    }
    d2 = {
        "Lco/bird/android/model/persistence/NestMarker;",
        "",
        "id",
        "",
        "location",
        "Lco/bird/android/model/persistence/nestedstructures/Coordinate;",
        "capacity",
        "",
        "state",
        "Lco/bird/android/model/constant/NestViewState;",
        "icon",
        "Lco/bird/android/model/constant/NestIcon;",
        "secondaryIcon",
        "Lco/bird/android/model/constant/ClientIcon;",
        "secondaryIconColor",
        "Lco/bird/android/model/persistence/nestedstructures/ThemedColors;",
        "secondaryIconBackgroundColor",
        "prominence",
        "Lco/bird/android/model/constant/NestProminence;",
        "updatedAt",
        "Lorg/joda/time/DateTime;",
        "availableSpaceDetails",
        "",
        "Lco/bird/android/model/persistence/nestedstructures/NestAvailableSpaceDetail;",
        "(Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/Coordinate;ILco/bird/android/model/constant/NestViewState;Lco/bird/android/model/constant/NestIcon;Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Lco/bird/android/model/constant/NestProminence;Lorg/joda/time/DateTime;Ljava/util/List;)V",
        "getAvailableSpaceDetails",
        "()Ljava/util/List;",
        "getCapacity",
        "()I",
        "getIcon",
        "()Lco/bird/android/model/constant/NestIcon;",
        "getId",
        "()Ljava/lang/String;",
        "getLocation",
        "()Lco/bird/android/model/persistence/nestedstructures/Coordinate;",
        "getProminence",
        "()Lco/bird/android/model/constant/NestProminence;",
        "getSecondaryIcon",
        "()Lco/bird/android/model/constant/ClientIcon;",
        "getSecondaryIconBackgroundColor",
        "()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;",
        "getSecondaryIconColor",
        "getState",
        "()Lco/bird/android/model/constant/NestViewState;",
        "getUpdatedAt",
        "()Lorg/joda/time/DateTime;",
        "component1",
        "component10",
        "component11",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "toString",
        "model-persistence_release"
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
.field private final availableSpaceDetails:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/nestedstructures/NestAvailableSpaceDetail;",
            ">;"
        }
    .end annotation
.end field

.field private final capacity:I

.field private final icon:Lco/bird/android/model/constant/NestIcon;

.field private final id:Ljava/lang/String;

.field private final location:Lco/bird/android/model/persistence/nestedstructures/Coordinate;

.field private final prominence:Lco/bird/android/model/constant/NestProminence;

.field private final secondaryIcon:Lco/bird/android/model/constant/ClientIcon;

.field private final secondaryIconBackgroundColor:Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

.field private final secondaryIconColor:Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

.field private final state:Lco/bird/android/model/constant/NestViewState;

.field private final updatedAt:Lorg/joda/time/DateTime;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/Coordinate;ILco/bird/android/model/constant/NestViewState;Lco/bird/android/model/constant/NestIcon;Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Lco/bird/android/model/constant/NestProminence;Lorg/joda/time/DateTime;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lco/bird/android/model/persistence/nestedstructures/Coordinate;",
            "I",
            "Lco/bird/android/model/constant/NestViewState;",
            "Lco/bird/android/model/constant/NestIcon;",
            "Lco/bird/android/model/constant/ClientIcon;",
            "Lco/bird/android/model/persistence/nestedstructures/ThemedColors;",
            "Lco/bird/android/model/persistence/nestedstructures/ThemedColors;",
            "Lco/bird/android/model/constant/NestProminence;",
            "Lorg/joda/time/DateTime;",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/nestedstructures/NestAvailableSpaceDetail;",
            ">;)V"
        }
    .end annotation

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "updatedAt"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "availableSpaceDetails"

    invoke-static {p11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/model/persistence/NestMarker;->id:Ljava/lang/String;

    iput-object p2, p0, Lco/bird/android/model/persistence/NestMarker;->location:Lco/bird/android/model/persistence/nestedstructures/Coordinate;

    iput p3, p0, Lco/bird/android/model/persistence/NestMarker;->capacity:I

    iput-object p4, p0, Lco/bird/android/model/persistence/NestMarker;->state:Lco/bird/android/model/constant/NestViewState;

    iput-object p5, p0, Lco/bird/android/model/persistence/NestMarker;->icon:Lco/bird/android/model/constant/NestIcon;

    iput-object p6, p0, Lco/bird/android/model/persistence/NestMarker;->secondaryIcon:Lco/bird/android/model/constant/ClientIcon;

    iput-object p7, p0, Lco/bird/android/model/persistence/NestMarker;->secondaryIconColor:Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    iput-object p8, p0, Lco/bird/android/model/persistence/NestMarker;->secondaryIconBackgroundColor:Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    iput-object p9, p0, Lco/bird/android/model/persistence/NestMarker;->prominence:Lco/bird/android/model/constant/NestProminence;

    iput-object p10, p0, Lco/bird/android/model/persistence/NestMarker;->updatedAt:Lorg/joda/time/DateTime;

    iput-object p11, p0, Lco/bird/android/model/persistence/NestMarker;->availableSpaceDetails:Ljava/util/List;

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/persistence/NestMarker;Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/Coordinate;ILco/bird/android/model/constant/NestViewState;Lco/bird/android/model/constant/NestIcon;Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Lco/bird/android/model/constant/NestProminence;Lorg/joda/time/DateTime;Ljava/util/List;ILjava/lang/Object;)Lco/bird/android/model/persistence/NestMarker;
    .locals 12

    move-object v0, p0

    move/from16 v1, p12

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lco/bird/android/model/persistence/NestMarker;->id:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lco/bird/android/model/persistence/NestMarker;->location:Lco/bird/android/model/persistence/nestedstructures/Coordinate;

    goto :goto_1

    :cond_1
    move-object v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget v4, v0, Lco/bird/android/model/persistence/NestMarker;->capacity:I

    goto :goto_2

    :cond_2
    move v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lco/bird/android/model/persistence/NestMarker;->state:Lco/bird/android/model/constant/NestViewState;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lco/bird/android/model/persistence/NestMarker;->icon:Lco/bird/android/model/constant/NestIcon;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lco/bird/android/model/persistence/NestMarker;->secondaryIcon:Lco/bird/android/model/constant/ClientIcon;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lco/bird/android/model/persistence/NestMarker;->secondaryIconColor:Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lco/bird/android/model/persistence/NestMarker;->secondaryIconBackgroundColor:Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lco/bird/android/model/persistence/NestMarker;->prominence:Lco/bird/android/model/constant/NestProminence;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-object v11, v0, Lco/bird/android/model/persistence/NestMarker;->updatedAt:Lorg/joda/time/DateTime;

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v1, v1, 0x400

    if-eqz v1, :cond_a

    iget-object v1, v0, Lco/bird/android/model/persistence/NestMarker;->availableSpaceDetails:Ljava/util/List;

    goto :goto_a

    :cond_a
    move-object/from16 v1, p11

    :goto_a
    move-object p1, v2

    move-object p2, v3

    move p3, v4

    move-object/from16 p4, v5

    move-object/from16 p5, v6

    move-object/from16 p6, v7

    move-object/from16 p7, v8

    move-object/from16 p8, v9

    move-object/from16 p9, v10

    move-object/from16 p10, v11

    move-object/from16 p11, v1

    invoke-virtual/range {p0 .. p11}, Lco/bird/android/model/persistence/NestMarker;->copy(Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/Coordinate;ILco/bird/android/model/constant/NestViewState;Lco/bird/android/model/constant/NestIcon;Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Lco/bird/android/model/constant/NestProminence;Lorg/joda/time/DateTime;Ljava/util/List;)Lco/bird/android/model/persistence/NestMarker;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/NestMarker;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/NestMarker;->updatedAt:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public final component11()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/nestedstructures/NestAvailableSpaceDetail;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/persistence/NestMarker;->availableSpaceDetails:Ljava/util/List;

    return-object v0
.end method

.method public final component2()Lco/bird/android/model/persistence/nestedstructures/Coordinate;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/NestMarker;->location:Lco/bird/android/model/persistence/nestedstructures/Coordinate;

    return-object v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/persistence/NestMarker;->capacity:I

    return v0
.end method

.method public final component4()Lco/bird/android/model/constant/NestViewState;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/NestMarker;->state:Lco/bird/android/model/constant/NestViewState;

    return-object v0
.end method

.method public final component5()Lco/bird/android/model/constant/NestIcon;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/NestMarker;->icon:Lco/bird/android/model/constant/NestIcon;

    return-object v0
.end method

.method public final component6()Lco/bird/android/model/constant/ClientIcon;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/NestMarker;->secondaryIcon:Lco/bird/android/model/constant/ClientIcon;

    return-object v0
.end method

.method public final component7()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/NestMarker;->secondaryIconColor:Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    return-object v0
.end method

.method public final component8()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/NestMarker;->secondaryIconBackgroundColor:Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    return-object v0
.end method

.method public final component9()Lco/bird/android/model/constant/NestProminence;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/NestMarker;->prominence:Lco/bird/android/model/constant/NestProminence;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/Coordinate;ILco/bird/android/model/constant/NestViewState;Lco/bird/android/model/constant/NestIcon;Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Lco/bird/android/model/constant/NestProminence;Lorg/joda/time/DateTime;Ljava/util/List;)Lco/bird/android/model/persistence/NestMarker;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lco/bird/android/model/persistence/nestedstructures/Coordinate;",
            "I",
            "Lco/bird/android/model/constant/NestViewState;",
            "Lco/bird/android/model/constant/NestIcon;",
            "Lco/bird/android/model/constant/ClientIcon;",
            "Lco/bird/android/model/persistence/nestedstructures/ThemedColors;",
            "Lco/bird/android/model/persistence/nestedstructures/ThemedColors;",
            "Lco/bird/android/model/constant/NestProminence;",
            "Lorg/joda/time/DateTime;",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/nestedstructures/NestAvailableSpaceDetail;",
            ">;)",
            "Lco/bird/android/model/persistence/NestMarker;"
        }
    .end annotation

    const-string v0, "id"

    move-object v2, p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    move-object v3, p2

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "updatedAt"

    move-object/from16 v11, p10

    invoke-static {v11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "availableSpaceDetails"

    move-object/from16 v12, p11

    invoke-static {v12, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/persistence/NestMarker;

    move-object v1, v0

    move/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    invoke-direct/range {v1 .. v12}, Lco/bird/android/model/persistence/NestMarker;-><init>(Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/Coordinate;ILco/bird/android/model/constant/NestViewState;Lco/bird/android/model/constant/NestIcon;Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Lco/bird/android/model/constant/NestProminence;Lorg/joda/time/DateTime;Ljava/util/List;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    instance-of v0, p1, Lco/bird/android/model/persistence/NestMarker;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    const/4 v0, 0x1

    if-ne p1, p0, :cond_1

    :goto_0
    move v1, v0

    goto :goto_1

    :cond_1
    iget-object v2, p0, Lco/bird/android/model/persistence/NestMarker;->id:Ljava/lang/String;

    check-cast p1, Lco/bird/android/model/persistence/NestMarker;

    iget-object v3, p1, Lco/bird/android/model/persistence/NestMarker;->id:Ljava/lang/String;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lco/bird/android/model/persistence/NestMarker;->location:Lco/bird/android/model/persistence/nestedstructures/Coordinate;

    iget-object v3, p1, Lco/bird/android/model/persistence/NestMarker;->location:Lco/bird/android/model/persistence/nestedstructures/Coordinate;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget v2, p0, Lco/bird/android/model/persistence/NestMarker;->capacity:I

    iget v3, p1, Lco/bird/android/model/persistence/NestMarker;->capacity:I

    if-ne v2, v3, :cond_2

    iget-object v2, p0, Lco/bird/android/model/persistence/NestMarker;->state:Lco/bird/android/model/constant/NestViewState;

    iget-object v3, p1, Lco/bird/android/model/persistence/NestMarker;->state:Lco/bird/android/model/constant/NestViewState;

    if-ne v2, v3, :cond_2

    iget-object v2, p0, Lco/bird/android/model/persistence/NestMarker;->icon:Lco/bird/android/model/constant/NestIcon;

    iget-object v3, p1, Lco/bird/android/model/persistence/NestMarker;->icon:Lco/bird/android/model/constant/NestIcon;

    if-ne v2, v3, :cond_2

    iget-object v2, p0, Lco/bird/android/model/persistence/NestMarker;->availableSpaceDetails:Ljava/util/List;

    iget-object v3, p1, Lco/bird/android/model/persistence/NestMarker;->availableSpaceDetails:Ljava/util/List;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lco/bird/android/model/persistence/NestMarker;->secondaryIcon:Lco/bird/android/model/constant/ClientIcon;

    iget-object p1, p1, Lco/bird/android/model/persistence/NestMarker;->secondaryIcon:Lco/bird/android/model/constant/ClientIcon;

    if-ne v2, p1, :cond_2

    goto :goto_0

    :cond_2
    :goto_1
    return v1
.end method

.method public final getAvailableSpaceDetails()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/nestedstructures/NestAvailableSpaceDetail;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/persistence/NestMarker;->availableSpaceDetails:Ljava/util/List;

    return-object v0
.end method

.method public final getCapacity()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/persistence/NestMarker;->capacity:I

    return v0
.end method

.method public final getIcon()Lco/bird/android/model/constant/NestIcon;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/NestMarker;->icon:Lco/bird/android/model/constant/NestIcon;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/NestMarker;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getLocation()Lco/bird/android/model/persistence/nestedstructures/Coordinate;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/NestMarker;->location:Lco/bird/android/model/persistence/nestedstructures/Coordinate;

    return-object v0
.end method

.method public final getProminence()Lco/bird/android/model/constant/NestProminence;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/NestMarker;->prominence:Lco/bird/android/model/constant/NestProminence;

    return-object v0
.end method

.method public final getSecondaryIcon()Lco/bird/android/model/constant/ClientIcon;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/NestMarker;->secondaryIcon:Lco/bird/android/model/constant/ClientIcon;

    return-object v0
.end method

.method public final getSecondaryIconBackgroundColor()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/NestMarker;->secondaryIconBackgroundColor:Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    return-object v0
.end method

.method public final getSecondaryIconColor()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/NestMarker;->secondaryIconColor:Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    return-object v0
.end method

.method public final getState()Lco/bird/android/model/constant/NestViewState;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/NestMarker;->state:Lco/bird/android/model/constant/NestViewState;

    return-object v0
.end method

.method public final getUpdatedAt()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/NestMarker;->updatedAt:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lco/bird/android/model/persistence/NestMarker;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/NestMarker;->location:Lco/bird/android/model/persistence/nestedstructures/Coordinate;

    invoke-virtual {v1}, Lco/bird/android/model/persistence/nestedstructures/Coordinate;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/bird/android/model/persistence/NestMarker;->capacity:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/NestMarker;->state:Lco/bird/android/model/constant/NestViewState;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/NestMarker;->icon:Lco/bird/android/model/constant/NestIcon;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/NestMarker;->secondaryIcon:Lco/bird/android/model/constant/ClientIcon;

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/NestMarker;->secondaryIconColor:Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    if-nez v1, :cond_3

    move v1, v2

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Lco/bird/android/model/persistence/nestedstructures/ThemedColors;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/NestMarker;->secondaryIconBackgroundColor:Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    if-nez v1, :cond_4

    move v1, v2

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, Lco/bird/android/model/persistence/nestedstructures/ThemedColors;->hashCode()I

    move-result v1

    :goto_4
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/NestMarker;->prominence:Lco/bird/android/model/constant/NestProminence;

    if-nez v1, :cond_5

    goto :goto_5

    :cond_5
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/NestMarker;->updatedAt:Lorg/joda/time/DateTime;

    invoke-virtual {v1}, Lorg/joda/time/base/AbstractInstant;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/NestMarker;->availableSpaceDetails:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 13

    iget-object v0, p0, Lco/bird/android/model/persistence/NestMarker;->id:Ljava/lang/String;

    iget-object v1, p0, Lco/bird/android/model/persistence/NestMarker;->location:Lco/bird/android/model/persistence/nestedstructures/Coordinate;

    iget v2, p0, Lco/bird/android/model/persistence/NestMarker;->capacity:I

    iget-object v3, p0, Lco/bird/android/model/persistence/NestMarker;->state:Lco/bird/android/model/constant/NestViewState;

    iget-object v4, p0, Lco/bird/android/model/persistence/NestMarker;->icon:Lco/bird/android/model/constant/NestIcon;

    iget-object v5, p0, Lco/bird/android/model/persistence/NestMarker;->secondaryIcon:Lco/bird/android/model/constant/ClientIcon;

    iget-object v6, p0, Lco/bird/android/model/persistence/NestMarker;->secondaryIconColor:Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    iget-object v7, p0, Lco/bird/android/model/persistence/NestMarker;->secondaryIconBackgroundColor:Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    iget-object v8, p0, Lco/bird/android/model/persistence/NestMarker;->prominence:Lco/bird/android/model/constant/NestProminence;

    iget-object v9, p0, Lco/bird/android/model/persistence/NestMarker;->updatedAt:Lorg/joda/time/DateTime;

    iget-object v10, p0, Lco/bird/android/model/persistence/NestMarker;->availableSpaceDetails:Ljava/util/List;

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "NestMarker(id="

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", location="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", capacity="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", state="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", icon="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", secondaryIcon="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", secondaryIconColor="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", secondaryIconBackgroundColor="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", prominence="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", updatedAt="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", availableSpaceDetails="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
