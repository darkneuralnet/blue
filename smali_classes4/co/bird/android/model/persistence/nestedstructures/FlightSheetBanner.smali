.class public final Lco/bird/android/model/persistence/nestedstructures/FlightSheetBanner;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0012\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003JA\u0010\u0018\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001J\t\u0010\u001e\u001a\u00020\u0003H\u00d6\u0001R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0018\u0010\u0008\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u000cR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u000c\u00a8\u0006\u001f"
    }
    d2 = {
        "Lco/bird/android/model/persistence/nestedstructures/FlightSheetBanner;",
        "",
        "text",
        "",
        "textColor",
        "Lco/bird/android/model/persistence/nestedstructures/ThemedColors;",
        "icon",
        "Lco/bird/android/model/constant/ClientIcon;",
        "iconColor",
        "backgroundColor",
        "(Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;)V",
        "getBackgroundColor",
        "()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;",
        "getIcon",
        "()Lco/bird/android/model/constant/ClientIcon;",
        "getIconColor",
        "getText",
        "()Ljava/lang/String;",
        "getTextColor",
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
.field private final backgroundColor:Lco/bird/android/model/persistence/nestedstructures/ThemedColors;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "background_color"
    .end annotation

    .annotation runtime Lft5;
        value = "background_color"
    .end annotation
.end field

.field private final icon:Lco/bird/android/model/constant/ClientIcon;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "icon"
    .end annotation

    .annotation runtime Lft5;
        value = "icon"
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

.field private final text:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "text"
    .end annotation

    .annotation runtime Lft5;
        value = "text"
    .end annotation
.end field

.field private final textColor:Lco/bird/android/model/persistence/nestedstructures/ThemedColors;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "text_color"
    .end annotation

    .annotation runtime Lft5;
        value = "text_color"
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;)V
    .locals 1

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "textColor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/model/persistence/nestedstructures/FlightSheetBanner;->text:Ljava/lang/String;

    iput-object p2, p0, Lco/bird/android/model/persistence/nestedstructures/FlightSheetBanner;->textColor:Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    iput-object p3, p0, Lco/bird/android/model/persistence/nestedstructures/FlightSheetBanner;->icon:Lco/bird/android/model/constant/ClientIcon;

    iput-object p4, p0, Lco/bird/android/model/persistence/nestedstructures/FlightSheetBanner;->iconColor:Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    iput-object p5, p0, Lco/bird/android/model/persistence/nestedstructures/FlightSheetBanner;->backgroundColor:Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/persistence/nestedstructures/FlightSheetBanner;Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;ILjava/lang/Object;)Lco/bird/android/model/persistence/nestedstructures/FlightSheetBanner;
    .locals 3

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lco/bird/android/model/persistence/nestedstructures/FlightSheetBanner;->text:Ljava/lang/String;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lco/bird/android/model/persistence/nestedstructures/FlightSheetBanner;->textColor:Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    :cond_1
    move-object p7, p2

    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_2

    iget-object p3, p0, Lco/bird/android/model/persistence/nestedstructures/FlightSheetBanner;->icon:Lco/bird/android/model/constant/ClientIcon;

    :cond_2
    move-object v0, p3

    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_3

    iget-object p4, p0, Lco/bird/android/model/persistence/nestedstructures/FlightSheetBanner;->iconColor:Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    :cond_3
    move-object v1, p4

    and-int/lit8 p2, p6, 0x10

    if-eqz p2, :cond_4

    iget-object p5, p0, Lco/bird/android/model/persistence/nestedstructures/FlightSheetBanner;->backgroundColor:Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    :cond_4
    move-object v2, p5

    move-object p2, p0

    move-object p3, p1

    move-object p4, p7

    move-object p5, v0

    move-object p6, v1

    move-object p7, v2

    invoke-virtual/range {p2 .. p7}, Lco/bird/android/model/persistence/nestedstructures/FlightSheetBanner;->copy(Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;)Lco/bird/android/model/persistence/nestedstructures/FlightSheetBanner;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/FlightSheetBanner;->text:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/FlightSheetBanner;->textColor:Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    return-object v0
