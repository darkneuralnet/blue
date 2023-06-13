.class public final Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\"\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001B}\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\t\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0002\u0010\u0011J\t\u0010!\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\t\u0010$\u001a\u00020\u0003H\u00c6\u0003J\t\u0010%\u001a\u00020\u0006H\u00c6\u0003J\t\u0010&\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\'\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\t\u0010)\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010+\u001a\u00020\u0003H\u00c6\u0003J\u0081\u0001\u0010,\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00032\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u00032\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u00032\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000bH\u00c6\u0001J\u0013\u0010-\u001a\u00020.2\u0008\u0010/\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00100\u001a\u000201H\u00d6\u0001J\t\u00102\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u000c\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013R\u0018\u0010\u0008\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0015R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0017R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0013R\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u0013R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u0015R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u0017R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u0013R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u0013R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001e\u0010\u001fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008 \u0010\u0013\u00a8\u00063"
    }
    d2 = {
        "Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;",
        "",
        "id",
        "",
        "zoneId",
        "zoneCenterPoint",
        "Lco/bird/android/model/Point;",
        "title",
        "descriptionLeadingIcon",
        "Lco/bird/android/model/constant/ClientIcon;",
        "descriptionLeadingIconColor",
        "Lco/bird/android/model/persistence/nestedstructures/ThemedColors;",
        "description",
        "descriptionSubtitle",
        "dueAt",
        "dueAtTrailingIcon",
        "dueAtTrailingIconColor",
        "(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/Point;Ljava/lang/String;Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;)V",
        "getDescription",
        "()Ljava/lang/String;",
        "getDescriptionLeadingIcon",
        "()Lco/bird/android/model/constant/ClientIcon;",
        "getDescriptionLeadingIconColor",
        "()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;",
        "getDescriptionSubtitle",
        "getDueAt",
        "getDueAtTrailingIcon",
        "getDueAtTrailingIconColor",
        "getId",
        "getTitle",
        "getZoneCenterPoint",
        "()Lco/bird/android/model/Point;",
        "getZoneId",
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
        "",
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
.field private final description:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "description"
    .end annotation

    .annotation runtime Lft5;
        value = "description"
    .end annotation
.end field

.field private final descriptionLeadingIcon:Lco/bird/android/model/constant/ClientIcon;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "description_leading_icon"
    .end annotation

    .annotation runtime Lft5;
        value = "description_leading_icon"
    .end annotation
.end field

.field private final descriptionLeadingIconColor:Lco/bird/android/model/persistence/nestedstructures/ThemedColors;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "description_leading_icon_color"
    .end annotation

    .annotation runtime Lft5;
        value = "description_leading_icon_color"
    .end annotation
.end field

.field private final descriptionSubtitle:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "description_subtitle"
    .end annotation

    .annotation runtime Lft5;
        value = "description_subtitle"
    .end annotation
.end field

.field private final dueAt:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "due_at"
    .end annotation

    .annotation runtime Lft5;
        value = "due_at"
    .end annotation
.end field

.field private final dueAtTrailingIcon:Lco/bird/android/model/constant/ClientIcon;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "due_at_trailing_icon"
    .end annotation

    .annotation runtime Lft5;
        value = "due_at_trailing_icon"
    .end annotation
.end field

.field private final dueAtTrailingIconColor:Lco/bird/android/model/persistence/nestedstructures/ThemedColors;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "due_at_trailing_icon_color"
    .end annotation

    .annotation runtime Lft5;
        value = "due_at_trailing_icon_color"
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

.field private final title:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "title"
    .end annotation

    .annotation runtime Lft5;
        value = "title"
    .end annotation
.end field

.field private final zoneCenterPoint:Lco/bird/android/model/Point;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "zone_center_point"
    .end annotation

    .annotation runtime Lft5;
        value = "zone_center_point"
    .end annotation
.end field

.field private final zoneId:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "zone_id"
    .end annotation

    .annotation runtime Lft5;
        value = "zone_id"
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 14

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/16 v12, 0x7ff

    const/4 v13, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v13}, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;-><init>(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/Point;Ljava/lang/String;Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/Point;Ljava/lang/String;Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;)V
    .locals 1

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "zoneId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "zoneCenterPoint"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "description"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dueAt"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;->id:Ljava/lang/String;

    iput-object p2, p0, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;->zoneId:Ljava/lang/String;

    iput-object p3, p0, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;->zoneCenterPoint:Lco/bird/android/model/Point;

    iput-object p4, p0, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;->title:Ljava/lang/String;

    iput-object p5, p0, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;->descriptionLeadingIcon:Lco/bird/android/model/constant/ClientIcon;

    iput-object p6, p0, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;->descriptionLeadingIconColor:Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    iput-object p7, p0, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;->description:Ljava/lang/String;

    iput-object p8, p0, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;->descriptionSubtitle:Ljava/lang/String;

    iput-object p9, p0, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;->dueAt:Ljava/lang/String;

    iput-object p10, p0, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;->dueAtTrailingIcon:Lco/bird/android/model/constant/ClientIcon;

    iput-object p11, p0, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;->dueAtTrailingIconColor:Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/Point;Ljava/lang/String;Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 12

    move/from16 v0, p12

    and-int/lit8 v1, v0, 0x1

    const-string v2, ""

    if-eqz v1, :cond_0

    move-object v1, v2

    goto :goto_0

    :cond_0
    move-object v1, p1

    :goto_0
    and-int/lit8 v3, v0, 0x2

    if-eqz v3, :cond_1

    move-object v3, v2

    goto :goto_1

    :cond_1
    move-object v3, p2

    :goto_1
    and-int/lit8 v4, v0, 0x4

    if-eqz v4, :cond_2

    new-instance v4, Lco/bird/android/model/Point;

    invoke-direct {v4}, Lco/bird/android/model/Point;-><init>()V

    goto :goto_2

    :cond_2
    move-object v4, p3

    :goto_2
    and-int/lit8 v5, v0, 0x8

    if-eqz v5, :cond_3

    move-object v5, v2

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v0, 0x10

    const/4 v7, 0x0

    if-eqz v6, :cond_4

    move-object v6, v7

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v8, v0, 0x20

    if-eqz v8, :cond_5

    move-object v8, v7

    goto :goto_5

    :cond_5
    move-object/from16 v8, p6

    :goto_5
    and-int/lit8 v9, v0, 0x40

    if-eqz v9, :cond_6

    move-object v9, v2

    goto :goto_6

    :cond_6
    move-object/from16 v9, p7

    :goto_6
    and-int/lit16 v10, v0, 0x80

    if-eqz v10, :cond_7

    move-object v10, v7

    goto :goto_7

    :cond_7
    move-object/from16 v10, p8

    :goto_7
    and-int/lit16 v11, v0, 0x100

    if-eqz v11, :cond_8

    goto :goto_8

    :cond_8
    move-object/from16 v2, p9

    :goto_8
    and-int/lit16 v11, v0, 0x200

    if-eqz v11, :cond_9

    move-object v11, v7

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v0, v0, 0x400

    if-eqz v0, :cond_a

    goto :goto_a

    :cond_a
    move-object/from16 v7, p11

    :goto_a
    move-object p1, p0

    move-object p2, v1

    move-object p3, v3

    move-object/from16 p4, v4

    move-object/from16 p5, v5

    move-object/from16 p6, v6

    move-object/from16 p7, v8

    move-object/from16 p8, v9

    move-object/from16 p9, v10

    move-object/from16 p10, v2

    move-object/from16 p11, v11

    move-object/from16 p12, v7

    invoke-direct/range {p1 .. p12}, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;-><init>(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/Point;Ljava/lang/String;Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/Point;Ljava/lang/String;Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;ILjava/lang/Object;)Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;
    .locals 12

    move-object v0, p0

    move/from16 v1, p12

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;->id:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;->zoneId:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;->zoneCenterPoint:Lco/bird/android/model/Point;

    goto :goto_2

    :cond_2
    move-object v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;->title:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;->descriptionLeadingIcon:Lco/bird/android/model/constant/ClientIcon;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;->descriptionLeadingIconColor:Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;->description:Ljava/lang/String;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;->descriptionSubtitle:Ljava/lang/String;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;->dueAt:Ljava/lang/String;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-object v11, v0, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;->dueAtTrailingIcon:Lco/bird/android/model/constant/ClientIcon;

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v1, v1, 0x400

    if-eqz v1, :cond_a

    iget-object v1, v0, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;->dueAtTrailingIconColor:Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    goto :goto_a

    :cond_a
    move-object/from16 v1, p11

    :goto_a
    move-object p1, v2

    move-object p2, v3

    move-object p3, v4

    move-object/from16 p4, v5

    move-object/from16 p5, v6

    move-object/from16 p6, v7

    move-object/from16 p7, v8

    move-object/from16 p8, v9

    move-object/from16 p9, v10

    move-object/from16 p10, v11

    move-object/from16 p11, v1

    invoke-virtual/range {p0 .. p11}, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;->copy(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/Point;Ljava/lang/String;Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;)Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Lco/bird/android/model/constant/ClientIcon;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;->dueAtTrailingIcon:Lco/bird/android/model/constant/ClientIcon;

    return-object v0
