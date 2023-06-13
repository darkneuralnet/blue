.class public final LeM1;
.super LcE;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LeM1$a;,
        LeM1$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LcE<",
        "LvM1;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u000f\u0018\u0000 \u00132\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0014\u0015B\u0007\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001a\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\u0008\u0010\t\u001a\u00020\u0007H\u0016R\"\u0010\u0010\u001a\u00020\u00028\u0016@\u0016X\u0097.\u00a2\u0006\u0012\n\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\u000c\u0010\r\"\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0016"
    }
    d2 = {
        "LeM1;",
        "LcE;",
        "LvM1;",
        "Landroid/view/View;",
        "view",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "",
        "onViewCreated",
        "onResume",
        "e",
        "LvM1;",
        "a5",
        "()LvM1;",
        "N6",
        "(LvM1;)V",
        "presenter",
        "<init>",
        "()V",
        "f",
        "a",
        "b",
        "hibernation-scan_release"
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
        "SMAP\nHibernationScanBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HibernationScanBottomSheet.kt\nco/bird/android/feature/hibernationscan/HibernationScanBottomSheet\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,71:1\n64#2:72\n*S KotlinDebug\n*F\n+ 1 HibernationScanBottomSheet.kt\nco/bird/android/feature/hibernationscan/HibernationScanBottomSheet\n*L\n38#1:72\n*E\n"
    }
.end annotation


# static fields
.field public static final f:LeM1$a;


# instance fields
.field public e:LvM1;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LeM1$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LeM1$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LeM1;->f:LeM1$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LcE;-><init>()V

    return-void
.end method


# virtual methods
.method public N6(LvM1;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LeM1;->e:LvM1;

    return-void
.end method

.method public a5()LvM1;
    .locals 1

    iget-object v0, p0, LeM1;->e:LvM1;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "presenter"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public bridge synthetic getPresenter()LiE;
    .locals 1

    invoke-virtual {p0}, LeM1;->a5()LvM1;

    move-result-object v0

    return-object v0
.end method

.method public onResume()V
    .locals 3

    invoke-super {p0}, LcE;->onResume()V

    invoke-virtual {p0}, LeM1;->a5()LvM1;

    move-result-object v0

    sget-object v1, Lco/bird/android/model/constant/ScanMode;->ADMIN:Lco/bird/android/model/constant/ScanMode;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, LvM1;->V(Lco/bird/android/model/constant/ScanMode;Lco/bird/android/model/constant/ScanIntention;)V

    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 9

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Landroidx/fragment/app/Fragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p2

    instance-of v0, p2, Lco/bird/android/core/mvp/BaseActivity;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p2, Lco/bird/android/core/mvp/BaseActivity;

    move-object v4, p2

    goto :goto_0

    :cond_0
    move-object v4, v1

    :goto_0
    if-nez v4, :cond_1

    return-void

    :cond_1
    invoke-static {p1}, Lf00;->a(Landroid/view/View;)Lf00;

    move-result-object v6

    const-string p1, "bind(view)"

    invoke-static {v6, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LCK0;->a()LeM1$b$a;

    move-result-object v2

    sget-object p1, LoG2;->a:LoG2;

    invoke-virtual {v4}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object p2

    const-string v0, "activity.application"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, LoG2;->a(Landroid/content/Context;)LlG2;

    move-result-object v3

    sget-object p1, Ljy1;->b:Ljy1;

    invoke-static {p0, p1}, Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;->i(LLifecycleOwner;Lcom/uber/autodispose/lifecycle/CorrespondingEventsFunction;)Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;

    move-result-object v5

    const-string p1, "AndroidLifecycleScopePro\u2026m(this, boundaryResolver)"

    invoke-static {v5, p1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/fragment/app/c;->getDialog()Landroid/app/Dialog;

    move-result-object v7

    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    move-object v8, p0

    invoke-interface/range {v2 .. v8}, LeM1$b$a;->a(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;Lf00;Landroid/content/DialogInterface;Ldm5;)LeM1$b;

    move-result-object p1

    invoke-interface {p1, p0}, LeM1$b;->a(LeM1;)V

    invoke-virtual {p0}, LeM1;->a5()LvM1;

    move-result-object p1

    const/4 p2, 0x2

    invoke-static {p1, v1, v1, p2, v1}, LiE;->onCreate$default(LiE;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic setPresenter(LiE;)V
    .locals 0

    check-cast p1, LvM1;

    invoke-virtual {p0, p1}, LeM1;->N6(LvM1;)V

    return-void
.end method