.end method

.method public final component3()Lco/bird/android/model/constant/ClientIcon;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/FlightSheetBanner;->icon:Lco/bird/android/model/constant/ClientIcon;

    return-object v0
.end method

.method public final component4()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/FlightSheetBanner;->iconColor:Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    return-object v0
.end method

.method public final component5()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/FlightSheetBanner;->backgroundColor:Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;)Lco/bird/android/model/persistence/nestedstructures/FlightSheetBanner;
    .locals 7

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "textColor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/persistence/nestedstructures/FlightSheetBanner;

    move-object v1, v0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lco/bird/android/model/persistence/nestedstructures/FlightSheetBanner;-><init>(Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/model/persistence/nestedstructures/FlightSheetBanner;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/persistence/nestedstructures/FlightSheetBanner;

    iget-object v1, p0, Lco/bird/android/model/persistence/nestedstructures/FlightSheetBanner;->text:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/persistence/nestedstructures/FlightSheetBanner;->text:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/android/model/persistence/nestedstructures/FlightSheetBanner;->textColor:Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    iget-object v3, p1, Lco/bird/android/model/persistence/nestedstructures/FlightSheetBanner;->textColor:Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/bird/android/model/persistence/nestedstructures/FlightSheetBanner;->icon:Lco/bird/android/model/constant/ClientIcon;

    iget-object v3, p1, Lco/bird/android/model/persistence/nestedstructures/FlightSheetBanner;->icon:Lco/bird/android/model/constant/ClientIcon;

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lco/bird/android/model/persistence/nestedstructures/FlightSheetBanner;->iconColor:Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    iget-object v3, p1, Lco/bird/android/model/persistence/nestedstructures/FlightSheetBanner;->iconColor:Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lco/bird/android/model/persistence/nestedstructures/FlightSheetBanner;->backgroundColor:Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    iget-object p1, p1, Lco/bird/android/model/persistence/nestedstructures/FlightSheetBanner;->backgroundColor:Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getBackgroundColor()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/FlightSheetBanner;->backgroundColor:Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    return-object v0
.end method

.method public final getIcon()Lco/bird/android/model/constant/ClientIcon;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/FlightSheetBanner;->icon:Lco/bird/android/model/constant/ClientIcon;

    return-object v0
.end method

.method public final getIconColor()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/FlightSheetBanner;->iconColor:Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    return-object v0
.end method

.method public final getText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/FlightSheetBanner;->text:Ljava/lang/String;

    return-object v0
.end method

.method public final getTextColor()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/FlightSheetBanner;->textColor:Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/FlightSheetBanner;->text:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/nestedstructures/FlightSheetBanner;->textColor:Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    invoke-virtual {v1}, Lco/bird/android/model/persistence/nestedstructures/ThemedColors;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/nestedstructures/FlightSheetBanner;->icon:Lco/bird/android/model/constant/ClientIcon;

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

    iget-object v1, p0, Lco/bird/android/model/persistence/nestedstructures/FlightSheetBanner;->iconColor:Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lco/bird/android/model/persistence/nestedstructures/ThemedColors;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/nestedstructures/FlightSheetBanner;->backgroundColor:Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Lco/bird/android/model/persistence/nestedstructures/ThemedColors;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/FlightSheetBanner;->text:Ljava/lang/String;

    iget-object v1, p0, Lco/bird/android/model/persistence/nestedstructures/FlightSheetBanner;->textColor:Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    iget-object v2, p0, Lco/bird/android/model/persistence/nestedstructures/FlightSheetBanner;->icon:Lco/bird/android/model/constant/ClientIcon;

    iget-object v3, p0, Lco/bird/android/model/persistence/nestedstructures/FlightSheetBanner;->iconColor:Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    iget-object v4, p0, Lco/bird/android/model/persistence/nestedstructures/FlightSheetBanner;->backgroundColor:Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "FlightSheetBanner(text="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", textColor="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", icon="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", iconColor="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", backgroundColor="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
