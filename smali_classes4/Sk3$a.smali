.class public final LSk3$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LSk3;
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

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nOperatorInfoCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorInfoCard.kt\nco/bird/android/widget/OperatorCardUi$DefaultImpls\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,61:1\n1#2:62\n*E\n"
    }
.end annotation


# direct methods
.method public static a(LSk3;)Lio/reactivex/Observable;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LSk3;",
            ")",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    invoke-interface {p0}, LSk3;->p1()Lco/bird/android/widget/OperatorInfoCard;

    move-result-object p0

    const/4 v0, 0x1

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    invoke-static {p0, v2, v3, v0, v1}, Llf5;->clicksThrottle$default(Landroid/view/View;JILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p0

    return-object p0
.end method

.method public static b(LSk3;Lco/bird/android/model/User;)V
    .locals 1

    const-string v0, "user"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/model/User;->getImageUrl()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {p0, v0}, LSk3;->I9(Ljava/lang/String;)V

    :cond_0
    invoke-virtual {p1}, Lco/bird/android/model/User;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p1}, LSk3;->z7(Ljava/lang/String;)V

    return-void
.end method

.method public static c(LSk3;Lco/bird/android/model/Warehouse;)V
    .locals 0

    invoke-interface {p0}, LSk3;->p1()Lco/bird/android/widget/OperatorInfoCard;

    move-result-object p0

    invoke-virtual {p0}, Lco/bird/android/widget/OperatorInfoCard;->g()Landroid/widget/TextView;

    move-result-object p0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lco/bird/android/model/Warehouse;->getName()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public static d(LSk3;Ljava/lang/String;)V
    .locals 0

    invoke-interface {p0}, LSk3;->p1()Lco/bird/android/widget/OperatorInfoCard;

    move-result-object p0

    invoke-virtual {p0}, Lco/bird/android/widget/OperatorInfoCard;->f()Landroid/widget/TextView;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public static e(LSk3;Ljava/lang/String;)V
    .locals 1

    const-string v0, "imageUrl"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, LSk3;->p1()Lco/bird/android/widget/OperatorInfoCard;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/bumptech/glide/a;->t(Landroid/content/Context;)LUI4;

    move-result-object v0

    invoke-virtual {v0, p1}, LUI4;->k(Ljava/lang/String;)LrI4;

    move-result-object p1

    invoke-interface {p0}, LSk3;->p1()Lco/bird/android/widget/OperatorInfoCard;

    move-result-object p0

    invoke-virtual {p0}, Lco/bird/android/widget/OperatorInfoCard;->e()Landroid/widget/ImageView;

    move-result-object p0

    invoke-virtual {p1, p0}, LrI4;->R0(Landroid/widget/ImageView;)LIt6;

    return-void
.end method

.method public static f(LSk3;Z)V
    .locals 3

    invoke-interface {p0}, LSk3;->p1()Lco/bird/android/widget/OperatorInfoCard;

    move-result-object p0

    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p0, p1, v2, v0, v1}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    return-void
.end method
