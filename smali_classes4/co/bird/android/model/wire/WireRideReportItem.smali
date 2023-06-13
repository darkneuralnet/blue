.class public final Lco/bird/android/model/wire/WireRideReportItem;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001d\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001Bm\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u000c\u0012\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\u0011J\t\u0010!\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u000cH\u00c6\u0003J\u000b\u0010\'\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003Jq\u0010*\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u000c2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001J\t\u0010+\u001a\u00020,H\u00d6\u0001J\u0013\u0010-\u001a\u00020.2\u0008\u0010/\u001a\u0004\u0018\u000100H\u00d6\u0003J\t\u00101\u001a\u00020,H\u00d6\u0001J\t\u00102\u001a\u00020\u0007H\u00d6\u0001J\u0019\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u00020,H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u000c8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0015R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0017R\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u001bR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u001bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u001eR\u0018\u0010\u0008\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010\u001bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008 \u0010\u001b\u00a8\u00068"
    }
    d2 = {
        "Lco/bird/android/model/wire/WireRideReportItem;",
        "Landroid/os/Parcelable;",
        "componentKind",
        "Lco/bird/android/model/constant/RideReportComponentKind;",
        "status",
        "Lco/bird/android/model/constant/RideReportStatus;",
        "title",
        "",
        "text",
        "iconName",
        "Lco/bird/android/model/constant/RideReportIcon;",
        "iconColor",
        "Lco/bird/android/model/wire/WireThemedColors;",
        "imageAsset",
        "Lco/bird/android/model/wire/WireLegacyAsset;",
        "imageTitle",
        "imageCaption",
        "(Lco/bird/android/model/constant/RideReportComponentKind;Lco/bird/android/model/constant/RideReportStatus;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/RideReportIcon;Lco/bird/android/model/wire/WireThemedColors;Lco/bird/android/model/wire/WireLegacyAsset;Ljava/lang/String;Ljava/lang/String;)V",
        "getComponentKind",
        "()Lco/bird/android/model/constant/RideReportComponentKind;",
        "getIconColor",
        "()Lco/bird/android/model/wire/WireThemedColors;",
        "getIconName",
        "()Lco/bird/android/model/constant/RideReportIcon;",
        "getImageAsset",
        "()Lco/bird/android/model/wire/WireLegacyAsset;",
        "getImageCaption",
        "()Ljava/lang/String;",
        "getImageTitle",
        "getStatus",
        "()Lco/bird/android/model/constant/RideReportStatus;",
        "getText",
        "getTitle",
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
        "describeContents",
        "",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "toString",
        "writeToParcel",
        "",
        "parcel",
        "Landroid/os/Parcel;",
        "flags",
        "model-wire_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lco/bird/android/model/wire/WireRideReportItem;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final componentKind:Lco/bird/android/model/constant/RideReportComponentKind;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "component_kind"
    .end annotation

    .annotation runtime Lft5;
        value = "component_kind"
    .end annotation
.end field

.field private final iconColor:Lco/bird/android/model/wire/WireThemedColors;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "icon_color"
    .end annotation

    .annotation runtime Lft5;
        value = "icon_color"
    .end annotation
.end field

.field private final iconName:Lco/bird/android/model/constant/RideReportIcon;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "icon_name"
    .end annotation

    .annotation runtime Lft5;
        value = "icon_name"
    .end annotation
.end field

.field private final imageAsset:Lco/bird/android/model/wire/WireLegacyAsset;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "image_asset"
    .end annotation

    .annotation runtime Lft5;
        value = "image_asset"
    .end annotation
.end field

.field private final imageCaption:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "image_caption"
    .end annotation

    .annotation runtime Lft5;
        value = "image_caption"
    .end annotation
.end field

.field private final imageTitle:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "image_title"
    .end annotation

    .annotation runtime Lft5;
        value = "image_title"
    .end annotation
.end field

.field private final status:Lco/bird/android/model/constant/RideReportStatus;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "status"
    .end annotation

    .annotation runtime Lft5;
        value = "status"
    .end annotation
.end field

.field private final text:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "text"
    .end annotation

    .annotation runtime Lft5;
        value = "text"
    .end annotation
.end field

.field private final title:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "title"
    .end annotation

    .annotation runtime Lft5;
        value = "title"
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lco/bird/android/model/wire/WireRideReportItem$Creator;

    invoke-direct {v0}, Lco/bird/android/model/wire/WireRideReportItem$Creator;-><init>()V

    sput-object v0, Lco/bird/android/model/wire/WireRideReportItem;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 12

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/16 v10, 0x1ff

    const/4 v11, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v11}, Lco/bird/android/model/wire/WireRideReportItem;-><init>(Lco/bird/android/model/constant/RideReportComponentKind;Lco/bird/android/model/constant/RideReportStatus;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/RideReportIcon;Lco/bird/android/model/wire/WireThemedColors;Lco/bird/android/model/wire/WireLegacyAsset;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lco/bird/android/model/constant/RideReportComponentKind;Lco/bird/android/model/constant/RideReportStatus;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/RideReportIcon;Lco/bird/android/model/wire/WireThemedColors;Lco/bird/android/model/wire/WireLegacyAsset;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "componentKind"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "status"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/model/wire/WireRideReportItem;->componentKind:Lco/bird/android/model/constant/RideReportComponentKind;

    iput-object p2, p0, Lco/bird/android/model/wire/WireRideReportItem;->status:Lco/bird/android/model/constant/RideReportStatus;

    iput-object p3, p0, Lco/bird/android/model/wire/WireRideReportItem;->title:Ljava/lang/String;

    iput-object p4, p0, Lco/bird/android/model/wire/WireRideReportItem;->text:Ljava/lang/String;

    iput-object p5, p0, Lco/bird/android/model/wire/WireRideReportItem;->iconName:Lco/bird/android/model/constant/RideReportIcon;

    iput-object p6, p0, Lco/bird/android/model/wire/WireRideReportItem;->iconColor:Lco/bird/android/model/wire/WireThemedColors;

    iput-object p7, p0, Lco/bird/android/model/wire/WireRideReportItem;->imageAsset:Lco/bird/android/model/wire/WireLegacyAsset;

    iput-object p8, p0, Lco/bird/android/model/wire/WireRideReportItem;->imageTitle:Ljava/lang/String;

    iput-object p9, p0, Lco/bird/android/model/wire/WireRideReportItem;->imageCaption:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Lco/bird/android/model/constant/RideReportComponentKind;Lco/bird/android/model/constant/RideReportStatus;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/RideReportIcon;Lco/bird/android/model/wire/WireThemedColors;Lco/bird/android/model/wire/WireLegacyAsset;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 10

    move/from16 v0, p10

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    sget-object v1, Lco/bird/android/model/constant/RideReportComponentKind;->UNKNOWN:Lco/bird/android/model/constant/RideReportComponentKind;

    goto :goto_0

    :cond_0
    move-object v1, p1

    :goto_0
    and-int/lit8 v2, v0, 0x2

    if-eqz v2, :cond_1

    sget-object v2, Lco/bird/android/model/constant/RideReportStatus;->UNKNOWN:Lco/bird/android/model/constant/RideReportStatus;

    goto :goto_1

    :cond_1
    move-object v2, p2

    :goto_1
    and-int/lit8 v3, v0, 0x4

    const/4 v4, 0x0

    if-eqz v3, :cond_2

    move-object v3, v4

    goto :goto_2

    :cond_2
    move-object v3, p3

    :goto_2
    and-int/lit8 v5, v0, 0x8

    if-eqz v5, :cond_3

    move-object v5, v4

    goto :goto_3

    :cond_3
    move-object v5, p4

    :goto_3
    and-int/lit8 v6, v0, 0x10

    if-eqz v6, :cond_4

    move-object v6, v4

    goto :goto_4

    :cond_4
    move-object v6, p5

    :goto_4
    and-int/lit8 v7, v0, 0x20

    if-eqz v7, :cond_5

    move-object v7, v4

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v0, 0x40

    if-eqz v8, :cond_6

    move-object v8, v4

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v0, 0x80

    if-eqz v9, :cond_7

    move-object v9, v4

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v0, v0, 0x100

    if-eqz v0, :cond_8

    goto :goto_8

    :cond_8
    move-object/from16 v4, p9

    :goto_8
    move-object p1, p0

    move-object p2, v1

    move-object p3, v2

    move-object p4, v3

    move-object p5, v5

    move-object/from16 p6, v6

    move-object/from16 p7, v7

    move-object/from16 p8, v8

    move-object/from16 p9, v9

    move-object/from16 p10, v4

    invoke-direct/range {p1 .. p10}, Lco/bird/android/model/wire/WireRideReportItem;-><init>(Lco/bird/android/model/constant/RideReportComponentKind;Lco/bird/android/model/constant/RideReportStatus;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/RideReportIcon;Lco/bird/android/model/wire/WireThemedColors;Lco/bird/android/model/wire/WireLegacyAsset;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/wire/WireRideReportItem;Lco/bird/android/model/constant/RideReportComponentKind;Lco/bird/android/model/constant/RideReportStatus;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/RideReportIcon;Lco/bird/android/model/wire/WireThemedColors;Lco/bird/android/model/wire/WireLegacyAsset;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lco/bird/android/model/wire/WireRideReportItem;
    .locals 10

    move-object v0, p0

    move/from16 v1, p10

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lco/bird/android/model/wire/WireRideReportItem;->componentKind:Lco/bird/android/model/constant/RideReportComponentKind;

    goto :goto_0

    :cond_0
    move-object v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lco/bird/android/model/wire/WireRideReportItem;->status:Lco/bird/android/model/constant/RideReportStatus;

    goto :goto_1

    :cond_1
    move-object v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lco/bird/android/model/wire/WireRideReportItem;->title:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lco/bird/android/model/wire/WireRideReportItem;->text:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lco/bird/android/model/wire/WireRideReportItem;->iconName:Lco/bird/android/model/constant/RideReportIcon;

    goto :goto_4

    :cond_4
    move-object v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lco/bird/android/model/wire/WireRideReportItem;->iconColor:Lco/bird/android/model/wire/WireThemedColors;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lco/bird/android/model/wire/WireRideReportItem;->imageAsset:Lco/bird/android/model/wire/WireLegacyAsset;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lco/bird/android/model/wire/WireRideReportItem;->imageTitle:Ljava/lang/String;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v1, v1, 0x100

    if-eqz v1, :cond_8

    iget-object v1, v0, Lco/bird/android/model/wire/WireRideReportItem;->imageCaption:Ljava/lang/String;

    goto :goto_8

    :cond_8
    move-object/from16 v1, p9

    :goto_8
    move-object p1, v2

    move-object p2, v3

    move-object p3, v4

    move-object p4, v5

    move-object p5, v6

    move-object/from16 p6, v7

    move-object/from16 p7, v8

    move-object/from16 p8, v9

    move-object/from16 p9, v1

    invoke-virtual/range {p0 .. p9}, Lco/bird/android/model/wire/WireRideReportItem;->copy(Lco/bird/android/model/constant/RideReportComponentKind;Lco/bird/android/model/constant/RideReportStatus;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/RideReportIcon;Lco/bird/android/model/wire/WireThemedColors;Lco/bird/android/model/wire/WireLegacyAsset;Ljava/lang/String;Ljava/lang/String;)Lco/bird/android/model/wire/WireRideReportItem;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Lco/bird/android/model/constant/RideReportComponentKind;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireRideReportItem;->componentKind:Lco/bird/android/model/constant/RideReportComponentKind;

    return-object v0
.end method

.method public final component2()Lco/bird/android/model/constant/RideReportStatus;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireRideReportItem;->status:Lco/bird/android/model/constant/RideReportStatus;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireRideReportItem;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireRideReportItem;->text:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Lco/bird/android/model/constant/RideReportIcon;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireRideReportItem;->iconName:Lco/bird/android/model/constant/RideReportIcon;

    return-object v0
.end method

.method public final component6()Lco/bird/android/model/wire/WireThemedColors;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireRideReportItem;->iconColor:Lco/bird/android/model/wire/WireThemedColors;

    return-object v0
.end method

.method public final component7()Lco/bird/android/model/wire/WireLegacyAsset;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireRideReportItem;->imageAsset:Lco/bird/android/model/wire/WireLegacyAsset;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireRideReportItem;->imageTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireRideReportItem;->imageCaption:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Lco/bird/android/model/constant/RideReportComponentKind;Lco/bird/android/model/constant/RideReportStatus;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/RideReportIcon;Lco/bird/android/model/wire/WireThemedColors;Lco/bird/android/model/wire/WireLegacyAsset;Ljava/lang/String;Ljava/lang/String;)Lco/bird/android/model/wire/WireRideReportItem;
    .locals 11

    const-string v0, "componentKind"

    move-object v2, p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "status"

    move-object v3, p2

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/wire/WireRideReportItem;

    move-object v1, v0

    move-object v4, p3

    move-object v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    invoke-direct/range {v1 .. v10}, Lco/bird/android/model/wire/WireRideReportItem;-><init>(Lco/bird/android/model/constant/RideReportComponentKind;Lco/bird/android/model/constant/RideReportStatus;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/RideReportIcon;Lco/bird/android/model/wire/WireThemedColors;Lco/bird/android/model/wire/WireLegacyAsset;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/model/wire/WireRideReportItem;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/wire/WireRideReportItem;

    iget-object v1, p0, Lco/bird/android/model/wire/WireRideReportItem;->componentKind:Lco/bird/android/model/constant/RideReportComponentKind;

    iget-object v3, p1, Lco/bird/android/model/wire/WireRideReportItem;->componentKind:Lco/bird/android/model/constant/RideReportComponentKind;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/android/model/wire/WireRideReportItem;->status:Lco/bird/android/model/constant/RideReportStatus;

    iget-object v3, p1, Lco/bird/android/model/wire/WireRideReportItem;->status:Lco/bird/android/model/constant/RideReportStatus;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/bird/android/model/wire/WireRideReportItem;->title:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/wire/WireRideReportItem;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lco/bird/android/model/wire/WireRideReportItem;->text:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/wire/WireRideReportItem;->text:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lco/bird/android/model/wire/WireRideReportItem;->iconName:Lco/bird/android/model/constant/RideReportIcon;

    iget-object v3, p1, Lco/bird/android/model/wire/WireRideReportItem;->iconName:Lco/bird/android/model/constant/RideReportIcon;

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lco/bird/android/model/wire/WireRideReportItem;->iconColor:Lco/bird/android/model/wire/WireThemedColors;

    iget-object v3, p1, Lco/bird/android/model/wire/WireRideReportItem;->iconColor:Lco/bird/android/model/wire/WireThemedColors;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lco/bird/android/model/wire/WireRideReportItem;->imageAsset:Lco/bird/android/model/wire/WireLegacyAsset;

    iget-object v3, p1, Lco/bird/android/model/wire/WireRideReportItem;->imageAsset:Lco/bird/android/model/wire/WireLegacyAsset;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lco/bird/android/model/wire/WireRideReportItem;->imageTitle:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/wire/WireRideReportItem;->imageTitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lco/bird/android/model/wire/WireRideReportItem;->imageCaption:Ljava/lang/String;

    iget-object p1, p1, Lco/bird/android/model/wire/WireRideReportItem;->imageCaption:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    return v2

    :cond_a
    return v0
.end method

.method public final getComponentKind()Lco/bird/android/model/constant/RideReportComponentKind;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireRideReportItem;->componentKind:Lco/bird/android/model/constant/RideReportComponentKind;

    return-object v0
.end method

.method public final getIconColor()Lco/bird/android/model/wire/WireThemedColors;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireRideReportItem;->iconColor:Lco/bird/android/model/wire/WireThemedColors;

    return-object v0
.end method

.method public final getIconName()Lco/bird/android/model/constant/RideReportIcon;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireRideReportItem;->iconName:Lco/bird/android/model/constant/RideReportIcon;

    return-object v0
.end method

.method public final getImageAsset()Lco/bird/android/model/wire/WireLegacyAsset;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireRideReportItem;->imageAsset:Lco/bird/android/model/wire/WireLegacyAsset;

    return-object v0
.end method

.method public final getImageCaption()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireRideReportItem;->imageCaption:Ljava/lang/String;

    return-object v0
.end method

.method public final getImageTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireRideReportItem;->imageTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getStatus()Lco/bird/android/model/constant/RideReportStatus;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireRideReportItem;->status:Lco/bird/android/model/constant/RideReportStatus;

    return-object v0
.end method

.method public final getText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireRideReportItem;->text:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireRideReportItem;->title:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lco/bird/android/model/wire/WireRideReportItem;->componentKind:Lco/bird/android/model/constant/RideReportComponentKind;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireRideReportItem;->status:Lco/bird/android/model/constant/RideReportStatus;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireRideReportItem;->title:Ljava/lang/String;

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

    iget-object v1, p0, Lco/bird/android/model/wire/WireRideReportItem;->text:Ljava/lang/String;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireRideReportItem;->iconName:Lco/bird/android/model/constant/RideReportIcon;

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireRideReportItem;->iconColor:Lco/bird/android/model/wire/WireThemedColors;

    if-nez v1, :cond_3

    move v1, v2

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Lco/bird/android/model/wire/WireThemedColors;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireRideReportItem;->imageAsset:Lco/bird/android/model/wire/WireLegacyAsset;

    if-nez v1, :cond_4

    move v1, v2

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, Lco/bird/android/model/wire/WireLegacyAsset;->hashCode()I

    move-result v1

    :goto_4
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireRideReportItem;->imageTitle:Ljava/lang/String;

    if-nez v1, :cond_5

    move v1, v2

    goto :goto_5

    :cond_5
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_5
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireRideReportItem;->imageCaption:Ljava/lang/String;

    if-nez v1, :cond_6

    goto :goto_6

    :cond_6
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_6
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    iget-object v0, p0, Lco/bird/android/model/wire/WireRideReportItem;->componentKind:Lco/bird/android/model/constant/RideReportComponentKind;

    iget-object v1, p0, Lco/bird/android/model/wire/WireRideReportItem;->status:Lco/bird/android/model/constant/RideReportStatus;

    iget-object v2, p0, Lco/bird/android/model/wire/WireRideReportItem;->title:Ljava/lang/String;

    iget-object v3, p0, Lco/bird/android/model/wire/WireRideReportItem;->text:Ljava/lang/String;

    iget-object v4, p0, Lco/bird/android/model/wire/WireRideReportItem;->iconName:Lco/bird/android/model/constant/RideReportIcon;

    iget-object v5, p0, Lco/bird/android/model/wire/WireRideReportItem;->iconColor:Lco/bird/android/model/wire/WireThemedColors;

    iget-object v6, p0, Lco/bird/android/model/wire/WireRideReportItem;->imageAsset:Lco/bird/android/model/wire/WireLegacyAsset;

    iget-object v7, p0, Lco/bird/android/model/wire/WireRideReportItem;->imageTitle:Ljava/lang/String;

    iget-object v8, p0, Lco/bird/android/model/wire/WireRideReportItem;->imageCaption:Ljava/lang/String;

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "WireRideReportItem(componentKind="

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", status="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", title="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", text="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", iconName="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", iconColor="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", imageAsset="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", imageTitle="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", imageCaption="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    const-string v0, "out"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/model/wire/WireRideReportItem;->componentKind:Lco/bird/android/model/constant/RideReportComponentKind;

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/model/wire/WireRideReportItem;->status:Lco/bird/android/model/constant/RideReportStatus;

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/model/wire/WireRideReportItem;->title:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/model/wire/WireRideReportItem;->text:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/model/wire/WireRideReportItem;->iconName:Lco/bird/android/model/constant/RideReportIcon;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_0

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    :goto_0
    iget-object v0, p0, Lco/bird/android/model/wire/WireRideReportItem;->iconColor:Lco/bird/android/model/wire/WireThemedColors;

    if-nez v0, :cond_1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lco/bird/android/model/wire/WireThemedColors;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_1
    iget-object v0, p0, Lco/bird/android/model/wire/WireRideReportItem;->imageAsset:Lco/bird/android/model/wire/WireLegacyAsset;

    if-nez v0, :cond_2

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_2

    :cond_2
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lco/bird/android/model/wire/WireLegacyAsset;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_2
    iget-object p2, p0, Lco/bird/android/model/wire/WireRideReportItem;->imageTitle:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lco/bird/android/model/wire/WireRideReportItem;->imageCaption:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
