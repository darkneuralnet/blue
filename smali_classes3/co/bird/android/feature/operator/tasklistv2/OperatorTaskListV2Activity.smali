.class public final Lco/bird/android/feature/operator/tasklistv2/OperatorTaskListV2Activity;
.super Lco/bird/android/core/mrp/BaseActivityLite;
.source "SourceFile"

# interfaces
.implements Lrx4;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lco/bird/android/core/mrp/BaseActivityLite;",
        "Lrx4<",
        "Luw3;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u00002\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00030\u0002B\t\u0008\u0007\u00a2\u0006\u0004\u0008&\u0010\'J\u0012\u0010\u0007\u001a\u00020\u00062\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u0003H\u0016J\u0016\u0010\r\u001a\u00020\u00062\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\nH\u0002R\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008\u000f\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0012\"\u0004\u0008\u0013\u0010\u0014R\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u001a\"\u0004\u0008\u001b\u0010\u001cR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 R\u0018\u0010%\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008#\u0010$\u00a8\u0006("
    }
    d2 = {
        "Lco/bird/android/feature/operator/tasklistv2/OperatorTaskListV2Activity;",
        "Lco/bird/android/core/mrp/BaseActivityLite;",
        "Lrx4;",
        "Luw3;",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "",
        "onCreate",
        "state",
        "S",
        "",
        "Lco/bird/android/model/persistence/OperatorTaskGroup;",
        "taskGroups",
        "U",
        "Lsw3;",
        "j",
        "Lsw3;",
        "R",
        "()Lsw3;",
        "setPresenter",
        "(Lsw3;)V",
        "presenter",
        "LWv3;",
        "k",
        "LWv3;",
        "Q",
        "()LWv3;",
        "setAdapter",
        "(LWv3;)V",
        "adapter",
        "LD4;",
        "l",
        "LD4;",
        "binding",
        "Lcom/google/android/material/tabs/b;",
        "m",
        "Lcom/google/android/material/tabs/b;",
        "tabLayoutMediator",
        "<init>",
        "()V",
        "task-list-v2_release"
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
        "SMAP\nOperatorTaskListV2Activity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorTaskListV2Activity.kt\nco/bird/android/feature/operator/tasklistv2/OperatorTaskListV2Activity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,70:1\n1#2:71\n*E\n"
    }
.end annotation


# instance fields
.field public j:Lsw3;

.field public k:LWv3;

.field public l:LD4;

.field public m:Lcom/google/android/material/tabs/b;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lco/bird/android/core/mrp/BaseActivityLite;-><init>()V

    return-void
.end method

