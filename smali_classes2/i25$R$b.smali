.class public final Li25$R$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li25$R;->d(Lco/bird/android/model/RideRequirement;)Lio/reactivex/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li25$R$b$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/DialogResponse;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/DialogResponse;",
        "kotlin.jvm.PlatformType",
        "response",
        "",
        "a",
        "(Lco/bird/android/model/DialogResponse;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Li25;


# direct methods
.method public constructor <init>(Li25;)V
    .locals 0

    iput-object p1, p0, Li25$R$b;->g:Li25;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/DialogResponse;)V
    .locals 10

    if-nez p1, :cond_0

    const/4 p1, -0x1

    goto :goto_0

    :cond_0
    sget-object v0, Li25$R$b$a;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    :goto_0
    const/4 v0, 0x1

    if-eq p1, v0, :cond_2

    const/4 v1, 0x2

    if-eq p1, v1, :cond_1

    goto :goto_1

    :cond_1
    iget-object p1, p0, Li25$R$b;->g:Li25;

    invoke-static {p1, v0}, Li25;->access$setOnboardingBottomSheetDismissed$p(Li25;Z)V

    goto :goto_1

    :cond_2
    iget-object p1, p0, Li25$R$b;->g:Li25;

    invoke-static {p1}, Li25;->access$getAnalyticsManager$p(Li25;)LEa;

    move-result-object p1

    new-instance v9, LMt4;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    iget-object v0, p0, Li25$R$b;->g:Li25;

    invoke-static {v0}, Li25;->access$getPreference$p(Li25;)Lgl;

    move-result-object v0

    invoke-virtual {v0}, Lgl;->B0()Lco/bird/android/model/User;

    move-result-object v0

    invoke-static {v0}, Lco/bird/android/model/UserKt;->isInRegistration(Lco/bird/android/model/User;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    const/4 v5, 0x0

    const-string v6, "action_sheet"

    const/4 v7, 0x7

    const/4 v8, 0x0

    move-object v0, v9

    invoke-direct/range {v0 .. v8}, LMt4;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p1, v9}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    iget-object p1, p0, Li25$R$b;->g:Li25;

    invoke-static {p1}, Li25;->access$getRequirementPresenter$p(Li25;)LsJ4;

    move-result-object v0

    sget-object v2, Lco/bird/android/model/constant/RideRequirementReason;->ONBOARDING_BANNER:Lco/bird/android/model/constant/RideRequirementReason;

    const/4 v4, 0x4

    invoke-static/range {v0 .. v5}, LsJ4$a;->checkRequirementsSilently$default(LsJ4;Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/constant/RideRequirementReason;Ljava/lang/String;ILjava/lang/Object;)V

    :goto_1
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/DialogResponse;

    invoke-virtual {p0, p1}, Li25$R$b;->a(Lco/bird/android/model/DialogResponse;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