.end method

.method public final component11()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;->dueAtTrailingIconColor:Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;->zoneId:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Lco/bird/android/model/Point;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;->zoneCenterPoint:Lco/bird/android/model/Point;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Lco/bird/android/model/constant/ClientIcon;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;->descriptionLeadingIcon:Lco/bird/android/model/constant/ClientIcon;

    return-object v0
.end method

.method public final component6()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;->descriptionLeadingIconColor:Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;->description:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;->descriptionSubtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;->dueAt:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/Point;Ljava/lang/String;Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;)Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;
    .locals 13

    const-string v0, "id"

    move-object v2, p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "zoneId"

    move-object v3, p2

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "zoneCenterPoint"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "description"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dueAt"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;

    move-object v1, v0

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v9, p8

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    invoke-direct/range {v1 .. v12}, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;-><init>(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/Point;Ljava/lang/String;Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;

    iget-object v1, p0, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;->id:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;->zoneId:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;->zoneId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;->zoneCenterPoint:Lco/bird/android/model/Point;

    iget-object v3, p1, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;->zoneCenterPoint:Lco/bird/android/model/Point;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;->title:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;->descriptionLeadingIcon:Lco/bird/android/model/constant/ClientIcon;

    iget-object v3, p1, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;->descriptionLeadingIcon:Lco/bird/android/model/constant/ClientIcon;

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;->descriptionLeadingIconColor:Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    iget-object v3, p1, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;->descriptionLeadingIconColor:Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;->description:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;->description:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;->descriptionSubtitle:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;->descriptionSubtitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;->dueAt:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;->dueAt:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;->dueAtTrailingIcon:Lco/bird/android/model/constant/ClientIcon;

    iget-object v3, p1, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;->dueAtTrailingIcon:Lco/bird/android/model/constant/ClientIcon;

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;->dueAtTrailingIconColor:Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    iget-object p1, p1, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;->dueAtTrailingIconColor:Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_c

    return v2

    :cond_c
    return v0
.end method

.method public final getDescription()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;->description:Ljava/lang/String;

    return-object v0
.end method

.method public final getDescriptionLeadingIcon()Lco/bird/android/model/constant/ClientIcon;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;->descriptionLeadingIcon:Lco/bird/android/model/constant/ClientIcon;

    return-object v0
.end method

.method public final getDescriptionLeadingIconColor()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;->descriptionLeadingIconColor:Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    return-object v0
.end method

.method public final getDescriptionSubtitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;->descriptionSubtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getDueAt()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;->dueAt:Ljava/lang/String;

    return-object v0
.end method

.method public final getDueAtTrailingIcon()Lco/bird/android/model/constant/ClientIcon;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;->dueAtTrailingIcon:Lco/bird/android/model/constant/ClientIcon;

    return-object v0
.end method

.method public final getDueAtTrailingIconColor()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;->dueAtTrailingIconColor:Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final getZoneCenterPoint()Lco/bird/android/model/Point;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;->zoneCenterPoint:Lco/bird/android/model/Point;

    return-object v0
.end method

.method public final getZoneId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;->zoneId:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;->zoneId:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;->zoneCenterPoint:Lco/bird/android/model/Point;

    invoke-virtual {v1}, Lco/bird/android/model/Point;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;->title:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;->descriptionLeadingIcon:Lco/bird/android/model/constant/ClientIcon;

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

    iget-object v1, p0, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;->descriptionLeadingIconColor:Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lco/bird/android/model/persistence/nestedstructures/ThemedColors;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;->description:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;->descriptionSubtitle:Ljava/lang/String;

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;->dueAt:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;->dueAtTrailingIcon:Lco/bird/android/model/constant/ClientIcon;

    if-nez v1, :cond_3

    move v1, v2

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;->dueAtTrailingIconColor:Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    if-nez v1, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, Lco/bird/android/model/persistence/nestedstructures/ThemedColors;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 13

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;->id:Ljava/lang/String;

    iget-object v1, p0, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;->zoneId:Ljava/lang/String;

    iget-object v2, p0, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;->zoneCenterPoint:Lco/bird/android/model/Point;

    iget-object v3, p0, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;->title:Ljava/lang/String;

    iget-object v4, p0, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;->descriptionLeadingIcon:Lco/bird/android/model/constant/ClientIcon;

    iget-object v5, p0, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;->descriptionLeadingIconColor:Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    iget-object v6, p0, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;->description:Ljava/lang/String;

    iget-object v7, p0, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;->descriptionSubtitle:Ljava/lang/String;

    iget-object v8, p0, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;->dueAt:Ljava/lang/String;

    iget-object v9, p0, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;->dueAtTrailingIcon:Lco/bird/android/model/constant/ClientIcon;

    iget-object v10, p0, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;->dueAtTrailingIconColor:Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "ZoneAssignmentReleaseAssignment(id="

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", zoneId="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", zoneCenterPoint="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", title="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", descriptionLeadingIcon="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", descriptionLeadingIconColor="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", description="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", descriptionSubtitle="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", dueAt="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", dueAtTrailingIcon="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", dueAtTrailingIconColor="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
