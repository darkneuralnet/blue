.class public final LVO$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LVO;->d(Lco/bird/android/model/analytics/BirdPayOnboardingScreenViewedSource;Lco/bird/android/model/wire/configs/BirdPayTutorialConfig;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/Integer;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "<anonymous>",
        "",
        "index",
        "",
        "kotlin.jvm.PlatformType",
        "invoke",
        "(Ljava/lang/Integer;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/model/wire/configs/BirdPayTutorialConfig;

.field public final synthetic h:LVO;


# direct methods
.method public constructor <init>(Lco/bird/android/model/wire/configs/BirdPayTutorialConfig;LVO;)V
    .locals 0

    iput-object p1, p0, LVO$a;->g:Lco/bird/android/model/wire/configs/BirdPayTutorialConfig;

    iput-object p2, p0, LVO$a;->h:LVO;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p0, p1}, LVO$a;->invoke(Ljava/lang/Integer;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Ljava/lang/Integer;)V
    .locals 2

    iget-object v0, p0, LVO$a;->g:Lco/bird/android/model/wire/configs/BirdPayTutorialConfig;

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/BirdPayTutorialConfig;->getSteps()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const-string v1, "index"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-gt v0, v1, :cond_0

    iget-object p1, p0, LVO$a;->h:LVO;

    invoke-static {p1}, LVO;->access$getNavigator$p(LVO;)Le13;

    move-result-object p1

    invoke-interface {p1}, Le13;->close()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, LVO$a;->h:LVO;

    invoke-static {v0}, LVO;->access$getUi$p(LVO;)LXO;

    move-result-object v0

    iget-object v1, p0, LVO$a;->g:Lco/bird/android/model/wire/configs/BirdPayTutorialConfig;

    invoke-virtual {v1}, Lco/bird/android/model/wire/configs/BirdPayTutorialConfig;->getSteps()Ljava/util/List;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/wire/configs/BirdPayTutorialStep;

    invoke-interface {v0, p1}, LXO;->c(Lco/bird/android/model/wire/configs/BirdPayTutorialStep;)V

    :goto_0
    return-void
.end method
