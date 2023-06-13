.class public final Lco/bird/android/feature/ownedbirds/PrivateBirdsOverviewActivity;
.super Lco/bird/android/core/mvp/BaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/feature/ownedbirds/PrivateBirdsOverviewActivity$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0018\u00002\u00020\u0001:\u0001\u0011B\u0007\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0012\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u0008\u0010\u0006\u001a\u00020\u0004H\u0014R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\n\u0010\u000b\"\u0004\u0008\u000c\u0010\r\u00a8\u0006\u0012"
    }
    d2 = {
        "Lco/bird/android/feature/ownedbirds/PrivateBirdsOverviewActivity;",
        "Lco/bird/android/core/mvp/BaseActivity;",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "",
        "onCreate",
        "onResume",
        "Lf64;",
        "B",
        "Lf64;",
        "j0",
        "()Lf64;",
        "setPresenter",
        "(Lf64;)V",
        "presenter",
        "<init>",
        "()V",
        "a",
        "ownedbirds_release"
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
        "SMAP\nPrivateBirdsOverviewActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrivateBirdsOverviewActivity.kt\nco/bird/android/feature/ownedbirds/PrivateBirdsOverviewActivity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,59:1\n44#2:60\n*S KotlinDebug\n*F\n+ 1 PrivateBirdsOverviewActivity.kt\nco/bird/android/feature/ownedbirds/PrivateBirdsOverviewActivity\n*L\n29#1:60\n*E\n"
    }
.end annotation


# instance fields
.field public B:Lf64;


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
.method public final j0()Lf64;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/ownedbirds/PrivateBirdsOverviewActivity;->B:Lf64;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "presenter"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 6

    invoke-super {p0, p1}, Lco/bird/android/core/mvp/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object p1

    invoke-static {p1}, LR4;->c(Landroid/view/LayoutInflater;)LR4;

    move-result-object v4

    const-string p1, "inflate(layoutInflater)"

    invoke-static {v4, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4}, LR4;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->setContentView(Landroid/view/View;)V

    invoke-static {}, Lco/bird/android/feature/ownedbirds/c;->a()Lco/bird/android/feature/ownedbirds/PrivateBirdsOverviewActivity$a$a;

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

    invoke-virtual {p0}, Lco/bird/android/core/mvp/BaseActivity;->x()LDQ3;

    move-result-object v5

    move-object v2, p0

    invoke-interface/range {v0 .. v5}, Lco/bird/android/feature/ownedbirds/PrivateBirdsOverviewActivity$a$a;->a(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;LR4;LDQ3;)Lco/bird/android/feature/ownedbirds/PrivateBirdsOverviewActivity$a;

    move-result-object p1

    invoke-interface {p1, p0}, Lco/bird/android/feature/ownedbirds/PrivateBirdsOverviewActivity$a;->a(Lco/bird/android/feature/ownedbirds/PrivateBirdsOverviewActivity;)V

    invoke-virtual {p0}, Lco/bird/android/feature/ownedbirds/PrivateBirdsOverviewActivity;->j0()Lf64;

    move-result-object p1

    invoke-virtual {p1}, Lf64;->D()V

    return-void
.end method

.method public onResume()V
    .locals 1

    invoke-super {p0}, Lco/bird/android/core/base/BaseCoreActivity;->onResume()V

    invoke-virtual {p0}, Lco/bird/android/feature/ownedbirds/PrivateBirdsOverviewActivity;->j0()Lf64;

    move-result-object v0

    invoke-virtual {v0}, Lf64;->E()V

    return-void
.end method
