.class public LG10$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgd4;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LG10;->va(Lcom/braintreepayments/api/models/PaymentMethodNonce;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/braintreepayments/api/models/PaymentMethodNonce;

.field public final synthetic b:LG10;


# direct methods
.method public constructor <init>(LG10;Lcom/braintreepayments/api/models/PaymentMethodNonce;)V
    .locals 0

    iput-object p1, p0, LG10$h;->b:LG10;

    iput-object p2, p0, LG10$h;->a:Lcom/braintreepayments/api/models/PaymentMethodNonce;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    iget-object v0, p0, LG10$h;->b:LG10;

    invoke-static {v0}, LG10;->E9(LG10;)LMN3;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public run()V
    .locals 2

    iget-object v0, p0, LG10$h;->b:LG10;

    invoke-static {v0}, LG10;->E9(LG10;)LMN3;

    move-result-object v0

    iget-object v1, p0, LG10$h;->a:Lcom/braintreepayments/api/models/PaymentMethodNonce;

    invoke-interface {v0, v1}, LMN3;->i(Lcom/braintreepayments/api/models/PaymentMethodNonce;)V

    return-void
.end method
