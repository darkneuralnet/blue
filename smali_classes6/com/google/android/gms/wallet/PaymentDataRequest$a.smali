.class public final Lcom/google/android/gms/wallet/PaymentDataRequest$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/wallet/PaymentDataRequest;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field public final synthetic a:Lcom/google/android/gms/wallet/PaymentDataRequest;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/wallet/PaymentDataRequest;LHg7;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/wallet/PaymentDataRequest$a;->a:Lcom/google/android/gms/wallet/PaymentDataRequest;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/google/android/gms/wallet/PaymentDataRequest;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/wallet/PaymentDataRequest$a;->a:Lcom/google/android/gms/wallet/PaymentDataRequest;

    iget-object v1, v0, Lcom/google/android/gms/wallet/PaymentDataRequest;->k:Ljava/lang/String;

    if-nez v1, :cond_0

    iget-object v1, v0, Lcom/google/android/gms/wallet/PaymentDataRequest;->l:[B

    if-nez v1, :cond_0

    iget-object v0, v0, Lcom/google/android/gms/wallet/PaymentDataRequest;->g:Ljava/util/ArrayList;

    const-string v1, "Allowed payment methods must be set! You can set it through addAllowedPaymentMethod() or addAllowedPaymentMethods() in the PaymentDataRequest Builder."

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/wallet/PaymentDataRequest$a;->a:Lcom/google/android/gms/wallet/PaymentDataRequest;

    iget-object v0, v0, Lcom/google/android/gms/wallet/PaymentDataRequest;->d:Lcom/google/android/gms/wallet/CardRequirements;

    const-string v1, "Card requirements must be set!"

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/wallet/PaymentDataRequest$a;->a:Lcom/google/android/gms/wallet/PaymentDataRequest;

    iget-object v1, v0, Lcom/google/android/gms/wallet/PaymentDataRequest;->h:Lcom/google/android/gms/wallet/PaymentMethodTokenizationParameters;

    if-eqz v1, :cond_0

    iget-object v0, v0, Lcom/google/android/gms/wallet/PaymentDataRequest;->i:Lcom/google/android/gms/wallet/TransactionInfo;

    const-string v1, "Transaction info must be set if paymentMethodTokenizationParameters is set!"

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/wallet/PaymentDataRequest$a;->a:Lcom/google/android/gms/wallet/PaymentDataRequest;

    return-object v0
.end method
