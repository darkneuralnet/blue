.class public final Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/app/feature/map/renderer/IconLoader;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "MapMarkerPinState"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008<\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\u0008\u001a\u00020\u0003\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\u000c\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0005\u0012\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0015\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0017J\t\u0010.\u001a\u00020\u0003H\u00c6\u0003J\t\u0010/\u001a\u00020\u0005H\u00c6\u0003J\t\u00100\u001a\u00020\u0005H\u00c6\u0003J\t\u00101\u001a\u00020\u0005H\u00c6\u0003J\u0010\u00102\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001cJ\t\u00103\u001a\u00020\u0005H\u00c6\u0003J\t\u00104\u001a\u00020\u0005H\u00c6\u0003J\u0010\u00105\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001cJ\u000b\u00106\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\t\u00107\u001a\u00020\u0003H\u00c6\u0003J\t\u00108\u001a\u00020\u0005H\u00c6\u0003J\t\u00109\u001a\u00020\u0005H\u00c6\u0003J\t\u0010:\u001a\u00020\u0005H\u00c6\u0003J\t\u0010;\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\t\u0010=\u001a\u00020\u0003H\u00c6\u0003J\t\u0010>\u001a\u00020\u0005H\u00c6\u0003J\t\u0010?\u001a\u00020\u0005H\u00c6\u0003J\u00ca\u0001\u0010@\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00032\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u00052\u0008\u0008\u0002\u0010\r\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u00052\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u00052\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\n2\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010AJ\u0013\u0010B\u001a\u00020\u00032\u0008\u0010C\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010D\u001a\u00020\u0005H\u00d6\u0001J\t\u0010E\u001a\u00020\nH\u00d6\u0001R\u0011\u0010\u0012\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019R\u0011\u0010\u0013\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u0019R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u001d\u001a\u0004\u0008\u001b\u0010\u001cR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001e\u0010\u0019R\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010\u0019R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008 \u0010!R\u0011\u0010\u0016\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\"R\u0011\u0010\u000c\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008#\u0010\u0019R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008$\u0010\"R\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008%\u0010\"R\u0013\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008&\u0010!R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u001d\u001a\u0004\u0008\'\u0010\u001cR\u0011\u0010\u0010\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008(\u0010\u0019R\u0011\u0010\r\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008)\u0010\u0019R\u0011\u0010\u000e\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008*\u0010\u0019R\u0011\u0010\u000f\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008+\u0010\u0019R\u0011\u0010\u0008\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008,\u0010\"R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008-\u0010\u0019\u00a8\u0006F"
    }
    d2 = {
        "Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;",
        "",
        "multiModalEnabled",
        "",
        "viewRes",
        "",
        "batteryLevelColor",
        "batteryLevelDrawable",
        "showGroundOverlay",
        "overrideId",
        "",
        "overrideBitmapReady",
        "multiModalContentDrawable",
        "pinBackgroundColor",
        "pinContentColor",
        "pinRingColor",
        "pinAccentColor",
        "badgeIconDrawable",
        "badgeBackgroundColor",
        "badgeContentColor",
        "pillTextRes",
        "contentDescription",
        "isExternalFeedVehicle",
        "(ZIIIZLjava/lang/String;ZIIIIILjava/lang/Integer;IILjava/lang/Integer;Ljava/lang/String;Z)V",
        "getBadgeBackgroundColor",
        "()I",
        "getBadgeContentColor",
        "getBadgeIconDrawable",
        "()Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "getBatteryLevelColor",
        "getBatteryLevelDrawable",
        "getContentDescription",
        "()Ljava/lang/String;",
        "()Z",
        "getMultiModalContentDrawable",
        "getMultiModalEnabled",
        "getOverrideBitmapReady",
        "getOverrideId",
        "getPillTextRes",
        "getPinAccentColor",
        "getPinBackgroundColor",
        "getPinContentColor",
        "getPinRingColor",
        "getShowGroundOverlay",
        "getViewRes",
        "component1",
        "component10",
        "component11",
        "component12",
        "component13",
        "component14",
        "component15",
        "component16",
        "component17",
        "component18",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "copy",
        "(ZIIIZLjava/lang/String;ZIIIIILjava/lang/Integer;IILjava/lang/Integer;Ljava/lang/String;Z)Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;",
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
.field private final badgeBackgroundColor:I

.field private final badgeContentColor:I

.field private final badgeIconDrawable:Ljava/lang/Integer;

.field private final batteryLevelColor:I

.field private final batteryLevelDrawable:I

.field private final contentDescription:Ljava/lang/String;

.field private final isExternalFeedVehicle:Z

.field private final multiModalContentDrawable:I

.field private final multiModalEnabled:Z

.field private final overrideBitmapReady:Z

.field private final overrideId:Ljava/lang/String;

.field private final pillTextRes:Ljava/lang/Integer;

.field private final pinAccentColor:I

.field private final pinBackgroundColor:I

.field private final pinContentColor:I

.field private final pinRingColor:I

.field private final showGroundOverlay:Z

.field private final viewRes:I


# direct methods
.method public constructor <init>(ZIIIZLjava/lang/String;ZIIIIILjava/lang/Integer;IILjava/lang/Integer;Ljava/lang/String;Z)V
    .locals 2

    move-object v0, p0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move v1, p1

    iput-boolean v1, v0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->multiModalEnabled:Z

    move v1, p2

    iput v1, v0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->viewRes:I

    move v1, p3

    iput v1, v0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->batteryLevelColor:I

    move v1, p4

    iput v1, v0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->batteryLevelDrawable:I

    move v1, p5

    iput-boolean v1, v0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->showGroundOverlay:Z

    move-object v1, p6

    iput-object v1, v0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->overrideId:Ljava/lang/String;

    move v1, p7

    iput-boolean v1, v0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->overrideBitmapReady:Z

    move v1, p8

    iput v1, v0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->multiModalContentDrawable:I

    move v1, p9

    iput v1, v0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->pinBackgroundColor:I

    move v1, p10

    iput v1, v0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->pinContentColor:I

    move v1, p11

    iput v1, v0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->pinRingColor:I

    move v1, p12

    iput v1, v0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->pinAccentColor:I

    move-object v1, p13

    iput-object v1, v0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->badgeIconDrawable:Ljava/lang/Integer;

    move/from16 v1, p14

    iput v1, v0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->badgeBackgroundColor:I

    move/from16 v1, p15

    iput v1, v0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->badgeContentColor:I

    move-object/from16 v1, p16

    iput-object v1, v0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->pillTextRes:Ljava/lang/Integer;

    move-object/from16 v1, p17

    iput-object v1, v0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->contentDescription:Ljava/lang/String;

    move/from16 v1, p18

    iput-boolean v1, v0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->isExternalFeedVehicle:Z

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;ZIIIZLjava/lang/String;ZIIIIILjava/lang/Integer;IILjava/lang/Integer;Ljava/lang/String;ZILjava/lang/Object;)Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p19

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-boolean v2, v0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->multiModalEnabled:Z

    goto :goto_0

    :cond_0
    move/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget v3, v0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->viewRes:I

    goto :goto_1

    :cond_1
    move/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget v4, v0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->batteryLevelColor:I

    goto :goto_2

    :cond_2
    move/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget v5, v0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->batteryLevelDrawable:I

    goto :goto_3

    :cond_3
    move/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-boolean v6, v0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->showGroundOverlay:Z

    goto :goto_4

    :cond_4
    move/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->overrideId:Ljava/lang/String;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-boolean v8, v0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->overrideBitmapReady:Z

    goto :goto_6

    :cond_6
    move/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget v9, v0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->multiModalContentDrawable:I

    goto :goto_7

    :cond_7
    move/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget v10, v0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->pinBackgroundColor:I

    goto :goto_8

    :cond_8
    move/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget v11, v0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->pinContentColor:I

    goto :goto_9

    :cond_9
    move/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget v12, v0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->pinRingColor:I

    goto :goto_a

    :cond_a
    move/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget v13, v0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->pinAccentColor:I

    goto :goto_b

    :cond_b
    move/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget-object v14, v0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->badgeIconDrawable:Ljava/lang/Integer;

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget v15, v0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->badgeBackgroundColor:I

    goto :goto_d

    :cond_d
    move/from16 v15, p14

    :goto_d
    move/from16 p14, v15

    and-int/lit16 v15, v1, 0x4000

    if-eqz v15, :cond_e

    iget v15, v0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->badgeContentColor:I

    goto :goto_e

    :cond_e
    move/from16 v15, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    move/from16 p15, v15

    if-eqz v16, :cond_f

    iget-object v15, v0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->pillTextRes:Ljava/lang/Integer;

    goto :goto_f

    :cond_f
    move-object/from16 v15, p16

    :goto_f
    const/high16 v16, 0x10000

    and-int v16, v1, v16

    move-object/from16 p16, v15

    if-eqz v16, :cond_10

    iget-object v15, v0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->contentDescription:Ljava/lang/String;

    goto :goto_10

    :cond_10
    move-object/from16 v15, p17

    :goto_10
    const/high16 v16, 0x20000

    and-int v1, v1, v16

    if-eqz v1, :cond_11

    iget-boolean v1, v0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->isExternalFeedVehicle:Z

    goto :goto_11

    :cond_11
    move/from16 v1, p18

    :goto_11
    move/from16 p1, v2

    move/from16 p2, v3

    move/from16 p3, v4

    move/from16 p4, v5

    move/from16 p5, v6

    move-object/from16 p6, v7

    move/from16 p7, v8

    move/from16 p8, v9

    move/from16 p9, v10

    move/from16 p10, v11

    move/from16 p11, v12

    move/from16 p12, v13

    move-object/from16 p13, v14

    move-object/from16 p17, v15

    move/from16 p18, v1

    invoke-virtual/range {p0 .. p18}, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->copy(ZIIIZLjava/lang/String;ZIIIIILjava/lang/Integer;IILjava/lang/Integer;Ljava/lang/String;Z)Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->multiModalEnabled:Z

    return v0
