.class public final Lks$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lks;->L(LpN3;)Lio/reactivex/c;
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
        "Lio/reactivex/K<",
        "+",
        "Lkotlin/Pair<",
        "+",
        "Lkotlin/Unit;",
        "+",
        "Lco/bird/android/model/PlanItemModel;",
        ">;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0010\u0006\u001a\u009a\u0001\u0012F\u0008\u0001\u0012B\u0012\u000c\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\u000c\u0012\n \u0005*\u0004\u0018\u00010\u00000\u0000 \u0005* \u0012\u000c\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\u000c\u0012\n \u0005*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00030\u0003 \u0005*L\u0012F\u0008\u0001\u0012B\u0012\u000c\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\u000c\u0012\n \u0005*\u0004\u0018\u00010\u00000\u0000 \u0005* \u0012\u000c\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\u000c\u0012\n \u0005*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "Lco/bird/android/model/PlanItemModel;",
        "selectedPlan",
        "Lio/reactivex/K;",
        "Lkotlin/Pair;",
        "",
        "kotlin.jvm.PlatformType",
        "b",
        "(Lco/bird/android/model/PlanItemModel;)Lio/reactivex/K;"
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
        "SMAP\nAutoPayV2Presenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutoPayV2Presenter.kt\nco/bird/android/app/feature/autopay/AutoPayV2PresenterImpl$acceptAutoPay$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,566:1\n1549#2:567\n1620#2,3:568\n*S KotlinDebug\n*F\n+ 1 AutoPayV2Presenter.kt\nco/bird/android/app/feature/autopay/AutoPayV2PresenterImpl$acceptAutoPay$1\n*L\n417#1:567\n417#1:568,3\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Lks;


# direct methods
.method public constructor <init>(Lks;)V
    .locals 0

    iput-object p1, p0, Lks$a;->g:Lks;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/PlanItemModel;
    .locals 0

    invoke-static {p0, p1}, Lks$a;->c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/PlanItemModel;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/PlanItemModel;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lco/bird/android/model/PlanItemModel;

    return-object p0
.end method


# virtual methods
.method public final b(Lco/bird/android/model/PlanItemModel;)Lio/reactivex/K;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/PlanItemModel;",
            ")",
            "Lio/reactivex/K<",
            "+",
            "Lkotlin/Pair<",
            "Lkotlin/Unit;",
            "Lco/bird/android/model/PlanItemModel;",
            ">;>;"
        }
    .end annotation

    const-string v0, "selectedPlan"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lks$a;->g:Lks;

    invoke-static {v0}, Lks;->access$getPreloadAgreements$p(Lks;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    iget-object v1, p0, Lks$a;->g:Lks;

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

    sget-object v1, Lio/reactivex/rxkotlin/g;->a:Lio/reactivex/rxkotlin/g;

    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v2}, Lio/reactivex/c;->j0(Ljava/lang/Object;)Lio/reactivex/F;

    move-result-object v0

    const-string v2, "agreeCompletable.toSingleDefault(Unit)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, Lks$a;->g:Lks;

    invoke-static {v2}, Lks;->access$getUserManager$p(Lks;)Llh6;

    move-result-object v2

    invoke-virtual {p1}, Lco/bird/android/model/PlanItemModel;->getPlanId()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    invoke-interface {v2, v4, v4, v3}, Llh6;->d0(ZZLjava/lang/String;)Lio/reactivex/F;

    move-result-object v2

    new-instance v3, Lks$a$a;

    invoke-direct {v3, p1}, Lks$a$a;-><init>(Lco/bird/android/model/PlanItemModel;)V

    new-instance p1, Ljs;

    invoke-direct {p1, v3}, Ljs;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v2, p1}, Lio/reactivex/F;->I(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object p1

    const-string v2, "selectedPlan ->\n        \u2026    .map { selectedPlan }"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v0, p1}, Lio/reactivex/rxkotlin/g;->a(Lio/reactivex/K;Lio/reactivex/K;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/PlanItemModel;

    invoke-virtual {p0, p1}, Lks$a;->b(Lco/bird/android/model/PlanItemModel;)Lio/reactivex/K;

    move-result-object p1

    return-object p1
.end method
