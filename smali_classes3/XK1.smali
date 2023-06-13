.class public final LXK1;
.super LxE;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0008\u0007\u0012\u0006\u0010\'\u001a\u00020&\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u00a2\u0006\u0004\u0008(\u0010)J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u0007J\u0006\u0010\n\u001a\u00020\u0005J\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u000bJ\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u000bJ\u000e\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eJ\u0017\u0010\u0012\u001a\u00020\u00052\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u0011\u0010\u001b\u001a\u00020\u00188F\u00a2\u0006\u0006\u001a\u0004\u0008\u0019\u0010\u001aR\u0011\u0010\u001d\u001a\u00020\u00188F\u00a2\u0006\u0006\u001a\u0004\u0008\u001c\u0010\u001aR\u0011\u0010\u001f\u001a\u00020\u00188F\u00a2\u0006\u0006\u001a\u0004\u0008\u001e\u0010\u001aR\u0011\u0010!\u001a\u00020\u00188F\u00a2\u0006\u0006\u001a\u0004\u0008 \u0010\u001aR\u0011\u0010%\u001a\u00020\"8F\u00a2\u0006\u0006\u001a\u0004\u0008#\u0010$\u00a8\u0006*"
    }
    d2 = {
        "LXK1;",
        "LxE;",
        "LH31;",
        "",
        "url",
        "",
        "Vl",
        "",
        "res",
        "Wl",
        "Yl",
        "Lio/reactivex/Observable;",
        "z5",
        "r0",
        "",
        "show",
        "Ul",
        "errorMessageResId",
        "Xl",
        "(Ljava/lang/Integer;)V",
        "LN3;",
        "b",
        "LN3;",
        "binding",
        "Landroid/widget/CheckBox;",
        "Pl",
        "()Landroid/widget/CheckBox;",
        "checkbox1",
        "Ql",
        "checkbox2",
        "Rl",
        "checkbox3",
        "Sl",
        "checkbox4",
        "Landroid/widget/TextView;",
        "Tl",
        "()Landroid/widget/TextView;",
        "titleText",
        "Lco/bird/android/core/mvp/BaseActivity;",
        "activity",
        "<init>",
        "(Lco/bird/android/core/mvp/BaseActivity;LN3;)V",
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
        "SMAP\nHelmetLeaseUnlockTutorialUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HelmetLeaseUnlockTutorialUi.kt\nco/bird/android/feature/itemlease/onboarding/HelmetLeaseUnlockTutorialUi\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,59:1\n1#2:60\n*E\n"
    }
.end annotation


# instance fields
.field public final b:LN3;


# direct methods
.method public constructor <init>(Lco/bird/android/core/mvp/BaseActivity;LN3;)V
    .locals 1

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "binding"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LxE;-><init>(Lco/bird/android/core/mvp/BaseActivity;)V

    iput-object p2, p0, LXK1;->b:LN3;

    return-void
.end method


# virtual methods
.method public final Pl()Landroid/widget/CheckBox;
    .locals 2

    iget-object v0, p0, LXK1;->b:LN3;

    iget-object v0, v0, LN3;->d:Landroid/widget/CheckBox;

    const-string v1, "binding.checkbox1"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final Ql()Landroid/widget/CheckBox;
    .locals 2

    iget-object v0, p0, LXK1;->b:LN3;

    iget-object v0, v0, LN3;->e:Landroid/widget/CheckBox;

    const-string v1, "binding.checkbox2"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final Rl()Landroid/widget/CheckBox;
    .locals 2

    iget-object v0, p0, LXK1;->b:LN3;

    iget-object v0, v0, LN3;->f:Landroid/widget/CheckBox;

    const-string v1, "binding.checkbox3"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final Sl()Landroid/widget/CheckBox;
    .locals 2

    iget-object v0, p0, LXK1;->b:LN3;

    iget-object v0, v0, LN3;->g:Landroid/widget/CheckBox;

    const-string v1, "binding.checkbox4"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final Tl()Landroid/widget/TextView;
    .locals 2

    iget-object v0, p0, LXK1;->b:LN3;

    iget-object v0, v0, LN3;->m:Landroid/widget/TextView;

    const-string v1, "binding.titleText"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final Ul(Z)V
    .locals 1

    invoke-virtual {p0}, LxE;->getActivity()Lco/bird/android/core/mvp/BaseActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/appcompat/app/AppCompatActivity;->getSupportActionBar()Landroidx/appcompat/app/ActionBar;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroidx/appcompat/app/ActionBar;->B(Z)V

    :cond_0
    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, Landroidx/appcompat/app/ActionBar;->v(Z)V

    :cond_1
    return-void
