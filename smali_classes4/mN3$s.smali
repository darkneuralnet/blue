.class public final LmN3$s;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LmN3;->s0(Lio/reactivex/F;)Lio/reactivex/F;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/api/response/SavedPaymentMethodResponse;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/api/response/SavedPaymentMethodResponse;",
        "kotlin.jvm.PlatformType",
        "paymentResponse",
        "",
        "a",
        "(Lco/bird/api/response/SavedPaymentMethodResponse;)V"
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
        "SMAP\nPaymentManagerV3Impl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentManagerV3Impl.kt\nco/bird/android/manager/payment/PaymentManagerV3Impl$updateSavedPayments$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,582:1\n1549#2:583\n1620#2,3:584\n288#2,2:587\n*S KotlinDebug\n*F\n+ 1 PaymentManagerV3Impl.kt\nco/bird/android/manager/payment/PaymentManagerV3Impl$updateSavedPayments$1\n*L\n520#1:583\n520#1:584,3\n521#1:587,2\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LmN3;


# direct methods
.method public constructor <init>(LmN3;)V
    .locals 0

    iput-object p1, p0, LmN3$s;->g:LmN3;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/api/response/SavedPaymentMethodResponse;)V
    .locals 5

    iget-object v0, p0, LmN3$s;->g:LmN3;

    invoke-static {v0}, LmN3;->access$getMutableSavedBirdPayments$p(LmN3;)La94;

    move-result-object v0

    sget-object v1, Lco/bird/android/buava/Optional;->c:Lco/bird/android/buava/Optional$a;

    invoke-virtual {p1}, Lco/bird/api/response/SavedPaymentMethodResponse;->getPaymentMethods()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v2, v4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lco/bird/android/model/constant/PaymentMethodDetails;

    invoke-static {v4}, Lco/bird/android/model/BirdPaymentKt;->toBirdPayment(Lco/bird/android/model/constant/PaymentMethodDetails;)Lco/bird/android/model/BirdPayment;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {v1, v3}, Lco/bird/android/buava/Optional$a;->b(Ljava/lang/Object;)Lco/bird/android/buava/Optional;

    move-result-object v1

    invoke-virtual {v0, v1}, La94;->accept(Ljava/lang/Object;)V

    iget-object v0, p0, LmN3$s;->g:LmN3;

    invoke-static {v0}, LmN3;->access$getMutableDefaultBirdPayment$p(LmN3;)La94;

    move-result-object v0

    sget-object v1, Lco/bird/android/buava/Optional;->c:Lco/bird/android/buava/Optional$a;

    invoke-virtual {p1}, Lco/bird/api/response/SavedPaymentMethodResponse;->getPaymentMethods()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Lco/bird/android/model/constant/PaymentMethodDetails;

    invoke-virtual {v4}, Lco/bird/android/model/constant/PaymentMethodDetails;->getDefault()Z

    move-result v4

    if-eqz v4, :cond_1

    goto :goto_1

    :cond_2
    move-object v2, v3

    :goto_1
    check-cast v2, Lco/bird/android/model/constant/PaymentMethodDetails;

    if-eqz v2, :cond_3

    invoke-static {v2}, Lco/bird/android/model/BirdPaymentKt;->toBirdPayment(Lco/bird/android/model/constant/PaymentMethodDetails;)Lco/bird/android/model/BirdPayment;

    move-result-object v3

    :cond_3
    invoke-virtual {v1, v3}, Lco/bird/android/buava/Optional$a;->b(Ljava/lang/Object;)Lco/bird/android/buava/Optional;

    move-result-object p1

    invoke-virtual {v0, p1}, La94;->accept(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/api/response/SavedPaymentMethodResponse;

    invoke-virtual {p0, p1}, LmN3$s;->a(Lco/bird/api/response/SavedPaymentMethodResponse;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
