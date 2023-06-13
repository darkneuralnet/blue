.class public final LBj3$d;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LBj3;->y()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lwb4<",
        "+",
        "Lco/bird/android/buava/Optional<",
        "Lco/bird/android/model/persistence/Area;",
        ">;+",
        "Ljava/lang/Boolean;",
        "+",
        "Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet$a;",
        "+",
        "Ljava/lang/Boolean;",
        ">;",
        "Lio/reactivex/h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0008\u001a\n \u0004*\u0004\u0018\u00010\u00070\u00072<\u0010\u0006\u001a8\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u000c\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0012\u000c\u0012\n \u0004*\u0004\u0018\u00010\u00050\u0005\u0012\u000c\u0012\n \u0004*\u0004\u0018\u00010\u00030\u00030\u0000H\n\u00a2\u0006\u0004\u0008\u0008\u0010\t"
    }
    d2 = {
        "Lwb4;",
        "Lco/bird/android/buava/Optional;",
        "Lco/bird/android/model/persistence/Area;",
        "",
        "kotlin.jvm.PlatformType",
        "Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet$a;",
        "<name for destructuring parameter 0>",
        "Lio/reactivex/h;",
        "c",
        "(Lwb4;)Lio/reactivex/h;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LBj3;

.field public final synthetic h:LSm;


# direct methods
.method public constructor <init>(LBj3;LSm;)V
    .locals 0

    iput-object p1, p0, LBj3$d;->g:LBj3;

    iput-object p2, p0, LBj3$d;->h:LSm;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LBj3$d;->d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LBj3$d;->invoke$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
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
.method public final c(Lwb4;)Lio/reactivex/h;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwb4<",
            "Lco/bird/android/buava/Optional<",
            "Lco/bird/android/model/persistence/Area;",
            ">;",
            "Ljava/lang/Boolean;",
            "+",
            "Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet$a;",
            "Ljava/lang/Boolean;",
            ">;)",
            "Lio/reactivex/h;"
        }
    .end annotation

    const-string v0, "<name for destructuring parameter 0>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lwb4;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/buava/Optional;

    invoke-virtual {p1}, Lwb4;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Lwb4;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet$a;

    invoke-virtual {p1}, Lwb4;->d()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {v0}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lco/bird/android/model/persistence/Area;

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Lco/bird/android/model/persistence/Area;->isDemandArea()Z

    move-result v3

    const/4 v5, 0x1

    if-ne v3, v5, :cond_0

    move v4, v5

    :cond_0
    if-eqz v4, :cond_1

    iget-object v3, p0, LBj3$d;->g:LBj3;

    invoke-static {v3}, LBj3;->access$getReactiveConfig$p(LBj3;)LTq4;

    move-result-object v3

    invoke-virtual {v3}, LTq4;->f8()LZ84;

    move-result-object v3

    invoke-virtual {v3}, LZ84;->a()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v3}, Lco/bird/android/model/wire/configs/Config;->getOperatorConfig()Lco/bird/android/model/wire/configs/OperatorConfig;

    move-result-object v3

    invoke-virtual {v3}, Lco/bird/android/model/wire/configs/OperatorConfig;->getFeatures()Lco/bird/android/model/wire/configs/OperatorFeatureConfig;

    move-result-object v3

    invoke-virtual {v3}, Lco/bird/android/model/wire/configs/OperatorFeatureConfig;->getMap()Lco/bird/android/model/wire/configs/OperatorMapConfig;

    move-result-object v3

    invoke-virtual {v3}, Lco/bird/android/model/wire/configs/OperatorMapConfig;->getDemandCellsTappable()Z

    move-result v3

    if-eqz v3, :cond_1

    iget-object p1, p0, LBj3$d;->g:LBj3;

    invoke-static {p1}, LBj3;->access$getOperatorManager$p(LBj3;)Lom3;

    move-result-object p1

    invoke-interface {p1}, Lom3;->O0()Lio/reactivex/F;

    move-result-object p1

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/F;->N(Lio/reactivex/E;)Lio/reactivex/F;

    move-result-object p1

    new-instance v0, LBj3$d$a;

    iget-object v1, p0, LBj3$d;->g:LBj3;

    iget-object v2, p0, LBj3$d;->h:LSm;

    invoke-direct {v0, v1, v2}, LBj3$d$a;-><init>(LBj3;LSm;)V

    new-instance v1, LCj3;

    invoke-direct {v1, v0}, LCj3;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/F;->w(Lio/reactivex/functions/g;)Lio/reactivex/F;

    move-result-object p1

    sget-object v0, LBj3$d$b;->g:LBj3$d$b;

    new-instance v1, LDj3;

    invoke-direct {v1, v0}, LDj3;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/F;->t(Lio/reactivex/functions/g;)Lio/reactivex/F;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/F;->G()Lio/reactivex/c;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/c;->Q()Lio/reactivex/c;

    move-result-object p1

    goto/16 :goto_2

    :cond_1
    invoke-virtual {v0}, Lco/bird/android/buava/Optional;->c()Z

    move-result v3

    const-string v4, "showRefreshUi"

    if-eqz v3, :cond_4

    iget-object p1, p0, LBj3$d;->g:LBj3;

    invoke-static {p1}, LBj3;->access$getUi$p(LBj3;)LCw3;

    move-result-object p1

    invoke-virtual {v0}, Lco/bird/android/buava/Optional;->b()Ljava/lang/Object;

    move-result-object v0

    iget-object v2, p0, LBj3$d;->h:LSm;

    check-cast v0, Lco/bird/android/model/persistence/Area;

    invoke-virtual {v0}, Lco/bird/android/model/persistence/Area;->getFeeModified()Ljava/lang/Boolean;

    move-result-object v3

    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {v2, v0}, LSm;->e(Lco/bird/android/model/persistence/Area;)LRm;

    move-result-object v0

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, Lco/bird/android/model/persistence/Area;->getOverlayIcon()Lco/bird/android/model/constant/AreaIconType;

    move-result-object v3

    sget-object v5, Lco/bird/android/model/constant/AreaIconType;->REBALANCE:Lco/bird/android/model/constant/AreaIconType;

    if-ne v3, v5, :cond_3

    invoke-virtual {v2, v0}, LSm;->d(Lco/bird/android/model/persistence/Area;)LRm;

    move-result-object v0

    goto :goto_0

    :cond_3
    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {v2, v0, v1}, LSm;->b(Lco/bird/android/model/persistence/Area;Z)LRm;

    move-result-object v0

    :goto_0
    invoke-interface {p1, v0}, LCw3;->n4(LRm;)V

    invoke-static {}, Lio/reactivex/c;->p()Lio/reactivex/c;

    move-result-object p1

    goto :goto_2

    :cond_4
    sget-object v0, Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet$a;->b:Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet$a;

    if-ne v2, v0, :cond_6

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_6

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_5

    iget-object p1, p0, LBj3$d;->g:LBj3;

    invoke-static {p1}, LBj3;->access$getAreaManager$p(LBj3;)Lbn;

    move-result-object p1

    invoke-interface {p1}, Lbn;->R()Z

    move-result p1

    if-eqz p1, :cond_5

    iget-object p1, p0, LBj3$d;->g:LBj3;

    invoke-static {p1}, LBj3;->access$getUi$p(LBj3;)LCw3;

    move-result-object p1

    iget-object v0, p0, LBj3$d;->h:LSm;

    invoke-virtual {v0}, LSm;->a()LRm;

    move-result-object v0

    invoke-interface {p1, v0}, LCw3;->n4(LRm;)V

    goto :goto_1

    :cond_5
    iget-object p1, p0, LBj3$d;->g:LBj3;

    invoke-static {p1}, LBj3;->access$getUi$p(LBj3;)LCw3;

    move-result-object p1

    invoke-interface {p1}, LJj3;->U2()V

    :goto_1
    invoke-static {}, Lio/reactivex/c;->p()Lio/reactivex/c;

    move-result-object p1

    goto :goto_2

    :cond_6
    invoke-static {}, Lio/reactivex/c;->p()Lio/reactivex/c;

    move-result-object p1

    :goto_2
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lwb4;

    invoke-virtual {p0, p1}, LBj3$d;->c(Lwb4;)Lio/reactivex/h;

    move-result-object p1

    return-object p1
.end method
