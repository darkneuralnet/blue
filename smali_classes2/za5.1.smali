.class public final Lza5;
.super LxE;
.source "SourceFile"

# interfaces
.implements Lya5;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\u001a\u001a\u00020\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u00a2\u0006\u0004\u0008!\u0010\"J\u0018\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u000e\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00070\tH\u0016J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000cH\u0016J\u0010\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000cH\u0016J$\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u00152\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0014\u001a\u00020\u000cH\u0016R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001d\u00a8\u0006#"
    }
    d2 = {
        "Lza5;",
        "Lya5;",
        "LxE;",
        "",
        "show",
        "",
        "hiddenState",
        "",
        "showProgress",
        "Lio/reactivex/Observable;",
        "V0",
        "Fi",
        "",
        "label",
        "kf",
        "imageUrl",
        "N9",
        "",
        "LB1;",
        "options",
        "title",
        "Lio/reactivex/p;",
        "Ka",
        "Lco/bird/android/widget/PillDropdownButton;",
        "b",
        "Lco/bird/android/widget/PillDropdownButton;",
        "pillDropdownButton",
        "Landroid/widget/ProgressBar;",
        "c",
        "Landroid/widget/ProgressBar;",
        "progressBar",
        "Lco/bird/android/core/mvp/BaseActivity;",
        "activity",
        "<init>",
        "(Lco/bird/android/core/mvp/BaseActivity;Lco/bird/android/widget/PillDropdownButton;Landroid/widget/ProgressBar;)V",
        "app_birdRelease"
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
        "SMAP\nRiderProfileUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RiderProfileUi.kt\nco/bird/android/app/feature/riderprofile/ui/RiderProfileUiImpl\n+ 2 BottomSheet.kt\nco/bird/android/widget/BottomSheetKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 BottomSheet.kt\nco/bird/android/widget/BottomSheetKt$showBottomSheetOptions$1\n*L\n1#1,66:1\n64#2,9:67\n73#2,4:80\n819#3:76\n847#3:77\n848#3:79\n66#4:78\n*S KotlinDebug\n*F\n+ 1 RiderProfileUi.kt\nco/bird/android/app/feature/riderprofile/ui/RiderProfileUiImpl\n*L\n58#1:67,9\n58#1:80,4\n58#1:76\n58#1:77\n58#1:79\n58#1:78\n*E\n"
    }
.end annotation


# instance fields
.field public final b:Lco/bird/android/widget/PillDropdownButton;

.field public final c:Landroid/widget/ProgressBar;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lco/bird/android/core/mvp/BaseActivity;Lco/bird/android/widget/PillDropdownButton;Landroid/widget/ProgressBar;)V
    .locals 1

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pillDropdownButton"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "progressBar"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LxE;-><init>(Lco/bird/android/core/mvp/BaseActivity;)V

    iput-object p2, p0, Lza5;->b:Lco/bird/android/widget/PillDropdownButton;

    iput-object p3, p0, Lza5;->c:Landroid/widget/ProgressBar;

    return-void
.end method


# virtual methods
.method public Fi(Z)V
    .locals 4

    iget-object v0, p0, Lza5;->b:Lco/bird/android/widget/PillDropdownButton;

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, p1, v3, v1, v2}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    return-void
.end method

.method public Ka(Ljava/util/List;Ljava/lang/String;)Lio/reactivex/p;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "LB1;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/p<",
            "LB1;",
            ">;"
        }
    .end annotation

    const-string v0, "options"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LxE;->getActivity()Lco/bird/android/core/mvp/BaseActivity;

    move-result-object v0

    sget-object v1, Lco/bird/android/widget/BottomSheetOptionLayout$a;->d:Lco/bird/android/widget/BottomSheetOptionLayout$a;

    check-cast p1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lco/bird/android/widget/d;

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance p1, Lco/bird/android/widget/e;

    invoke-direct {p1}, Lco/bird/android/widget/e;-><init>()V

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-static {v1, p2, v3, v4, v2}, Lco/bird/android/widget/a;->a(Lco/bird/android/widget/BottomSheetOptionLayout$a;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;)Landroid/os/Bundle;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object p2

    const-string v0, "BottomSheetOptionFragment"

    invoke-virtual {p1, p2, v0}, Landroidx/fragment/app/c;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/widget/e;->D9()Lio/reactivex/p;

    move-result-object p1

    new-instance p2, Lza5$a;

    invoke-direct {p2, v2}, Lza5$a;-><init>(Ljava/util/List;)V

    new-instance v0, Lco/bird/android/widget/a$h;

    invoke-direct {v0, p2}, Lco/bird/android/widget/a$h;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v0}, Lio/reactivex/p;->H(Lio/reactivex/functions/o;)Lio/reactivex/p;

    move-result-object p1

    const-string p2, "with(BottomSheetOptionFr\u2026).map { options[it] }\n  }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public N9(Ljava/lang/String;)V
    .locals 1

    const-string v0, "imageUrl"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lza5;->b:Lco/bird/android/widget/PillDropdownButton;

    invoke-virtual {v0, p1}, Lco/bird/android/widget/PillDropdownButton;->setIcon(Ljava/lang/String;)V

    return-void
.end method

.method public V0()Lio/reactivex/Observable;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lza5;->b:Lco/bird/android/widget/PillDropdownButton;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    invoke-static {v0, v3, v4, v1, v2}, Llf5;->clicksThrottle$default(Landroid/view/View;JILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public kf(Ljava/lang/String;)V
    .locals 1

    const-string v0, "label"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lza5;->b:Lco/bird/android/widget/PillDropdownButton;

    invoke-virtual {v0, p1}, Lco/bird/android/widget/PillDropdownButton;->setLabel(Ljava/lang/String;)V

    return-void
.end method

.method public showProgress(ZI)V
    .locals 1

    iget-object v0, p0, Lza5;->c:Landroid/widget/ProgressBar;

    invoke-static {v0, p1, p2}, Ltu6;->s(Landroid/view/View;ZI)V

    return-void
.end method
