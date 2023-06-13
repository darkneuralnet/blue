.class public final Lrd4;
.super Lcom/google/android/material/bottomsheet/b;
.source "SourceFile"

# interfaces
.implements LZg3;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lrd4$a;,
        Lrd4$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0008\u0007\u0018\u0000 (2\u00020\u00012\u00020\u0002:\u0002\u0006\u0017B\u0007\u00a2\u0006\u0004\u0008&\u0010\'J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J&\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0008\u001a\u00020\u00072\u0008\u0010\n\u001a\u0004\u0018\u00010\t2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000bH\u0016J\u001a\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\r2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000bH\u0016J\u0012\u0010\u0012\u001a\u00020\u00112\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000bH\u0017J\u0008\u0010\u0013\u001a\u00020\u0005H\u0016J\u0008\u0010\u0015\u001a\u00020\u0014H\u0017R\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u001a\"\u0004\u0008\u001b\u0010\u001cR\u0018\u0010 \u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001fR \u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\"0!8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008#\u0010$\u00a8\u0006)"
    }
    d2 = {
        "Lrd4;",
        "Lcom/google/android/material/bottomsheet/b;",
        "LZg3;",
        "Lco/bird/android/model/constant/PaymentMethod;",
        "paymentMethod",
        "",
        "a",
        "Landroid/view/LayoutInflater;",
        "inflater",
        "Landroid/view/ViewGroup;",
        "container",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "Landroid/view/View;",
        "onCreateView",
        "view",
        "onViewCreated",
        "Landroid/app/Dialog;",
        "onCreateDialog",
        "onResume",
        "",
        "getTheme",
        "Lwd4;",
        "b",
        "Lwd4;",
        "a5",
        "()Lwd4;",
        "setPresenter",
        "(Lwd4;)V",
        "presenter",
        "c",
        "LZg3;",
        "onPaymentMethodSelectedListener",
        "",
        "",
        "d",
        "Ljava/util/Map;",
        "paymentMethodExclusions",
        "<init>",
        "()V",
        "e",
        "co.bird.android.feature.payment"
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
        "SMAP\nQuickPaymentBottomSheetDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QuickPaymentBottomSheetDialog.kt\nco/bird/android/feature/payment/bottomsheet/QuickPaymentBottomSheetDialog\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,103:1\n64#2:104\n*S KotlinDebug\n*F\n+ 1 QuickPaymentBottomSheetDialog.kt\nco/bird/android/feature/payment/bottomsheet/QuickPaymentBottomSheetDialog\n*L\n66#1:104\n*E\n"
    }
.end annotation


# static fields
.field public static final e:Lrd4$a;


# instance fields
.field public b:Lwd4;

.field public c:LZg3;

.field public final d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lco/bird/android/model/constant/PaymentMethod;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lrd4$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lrd4$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lrd4;->e:Lrd4$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/material/bottomsheet/b;-><init>()V

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lrd4;->d:Ljava/util/Map;

    return-void
.end method

.method public static final synthetic access$getPaymentMethodExclusions$p(Lrd4;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, Lrd4;->d:Ljava/util/Map;

    return-object p0
.end method

.method public static final synthetic access$setOnPaymentMethodSelectedListener$p(Lrd4;LZg3;)V
    .locals 0

    iput-object p1, p0, Lrd4;->c:LZg3;

    return-void
.end method


# virtual methods
.method public a(Lco/bird/android/model/constant/PaymentMethod;)V
    .locals 1

    const-string v0, "paymentMethod"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lrd4;->c:LZg3;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, LZg3;->a(Lco/bird/android/model/constant/PaymentMethod;)V

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/material/bottomsheet/b;->dismiss()V

    return-void
.end method

.method public final a5()Lwd4;
    .locals 1

    iget-object v0, p0, Lrd4;->b:Lwd4;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "presenter"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public getTheme()I
    .locals 1

    sget v0, LCl4;->RoundedBottomSheet:I

    return v0
.end method

.method public onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ResourceType"
        }
    .end annotation

    new-instance p1, Lcom/google/android/material/bottomsheet/a;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p0}, Lrd4;->getTheme()I

    move-result v1

    invoke-direct {p1, v0, v1}, Lcom/google/android/material/bottomsheet/a;-><init>(Landroid/content/Context;I)V

    return-object p1
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 0

    const-string p2, "inflater"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lc00;->c(Landroid/view/LayoutInflater;)Lc00;

    move-result-object p1

    invoke-virtual {p1}, Lc00;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p1

    return-object p1
.end method

.method public onResume()V
    .locals 2

    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onResume()V

    invoke-virtual {p0}, Lrd4;->a5()Lwd4;

    move-result-object v0

    iget-object v1, p0, Lrd4;->d:Ljava/util/Map;

    invoke-virtual {v0, v1}, Lwd4;->d(Ljava/util/Map;)V

    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 7

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Landroidx/fragment/app/Fragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    invoke-static {p1}, Lc00;->a(Landroid/view/View;)Lc00;

    move-result-object v5

    const-string p1, "bind(view)"

    invoke-static {v5, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p1

    instance-of p2, p1, Lco/bird/android/core/base/BaseCoreActivity;

    if-eqz p2, :cond_0

    check-cast p1, Lco/bird/android/core/base/BaseCoreActivity;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    move-object v3, p1

    if-nez v3, :cond_1

    return-void

    :cond_1
    invoke-static {}, LzO0;->a()Lrd4$b$a;

    move-result-object v1

    sget-object p1, LoG2;->a:LoG2;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object p2

    invoke-virtual {p2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p2

    const-string v0, "requireContext().applicationContext"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, LoG2;->a(Landroid/content/Context;)LlG2;

    move-result-object v2

    sget-object p1, Ljy1;->b:Ljy1;

    invoke-static {p0, p1}, Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;->i(LLifecycleOwner;Lcom/uber/autodispose/lifecycle/CorrespondingEventsFunction;)Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;

    move-result-object v4

    const-string p1, "AndroidLifecycleScopePro\u2026m(this, boundaryResolver)"

    invoke-static {v4, p1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v6, p0

    invoke-interface/range {v1 .. v6}, Lrd4$b$a;->a(LlG2;Lco/bird/android/core/base/BaseCoreActivity;Lcom/uber/autodispose/ScopeProvider;Lc00;LZg3;)Lrd4$b;

    move-result-object p1

    invoke-interface {p1, p0}, Lrd4$b;->a(Lrd4;)V

    return-void
.end method
