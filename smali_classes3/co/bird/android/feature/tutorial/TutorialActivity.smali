.class public final Lco/bird/android/feature/tutorial/TutorialActivity;
.super Lco/bird/android/core/mrp/BaseActivityLite;
.source "SourceFile"

# interfaces
.implements LOa6;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\u00a2\u0006\u0004\u0008)\u0010*J\u0012\u0010\u0006\u001a\u00020\u00052\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u0007H\u0016J\u000e\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00050\nH\u0016R\"\u0010\u0013\u001a\u00020\u000c8\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010\"\u0004\u0008\u0011\u0010\u0012R\"\u0010\u001b\u001a\u00020\u00148\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018\"\u0004\u0008\u0019\u0010\u001aR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008!\u0010\"R\"\u0010(\u001a\u0010\u0012\u000c\u0012\n %*\u0004\u0018\u00010\u00050\u00050$8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008&\u0010\'\u00a8\u0006+"
    }
    d2 = {
        "Lco/bird/android/feature/tutorial/TutorialActivity;",
        "Lco/bird/android/core/mrp/BaseActivityLite;",
        "LOa6;",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "",
        "onCreate",
        "LPa6;",
        "state",
        "R",
        "Lio/reactivex/F;",
        "C5",
        "LNa6;",
        "j",
        "LNa6;",
        "Q",
        "()LNa6;",
        "setPresenter",
        "(LNa6;)V",
        "presenter",
        "LFa6;",
        "k",
        "LFa6;",
        "P",
        "()LFa6;",
        "setGenerator",
        "(LFa6;)V",
        "generator",
        "Lo6;",
        "l",
        "Lo6;",
        "binding",
        "LDa6;",
        "m",
        "LDa6;",
        "adapter",
        "Lio/reactivex/subjects/g;",
        "kotlin.jvm.PlatformType",
        "n",
        "Lio/reactivex/subjects/g;",
        "tutorialFinishSubject",
        "<init>",
        "()V",
        "co.bird.android.feature.tutorial"
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
        "SMAP\nTutorialActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TutorialActivity.kt\nco/bird/android/feature/tutorial/TutorialActivity\n+ 2 Intent+.kt\nco/bird/android/library/extension/Intent_Kt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Enum+.kt\nco/bird/android/library/extension/Enum_Kt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,105:1\n6#2:106\n1#3:107\n13#4,2:108\n15#4,2:112\n1109#5,2:110\n*S KotlinDebug\n*F\n+ 1 TutorialActivity.kt\nco/bird/android/feature/tutorial/TutorialActivity\n*L\n36#1:106\n36#1:107\n36#1:108,2\n36#1:112,2\n36#1:110,2\n*E\n"
    }
.end annotation


# instance fields
.field public j:LNa6;

.field public k:LFa6;

.field public l:Lo6;

.field public final m:LDa6;

.field public final n:Lio/reactivex/subjects/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/g<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lco/bird/android/core/mrp/BaseActivityLite;-><init>()V

    new-instance v0, LDa6;

    invoke-direct {v0}, LDa6;-><init>()V

    iput-object v0, p0, Lco/bird/android/feature/tutorial/TutorialActivity;->m:LDa6;

    invoke-static {}, Lio/reactivex/subjects/g;->w0()Lio/reactivex/subjects/g;

    move-result-object v0

    const-string v1, "create<Unit>()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lco/bird/android/feature/tutorial/TutorialActivity;->n:Lio/reactivex/subjects/g;

    return-void
.end method

.method public static final synthetic access$getAdapter$p(Lco/bird/android/feature/tutorial/TutorialActivity;)LDa6;
    .locals 0

    iget-object p0, p0, Lco/bird/android/feature/tutorial/TutorialActivity;->m:LDa6;

    return-object p0
.end method

.method public static final synthetic access$getBinding$p(Lco/bird/android/feature/tutorial/TutorialActivity;)Lo6;
    .locals 0

    iget-object p0, p0, Lco/bird/android/feature/tutorial/TutorialActivity;->l:Lo6;

    return-object p0
.end method

.method public static final synthetic access$getTutorialFinishSubject$p(Lco/bird/android/feature/tutorial/TutorialActivity;)Lio/reactivex/subjects/g;
    .locals 0

    iget-object p0, p0, Lco/bird/android/feature/tutorial/TutorialActivity;->n:Lio/reactivex/subjects/g;

    return-object p0
.end method


