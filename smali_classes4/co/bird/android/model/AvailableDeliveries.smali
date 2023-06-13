.class public final Lco/bird/android/model/AvailableDeliveries;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001B5\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0008H\u00c6\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\nH\u00c6\u0003J9\u0010\u0018\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00082\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\nH\u00c6\u0001J\t\u0010\u0019\u001a\u00020\u0008H\u00d6\u0001J\u0013\u0010\u001a\u001a\u00020\u00032\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u00d6\u0003J\t\u0010\u001d\u001a\u00020\u0008H\u00d6\u0001J\t\u0010\u001e\u001a\u00020\u001fH\u00d6\u0001J\u0019\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0008H\u00d6\u0001R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u001c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\u00088\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013\u00a8\u0006%"
    }
    d2 = {
        "Lco/bird/android/model/AvailableDeliveries;",
        "Landroid/os/Parcelable;",
        "showActiveDrops",
        "",
        "deliveries",
        "",
        "Lco/bird/android/model/Delivery;",
        "minDeliveriesRequired",
        "",
        "currentRoute",
        "Lco/bird/android/model/DeliveryRoute;",
        "(ZLjava/util/List;ILco/bird/android/model/DeliveryRoute;)V",
        "getCurrentRoute",
        "()Lco/bird/android/model/DeliveryRoute;",
        "getDeliveries",
        "()Ljava/util/List;",
        "getMinDeliveriesRequired",
        "()I",
        "getShowActiveDrops",
        "()Z",
        "component1",
        "component2",
        "component3",
        "component4",
        "copy",
        "describeContents",
        "equals",
        "other",
        "",
        "hashCode",
        "toString",
        "",
        "writeToParcel",
        "",
        "parcel",
        "Landroid/os/Parcel;",
        "flags",
        "model_release"
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
            "Lco/bird/android/model/AvailableDeliveries;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final currentRoute:Lco/bird/android/model/DeliveryRoute;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "current_route"
    .end annotation

    .annotation runtime Lft5;
        value = "current_route"
    .end annotation
.end field

.field private final deliveries:Ljava/util/List;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "deliveries"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lco/bird/android/model/Delivery;",
            ">;"
        }
    .end annotation

    .annotation runtime Lft5;
        value = "deliveries"
    .end annotation
.end field

.field private final minDeliveriesRequired:I
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "min_deliveries_required"
    .end annotation

    .annotation runtime Lft5;
        value = "min_deliveries_required"
    .end annotation
.end field

