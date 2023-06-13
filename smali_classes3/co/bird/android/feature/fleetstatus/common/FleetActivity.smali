.class public final Lco/bird/android/feature/fleetstatus/common/FleetActivity;
.super Lco/bird/android/core/mvp/BaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/feature/fleetstatus/common/FleetActivity$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0018\u00002\u00020\u0001:\u0001!B\u0007\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0012\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u0008\u0010\u0006\u001a\u00020\u0004H\u0016R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\n\u0010\u000b\"\u0004\u0008\u000c\u0010\rR\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008\u0010\u0010\u0011\u001a\u0004\u0008\u0012\u0010\u0013\"\u0004\u0008\u0014\u0010\u0015R\"\u0010\u001e\u001a\u00020\u00178\u0006@\u0006X\u0086.\u00a2\u0006\u0012\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001b\"\u0004\u0008\u001c\u0010\u001d\u00a8\u0006\""
    }
    d2 = {
        "Lco/bird/android/feature/fleetstatus/common/FleetActivity;",
        "Lco/bird/android/core/mvp/BaseActivity;",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "",
        "onCreate",
        "onBackPressed",
        "Lpp1;",
        "B",
        "Lpp1;",
        "m0",
        "()Lpp1;",
        "setPresenter",
        "(Lpp1;)V",
        "presenter",
        "Lkp1;",
        "C",
        "Lkp1;",
        "k0",
        "()Lkp1;",
        "setFleetNavigator",
        "(Lkp1;)V",
        "fleetNavigator",
        "Lco/bird/android/feature/fleetstatus/common/FleetActivity$a;",
        "D",
        "Lco/bird/android/feature/fleetstatus/common/FleetActivity$a;",
        "j0",
        "()Lco/bird/android/feature/fleetstatus/common/FleetActivity$a;",
        "n0",
        "(Lco/bird/android/feature/fleetstatus/common/FleetActivity$a;)V",
        "component",
        "<init>",
        "()V",
        "a",
        "co.bird.android.feature.fleet-status"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nFleetActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FleetActivity.kt\nco/bird/android/feature/fleetstatus/common/FleetActivity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,76:1\n44#2:77\n*S KotlinDebug\n*F\n+ 1 FleetActivity.kt\nco/bird/android/feature/fleetstatus/common/FleetActivity\n*L\n35#1:77\n*E\n"
    }
.end annotation


# instance fields
.field public B:Lpp1;

.field public C:Lkp1;

.field public D:Lco/bird/android/feature/fleetstatus/common/FleetActivity$a;


# direct methods
.method public constructor <init>()V
    .locals 6

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x7

    const/4 v5, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lco/bird/android/core/mvp/BaseActivity;-><init>(ZLjava/lang/Integer;Ljava/lang/Boolean;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public final j0()Lco/bird/android/feature/fleetstatus/common/FleetActivity$a;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/fleetstatus/common/FleetActivity;->D:Lco/bird/android/feature/fleetstatus/common/FleetActivity$a;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "component"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final k0()Lkp1;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/fleetstatus/common/FleetActivity;->C:Lkp1;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "fleetNavigator"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final m0()Lpp1;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/fleetstatus/common/FleetActivity;->B:Lpp1;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "presenter"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final n0(Lco/bird/android/feature/fleetstatus/common/FleetActivity$a;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lco/bird/android/feature/fleetstatus/common/FleetActivity;->D:Lco/bird/android/feature/fleetstatus/common/FleetActivity$a;

    return-void
.end method

.method public onBackPressed()V
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/feature/fleetstatus/common/FleetActivity;->k0()Lkp1;

    move-result-object v0

    invoke-virtual {v0}, Lkp1;->a()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-super {p0}, Lco/bird/android/core/base/BaseCoreActivity;->onBackPressed()V

    :cond_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 7

    invoke-super {p0, p1}, Lco/bird/android/core/mvp/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object p1

    invoke-static {p1}, LB3;->c(Landroid/view/LayoutInflater;)LB3;

    move-result-object p1

    const-string v0, "inflate(layoutInflater)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LB3;->b()Landroid/widget/FrameLayout;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->setContentView(Landroid/view/View;)V

    invoke-static {}, Lco/bird/android/feature/fleetstatus/common/a;->a()Lco/bird/android/feature/fleetstatus/common/FleetActivity$a$a;

    move-result-object v0

    sget-object p1, LoG2;->a:LoG2;

    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v1

    const-string v2, "application"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v1}, LoG2;->a(Landroid/content/Context;)LlG2;

    move-result-object v1

    invoke-static {p0}, Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;->b(LLifecycleOwner;)Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;

    move-result-object v3

    const-string p1, "AndroidLifecycleScopeProvider.from(this)"

    invoke-static {v3, p1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, Lco/bird/android/feature/fleetstatus/common/FleetActivity$b;

    invoke-direct {v4, p0}, Lco/bird/android/feature/fleetstatus/common/FleetActivity$b;-><init>(Lco/bird/android/feature/fleetstatus/common/FleetActivity;)V

    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v5

    const-string p1, "supportFragmentManager"

    invoke-static {v5, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget v6, Lnh4;->container:I

    move-object v2, p0

    invoke-interface/range {v0 .. v6}, Lco/bird/android/feature/fleetstatus/common/FleetActivity$a$a;->a(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;LxE;Landroidx/fragment/app/FragmentManager;I)Lco/bird/android/feature/fleetstatus/common/FleetActivity$a;

    move-result-object p1

    invoke-virtual {p0, p1}, Lco/bird/android/feature/fleetstatus/common/FleetActivity;->n0(Lco/bird/android/feature/fleetstatus/common/FleetActivity$a;)V

    invoke-virtual {p0}, Lco/bird/android/feature/fleetstatus/common/FleetActivity;->j0()Lco/bird/android/feature/fleetstatus/common/FleetActivity$a;

    move-result-object p1

    invoke-interface {p1, p0}, Lco/bird/android/feature/fleetstatus/common/FleetActivity$a;->b(Lco/bird/android/feature/fleetstatus/common/FleetActivity;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "fleet_report"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Lmp1;->c:Lmp1;

    goto :goto_0

    :cond_0
    sget-object p1, Lmp1;->b:Lmp1;

    :goto_0
    invoke-virtual {p0}, Lco/bird/android/feature/fleetstatus/common/FleetActivity;->m0()Lpp1;

    move-result-object v0

    invoke-virtual {v0, p1}, Lpp1;->c(Lmp1;)V

    return-void
.end method
