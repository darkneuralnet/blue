.class public final Lco/bird/api/request/WireItemLeaseStartRequest;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003J?\u0010\u0016\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00032\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0008H\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u0003H\u00d6\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00088\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u001d"
    }
    d2 = {
        "Lco/bird/api/request/WireItemLeaseStartRequest;",
        "",
        "habitatId",
        "",
        "leaseType",
        "leasedItemId",
        "associatedItemId",
        "paymentAuth",
        "Lco/bird/api/request/WirePaymentAuthRequest;",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/api/request/WirePaymentAuthRequest;)V",
        "getAssociatedItemId",
        "()Ljava/lang/String;",
        "getHabitatId",
        "getLeaseType",
        "getLeasedItemId",
        "getPaymentAuth",
        "()Lco/bird/api/request/WirePaymentAuthRequest;",
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
        "co.bird.android.api"
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
.field private final associatedItemId:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "associated_item_id"
    .end annotation

    .annotation runtime Lft5;
        value = "associated_item_id"
    .end annotation
.end field

.field private final habitatId:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "habitat_id"
    .end annotation

    .annotation runtime Lft5;
        value = "habitat_id"
    .end annotation
.end field

.field private final leaseType:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "lease_type"
    .end annotation

    .annotation runtime Lft5;
        value = "lease_type"
    .end annotation
.end field

.field private final leasedItemId:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "leased_item_id"
    .end annotation

    .annotation runtime Lft5;
        value = "leased_item_id"
    .end annotation
.end field

.field private final paymentAuth:Lco/bird/api/request/WirePaymentAuthRequest;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "payment_auth"
    .end annotation

    .annotation runtime Lft5;
        value = "payment_auth"
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/api/request/WirePaymentAuthRequest;)V
    .locals 1

    const-string v0, "habitatId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "leaseType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "leasedItemId"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/api/request/WireItemLeaseStartRequest;->habitatId:Ljava/lang/String;

    iput-object p2, p0, Lco/bird/api/request/WireItemLeaseStartRequest;->leaseType:Ljava/lang/String;

    iput-object p3, p0, Lco/bird/api/request/WireItemLeaseStartRequest;->leasedItemId:Ljava/lang/String;

    iput-object p4, p0, Lco/bird/api/request/WireItemLeaseStartRequest;->associatedItemId:Ljava/lang/String;

    iput-object p5, p0, Lco/bird/api/request/WireItemLeaseStartRequest;->paymentAuth:Lco/bird/api/request/WirePaymentAuthRequest;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/api/request/WirePaymentAuthRequest;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p7, p6, 0x8

    const/4 v0, 0x0

    if-eqz p7, :cond_0

    move-object v5, v0

    goto :goto_0

    :cond_0
    move-object v5, p4

    :goto_0
    and-int/lit8 p4, p6, 0x10

    if-eqz p4, :cond_1

    move-object v6, v0

    goto :goto_1

    :cond_1
    move-object v6, p5

    :goto_1
    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-direct/range {v1 .. v6}, Lco/bird/api/request/WireItemLeaseStartRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/api/request/WirePaymentAuthRequest;)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/api/request/WireItemLeaseStartRequest;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/api/request/WirePaymentAuthRequest;ILjava/lang/Object;)Lco/bird/api/request/WireItemLeaseStartRequest;
    .locals 3

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lco/bird/api/request/WireItemLeaseStartRequest;->habitatId:Ljava/lang/String;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lco/bird/api/request/WireItemLeaseStartRequest;->leaseType:Ljava/lang/String;

    :cond_1
    move-object p7, p2

    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_2

    iget-object p3, p0, Lco/bird/api/request/WireItemLeaseStartRequest;->leasedItemId:Ljava/lang/String;

    :cond_2
    move-object v0, p3

    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_3

    iget-object p4, p0, Lco/bird/api/request/WireItemLeaseStartRequest;->associatedItemId:Ljava/lang/String;

    :cond_3
    move-object v1, p4

    and-int/lit8 p2, p6, 0x10

    if-eqz p2, :cond_4

    iget-object p5, p0, Lco/bird/api/request/WireItemLeaseStartRequest;->paymentAuth:Lco/bird/api/request/WirePaymentAuthRequest;

    :cond_4
    move-object v2, p5

    move-object p2, p0

    move-object p3, p1

    move-object p4, p7

    move-object p5, v0

    move-object p6, v1

    move-object p7, v2

    invoke-virtual/range {p2 .. p7}, Lco/bird/api/request/WireItemLeaseStartRequest;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/api/request/WirePaymentAuthRequest;)Lco/bird/api/request/WireItemLeaseStartRequest;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/api/request/WireItemLeaseStartRequest;->habitatId:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/api/request/WireItemLeaseStartRequest;->leaseType:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/api/request/WireItemLeaseStartRequest;->leasedItemId:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/api/request/WireItemLeaseStartRequest;->associatedItemId:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Lco/bird/api/request/WirePaymentAuthRequest;
    .locals 1

    iget-object v0, p0, Lco/bird/api/request/WireItemLeaseStartRequest;->paymentAuth:Lco/bird/api/request/WirePaymentAuthRequest;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/api/request/WirePaymentAuthRequest;)Lco/bird/api/request/WireItemLeaseStartRequest;
    .locals 7

    const-string v0, "habitatId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "leaseType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "leasedItemId"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/api/request/WireItemLeaseStartRequest;

    move-object v1, v0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lco/bird/api/request/WireItemLeaseStartRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/api/request/WirePaymentAuthRequest;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/api/request/WireItemLeaseStartRequest;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/api/request/WireItemLeaseStartRequest;

    iget-object v1, p0, Lco/bird/api/request/WireItemLeaseStartRequest;->habitatId:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/api/request/WireItemLeaseStartRequest;->habitatId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/api/request/WireItemLeaseStartRequest;->leaseType:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/api/request/WireItemLeaseStartRequest;->leaseType:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/bird/api/request/WireItemLeaseStartRequest;->leasedItemId:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/api/request/WireItemLeaseStartRequest;->leasedItemId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lco/bird/api/request/WireItemLeaseStartRequest;->associatedItemId:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/api/request/WireItemLeaseStartRequest;->associatedItemId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lco/bird/api/request/WireItemLeaseStartRequest;->paymentAuth:Lco/bird/api/request/WirePaymentAuthRequest;

    iget-object p1, p1, Lco/bird/api/request/WireItemLeaseStartRequest;->paymentAuth:Lco/bird/api/request/WirePaymentAuthRequest;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getAssociatedItemId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/api/request/WireItemLeaseStartRequest;->associatedItemId:Ljava/lang/String;

    return-object v0
