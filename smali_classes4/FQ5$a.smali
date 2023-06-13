.class public final LFQ5$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LFQ5;
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
.method public static a(LFQ5;)V
    .locals 1

    invoke-interface {p0}, LFQ5;->oc()LnQ5;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/fragment/app/c;->dismiss()V

    :cond_0
    const/4 v0, 0x0

    invoke-interface {p0, v0}, LFQ5;->x7(LnQ5;)V

    return-void
.end method

.method public static b(LFQ5;)LS74;
    .locals 0

    invoke-interface {p0}, LFQ5;->oc()LnQ5;

    move-result-object p0

    return-object p0
.end method

.method public static c(LFQ5;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LFQ5;",
            "Ljava/util/List<",
            "LH6;",
            ">;)V"
        }
    .end annotation

    const-string v0, "sections"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, LFQ5;->oc()LnQ5;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0, p1}, LnQ5;->t8(Ljava/util/List;)V

    :cond_0
    return-void
.end method

.method public static d(LFQ5;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LFQ5;",
            "Ljava/util/List<",
            "LH6;",
            ">;)V"
        }
    .end annotation

    const-string v0, "sections"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, LFQ5;->oc()LnQ5;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0, p1}, LnQ5;->A9(Ljava/util/List;)V

    :cond_0
    return-void
.end method

.method public static e(LFQ5;Lco/bird/android/widget/adapter/ViewHolderSupplier;)Lio/reactivex/Observable;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LFQ5;",
            "Lco/bird/android/widget/adapter/ViewHolderSupplier<",
            "LeT0;",
            ">;)",
            "Lio/reactivex/Observable<",
            "LnQ5$b;",
            ">;"
        }
    .end annotation

    const-string v0, "viewHolderSupplier"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, LFQ5;->oc()LnQ5;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, LnQ5;->f:LnQ5$a;

    invoke-virtual {v0, p1}, LnQ5$a;->a(Lco/bird/android/widget/adapter/ViewHolderSupplier;)LnQ5;

    move-result-object v0

    :cond_0
    invoke-interface {p0}, LFQ5;->oc()LnQ5;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    invoke-interface {p0}, LFQ5;->getActivity()Lco/bird/android/core/mvp/BaseActivity;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object p1

    const-string v1, "full_screen_status_dialog"

    invoke-virtual {v0, p1, v1}, Landroidx/fragment/app/c;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    :cond_1
    invoke-interface {p0, v0}, LFQ5;->x7(LnQ5;)V

    const/4 p0, 0x2

    const/4 p1, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2, p0, p1}, LS74$a;->showProgress$default(LS74;ZIILjava/lang/Object;)V

    invoke-virtual {v0}, LnQ5;->a5()Lio/reactivex/Observable;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic showStatusDialog$default(LFQ5;Lco/bird/android/widget/adapter/ViewHolderSupplier;ILjava/lang/Object;)Lio/reactivex/Observable;
    .locals 0

    if-nez p3, :cond_1

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    new-instance p1, Lco/bird/android/statusdialog/adapters/StatusViewHolderSupplier;

    invoke-direct {p1}, Lco/bird/android/statusdialog/adapters/StatusViewHolderSupplier;-><init>()V

    :cond_0
    invoke-interface {p0, p1}, LFQ5;->ig(Lco/bird/android/widget/adapter/ViewHolderSupplier;)Lio/reactivex/Observable;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: showStatusDialog"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
