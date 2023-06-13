.class public final Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\nH\u00c6\u0003JA\u0010\u001a\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\nH\u00c6\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001e\u001a\u00020\u001fH\u00d6\u0001J\t\u0010 \u001a\u00020!H\u00d6\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\rR\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00088\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\""
    }
    d2 = {
        "Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;",
        "",
        "color",
        "Lco/bird/android/model/persistence/nestedstructures/ThemedColors;",
        "borderColor",
        "label",
        "Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotationLabel;",
        "icon",
        "Lco/bird/android/model/persistence/nestedstructures/Icon;",
        "coloredIcon",
        "Lco/bird/android/model/constant/ColoredIcon;",
        "(Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotationLabel;Lco/bird/android/model/persistence/nestedstructures/Icon;Lco/bird/android/model/constant/ColoredIcon;)V",
        "getBorderColor",
        "()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;",
        "getColor",
        "getColoredIcon",
        "()Lco/bird/android/model/constant/ColoredIcon;",
        "getIcon",
        "()Lco/bird/android/model/persistence/nestedstructures/Icon;",
        "getLabel",
        "()Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotationLabel;",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
        "",
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
.field private final borderColor:Lco/bird/android/model/persistence/nestedstructures/ThemedColors;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "border_color"
    .end annotation

    .annotation runtime Lft5;
        value = "border_color"
    .end annotation
.end field

.field private final color:Lco/bird/android/model/persistence/nestedstructures/ThemedColors;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "color"
    .end annotation

    .annotation runtime Lft5;
        value = "color"
    .end annotation
.end field

.field private final coloredIcon:Lco/bird/android/model/constant/ColoredIcon;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "colored_icon"
    .end annotation

    .annotation runtime Lft5;
        value = "colored_icon"
    .end annotation
.end field

.field private final icon:Lco/bird/android/model/persistence/nestedstructures/Icon;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "icon"
    .end annotation

    .annotation runtime Lft5;
        value = "icon"
    .end annotation
.end field

.field private final label:Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotationLabel;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "label"
    .end annotation

    .annotation runtime Lft5;
        value = "label"
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotationLabel;Lco/bird/android/model/persistence/nestedstructures/Icon;Lco/bird/android/model/constant/ColoredIcon;)V
    .locals 1

    const-string v0, "color"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "borderColor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;->color:Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    iput-object p2, p0, Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;->borderColor:Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    iput-object p3, p0, Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;->label:Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotationLabel;

    iput-object p4, p0, Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;->icon:Lco/bird/android/model/persistence/nestedstructures/Icon;

    iput-object p5, p0, Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;->coloredIcon:Lco/bird/android/model/constant/ColoredIcon;

    return-void
.end method

.method public synthetic constructor <init>(Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotationLabel;Lco/bird/android/model/persistence/nestedstructures/Icon;Lco/bird/android/model/constant/ColoredIcon;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p7, p6, 0x4

    const/4 v0, 0x0

    if-eqz p7, :cond_0

    move-object v4, v0

    goto :goto_0

    :cond_0
    move-object v4, p3

    :goto_0
    and-int/lit8 p3, p6, 0x8

    if-eqz p3, :cond_1

    move-object v5, v0

    goto :goto_1

    :cond_1
    move-object v5, p4

    :goto_1
    and-int/lit8 p3, p6, 0x10

    if-eqz p3, :cond_2

    move-object v6, v0

    goto :goto_2

    :cond_2
    move-object v6, p5

    :goto_2
    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;-><init>(Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotationLabel;Lco/bird/android/model/persistence/nestedstructures/Icon;Lco/bird/android/model/constant/ColoredIcon;)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotationLabel;Lco/bird/android/model/persistence/nestedstructures/Icon;Lco/bird/android/model/constant/ColoredIcon;ILjava/lang/Object;)Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;
    .locals 3

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;->color:Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;->borderColor:Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    :cond_1
    move-object p7, p2

    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_2

    iget-object p3, p0, Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;->label:Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotationLabel;

    :cond_2
    move-object v0, p3

    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_3

    iget-object p4, p0, Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;->icon:Lco/bird/android/model/persistence/nestedstructures/Icon;

    :cond_3
    move-object v1, p4

    and-int/lit8 p2, p6, 0x10

    if-eqz p2, :cond_4

    iget-object p5, p0, Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;->coloredIcon:Lco/bird/android/model/constant/ColoredIcon;

    :cond_4
    move-object v2, p5

    move-object p2, p0

    move-object p3, p1

    move-object p4, p7

    move-object p5, v0

    move-object p6, v1

    move-object p7, v2

    invoke-virtual/range {p2 .. p7}, Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;->copy(Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotationLabel;Lco/bird/android/model/persistence/nestedstructures/Icon;Lco/bird/android/model/constant/ColoredIcon;)Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;->color:Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    return-object v0
