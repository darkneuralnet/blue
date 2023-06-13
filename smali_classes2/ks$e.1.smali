.class public final Lks$e;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lks;->Q()Lio/reactivex/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/PlanItemModel;",
        "Lio/reactivex/h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/PlanItemModel;",
        "selectedPlan",
        "Lio/reactivex/h;",
        "kotlin.jvm.PlatformType",
        "b",
        "(Lco/bird/android/model/PlanItemModel;)Lio/reactivex/h;"
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
        "SMAP\nAutoPayV2Presenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutoPayV2Presenter.kt\nco/bird/android/app/feature/autopay/AutoPayV2PresenterImpl$acceptAutoPayForPaymentIntent$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,566:1\n1549#2:567\n1620#2,3:568\n*S KotlinDebug\n*F\n+ 1 AutoPayV2Presenter.kt\nco/bird/android/app/feature/autopay/AutoPayV2PresenterImpl$acceptAutoPayForPaymentIntent$1\n*L\n462#1:567\n462#1:568,3\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Lks;


# direct methods
.method public constructor <init>(Lks;)V
    .locals 0

    iput-object p1, p0, Lks$e;->g:Lks;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lks;Lco/bird/android/model/PlanItemModel;)Lio/reactivex/h;
    .locals 0

    invoke-static {p0, p1}, Lks$e;->c(Lks;Lco/bird/android/model/PlanItemModel;)Lio/reactivex/h;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lks;Lco/bird/android/model/PlanItemModel;)Lio/reactivex/h;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$selectedPlan"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lks;->access$getPaymentIntentDelegate$p(Lks;)Lmr;

    move-result-object p0

    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-interface {p0, p1}, Lmr;->a(Lco/bird/android/model/PlanItemModel;)Lio/reactivex/c;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final b(Lco/bird/android/model/PlanItemModel;)Lio/reactivex/h;
    .locals 5

    const-string v0, "selectedPlan"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lks$e;->g:Lks;

    invoke-static {v0}, Lks;->access$getPreloadAgreements$p(Lks;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    iget-object v1, p0, Lks$e;->g:Lks;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v0, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lco/bird/android/model/Agreement;

    invoke-static {v1}, Lks;->access$getUserAgreementManager$p(Lks;)Llg6;

    move-result-object v4

    invoke-virtual {v3}, Lco/bird/android/model/Agreement;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v4, v3}, Llg6;->h(Ljava/lang/String;)Lio/reactivex/p;

    move-result-object v3

    invoke-virtual {v3}, Lio/reactivex/p;->F()Lio/reactivex/c;

    move-result-object v3

    invoke-virtual {v3}, Lio/reactivex/c;->Q()Lio/reactivex/c;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {v2}, Lio/reactivex/c;->L(Ljava/lang/Iterable;)Lio/reactivex/c;

    move-result-object v0

    const-string v1, "merge(\n          preload\u2026rorComplete() }\n        )"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lks$e;->g:Lks;

    new-instance v2, Lls;

    invoke-direct {v2, v1, p1}, Lls;-><init>(Lks;Lco/bird/android/model/PlanItemModel;)V

    invoke-static {v2}, Lio/reactivex/c;->t(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/reactivex/c;->i(Lio/reactivex/h;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/PlanItemModel;

    invoke-virtual {p0, p1}, Lks$e;->b(Lco/bird/android/model/PlanItemModel;)Lio/reactivex/h;

    move-result-object p1

    return-object p1
.end method
