.class public final Lco/bird/android/feature/savemoney/SaveMoneyActivity;
.super Lco/bird/android/core/mrp/BaseActivityLite;
.source "SourceFile"

# interfaces
.implements LAi5;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\n\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\u00a2\u0006\u0004\u0008%\u0010&J\u0012\u0010\u0006\u001a\u00020\u00052\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u0007H\u0016J\u000e\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\nH\u0016R\"\u0010\u0014\u001a\u00020\r8\u0006@\u0006X\u0086.\u00a2\u0006\u0012\n\u0004\u0008\u000e\u0010\u000f\u001a\u0004\u0008\u0010\u0010\u0011\"\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\"\u0010$\u001a\u00020\u001d8\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008\u001e\u0010\u001f\u001a\u0004\u0008 \u0010!\"\u0004\u0008\"\u0010#\u00a8\u0006\'"
    }
    d2 = {
        "Lco/bird/android/feature/savemoney/SaveMoneyActivity;",
        "Lco/bird/android/core/mrp/BaseActivityLite;",
        "LAi5;",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "",
        "onCreate",
        "LDi5;",
        "state",
        "R",
        "Lio/reactivex/Observable;",
        "Lhi5;",
        "R5",
        "LT5;",
        "j",
        "LT5;",
        "P",
        "()LT5;",
        "S",
        "(LT5;)V",
        "binding",
        "Lei5;",
        "k",
        "Lei5;",
        "adapter",
        "Lii5;",
        "l",
        "Lii5;",
        "converter",
        "Lzi5;",
        "m",
        "Lzi5;",
        "Q",
        "()Lzi5;",
        "setPresenter",
        "(Lzi5;)V",
        "presenter",
        "<init>",
        "()V",
        "save-money_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public j:LT5;

.field public final k:Lei5;

.field public final l:Lii5;

.field public m:Lzi5;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lco/bird/android/core/mrp/BaseActivityLite;-><init>()V

    new-instance v0, Lei5;

    invoke-direct {v0}, Lei5;-><init>()V

    iput-object v0, p0, Lco/bird/android/feature/savemoney/SaveMoneyActivity;->k:Lei5;

    new-instance v0, Lii5;

    invoke-direct {v0}, Lii5;-><init>()V

    iput-object v0, p0, Lco/bird/android/feature/savemoney/SaveMoneyActivity;->l:Lii5;

    return-void
.end method


# virtual methods
.method public final P()LT5;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/savemoney/SaveMoneyActivity;->j:LT5;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "binding"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final Q()Lzi5;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/savemoney/SaveMoneyActivity;->m:Lzi5;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "presenter"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public R(LDi5;)V
    .locals 2

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lug0;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lco/bird/android/feature/savemoney/SaveMoneyActivity;->k:Lei5;

    iget-object v1, p0, Lco/bird/android/feature/savemoney/SaveMoneyActivity;->l:Lii5;

    check-cast p1, Lug0;

    invoke-virtual {p1}, Lug0;->b()Ljava/util/List;

    move-result-object p1

    invoke-virtual {v1, p1}, Lii5;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    invoke-virtual {v0, p1}, LMy;->u(Ljava/util/Collection;)V

    :cond_0
    return-void
.end method

.method public R5()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lhi5;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/feature/savemoney/SaveMoneyActivity;->k:Lei5;

    invoke-virtual {v0}, Lei5;->v()Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public final S(LT5;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lco/bird/android/feature/savemoney/SaveMoneyActivity;->j:LT5;

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    invoke-super {p0, p1}, Lco/bird/android/core/mrp/BaseActivityLite;->onCreate(Landroid/os/Bundle;)V

    invoke-static {}, Lco/bird/android/feature/savemoney/a;->a()Lco/bird/android/feature/savemoney/b$a;

    move-result-object p1

    invoke-virtual {p0}, Lco/bird/android/core/mrp/BaseActivityLite;->H()LlG2;

    move-result-object v0

    invoke-interface {p1, v0}, Lco/bird/android/feature/savemoney/b$a;->a(LlG2;)Lco/bird/android/feature/savemoney/b;

    move-result-object p1

    invoke-interface {p1, p0}, Lco/bird/android/feature/savemoney/b;->a(Lco/bird/android/feature/savemoney/SaveMoneyActivity;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object p1

    invoke-static {p1}, LT5;->c(Landroid/view/LayoutInflater;)LT5;

    move-result-object p1

    const-string v0, "inflate(layoutInflater)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lco/bird/android/feature/savemoney/SaveMoneyActivity;->S(LT5;)V

    invoke-virtual {p0}, Lco/bird/android/feature/savemoney/SaveMoneyActivity;->P()LT5;

    move-result-object p1

    iget-object p1, p1, LT5;->b:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, p0, Lco/bird/android/feature/savemoney/SaveMoneyActivity;->k:Lei5;

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$h;)V

    invoke-virtual {p0}, Lco/bird/android/feature/savemoney/SaveMoneyActivity;->P()LT5;

    move-result-object p1

    invoke-virtual {p1}, LT5;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->setContentView(Landroid/view/View;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_0

    const-string v0, "source"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p0}, Lco/bird/android/feature/savemoney/SaveMoneyActivity;->Q()Lzi5;

    move-result-object v0

    invoke-virtual {v0, p1}, Lzi5;->K(Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/feature/savemoney/SaveMoneyActivity;->Q()Lzi5;

    move-result-object p1

    invoke-virtual {p1, p0}, Lzi5;->x(LAi5;)V

    return-void
.end method

.method public bridge synthetic render(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LDi5;

    invoke-virtual {p0, p1}, Lco/bird/android/feature/savemoney/SaveMoneyActivity;->R(LDi5;)V

    return-void
.end method
