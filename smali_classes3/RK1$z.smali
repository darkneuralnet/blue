.class public final LRK1$z;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LRK1;->m0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/Unit;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "kotlin.jvm.PlatformType",
        "invoke",
        "(Lkotlin/Unit;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nHelmetLeaseUnlockTutorialPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HelmetLeaseUnlockTutorialPresenter.kt\nco/bird/android/feature/itemlease/onboarding/HelmetLeaseUnlockTutorialPresenter$setupClickListeners$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,486:1\n1#2:487\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LRK1;


# direct methods
.method public constructor <init>(LRK1;)V
    .locals 0

    iput-object p1, p0, LRK1$z;->g:LRK1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Unit;

    invoke-virtual {p0, p1}, LRK1$z;->invoke(Lkotlin/Unit;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lkotlin/Unit;)V
    .locals 2

    iget-object p1, p0, LRK1$z;->g:LRK1;

    invoke-static {p1}, LRK1;->access$getBird$p(LRK1;)Lco/bird/android/model/wire/WireBird;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, LRK1$z;->g:LRK1;

    invoke-static {p1}, LRK1;->access$getItemLeaseManager$p(LRK1;)LMc2;

    move-result-object v0

    invoke-static {p1}, LRK1;->access$getBird$p(LRK1;)Lco/bird/android/model/wire/WireBird;

    move-result-object p1

    sget-object v1, Lco/bird/android/model/itemlease/enum/ItemLeaseType;->HELMET:Lco/bird/android/model/itemlease/enum/ItemLeaseType;

    invoke-interface {v0, p1, v1}, LMc2;->q(Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/itemlease/enum/ItemLeaseType;)V

    :cond_0
    iget-object p1, p0, LRK1$z;->g:LRK1;

    invoke-static {p1}, LRK1;->access$getNavigator$p(LRK1;)Le13;

    move-result-object p1

    sget-object v0, Le13$b;->c:Le13$b;

    const/4 v1, 0x0

    new-array v1, v1, [Lkotlin/Pair;

    invoke-interface {p1, v0, v1}, Le13;->W0(Le13$b;[Lkotlin/Pair;)V

    return-void
.end method
