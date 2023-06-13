.class public final Lco/bird/android/model/wire/WireIconComplication;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B7\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0008H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0008H\u00c6\u0003J;\u0010\u0018\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00082\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008H\u00c6\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001R\u0016\u0010\t\u001a\u00020\u00088\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\u00088\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u000c\u00a8\u0006\u001f"
    }
    d2 = {
        "Lco/bird/android/model/wire/WireIconComplication;",
        "",
        "icon",
        "Lco/bird/android/model/constant/ClientIcon;",
        "numIcons",
        "",
        "numFilled",
        "unfilledColor",
        "Lco/bird/android/model/wire/WireThemedColors;",
        "filledColor",
        "(Lco/bird/android/model/constant/ClientIcon;IILco/bird/android/model/wire/WireThemedColors;Lco/bird/android/model/wire/WireThemedColors;)V",
        "getFilledColor",
        "()Lco/bird/android/model/wire/WireThemedColors;",
        "getIcon",
        "()Lco/bird/android/model/constant/ClientIcon;",
        "getNumFilled",
        "()I",
        "getNumIcons",
        "getUnfilledColor",
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
        "toString",
        "",
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


# instance fields
.field private final filledColor:Lco/bird/android/model/wire/WireThemedColors;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "filled_color"
    .end annotation

    .annotation runtime Lft5;
        value = "filled_color"
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

.field private final numFilled:I
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "num_filled"
    .end annotation

    .annotation runtime Lft5;
        value = "num_filled"
    .end annotation
.end field

.field private final numIcons:I
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "num_icons"
    .end annotation

    .annotation runtime Lft5;
        value = "num_icons"
    .end annotation
.end field

.field private final unfilledColor:Lco/bird/android/model/wire/WireThemedColors;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "unfilled_color"
    .end annotation

    .annotation runtime Lft5;
        value = "unfilled_color"
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 8

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0x1f

    const/4 v7, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v7}, Lco/bird/android/model/wire/WireIconComplication;-><init>(Lco/bird/android/model/constant/ClientIcon;IILco/bird/android/model/wire/WireThemedColors;Lco/bird/android/model/wire/WireThemedColors;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lco/bird/android/model/constant/ClientIcon;IILco/bird/android/model/wire/WireThemedColors;Lco/bird/android/model/wire/WireThemedColors;)V
    .locals 1

    const-string v0, "icon"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "unfilledColor"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "filledColor"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/model/wire/WireIconComplication;->icon:Lco/bird/android/model/constant/ClientIcon;

    iput p2, p0, Lco/bird/android/model/wire/WireIconComplication;->numIcons:I

    iput p3, p0, Lco/bird/android/model/wire/WireIconComplication;->numFilled:I

    iput-object p4, p0, Lco/bird/android/model/wire/WireIconComplication;->unfilledColor:Lco/bird/android/model/wire/WireThemedColors;

    iput-object p5, p0, Lco/bird/android/model/wire/WireIconComplication;->filledColor:Lco/bird/android/model/wire/WireThemedColors;

    return-void
.end method

