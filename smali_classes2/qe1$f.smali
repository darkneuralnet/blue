.class public final Lqe1$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfe3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lqe1;->ck(Lcom/adyen/checkout/card/CardConfiguration;Lcom/adyen/checkout/components/model/paymentmethods/PaymentMethod;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lfe3<",
        "LCf0;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"
    }
    d2 = {
        "LCf0;",
        "kotlin.jvm.PlatformType",
        "event",
        "",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic b:Lqe1;


# direct methods
.method public constructor <init>(Lqe1;)V
    .locals 0

    iput-object p1, p0, Lqe1$f;->b:Lqe1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LCf0;)V
    .locals 1

    iget-object v0, p0, Lqe1$f;->b:Lqe1;

    invoke-static {v0}, Lqe1;->access$getAdyenCardComponentRelay$p(Lqe1;)LAG;

    move-result-object v0

    invoke-virtual {v0, p1}, LAG;->accept(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic onChanged(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LCf0;

    invoke-virtual {p0, p1}, Lqe1$f;->a(LCf0;)V

    return-void
.end method