.method public static synthetic P(Ljava/util/List;Lcom/google/android/material/tabs/TabLayout$g;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lco/bird/android/feature/operator/tasklistv2/OperatorTaskListV2Activity;->X(Ljava/util/List;Lcom/google/android/material/tabs/TabLayout$g;I)V

    return-void
.end method

.method public static final X(Ljava/util/List;Lcom/google/android/material/tabs/TabLayout$g;I)V
    .locals 1

    const-string v0, "$taskGroups"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tab"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p2, v0, :cond_0

    invoke-interface {p0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lco/bird/android/model/persistence/OperatorTaskGroup;

    invoke-virtual {p0}, Lco/bird/android/model/persistence/OperatorTaskGroup;->getTitle()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Lcom/google/android/material/tabs/TabLayout$g;->r(Ljava/lang/CharSequence;)Lcom/google/android/material/tabs/TabLayout$g;

    :cond_0
    return-void
.end method


# virtual methods
.method public final Q()LWv3;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/operator/tasklistv2/OperatorTaskListV2Activity;->k:LWv3;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "adapter"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final R()Lsw3;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/operator/tasklistv2/OperatorTaskListV2Activity;->j:Lsw3;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "presenter"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public S(Luw3;)V
    .locals 7

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lz22;

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    if-eqz v0, :cond_6

    check-cast p1, Lz22;

    invoke-virtual {p1}, Lz22;->b()Lco/bird/android/model/persistence/OperatorTaskBanner;

    move-result-object v0

    const-string v4, "binding"

    if-eqz v0, :cond_3

    iget-object v5, p0, Lco/bird/android/feature/operator/tasklistv2/OperatorTaskListV2Activity;->l:LD4;

    if-nez v5, :cond_0

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v5, v3

    :cond_0
    iget-object v5, v5, LD4;->b:Landroid/widget/TextView;

    invoke-virtual {v0}, Lco/bird/android/model/persistence/OperatorTaskBanner;->getTitle()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v5, p0, Lco/bird/android/feature/operator/tasklistv2/OperatorTaskListV2Activity;->l:LD4;

    if-nez v5, :cond_1

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v5, v3

    :cond_1
    iget-object v5, v5, LD4;->b:Landroid/widget/TextView;

    invoke-virtual {v0}, Lco/bird/android/model/persistence/OperatorTaskBanner;->getTitleColor()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    move-result-object v6

    invoke-virtual {v6}, Lco/bird/android/model/persistence/nestedstructures/ThemedColors;->getLightMode()I

    move-result v6

    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object v5, p0, Lco/bird/android/feature/operator/tasklistv2/OperatorTaskListV2Activity;->l:LD4;

    if-nez v5, :cond_2

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v5, v3

    :cond_2
    iget-object v5, v5, LD4;->b:Landroid/widget/TextView;

    invoke-virtual {v0}, Lco/bird/android/model/persistence/OperatorTaskBanner;->getBackgroundColor()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/persistence/nestedstructures/ThemedColors;->getLightMode()I

    move-result v0

    invoke-static {v0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    invoke-virtual {v5, v0}, Landroid/view/View;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    :cond_3
    iget-object v0, p0, Lco/bird/android/feature/operator/tasklistv2/OperatorTaskListV2Activity;->l:LD4;

    if-nez v0, :cond_4

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v3

    :cond_4
    iget-object v0, v0, LD4;->b:Landroid/widget/TextView;

    const-string v4, "binding.banner"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lz22;->b()Lco/bird/android/model/persistence/OperatorTaskBanner;

    move-result-object v4

    if-eqz v4, :cond_5

    const/4 v4, 0x1

    goto :goto_0

    :cond_5
    move v4, v2

    :goto_0
    invoke-static {v0, v4, v2, v1, v3}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    invoke-virtual {p1}, Lz22;->c()Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Lco/bird/android/feature/operator/tasklistv2/OperatorTaskListV2Activity;->U(Ljava/util/List;)V

    goto :goto_1

    :cond_6
    instance-of v0, p1, LOk1;

    if-eqz v0, :cond_7

    invoke-virtual {p0}, Lco/bird/android/core/mrp/BaseActivityLite;->F()Lsx4;

    move-result-object p1

    invoke-virtual {p1}, LXC;->errorGeneric()V

    goto :goto_1

    :cond_7
    instance-of v0, p1, LFt2;

    if-eqz v0, :cond_8

    invoke-virtual {p0}, Lco/bird/android/core/mrp/BaseActivityLite;->F()Lsx4;

    move-result-object v0

    check-cast p1, LFt2;

    invoke-virtual {p1}, LFt2;->b()Z

    move-result p1

    invoke-static {v0, p1, v2, v1, v3}, LS74$a;->showProgress$default(LS74;ZIILjava/lang/Object;)V

    :cond_8
    :goto_1
    return-void
.end method

.method public final U(Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/OperatorTaskGroup;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/feature/operator/tasklistv2/OperatorTaskListV2Activity;->m:Lcom/google/android/material/tabs/b;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/material/tabs/b;->b()V

    :cond_0
    invoke-virtual {p0}, Lco/bird/android/feature/operator/tasklistv2/OperatorTaskListV2Activity;->Q()LWv3;

    move-result-object v0

    invoke-virtual {v0, p1}, LWv3;->P(Ljava/util/List;)V

    new-instance v0, Lcom/google/android/material/tabs/b;

    iget-object v1, p0, Lco/bird/android/feature/operator/tasklistv2/OperatorTaskListV2Activity;->l:LD4;

    const/4 v2, 0x0

    const-string v3, "binding"

    if-nez v1, :cond_1

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v1, v2

    :cond_1
    iget-object v1, v1, LD4;->d:Lcom/google/android/material/tabs/TabLayout;

    iget-object v4, p0, Lco/bird/android/feature/operator/tasklistv2/OperatorTaskListV2Activity;->l:LD4;

    if-nez v4, :cond_2

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    move-object v2, v4

    :goto_0
    iget-object v2, v2, LD4;->e:Landroidx/viewpager2/widget/ViewPager2;

    new-instance v3, LKv3;

    invoke-direct {v3, p1}, LKv3;-><init>(Ljava/util/List;)V

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/material/tabs/b;-><init>(Lcom/google/android/material/tabs/TabLayout;Landroidx/viewpager2/widget/ViewPager2;Lcom/google/android/material/tabs/b$b;)V

    invoke-virtual {v0}, Lcom/google/android/material/tabs/b;->a()V

    iput-object v0, p0, Lco/bird/android/feature/operator/tasklistv2/OperatorTaskListV2Activity;->m:Lcom/google/android/material/tabs/b;

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 4

    invoke-super {p0, p1}, Lco/bird/android/core/mrp/BaseActivityLite;->onCreate(Landroid/os/Bundle;)V

    invoke-static {}, Lco/bird/android/feature/operator/tasklistv2/a;->a()Lco/bird/android/feature/operator/tasklistv2/b$a;

    move-result-object p1

    invoke-virtual {p0}, Lco/bird/android/core/mrp/BaseActivityLite;->H()LlG2;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v1

    const-string v2, "supportFragmentManager"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/activity/ComponentActivity;->getLifecycle()Landroidx/lifecycle/f;

    move-result-object v2

    const-string v3, "lifecycle"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, v0, p0, v1, v2}, Lco/bird/android/feature/operator/tasklistv2/b$a;->a(LlG2;Landroid/app/Activity;Landroidx/fragment/app/FragmentManager;Landroidx/lifecycle/f;)Lco/bird/android/feature/operator/tasklistv2/b;

    move-result-object p1

    invoke-interface {p1, p0}, Lco/bird/android/feature/operator/tasklistv2/b;->a(Lco/bird/android/feature/operator/tasklistv2/OperatorTaskListV2Activity;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object p1

    invoke-static {p1}, LD4;->c(Landroid/view/LayoutInflater;)LD4;

    move-result-object p1

    const-string v0, "inflate(layoutInflater)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lco/bird/android/feature/operator/tasklistv2/OperatorTaskListV2Activity;->l:LD4;

    const/4 v0, 0x0

    const-string v1, "binding"

    if-nez p1, :cond_0

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p1, v0

    :cond_0
    invoke-virtual {p1}, LD4;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getLayoutTransition()Landroid/animation/LayoutTransition;

    move-result-object p1

    const/4 v2, 0x4

    invoke-virtual {p1, v2}, Landroid/animation/LayoutTransition;->enableTransitionType(I)V

    iget-object p1, p0, Lco/bird/android/feature/operator/tasklistv2/OperatorTaskListV2Activity;->l:LD4;

    if-nez p1, :cond_1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p1, v0

    :cond_1
    invoke-virtual {p1}, LD4;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->setContentView(Landroid/view/View;)V

    iget-object p1, p0, Lco/bird/android/feature/operator/tasklistv2/OperatorTaskListV2Activity;->l:LD4;

    if-nez p1, :cond_2

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    move-object v0, p1

    :goto_0
    iget-object p1, v0, LD4;->e:Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {p0}, Lco/bird/android/feature/operator/tasklistv2/OperatorTaskListV2Activity;->Q()LWv3;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/viewpager2/widget/ViewPager2;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$h;)V

    invoke-virtual {p0}, Lco/bird/android/feature/operator/tasklistv2/OperatorTaskListV2Activity;->R()Lsw3;

    move-result-object p1

    invoke-virtual {p1, p0}, Lsw3;->consume(Lrx4;)V

    return-void
.end method

.method public bridge synthetic render(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Luw3;

    invoke-virtual {p0, p1}, Lco/bird/android/feature/operator/tasklistv2/OperatorTaskListV2Activity;->S(Luw3;)V

    return-void
.end method
