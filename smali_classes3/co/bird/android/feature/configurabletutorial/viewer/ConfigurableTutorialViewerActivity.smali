.class public final Lco/bird/android/feature/configurabletutorial/viewer/ConfigurableTutorialViewerActivity;
.super Lco/bird/android/core/mrp/BaseActivityLite;
.source "SourceFile"

# interfaces
.implements LVw0;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0008\u0008\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\u00a2\u0006\u0004\u0008&\u0010\'J\u0012\u0010\u0006\u001a\u00020\u00052\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u0007H\u0016R\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\r\u0010\u000e\"\u0004\u0008\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001cR\'\u0010%\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020 0\u001f0\u001e8VX\u0096\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008!\u0010\"\u001a\u0004\u0008#\u0010$\u00a8\u0006("
    }
    d2 = {
        "Lco/bird/android/feature/configurabletutorial/viewer/ConfigurableTutorialViewerActivity;",
        "Lco/bird/android/core/mrp/BaseActivityLite;",
        "LVw0;",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "",
        "onCreate",
        "LWw0;",
        "state",
        "Q",
        "LUw0;",
        "j",
        "LUw0;",
        "P",
        "()LUw0;",
        "setPresenter",
        "(LUw0;)V",
        "presenter",
        "Lp3;",
        "k",
        "Lp3;",
        "binding",
        "LOw0;",
        "l",
        "LOw0;",
        "converter",
        "LMw0;",
        "m",
        "LMw0;",
        "adapter",
        "Lio/reactivex/Observable;",
        "",
        "",
        "n",
        "Lkotlin/Lazy;",
        "u9",
        "()Lio/reactivex/Observable;",
        "tutorialsClicks",
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

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nConfigurableTutorialViewerActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConfigurableTutorialViewerActivity.kt\nco/bird/android/feature/configurabletutorial/viewer/ConfigurableTutorialViewerActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,56:1\n1#2:57\n*E\n"
    }
.end annotation


# instance fields
.field public j:LUw0;

.field public k:Lp3;

.field public final l:LOw0;

.field public final m:LMw0;

