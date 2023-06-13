.class public final Li25$R;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li25;->j5(Lcom/uber/autodispose/ScopeProvider;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/RideRequirement;",
        "Lio/reactivex/h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/RideRequirement;",
        "it",
        "Lio/reactivex/h;",
        "kotlin.jvm.PlatformType",
        "d",
        "(Lco/bird/android/model/RideRequirement;)Lio/reactivex/h;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Z

.field public final synthetic h:Li25;


# direct methods
.method public constructor <init>(ZLi25;)V
    .locals 0

    iput-boolean p1, p0, Li25$R;->g:Z

    iput-object p2, p0, Li25$R;->h:Li25;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Li25$R;->g(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic b(Li25;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Li25$R;->e(Li25;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Li25$R;->f(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final e(Li25;)Lkotlin/Unit;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Li25;->access$getRideUi$p(Li25;)LP75;

    move-result-object p0

    invoke-interface {p0}, LP75;->Xa()V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final f(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final g(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final d(Lco/bird/android/model/RideRequirement;)Lio/reactivex/h;
    .locals 6

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean p1, p0, Li25$R;->g:Z

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    iget-object p1, p0, Li25$R;->h:Li25;

    invoke-static {p1}, Li25;->access$getOnboardingCompleted(Li25;)Z

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, Li25$R;->h:Li25;

    invoke-static {p1}, Li25;->access$getInRequirementCheck(Li25;)Z

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, Li25$R;->h:Li25;

    invoke-static {p1}, Li25;->access$getOnboardingBottomSheetDismissed$p(Li25;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Li25$R;->h:Li25;

    invoke-static {p1}, Li25;->access$getOnboardingBottomSheet(Li25;)Lg46$b;

    move-result-object p1

    const-string v1, "calling show one flow onboarding dialog now"

    new-array v0, v0, [Ljava/lang/Object;

    invoke-virtual {p1, v1, v0}, Lg46$b;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Li25$R;->h:Li25;

    invoke-static {p1}, Li25;->access$getRideUi$p(Li25;)LP75;

    move-result-object p1

    invoke-interface {p1}, LP75;->Ci()Lio/reactivex/F;

    move-result-object p1

    new-instance v0, Li25$R$a;

    iget-object v1, p0, Li25$R;->h:Li25;

    invoke-direct {v0, v1}, Li25$R$a;-><init>(Li25;)V

    new-instance v1, Lo25;

    invoke-direct {v1, v0}, Lo25;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/F;->v(Lio/reactivex/functions/g;)Lio/reactivex/F;

    move-result-object p1

    new-instance v0, Li25$R$b;

    iget-object v1, p0, Li25$R;->h:Li25;

    invoke-direct {v0, v1}, Li25$R$b;-><init>(Li25;)V

    new-instance v1, Lp25;

    invoke-direct {v1, v0}, Lp25;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/F;->w(Lio/reactivex/functions/g;)Lio/reactivex/F;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/F;->G()Lio/reactivex/c;

    move-result-object p1

    goto :goto_1

    :cond_1
    :goto_0
    iget-object p1, p0, Li25$R;->h:Li25;

    invoke-static {p1}, Li25;->access$getOnboardingBottomSheet(Li25;)Lg46$b;

    move-result-object p1

    iget-boolean v1, p0, Li25$R;->g:Z

    iget-object v2, p0, Li25$R;->h:Li25;

    invoke-static {v2}, Li25;->access$getInRequirementCheck(Li25;)Z

    move-result v2

    iget-object v3, p0, Li25$R;->h:Li25;

    invoke-static {v3}, Li25;->access$getMutableRequirementBannerShown$p(Li25;)La94;

    move-result-object v3

    invoke-virtual {v3}, La94;->getValue()Ljava/lang/Object;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "calling dismiss one flow onboarding onboardingOneFlowBottomSheetEnabled="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", inRequirementCheck="

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", mutableRequirementBannerShown.value="

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-array v0, v0, [Ljava/lang/Object;

    invoke-virtual {p1, v1, v0}, Lg46$b;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Li25$R;->h:Li25;

    new-instance v0, Ln25;

    invoke-direct {v0, p1}, Ln25;-><init>(Li25;)V

    invoke-static {v0}, Lio/reactivex/c;->H(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object p1

    :goto_1
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/RideRequirement;

    invoke-virtual {p0, p1}, Li25$R;->d(Lco/bird/android/model/RideRequirement;)Lio/reactivex/h;

    move-result-object p1

    return-object p1
.end method
