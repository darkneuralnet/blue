.class public final Lco/bird/android/model/PlanItemModel;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0013\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u0086\u0008\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0006H\u00c6\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000eJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\tH\u00c6\u0003JD\u0010\u001a\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00062\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\tH\u00c6\u0001\u00a2\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001f\u001a\u00020\u0006H\u00d6\u0001J\t\u0010 \u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\n\n\u0002\u0010\u000f\u001a\u0004\u0008\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u000cR\u0013\u0010\u0008\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014\u00a8\u0006!"
    }
    d2 = {
        "Lco/bird/android/model/PlanItemModel;",
        "",
        "planId",
        "",
        "currency",
        "refillAmount",
        "",
        "incentiveAmount",
        "planItemDescription",
        "Lco/bird/android/model/PlanItemDescription;",
        "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;Lco/bird/android/model/PlanItemDescription;)V",
        "getCurrency",
        "()Ljava/lang/String;",
        "getIncentiveAmount",
        "()Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "getPlanId",
        "getPlanItemDescription",
        "()Lco/bird/android/model/PlanItemDescription;",
        "getRefillAmount",
        "()I",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;Lco/bird/android/model/PlanItemDescription;)Lco/bird/android/model/PlanItemModel;",
        "equals",
        "",
        "other",
        "hashCode",
        "toString",
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


# instance fields
.field private final currency:Ljava/lang/String;

.field private final incentiveAmount:Ljava/lang/Integer;

.field private final planId:Ljava/lang/String;

.field private final planItemDescription:Lco/bird/android/model/PlanItemDescription;

.field private final refillAmount:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;Lco/bird/android/model/PlanItemDescription;)V
    .locals 1

    const-string v0, "planId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "currency"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/model/PlanItemModel;->planId:Ljava/lang/String;

    iput-object p2, p0, Lco/bird/android/model/PlanItemModel;->currency:Ljava/lang/String;

    iput p3, p0, Lco/bird/android/model/PlanItemModel;->refillAmount:I

    iput-object p4, p0, Lco/bird/android/model/PlanItemModel;->incentiveAmount:Ljava/lang/Integer;

    iput-object p5, p0, Lco/bird/android/model/PlanItemModel;->planItemDescription:Lco/bird/android/model/PlanItemDescription;

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/PlanItemModel;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;Lco/bird/android/model/PlanItemDescription;ILjava/lang/Object;)Lco/bird/android/model/PlanItemModel;
    .locals 3

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lco/bird/android/model/PlanItemModel;->planId:Ljava/lang/String;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lco/bird/android/model/PlanItemModel;->currency:Ljava/lang/String;

    :cond_1
    move-object p7, p2

    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_2

    iget p3, p0, Lco/bird/android/model/PlanItemModel;->refillAmount:I

    :cond_2
    move v0, p3

    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_3

    iget-object p4, p0, Lco/bird/android/model/PlanItemModel;->incentiveAmount:Ljava/lang/Integer;

    :cond_3
    move-object v1, p4

    and-int/lit8 p2, p6, 0x10

    if-eqz p2, :cond_4

    iget-object p5, p0, Lco/bird/android/model/PlanItemModel;->planItemDescription:Lco/bird/android/model/PlanItemDescription;

    :cond_4
    move-object v2, p5

    move-object p2, p0

    move-object p3, p1

    move-object p4, p7

    move p5, v0

    move-object p6, v1

    move-object p7, v2

    invoke-virtual/range {p2 .. p7}, Lco/bird/android/model/PlanItemModel;->copy(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;Lco/bird/android/model/PlanItemDescription;)Lco/bird/android/model/PlanItemModel;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/PlanItemModel;->planId:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/PlanItemModel;->currency:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/PlanItemModel;->refillAmount:I

    return v0
.end method

.method public final component4()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/PlanItemModel;->incentiveAmount:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component5()Lco/bird/android/model/PlanItemDescription;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/PlanItemModel;->planItemDescription:Lco/bird/android/model/PlanItemDescription;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;Lco/bird/android/model/PlanItemDescription;)Lco/bird/android/model/PlanItemModel;
    .locals 7

    const-string v0, "planId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "currency"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/PlanItemModel;

    move-object v1, v0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lco/bird/android/model/PlanItemModel;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;Lco/bird/android/model/PlanItemDescription;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/model/PlanItemModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/PlanItemModel;

    iget-object v1, p0, Lco/bird/android/model/PlanItemModel;->planId:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/PlanItemModel;->planId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/android/model/PlanItemModel;->currency:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/PlanItemModel;->currency:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lco/bird/android/model/PlanItemModel;->refillAmount:I

    iget v3, p1, Lco/bird/android/model/PlanItemModel;->refillAmount:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lco/bird/android/model/PlanItemModel;->incentiveAmount:Ljava/lang/Integer;

    iget-object v3, p1, Lco/bird/android/model/PlanItemModel;->incentiveAmount:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lco/bird/android/model/PlanItemModel;->planItemDescription:Lco/bird/android/model/PlanItemDescription;

    iget-object p1, p1, Lco/bird/android/model/PlanItemModel;->planItemDescription:Lco/bird/android/model/PlanItemDescription;

    if-eq v1, p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getCurrency()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/PlanItemModel;->currency:Ljava/lang/String;

    return-object v0
.end method

.method public final getIncentiveAmount()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/PlanItemModel;->incentiveAmount:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getPlanId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/PlanItemModel;->planId:Ljava/lang/String;

    return-object v0
.end method

.method public final getPlanItemDescription()Lco/bird/android/model/PlanItemDescription;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/PlanItemModel;->planItemDescription:Lco/bird/android/model/PlanItemDescription;

    return-object v0
.end method

.method public final getRefillAmount()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/PlanItemModel;->refillAmount:I

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lco/bird/android/model/PlanItemModel;->planId:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/PlanItemModel;->currency:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/bird/android/model/PlanItemModel;->refillAmount:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/PlanItemModel;->incentiveAmount:Ljava/lang/Integer;

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

    iget-object v1, p0, Lco/bird/android/model/PlanItemModel;->planItemDescription:Lco/bird/android/model/PlanItemDescription;

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

    iget-object v0, p0, Lco/bird/android/model/PlanItemModel;->planId:Ljava/lang/String;

    iget-object v1, p0, Lco/bird/android/model/PlanItemModel;->currency:Ljava/lang/String;

    iget v2, p0, Lco/bird/android/model/PlanItemModel;->refillAmount:I

    iget-object v3, p0, Lco/bird/android/model/PlanItemModel;->incentiveAmount:Ljava/lang/Integer;

    iget-object v4, p0, Lco/bird/android/model/PlanItemModel;->planItemDescription:Lco/bird/android/model/PlanItemDescription;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "PlanItemModel(planId="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", currency="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", refillAmount="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", incentiveAmount="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", planItemDescription="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
