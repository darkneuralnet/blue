.class public abstract LPL3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<PaymentMethodDetailsT:",
        "Lcom/adyen/checkout/components/model/payments/request/PaymentMethodDetails;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public final a:Lcom/adyen/checkout/components/model/payments/request/PaymentComponentData;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/adyen/checkout/components/model/payments/request/PaymentComponentData<",
            "TPaymentMethodDetailsT;>;"
        }
    .end annotation
.end field

.field public final b:Z

.field public final c:Z


# direct methods
.method public constructor <init>(Lcom/adyen/checkout/components/model/payments/request/PaymentComponentData;ZZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/adyen/checkout/components/model/payments/request/PaymentComponentData<",
            "TPaymentMethodDetailsT;>;ZZ)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LPL3;->a:Lcom/adyen/checkout/components/model/payments/request/PaymentComponentData;

    iput-boolean p2, p0, LPL3;->b:Z

    iput-boolean p3, p0, LPL3;->c:Z

    return-void
.end method


# virtual methods
.method public a()Lcom/adyen/checkout/components/model/payments/request/PaymentComponentData;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/adyen/checkout/components/model/payments/request/PaymentComponentData<",
            "TPaymentMethodDetailsT;>;"
        }
    .end annotation

    iget-object v0, p0, LPL3;->a:Lcom/adyen/checkout/components/model/payments/request/PaymentComponentData;

    return-object v0
.end method

.method public b()Z
    .locals 1

    iget-boolean v0, p0, LPL3;->b:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, LPL3;->c:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
