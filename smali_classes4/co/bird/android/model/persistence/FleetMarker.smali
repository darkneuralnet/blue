.class public final Lco/bird/android/model/persistence/FleetMarker;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u001e\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u0086\u0008\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\r\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\u0002\u0010\u0012J\t\u0010$\u001a\u00020\u0003H\u00c6\u0003J\t\u0010%\u001a\u00020\u0005H\u00c6\u0003J\t\u0010&\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\'\u001a\u00020\u0005H\u00c6\u0003J\t\u0010(\u001a\u00020\tH\u00c6\u0003J\t\u0010)\u001a\u00020\u000bH\u00c6\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\u0010\u0010+\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001dJ\u000b\u0010,\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003Jn\u0010-\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t2\u0008\u0008\u0002\u0010\n\u001a\u00020\u000b2\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\r2\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00c6\u0001\u00a2\u0006\u0002\u0010.J\u0013\u0010/\u001a\u0002002\u0008\u00101\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00102\u001a\u00020\tH\u00d6\u0001J\t\u00103\u001a\u00020\u0011H\u00d6\u0001R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016R\u0018\u0010\u000c\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018R\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u0014R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u001bR\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u001e\u001a\u0004\u0008\u001c\u0010\u001dR\u0016\u0010\u0008\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010 R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008!\u0010\"R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008#\u0010\u0014\u00a8\u00064"
    }
    d2 = {
        "Lco/bird/android/model/persistence/FleetMarker;",
        "",
        "fleetIcon",
        "Lco/bird/android/model/constant/ClientIcon;",
        "standardPinColor",
        "Lco/bird/android/model/persistence/nestedstructures/ThemedColors;",
        "backgroundPinColor",
        "iconColor",
        "prominence",
        "",
        "shape",
        "Lco/bird/android/model/persistence/nestedstructures/FleetMarkerPinShape;",
        "iconAnimation",
        "Lco/bird/android/model/persistence/FleetIconAnimation;",
        "opacity",
        "",
        "label",
        "",
        "(Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;ILco/bird/android/model/persistence/nestedstructures/FleetMarkerPinShape;Lco/bird/android/model/persistence/FleetIconAnimation;Ljava/lang/Double;Ljava/lang/String;)V",
        "getBackgroundPinColor",
        "()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;",
        "getFleetIcon",
        "()Lco/bird/android/model/constant/ClientIcon;",
        "getIconAnimation",
        "()Lco/bird/android/model/persistence/FleetIconAnimation;",
        "getIconColor",
        "getLabel",
        "()Ljava/lang/String;",
        "getOpacity",
        "()Ljava/lang/Double;",
        "Ljava/lang/Double;",
        "getProminence",
        "()I",
        "getShape",
        "()Lco/bird/android/model/persistence/nestedstructures/FleetMarkerPinShape;",
        "getStandardPinColor",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "copy",
        "(Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;ILco/bird/android/model/persistence/nestedstructures/FleetMarkerPinShape;Lco/bird/android/model/persistence/FleetIconAnimation;Ljava/lang/Double;Ljava/lang/String;)Lco/bird/android/model/persistence/FleetMarker;",
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
.field private final backgroundPinColor:Lco/bird/android/model/persistence/nestedstructures/ThemedColors;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "background_pin_color"
    .end annotation

    .annotation runtime Lft5;
        value = "background_pin_color"
    .end annotation
.end field

.field private final fleetIcon:Lco/bird/android/model/constant/ClientIcon;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "fleet_icon"
    .end annotation

    .annotation runtime Lft5;
        value = "fleet_icon"
    .end annotation
.end field

.field private final iconAnimation:Lco/bird/android/model/persistence/FleetIconAnimation;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "icon_animation"
    .end annotation

    .annotation runtime Lft5;
        value = "icon_animation"
    .end annotation
.end field

.field private final iconColor:Lco/bird/android/model/persistence/nestedstructures/ThemedColors;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "icon_color"
    .end annotation

    .annotation runtime Lft5;
        value = "icon_color"
    .end annotation
.end field

.field private final label:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "label"
    .end annotation

    .annotation runtime Lft5;
        value = "label"
    .end annotation
.end field

.field private final opacity:Ljava/lang/Double;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "opacity"
    .end annotation

    .annotation runtime Lft5;
        value = "opacity"
    .end annotation
.end field

.field private final prominence:I
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "prominence"
    .end annotation

    .annotation runtime Lft5;
        value = "prominence"
    .end annotation
.end field

.field private final shape:Lco/bird/android/model/persistence/nestedstructures/FleetMarkerPinShape;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "shape"
    .end annotation

    .annotation runtime Lft5;
        value = "shape"
    .end annotation
.end field

.field private final standardPinColor:Lco/bird/android/model/persistence/nestedstructures/ThemedColors;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "standard_pin_color"
    .end annotation

    .annotation runtime Lft5;
        value = "standard_pin_color"
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;ILco/bird/android/model/persistence/nestedstructures/FleetMarkerPinShape;Lco/bird/android/model/persistence/FleetIconAnimation;Ljava/lang/Double;Ljava/lang/String;)V
    .locals 1

    const-string v0, "fleetIcon"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "standardPinColor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "backgroundPinColor"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "iconColor"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "shape"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/model/persistence/FleetMarker;->fleetIcon:Lco/bird/android/model/constant/ClientIcon;

    iput-object p2, p0, Lco/bird/android/model/persistence/FleetMarker;->standardPinColor:Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    iput-object p3, p0, Lco/bird/android/model/persistence/FleetMarker;->backgroundPinColor:Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    iput-object p4, p0, Lco/bird/android/model/persistence/FleetMarker;->iconColor:Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    iput p5, p0, Lco/bird/android/model/persistence/FleetMarker;->prominence:I

    iput-object p6, p0, Lco/bird/android/model/persistence/FleetMarker;->shape:Lco/bird/android/model/persistence/nestedstructures/FleetMarkerPinShape;

    iput-object p7, p0, Lco/bird/android/model/persistence/FleetMarker;->iconAnimation:Lco/bird/android/model/persistence/FleetIconAnimation;

    iput-object p8, p0, Lco/bird/android/model/persistence/FleetMarker;->opacity:Ljava/lang/Double;

    iput-object p9, p0, Lco/bird/android/model/persistence/FleetMarker;->label:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;ILco/bird/android/model/persistence/nestedstructures/FleetMarkerPinShape;Lco/bird/android/model/persistence/FleetIconAnimation;Ljava/lang/Double;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 11

    and-int/lit8 v0, p10, 0x40

    if-eqz v0, :cond_0

    sget-object v0, Lco/bird/android/model/persistence/FleetIconAnimation;->UNKNOWN:Lco/bird/android/model/persistence/FleetIconAnimation;

    move-object v8, v0

    goto :goto_0

    :cond_0
    move-object/from16 v8, p7

    :goto_0
    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    invoke-direct/range {v1 .. v10}, Lco/bird/android/model/persistence/FleetMarker;-><init>(Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;ILco/bird/android/model/persistence/nestedstructures/FleetMarkerPinShape;Lco/bird/android/model/persistence/FleetIconAnimation;Ljava/lang/Double;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/persistence/FleetMarker;Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;ILco/bird/android/model/persistence/nestedstructures/FleetMarkerPinShape;Lco/bird/android/model/persistence/FleetIconAnimation;Ljava/lang/Double;Ljava/lang/String;ILjava/lang/Object;)Lco/bird/android/model/persistence/FleetMarker;
    .locals 10

    move-object v0, p0

    move/from16 v1, p10

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lco/bird/android/model/persistence/FleetMarker;->fleetIcon:Lco/bird/android/model/constant/ClientIcon;

    goto :goto_0

    :cond_0
    move-object v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lco/bird/android/model/persistence/FleetMarker;->standardPinColor:Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    goto :goto_1

    :cond_1
    move-object v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lco/bird/android/model/persistence/FleetMarker;->backgroundPinColor:Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    goto :goto_2

    :cond_2
    move-object v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lco/bird/android/model/persistence/FleetMarker;->iconColor:Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    goto :goto_3

    :cond_3
    move-object v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget v6, v0, Lco/bird/android/model/persistence/FleetMarker;->prominence:I

    goto :goto_4

    :cond_4
    move v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lco/bird/android/model/persistence/FleetMarker;->shape:Lco/bird/android/model/persistence/nestedstructures/FleetMarkerPinShape;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lco/bird/android/model/persistence/FleetMarker;->iconAnimation:Lco/bird/android/model/persistence/FleetIconAnimation;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lco/bird/android/model/persistence/FleetMarker;->opacity:Ljava/lang/Double;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v1, v1, 0x100

    if-eqz v1, :cond_8

    iget-object v1, v0, Lco/bird/android/model/persistence/FleetMarker;->label:Ljava/lang/String;

    goto :goto_8

    :cond_8
    move-object/from16 v1, p9

    :goto_8
    move-object p1, v2

    move-object p2, v3

    move-object p3, v4

    move-object p4, v5

    move p5, v6

    move-object/from16 p6, v7

    move-object/from16 p7, v8

    move-object/from16 p8, v9

    move-object/from16 p9, v1

    invoke-virtual/range {p0 .. p9}, Lco/bird/android/model/persistence/FleetMarker;->copy(Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;ILco/bird/android/model/persistence/nestedstructures/FleetMarkerPinShape;Lco/bird/android/model/persistence/FleetIconAnimation;Ljava/lang/Double;Ljava/lang/String;)Lco/bird/android/model/persistence/FleetMarker;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Lco/bird/android/model/constant/ClientIcon;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/FleetMarker;->fleetIcon:Lco/bird/android/model/constant/ClientIcon;

    return-object v0
