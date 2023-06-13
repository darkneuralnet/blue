.class public final Lco/bird/android/model/wire/WireFleetStatusAction;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0008\u000f\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001B=\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0014\u0008\u0002\u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u0015\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\tH\u00c6\u0003JA\u0010\u0018\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0014\u0008\u0002\u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\tH\u00c6\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001J\t\u0010\u001e\u001a\u00020\nH\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\"\u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u001f"
    }
    d2 = {
        "Lco/bird/android/model/wire/WireFleetStatusAction;",
        "",
        "kind",
        "Lco/bird/android/model/constant/FleetStatusActionKind;",
        "mapAction",
        "Lco/bird/android/model/wire/WireFleetStatusMapAction;",
        "listAction",
        "Lco/bird/android/model/wire/WireFleetStatusListAction;",
        "metadata",
        "",
        "",
        "(Lco/bird/android/model/constant/FleetStatusActionKind;Lco/bird/android/model/wire/WireFleetStatusMapAction;Lco/bird/android/model/wire/WireFleetStatusListAction;Ljava/util/Map;)V",
        "getKind",
        "()Lco/bird/android/model/constant/FleetStatusActionKind;",
        "getListAction",
        "()Lco/bird/android/model/wire/WireFleetStatusListAction;",
        "getMapAction",
        "()Lco/bird/android/model/wire/WireFleetStatusMapAction;",
        "getMetadata",
        "()Ljava/util/Map;",
        "component1",
        "component2",
        "component3",
        "component4",
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
.field private final kind:Lco/bird/android/model/constant/FleetStatusActionKind;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "kind"
    .end annotation

    .annotation runtime Lft5;
        value = "kind"
    .end annotation
.end field

.field private final listAction:Lco/bird/android/model/wire/WireFleetStatusListAction;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "list_action"
    .end annotation

    .annotation runtime Lft5;
        value = "list_action"
    .end annotation
.end field

.field private final mapAction:Lco/bird/android/model/wire/WireFleetStatusMapAction;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "map_action"
    .end annotation

    .annotation runtime Lft5;
        value = "map_action"
    .end annotation
.end field

.field private final metadata:Ljava/util/Map;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "metadata"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation runtime Lft5;
        value = "metadata"
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

    invoke-direct/range {v0 .. v6}, Lco/bird/android/model/wire/WireFleetStatusAction;-><init>(Lco/bird/android/model/constant/FleetStatusActionKind;Lco/bird/android/model/wire/WireFleetStatusMapAction;Lco/bird/android/model/wire/WireFleetStatusListAction;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lco/bird/android/model/constant/FleetStatusActionKind;Lco/bird/android/model/wire/WireFleetStatusMapAction;Lco/bird/android/model/wire/WireFleetStatusListAction;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/constant/FleetStatusActionKind;",
            "Lco/bird/android/model/wire/WireFleetStatusMapAction;",
            "Lco/bird/android/model/wire/WireFleetStatusListAction;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "kind"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "metadata"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/model/wire/WireFleetStatusAction;->kind:Lco/bird/android/model/constant/FleetStatusActionKind;

    iput-object p2, p0, Lco/bird/android/model/wire/WireFleetStatusAction;->mapAction:Lco/bird/android/model/wire/WireFleetStatusMapAction;

    iput-object p3, p0, Lco/bird/android/model/wire/WireFleetStatusAction;->listAction:Lco/bird/android/model/wire/WireFleetStatusListAction;

    iput-object p4, p0, Lco/bird/android/model/wire/WireFleetStatusAction;->metadata:Ljava/util/Map;

    return-void
.end method

.method public synthetic constructor <init>(Lco/bird/android/model/constant/FleetStatusActionKind;Lco/bird/android/model/wire/WireFleetStatusMapAction;Lco/bird/android/model/wire/WireFleetStatusListAction;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    sget-object p1, Lco/bird/android/model/constant/FleetStatusActionKind;->UNKNOWN:Lco/bird/android/model/constant/FleetStatusActionKind;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    const/4 v0, 0x0

    if-eqz p6, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    move-object p3, v0

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object p4

    :cond_3
    invoke-direct {p0, p1, p2, p3, p4}, Lco/bird/android/model/wire/WireFleetStatusAction;-><init>(Lco/bird/android/model/constant/FleetStatusActionKind;Lco/bird/android/model/wire/WireFleetStatusMapAction;Lco/bird/android/model/wire/WireFleetStatusListAction;Ljava/util/Map;)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/wire/WireFleetStatusAction;Lco/bird/android/model/constant/FleetStatusActionKind;Lco/bird/android/model/wire/WireFleetStatusMapAction;Lco/bird/android/model/wire/WireFleetStatusListAction;Ljava/util/Map;ILjava/lang/Object;)Lco/bird/android/model/wire/WireFleetStatusAction;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lco/bird/android/model/wire/WireFleetStatusAction;->kind:Lco/bird/android/model/constant/FleetStatusActionKind;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lco/bird/android/model/wire/WireFleetStatusAction;->mapAction:Lco/bird/android/model/wire/WireFleetStatusMapAction;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lco/bird/android/model/wire/WireFleetStatusAction;->listAction:Lco/bird/android/model/wire/WireFleetStatusListAction;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lco/bird/android/model/wire/WireFleetStatusAction;->metadata:Ljava/util/Map;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lco/bird/android/model/wire/WireFleetStatusAction;->copy(Lco/bird/android/model/constant/FleetStatusActionKind;Lco/bird/android/model/wire/WireFleetStatusMapAction;Lco/bird/android/model/wire/WireFleetStatusListAction;Ljava/util/Map;)Lco/bird/android/model/wire/WireFleetStatusAction;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lco/bird/android/model/constant/FleetStatusActionKind;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireFleetStatusAction;->kind:Lco/bird/android/model/constant/FleetStatusActionKind;

    return-object v0
.end method

.method public final component2()Lco/bird/android/model/wire/WireFleetStatusMapAction;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireFleetStatusAction;->mapAction:Lco/bird/android/model/wire/WireFleetStatusMapAction;

    return-object v0
.end method

.method public final component3()Lco/bird/android/model/wire/WireFleetStatusListAction;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireFleetStatusAction;->listAction:Lco/bird/android/model/wire/WireFleetStatusListAction;

    return-object v0
.end method

.method public final component4()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/wire/WireFleetStatusAction;->metadata:Ljava/util/Map;

    return-object v0
.end method

.method public final copy(Lco/bird/android/model/constant/FleetStatusActionKind;Lco/bird/android/model/wire/WireFleetStatusMapAction;Lco/bird/android/model/wire/WireFleetStatusListAction;Ljava/util/Map;)Lco/bird/android/model/wire/WireFleetStatusAction;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/constant/FleetStatusActionKind;",
            "Lco/bird/android/model/wire/WireFleetStatusMapAction;",
            "Lco/bird/android/model/wire/WireFleetStatusListAction;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lco/bird/android/model/wire/WireFleetStatusAction;"
        }
    .end annotation

    const-string v0, "kind"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "metadata"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/wire/WireFleetStatusAction;

    invoke-direct {v0, p1, p2, p3, p4}, Lco/bird/android/model/wire/WireFleetStatusAction;-><init>(Lco/bird/android/model/constant/FleetStatusActionKind;Lco/bird/android/model/wire/WireFleetStatusMapAction;Lco/bird/android/model/wire/WireFleetStatusListAction;Ljava/util/Map;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/model/wire/WireFleetStatusAction;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/wire/WireFleetStatusAction;

    iget-object v1, p0, Lco/bird/android/model/wire/WireFleetStatusAction;->kind:Lco/bird/android/model/constant/FleetStatusActionKind;

    iget-object v3, p1, Lco/bird/android/model/wire/WireFleetStatusAction;->kind:Lco/bird/android/model/constant/FleetStatusActionKind;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/android/model/wire/WireFleetStatusAction;->mapAction:Lco/bird/android/model/wire/WireFleetStatusMapAction;

    iget-object v3, p1, Lco/bird/android/model/wire/WireFleetStatusAction;->mapAction:Lco/bird/android/model/wire/WireFleetStatusMapAction;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/bird/android/model/wire/WireFleetStatusAction;->listAction:Lco/bird/android/model/wire/WireFleetStatusListAction;

    iget-object v3, p1, Lco/bird/android/model/wire/WireFleetStatusAction;->listAction:Lco/bird/android/model/wire/WireFleetStatusListAction;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lco/bird/android/model/wire/WireFleetStatusAction;->metadata:Ljava/util/Map;

    iget-object p1, p1, Lco/bird/android/model/wire/WireFleetStatusAction;->metadata:Ljava/util/Map;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getKind()Lco/bird/android/model/constant/FleetStatusActionKind;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireFleetStatusAction;->kind:Lco/bird/android/model/constant/FleetStatusActionKind;

    return-object v0
.end method

.method public final getListAction()Lco/bird/android/model/wire/WireFleetStatusListAction;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireFleetStatusAction;->listAction:Lco/bird/android/model/wire/WireFleetStatusListAction;

    return-object v0
.end method

.method public final getMapAction()Lco/bird/android/model/wire/WireFleetStatusMapAction;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireFleetStatusAction;->mapAction:Lco/bird/android/model/wire/WireFleetStatusMapAction;

    return-object v0
.end method

.method public final getMetadata()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/wire/WireFleetStatusAction;->metadata:Ljava/util/Map;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lco/bird/android/model/wire/WireFleetStatusAction;->kind:Lco/bird/android/model/constant/FleetStatusActionKind;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireFleetStatusAction;->mapAction:Lco/bird/android/model/wire/WireFleetStatusMapAction;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lco/bird/android/model/wire/WireFleetStatusMapAction;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireFleetStatusAction;->listAction:Lco/bird/android/model/wire/WireFleetStatusListAction;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lco/bird/android/model/wire/WireFleetStatusListAction;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireFleetStatusAction;->metadata:Ljava/util/Map;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lco/bird/android/model/wire/WireFleetStatusAction;->kind:Lco/bird/android/model/constant/FleetStatusActionKind;

    iget-object v1, p0, Lco/bird/android/model/wire/WireFleetStatusAction;->mapAction:Lco/bird/android/model/wire/WireFleetStatusMapAction;

    iget-object v2, p0, Lco/bird/android/model/wire/WireFleetStatusAction;->listAction:Lco/bird/android/model/wire/WireFleetStatusListAction;

    iget-object v3, p0, Lco/bird/android/model/wire/WireFleetStatusAction;->metadata:Ljava/util/Map;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "WireFleetStatusAction(kind="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", mapAction="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", listAction="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", metadata="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
