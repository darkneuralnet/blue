.class public final Lco/bird/api/request/AutoPayBodyPaymentIntent;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0013\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003JA\u0010\u0016\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\u00032\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u0006H\u00d6\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u000eR\u0018\u0010\u0008\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u000e\u00a8\u0006\u001c"
    }
    d2 = {
        "Lco/bird/api/request/AutoPayBodyPaymentIntent;",
        "",
        "autoPayAsked",
        "",
        "autoPayActive",
        "autoPayPlan",
        "",
        "intentId",
        "paymentMethodId",
        "(ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V",
        "getAutoPayActive",
        "()Z",
        "getAutoPayAsked",
        "getAutoPayPlan",
        "()Ljava/lang/String;",
        "getIntentId",
        "getPaymentMethodId",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "copy",
        "equals",
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
.field private final autoPayActive:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "auto_pay_active"
    .end annotation

    .annotation runtime Lft5;
        value = "auto_pay_active"
    .end annotation
.end field

.field private final autoPayAsked:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "auto_pay_asked"
    .end annotation

    .annotation runtime Lft5;
        value = "auto_pay_asked"
    .end annotation
.end field

.field private final autoPayPlan:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "auto_pay_plan"
    .end annotation

    .annotation runtime Lft5;
        value = "auto_pay_plan"
    .end annotation
.end field

.field private final intentId:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "intent_id"
    .end annotation

    .annotation runtime Lft5;
        value = "intent_id"
    .end annotation
.end field

.field private final paymentMethodId:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "payment_method_id"
    .end annotation

    .annotation runtime Lft5;
        value = "payment_method_id"
    .end annotation
.end field


# direct methods
.method public constructor <init>(ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lco/bird/api/request/AutoPayBodyPaymentIntent;->autoPayAsked:Z

    iput-boolean p2, p0, Lco/bird/api/request/AutoPayBodyPaymentIntent;->autoPayActive:Z

    iput-object p3, p0, Lco/bird/api/request/AutoPayBodyPaymentIntent;->autoPayPlan:Ljava/lang/String;

    iput-object p4, p0, Lco/bird/api/request/AutoPayBodyPaymentIntent;->intentId:Ljava/lang/String;

    iput-object p5, p0, Lco/bird/api/request/AutoPayBodyPaymentIntent;->paymentMethodId:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
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

    move v2, p1

    move v3, p2

    invoke-direct/range {v1 .. v6}, Lco/bird/api/request/AutoPayBodyPaymentIntent;-><init>(ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/api/request/AutoPayBodyPaymentIntent;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lco/bird/api/request/AutoPayBodyPaymentIntent;
    .locals 3

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-boolean p1, p0, Lco/bird/api/request/AutoPayBodyPaymentIntent;->autoPayAsked:Z

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-boolean p2, p0, Lco/bird/api/request/AutoPayBodyPaymentIntent;->autoPayActive:Z

    :cond_1
    move p7, p2

    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_2

    iget-object p3, p0, Lco/bird/api/request/AutoPayBodyPaymentIntent;->autoPayPlan:Ljava/lang/String;

    :cond_2
    move-object v0, p3

    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_3

    iget-object p4, p0, Lco/bird/api/request/AutoPayBodyPaymentIntent;->intentId:Ljava/lang/String;

    :cond_3
    move-object v1, p4

    and-int/lit8 p2, p6, 0x10

    if-eqz p2, :cond_4

    iget-object p5, p0, Lco/bird/api/request/AutoPayBodyPaymentIntent;->paymentMethodId:Ljava/lang/String;

    :cond_4
    move-object v2, p5

    move-object p2, p0

    move p3, p1

    move p4, p7

    move-object p5, v0

    move-object p6, v1

    move-object p7, v2

    invoke-virtual/range {p2 .. p7}, Lco/bird/api/request/AutoPayBodyPaymentIntent;->copy(ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lco/bird/api/request/AutoPayBodyPaymentIntent;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/api/request/AutoPayBodyPaymentIntent;->autoPayAsked:Z

    return v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/api/request/AutoPayBodyPaymentIntent;->autoPayActive:Z

    return v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/api/request/AutoPayBodyPaymentIntent;->autoPayPlan:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/api/request/AutoPayBodyPaymentIntent;->intentId:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/api/request/AutoPayBodyPaymentIntent;->paymentMethodId:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lco/bird/api/request/AutoPayBodyPaymentIntent;
    .locals 7

    new-instance v6, Lco/bird/api/request/AutoPayBodyPaymentIntent;

    move-object v0, v6

    move v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v5}, Lco/bird/api/request/AutoPayBodyPaymentIntent;-><init>(ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v6
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/api/request/AutoPayBodyPaymentIntent;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/api/request/AutoPayBodyPaymentIntent;

    iget-boolean v1, p0, Lco/bird/api/request/AutoPayBodyPaymentIntent;->autoPayAsked:Z

    iget-boolean v3, p1, Lco/bird/api/request/AutoPayBodyPaymentIntent;->autoPayAsked:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lco/bird/api/request/AutoPayBodyPaymentIntent;->autoPayActive:Z

    iget-boolean v3, p1, Lco/bird/api/request/AutoPayBodyPaymentIntent;->autoPayActive:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/bird/api/request/AutoPayBodyPaymentIntent;->autoPayPlan:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/api/request/AutoPayBodyPaymentIntent;->autoPayPlan:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lco/bird/api/request/AutoPayBodyPaymentIntent;->intentId:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/api/request/AutoPayBodyPaymentIntent;->intentId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lco/bird/api/request/AutoPayBodyPaymentIntent;->paymentMethodId:Ljava/lang/String;

    iget-object p1, p1, Lco/bird/api/request/AutoPayBodyPaymentIntent;->paymentMethodId:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getAutoPayActive()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/api/request/AutoPayBodyPaymentIntent;->autoPayActive:Z

    return v0
.end method

.method public final getAutoPayAsked()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/api/request/AutoPayBodyPaymentIntent;->autoPayAsked:Z

    return v0
.end method

.method public final getAutoPayPlan()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/api/request/AutoPayBodyPaymentIntent;->autoPayPlan:Ljava/lang/String;

    return-object v0
.end method

.method public final getIntentId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/api/request/AutoPayBodyPaymentIntent;->intentId:Ljava/lang/String;

    return-object v0
.end method

.method public final getPaymentMethodId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/api/request/AutoPayBodyPaymentIntent;->paymentMethodId:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-boolean v0, p0, Lco/bird/api/request/AutoPayBodyPaymentIntent;->autoPayAsked:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    move v0, v1

    :cond_0
    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lco/bird/api/request/AutoPayBodyPaymentIntent;->autoPayActive:Z

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    move v1, v2

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/api/request/AutoPayBodyPaymentIntent;->autoPayPlan:Ljava/lang/String;

    const/4 v2, 0x0

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_1

    :cond_2
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/api/request/AutoPayBodyPaymentIntent;->intentId:Ljava/lang/String;

    if-nez v1, :cond_3

    move v1, v2

    goto :goto_2

    :cond_3
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/api/request/AutoPayBodyPaymentIntent;->paymentMethodId:Ljava/lang/String;

    if-nez v1, :cond_4

    goto :goto_3

    :cond_4
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-boolean v0, p0, Lco/bird/api/request/AutoPayBodyPaymentIntent;->autoPayAsked:Z

    iget-boolean v1, p0, Lco/bird/api/request/AutoPayBodyPaymentIntent;->autoPayActive:Z

    iget-object v2, p0, Lco/bird/api/request/AutoPayBodyPaymentIntent;->autoPayPlan:Ljava/lang/String;

    iget-object v3, p0, Lco/bird/api/request/AutoPayBodyPaymentIntent;->intentId:Ljava/lang/String;

    iget-object v4, p0, Lco/bird/api/request/AutoPayBodyPaymentIntent;->paymentMethodId:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "AutoPayBodyPaymentIntent(autoPayAsked="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", autoPayActive="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", autoPayPlan="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", intentId="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", paymentMethodId="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
