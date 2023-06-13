.class public final Lco/bird/android/feature/localssurvey/LocalsSurveyActivity;
.super Lco/bird/android/core/mrp/BaseActivityLite;
.source "SourceFile"

# interfaces
.implements LSv2;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\u00a2\u0006\u0004\u0008$\u0010%J\u0012\u0010\u0006\u001a\u00020\u00052\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014J\u0008\u0010\u0007\u001a\u00020\u0005H\u0016J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0008H\u0016R\"\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008\u000c\u0010\r\u001a\u0004\u0008\u000e\u0010\u000f\"\u0004\u0008\u0010\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R!\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u00050\u001b8VX\u0096\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u001d\u001a\u0004\u0008\u001e\u0010\u001fR!\u0010#\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u001b8VX\u0096\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008!\u0010\u001d\u001a\u0004\u0008\"\u0010\u001f\u00a8\u0006&"
    }
    d2 = {
        "Lco/bird/android/feature/localssurvey/LocalsSurveyActivity;",
        "Lco/bird/android/core/mrp/BaseActivityLite;",
        "LSv2;",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "",
        "onCreate",
        "onBackPressed",
        "LTv2;",
        "state",
        "Q",
        "LRv2;",
        "j",
        "LRv2;",
        "P",
        "()LRv2;",
        "setPresenter",
        "(LRv2;)V",
        "presenter",
        "Li4;",
        "k",
        "Li4;",
        "binding",
        "Lcom/google/android/libraries/places/widget/AutocompleteSupportFragment;",
        "l",
        "Lcom/google/android/libraries/places/widget/AutocompleteSupportFragment;",
        "autocompleteSupportFragment",
        "Lio/reactivex/Observable;",
        "m",
        "Lkotlin/Lazy;",
        "w8",
        "()Lio/reactivex/Observable;",
        "nextClicks",
        "n",
        "L",
        "skipClicks",
        "<init>",
        "()V",
        "locals-survey_release"
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
        "SMAP\nLocalsSurveyActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalsSurveyActivity.kt\nco/bird/android/feature/localssurvey/LocalsSurveyActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,74:1\n1#2:75\n*E\n"
    }
.end annotation


# instance fields
.field public j:LRv2;

.field public k:Li4;

.field public l:Lcom/google/android/libraries/places/widget/AutocompleteSupportFragment;

.field public final m:Lkotlin/Lazy;