.end method

.method public final component2()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;->borderColor:Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    return-object v0
.end method

.method public final component3()Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotationLabel;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;->label:Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotationLabel;

    return-object v0
.end method

.method public final component4()Lco/bird/android/model/persistence/nestedstructures/Icon;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;->icon:Lco/bird/android/model/persistence/nestedstructures/Icon;

    return-object v0
.end method

.method public final component5()Lco/bird/android/model/constant/ColoredIcon;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;->coloredIcon:Lco/bird/android/model/constant/ColoredIcon;

    return-object v0
.end method

.method public final copy(Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotationLabel;Lco/bird/android/model/persistence/nestedstructures/Icon;Lco/bird/android/model/constant/ColoredIcon;)Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;
    .locals 7

    const-string v0, "color"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "borderColor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;

    move-object v1, v0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;-><init>(Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotationLabel;Lco/bird/android/model/persistence/nestedstructures/Icon;Lco/bird/android/model/constant/ColoredIcon;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;

    iget-object v1, p0, Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;->color:Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    iget-object v3, p1, Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;->color:Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;->borderColor:Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    iget-object v3, p1, Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;->borderColor:Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;->label:Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotationLabel;

    iget-object v3, p1, Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;->label:Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotationLabel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;->icon:Lco/bird/android/model/persistence/nestedstructures/Icon;

    iget-object v3, p1, Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;->icon:Lco/bird/android/model/persistence/nestedstructures/Icon;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;->coloredIcon:Lco/bird/android/model/constant/ColoredIcon;

    iget-object p1, p1, Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;->coloredIcon:Lco/bird/android/model/constant/ColoredIcon;

    if-eq v1, p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getBorderColor()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;->borderColor:Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    return-object v0
.end method

.method public final getColor()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;->color:Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    return-object v0
.end method

.method public final getColoredIcon()Lco/bird/android/model/constant/ColoredIcon;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;->coloredIcon:Lco/bird/android/model/constant/ColoredIcon;

    return-object v0
.end method

.method public final getIcon()Lco/bird/android/model/persistence/nestedstructures/Icon;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;->icon:Lco/bird/android/model/persistence/nestedstructures/Icon;

    return-object v0
.end method

.method public final getLabel()Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotationLabel;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;->label:Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotationLabel;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;->color:Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    invoke-virtual {v0}, Lco/bird/android/model/persistence/nestedstructures/ThemedColors;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;->borderColor:Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    invoke-virtual {v1}, Lco/bird/android/model/persistence/nestedstructures/ThemedColors;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;->label:Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotationLabel;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotationLabel;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;->icon:Lco/bird/android/model/persistence/nestedstructures/Icon;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lco/bird/android/model/persistence/nestedstructures/Icon;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;->coloredIcon:Lco/bird/android/model/constant/ColoredIcon;

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;->color:Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    iget-object v1, p0, Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;->borderColor:Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    iget-object v2, p0, Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;->label:Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotationLabel;

    iget-object v3, p0, Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;->icon:Lco/bird/android/model/persistence/nestedstructures/Icon;

    iget-object v4, p0, Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;->coloredIcon:Lco/bird/android/model/constant/ColoredIcon;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "ZoneAnnotation(color="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", borderColor="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", label="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", icon="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", coloredIcon="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
