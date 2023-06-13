.class public final Li25$i0;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li25;->I5(Lco/bird/android/model/wire/WireBird;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "",
        "invoke"
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
.field public final synthetic g:Li25;

.field public final synthetic h:Lco/bird/android/model/wire/WireBird;


# direct methods
.method public constructor <init>(Li25;Lco/bird/android/model/wire/WireBird;)V
    .locals 0

    iput-object p1, p0, Li25$i0;->g:Li25;

    iput-object p2, p0, Li25$i0;->h:Lco/bird/android/model/wire/WireBird;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Li25$i0;->invoke()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .locals 2

    iget-object v0, p0, Li25$i0;->g:Li25;

    invoke-static {v0}, Li25;->access$getReactiveConfig$p(Li25;)LTq4;

    move-result-object v0

    invoke-virtual {v0}, LTq4;->f8()LZ84;

    move-result-object v0

    invoke-virtual {v0}, LZ84;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/Config;->getRiderTutorial()Lco/bird/android/model/wire/WireRiderTutorial;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Li25$i0;->g:Li25;

    invoke-static {v0}, Li25;->access$getNavigator$p(Li25;)Le13;

    move-result-object v0

    iget-object v1, p0, Li25$i0;->h:Lco/bird/android/model/wire/WireBird;

    invoke-static {v1}, Lco/bird/android/app/feature/map/renderer/Bird_Kt;->classTutorialKind(Lco/bird/android/model/wire/WireBird;)Lco/bird/android/model/ridertutorial/TutorialKind;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Le13;->t2(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Li25$i0;->g:Li25;

    invoke-static {v0}, Li25;->access$getNavigator$p(Li25;)Le13;

    move-result-object v0

    invoke-interface {v0}, Le13;->f3()V

    :goto_0
    return-void
.end method
