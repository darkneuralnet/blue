.class public abstract Lco/bird/android/feature/repair/v1/base/BaseRepairOverviewActivity;
.super Lco/bird/android/core/mvp/BaseActivity;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008&\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0012\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u0008\u0010\u0006\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u0008\u001a\u00020\u0007H\u0016J\"\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0014R\"\u0010\u0018\u001a\u00020\u00118\u0004@\u0004X\u0084.\u00a2\u0006\u0012\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015\"\u0004\u0008\u0016\u0010\u0017R\u001c\u0010\u001e\u001a\u00020\u00198&@&X\u00a6\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u001a\u0010\u001b\"\u0004\u0008\u001c\u0010\u001d\u00a8\u0006!"
    }
    d2 = {
        "Lco/bird/android/feature/repair/v1/base/BaseRepairOverviewActivity;",
        "Lco/bird/android/core/mvp/BaseActivity;",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "",
        "onCreate",
        "onBackPressed",
        "Landroid/view/MenuItem;",
        "item",
        "",
        "onOptionsItemSelected",
        "",
        "requestCode",
        "resultCode",
        "Landroid/content/Intent;",
        "data",
        "onActivityResult",
        "LNy4;",
        "B",
        "LNy4;",
        "j0",
        "()LNy4;",
        "m0",
        "(LNy4;)V",
        "component",
        "LXB4;",
        "k0",
        "()LXB4;",
        "setPresenter",
        "(LXB4;)V",
        "presenter",
        "<init>",
        "()V",
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
        "SMAP\nBaseRepairOverviewActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseRepairOverviewActivity.kt\nco/bird/android/feature/repair/v1/base/BaseRepairOverviewActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,66:1\n1#2:67\n*E\n"
    }
.end annotation


# instance fields
.field public B:LNy4;


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
.method public final j0()LNy4;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/repair/v1/base/BaseRepairOverviewActivity;->B:LNy4;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "component"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public abstract k0()LXB4;
.end method

.method public final m0(LNy4;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lco/bird/android/feature/repair/v1/base/BaseRepairOverviewActivity;->B:LNy4;

    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 1

    invoke-super {p0, p1, p2, p3}, Lco/bird/android/core/base/BaseCoreActivity;->onActivityResult(IILandroid/content/Intent;)V

    const/4 v0, -0x1

    if-ne p2, v0, :cond_4

    const/16 p2, 0x271b

    const-string v0, "repairs"

    if-eq p1, p2, :cond_3

    const/16 p2, 0x271c

    if-eq p1, p2, :cond_2

    const/16 p2, 0x2720

    if-eq p1, p2, :cond_1

    const/16 p2, 0x2728

    if-eq p1, p2, :cond_0

    goto :goto_0

    :cond_0
    if-eqz p3, :cond_4

    invoke-virtual {p3, v0}, Landroid/content/Intent;->getParcelableArrayListExtra(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-virtual {p0}, Lco/bird/android/feature/repair/v1/base/BaseRepairOverviewActivity;->k0()LXB4;

    move-result-object p2

    invoke-interface {p2, p1}, LXB4;->d(Ljava/util/List;)V

    goto :goto_0

    :cond_1
    if-eqz p3, :cond_4

    const-string p1, "issue"

    invoke-virtual {p3, p1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/Issue;

    if-eqz p1, :cond_4

    invoke-virtual {p0}, Lco/bird/android/feature/repair/v1/base/BaseRepairOverviewActivity;->k0()LXB4;

    move-result-object p2

    invoke-interface {p2, p1}, LXB4;->b(Lco/bird/android/model/Issue;)V

    goto :goto_0

    :cond_2
    if-eqz p3, :cond_4

    invoke-virtual {p3, v0}, Landroid/content/Intent;->getParcelableArrayListExtra(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-virtual {p0}, Lco/bird/android/feature/repair/v1/base/BaseRepairOverviewActivity;->k0()LXB4;

    move-result-object p2

    invoke-interface {p2, p1}, LXB4;->c(Ljava/util/List;)V

    goto :goto_0

    :cond_3
    if-eqz p3, :cond_4

    invoke-virtual {p3, v0}, Landroid/content/Intent;->getParcelableArrayListExtra(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-virtual {p0}, Lco/bird/android/feature/repair/v1/base/BaseRepairOverviewActivity;->k0()LXB4;

    move-result-object p2

    invoke-interface {p2, p1}, LXB4;->c(Ljava/util/List;)V

    :cond_4
    :goto_0
    return-void
.end method

.method public onBackPressed()V
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/feature/repair/v1/base/BaseRepairOverviewActivity;->k0()LXB4;

    move-result-object v0

    invoke-interface {v0}, LXB4;->onBackPressed()V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    invoke-super {p0, p1}, Lco/bird/android/core/mvp/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    sget-object p1, LPy4;->b:LPy4;

    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v0

    const-string v1, "application"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {p1, v0, v1, v2, v1}, LAk1;->component$default(LAk1;Landroid/app/Application;Ljava/util/Map;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LNy4;

    invoke-virtual {p0, p1}, Lco/bird/android/feature/repair/v1/base/BaseRepairOverviewActivity;->m0(LNy4;)V

    return-void
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 2

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    const v1, 0x102002c

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Lco/bird/android/feature/repair/v1/base/BaseRepairOverviewActivity;->k0()LXB4;

    move-result-object p1

    invoke-interface {p1}, LXB4;->onBackPressed()V

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    invoke-super {p0, p1}, Lco/bird/android/core/mvp/BaseActivity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result p1

    :goto_0
    return p1
.end method
