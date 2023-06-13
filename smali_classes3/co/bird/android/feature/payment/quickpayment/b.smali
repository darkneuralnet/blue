.class public final Lco/bird/android/feature/payment/quickpayment/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lce4;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lco/bird/android/feature/payment/quickpayment/QuickPaymentActivity$b;

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lde4;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lfe4;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lco/bird/android/feature/payment/quickpayment/QuickPaymentActivity$b;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/feature/payment/quickpayment/QuickPaymentActivity$b;",
            "LY94<",
            "Lde4;",
            ">;",
            "LY94<",
            "Lfe4;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/feature/payment/quickpayment/b;->a:Lco/bird/android/feature/payment/quickpayment/QuickPaymentActivity$b;

    iput-object p2, p0, Lco/bird/android/feature/payment/quickpayment/b;->b:LY94;

    iput-object p3, p0, Lco/bird/android/feature/payment/quickpayment/b;->c:LY94;

    return-void
.end method

.method public static a(Lco/bird/android/feature/payment/quickpayment/QuickPaymentActivity$b;LY94;LY94;)Lco/bird/android/feature/payment/quickpayment/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/feature/payment/quickpayment/QuickPaymentActivity$b;",
            "LY94<",
            "Lde4;",
            ">;",
            "LY94<",
            "Lfe4;",
            ">;)",
            "Lco/bird/android/feature/payment/quickpayment/b;"
        }
    .end annotation

    new-instance v0, Lco/bird/android/feature/payment/quickpayment/b;

    invoke-direct {v0, p0, p1, p2}, Lco/bird/android/feature/payment/quickpayment/b;-><init>(Lco/bird/android/feature/payment/quickpayment/QuickPaymentActivity$b;LY94;LY94;)V

    return-object v0
.end method

.method public static c(Lco/bird/android/feature/payment/quickpayment/QuickPaymentActivity$b;Lde4;Lfe4;)Lce4;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lco/bird/android/feature/payment/quickpayment/QuickPaymentActivity$b;->a(Lde4;Lfe4;)Lce4;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lce4;

    return-object p0
.end method


# virtual methods
.method public b()Lce4;
    .locals 3

    iget-object v0, p0, Lco/bird/android/feature/payment/quickpayment/b;->a:Lco/bird/android/feature/payment/quickpayment/QuickPaymentActivity$b;

    iget-object v1, p0, Lco/bird/android/feature/payment/quickpayment/b;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lde4;

    iget-object v2, p0, Lco/bird/android/feature/payment/quickpayment/b;->c:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lfe4;

    invoke-static {v0, v1, v2}, Lco/bird/android/feature/payment/quickpayment/b;->c(Lco/bird/android/feature/payment/quickpayment/QuickPaymentActivity$b;Lde4;Lfe4;)Lce4;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/feature/payment/quickpayment/b;->b()Lce4;

    move-result-object v0

    return-object v0
.end method
