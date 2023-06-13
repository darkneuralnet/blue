.class public abstract LQL3;
.super LOr6;
.source "SourceFile"

# interfaces
.implements LNL3;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<ConfigurationT:",
        "Lcom/adyen/checkout/components/base/Configuration;",
        "ComponentStateT:",
        "LPL3<",
        "+",
        "Lcom/adyen/checkout/components/model/payments/request/PaymentMethodDetails;",
        ">;>",
        "LOr6;",
        "LNL3<",
        "TComponentStateT;TConfigurationT;>;"
    }
.end annotation


# instance fields
.field public final a:LsN3;

.field public final b:Lcom/adyen/checkout/components/base/Configuration;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TConfigurationT;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LsN3;Lcom/adyen/checkout/components/base/Configuration;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LsN3;",
            "TConfigurationT;)V"
        }
    .end annotation

    invoke-direct {p0}, LOr6;-><init>()V

    iput-object p1, p0, LQL3;->a:LsN3;

    iput-object p2, p0, LQL3;->b:Lcom/adyen/checkout/components/base/Configuration;

    return-void
.end method


# virtual methods
.method public d()Lcom/adyen/checkout/components/base/Configuration;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TConfigurationT;"
        }
    .end annotation

    iget-object v0, p0, LQL3;->b:Lcom/adyen/checkout/components/base/Configuration;

    return-object v0
.end method