.field private final showActiveDrops:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "show_active_drops"
    .end annotation

    .annotation runtime Lft5;
        value = "show_active_drops"
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lco/bird/android/model/AvailableDeliveries$Creator;

    invoke-direct {v0}, Lco/bird/android/model/AvailableDeliveries$Creator;-><init>()V

    sput-object v0, Lco/bird/android/model/AvailableDeliveries;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 7

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/16 v5, 0xf

    const/4 v6, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lco/bird/android/model/AvailableDeliveries;-><init>(ZLjava/util/List;ILco/bird/android/model/DeliveryRoute;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(ZLjava/util/List;ILco/bird/android/model/DeliveryRoute;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ljava/util/List<",
            "Lco/bird/android/model/Delivery;",
            ">;I",
            "Lco/bird/android/model/DeliveryRoute;",
            ")V"
        }
    .end annotation

    const-string v0, "deliveries"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lco/bird/android/model/AvailableDeliveries;->showActiveDrops:Z

    iput-object p2, p0, Lco/bird/android/model/AvailableDeliveries;->deliveries:Ljava/util/List;

    iput p3, p0, Lco/bird/android/model/AvailableDeliveries;->minDeliveriesRequired:I

    iput-object p4, p0, Lco/bird/android/model/AvailableDeliveries;->currentRoute:Lco/bird/android/model/DeliveryRoute;

    return-void
.end method

.method public synthetic constructor <init>(ZLjava/util/List;ILco/bird/android/model/DeliveryRoute;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p5, 0x1

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p2

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    move p3, v0

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    const/4 p4, 0x0

    :cond_3
    invoke-direct {p0, p1, p2, p3, p4}, Lco/bird/android/model/AvailableDeliveries;-><init>(ZLjava/util/List;ILco/bird/android/model/DeliveryRoute;)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/AvailableDeliveries;ZLjava/util/List;ILco/bird/android/model/DeliveryRoute;ILjava/lang/Object;)Lco/bird/android/model/AvailableDeliveries;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-boolean p1, p0, Lco/bird/android/model/AvailableDeliveries;->showActiveDrops:Z

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lco/bird/android/model/AvailableDeliveries;->deliveries:Ljava/util/List;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget p3, p0, Lco/bird/android/model/AvailableDeliveries;->minDeliveriesRequired:I

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lco/bird/android/model/AvailableDeliveries;->currentRoute:Lco/bird/android/model/DeliveryRoute;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lco/bird/android/model/AvailableDeliveries;->copy(ZLjava/util/List;ILco/bird/android/model/DeliveryRoute;)Lco/bird/android/model/AvailableDeliveries;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/AvailableDeliveries;->showActiveDrops:Z

    return v0
.end method

.method public final component2()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/model/Delivery;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/AvailableDeliveries;->deliveries:Ljava/util/List;

    return-object v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/AvailableDeliveries;->minDeliveriesRequired:I

    return v0
.end method

.method public final component4()Lco/bird/android/model/DeliveryRoute;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/AvailableDeliveries;->currentRoute:Lco/bird/android/model/DeliveryRoute;

    return-object v0
.end method

.method public final copy(ZLjava/util/List;ILco/bird/android/model/DeliveryRoute;)Lco/bird/android/model/AvailableDeliveries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ljava/util/List<",
            "Lco/bird/android/model/Delivery;",
            ">;I",
            "Lco/bird/android/model/DeliveryRoute;",
            ")",
            "Lco/bird/android/model/AvailableDeliveries;"
        }
    .end annotation

    const-string v0, "deliveries"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/AvailableDeliveries;

    invoke-direct {v0, p1, p2, p3, p4}, Lco/bird/android/model/AvailableDeliveries;-><init>(ZLjava/util/List;ILco/bird/android/model/DeliveryRoute;)V

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
    instance-of v1, p1, Lco/bird/android/model/AvailableDeliveries;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/AvailableDeliveries;

    iget-boolean v1, p0, Lco/bird/android/model/AvailableDeliveries;->showActiveDrops:Z

    iget-boolean v3, p1, Lco/bird/android/model/AvailableDeliveries;->showActiveDrops:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/android/model/AvailableDeliveries;->deliveries:Ljava/util/List;

    iget-object v3, p1, Lco/bird/android/model/AvailableDeliveries;->deliveries:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lco/bird/android/model/AvailableDeliveries;->minDeliveriesRequired:I

    iget v3, p1, Lco/bird/android/model/AvailableDeliveries;->minDeliveriesRequired:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lco/bird/android/model/AvailableDeliveries;->currentRoute:Lco/bird/android/model/DeliveryRoute;

    iget-object p1, p1, Lco/bird/android/model/AvailableDeliveries;->currentRoute:Lco/bird/android/model/DeliveryRoute;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getCurrentRoute()Lco/bird/android/model/DeliveryRoute;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/AvailableDeliveries;->currentRoute:Lco/bird/android/model/DeliveryRoute;

    return-object v0
.end method

.method public final getDeliveries()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/model/Delivery;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/AvailableDeliveries;->deliveries:Ljava/util/List;

    return-object v0
.end method

.method public final getMinDeliveriesRequired()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/AvailableDeliveries;->minDeliveriesRequired:I

    return v0
.end method

.method public final getShowActiveDrops()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/AvailableDeliveries;->showActiveDrops:Z

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-boolean v0, p0, Lco/bird/android/model/AvailableDeliveries;->showActiveDrops:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :cond_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/AvailableDeliveries;->deliveries:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/bird/android/model/AvailableDeliveries;->minDeliveriesRequired:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/AvailableDeliveries;->currentRoute:Lco/bird/android/model/DeliveryRoute;

    if-nez v1, :cond_1

    const/4 v1, 0x0

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Lco/bird/android/model/DeliveryRoute;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-boolean v0, p0, Lco/bird/android/model/AvailableDeliveries;->showActiveDrops:Z

    iget-object v1, p0, Lco/bird/android/model/AvailableDeliveries;->deliveries:Ljava/util/List;

    iget v2, p0, Lco/bird/android/model/AvailableDeliveries;->minDeliveriesRequired:I

    iget-object v3, p0, Lco/bird/android/model/AvailableDeliveries;->currentRoute:Lco/bird/android/model/DeliveryRoute;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "AvailableDeliveries(showActiveDrops="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", deliveries="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", minDeliveriesRequired="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", currentRoute="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    const-string v0, "out"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lco/bird/android/model/AvailableDeliveries;->showActiveDrops:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lco/bird/android/model/AvailableDeliveries;->deliveries:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/Delivery;

    invoke-virtual {v1, p1, p2}, Lco/bird/android/model/Delivery;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    :cond_0
    iget v0, p0, Lco/bird/android/model/AvailableDeliveries;->minDeliveriesRequired:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lco/bird/android/model/AvailableDeliveries;->currentRoute:Lco/bird/android/model/DeliveryRoute;

    if-nez v0, :cond_1

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_1

    :cond_1
    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lco/bird/android/model/DeliveryRoute;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_1
    return-void
.end method