.field public final n:Lkotlin/Lazy;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lco/bird/android/core/mrp/BaseActivityLite;-><init>()V

    new-instance v0, LOw0;

    invoke-direct {v0}, LOw0;-><init>()V

    iput-object v0, p0, Lco/bird/android/feature/configurabletutorial/viewer/ConfigurableTutorialViewerActivity;->l:LOw0;

    new-instance v0, LMw0;

    invoke-direct {v0}, LMw0;-><init>()V

    iput-object v0, p0, Lco/bird/android/feature/configurabletutorial/viewer/ConfigurableTutorialViewerActivity;->m:LMw0;

    new-instance v0, Lco/bird/android/feature/configurabletutorial/viewer/ConfigurableTutorialViewerActivity$a;

    invoke-direct {v0, p0}, Lco/bird/android/feature/configurabletutorial/viewer/ConfigurableTutorialViewerActivity$a;-><init>(Lco/bird/android/feature/configurabletutorial/viewer/ConfigurableTutorialViewerActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lco/bird/android/feature/configurabletutorial/viewer/ConfigurableTutorialViewerActivity;->n:Lkotlin/Lazy;

    return-void
.end method

.method public static final synthetic access$getAdapter$p(Lco/bird/android/feature/configurabletutorial/viewer/ConfigurableTutorialViewerActivity;)LMw0;
    .locals 0

    iget-object p0, p0, Lco/bird/android/feature/configurabletutorial/viewer/ConfigurableTutorialViewerActivity;->m:LMw0;

    return-object p0
.end method


# virtual methods
.method public final P()LUw0;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/configurabletutorial/viewer/ConfigurableTutorialViewerActivity;->j:LUw0;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "presenter"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public Q(LWw0;)V
    .locals 1

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lw22;

    if-nez v0, :cond_0

    instance-of v0, p1, LmY3;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lco/bird/android/feature/configurabletutorial/viewer/ConfigurableTutorialViewerActivity;->l:LOw0;

    check-cast p1, LmY3;

    invoke-virtual {p1}, LmY3;->b()Ljava/util/List;

    move-result-object p1

    invoke-virtual {v0, p1}, LOw0;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iget-object v0, p0, Lco/bird/android/feature/configurabletutorial/viewer/ConfigurableTutorialViewerActivity;->m:LMw0;

    check-cast p1, Ljava/util/Collection;

    invoke-virtual {v0, p1}, LMy;->u(Ljava/util/Collection;)V

    :cond_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    invoke-super {p0, p1}, Lco/bird/android/core/mrp/BaseActivityLite;->onCreate(Landroid/os/Bundle;)V

    invoke-static {}, LfI0;->a()LNw0$a;

    move-result-object p1

    invoke-virtual {p0}, Lco/bird/android/core/mrp/BaseActivityLite;->H()LlG2;

    move-result-object v0

    invoke-interface {p1, v0}, LNw0$a;->a(LlG2;)LNw0;

    move-result-object p1

    invoke-interface {p1, p0}, LNw0;->a(Lco/bird/android/feature/configurabletutorial/viewer/ConfigurableTutorialViewerActivity;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object p1

    invoke-static {p1}, Lp3;->c(Landroid/view/LayoutInflater;)Lp3;

    move-result-object p1

    const-string v0, "inflate(layoutInflater)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lco/bird/android/feature/configurabletutorial/viewer/ConfigurableTutorialViewerActivity;->k:Lp3;

    const/4 v0, 0x0

    const-string v1, "binding"

    if-nez p1, :cond_0

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p1, v0

    :cond_0
    invoke-virtual {p1}, Lp3;->b()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->setContentView(Landroid/view/View;)V

    invoke-virtual {p0}, Lco/bird/android/core/base/BaseCoreActivity;->D()V

    iget-object p1, p0, Lco/bird/android/feature/configurabletutorial/viewer/ConfigurableTutorialViewerActivity;->k:Lp3;

    if-nez p1, :cond_1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p1, v0

    :cond_1
    invoke-virtual {p1}, Lp3;->b()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p1

    new-instance v2, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-direct {v2, p0}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {p1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$p;)V

    iget-object p1, p0, Lco/bird/android/feature/configurabletutorial/viewer/ConfigurableTutorialViewerActivity;->k:Lp3;

    if-nez p1, :cond_2

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p1, v0

    :cond_2
    invoke-virtual {p1}, Lp3;->b()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p1

    iget-object v2, p0, Lco/bird/android/feature/configurabletutorial/viewer/ConfigurableTutorialViewerActivity;->m:LMw0;

    invoke-virtual {p1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$h;)V

    iget-object p1, p0, Lco/bird/android/feature/configurabletutorial/viewer/ConfigurableTutorialViewerActivity;->k:Lp3;

    if-nez p1, :cond_3

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    move-object v0, p1

    :goto_0
    invoke-virtual {v0}, Lp3;->b()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p1

    new-instance v0, Landroidx/recyclerview/widget/g;

    invoke-direct {v0}, Landroidx/recyclerview/widget/g;-><init>()V

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setItemAnimator(Landroidx/recyclerview/widget/RecyclerView$m;)V

    invoke-virtual {p0}, Lco/bird/android/feature/configurabletutorial/viewer/ConfigurableTutorialViewerActivity;->P()LUw0;

    move-result-object p1

    invoke-virtual {p1, p0}, LUw0;->r(LVw0;)V

    return-void
.end method

.method public bridge synthetic render(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LWw0;

    invoke-virtual {p0, p1}, Lco/bird/android/feature/configurabletutorial/viewer/ConfigurableTutorialViewerActivity;->Q(LWw0;)V

    return-void
.end method

.method public u9()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/feature/configurabletutorial/viewer/ConfigurableTutorialViewerActivity;->n:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/reactivex/Observable;

    return-object v0
.end method