.method public synthetic constructor <init>(Lco/bird/android/model/constant/ClientIcon;IILco/bird/android/model/wire/WireThemedColors;Lco/bird/android/model/wire/WireThemedColors;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 4

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    sget-object p1, Lco/bird/android/model/constant/ClientIcon;->UNKNOWN:Lco/bird/android/model/constant/ClientIcon;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    const/4 v0, 0x0

    if-eqz p7, :cond_1

    move p7, v0

    goto :goto_0

    :cond_1
    move p7, p2

    :goto_0
    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_2

    move v1, v0

    goto :goto_1

    :cond_2
    move v1, p3

    :goto_1
    and-int/lit8 p2, p6, 0x8

    const/4 p3, 0x0

    const/4 v2, 0x3

    if-eqz p2, :cond_3

    new-instance p4, Lco/bird/android/model/wire/WireThemedColors;

    invoke-direct {p4, v0, v0, v2, p3}, Lco/bird/android/model/wire/WireThemedColors;-><init>(IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_3
    move-object v3, p4

    and-int/lit8 p2, p6, 0x10

    if-eqz p2, :cond_4

    new-instance p5, Lco/bird/android/model/wire/WireThemedColors;

    invoke-direct {p5, v0, v0, v2, p3}, Lco/bird/android/model/wire/WireThemedColors;-><init>(IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_4
    move-object v0, p5

    move-object p2, p0

    move-object p3, p1

    move p4, p7

    move p5, v1

    move-object p6, v3

    move-object p7, v0

    invoke-direct/range {p2 .. p7}, Lco/bird/android/model/wire/WireIconComplication;-><init>(Lco/bird/android/model/constant/ClientIcon;IILco/bird/android/model/wire/WireThemedColors;Lco/bird/android/model/wire/WireThemedColors;)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/wire/WireIconComplication;Lco/bird/android/model/constant/ClientIcon;IILco/bird/android/model/wire/WireThemedColors;Lco/bird/android/model/wire/WireThemedColors;ILjava/lang/Object;)Lco/bird/android/model/wire/WireIconComplication;
    .locals 3

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lco/bird/android/model/wire/WireIconComplication;->icon:Lco/bird/android/model/constant/ClientIcon;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget p2, p0, Lco/bird/android/model/wire/WireIconComplication;->numIcons:I

    :cond_1
    move p7, p2

    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_2

    iget p3, p0, Lco/bird/android/model/wire/WireIconComplication;->numFilled:I

    :cond_2
    move v0, p3

    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_3

    iget-object p4, p0, Lco/bird/android/model/wire/WireIconComplication;->unfilledColor:Lco/bird/android/model/wire/WireThemedColors;

    :cond_3
    move-object v1, p4

    and-int/lit8 p2, p6, 0x10

    if-eqz p2, :cond_4

    iget-object p5, p0, Lco/bird/android/model/wire/WireIconComplication;->filledColor:Lco/bird/android/model/wire/WireThemedColors;

    :cond_4
    move-object v2, p5

    move-object p2, p0

    move-object p3, p1

    move p4, p7

    move p5, v0

    move-object p6, v1

    move-object p7, v2

    invoke-virtual/range {p2 .. p7}, Lco/bird/android/model/wire/WireIconComplication;->copy(Lco/bird/android/model/constant/ClientIcon;IILco/bird/android/model/wire/WireThemedColors;Lco/bird/android/model/wire/WireThemedColors;)Lco/bird/android/model/wire/WireIconComplication;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lco/bird/android/model/constant/ClientIcon;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireIconComplication;->icon:Lco/bird/android/model/constant/ClientIcon;

    return-object v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/wire/WireIconComplication;->numIcons:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/wire/WireIconComplication;->numFilled:I

    return v0
.end method

.method public final component4()Lco/bird/android/model/wire/WireThemedColors;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireIconComplication;->unfilledColor:Lco/bird/android/model/wire/WireThemedColors;

    return-object v0
.end method

.method public final component5()Lco/bird/android/model/wire/WireThemedColors;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireIconComplication;->filledColor:Lco/bird/android/model/wire/WireThemedColors;

    return-object v0
.end method

.method public final copy(Lco/bird/android/model/constant/ClientIcon;IILco/bird/android/model/wire/WireThemedColors;Lco/bird/android/model/wire/WireThemedColors;)Lco/bird/android/model/wire/WireIconComplication;
    .locals 7

    const-string v0, "icon"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "unfilledColor"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "filledColor"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/wire/WireIconComplication;

    move-object v1, v0

    move-object v2, p1

    move v3, p2

    move v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lco/bird/android/model/wire/WireIconComplication;-><init>(Lco/bird/android/model/constant/ClientIcon;IILco/bird/android/model/wire/WireThemedColors;Lco/bird/android/model/wire/WireThemedColors;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/model/wire/WireIconComplication;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/wire/WireIconComplication;

    iget-object v1, p0, Lco/bird/android/model/wire/WireIconComplication;->icon:Lco/bird/android/model/constant/ClientIcon;

    iget-object v3, p1, Lco/bird/android/model/wire/WireIconComplication;->icon:Lco/bird/android/model/constant/ClientIcon;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lco/bird/android/model/wire/WireIconComplication;->numIcons:I

    iget v3, p1, Lco/bird/android/model/wire/WireIconComplication;->numIcons:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lco/bird/android/model/wire/WireIconComplication;->numFilled:I

    iget v3, p1, Lco/bird/android/model/wire/WireIconComplication;->numFilled:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lco/bird/android/model/wire/WireIconComplication;->unfilledColor:Lco/bird/android/model/wire/WireThemedColors;

    iget-object v3, p1, Lco/bird/android/model/wire/WireIconComplication;->unfilledColor:Lco/bird/android/model/wire/WireThemedColors;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lco/bird/android/model/wire/WireIconComplication;->filledColor:Lco/bird/android/model/wire/WireThemedColors;

    iget-object p1, p1, Lco/bird/android/model/wire/WireIconComplication;->filledColor:Lco/bird/android/model/wire/WireThemedColors;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getFilledColor()Lco/bird/android/model/wire/WireThemedColors;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireIconComplication;->filledColor:Lco/bird/android/model/wire/WireThemedColors;

    return-object v0
.end method

.method public final getIcon()Lco/bird/android/model/constant/ClientIcon;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireIconComplication;->icon:Lco/bird/android/model/constant/ClientIcon;

    return-object v0
.end method

.method public final getNumFilled()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/wire/WireIconComplication;->numFilled:I

    return v0
.end method

.method public final getNumIcons()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/wire/WireIconComplication;->numIcons:I

    return v0
.end method

.method public final getUnfilledColor()Lco/bird/android/model/wire/WireThemedColors;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireIconComplication;->unfilledColor:Lco/bird/android/model/wire/WireThemedColors;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lco/bird/android/model/wire/WireIconComplication;->icon:Lco/bird/android/model/constant/ClientIcon;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/bird/android/model/wire/WireIconComplication;->numIcons:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/bird/android/model/wire/WireIconComplication;->numFilled:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireIconComplication;->unfilledColor:Lco/bird/android/model/wire/WireThemedColors;

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireThemedColors;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireIconComplication;->filledColor:Lco/bird/android/model/wire/WireThemedColors;

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireThemedColors;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lco/bird/android/model/wire/WireIconComplication;->icon:Lco/bird/android/model/constant/ClientIcon;

    iget v1, p0, Lco/bird/android/model/wire/WireIconComplication;->numIcons:I

    iget v2, p0, Lco/bird/android/model/wire/WireIconComplication;->numFilled:I

    iget-object v3, p0, Lco/bird/android/model/wire/WireIconComplication;->unfilledColor:Lco/bird/android/model/wire/WireThemedColors;

    iget-object v4, p0, Lco/bird/android/model/wire/WireIconComplication;->filledColor:Lco/bird/android/model/wire/WireThemedColors;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "WireIconComplication(icon="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", numIcons="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", numFilled="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", unfilledColor="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", filledColor="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
