.class public final Lco3$n;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco3;->k0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/NestFlightSheetButton;",
        "Lio/reactivex/K<",
        "+",
        "Lco/bird/android/model/NestFlightSheetButton;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/NestFlightSheetButton;",
        "button",
        "Lio/reactivex/K;",
        "kotlin.jvm.PlatformType",
        "e",
        "(Lco/bird/android/model/NestFlightSheetButton;)Lio/reactivex/K;"
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
        "SMAP\nOperatorNestPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorNestPresenter.kt\nco/bird/android/app/feature/operator/presenter/OperatorNestPresenter$onCreate$14\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,619:1\n1549#2:620\n1620#2,3:621\n*S KotlinDebug\n*F\n+ 1 OperatorNestPresenter.kt\nco/bird/android/app/feature/operator/presenter/OperatorNestPresenter$onCreate$14\n*L\n184#1:620\n184#1:621,3\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Lco3;


# direct methods
.method public constructor <init>(Lco3;)V
    .locals 0

    iput-object p1, p0, Lco3$n;->g:Lco3;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco3$n;->h(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco3$n;->invoke$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic c(Lco3;)V
    .locals 0

    invoke-static {p0}, Lco3$n;->g(Lco3;)V

    return-void
.end method

.method public static synthetic d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 0

    invoke-static {p0, p1}, Lco3$n;->f(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/h;

    return-object p0
.end method

.method public static final g(Lco3;)V
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lco3;->access$getNestFlightSheetRefreshRelay$p(Lco3;)Lma4;

    move-result-object v0

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lma4;->accept(Ljava/lang/Object;)V

    invoke-static {p0}, Lco3;->access$getNestMarkerFetchRelay$p(Lco3;)Lma4;

    move-result-object p0

    invoke-virtual {p0, v1}, Lma4;->accept(Ljava/lang/Object;)V

    return-void
.end method

.method public static final h(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final invoke$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final e(Lco/bird/android/model/NestFlightSheetButton;)Lio/reactivex/K;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/NestFlightSheetButton;",
            ")",
            "Lio/reactivex/K<",
            "+",
            "Lco/bird/android/model/NestFlightSheetButton;",
            ">;"
        }
    .end annotation

    const-string v0, "button"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lco/bird/android/model/UnflagNestButton;

    const-string v1, "fun onCreate() {\n    // \u2026ClaimClicks.connect()\n  }"

    if-eqz v0, :cond_0

    iget-object v0, p0, Lco3$n;->g:Lco3;

    invoke-static {v0}, Lco3;->access$getNestManager$p(Lco3;)Ls43;

    move-result-object v0

    move-object v2, p1

    check-cast v2, Lco/bird/android/model/UnflagNestButton;

    invoke-virtual {v2}, Lco/bird/android/model/UnflagNestButton;->getNestId()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Ls43;->j(Ljava/lang/String;)Lio/reactivex/c;

    move-result-object v0

    invoke-static {p1}, Lio/reactivex/F;->H(Ljava/lang/Object;)Lio/reactivex/F;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/reactivex/c;->m(Lio/reactivex/K;)Lio/reactivex/F;

    move-result-object p1

    new-instance v0, Lco3$n$a;

    iget-object v2, p0, Lco3$n;->g:Lco3;

    invoke-direct {v0, v2}, Lco3$n$a;-><init>(Lco3;)V

    new-instance v2, Ldo3;

    invoke-direct {v2, v0}, Ldo3;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v2}, Lio/reactivex/F;->w(Lio/reactivex/functions/g;)Lio/reactivex/F;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_2

    :cond_0
    instance-of v0, p1, Lco/bird/android/model/FavoriteNestButton;

    if-eqz v0, :cond_3

    move-object v0, p1

    check-cast v0, Lco/bird/android/model/FavoriteNestButton;

    invoke-virtual {v0}, Lco/bird/android/model/FavoriteNestButton;->getAvailableFavoritePartners()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x1

    if-ne v2, v3, :cond_2

    iget-object v2, p0, Lco3$n;->g:Lco3;

    invoke-static {v2}, Lco3;->access$getNestManager$p(Lco3;)Ls43;

    move-result-object v2

    invoke-virtual {v0}, Lco/bird/android/model/FavoriteNestButton;->getNestId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Lco/bird/android/model/FavoriteNestButton;->getAvailableFavoritePartners()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v0, v5}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lco/bird/android/model/persistence/nestedstructures/NestFavoritePartner;

    invoke-virtual {v5}, Lco/bird/android/model/persistence/nestedstructures/NestFavoritePartner;->getPartnerId()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-interface {v2, v3, v4}, Ls43;->i(Ljava/lang/String;Ljava/util/List;)Lio/reactivex/c;

    move-result-object v0

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lco3$n;->g:Lco3;

    invoke-static {v2}, Lco3;->access$getUi$p(Lco3;)Lpo3;

    move-result-object v2

    invoke-virtual {v0}, Lco/bird/android/model/FavoriteNestButton;->getNestId()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v0}, Lpo3;->Qj(Ljava/lang/String;)Lio/reactivex/F;

    move-result-object v0

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v2

    invoke-virtual {v0, v2}, Lio/reactivex/F;->Y(Lio/reactivex/E;)Lio/reactivex/F;

    move-result-object v0

    new-instance v2, Lco3$n$b;

    iget-object v3, p0, Lco3$n;->g:Lco3;

    invoke-direct {v2, v3, p1}, Lco3$n$b;-><init>(Lco3;Lco/bird/android/model/NestFlightSheetButton;)V

    new-instance v3, Leo3;

    invoke-direct {v3, v2}, Leo3;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v3}, Lio/reactivex/F;->B(Lio/reactivex/functions/o;)Lio/reactivex/c;

    move-result-object v0

    iget-object v2, p0, Lco3$n;->g:Lco3;

    new-instance v3, Lfo3;

    invoke-direct {v3, v2}, Lfo3;-><init>(Lco3;)V

    invoke-virtual {v0, v3}, Lio/reactivex/c;->z(Lio/reactivex/functions/a;)Lio/reactivex/c;

    move-result-object v0

    :goto_1
    invoke-static {p1}, Lio/reactivex/F;->H(Ljava/lang/Object;)Lio/reactivex/F;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/reactivex/c;->m(Lio/reactivex/K;)Lio/reactivex/F;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_2

    :cond_3
    instance-of v0, p1, Lco/bird/android/model/RemoveNestFavoriteButton;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lco3$n;->g:Lco3;

    invoke-static {v0}, Lco3;->access$getNestManager$p(Lco3;)Ls43;

    move-result-object v0

    move-object v2, p1

    check-cast v2, Lco/bird/android/model/RemoveNestFavoriteButton;

    invoke-virtual {v2}, Lco/bird/android/model/RemoveNestFavoriteButton;->getNestId()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Ls43;->a(Ljava/lang/String;)Lio/reactivex/c;

    move-result-object v0

    invoke-static {p1}, Lio/reactivex/F;->H(Ljava/lang/Object;)Lio/reactivex/F;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/reactivex/c;->m(Lio/reactivex/K;)Lio/reactivex/F;

    move-result-object p1

    new-instance v0, Lco3$n$c;

    iget-object v2, p0, Lco3$n;->g:Lco3;

    invoke-direct {v0, v2}, Lco3$n$c;-><init>(Lco3;)V

    new-instance v2, Lgo3;

    invoke-direct {v2, v0}, Lgo3;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v2}, Lio/reactivex/F;->w(Lio/reactivex/functions/g;)Lio/reactivex/F;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_2

    :cond_4
    invoke-static {p1}, Lio/reactivex/F;->H(Ljava/lang/Object;)Lio/reactivex/F;

    move-result-object p1

    const-string v0, "just(button)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_2
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/NestFlightSheetButton;

    invoke-virtual {p0, p1}, Lco3$n;->e(Lco/bird/android/model/NestFlightSheetButton;)Lio/reactivex/K;

    move-result-object p1

    return-object p1
.end method
