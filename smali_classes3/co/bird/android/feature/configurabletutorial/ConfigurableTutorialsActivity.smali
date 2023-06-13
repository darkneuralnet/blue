.class public final Lco/bird/android/feature/configurabletutorial/ConfigurableTutorialsActivity;
.super Lco/bird/android/core/mrp/BaseActivityLite;
.source "SourceFile"

# interfaces
.implements Lcx0;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\u00a2\u0006\u0004\u0008(\u0010)J\u0012\u0010\u0006\u001a\u00020\u00052\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014J\u0008\u0010\u0007\u001a\u00020\u0005H\u0016J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0008H\u0016J\u0014\u0010\u000e\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\r0\u000c0\u000bH\u0016R\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008\u0010\u0010\u0011\u001a\u0004\u0008\u0012\u0010\u0013\"\u0004\u0008\u0014\u0010\u0015R\"\u0010\u001e\u001a\u00020\u00178\u0000@\u0000X\u0080.\u00a2\u0006\u0012\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001b\"\u0004\u0008\u001c\u0010\u001dR.\u0010#\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\r  *\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000c0\u000c0\u001f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008!\u0010\"R\u0016\u0010\'\u001a\u00020$8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008%\u0010&\u00a8\u0006*"
    }
    d2 = {
        "Lco/bird/android/feature/configurabletutorial/ConfigurableTutorialsActivity;",
        "Lco/bird/android/core/mrp/BaseActivityLite;",
        "Lcx0;",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "",
        "onCreate",
        "onBackPressed",
        "",
        "state",
        "render",
        "Lio/reactivex/Observable;",
        "",
        "",
        "x7",
        "Lbx0;",
        "j",
        "Lbx0;",
        "Q",
        "()Lbx0;",
        "setPresenter",
        "(Lbx0;)V",
        "presenter",
        "Lco/bird/android/feature/configurabletutorial/a;",
        "k",
        "Lco/bird/android/feature/configurabletutorial/a;",
        "P",
        "()Lco/bird/android/feature/configurabletutorial/a;",
        "R",
        "(Lco/bird/android/feature/configurabletutorial/a;)V",
        "component",
        "Lma4;",
        "kotlin.jvm.PlatformType",
        "l",
        "Lma4;",
        "startFromIdsRelay",
        "Lqw0;",
        "m",
        "Lqw0;",
        "tutorialNavigator",
        "<init>",
        "()V",
        "co.bird.android.feature.configurabletutorial"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public j:Lbx0;

.field public k:Lco/bird/android/feature/configurabletutorial/a;

.field public final l:Lma4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lma4<",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field public m:Lqw0;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lco/bird/android/core/mrp/BaseActivityLite;-><init>()V

    invoke-static {}, Lma4;->g()Lma4;

    move-result-object v0

    const-string v1, "create<List<String>>()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lco/bird/android/feature/configurabletutorial/ConfigurableTutorialsActivity;->l:Lma4;

    return-void
.end method


# virtual methods
.method public final P()Lco/bird/android/feature/configurabletutorial/a;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/configurabletutorial/ConfigurableTutorialsActivity;->k:Lco/bird/android/feature/configurabletutorial/a;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "component"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final Q()Lbx0;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/configurabletutorial/ConfigurableTutorialsActivity;->j:Lbx0;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "presenter"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final R(Lco/bird/android/feature/configurabletutorial/a;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lco/bird/android/feature/configurabletutorial/ConfigurableTutorialsActivity;->k:Lco/bird/android/feature/configurabletutorial/a;

    return-void
.end method

.method public onBackPressed()V
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/configurabletutorial/ConfigurableTutorialsActivity;->m:Lqw0;

    if-nez v0, :cond_0

    const-string v0, "tutorialNavigator"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0}, LKA;->a()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-super {p0}, Lco/bird/android/core/base/BaseCoreActivity;->onBackPressed()V

    :cond_1
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 5

    invoke-super {p0, p1}, Lco/bird/android/core/mrp/BaseActivityLite;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object p1

    invoke-static {p1}, Lq3;->c(Landroid/view/LayoutInflater;)Lq3;

    move-result-object p1

    invoke-virtual {p1}, Lq3;->b()Landroid/widget/FrameLayout;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->setContentView(Landroid/view/View;)V

    invoke-virtual {p0}, Lco/bird/android/core/base/BaseCoreActivity;->D()V

    new-instance p1, Lqw0;

    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    const-string v1, "supportFragmentManager"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget v1, Ljh4;->container:I

    invoke-direct {p1, v0, v1}, Lqw0;-><init>(Landroidx/fragment/app/FragmentManager;I)V

    iput-object p1, p0, Lco/bird/android/feature/configurabletutorial/ConfigurableTutorialsActivity;->m:Lqw0;

    invoke-static {}, Lco/bird/android/feature/configurabletutorial/b;->a()Lco/bird/android/feature/configurabletutorial/a$a;

    move-result-object p1

    invoke-virtual {p0}, Lco/bird/android/core/mrp/BaseActivityLite;->H()LlG2;

    move-result-object v0

    iget-object v1, p0, Lco/bird/android/feature/configurabletutorial/ConfigurableTutorialsActivity;->m:Lqw0;

    if-nez v1, :cond_0

    const-string v1, "tutorialNavigator"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v1, 0x0

    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    const-string v3, "keep_unseen"

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v4}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v2

    invoke-interface {p1, v0, v1, v2}, Lco/bird/android/feature/configurabletutorial/a$a;->a(LlG2;Lqw0;Z)Lco/bird/android/feature/configurabletutorial/a;

    move-result-object p1

    invoke-virtual {p0, p1}, Lco/bird/android/feature/configurabletutorial/ConfigurableTutorialsActivity;->R(Lco/bird/android/feature/configurabletutorial/a;)V

    invoke-virtual {p0}, Lco/bird/android/feature/configurabletutorial/ConfigurableTutorialsActivity;->P()Lco/bird/android/feature/configurabletutorial/a;

    move-result-object p1

    invoke-interface {p1, p0}, Lco/bird/android/feature/configurabletutorial/a;->c(Lco/bird/android/feature/configurabletutorial/ConfigurableTutorialsActivity;)V

    invoke-virtual {p0}, Lco/bird/android/feature/configurabletutorial/ConfigurableTutorialsActivity;->Q()Lbx0;

    move-result-object p1

    invoke-virtual {p1, p0}, Lbx0;->p(Lcx0;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "configurable_tutorial_id"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringArrayListExtra(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object v0, p0, Lco/bird/android/feature/configurabletutorial/ConfigurableTutorialsActivity;->l:Lma4;

    invoke-virtual {v0, p1}, Lma4;->accept(Ljava/lang/Object;)V

    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Required value was null."

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public render(Ljava/lang/Object;)V
    .locals 1

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public x7()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/feature/configurabletutorial/ConfigurableTutorialsActivity;->l:Lma4;

    invoke-virtual {v0}, Lio/reactivex/Observable;->hide()Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "startFromIdsRelay.hide()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