.end method

.method public final component10()I
    .locals 1

    iget v0, p0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->pinContentColor:I

    return v0
.end method

.method public final component11()I
    .locals 1

    iget v0, p0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->pinRingColor:I

    return v0
.end method

.method public final component12()I
    .locals 1

    iget v0, p0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->pinAccentColor:I

    return v0
.end method

.method public final component13()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->badgeIconDrawable:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component14()I
    .locals 1

    iget v0, p0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->badgeBackgroundColor:I

    return v0
.end method

.method public final component15()I
    .locals 1

    iget v0, p0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->badgeContentColor:I

    return v0
.end method

.method public final component16()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->pillTextRes:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component17()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->contentDescription:Ljava/lang/String;

    return-object v0
.end method

.method public final component18()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->isExternalFeedVehicle:Z

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->viewRes:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->batteryLevelColor:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->batteryLevelDrawable:I

    return v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->showGroundOverlay:Z

    return v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->overrideId:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->overrideBitmapReady:Z

    return v0
.end method

.method public final component8()I
    .locals 1

    iget v0, p0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->multiModalContentDrawable:I

    return v0
.end method

.method public final component9()I
    .locals 1

    iget v0, p0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->pinBackgroundColor:I

    return v0
.end method

.method public final copy(ZIIIZLjava/lang/String;ZIIIIILjava/lang/Integer;IILjava/lang/Integer;Ljava/lang/String;Z)Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;
    .locals 20

    move/from16 v1, p1

    move/from16 v2, p2

    move/from16 v3, p3

    move/from16 v4, p4

    move/from16 v5, p5

    move-object/from16 v6, p6

    move/from16 v7, p7

    move/from16 v8, p8

    move/from16 v9, p9

    move/from16 v10, p10

    move/from16 v11, p11

    move/from16 v12, p12

    move-object/from16 v13, p13

    move/from16 v14, p14

    move/from16 v15, p15

    move-object/from16 v16, p16

    move-object/from16 v17, p17

    move/from16 v18, p18

    new-instance v19, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;

    move-object/from16 v0, v19

    invoke-direct/range {v0 .. v18}, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;-><init>(ZIIIZLjava/lang/String;ZIIIIILjava/lang/Integer;IILjava/lang/Integer;Ljava/lang/String;Z)V

    return-object v19
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;

    iget-boolean v1, p0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->multiModalEnabled:Z

    iget-boolean v3, p1, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->multiModalEnabled:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->viewRes:I

    iget v3, p1, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->viewRes:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->batteryLevelColor:I

    iget v3, p1, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->batteryLevelColor:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->batteryLevelDrawable:I

    iget v3, p1, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->batteryLevelDrawable:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->showGroundOverlay:Z

    iget-boolean v3, p1, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->showGroundOverlay:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->overrideId:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->overrideId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-boolean v1, p0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->overrideBitmapReady:Z

    iget-boolean v3, p1, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->overrideBitmapReady:Z

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget v1, p0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->multiModalContentDrawable:I

    iget v3, p1, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->multiModalContentDrawable:I

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget v1, p0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->pinBackgroundColor:I

    iget v3, p1, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->pinBackgroundColor:I

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget v1, p0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->pinContentColor:I

    iget v3, p1, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->pinContentColor:I

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget v1, p0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->pinRingColor:I

    iget v3, p1, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->pinRingColor:I

    if-eq v1, v3, :cond_c

    return v2

    :cond_c
    iget v1, p0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->pinAccentColor:I

    iget v3, p1, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->pinAccentColor:I

    if-eq v1, v3, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->badgeIconDrawable:Ljava/lang/Integer;

    iget-object v3, p1, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->badgeIconDrawable:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget v1, p0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->badgeBackgroundColor:I

    iget v3, p1, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->badgeBackgroundColor:I

    if-eq v1, v3, :cond_f

    return v2

    :cond_f
    iget v1, p0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->badgeContentColor:I

    iget v3, p1, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->badgeContentColor:I

    if-eq v1, v3, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->pillTextRes:Ljava/lang/Integer;

    iget-object v3, p1, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->pillTextRes:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    return v2

    :cond_11
    iget-object v1, p0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->contentDescription:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->contentDescription:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_12

    return v2

    :cond_12
    iget-boolean v1, p0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->isExternalFeedVehicle:Z

    iget-boolean p1, p1, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->isExternalFeedVehicle:Z

    if-eq v1, p1, :cond_13

    return v2

    :cond_13
    return v0
