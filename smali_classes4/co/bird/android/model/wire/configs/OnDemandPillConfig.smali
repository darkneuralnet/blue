.class public final Lco/bird/android/model/wire/configs/OnDemandPillConfig;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0013\u0008\u0086\u0008\u0018\u00002\u00020\u0001B5\u0012\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0008J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0010J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0010J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J>\u0010\u0017\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\n2\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u0006H\u00d6\u0001R\u0011\u0010\t\u001a\u00020\n8F\u00a2\u0006\u0006\u001a\u0004\u0008\t\u0010\u000bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\rR\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0011\u001a\u0004\u0008\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0011\u001a\u0004\u0008\u0012\u0010\u0010\u00a8\u0006\u001d"
    }
    d2 = {
        "Lco/bird/android/model/wire/configs/OnDemandPillConfig;",
        "",
        "timeRenderCap",
        "",
        "visibleIfTimeLessThan",
        "preorderText",
        "",
        "postorderText",
        "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V",
        "isNull",
        "",
        "()Z",
        "getPostorderText",
        "()Ljava/lang/String;",
        "getPreorderText",
        "getTimeRenderCap",
        "()Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "getVisibleIfTimeLessThan",
        "component1",
        "component2",
        "component3",
        "component4",
        "copy",
        "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lco/bird/android/model/wire/configs/OnDemandPillConfig;",
        "equals",
        "other",
        "hashCode",
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
.field private final postorderText:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "postorder_text"
    .end annotation

    .annotation runtime Lft5;
        value = "postorder_text"
    .end annotation
.end field

.field private final preorderText:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "preorder_text"
    .end annotation

    .annotation runtime Lft5;
        value = "preorder_text"
    .end annotation
.end field

.field private final timeRenderCap:Ljava/lang/Integer;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "time_render_cap"
    .end annotation

    .annotation runtime Lft5;
        value = "time_render_cap"
    .end annotation
.end field

.field private final visibleIfTimeLessThan:Ljava/lang/Integer;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "visible_if_time_less_than"
    .end annotation

    .annotation runtime Lft5;
        value = "visible_if_time_less_than"
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 7

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/16 v5, 0xf

    const/4 v6, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lco/bird/android/model/wire/configs/OnDemandPillConfig;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/model/wire/configs/OnDemandPillConfig;->timeRenderCap:Ljava/lang/Integer;

    iput-object p2, p0, Lco/bird/android/model/wire/configs/OnDemandPillConfig;->visibleIfTimeLessThan:Ljava/lang/Integer;

    iput-object p3, p0, Lco/bird/android/model/wire/configs/OnDemandPillConfig;->preorderText:Ljava/lang/String;

    iput-object p4, p0, Lco/bird/android/model/wire/configs/OnDemandPillConfig;->postorderText:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p5, 0x1

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    move-object p3, v0

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    move-object p4, v0

    :cond_3
    invoke-direct {p0, p1, p2, p3, p4}, Lco/bird/android/model/wire/configs/OnDemandPillConfig;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/wire/configs/OnDemandPillConfig;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lco/bird/android/model/wire/configs/OnDemandPillConfig;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lco/bird/android/model/wire/configs/OnDemandPillConfig;->timeRenderCap:Ljava/lang/Integer;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lco/bird/android/model/wire/configs/OnDemandPillConfig;->visibleIfTimeLessThan:Ljava/lang/Integer;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lco/bird/android/model/wire/configs/OnDemandPillConfig;->preorderText:Ljava/lang/String;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lco/bird/android/model/wire/configs/OnDemandPillConfig;->postorderText:Ljava/lang/String;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lco/bird/android/model/wire/configs/OnDemandPillConfig;->copy(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lco/bird/android/model/wire/configs/OnDemandPillConfig;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/OnDemandPillConfig;->timeRenderCap:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component2()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/OnDemandPillConfig;->visibleIfTimeLessThan:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/OnDemandPillConfig;->preorderText:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/OnDemandPillConfig;->postorderText:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lco/bird/android/model/wire/configs/OnDemandPillConfig;
    .locals 1

    new-instance v0, Lco/bird/android/model/wire/configs/OnDemandPillConfig;

    invoke-direct {v0, p1, p2, p3, p4}, Lco/bird/android/model/wire/configs/OnDemandPillConfig;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/model/wire/configs/OnDemandPillConfig;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/wire/configs/OnDemandPillConfig;

    iget-object v1, p0, Lco/bird/android/model/wire/configs/OnDemandPillConfig;->timeRenderCap:Ljava/lang/Integer;

    iget-object v3, p1, Lco/bird/android/model/wire/configs/OnDemandPillConfig;->timeRenderCap:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/android/model/wire/configs/OnDemandPillConfig;->visibleIfTimeLessThan:Ljava/lang/Integer;

    iget-object v3, p1, Lco/bird/android/model/wire/configs/OnDemandPillConfig;->visibleIfTimeLessThan:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/bird/android/model/wire/configs/OnDemandPillConfig;->preorderText:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/wire/configs/OnDemandPillConfig;->preorderText:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lco/bird/android/model/wire/configs/OnDemandPillConfig;->postorderText:Ljava/lang/String;

    iget-object p1, p1, Lco/bird/android/model/wire/configs/OnDemandPillConfig;->postorderText:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getPostorderText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/OnDemandPillConfig;->postorderText:Ljava/lang/String;

    return-object v0
.end method

.method public final getPreorderText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/OnDemandPillConfig;->preorderText:Ljava/lang/String;

    return-object v0
.end method

.method public final getTimeRenderCap()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/OnDemandPillConfig;->timeRenderCap:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getVisibleIfTimeLessThan()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/OnDemandPillConfig;->visibleIfTimeLessThan:Ljava/lang/Integer;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lco/bird/android/model/wire/configs/OnDemandPillConfig;->timeRenderCap:Ljava/lang/Integer;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/wire/configs/OnDemandPillConfig;->visibleIfTimeLessThan:Ljava/lang/Integer;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/wire/configs/OnDemandPillConfig;->preorderText:Ljava/lang/String;

    if-nez v2, :cond_2

    move v2, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/wire/configs/OnDemandPillConfig;->postorderText:Ljava/lang/String;

    if-nez v2, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    return v0
.end method

.method public final isNull()Z
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/OnDemandPillConfig;->timeRenderCap:Ljava/lang/Integer;

    if-nez v0, :cond_0

    iget-object v0, p0, Lco/bird/android/model/wire/configs/OnDemandPillConfig;->visibleIfTimeLessThan:Ljava/lang/Integer;

    if-nez v0, :cond_0

    iget-object v0, p0, Lco/bird/android/model/wire/configs/OnDemandPillConfig;->preorderText:Ljava/lang/String;

    if-nez v0, :cond_0

    iget-object v0, p0, Lco/bird/android/model/wire/configs/OnDemandPillConfig;->postorderText:Ljava/lang/String;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lco/bird/android/model/wire/configs/OnDemandPillConfig;->timeRenderCap:Ljava/lang/Integer;

    iget-object v1, p0, Lco/bird/android/model/wire/configs/OnDemandPillConfig;->visibleIfTimeLessThan:Ljava/lang/Integer;

    iget-object v2, p0, Lco/bird/android/model/wire/configs/OnDemandPillConfig;->preorderText:Ljava/lang/String;

    iget-object v3, p0, Lco/bird/android/model/wire/configs/OnDemandPillConfig;->postorderText:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "OnDemandPillConfig(timeRenderCap="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", visibleIfTimeLessThan="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", preorderText="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", postorderText="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
