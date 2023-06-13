.class public final Lco/bird/android/model/wire/WireOperatorFilterOption;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001B;\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\nH\u00c6\u0003J?\u0010\u001a\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00032\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\nH\u00c6\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001e\u001a\u00020\u001fH\u00d6\u0001J\t\u0010 \u001a\u00020\u0003H\u00d6\u0001R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00088\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0011\u00a8\u0006!"
    }
    d2 = {
        "Lco/bird/android/model/wire/WireOperatorFilterOption;",
        "",
        "name",
        "",
        "type",
        "Lco/bird/android/model/constant/OperatorFilterType;",
        "value",
        "icon",
        "Lco/bird/android/model/constant/ClientIcon;",
        "coloredIcon",
        "Lco/bird/android/model/constant/ColoredIcon;",
        "(Ljava/lang/String;Lco/bird/android/model/constant/OperatorFilterType;Ljava/lang/String;Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/constant/ColoredIcon;)V",
        "getColoredIcon",
        "()Lco/bird/android/model/constant/ColoredIcon;",
        "getIcon",
        "()Lco/bird/android/model/constant/ClientIcon;",
        "getName",
        "()Ljava/lang/String;",
        "getType",
        "()Lco/bird/android/model/constant/OperatorFilterType;",
        "getValue",
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

.field private final icon:Lco/bird/android/model/constant/ClientIcon;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "icon"
    .end annotation

    .annotation runtime Lft5;
        value = "icon"
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

.field private final type:Lco/bird/android/model/constant/OperatorFilterType;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "type"
    .end annotation

    .annotation runtime Lft5;
        value = "type"
    .end annotation
.end field

.field private final value:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "value"
    .end annotation

    .annotation runtime Lft5;
        value = "value"
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

    invoke-direct/range {v0 .. v7}, Lco/bird/android/model/wire/WireOperatorFilterOption;-><init>(Ljava/lang/String;Lco/bird/android/model/constant/OperatorFilterType;Ljava/lang/String;Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/constant/ColoredIcon;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lco/bird/android/model/constant/OperatorFilterType;Ljava/lang/String;Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/constant/ColoredIcon;)V
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/model/wire/WireOperatorFilterOption;->name:Ljava/lang/String;

    iput-object p2, p0, Lco/bird/android/model/wire/WireOperatorFilterOption;->type:Lco/bird/android/model/constant/OperatorFilterType;

    iput-object p3, p0, Lco/bird/android/model/wire/WireOperatorFilterOption;->value:Ljava/lang/String;

    iput-object p4, p0, Lco/bird/android/model/wire/WireOperatorFilterOption;->icon:Lco/bird/android/model/constant/ClientIcon;

    iput-object p5, p0, Lco/bird/android/model/wire/WireOperatorFilterOption;->coloredIcon:Lco/bird/android/model/constant/ColoredIcon;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lco/bird/android/model/constant/OperatorFilterType;Ljava/lang/String;Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/constant/ColoredIcon;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 3

    and-int/lit8 p7, p6, 0x1

    const-string v0, ""

    if-eqz p7, :cond_0

    move-object p7, v0

    goto :goto_0

    :cond_0
    move-object p7, p1

    :goto_0
    and-int/lit8 p1, p6, 0x2

    if-eqz p1, :cond_1

    sget-object p2, Lco/bird/android/model/constant/OperatorFilterType;->UNKNOWN:Lco/bird/android/model/constant/OperatorFilterType;

    :cond_1
    move-object v1, p2

    and-int/lit8 p1, p6, 0x4

    if-eqz p1, :cond_2

    goto :goto_1

    :cond_2
    move-object v0, p3

    :goto_1
    and-int/lit8 p1, p6, 0x8

    const/4 p2, 0x0

    if-eqz p1, :cond_3

    move-object v2, p2

    goto :goto_2

    :cond_3
    move-object v2, p4

    :goto_2
    and-int/lit8 p1, p6, 0x10

    if-eqz p1, :cond_4

    move-object p6, p2

    goto :goto_3

    :cond_4
    move-object p6, p5

    :goto_3
    move-object p1, p0

    move-object p2, p7

    move-object p3, v1

    move-object p4, v0

    move-object p5, v2

    invoke-direct/range {p1 .. p6}, Lco/bird/android/model/wire/WireOperatorFilterOption;-><init>(Ljava/lang/String;Lco/bird/android/model/constant/OperatorFilterType;Ljava/lang/String;Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/constant/ColoredIcon;)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/wire/WireOperatorFilterOption;Ljava/lang/String;Lco/bird/android/model/constant/OperatorFilterType;Ljava/lang/String;Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/constant/ColoredIcon;ILjava/lang/Object;)Lco/bird/android/model/wire/WireOperatorFilterOption;
    .locals 3

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lco/bird/android/model/wire/WireOperatorFilterOption;->name:Ljava/lang/String;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lco/bird/android/model/wire/WireOperatorFilterOption;->type:Lco/bird/android/model/constant/OperatorFilterType;

    :cond_1
    move-object p7, p2

    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_2

    iget-object p3, p0, Lco/bird/android/model/wire/WireOperatorFilterOption;->value:Ljava/lang/String;

    :cond_2
    move-object v0, p3

    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_3

    iget-object p4, p0, Lco/bird/android/model/wire/WireOperatorFilterOption;->icon:Lco/bird/android/model/constant/ClientIcon;

    :cond_3
    move-object v1, p4

    and-int/lit8 p2, p6, 0x10

    if-eqz p2, :cond_4

    iget-object p5, p0, Lco/bird/android/model/wire/WireOperatorFilterOption;->coloredIcon:Lco/bird/android/model/constant/ColoredIcon;

    :cond_4
    move-object v2, p5

    move-object p2, p0

    move-object p3, p1

    move-object p4, p7

    move-object p5, v0

    move-object p6, v1

    move-object p7, v2

    invoke-virtual/range {p2 .. p7}, Lco/bird/android/model/wire/WireOperatorFilterOption;->copy(Ljava/lang/String;Lco/bird/android/model/constant/OperatorFilterType;Ljava/lang/String;Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/constant/ColoredIcon;)Lco/bird/android/model/wire/WireOperatorFilterOption;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireOperatorFilterOption;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Lco/bird/android/model/constant/OperatorFilterType;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireOperatorFilterOption;->type:Lco/bird/android/model/constant/OperatorFilterType;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireOperatorFilterOption;->value:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Lco/bird/android/model/constant/ClientIcon;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireOperatorFilterOption;->icon:Lco/bird/android/model/constant/ClientIcon;

    return-object v0