.end method

.method public final getBadgeBackgroundColor()I
    .locals 1

    iget v0, p0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->badgeBackgroundColor:I

    return v0
.end method

.method public final getBadgeContentColor()I
    .locals 1

    iget v0, p0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->badgeContentColor:I

    return v0
.end method

.method public final getBadgeIconDrawable()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->badgeIconDrawable:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getBatteryLevelColor()I
    .locals 1

    iget v0, p0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->batteryLevelColor:I

    return v0
.end method

.method public final getBatteryLevelDrawable()I
    .locals 1

    iget v0, p0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->batteryLevelDrawable:I

    return v0
.end method

.method public final getContentDescription()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->contentDescription:Ljava/lang/String;

    return-object v0
.end method

.method public final getMultiModalContentDrawable()I
    .locals 1

    iget v0, p0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->multiModalContentDrawable:I

    return v0
.end method

.method public final getMultiModalEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->multiModalEnabled:Z

    return v0
.end method

.method public final getOverrideBitmapReady()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->overrideBitmapReady:Z

    return v0
.end method

.method public final getOverrideId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->overrideId:Ljava/lang/String;

    return-object v0
.end method

.method public final getPillTextRes()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->pillTextRes:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getPinAccentColor()I
    .locals 1

    iget v0, p0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->pinAccentColor:I

    return v0