.field public final n:Lkotlin/Lazy;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lco/bird/android/core/mrp/BaseActivityLite;-><init>()V

    new-instance v0, Lco/bird/android/feature/localssurvey/LocalsSurveyActivity$a;

    invoke-direct {v0, p0}, Lco/bird/android/feature/localssurvey/LocalsSurveyActivity$a;-><init>(Lco/bird/android/feature/localssurvey/LocalsSurveyActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lco/bird/android/feature/localssurvey/LocalsSurveyActivity;->m:Lkotlin/Lazy;

    new-instance v0, Lco/bird/android/feature/localssurvey/LocalsSurveyActivity$b;

    invoke-direct {v0, p0}, Lco/bird/android/feature/localssurvey/LocalsSurveyActivity$b;-><init>(Lco/bird/android/feature/localssurvey/LocalsSurveyActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lco/bird/android/feature/localssurvey/LocalsSurveyActivity;->n:Lkotlin/Lazy;

    return-void
.end method

.method public static final synthetic access$getBinding$p(Lco/bird/android/feature/localssurvey/LocalsSurveyActivity;)Li4;
    .locals 0

    iget-object p0, p0, Lco/bird/android/feature/localssurvey/LocalsSurveyActivity;->k:Li4;

    return-object p0
.end method


# virtual methods
.method public L()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/feature/localssurvey/LocalsSurveyActivity;->n:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/reactivex/Observable;

    return-object v0
.end method

.method public final P()LRv2;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/localssurvey/LocalsSurveyActivity;->j:LRv2;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "presenter"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public Q(LTv2;)V
    .locals 4

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, LWT3;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lco/bird/android/core/mrp/BaseActivityLite;->F()Lsx4;

    move-result-object v0

    invoke-virtual {v0}, LXC;->hideKeyboard()V

    check-cast p1, LWT3;

    invoke-virtual {p1}, LWT3;->b()Lcom/google/android/gms/common/api/Status;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/Status;->getStatusMessage()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_6

    invoke-virtual {p0}, Lco/bird/android/core/mrp/BaseActivityLite;->F()Lsx4;

    move-result-object v0

    invoke-virtual {v0, p1}, LXC;->snackToast(Ljava/lang/String;)V

    goto :goto_1

    :cond_0
    instance-of v0, p1, LNU3;

    const-string v1, "autocompleteSupportFragment"

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v0, :cond_4

    invoke-virtual {p0}, Lco/bird/android/core/mrp/BaseActivityLite;->F()Lsx4;

    move-result-object v0

    invoke-virtual {v0}, LXC;->hideKeyboard()V

    iget-object v0, p0, Lco/bird/android/feature/localssurvey/LocalsSurveyActivity;->k:Li4;

    if-nez v0, :cond_1

    const-string v0, "binding"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v3

    :cond_1
    iget-object v0, v0, Li4;->c:Landroid/widget/Button;

    invoke-virtual {v0, v2}, Landroid/view/View;->setEnabled(Z)V

    iget-object v0, p0, Lco/bird/android/feature/localssurvey/LocalsSurveyActivity;->l:Lcom/google/android/libraries/places/widget/AutocompleteSupportFragment;

    if-nez v0, :cond_2

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v3

    :cond_2
    check-cast p1, LNU3;

    invoke-virtual {p1}, LNU3;->b()Lcom/google/android/libraries/places/api/model/Place;

    move-result-object p1

    invoke-static {p1}, LLi1;->b(Lcom/google/android/libraries/places/api/model/Place;)Lcom/google/android/libraries/places/api/model/AddressComponent;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lcom/google/android/libraries/places/api/model/AddressComponent;->getName()Ljava/lang/String;

    move-result-object v3

    :cond_3
    invoke-virtual {v0, v3}, Lcom/google/android/libraries/places/widget/AutocompleteSupportFragment;->setText(Ljava/lang/CharSequence;)Lcom/google/android/libraries/places/widget/AutocompleteSupportFragment;

    goto :goto_1

    :cond_4
    instance-of p1, p1, LMU3;

    if-eqz p1, :cond_6

    invoke-virtual {p0}, Lco/bird/android/core/mrp/BaseActivityLite;->F()Lsx4;

    move-result-object p1

    sget v0, Lnl4;->please_enter_a_valid_postal_code:I

    invoke-virtual {p1, v0}, LXC;->error(I)V

    iget-object p1, p0, Lco/bird/android/feature/localssurvey/LocalsSurveyActivity;->l:Lcom/google/android/libraries/places/widget/AutocompleteSupportFragment;

    if-nez p1, :cond_5

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_0

    :cond_5
    move-object v3, p1

    :goto_0
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->requireView()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1, v2}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    :cond_6
    :goto_1
    return-void
.end method

.method public onBackPressed()V
    .locals 2

    invoke-virtual {p0}, Lco/bird/android/feature/localssurvey/LocalsSurveyActivity;->P()LRv2;

    move-result-object v0

    sget-object v1, Lc0;->a:Lc0;

    invoke-virtual {v0, v1}, Lf1;->h(Ljava/lang/Object;)V

    invoke-super {p0}, Lco/bird/android/core/base/BaseCoreActivity;->onBackPressed()V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    invoke-super {p0, p1}, Lco/bird/android/core/mrp/BaseActivityLite;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object p1

    invoke-static {p1}, Li4;->c(Landroid/view/LayoutInflater;)Li4;

    move-result-object p1

    const-string v0, "inflate(layoutInflater)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lco/bird/android/feature/localssurvey/LocalsSurveyActivity;->k:Li4;

    const/4 v0, 0x0

    if-nez p1, :cond_0

    const-string p1, "binding"

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p1, v0

    :cond_0
    invoke-virtual {p1}, Li4;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->setContentView(Landroid/view/View;)V

    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object p1

    sget v1, Lxh4;->autocomplete_fragment:I

    invoke-virtual {p1, v1}, Landroidx/fragment/app/FragmentManager;->l0(I)Landroidx/fragment/app/Fragment;

    move-result-object p1

    const-string v1, "null cannot be cast to non-null type com.google.android.libraries.places.widget.AutocompleteSupportFragment"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/google/android/libraries/places/widget/AutocompleteSupportFragment;

    iput-object p1, p0, Lco/bird/android/feature/localssurvey/LocalsSurveyActivity;->l:Lcom/google/android/libraries/places/widget/AutocompleteSupportFragment;

    invoke-static {}, Lco/bird/android/feature/localssurvey/a;->a()Lco/bird/android/feature/localssurvey/b$a;

    move-result-object p1

    invoke-virtual {p0}, Lco/bird/android/core/mrp/BaseActivityLite;->H()LlG2;

    move-result-object v1

    iget-object v2, p0, Lco/bird/android/feature/localssurvey/LocalsSurveyActivity;->l:Lcom/google/android/libraries/places/widget/AutocompleteSupportFragment;

    if-nez v2, :cond_1

    const-string v2, "autocompleteSupportFragment"

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    move-object v0, v2

    :goto_0
    invoke-interface {p1, v1, v0}, Lco/bird/android/feature/localssurvey/b$a;->a(LlG2;Lcom/google/android/libraries/places/widget/AutocompleteSupportFragment;)Lco/bird/android/feature/localssurvey/b;

    move-result-object p1

    invoke-interface {p1, p0}, Lco/bird/android/feature/localssurvey/b;->a(Lco/bird/android/feature/localssurvey/LocalsSurveyActivity;)V

    invoke-virtual {p0}, Lco/bird/android/feature/localssurvey/LocalsSurveyActivity;->P()LRv2;

    move-result-object p1

    invoke-virtual {p1, p0}, LRv2;->r(LSv2;)V

    invoke-virtual {p0}, Lco/bird/android/feature/localssurvey/LocalsSurveyActivity;->P()LRv2;

    move-result-object p1

    new-instance v0, LyO5;

    sget v1, Lnl4;->enter_your_postal_code:I

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "getString(L.string.enter_your_postal_code)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v1}, LyO5;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lf1;->h(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic render(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LTv2;

    invoke-virtual {p0, p1}, Lco/bird/android/feature/localssurvey/LocalsSurveyActivity;->Q(LTv2;)V

    return-void
.end method

.method public w8()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/feature/localssurvey/LocalsSurveyActivity;->m:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/reactivex/Observable;

    return-object v0
.end method
