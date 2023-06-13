.class public final LvM1$g;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LvM1;->V(Lco/bird/android/model/constant/ScanMode;Lco/bird/android/model/constant/ScanIntention;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/util/List<",
        "+",
        "Lco/bird/android/model/persistence/HibernationSessionVehicle;",
        ">;",
        "Lna4<",
        "+",
        "Lkotlin/Pair<",
        "+",
        "Ljava/util/List<",
        "+",
        "Lco/bird/android/model/persistence/HibernationSessionVehicle;",
        ">;+",
        "Ljava/util/List<",
        "+",
        "Lco/bird/android/model/persistence/Bird;",
        ">;>;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0010\t\u001a\u008a\u0001\u0012>\u0008\u0001\u0012:\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00010\u0000\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u0000 \u0006*\u001c\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00010\u0000\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u0000\u0018\u00010\u00040\u0004 \u0006*D\u0012>\u0008\u0001\u0012:\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00010\u0000\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u0000 \u0006*\u001c\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00010\u0000\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u0000\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00032\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0007\u0010\u0008"
    }
    d2 = {
        "",
        "Lco/bird/android/model/persistence/HibernationSessionVehicle;",
        "hibernatedVehicles",
        "Lna4;",
        "Lkotlin/Pair;",
        "Lco/bird/android/model/persistence/Bird;",
        "kotlin.jvm.PlatformType",
        "invoke",
        "(Ljava/util/List;)Lna4;",
        "<anonymous>"
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
        "SMAP\nHibernationScanPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HibernationScanPresenter.kt\nco/bird/android/feature/hibernationscan/HibernationScanPresenter$onResume$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,269:1\n1549#2:270\n1620#2,3:271\n*S KotlinDebug\n*F\n+ 1 HibernationScanPresenter.kt\nco/bird/android/feature/hibernationscan/HibernationScanPresenter$onResume$2\n*L\n85#1:270\n85#1:271,3\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LvM1;


# direct methods
.method public constructor <init>(LvM1;)V
    .locals 0

    iput-object p1, p0, LvM1$g;->g:LvM1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Pair;
    .locals 0

    invoke-static {p0, p1}, LvM1$g;->b(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Pair;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lkotlin/Pair;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, LvM1$g;->invoke(Ljava/util/List;)Lna4;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Ljava/util/List;)Lna4;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/HibernationSessionVehicle;",
            ">;)",
            "Lna4<",
            "+",
            "Lkotlin/Pair<",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/HibernationSessionVehicle;",
            ">;",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/Bird;",
            ">;>;>;"
        }
    .end annotation

    const-string v0, "hibernatedVehicles"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LvM1$g;->g:LvM1;

    invoke-static {v0}, LvM1;->access$getOperatorManager(LvM1;)Lom3;

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

    check-cast v3, Lco/bird/android/model/persistence/HibernationSessionVehicle;

    invoke-virtual {v3}, Lco/bird/android/model/persistence/HibernationSessionVehicle;->getBirdId()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-interface {v0, v2}, Lom3;->v(Ljava/util/List;)Lio/reactivex/k;

    move-result-object v0

    new-instance v1, LvM1$g$a;

    invoke-direct {v1, p1}, LvM1$g$a;-><init>(Ljava/util/List;)V

    new-instance p1, LzM1;

    invoke-direct {p1, v1}, LzM1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, p1}, Lio/reactivex/k;->q0(Lio/reactivex/functions/o;)Lio/reactivex/k;

    move-result-object p1

    return-object p1
.end method
