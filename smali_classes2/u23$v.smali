.class public final Lu23$v;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu23;->e0(Landroid/view/MenuItem;)Z
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
        "Lco/bird/android/model/NearbyBirdViewModel;",
        ">;",
        "Lio/reactivex/K<",
        "+",
        "Ljava/util/List<",
        "+",
        "LH6;",
        ">;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0006\u001aB\u0012\u001a\u0008\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00000\u0000 \u0005* \u0012\u001a\u0008\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00030\u00032\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "",
        "Lco/bird/android/model/NearbyBirdViewModel;",
        "previousBirds",
        "Lio/reactivex/K;",
        "LH6;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Ljava/util/List;)Lio/reactivex/K;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lu23;


# direct methods
.method public constructor <init>(Lu23;)V
    .locals 0

    iput-object p1, p0, Lu23$v;->g:Lu23;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)Lio/reactivex/K;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/model/NearbyBirdViewModel;",
            ">;)",
            "Lio/reactivex/K<",
            "+",
            "Ljava/util/List<",
            "LH6;",
            ">;>;"
        }
    .end annotation

    const-string v0, "previousBirds"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lu23$v;->g:Lu23;

    invoke-static {v0}, Lu23;->access$getConverter$p(Lu23;)LA13;

    move-result-object v0

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v1

    iget-object v2, p0, Lu23$v;->g:Lu23;

    invoke-static {v2}, Lu23;->access$getReactiveConfig$p(Lu23;)LTq4;

    move-result-object v2

    invoke-virtual {v2}, LTq4;->f8()LZ84;

    move-result-object v2

    invoke-virtual {v2}, LZ84;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v2}, Lco/bird/android/model/wire/configs/Config;->getOperatorConfig()Lco/bird/android/model/wire/configs/OperatorConfig;

    move-result-object v2

    invoke-virtual {v2}, Lco/bird/android/model/wire/configs/OperatorConfig;->getFeatures()Lco/bird/android/model/wire/configs/OperatorFeatureConfig;

    move-result-object v2

    invoke-virtual {v2}, Lco/bird/android/model/wire/configs/OperatorFeatureConfig;->getSweepBirds()Lco/bird/android/model/wire/configs/OperatorSweepBirdsConfig;

    move-result-object v2

    invoke-virtual {v2}, Lco/bird/android/model/wire/configs/OperatorSweepBirdsConfig;->getEnableSignalBuckets()Z

    move-result v2

    invoke-virtual {v0, v1, p1, v2}, LA13;->c(Ljava/util/List;Ljava/util/List;Z)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Lu23$v;->a(Ljava/util/List;)Lio/reactivex/K;

    move-result-object p1

    return-object p1
.end method
