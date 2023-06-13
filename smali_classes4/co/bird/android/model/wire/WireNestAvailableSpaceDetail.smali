.class public final Lco/bird/android/model/wire/WireNestAvailableSpaceDetail;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\'\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\u0008J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J+\u0010\u0012\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0019"
    }
    d2 = {
        "Lco/bird/android/model/wire/WireNestAvailableSpaceDetail;",
        "",
        "count",
        "",
        "coloredIcon",
        "Lco/bird/android/model/constant/ColoredIcon;",
        "icon",
        "Lco/bird/android/model/constant/ClientIcon;",
        "(ILco/bird/android/model/constant/ColoredIcon;Lco/bird/android/model/constant/ClientIcon;)V",
        "getColoredIcon",
        "()Lco/bird/android/model/constant/ColoredIcon;",
        "getCount",
        "()I",
        "getIcon",
        "()Lco/bird/android/model/constant/ClientIcon;",
        "component1",
        "component2",
        "component3",
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
.field private final coloredIcon:Lco/bird/android/model/constant/ColoredIcon;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "colored_icon"
    .end annotation

    .annotation runtime Lft5;
        value = "colored_icon"
    .end annotation
.end field

.field private final count:I
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "count"
    .end annotation

    .annotation runtime Lft5;
        value = "count"
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


# direct methods
.method public constructor <init>()V
    .locals 6

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x7

    const/4 v5, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lco/bird/android/model/wire/WireNestAvailableSpaceDetail;-><init>(ILco/bird/android/model/constant/ColoredIcon;Lco/bird/android/model/constant/ClientIcon;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(ILco/bird/android/model/constant/ColoredIcon;Lco/bird/android/model/constant/ClientIcon;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lco/bird/android/model/wire/WireNestAvailableSpaceDetail;->count:I

    iput-object p2, p0, Lco/bird/android/model/wire/WireNestAvailableSpaceDetail;->coloredIcon:Lco/bird/android/model/constant/ColoredIcon;

    iput-object p3, p0, Lco/bird/android/model/wire/WireNestAvailableSpaceDetail;->icon:Lco/bird/android/model/constant/ClientIcon;

    return-void
.end method

.method public synthetic constructor <init>(ILco/bird/android/model/constant/ColoredIcon;Lco/bird/android/model/constant/ClientIcon;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p5, p4, 0x2

    const/4 v0, 0x0

    if-eqz p5, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    move-object p3, v0

    :cond_2
    invoke-direct {p0, p1, p2, p3}, Lco/bird/android/model/wire/WireNestAvailableSpaceDetail;-><init>(ILco/bird/android/model/constant/ColoredIcon;Lco/bird/android/model/constant/ClientIcon;)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/wire/WireNestAvailableSpaceDetail;ILco/bird/android/model/constant/ColoredIcon;Lco/bird/android/model/constant/ClientIcon;ILjava/lang/Object;)Lco/bird/android/model/wire/WireNestAvailableSpaceDetail;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget p1, p0, Lco/bird/android/model/wire/WireNestAvailableSpaceDetail;->count:I

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lco/bird/android/model/wire/WireNestAvailableSpaceDetail;->coloredIcon:Lco/bird/android/model/constant/ColoredIcon;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lco/bird/android/model/wire/WireNestAvailableSpaceDetail;->icon:Lco/bird/android/model/constant/ClientIcon;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lco/bird/android/model/wire/WireNestAvailableSpaceDetail;->copy(ILco/bird/android/model/constant/ColoredIcon;Lco/bird/android/model/constant/ClientIcon;)Lco/bird/android/model/wire/WireNestAvailableSpaceDetail;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/wire/WireNestAvailableSpaceDetail;->count:I

    return v0
.end method

.method public final component2()Lco/bird/android/model/constant/ColoredIcon;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireNestAvailableSpaceDetail;->coloredIcon:Lco/bird/android/model/constant/ColoredIcon;

    return-object v0
.end method

.method public final component3()Lco/bird/android/model/constant/ClientIcon;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireNestAvailableSpaceDetail;->icon:Lco/bird/android/model/constant/ClientIcon;

    return-object v0
.end method

.method public final copy(ILco/bird/android/model/constant/ColoredIcon;Lco/bird/android/model/constant/ClientIcon;)Lco/bird/android/model/wire/WireNestAvailableSpaceDetail;
    .locals 1

    new-instance v0, Lco/bird/android/model/wire/WireNestAvailableSpaceDetail;

    invoke-direct {v0, p1, p2, p3}, Lco/bird/android/model/wire/WireNestAvailableSpaceDetail;-><init>(ILco/bird/android/model/constant/ColoredIcon;Lco/bird/android/model/constant/ClientIcon;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/model/wire/WireNestAvailableSpaceDetail;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/wire/WireNestAvailableSpaceDetail;

    iget v1, p0, Lco/bird/android/model/wire/WireNestAvailableSpaceDetail;->count:I

    iget v3, p1, Lco/bird/android/model/wire/WireNestAvailableSpaceDetail;->count:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/android/model/wire/WireNestAvailableSpaceDetail;->coloredIcon:Lco/bird/android/model/constant/ColoredIcon;

    iget-object v3, p1, Lco/bird/android/model/wire/WireNestAvailableSpaceDetail;->coloredIcon:Lco/bird/android/model/constant/ColoredIcon;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/bird/android/model/wire/WireNestAvailableSpaceDetail;->icon:Lco/bird/android/model/constant/ClientIcon;

    iget-object p1, p1, Lco/bird/android/model/wire/WireNestAvailableSpaceDetail;->icon:Lco/bird/android/model/constant/ClientIcon;

    if-eq v1, p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getColoredIcon()Lco/bird/android/model/constant/ColoredIcon;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireNestAvailableSpaceDetail;->coloredIcon:Lco/bird/android/model/constant/ColoredIcon;

    return-object v0
.end method

.method public final getCount()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/wire/WireNestAvailableSpaceDetail;->count:I

    return v0
.end method

.method public final getIcon()Lco/bird/android/model/constant/ClientIcon;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireNestAvailableSpaceDetail;->icon:Lco/bird/android/model/constant/ClientIcon;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lco/bird/android/model/wire/WireNestAvailableSpaceDetail;->count:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireNestAvailableSpaceDetail;->coloredIcon:Lco/bird/android/model/constant/ColoredIcon;

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

    iget-object v1, p0, Lco/bird/android/model/wire/WireNestAvailableSpaceDetail;->icon:Lco/bird/android/model/constant/ClientIcon;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget v0, p0, Lco/bird/android/model/wire/WireNestAvailableSpaceDetail;->count:I

    iget-object v1, p0, Lco/bird/android/model/wire/WireNestAvailableSpaceDetail;->coloredIcon:Lco/bird/android/model/constant/ColoredIcon;

    iget-object v2, p0, Lco/bird/android/model/wire/WireNestAvailableSpaceDetail;->icon:Lco/bird/android/model/constant/ClientIcon;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "WireNestAvailableSpaceDetail(count="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", coloredIcon="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", icon="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
