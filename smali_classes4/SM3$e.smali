.class public final LSM3$e;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LSM3;->v(Lcom/stripe/android/model/Token;)Lio/reactivex/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/stripe/android/model/Customer;",
        "Lio/reactivex/h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lcom/stripe/android/model/Customer;",
        "customer",
        "Lio/reactivex/h;",
        "kotlin.jvm.PlatformType",
        "b",
        "(Lcom/stripe/android/model/Customer;)Lio/reactivex/h;"
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
        "SMAP\nPaymentManagerV2Impl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentManagerV2Impl.kt\nco/bird/android/manager/payment/PaymentManagerV2Impl$attachSource$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,373:1\n766#2:374\n857#2,2:375\n1#3:377\n*S KotlinDebug\n*F\n+ 1 PaymentManagerV2Impl.kt\nco/bird/android/manager/payment/PaymentManagerV2Impl$attachSource$1\n*L\n241#1:374\n241#1:375,2\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Lcom/stripe/android/model/Token;

.field public final synthetic h:LSM3;


# direct methods
.method public constructor <init>(Lcom/stripe/android/model/Token;LSM3;)V
    .locals 0

    iput-object p1, p0, LSM3$e;->g:Lcom/stripe/android/model/Token;

    iput-object p2, p0, LSM3$e;->h:LSM3;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lcom/stripe/android/model/Customer;Lcom/stripe/android/model/Token;LSM3;)Lio/reactivex/h;
    .locals 0

    invoke-static {p0, p1, p2}, LSM3$e;->c(Lcom/stripe/android/model/Customer;Lcom/stripe/android/model/Token;LSM3;)Lio/reactivex/h;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lcom/stripe/android/model/Customer;Lcom/stripe/android/model/Token;LSM3;)Lio/reactivex/h;
    .locals 6

    const-string v0, "$customer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$token"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "this$0"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0}, Lcom/stripe/android/model/Customer;->getSources()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lcom/stripe/android/model/CustomerPaymentSource;

    invoke-virtual {v3}, Lcom/stripe/android/model/CustomerPaymentSource;->getTokenizationMethod()Lcom/stripe/android/model/TokenizationMethod;

    move-result-object v4

    sget-object v5, Lcom/stripe/android/model/TokenizationMethod;->GooglePay:Lcom/stripe/android/model/TokenizationMethod;

    if-ne v4, v5, :cond_2

    invoke-virtual {v3}, Lcom/stripe/android/model/CustomerPaymentSource;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/stripe/android/model/Token;->getCard()Lcom/stripe/android/model/Card;

    move-result-object v4

    if-eqz v4, :cond_1

    invoke-virtual {v4}, Lcom/stripe/android/model/Card;->getId()Ljava/lang/String;

    move-result-object v4

    goto :goto_1

    :cond_1
    const/4 v4, 0x0

    :goto_1
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    const/4 v3, 0x1

    goto :goto_2

    :cond_2
    const/4 v3, 0x0

    :goto_2
    if-eqz v3, :cond_0

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_4
    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/model/CustomerPaymentSource;

    invoke-virtual {p1}, Lcom/stripe/android/model/CustomerPaymentSource;->getId()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-virtual {p2, p1}, LSM3;->j0(Ljava/lang/String;)Lio/reactivex/c;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/c;->Q()Lio/reactivex/c;

    move-result-object p1

    const-string v1, "detachSource(it).onErrorComplete()"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_5
    invoke-static {v0}, Lio/reactivex/c;->r(Ljava/lang/Iterable;)Lio/reactivex/c;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final b(Lcom/stripe/android/model/Customer;)Lio/reactivex/h;
    .locals 3

    const-string v0, "customer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LSM3$e;->g:Lcom/stripe/android/model/Token;

    iget-object v1, p0, LSM3$e;->h:LSM3;

    new-instance v2, LUM3;

    invoke-direct {v2, p1, v0, v1}, LUM3;-><init>(Lcom/stripe/android/model/Customer;Lcom/stripe/android/model/Token;LSM3;)V

    invoke-static {v2}, Lio/reactivex/c;->t(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/stripe/android/model/Customer;

    invoke-virtual {p0, p1}, LSM3$e;->b(Lcom/stripe/android/model/Customer;)Lio/reactivex/h;

    move-result-object p1

    return-object p1
.end method