.end method

.method public final component2()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/FleetMarker;->standardPinColor:Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    return-object v0
.end method

.method public final component3()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/FleetMarker;->backgroundPinColor:Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    return-object v0
.end method

.method public final component4()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/FleetMarker;->iconColor:Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    return-object v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/persistence/FleetMarker;->prominence:I

    return v0
.end method

.method public final component6()Lco/bird/android/model/persistence/nestedstructures/FleetMarkerPinShape;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/FleetMarker;->shape:Lco/bird/android/model/persistence/nestedstructures/FleetMarkerPinShape;

    return-object v0
.end method

.method public final component7()Lco/bird/android/model/persistence/FleetIconAnimation;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/FleetMarker;->iconAnimation:Lco/bird/android/model/persistence/FleetIconAnimation;

    return-object v0
.end method

.method public final component8()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/FleetMarker;->opacity:Ljava/lang/Double;

    return-object v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/FleetMarker;->label:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;ILco/bird/android/model/persistence/nestedstructures/FleetMarkerPinShape;Lco/bird/android/model/persistence/FleetIconAnimation;Ljava/lang/Double;Ljava/lang/String;)Lco/bird/android/model/persistence/FleetMarker;
    .locals 11

    const-string v0, "fleetIcon"

    move-object v2, p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "standardPinColor"

    move-object v3, p2

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "backgroundPinColor"

    move-object v4, p3

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "iconColor"

    move-object v5, p4

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "shape"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/persistence/FleetMarker;

    move-object v1, v0

    move/from16 v6, p5

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    invoke-direct/range {v1 .. v10}, Lco/bird/android/model/persistence/FleetMarker;-><init>(Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;ILco/bird/android/model/persistence/nestedstructures/FleetMarkerPinShape;Lco/bird/android/model/persistence/FleetIconAnimation;Ljava/lang/Double;Ljava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/model/persistence/FleetMarker;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/persistence/FleetMarker;

    iget-object v1, p0, Lco/bird/android/model/persistence/FleetMarker;->fleetIcon:Lco/bird/android/model/constant/ClientIcon;

    iget-object v3, p1, Lco/bird/android/model/persistence/FleetMarker;->fleetIcon:Lco/bird/android/model/constant/ClientIcon;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/android/model/persistence/FleetMarker;->standardPinColor:Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    iget-object v3, p1, Lco/bird/android/model/persistence/FleetMarker;->standardPinColor:Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/bird/android/model/persistence/FleetMarker;->backgroundPinColor:Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    iget-object v3, p1, Lco/bird/android/model/persistence/FleetMarker;->backgroundPinColor:Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lco/bird/android/model/persistence/FleetMarker;->iconColor:Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    iget-object v3, p1, Lco/bird/android/model/persistence/FleetMarker;->iconColor:Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lco/bird/android/model/persistence/FleetMarker;->prominence:I

    iget v3, p1, Lco/bird/android/model/persistence/FleetMarker;->prominence:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lco/bird/android/model/persistence/FleetMarker;->shape:Lco/bird/android/model/persistence/nestedstructures/FleetMarkerPinShape;

    iget-object v3, p1, Lco/bird/android/model/persistence/FleetMarker;->shape:Lco/bird/android/model/persistence/nestedstructures/FleetMarkerPinShape;

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lco/bird/android/model/persistence/FleetMarker;->iconAnimation:Lco/bird/android/model/persistence/FleetIconAnimation;

    iget-object v3, p1, Lco/bird/android/model/persistence/FleetMarker;->iconAnimation:Lco/bird/android/model/persistence/FleetIconAnimation;

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lco/bird/android/model/persistence/FleetMarker;->opacity:Ljava/lang/Double;

    iget-object v3, p1, Lco/bird/android/model/persistence/FleetMarker;->opacity:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lco/bird/android/model/persistence/FleetMarker;->label:Ljava/lang/String;

    iget-object p1, p1, Lco/bird/android/model/persistence/FleetMarker;->label:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    return v2

    :cond_a
    return v0
.end method

.method public final getBackgroundPinColor()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/FleetMarker;->backgroundPinColor:Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    return-object v0
.end method

.method public final getFleetIcon()Lco/bird/android/model/constant/ClientIcon;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/FleetMarker;->fleetIcon:Lco/bird/android/model/constant/ClientIcon;

    return-object v0
.end method

.method public final getIconAnimation()Lco/bird/android/model/persistence/FleetIconAnimation;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/FleetMarker;->iconAnimation:Lco/bird/android/model/persistence/FleetIconAnimation;

    return-object v0
.end method

.method public final getIconColor()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/FleetMarker;->iconColor:Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    return-object v0
.end method

.method public final getLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/FleetMarker;->label:Ljava/lang/String;

    return-object v0
.end method

.method public final getOpacity()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/FleetMarker;->opacity:Ljava/lang/Double;

    return-object v0
.end method

.method public final getProminence()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/persistence/FleetMarker;->prominence:I

    return v0
.end method

.method public final getShape()Lco/bird/android/model/persistence/nestedstructures/FleetMarkerPinShape;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/FleetMarker;->shape:Lco/bird/android/model/persistence/nestedstructures/FleetMarkerPinShape;

    return-object v0
.end method

.method public final getStandardPinColor()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/FleetMarker;->standardPinColor:Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lco/bird/android/model/persistence/FleetMarker;->fleetIcon:Lco/bird/android/model/constant/ClientIcon;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/FleetMarker;->standardPinColor:Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    invoke-virtual {v1}, Lco/bird/android/model/persistence/nestedstructures/ThemedColors;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/FleetMarker;->backgroundPinColor:Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    invoke-virtual {v1}, Lco/bird/android/model/persistence/nestedstructures/ThemedColors;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/FleetMarker;->iconColor:Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    invoke-virtual {v1}, Lco/bird/android/model/persistence/nestedstructures/ThemedColors;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/bird/android/model/persistence/FleetMarker;->prominence:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/FleetMarker;->shape:Lco/bird/android/model/persistence/nestedstructures/FleetMarkerPinShape;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/FleetMarker;->iconAnimation:Lco/bird/android/model/persistence/FleetIconAnimation;

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

    iget-object v1, p0, Lco/bird/android/model/persistence/FleetMarker;->opacity:Ljava/lang/Double;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/FleetMarker;->label:Ljava/lang/String;

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    iget-object v0, p0, Lco/bird/android/model/persistence/FleetMarker;->fleetIcon:Lco/bird/android/model/constant/ClientIcon;

    iget-object v1, p0, Lco/bird/android/model/persistence/FleetMarker;->standardPinColor:Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    iget-object v2, p0, Lco/bird/android/model/persistence/FleetMarker;->backgroundPinColor:Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    iget-object v3, p0, Lco/bird/android/model/persistence/FleetMarker;->iconColor:Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    iget v4, p0, Lco/bird/android/model/persistence/FleetMarker;->prominence:I

    iget-object v5, p0, Lco/bird/android/model/persistence/FleetMarker;->shape:Lco/bird/android/model/persistence/nestedstructures/FleetMarkerPinShape;

    iget-object v6, p0, Lco/bird/android/model/persistence/FleetMarker;->iconAnimation:Lco/bird/android/model/persistence/FleetIconAnimation;

    iget-object v7, p0, Lco/bird/android/model/persistence/FleetMarker;->opacity:Ljava/lang/Double;

    iget-object v8, p0, Lco/bird/android/model/persistence/FleetMarker;->label:Ljava/lang/String;

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "FleetMarker(fleetIcon="

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", standardPinColor="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", backgroundPinColor="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", iconColor="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", prominence="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", shape="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", iconAnimation="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", opacity="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", label="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