.end method

.method public final getPinBackgroundColor()I
    .locals 1

    iget v0, p0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->pinBackgroundColor:I

    return v0
.end method

.method public final getPinContentColor()I
    .locals 1

    iget v0, p0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->pinContentColor:I

    return v0
.end method

.method public final getPinRingColor()I
    .locals 1

    iget v0, p0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->pinRingColor:I

    return v0
.end method

.method public final getShowGroundOverlay()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->showGroundOverlay:Z

    return v0
.end method

.method public final getViewRes()I
    .locals 1

    iget v0, p0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->viewRes:I

    return v0
.end method

.method public hashCode()I
    .locals 4

    iget-boolean v0, p0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->multiModalEnabled:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    move v0, v1

    :cond_0
    mul-int/lit8 v0, v0, 0x1f

    iget v2, p0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->viewRes:I

    invoke-static {v2}, Ljava/lang/Integer;->hashCode(I)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget v2, p0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->batteryLevelColor:I

    invoke-static {v2}, Ljava/lang/Integer;->hashCode(I)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget v2, p0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->batteryLevelDrawable:I

    invoke-static {v2}, Ljava/lang/Integer;->hashCode(I)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->showGroundOverlay:Z

    if-eqz v2, :cond_1

    move v2, v1

    :cond_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->overrideId:Ljava/lang/String;

    const/4 v3, 0x0

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_0

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->overrideBitmapReady:Z

    if-eqz v2, :cond_3

    move v2, v1

    :cond_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget v2, p0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->multiModalContentDrawable:I

    invoke-static {v2}, Ljava/lang/Integer;->hashCode(I)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget v2, p0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->pinBackgroundColor:I

    invoke-static {v2}, Ljava/lang/Integer;->hashCode(I)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget v2, p0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->pinContentColor:I

    invoke-static {v2}, Ljava/lang/Integer;->hashCode(I)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget v2, p0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->pinRingColor:I

    invoke-static {v2}, Ljava/lang/Integer;->hashCode(I)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget v2, p0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->pinAccentColor:I

    invoke-static {v2}, Ljava/lang/Integer;->hashCode(I)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->badgeIconDrawable:Ljava/lang/Integer;

    if-nez v2, :cond_4

    move v2, v3

    goto :goto_1

    :cond_4
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget v2, p0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->badgeBackgroundColor:I

    invoke-static {v2}, Ljava/lang/Integer;->hashCode(I)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget v2, p0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->badgeContentColor:I

    invoke-static {v2}, Ljava/lang/Integer;->hashCode(I)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->pillTextRes:Ljava/lang/Integer;

    if-nez v2, :cond_5

    move v2, v3

    goto :goto_2

    :cond_5
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->contentDescription:Ljava/lang/String;

    if-nez v2, :cond_6

    goto :goto_3

    :cond_6
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_3
    add-int/2addr v0, v3

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->isExternalFeedVehicle:Z

    if-eqz v2, :cond_7

    goto :goto_4

    :cond_7
    move v1, v2

    :goto_4
    add-int/2addr v0, v1

    return v0
