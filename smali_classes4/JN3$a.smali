.class public final LJN3$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJN3;-><init>(LLL3;LTq4;LiD1;LAM3;LVM3;LRh6;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LJx5<",
        "+",
        "Ljava/lang/Boolean;",
        "+",
        "Ljava/util/Map<",
        "Lco/bird/android/model/constant/PaymentMethod;",
        "+",
        "Lco/bird/android/model/constant/PaymentProvider;",
        ">;+",
        "Ljava/util/Map<",
        "Lco/bird/android/model/constant/PaymentProvider;",
        "+",
        "Ljava/lang/Integer;",
        ">;+",
        "Lco/bird/android/buava/Optional<",
        "Lco/bird/android/model/BirdPayment;",
        ">;+",
        "Lco/bird/android/buava/Optional<",
        "Lco/bird/android/model/BirdPayment;",
        ">;+",
        "Ljava/lang/Boolean;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u000b\u001a\u00020\n2\u00af\u0001\u0010\t\u001a\u00aa\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000c\u0012\n \u0008*\u0004\u0018\u00010\u00010\u0001 \u0008*T\u0012\u0004\u0012\u00020\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000c\u0012\n \u0008*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u000b\u0010\u000c"
    }
    d2 = {
        "LJx5;",
        "",
        "",
        "Lco/bird/android/model/constant/PaymentMethod;",
        "Lco/bird/android/model/constant/PaymentProvider;",
        "",
        "Lco/bird/android/buava/Optional;",
        "Lco/bird/android/model/BirdPayment;",
        "kotlin.jvm.PlatformType",
        "<name for destructuring parameter 0>",
        "",
        "a",
        "(LJx5;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nPaymentMethodManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentMethodManagerImpl.kt\nco/bird/android/manager/payment/PaymentMethodManagerImpl$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,343:1\n1#2:344\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LJN3;


# direct methods
.method public constructor <init>(LJN3;)V
    .locals 0

    iput-object p1, p0, LJN3$a;->g:LJN3;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LJx5;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LJx5<",
            "Ljava/lang/Boolean;",
            "+",
            "Ljava/util/Map<",
            "Lco/bird/android/model/constant/PaymentMethod;",
            "+",
            "Lco/bird/android/model/constant/PaymentProvider;",
            ">;+",
            "Ljava/util/Map<",
            "Lco/bird/android/model/constant/PaymentProvider;",
            "Ljava/lang/Integer;",
            ">;",
            "Lco/bird/android/buava/Optional<",
            "Lco/bird/android/model/BirdPayment;",
            ">;",
            "Lco/bird/android/buava/Optional<",
            "Lco/bird/android/model/BirdPayment;",
            ">;",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1}, LJx5;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {p1}, LJx5;->b()Ljava/lang/Object;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Ljava/util/Map;

    invoke-virtual {p1}, LJx5;->c()Ljava/lang/Object;

    move-result-object v1

    move-object v8, v1

    check-cast v8, Ljava/util/Map;

    invoke-virtual {p1}, LJx5;->d()Ljava/lang/Object;

    move-result-object v1

    move-object v9, v1

    check-cast v9, Lco/bird/android/buava/Optional;

    invoke-virtual {p1}, LJx5;->e()Ljava/lang/Object;

    move-result-object v1

    move-object v10, v1

    check-cast v10, Lco/bird/android/buava/Optional;

    invoke-virtual {p1}, LJx5;->f()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    iget-object v1, p0, LJN3$a;->g:LJN3;

    invoke-virtual {v9}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object p1

    move-object v5, p1

    check-cast v5, Lco/bird/android/model/BirdPayment;

    invoke-virtual {v10}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object p1

    move-object v6, p1

    check-cast v6, Lco/bird/android/model/BirdPayment;

    move-object v2, v7

    move-object v3, v8

    move v4, v0

    invoke-static/range {v1 .. v6}, LJN3;->access$defaultPaymentMethod(LJN3;Ljava/util/Map;Ljava/util/Map;ZLco/bird/android/model/BirdPayment;Lco/bird/android/model/BirdPayment;)Lco/bird/android/model/BirdPayment;

    move-result-object p1

    iget-object v1, p0, LJN3$a;->g:LJN3;

    invoke-virtual {v9}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Lco/bird/android/model/BirdPayment;

    invoke-virtual {v10}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Lco/bird/android/model/BirdPayment;

    move-object v2, v7

    invoke-static/range {v1 .. v6}, LJN3;->access$defaultPaymentProvider(LJN3;Ljava/util/Map;Ljava/util/Map;ZLco/bird/android/model/BirdPayment;Lco/bird/android/model/BirdPayment;)Lco/bird/android/model/constant/PaymentProvider;

    move-result-object v0

    iget-object v1, p0, LJN3$a;->g:LJN3;

    invoke-static {v1}, LJN3;->access$getDefaultPaymentMethodSubject$p(LJN3;)La94;

    move-result-object v1

    if-eqz p1, :cond_0

    sget-object v2, Lco/bird/android/buava/Optional;->c:Lco/bird/android/buava/Optional$a;

    invoke-virtual {v2, p1}, Lco/bird/android/buava/Optional$a;->c(Ljava/lang/Object;)Lco/bird/android/buava/Optional;

    move-result-object v2

    if-nez v2, :cond_1

    :cond_0
    sget-object v2, Lco/bird/android/buava/Optional;->c:Lco/bird/android/buava/Optional$a;

    invoke-virtual {v2}, Lco/bird/android/buava/Optional$a;->a()Lco/bird/android/buava/Optional;

    move-result-object v2

    :cond_1
    invoke-virtual {v1, v2}, La94;->accept(Ljava/lang/Object;)V

    iget-object v1, p0, LJN3$a;->g:LJN3;

    invoke-static {v1}, LJN3;->access$getDefaultPaymentProviderSubject$p(LJN3;)La94;

    move-result-object v1

    sget-object v2, Lco/bird/android/buava/Optional;->c:Lco/bird/android/buava/Optional$a;

    invoke-virtual {v2, v0}, Lco/bird/android/buava/Optional$a;->c(Ljava/lang/Object;)Lco/bird/android/buava/Optional;

    move-result-object v3

    invoke-virtual {v1, v3}, La94;->accept(Ljava/lang/Object;)V

    iget-object v1, p0, LJN3$a;->g:LJN3;

    invoke-static {v1}, LJN3;->access$getDefaultPaymentInfoSubject$p(LJN3;)La94;

    move-result-object v1

    new-instance v3, Lco/bird/android/model/PaymentInfo;

    invoke-direct {v3, p1, v0}, Lco/bird/android/model/PaymentInfo;-><init>(Lco/bird/android/model/BirdPayment;Lco/bird/android/model/constant/PaymentProvider;)V

    invoke-virtual {v2, v3}, Lco/bird/android/buava/Optional$a;->c(Ljava/lang/Object;)Lco/bird/android/buava/Optional;

    move-result-object p1

    invoke-virtual {v1, p1}, La94;->accept(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LJx5;

    invoke-virtual {p0, p1}, LJN3$a;->a(LJx5;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