.end method

.method public final getHabitatId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/api/request/WireItemLeaseStartRequest;->habitatId:Ljava/lang/String;

    return-object v0
.end method

.method public final getLeaseType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/api/request/WireItemLeaseStartRequest;->leaseType:Ljava/lang/String;

    return-object v0
.end method

.method public final getLeasedItemId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/api/request/WireItemLeaseStartRequest;->leasedItemId:Ljava/lang/String;

    return-object v0
.end method

.method public final getPaymentAuth()Lco/bird/api/request/WirePaymentAuthRequest;
    .locals 1

    iget-object v0, p0, Lco/bird/api/request/WireItemLeaseStartRequest;->paymentAuth:Lco/bird/api/request/WirePaymentAuthRequest;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lco/bird/api/request/WireItemLeaseStartRequest;->habitatId:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/api/request/WireItemLeaseStartRequest;->leaseType:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/api/request/WireItemLeaseStartRequest;->leasedItemId:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/api/request/WireItemLeaseStartRequest;->associatedItemId:Ljava/lang/String;

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

    iget-object v1, p0, Lco/bird/api/request/WireItemLeaseStartRequest;->paymentAuth:Lco/bird/api/request/WirePaymentAuthRequest;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lco/bird/api/request/WirePaymentAuthRequest;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lco/bird/api/request/WireItemLeaseStartRequest;->habitatId:Ljava/lang/String;

    iget-object v1, p0, Lco/bird/api/request/WireItemLeaseStartRequest;->leaseType:Ljava/lang/String;

    iget-object v2, p0, Lco/bird/api/request/WireItemLeaseStartRequest;->leasedItemId:Ljava/lang/String;

    iget-object v3, p0, Lco/bird/api/request/WireItemLeaseStartRequest;->associatedItemId:Ljava/lang/String;

    iget-object v4, p0, Lco/bird/api/request/WireItemLeaseStartRequest;->paymentAuth:Lco/bird/api/request/WirePaymentAuthRequest;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "WireItemLeaseStartRequest(habitatId="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", leaseType="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", leasedItemId="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", associatedItemId="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", paymentAuth="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
