.class public final Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect$OpenConnectionsFlow;
.super Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "OpenConnectionsFlow"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u000c\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000c\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J)\u0010\u000e\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\u0008R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u0008\u00a8\u0006\u0016"
    }
    d2 = {
        "Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect$OpenConnectionsFlow;",
        "Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect;",
        "publishableKey",
        "",
        "financialConnectionsSessionSecret",
        "stripeAccountId",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V",
        "getFinancialConnectionsSessionSecret",
        "()Ljava/lang/String;",
        "getPublishableKey",
        "getStripeAccountId",
        "component1",
        "component2",
        "component3",
        "copy",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "",
        "toString",
        "payments-core_release"
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
.field public static final $stable:I


# instance fields
.field private final financialConnectionsSessionSecret:Ljava/lang/String;

.field private final publishableKey:Ljava/lang/String;

.field private final stripeAccountId:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "publishableKey"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "financialConnectionsSessionSecret"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect$OpenConnectionsFlow;->publishableKey:Ljava/lang/String;

    iput-object p2, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect$OpenConnectionsFlow;->financialConnectionsSessionSecret:Ljava/lang/String;

    iput-object p3, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect$OpenConnectionsFlow;->stripeAccountId:Ljava/lang/String;

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect$OpenConnectionsFlow;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect$OpenConnectionsFlow;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect$OpenConnectionsFlow;->publishableKey:Ljava/lang/String;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect$OpenConnectionsFlow;->financialConnectionsSessionSecret:Ljava/lang/String;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect$OpenConnectionsFlow;->stripeAccountId:Ljava/lang/String;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect$OpenConnectionsFlow;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect$OpenConnectionsFlow;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect$OpenConnectionsFlow;->publishableKey:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect$OpenConnectionsFlow;->financialConnectionsSessionSecret:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect$OpenConnectionsFlow;->stripeAccountId:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect$OpenConnectionsFlow;
    .locals 1

    const-string v0, "publishableKey"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "financialConnectionsSessionSecret"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect$OpenConnectionsFlow;

    invoke-direct {v0, p1, p2, p3}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect$OpenConnectionsFlow;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect$OpenConnectionsFlow;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect$OpenConnectionsFlow;

    iget-object v1, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect$OpenConnectionsFlow;->publishableKey:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect$OpenConnectionsFlow;->publishableKey:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect$OpenConnectionsFlow;->financialConnectionsSessionSecret:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect$OpenConnectionsFlow;->financialConnectionsSessionSecret:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect$OpenConnectionsFlow;->stripeAccountId:Ljava/lang/String;

    iget-object p1, p1, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect$OpenConnectionsFlow;->stripeAccountId:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getFinancialConnectionsSessionSecret()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect$OpenConnectionsFlow;->financialConnectionsSessionSecret:Ljava/lang/String;

    return-object v0
.end method

.method public final getPublishableKey()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect$OpenConnectionsFlow;->publishableKey:Ljava/lang/String;

    return-object v0
.end method

.method public final getStripeAccountId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect$OpenConnectionsFlow;->stripeAccountId:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect$OpenConnectionsFlow;->publishableKey:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect$OpenConnectionsFlow;->financialConnectionsSessionSecret:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect$OpenConnectionsFlow;->stripeAccountId:Ljava/lang/String;

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
    .locals 5

    iget-object v0, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect$OpenConnectionsFlow;->publishableKey:Ljava/lang/String;

    iget-object v1, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect$OpenConnectionsFlow;->financialConnectionsSessionSecret:Ljava/lang/String;

    iget-object v2, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect$OpenConnectionsFlow;->stripeAccountId:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "OpenConnectionsFlow(publishableKey="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", financialConnectionsSessionSecret="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", stripeAccountId="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