# virtual methods
.method public C5()Lio/reactivex/F;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/F<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/feature/tutorial/TutorialActivity;->n:Lio/reactivex/subjects/g;

    invoke-virtual {v0}, Lio/reactivex/F;->F()Lio/reactivex/F;

    move-result-object v0

    const-string v1, "tutorialFinishSubject.hide()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final P()LFa6;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/tutorial/TutorialActivity;->k:LFa6;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "generator"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final Q()LNa6;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/tutorial/TutorialActivity;->j:LNa6;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "presenter"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public R(LPa6;)V
    .locals 2

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LD22;->a:LD22;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getSupportActionBar()Landroidx/appcompat/app/ActionBar;

    move-result-object p1

    if-eqz p1, :cond_0

    sget v0, Lnl4;->damage_nests_tutorial_title:I

    invoke-virtual {p1, v0}, Landroidx/appcompat/app/ActionBar;->D(I)V

    :cond_0
    iget-object p1, p0, Lco/bird/android/feature/tutorial/TutorialActivity;->m:LDa6;

    invoke-virtual {p0}, Lco/bird/android/feature/tutorial/TutorialActivity;->P()LFa6;

    move-result-object v0

    invoke-virtual {v0}, LFa6;->c()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1, v0}, LDa6;->o(Ljava/util/List;)V

    goto :goto_0

    :cond_1
    sget-object v0, LB22;->a:LB22;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getSupportActionBar()Landroidx/appcompat/app/ActionBar;

    move-result-object p1

    if-eqz p1, :cond_2

    sget v0, Lnl4;->damage_nests_damaged_bird:I

    invoke-virtual {p1, v0}, Landroidx/appcompat/app/ActionBar;->D(I)V

    :cond_2
    iget-object p1, p0, Lco/bird/android/feature/tutorial/TutorialActivity;->m:LDa6;

    invoke-virtual {p0}, Lco/bird/android/feature/tutorial/TutorialActivity;->P()LFa6;

    move-result-object v0

    invoke-virtual {v0}, LFa6;->a()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1, v0}, LDa6;->o(Ljava/util/List;)V

    goto :goto_0

    :cond_3
    instance-of v0, p1, LC22;

    if-eqz v0, :cond_5

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getSupportActionBar()Landroidx/appcompat/app/ActionBar;

    move-result-object v0

    if-eqz v0, :cond_4

    sget v1, Lnl4;->group_rides:I

    invoke-virtual {v0, v1}, Landroidx/appcompat/app/ActionBar;->D(I)V

    :cond_4
    iget-object v0, p0, Lco/bird/android/feature/tutorial/TutorialActivity;->m:LDa6;

    invoke-virtual {p0}, Lco/bird/android/feature/tutorial/TutorialActivity;->P()LFa6;

    move-result-object v1

    check-cast p1, LC22;

    invoke-virtual {p1}, LC22;->b()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, LFa6;->b(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {v0, p1}, LDa6;->o(Ljava/util/List;)V

    :cond_5
    :goto_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 10

    const-string v0, "Array contains no element matching the predicate."

    const-class v1, Lco/bird/android/model/constant/TutorialType;

    invoke-super {p0, p1}, Lco/bird/android/core/mrp/BaseActivityLite;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v2, "intent"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "tutorial_type"

    invoke-virtual {p1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v2, 0x0

    const/4 v3, 0x0

    if-eqz p1, :cond_4

    :try_start_0
    invoke-virtual {v1}, Ljava/lang/Class;->getEnumConstants()[Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    array-length v5, v4

    move v6, v2

    :goto_0
    if-ge v6, v5, :cond_1

    aget-object v7, v4, v6

    move-object v8, v7

    check-cast v8, Ljava/lang/Enum;

    invoke-virtual {v8}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v8

    const/4 v9, 0x1

    invoke-static {v8, p1, v9}, Lkotlin/text/StringsKt;->equals(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v8

    if-eqz v8, :cond_0

    const-string p1, "{\n    E::class.java.enum\u2026.equals(name, true) }\n  }"

    invoke-static {v7, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v7, Ljava/lang/Enum;

    goto :goto_2

    :cond_0
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/util/NoSuchElementException;

    invoke-direct {p1, v0}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    invoke-virtual {v1}, Ljava/lang/Class;->getEnumConstants()[Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    array-length v1, p1

    move v4, v2

    :goto_1
    if-ge v4, v1, :cond_3

    aget-object v5, p1, v4

    move-object v7, v5

    check-cast v7, Ljava/lang/Enum;

    invoke-virtual {v7}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v6

    const-string v8, "UNKNOWN"

    invoke-static {v6, v8}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    const-string p1, "{\n    E::class.java.enum\u2026m.name == \"UNKNOWN\" }\n  }"

    invoke-static {v5, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_2

    :cond_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_3
    new-instance p1, Ljava/util/NoSuchElementException;

    invoke-direct {p1, v0}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    move-object v7, v3

    :goto_2
    check-cast v7, Lco/bird/android/model/constant/TutorialType;

    if-nez v7, :cond_5

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void

    :cond_5
    invoke-static {}, Lco/bird/android/feature/tutorial/a;->a()Lco/bird/android/feature/tutorial/b$a;

    move-result-object p1

    sget-object v0, LoG2;->a:LoG2;

    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v1

    const-string v4, "application"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, LoG2;->a(Landroid/content/Context;)LlG2;

    move-result-object v0

    new-instance v1, LHa6;

    invoke-direct {v1, v7}, LHa6;-><init>(Lco/bird/android/model/constant/TutorialType;)V

    invoke-interface {p1, v0, v1}, Lco/bird/android/feature/tutorial/b$a;->a(LlG2;LHa6;)Lco/bird/android/feature/tutorial/b;

    move-result-object p1

    invoke-interface {p1, p0}, Lco/bird/android/feature/tutorial/b;->a(Lco/bird/android/feature/tutorial/TutorialActivity;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object p1

    invoke-static {p1}, Lo6;->c(Landroid/view/LayoutInflater;)Lo6;

    move-result-object p1

    const-string v0, "inflate(layoutInflater)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lco/bird/android/feature/tutorial/TutorialActivity;->l:Lo6;

    const-string v0, "binding"

    if-nez p1, :cond_6

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p1, v3

    :cond_6
    invoke-virtual {p1}, Lo6;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->setContentView(Landroid/view/View;)V

    invoke-virtual {p0}, Lco/bird/android/core/base/BaseCoreActivity;->D()V

    iget-object p1, p0, Lco/bird/android/feature/tutorial/TutorialActivity;->l:Lo6;

    if-nez p1, :cond_7

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p1, v3

    :cond_7
    iget-object p1, p1, Lo6;->e:Landroidx/viewpager2/widget/ViewPager2;

    new-instance v1, Lco/bird/android/feature/tutorial/TutorialActivity$a;

    invoke-direct {v1, p0}, Lco/bird/android/feature/tutorial/TutorialActivity$a;-><init>(Lco/bird/android/feature/tutorial/TutorialActivity;)V

    invoke-virtual {p1, v1}, Landroidx/viewpager2/widget/ViewPager2;->n(Landroidx/viewpager2/widget/ViewPager2$i;)V

    iget-object p1, p0, Lco/bird/android/feature/tutorial/TutorialActivity;->l:Lo6;

    if-nez p1, :cond_8

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p1, v3

    :cond_8
    iget-object p1, p1, Lo6;->e:Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {p1, v2}, Landroidx/viewpager2/widget/ViewPager2;->setUserInputEnabled(Z)V

    iget-object p1, p0, Lco/bird/android/feature/tutorial/TutorialActivity;->l:Lo6;

    if-nez p1, :cond_9

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p1, v3

    :cond_9
    iget-object p1, p1, Lo6;->e:Landroidx/viewpager2/widget/ViewPager2;

    iget-object v1, p0, Lco/bird/android/feature/tutorial/TutorialActivity;->m:LDa6;

    invoke-virtual {p1, v1}, Landroidx/viewpager2/widget/ViewPager2;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$h;)V

    iget-object p1, p0, Lco/bird/android/feature/tutorial/TutorialActivity;->l:Lo6;

    if-nez p1, :cond_a

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p1, v3

    :cond_a
    iget-object p1, p1, Lo6;->d:Lme/relex/circleindicator/CircleIndicator3;

    iget-object v1, p0, Lco/bird/android/feature/tutorial/TutorialActivity;->l:Lo6;

    if-nez v1, :cond_b

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v1, v3

    :cond_b
    iget-object v1, v1, Lo6;->e:Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {p1, v1}, Lme/relex/circleindicator/CircleIndicator3;->setViewPager(Landroidx/viewpager2/widget/ViewPager2;)V

    iget-object p1, p0, Lco/bird/android/feature/tutorial/TutorialActivity;->m:LDa6;

    new-instance v1, Lco/bird/android/feature/tutorial/TutorialActivity$b;

    invoke-direct {v1, p0}, Lco/bird/android/feature/tutorial/TutorialActivity$b;-><init>(Lco/bird/android/feature/tutorial/TutorialActivity;)V

    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/RecyclerView$h;->registerAdapterDataObserver(Landroidx/recyclerview/widget/RecyclerView$j;)V

    iget-object p1, p0, Lco/bird/android/feature/tutorial/TutorialActivity;->l:Lo6;

    if-nez p1, :cond_c

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_3

    :cond_c
    move-object v3, p1

    :goto_3
    iget-object p1, v3, Lo6;->c:Landroid/widget/Button;

    const-string v0, "binding.next"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/feature/tutorial/TutorialActivity$c;

    invoke-direct {v0, p0}, Lco/bird/android/feature/tutorial/TutorialActivity$c;-><init>(Lco/bird/android/feature/tutorial/TutorialActivity;)V

    invoke-static {p1, v0}, LMs2;->j(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0}, Lco/bird/android/feature/tutorial/TutorialActivity;->Q()LNa6;

    move-result-object p1

    invoke-virtual {p1, p0}, LNa6;->o(LOa6;)V

    return-void
.end method

.method public bridge synthetic render(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LPa6;

    invoke-virtual {p0, p1}, Lco/bird/android/feature/tutorial/TutorialActivity;->R(LPa6;)V

    return-void
.end method
