.class public final LTx6$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LTx6;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static a(LTx6;)Lio/reactivex/Observable;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LTx6;",
            ")",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    invoke-interface {p0}, LTx6;->d7()Lco/bird/android/widget/BlockingEnterLocationView;

    move-result-object p0

    invoke-virtual {p0}, Lco/bird/android/widget/BlockingEnterLocationView;->a()Landroid/widget/Button;

    move-result-object p0

    const/4 v0, 0x1

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    invoke-static {p0, v2, v3, v0, v1}, Llf5;->clicksThrottle$default(Landroid/view/View;JILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p0

    return-object p0
.end method

.method public static b(LTx6;)Lio/reactivex/Observable;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LTx6;",
            ")",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    invoke-interface {p0}, LTx6;->p1()Lco/bird/android/widget/OperatorInfoCard;

    move-result-object p0

    const/4 v0, 0x1

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    invoke-static {p0, v2, v3, v0, v1}, Llf5;->clicksThrottle$default(Landroid/view/View;JILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p0

    return-object p0
.end method

.method public static c(LTx6;LUx6;)V
    .locals 5

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, LTx6;->d7()Lco/bird/android/widget/BlockingEnterLocationView;

    move-result-object v0

    invoke-virtual {p1}, LUx6;->c()Z

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-static {v0, v1, v2, v3, v4}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    invoke-interface {p0}, LTx6;->p1()Lco/bird/android/widget/OperatorInfoCard;

    move-result-object v0

    invoke-virtual {p1}, LUx6;->e()Lco/bird/android/model/User;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {p1}, LUx6;->f()Lco/bird/android/model/Warehouse;

    move-result-object v1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    invoke-static {v0, v1, v2, v3, v4}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    invoke-interface {p0}, LTx6;->p1()Lco/bird/android/widget/OperatorInfoCard;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/widget/OperatorInfoCard;->f()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {p1}, LUx6;->e()Lco/bird/android/model/User;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lco/bird/android/model/User;->getName()Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_1
    move-object v1, v4

    :goto_1
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-interface {p0}, LTx6;->p1()Lco/bird/android/widget/OperatorInfoCard;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/widget/OperatorInfoCard;->g()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {p1}, LUx6;->f()Lco/bird/android/model/Warehouse;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lco/bird/android/model/Warehouse;->getName()Ljava/lang/String;

    move-result-object v4

    :cond_2
    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p1}, LUx6;->e()Lco/bird/android/model/User;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lco/bird/android/model/User;->getImageUrl()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-interface {p0}, LTx6;->p1()Lco/bird/android/widget/OperatorInfoCard;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/bumptech/glide/a;->t(Landroid/content/Context;)LUI4;

    move-result-object v1

    invoke-virtual {v1, v0}, LUI4;->k(Ljava/lang/String;)LrI4;

    move-result-object v0

    invoke-interface {p0}, LTx6;->p1()Lco/bird/android/widget/OperatorInfoCard;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/widget/OperatorInfoCard;->e()Landroid/widget/ImageView;

    move-result-object v1

    invoke-virtual {v0, v1}, LrI4;->R0(Landroid/widget/ImageView;)LIt6;

    :cond_3
    invoke-virtual {p1}, LUx6;->d()Lco/bird/android/model/Warehouse;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {p1}, LUx6;->f()Lco/bird/android/model/Warehouse;

    move-result-object v1

    if-eqz v1, :cond_4

    sget-object v1, Ljz6;->e:Ljz6$a;

    invoke-virtual {p1}, LUx6;->f()Lco/bird/android/model/Warehouse;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Ljz6$a;->a(Lco/bird/android/model/Warehouse;Lco/bird/android/model/Warehouse;)Ljz6;

    move-result-object v0

    invoke-interface {p0}, LTx6;->getActivity()Landroidx/appcompat/app/AppCompatActivity;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v1

    const-string v2, "WarehouseVerificationBottomSheet"

    invoke-virtual {v0, v1, v2}, Landroidx/fragment/app/c;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    new-instance v1, LTx6$a$a;

    invoke-interface {p0}, LTx6;->a7()Lma4;

    move-result-object v2

    invoke-direct {v1, v2}, LTx6$a$a;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Ljz6;->t8(Lkotlin/jvm/functions/Function1;)V

    goto :goto_2

    :cond_4
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Required value was null."

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_5
    :goto_2
    invoke-virtual {p1}, LUx6;->b()Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_6

    invoke-interface {p0}, LTx6;->w1()Lsx4;

    move-result-object p0

    invoke-static {p0, p1}, Lbg5;->c(LXC;Ljava/lang/Throwable;)V

    :cond_6
    return-void
.end method

.method public static d(LTx6;)Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LTx6;",
            ")",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/model/DialogResponse;",
            ">;"
        }
    .end annotation

    invoke-interface {p0}, LTx6;->a7()Lma4;

    move-result-object p0

    invoke-virtual {p0}, Lio/reactivex/Observable;->hide()Lio/reactivex/Observable;

    move-result-object p0

    const-string v0, "warehouseVerificationRelay.hide()"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method
