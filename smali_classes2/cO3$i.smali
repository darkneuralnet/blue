.class public final LcO3$i;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LcO3;->z(Lco/bird/android/model/BirdPayment;)Lio/reactivex/c;
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
        "updatedPaymentMethods",
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
        "SMAP\nPaymentMethodPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentMethodPresenter.kt\nco/bird/android/app/feature/prepay/PaymentMethodPresenterImpl$removePaymentV3$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,207:1\n1549#2:208\n1620#2,3:209\n*S KotlinDebug\n*F\n+ 1 PaymentMethodPresenter.kt\nco/bird/android/app/feature/prepay/PaymentMethodPresenterImpl$removePaymentV3$1\n*L\n177#1:208\n177#1:209,3\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LcO3;


# direct methods
.method public constructor <init>(LcO3;)V
    .locals 0

    iput-object p1, p0, LcO3$i;->g:LcO3;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/api/response/SavedPaymentMethodResponse;)V
    .locals 4

    iget-object v0, p0, LcO3$i;->g:LcO3;

    invoke-virtual {v0}, LcO3;->r()LlO3;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, LS74$a;->stopProgress$default(LS74;IILjava/lang/Object;)V

    iget-object v0, p0, LcO3$i;->g:LcO3;

    invoke-virtual {v0}, LcO3;->n()La94;

    move-result-object v0

    invoke-virtual {p1}, Lco/bird/api/response/SavedPaymentMethodResponse;->getPaymentMethods()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {p1, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/android/model/constant/PaymentMethodDetails;

    invoke-static {v2}, Lco/bird/android/model/BirdPaymentKt;->toBirdPayment(Lco/bird/android/model/constant/PaymentMethodDetails;)Lco/bird/android/model/BirdPayment;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1}, La94;->accept(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/api/response/SavedPaymentMethodResponse;

    invoke-virtual {p0, p1}, LcO3$i;->a(Lco/bird/api/response/SavedPaymentMethodResponse;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
