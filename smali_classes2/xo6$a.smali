.class public final Lxo6$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LLN3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxo6;->e(LG10;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = null
.end annotation


# instance fields
.field public final synthetic a:LG10;


# direct methods
.method public constructor <init>(LG10;)V
    .locals 0

    iput-object p1, p0, Lxo6$a;->a:LG10;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Exception;)V
    .locals 1

    iget-object v0, p0, Lxo6$a;->a:LG10;

    invoke-virtual {v0, p1}, LG10;->ya(Ljava/lang/Exception;)V

    iget-object p1, p0, Lxo6$a;->a:LG10;

    const-string v0, "pay-with-venmo.vault.failed"

    invoke-virtual {p1, v0}, LG10;->Ea(Ljava/lang/String;)V

    return-void
.end method

.method public b(Lcom/braintreepayments/api/models/PaymentMethodNonce;)V
    .locals 1

    iget-object v0, p0, Lxo6$a;->a:LG10;

    invoke-virtual {v0, p1}, LG10;->va(Lcom/braintreepayments/api/models/PaymentMethodNonce;)V

    iget-object p1, p0, Lxo6$a;->a:LG10;

    const-string v0, "pay-with-venmo.vault.success"

    invoke-virtual {p1, v0}, LG10;->Ea(Ljava/lang/String;)V

    return-void
.end method
