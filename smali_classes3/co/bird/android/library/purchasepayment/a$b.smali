.class public final Lco/bird/android/library/purchasepayment/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/bird/android/library/purchasepayment/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/library/purchasepayment/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:LlG2;

.field public final b:Lco/bird/android/model/PaymentAddSource;

.field public final c:Lco/bird/android/library/purchasepayment/a$b;


# direct methods
.method public constructor <init>(LlG2;Landroid/app/Activity;Lco/bird/android/model/PaymentAddSource;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, Lco/bird/android/library/purchasepayment/a$b;->c:Lco/bird/android/library/purchasepayment/a$b;

    iput-object p1, p0, Lco/bird/android/library/purchasepayment/a$b;->a:LlG2;

    iput-object p3, p0, Lco/bird/android/library/purchasepayment/a$b;->b:Lco/bird/android/model/PaymentAddSource;

    return-void
.end method

.method public synthetic constructor <init>(LlG2;Landroid/app/Activity;Lco/bird/android/model/PaymentAddSource;LoO0;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lco/bird/android/library/purchasepayment/a$b;-><init>(LlG2;Landroid/app/Activity;Lco/bird/android/model/PaymentAddSource;)V

    return-void
.end method


# virtual methods
.method public a(Lco/bird/android/library/purchasepayment/PurchasePaymentActivity;)V
    .locals 0

    invoke-virtual {p0, p1}, Lco/bird/android/library/purchasepayment/a$b;->b(Lco/bird/android/library/purchasepayment/PurchasePaymentActivity;)Lco/bird/android/library/purchasepayment/PurchasePaymentActivity;

    return-void
.end method

.method public final b(Lco/bird/android/library/purchasepayment/PurchasePaymentActivity;)Lco/bird/android/library/purchasepayment/PurchasePaymentActivity;
    .locals 1

    iget-object v0, p0, Lco/bird/android/library/purchasepayment/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->w2()Le13;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le13;

    invoke-static {p1, v0}, LKy;->b(Lco/bird/android/core/mrp/BaseActivityLite;Le13;)V

    iget-object v0, p0, Lco/bird/android/library/purchasepayment/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->r()Lgl;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgl;

    invoke-static {p1, v0}, LKy;->c(Lco/bird/android/core/mrp/BaseActivityLite;Lgl;)V

    iget-object v0, p0, Lco/bird/android/library/purchasepayment/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->B1()LTq4;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LTq4;

    invoke-static {p1, v0}, LKy;->d(Lco/bird/android/core/mrp/BaseActivityLite;LTq4;)V

    invoke-virtual {p0}, Lco/bird/android/library/purchasepayment/a$b;->c()LEa4;

    move-result-object v0

    invoke-static {p1, v0}, Lsa4;->b(Lco/bird/android/library/purchasepayment/PurchasePaymentActivity;LEa4;)V

    return-object p1
.end method

.method public final c()LEa4;
    .locals 9

    new-instance v8, LEa4;

    iget-object v0, p0, Lco/bird/android/library/purchasepayment/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->t()LAM3;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, LAM3;

    iget-object v0, p0, Lco/bird/android/library/purchasepayment/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->W2()LiD1;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, LiD1;

    iget-object v0, p0, Lco/bird/android/library/purchasepayment/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->d0()LEa;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, LEa;

    iget-object v0, p0, Lco/bird/android/library/purchasepayment/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->B1()LTq4;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, LTq4;

    iget-object v0, p0, Lco/bird/android/library/purchasepayment/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->k1()LRh6;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, LRh6;

    iget-object v0, p0, Lco/bird/android/library/purchasepayment/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->w2()Le13;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Le13;

    iget-object v7, p0, Lco/bird/android/library/purchasepayment/a$b;->b:Lco/bird/android/model/PaymentAddSource;

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, LEa4;-><init>(LAM3;LiD1;LEa;LTq4;LRh6;Le13;Lco/bird/android/model/PaymentAddSource;)V

    return-object v8
.end method
