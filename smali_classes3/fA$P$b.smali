.class public final LfA$P$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LfA$P;->c(Lkotlin/Pair;)Lio/reactivex/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lkotlin/Pair<",
        "+",
        "Lco/bird/android/model/persistence/Bird;",
        "+",
        "Lorg/joda/time/DateTime;",
        ">;",
        "Ljava/lang/Throwable;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0008\u001a\u00020\u00072&\u0010\u0004\u001a\"\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002 \u0003*\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00000\u00002\u000e\u0010\u0006\u001a\n \u0003*\u0004\u0018\u00010\u00050\u0005H\n\u00a2\u0006\u0004\u0008\u0008\u0010\t"
    }
    d2 = {
        "Lkotlin/Pair;",
        "Lco/bird/android/model/persistence/Bird;",
        "Lorg/joda/time/DateTime;",
        "kotlin.jvm.PlatformType",
        "<anonymous parameter 0>",
        "",
        "<anonymous parameter 1>",
        "",
        "a",
        "(Lkotlin/Pair;Ljava/lang/Throwable;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Ljava/lang/Boolean;

.field public final synthetic h:LfA;


# direct methods
.method public constructor <init>(Ljava/lang/Boolean;LfA;)V
    .locals 0

    iput-object p1, p0, LfA$P$b;->g:Ljava/lang/Boolean;

    iput-object p2, p0, LfA$P$b;->h:LfA;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lkotlin/Pair;Ljava/lang/Throwable;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "Lco/bird/android/model/persistence/Bird;",
            "Lorg/joda/time/DateTime;",
            ">;",
            "Ljava/lang/Throwable;",
            ")V"
        }
    .end annotation

    iget-object p1, p0, LfA$P$b;->g:Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, LfA$P$b;->h:LfA;

    invoke-static {p1}, LfA;->access$getUi$p(LfA;)Lv40;

    move-result-object p1

    iget-object p2, p0, LfA$P$b;->h:LfA;

    invoke-static {p2}, LfA;->access$getReactiveConfig$p(LfA;)LTq4;

    move-result-object p2

    invoke-virtual {p2}, LTq4;->f8()LZ84;

    move-result-object p2

    invoke-virtual {p2}, LZ84;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {p2}, Lco/bird/android/model/wire/configs/Config;->getOperatorConfig()Lco/bird/android/model/wire/configs/OperatorConfig;

    move-result-object p2

    invoke-virtual {p2}, Lco/bird/android/model/wire/configs/OperatorConfig;->getFeatures()Lco/bird/android/model/wire/configs/OperatorFeatureConfig;

    move-result-object p2

    invoke-virtual {p2}, Lco/bird/android/model/wire/configs/OperatorFeatureConfig;->getWakeBirds()Lco/bird/android/model/wire/configs/OperatorWakeBirdsConfig;

    move-result-object p2

    invoke-virtual {p2}, Lco/bird/android/model/wire/configs/OperatorWakeBirdsConfig;->getBulkWakeMaxVehicles()I

    move-result p2

    invoke-interface {p1, p2}, Lv40;->Vi(I)V

    :cond_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Pair;

    check-cast p2, Ljava/lang/Throwable;

    invoke-virtual {p0, p1, p2}, LfA$P$b;->a(Lkotlin/Pair;Ljava/lang/Throwable;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
