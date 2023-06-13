.class public final Lco/bird/api/request/BankRedirectOneTimeRefillRequest;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u000c\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\u0008J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J)\u0010\u0012\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0007H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0019"
    }
    d2 = {
        "Lco/bird/api/request/BankRedirectOneTimeRefillRequest;",
        "",
        "amount",
        "",
        "paymentMethod",
        "Lco/bird/android/model/constant/PaymentMethod;",
        "intentId",
        "",
        "(JLco/bird/android/model/constant/PaymentMethod;Ljava/lang/String;)V",
        "getAmount",
        "()J",
        "getIntentId",
        "()Ljava/lang/String;",
        "getPaymentMethod",
        "()Lco/bird/android/model/constant/PaymentMethod;",
        "component1",
        "component2",
        "component3",
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
.field private final amount:J
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "amount"
    .end annotation

    .annotation runtime Lft5;
        value = "amount"
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

.field private final paymentMethod:Lco/bird/android/model/constant/PaymentMethod;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "payment_method_type"
    .end annotation

    .annotation runtime Lft5;
        value = "payment_method_type"
    .end annotation
.end field


# direct methods
.method public constructor <init>(JLco/bird/android/model/constant/PaymentMethod;Ljava/lang/String;)V
    .locals 1

    const-string v0, "paymentMethod"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lco/bird/api/request/BankRedirectOneTimeRefillRequest;->amount:J

    iput-object p3, p0, Lco/bird/api/request/BankRedirectOneTimeRefillRequest;->paymentMethod:Lco/bird/android/model/constant/PaymentMethod;

    iput-object p4, p0, Lco/bird/api/request/BankRedirectOneTimeRefillRequest;->intentId:Ljava/lang/String;

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/api/request/BankRedirectOneTimeRefillRequest;JLco/bird/android/model/constant/PaymentMethod;Ljava/lang/String;ILjava/lang/Object;)Lco/bird/api/request/BankRedirectOneTimeRefillRequest;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-wide p1, p0, Lco/bird/api/request/BankRedirectOneTimeRefillRequest;->amount:J

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p3, p0, Lco/bird/api/request/BankRedirectOneTimeRefillRequest;->paymentMethod:Lco/bird/android/model/constant/PaymentMethod;

    :cond_1
    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_2

    iget-object p4, p0, Lco/bird/api/request/BankRedirectOneTimeRefillRequest;->intentId:Ljava/lang/String;

    :cond_2
    invoke-virtual {p0, p1, p2, p3, p4}, Lco/bird/api/request/BankRedirectOneTimeRefillRequest;->copy(JLco/bird/android/model/constant/PaymentMethod;Ljava/lang/String;)Lco/bird/api/request/BankRedirectOneTimeRefillRequest;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()J
    .locals 2

    iget-wide v0, p0, Lco/bird/api/request/BankRedirectOneTimeRefillRequest;->amount:J

    return-wide v0
.end method

.method public final component2()Lco/bird/android/model/constant/PaymentMethod;
    .locals 1

    iget-object v0, p0, Lco/bird/api/request/BankRedirectOneTimeRefillRequest;->paymentMethod:Lco/bird/android/model/constant/PaymentMethod;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/api/request/BankRedirectOneTimeRefillRequest;->intentId:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(JLco/bird/android/model/constant/PaymentMethod;Ljava/lang/String;)Lco/bird/api/request/BankRedirectOneTimeRefillRequest;
    .locals 1

    const-string v0, "paymentMethod"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/api/request/BankRedirectOneTimeRefillRequest;

    invoke-direct {v0, p1, p2, p3, p4}, Lco/bird/api/request/BankRedirectOneTimeRefillRequest;-><init>(JLco/bird/android/model/constant/PaymentMethod;Ljava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/api/request/BankRedirectOneTimeRefillRequest;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/api/request/BankRedirectOneTimeRefillRequest;

    iget-wide v3, p0, Lco/bird/api/request/BankRedirectOneTimeRefillRequest;->amount:J

    iget-wide v5, p1, Lco/bird/api/request/BankRedirectOneTimeRefillRequest;->amount:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/api/request/BankRedirectOneTimeRefillRequest;->paymentMethod:Lco/bird/android/model/constant/PaymentMethod;

    iget-object v3, p1, Lco/bird/api/request/BankRedirectOneTimeRefillRequest;->paymentMethod:Lco/bird/android/model/constant/PaymentMethod;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/bird/api/request/BankRedirectOneTimeRefillRequest;->intentId:Ljava/lang/String;

    iget-object p1, p1, Lco/bird/api/request/BankRedirectOneTimeRefillRequest;->intentId:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getAmount()J
    .locals 2

    iget-wide v0, p0, Lco/bird/api/request/BankRedirectOneTimeRefillRequest;->amount:J

    return-wide v0
.end method

.method public final getIntentId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/api/request/BankRedirectOneTimeRefillRequest;->intentId:Ljava/lang/String;

    return-object v0
.end method

.method public final getPaymentMethod()Lco/bird/android/model/constant/PaymentMethod;
    .locals 1

    iget-object v0, p0, Lco/bird/api/request/BankRedirectOneTimeRefillRequest;->paymentMethod:Lco/bird/android/model/constant/PaymentMethod;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-wide v0, p0, Lco/bird/api/request/BankRedirectOneTimeRefillRequest;->amount:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/api/request/BankRedirectOneTimeRefillRequest;->paymentMethod:Lco/bird/android/model/constant/PaymentMethod;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/api/request/BankRedirectOneTimeRefillRequest;->intentId:Ljava/lang/String;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-wide v0, p0, Lco/bird/api/request/BankRedirectOneTimeRefillRequest;->amount:J

    iget-object v2, p0, Lco/bird/api/request/BankRedirectOneTimeRefillRequest;->paymentMethod:Lco/bird/android/model/constant/PaymentMethod;

    iget-object v3, p0, Lco/bird/api/request/BankRedirectOneTimeRefillRequest;->intentId:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "BankRedirectOneTimeRefillRequest(amount="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", paymentMethod="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", intentId="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
