.class public final LT6$f;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LT6;->l()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/Unit;",
        "Lio/reactivex/u<",
        "+",
        "Ljava/util/Map<",
        "Lco/bird/android/model/constant/PaymentInfoParams;",
        "+",
        "Ljava/lang/String;",
        ">;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u0010\u0007\u001ab\u0012*\u0008\u0001\u0012&\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005 \u0006*\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00030\u0003 \u0006*0\u0012*\u0008\u0001\u0012&\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005 \u0006*\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0007\u0010\u0008"
    }
    d2 = {
        "",
        "it",
        "Lio/reactivex/u;",
        "",
        "Lco/bird/android/model/constant/PaymentInfoParams;",
        "",
        "kotlin.jvm.PlatformType",
        "c",
        "(Lkotlin/Unit;)Lio/reactivex/u;"
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
        "SMAP\nAddBalancePresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddBalancePresenter.kt\nco/bird/android/feature/payment/bankredirect/AddBalancePresenter$onResume$5\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,170:1\n1549#2:171\n1620#2,3:172\n*S KotlinDebug\n*F\n+ 1 AddBalancePresenter.kt\nco/bird/android/feature/payment/bankredirect/AddBalancePresenter$onResume$5\n*L\n100#1:171\n100#1:172,3\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LT6;


# direct methods
.method public constructor <init>(LT6;)V
    .locals 0

    iput-object p1, p0, LT6$f;->g:LT6;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(LT6;)V
    .locals 0

    invoke-static {p0}, LT6$f;->d(LT6;)V

    return-void
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/util/Map;
    .locals 0

    invoke-static {p0, p1}, LT6$f;->e(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public static final d(LT6;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LT6;->access$getUi$p(LT6;)LX6;

    move-result-object p0

    const/4 v0, 0x1

    invoke-interface {p0, v0}, LX6;->jd(Z)V

    return-void
.end method

.method public static final e(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/util/Map;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/Map;

    return-object p0
.end method


# virtual methods
.method public final c(Lkotlin/Unit;)Lio/reactivex/u;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Unit;",
            ")",
            "Lio/reactivex/u<",
            "+",
            "Ljava/util/Map<",
            "Lco/bird/android/model/constant/PaymentInfoParams;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, LT6$f;->g:LT6;

    invoke-static {p1}, LT6;->access$getPaymentManagerV3$p(LT6;)LVM3;

    move-result-object p1

    iget-object v0, p0, LT6$f;->g:LT6;

    invoke-static {v0}, LT6;->access$getPaymentMethod$p(LT6;)Lco/bird/android/model/constant/PaymentMethod;

    move-result-object v0

    invoke-interface {p1, v0}, LVM3;->d(Lco/bird/android/model/constant/PaymentMethod;)Ljava/util/List;

    move-result-object p1

    sget-object v0, Lco/bird/android/model/constant/PaymentInfoParams;->BANK_NAME:Lco/bird/android/model/constant/PaymentInfoParams;

    invoke-interface {p1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, LT6$f;->g:LT6;

    invoke-static {p1}, LT6;->access$getPaymentManagerV3$p(LT6;)LVM3;

    move-result-object p1

    iget-object v0, p0, LT6$f;->g:LT6;

    invoke-static {v0}, LT6;->access$getPaymentMethod$p(LT6;)Lco/bird/android/model/constant/PaymentMethod;

    move-result-object v0

    invoke-interface {p1, v0}, LVM3;->n(Lco/bird/android/model/constant/PaymentMethod;)Ljava/util/List;

    move-result-object p1

    iget-object v0, p0, LT6$f;->g:LT6;

    invoke-static {v0}, LT6;->access$getUi$p(LT6;)LX6;

    move-result-object v0

    move-object v1, p1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v1, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lco/bird/android/model/constant/PaymentInfoBank;

    invoke-virtual {v3}, Lco/bird/android/model/constant/PaymentInfoBank;->getDisplayName()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-interface {v0, v2}, LX6;->v4(Ljava/util/List;)Lio/reactivex/p;

    move-result-object v0

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/p;->I(Lio/reactivex/E;)Lio/reactivex/p;

    move-result-object v0

    iget-object v1, p0, LT6$f;->g:LT6;

    new-instance v2, LU6;

    invoke-direct {v2, v1}, LU6;-><init>(LT6;)V

    invoke-virtual {v0, v2}, Lio/reactivex/p;->n(Lio/reactivex/functions/a;)Lio/reactivex/p;

    move-result-object v0

    new-instance v1, LT6$f$a;

    invoke-direct {v1, p1}, LT6$f$a;-><init>(Ljava/util/List;)V

    new-instance p1, LV6;

    invoke-direct {p1, v1}, LV6;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, p1}, Lio/reactivex/p;->H(Lio/reactivex/functions/o;)Lio/reactivex/p;

    move-result-object p1

    goto :goto_1

    :cond_1
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object p1

    invoke-static {p1}, Lio/reactivex/p;->G(Ljava/lang/Object;)Lio/reactivex/p;

    move-result-object p1

    :goto_1
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Unit;

    invoke-virtual {p0, p1}, LT6$f;->c(Lkotlin/Unit;)Lio/reactivex/u;

    move-result-object p1

    return-object p1
.end method
