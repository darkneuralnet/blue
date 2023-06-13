.class public final Lco/bird/android/feature/repair/v1/overview/RepairOverviewActivity;
.super Lco/bird/android/feature/repair/v1/base/BaseRepairOverviewActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/feature/repair/v1/overview/RepairOverviewActivity$a;,
        Lco/bird/android/feature/repair/v1/overview/RepairOverviewActivity$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0018\u00002\u00020\u0001:\u0002\u0010\u0011B\u0007\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0012\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014R\"\u0010\r\u001a\u00020\u00068\u0016@\u0016X\u0097.\u00a2\u0006\u0012\n\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\t\u0010\n\"\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u0012"
    }
    d2 = {
        "Lco/bird/android/feature/repair/v1/overview/RepairOverviewActivity;",
        "Lco/bird/android/feature/repair/v1/base/BaseRepairOverviewActivity;",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "",
        "onCreate",
        "LXB4;",
        "C",
        "LXB4;",
        "k0",
        "()LXB4;",
        "setPresenter",
        "(LXB4;)V",
        "presenter",
        "<init>",
        "()V",
        "a",
        "b",
        "repair_release"
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
        "SMAP\nRepairOverviewActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairOverviewActivity.kt\nco/bird/android/feature/repair/v1/overview/RepairOverviewActivity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,84:1\n44#2:85\n1#3:86\n*S KotlinDebug\n*F\n+ 1 RepairOverviewActivity.kt\nco/bird/android/feature/repair/v1/overview/RepairOverviewActivity\n*L\n40#1:85\n*E\n"
    }
.end annotation


# instance fields
.field public C:LXB4;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lco/bird/android/feature/repair/v1/base/BaseRepairOverviewActivity;-><init>()V

    return-void
.end method


# virtual methods
.method public k0()LXB4;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/repair/v1/overview/RepairOverviewActivity;->C:LXB4;

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

    invoke-super {p0, p1}, Lco/bird/android/feature/repair/v1/base/BaseRepairOverviewActivity;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object p1

    invoke-static {p1}, Lh5;->c(Landroid/view/LayoutInflater;)Lh5;

    move-result-object v5

    const-string p1, "inflate(layoutInflater)"

    invoke-static {v5, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v5}, Lh5;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->setContentView(Landroid/view/View;)V

    invoke-static {}, Lco/bird/android/feature/repair/v1/overview/a;->a()Lco/bird/android/feature/repair/v1/overview/RepairOverviewActivity$a$a;

    move-result-object v0

    sget-object p1, LoG2;->a:LoG2;

    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v1

    const-string v2, "application"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v1}, LoG2;->a(Landroid/content/Context;)LlG2;

    move-result-object v1

    invoke-virtual {p0}, Lco/bird/android/feature/repair/v1/base/BaseRepairOverviewActivity;->j0()LNy4;

    move-result-object v2

    invoke-static {p0}, Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;->b(LLifecycleOwner;)Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;

    move-result-object v4

    const-string p1, "AndroidLifecycleScopeProvider.from(this)"

    invoke-static {v4, p1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v3, p0

    invoke-interface/range {v0 .. v5}, Lco/bird/android/feature/repair/v1/overview/RepairOverviewActivity$a$a;->a(LlG2;LNy4;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;Lh5;)Lco/bird/android/feature/repair/v1/overview/RepairOverviewActivity$a;

    move-result-object p1

    invoke-interface {p1, p0}, Lco/bird/android/feature/repair/v1/overview/RepairOverviewActivity$a;->a(Lco/bird/android/feature/repair/v1/overview/RepairOverviewActivity;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "bird"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/wire/WireBird;

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lco/bird/android/feature/repair/v1/overview/RepairOverviewActivity;->k0()LXB4;

    move-result-object v0

    invoke-interface {v0, p1}, LXB4;->a(Lco/bird/android/model/wire/WireBird;)V

    :cond_0
    return-void
.end method