.end method

.method public final Vl(Ljava/lang/String;)V
    .locals 1

    const-string v0, "url"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LXK1;->b:LN3;

    iget-object v0, v0, LN3;->k:Lcom/airbnb/lottie/LottieAnimationView;

    invoke-virtual {v0, p1}, Lcom/airbnb/lottie/LottieAnimationView;->setAnimationFromUrl(Ljava/lang/String;)V

    return-void
.end method

.method public final Wl(I)V
    .locals 2

    iget-object v0, p0, LXK1;->b:LN3;

    iget-object v0, v0, LN3;->k:Lcom/airbnb/lottie/LottieAnimationView;

    invoke-virtual {v0, p1}, Lcom/airbnb/lottie/LottieAnimationView;->setImageResource(I)V

    iget-object p1, p0, LXK1;->b:LN3;

    iget-object p1, p1, LN3;->k:Lcom/airbnb/lottie/LottieAnimationView;

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    instance-of v0, p1, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;

    if-eqz v0, :cond_0

    check-cast p1, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    const/4 v0, 0x0

    iput v0, p1, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    const/4 v1, 0x1

    iput-boolean v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;->b0:Z

    const-string v1, "375:281"

    iput-object v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;->I:Ljava/lang/String;

    iput v0, p1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    :cond_1
    return-void
.end method

.method public final Xl(Ljava/lang/Integer;)V
    .locals 5

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    move v1, v0

    :goto_0
    const-string v2, "binding.bluetoothUnavailableMessageText"

    if-eqz p1, :cond_1

    iget-object v3, p0, LXK1;->b:LN3;

    iget-object v3, v3, LN3;->b:Landroid/widget/TextView;

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-virtual {v3, p1}, Landroid/widget/TextView;->setText(I)V

    :cond_1
    iget-object p1, p0, LXK1;->b:LN3;

    iget-object p1, p1, LN3;->c:Landroid/widget/TextView;

    const-string v3, "binding.bluetoothUnavailableTitleText"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-static {p1, v1, v0, v3, v4}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    iget-object p1, p0, LXK1;->b:LN3;

    iget-object p1, p1, LN3;->b:Landroid/widget/TextView;

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v1, v0, v3, v4}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    return-void
.end method

.method public final Yl()V
    .locals 2

    iget-object v0, p0, LXK1;->b:LN3;

    iget-object v0, v0, LN3;->h:Landroid/widget/Button;

    const-string v1, "binding.continueButton"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Ltu6;->r(Landroid/view/View;)V

    return-void
.end method

.method public final r0()Lio/reactivex/Observable;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LXK1;->b:LN3;

    iget-object v0, v0, LN3;->j:Landroid/widget/Button;

    const-string v1, "binding.helpButton"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x1

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    invoke-static {v0, v3, v4, v1, v2}, Llf5;->clicksThrottle$default(Landroid/view/View;JILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public final z5()Lio/reactivex/Observable;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LXK1;->b:LN3;

    iget-object v0, v0, LN3;->h:Landroid/widget/Button;

    const-string v1, "binding.continueButton"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x1

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    invoke-static {v0, v3, v4, v1, v2}, Llf5;->clicksThrottle$default(Landroid/view/View;JILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method