.end method

.method public final component5()Lco/bird/android/model/constant/ColoredIcon;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireOperatorFilterOption;->coloredIcon:Lco/bird/android/model/constant/ColoredIcon;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Lco/bird/android/model/constant/OperatorFilterType;Ljava/lang/String;Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/constant/ColoredIcon;)Lco/bird/android/model/wire/WireOperatorFilterOption;
    .locals 7

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/wire/WireOperatorFilterOption;

    move-object v1, v0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lco/bird/android/model/wire/WireOperatorFilterOption;-><init>(Ljava/lang/String;Lco/bird/android/model/constant/OperatorFilterType;Ljava/lang/String;Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/constant/ColoredIcon;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/model/wire/WireOperatorFilterOption;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/wire/WireOperatorFilterOption;

    iget-object v1, p0, Lco/bird/android/model/wire/WireOperatorFilterOption;->name:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/wire/WireOperatorFilterOption;->name:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/android/model/wire/WireOperatorFilterOption;->type:Lco/bird/android/model/constant/OperatorFilterType;

    iget-object v3, p1, Lco/bird/android/model/wire/WireOperatorFilterOption;->type:Lco/bird/android/model/constant/OperatorFilterType;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/bird/android/model/wire/WireOperatorFilterOption;->value:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/wire/WireOperatorFilterOption;->value:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lco/bird/android/model/wire/WireOperatorFilterOption;->icon:Lco/bird/android/model/constant/ClientIcon;

    iget-object v3, p1, Lco/bird/android/model/wire/WireOperatorFilterOption;->icon:Lco/bird/android/model/constant/ClientIcon;

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lco/bird/android/model/wire/WireOperatorFilterOption;->coloredIcon:Lco/bird/android/model/constant/ColoredIcon;

    iget-object p1, p1, Lco/bird/android/model/wire/WireOperatorFilterOption;->coloredIcon:Lco/bird/android/model/constant/ColoredIcon;

    if-eq v1, p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getColoredIcon()Lco/bird/android/model/constant/ColoredIcon;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireOperatorFilterOption;->coloredIcon:Lco/bird/android/model/constant/ColoredIcon;

    return-object v0
.end method

.method public final getIcon()Lco/bird/android/model/constant/ClientIcon;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireOperatorFilterOption;->icon:Lco/bird/android/model/constant/ClientIcon;

    return-object v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireOperatorFilterOption;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final getType()Lco/bird/android/model/constant/OperatorFilterType;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireOperatorFilterOption;->type:Lco/bird/android/model/constant/OperatorFilterType;

    return-object v0
.end method

.method public final getValue()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireOperatorFilterOption;->value:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lco/bird/android/model/wire/WireOperatorFilterOption;->name:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireOperatorFilterOption;->type:Lco/bird/android/model/constant/OperatorFilterType;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireOperatorFilterOption;->value:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireOperatorFilterOption;->icon:Lco/bird/android/model/constant/ClientIcon;

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

    iget-object v1, p0, Lco/bird/android/model/wire/WireOperatorFilterOption;->coloredIcon:Lco/bird/android/model/constant/ColoredIcon;

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
    .locals 7

    iget-object v0, p0, Lco/bird/android/model/wire/WireOperatorFilterOption;->name:Ljava/lang/String;

    iget-object v1, p0, Lco/bird/android/model/wire/WireOperatorFilterOption;->type:Lco/bird/android/model/constant/OperatorFilterType;

    iget-object v2, p0, Lco/bird/android/model/wire/WireOperatorFilterOption;->value:Ljava/lang/String;

    iget-object v3, p0, Lco/bird/android/model/wire/WireOperatorFilterOption;->icon:Lco/bird/android/model/constant/ClientIcon;

    iget-object v4, p0, Lco/bird/android/model/wire/WireOperatorFilterOption;->coloredIcon:Lco/bird/android/model/constant/ColoredIcon;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "WireOperatorFilterOption(name="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", type="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", value="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

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