.end method

.method public final isExternalFeedVehicle()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->isExternalFeedVehicle:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 20

    move-object/from16 v0, p0

    iget-boolean v1, v0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->multiModalEnabled:Z

    iget v2, v0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->viewRes:I

    iget v3, v0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->batteryLevelColor:I

    iget v4, v0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->batteryLevelDrawable:I

    iget-boolean v5, v0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->showGroundOverlay:Z

    iget-object v6, v0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->overrideId:Ljava/lang/String;

    iget-boolean v7, v0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->overrideBitmapReady:Z

    iget v8, v0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->multiModalContentDrawable:I

    iget v9, v0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->pinBackgroundColor:I

    iget v10, v0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->pinContentColor:I

    iget v11, v0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->pinRingColor:I

    iget v12, v0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->pinAccentColor:I

    iget-object v13, v0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->badgeIconDrawable:Ljava/lang/Integer;

    iget v14, v0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->badgeBackgroundColor:I

    iget v15, v0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->badgeContentColor:I

    move/from16 v16, v15

    iget-object v15, v0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->pillTextRes:Ljava/lang/Integer;

    move-object/from16 v17, v15

    iget-object v15, v0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->contentDescription:Ljava/lang/String;

    move-object/from16 v18, v15

    iget-boolean v15, v0, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->isExternalFeedVehicle:Z

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move/from16 v19, v15

    const-string v15, "MapMarkerPinState(multiModalEnabled="

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", viewRes="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", batteryLevelColor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", batteryLevelDrawable="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", showGroundOverlay="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", overrideId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", overrideBitmapReady="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", multiModalContentDrawable="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", pinBackgroundColor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", pinContentColor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", pinRingColor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", pinAccentColor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", badgeIconDrawable="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", badgeBackgroundColor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", badgeContentColor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", pillTextRes="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", contentDescription="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", isExternalFeedVehicle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
