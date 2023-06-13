.class public final Lco/bird/android/feature/itemlease/onboarding/HelmetLeaseUnlockTutorialActivity;
.super Lco/bird/android/core/mvp/BaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/feature/itemlease/onboarding/HelmetLeaseUnlockTutorialActivity$a;,
        Lco/bird/android/feature/itemlease/onboarding/HelmetLeaseUnlockTutorialActivity$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0018\u00002\u00020\u0001:\u0002\u0018\u0019B\u0007\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0012\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u0008\u0010\u0006\u001a\u00020\u0004H\u0014J\"\u0010\u000c\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0008\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014J\u0008\u0010\r\u001a\u00020\u0004H\u0016R\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008\u000f\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0012\"\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u001a"
    }
    d2 = {
        "Lco/bird/android/feature/itemlease/onboarding/HelmetLeaseUnlockTutorialActivity;",
        "Lco/bird/android/core/mvp/BaseActivity;",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "",
        "onCreate",
        "onResume",
        "",
        "requestCode",
        "resultCode",
        "Landroid/content/Intent;",
        "data",
        "onActivityResult",
        "onBackPressed",
        "LRK1;",
        "B",
        "LRK1;",
        "j0",
        "()LRK1;",
        "setPresenter",
        "(LRK1;)V",
        "presenter",
        "<init>",
        "()V",
        "a",
        "b",
        "co.bird.android.feature.item-lease"
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
        "SMAP\nHelmetLeaseUnlockTutorialActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HelmetLeaseUnlockTutorialActivity.kt\nco/bird/android/feature/itemlease/onboarding/HelmetLeaseUnlockTutorialActivity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,82:1\n44#2:83\n*S KotlinDebug\n*F\n+ 1 HelmetLeaseUnlockTutorialActivity.kt\nco/bird/android/feature/itemlease/onboarding/HelmetLeaseUnlockTutorialActivity\n*L\n32#1:83\n*E\n"
    }
.end annotation


# instance fields
.field public B:LRK1;


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
.method public final j0()LRK1;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/itemlease/onboarding/HelmetLeaseUnlockTutorialActivity;->B:LRK1;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "presenter"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 1

    invoke-super {p0, p1, p2, p3}, Lco/bird/android/core/base/BaseCoreActivity;->onActivityResult(IILandroid/content/Intent;)V

    invoke-virtual {p0}, Lco/bird/android/feature/itemlease/onboarding/HelmetLeaseUnlockTutorialActivity;->j0()LRK1;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, LRK1;->a0(IILandroid/content/Intent;)V

    return-void
.end method

.method public onBackPressed()V
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/feature/itemlease/onboarding/HelmetLeaseUnlockTutorialActivity;->j0()LRK1;

    move-result-object v0

    invoke-virtual {v0}, LRK1;->b0()V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 7

    invoke-super {p0, p1}, Lco/bird/android/core/mvp/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object p1

    invoke-static {p1}, LN3;->c(Landroid/view/LayoutInflater;)LN3;

    move-result-object v4

    const-string p1, "inflate(layoutInflater)"

    invoke-static {v4, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4}, LN3;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->setContentView(Landroid/view/View;)V

    invoke-static {}, Lco/bird/android/feature/itemlease/onboarding/b;->a()Lco/bird/android/feature/itemlease/onboarding/HelmetLeaseUnlockTutorialActivity$a$a;

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

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v2, "bird"

    invoke-virtual {p1, v2}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    move-object v5, p1

    check-cast v5, Lco/bird/android/model/wire/WireBird;

    invoke-virtual {p0}, Lco/bird/android/core/mvp/BaseActivity;->x()LDQ3;

    move-result-object v6

    move-object v2, p0

    invoke-interface/range {v0 .. v6}, Lco/bird/android/feature/itemlease/onboarding/HelmetLeaseUnlockTutorialActivity$a$a;->a(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;LN3;Lco/bird/android/model/wire/WireBird;LDQ3;)Lco/bird/android/feature/itemlease/onboarding/HelmetLeaseUnlockTutorialActivity$a;

    move-result-object p1

    invoke-interface {p1, p0}, Lco/bird/android/feature/itemlease/onboarding/HelmetLeaseUnlockTutorialActivity$a;->a(Lco/bird/android/feature/itemlease/onboarding/HelmetLeaseUnlockTutorialActivity;)V

    invoke-virtual {p0}, Lco/bird/android/feature/itemlease/onboarding/HelmetLeaseUnlockTutorialActivity;->j0()LRK1;

    move-result-object p1

    invoke-virtual {p1}, LRK1;->f0()V

    return-void
.end method

.method public onResume()V
    .locals 1

    invoke-super {p0}, Lco/bird/android/core/base/BaseCoreActivity;->onResume()V

    invoke-virtual {p0}, Lco/bird/android/feature/itemlease/onboarding/HelmetLeaseUnlockTutorialActivity;->j0()LRK1;

    move-result-object v0

    invoke-virtual {v0}, LRK1;->g0()V

    return-void
.end method
