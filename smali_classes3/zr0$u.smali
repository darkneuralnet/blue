.class public final Lzr0$u;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzr0;->V(LXr0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/Pair<",
        "+",
        "Ljava/lang/String;",
        "+",
        "Lco/bird/android/model/persistence/ComplaintResolution;",
        ">;",
        "Lio/reactivex/K<",
        "+",
        "Lkotlin/Pair<",
        "+",
        "Lco/bird/android/model/persistence/ComplaintResolutionForm;",
        "+",
        "Lco/bird/android/model/persistence/ComplaintResolution;",
        ">;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0007\u001a\u009a\u0001\u0012F\u0008\u0001\u0012B\u0012\u000c\u0012\n \u0003*\u0004\u0018\u00010\u00060\u0006\u0012\u000c\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003* \u0012\u000c\u0012\n \u0003*\u0004\u0018\u00010\u00060\u0006\u0012\u000c\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00000\u0000 \u0003*L\u0012F\u0008\u0001\u0012B\u0012\u000c\u0012\n \u0003*\u0004\u0018\u00010\u00060\u0006\u0012\u000c\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003* \u0012\u000c\u0012\n \u0003*\u0004\u0018\u00010\u00060\u0006\u0012\u000c\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00000\u0000\u0018\u00010\u00050\u00052\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\u000c\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0007\u0010\u0008"
    }
    d2 = {
        "Lkotlin/Pair;",
        "",
        "Lco/bird/android/model/persistence/ComplaintResolution;",
        "kotlin.jvm.PlatformType",
        "<name for destructuring parameter 0>",
        "Lio/reactivex/K;",
        "Lco/bird/android/model/persistence/ComplaintResolutionForm;",
        "c",
        "(Lkotlin/Pair;)Lio/reactivex/K;"
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
        "SMAP\nComplaintResolutionPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComplaintResolutionPresenter.kt\nco/bird/android/feature/complaintresolution/ComplaintResolutionPresenter$consume$29\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,381:1\n766#2:382\n857#2,2:383\n*S KotlinDebug\n*F\n+ 1 ComplaintResolutionPresenter.kt\nco/bird/android/feature/complaintresolution/ComplaintResolutionPresenter$consume$29\n*L\n290#1:382\n290#1:383,2\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Lzr0;


# direct methods
.method public constructor <init>(Lzr0;)V
    .locals 0

    iput-object p1, p0, Lzr0$u;->g:Lzr0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lzr0;Ljava/util/List;)V
    .locals 0

    invoke-static {p0, p1}, Lzr0$u;->d(Lzr0;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic b(Lzr0;)Lio/reactivex/K;
    .locals 0

    invoke-static {p0}, Lzr0$u;->e(Lzr0;)Lio/reactivex/K;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lzr0;Ljava/util/List;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$vehicleInvolvedIds"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lco/bird/android/model/constant/ComplaintResolutionField;->VEHICLES_INVOLVED:Lco/bird/android/model/constant/ComplaintResolutionField;

    check-cast p1, Ljava/util/Collection;

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    invoke-static {p0, v0, p1}, Lzr0;->access$fieldCheck(Lzr0;Lco/bird/android/model/constant/ComplaintResolutionField;Z)V

    return-void
.end method

.method public static final e(Lzr0;)Lio/reactivex/K;
    .locals 3

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lio/reactivex/rxkotlin/g;->a:Lio/reactivex/rxkotlin/g;

    invoke-static {p0}, Lzr0;->access$getOperatorManager$p(Lzr0;)Lom3;

    move-result-object v1

    invoke-interface {v1}, Lom3;->o1()Lio/reactivex/F;

    move-result-object v1

    invoke-static {p0}, Lzr0;->access$getOperatorManager$p(Lzr0;)Lom3;

    move-result-object v2

    invoke-static {p0}, Lzr0;->access$getComplaintIds$p(Lzr0;)Ljava/util/List;

    move-result-object p0

    invoke-interface {v2, p0}, Lom3;->E(Ljava/util/List;)Lio/reactivex/p;

    move-result-object p0

    invoke-virtual {p0}, Lio/reactivex/p;->e0()Lio/reactivex/F;

    move-result-object p0

    const-string v2, "operatorManager.resoluti\u2026(complaintIds).toSingle()"

    invoke-static {p0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1, p0}, Lio/reactivex/rxkotlin/g;->a(Lio/reactivex/K;Lio/reactivex/K;)Lio/reactivex/F;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final c(Lkotlin/Pair;)Lio/reactivex/K;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Lco/bird/android/model/persistence/ComplaintResolution;",
            ">;)",
            "Lio/reactivex/K<",
            "+",
            "Lkotlin/Pair<",
            "Lco/bird/android/model/persistence/ComplaintResolutionForm;",
            "Lco/bird/android/model/persistence/ComplaintResolution;",
            ">;>;"
        }
    .end annotation

    const-string v0, "<name for destructuring parameter 0>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/persistence/ComplaintResolution;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/ComplaintResolution;->getVehicleIdsInvolved()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ljava/lang/String;

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    xor-int/lit8 v3, v3, 0x1

    if-eqz v3, :cond_0

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v1

    :cond_2
    iget-object p1, p0, Lzr0$u;->g:Lzr0;

    invoke-static {p1}, Lzr0;->access$getOperatorManager$p(Lzr0;)Lom3;

    move-result-object p1

    iget-object v0, p0, Lzr0$u;->g:Lzr0;

    invoke-static {v0}, Lzr0;->access$getComplaintIds$p(Lzr0;)Ljava/util/List;

    move-result-object v0

    invoke-interface {p1, v0, v1}, Lom3;->y(Ljava/util/List;Ljava/util/List;)Lio/reactivex/c;

    move-result-object p1

    iget-object v0, p0, Lzr0$u;->g:Lzr0;

    new-instance v2, LPr0;

    invoke-direct {v2, v0, v1}, LPr0;-><init>(Lzr0;Ljava/util/List;)V

    invoke-virtual {p1, v2}, Lio/reactivex/c;->z(Lio/reactivex/functions/a;)Lio/reactivex/c;

    move-result-object p1

    iget-object v0, p0, Lzr0$u;->g:Lzr0;

    new-instance v1, LQr0;

    invoke-direct {v1, v0}, LQr0;-><init>(Lzr0;)V

    invoke-static {v1}, Lio/reactivex/F;->k(Ljava/util/concurrent/Callable;)Lio/reactivex/F;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/c;->m(Lio/reactivex/K;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Pair;

    invoke-virtual {p0, p1}, Lzr0$u;->c(Lkotlin/Pair;)Lio/reactivex/K;

    move-result-object p1

    return-object p1
.end method
