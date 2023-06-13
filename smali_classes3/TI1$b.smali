.class public final LTI1$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LTI1;->q()V
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
        "SMAP\nHelmetLeasePromptPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HelmetLeasePromptPresenter.kt\nco/bird/android/feature/itemlease/onboarding/HelmetLeasePromptPresenter$setupClickListeners$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,259:1\n1#2:260\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LTI1;


# direct methods
.method public constructor <init>(LTI1;)V
    .locals 0

    iput-object p1, p0, LTI1$b;->g:LTI1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Unit;

    invoke-virtual {p0, p1}, LTI1$b;->invoke(Lkotlin/Unit;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lkotlin/Unit;)V
    .locals 6

    iget-object p1, p0, LTI1$b;->g:LTI1;

    const-string v0, "accepted"

    invoke-static {p1, v0}, LTI1;->access$trackResolutionEvent(LTI1;Ljava/lang/String;)V

    iget-object p1, p0, LTI1$b;->g:LTI1;

    invoke-static {p1}, LTI1;->access$getBird$p(LTI1;)Lco/bird/android/model/wire/WireBird;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v0, p0, LTI1$b;->g:LTI1;

    invoke-static {v0}, LTI1;->access$getItemLeaseManager$p(LTI1;)LMc2;

    move-result-object v0

    sget-object v1, Lco/bird/android/model/itemlease/enum/ItemLeaseType;->HELMET:Lco/bird/android/model/itemlease/enum/ItemLeaseType;

    invoke-interface {v0, p1, v1}, LMc2;->f(Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/itemlease/enum/ItemLeaseType;)V

    :cond_0
    iget-object p1, p0, LTI1$b;->g:LTI1;

    invoke-static {p1}, LTI1;->access$getBird$p(LTI1;)Lco/bird/android/model/wire/WireBird;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireBird;->getPhysicalLocks()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/wire/WirePhysicalLock;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lco/bird/android/model/wire/WirePhysicalLock;->isSolebe()Z

    move-result p1

    const/4 v1, 0x1

    if-ne p1, v1, :cond_1

    move v0, v1

    :cond_1
    if-eqz v0, :cond_2

    iget-object p1, p0, LTI1$b;->g:LTI1;

    invoke-static {p1}, LTI1;->access$getNavigator$p(LTI1;)Le13;

    move-result-object v0

    iget-object p1, p0, LTI1$b;->g:LTI1;

    invoke-static {p1}, LTI1;->access$getBird$p(LTI1;)Lco/bird/android/model/wire/WireBird;

    move-result-object v1

    const/4 v2, 0x0

    const/16 v3, 0x504

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Le13$a;->goToHelmetLeaseSolebe$default(Le13;Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/itemlease/ItemLease;IILjava/lang/Object;)V

    goto :goto_0

    :cond_2
    iget-object p1, p0, LTI1$b;->g:LTI1;

    invoke-static {p1}, LTI1;->access$getNavigator$p(LTI1;)Le13;

    move-result-object p1

    iget-object v0, p0, LTI1$b;->g:LTI1;

    invoke-static {v0}, LTI1;->access$getBird$p(LTI1;)Lco/bird/android/model/wire/WireBird;

    move-result-object v0

    const/16 v1, 0x504

    invoke-interface {p1, v0, v1}, Le13;->s1(Lco/bird/android/model/wire/WireBird;I)V

    :goto_0
    return-void
.end method
