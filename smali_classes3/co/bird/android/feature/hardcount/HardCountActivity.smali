.class public final Lco/bird/android/feature/hardcount/HardCountActivity;
.super Lco/bird/android/core/mvp/BaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/feature/hardcount/HardCountActivity$a;,
        Lco/bird/android/feature/hardcount/HardCountActivity$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000C\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0008\t*\u0001\u001f\u0018\u00002\u00020\u0001:\u0002%&B\u0007\u00a2\u0006\u0004\u0008#\u0010$J\u0012\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\"\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u00062\u0008\u0010\n\u001a\u0004\u0018\u00010\tH\u0014J\u0008\u0010\u000c\u001a\u00020\u0004H\u0014J\u0008\u0010\r\u001a\u00020\u0004H\u0014R\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008\u000f\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0012\"\u0004\u0008\u0013\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u001c\u0010\u001e\u001a\n \u001b*\u0004\u0018\u00010\u001a0\u001a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008 \u0010!\u00a8\u0006\'"
    }
    d2 = {
        "Lco/bird/android/feature/hardcount/HardCountActivity;",
        "Lco/bird/android/core/mvp/BaseActivity;",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "",
        "onCreate",
        "",
        "requestCode",
        "resultCode",
        "Landroid/content/Intent;",
        "data",
        "onActivityResult",
        "onResume",
        "onPause",
        "LrG1;",
        "B",
        "LrG1;",
        "j0",
        "()LrG1;",
        "setPresenter",
        "(LrG1;)V",
        "presenter",
        "Landroid/net/ConnectivityManager;",
        "C",
        "Landroid/net/ConnectivityManager;",
        "connectivityManager",
        "Landroid/net/NetworkRequest;",
        "kotlin.jvm.PlatformType",
        "D",
        "Landroid/net/NetworkRequest;",
        "networkRequest",
        "co/bird/android/feature/hardcount/HardCountActivity$c",
        "E",
        "Lco/bird/android/feature/hardcount/HardCountActivity$c;",
        "networkCallback",
        "<init>",
        "()V",
        "a",
        "b",
        "co.bird.android.feature.hardcount"
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
        "SMAP\nHardCountActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HardCountActivity.kt\nco/bird/android/feature/hardcount/HardCountActivity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,123:1\n44#2:124\n1#3:125\n*S KotlinDebug\n*F\n+ 1 HardCountActivity.kt\nco/bird/android/feature/hardcount/HardCountActivity\n*L\n57#1:124\n*E\n"
    }
.end annotation


# instance fields
.field public B:LrG1;

.field public C:Landroid/net/ConnectivityManager;

.field public final D:Landroid/net/NetworkRequest;

.field public final E:Lco/bird/android/feature/hardcount/HardCountActivity$c;


# direct methods
.method public constructor <init>()V
    .locals 6

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x7

    const/4 v5, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lco/bird/android/core/mvp/BaseActivity;-><init>(ZLjava/lang/Integer;Ljava/lang/Boolean;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v0, Landroid/net/NetworkRequest$Builder;

    invoke-direct {v0}, Landroid/net/NetworkRequest$Builder;-><init>()V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/net/NetworkRequest$Builder;->addTransportType(I)Landroid/net/NetworkRequest$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/NetworkRequest$Builder;->build()Landroid/net/NetworkRequest;

    move-result-object v0

    iput-object v0, p0, Lco/bird/android/feature/hardcount/HardCountActivity;->D:Landroid/net/NetworkRequest;

    new-instance v0, Lco/bird/android/feature/hardcount/HardCountActivity$c;

    invoke-direct {v0, p0}, Lco/bird/android/feature/hardcount/HardCountActivity$c;-><init>(Lco/bird/android/feature/hardcount/HardCountActivity;)V

    iput-object v0, p0, Lco/bird/android/feature/hardcount/HardCountActivity;->E:Lco/bird/android/feature/hardcount/HardCountActivity$c;

    return-void
.end method


# virtual methods
.method public final j0()LrG1;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/hardcount/HardCountActivity;->B:LrG1;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "presenter"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 0

    invoke-super {p0, p1, p2, p3}, Lco/bird/android/core/base/BaseCoreActivity;->onActivityResult(IILandroid/content/Intent;)V

    const/16 p2, 0x2711

    if-eq p1, p2, :cond_0

    const/16 p2, 0x2713

    if-eq p1, p2, :cond_0

    goto :goto_0

    :cond_0
    if-eqz p3, :cond_1

    const-string p1, "raw_scan_result"

    invoke-virtual {p3, p1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lco/bird/android/feature/hardcount/HardCountActivity;->j0()LrG1;

    move-result-object p2

    invoke-interface {p2, p1}, LrG1;->b(Ljava/lang/String;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 4

    invoke-super {p0, p1}, Lco/bird/android/core/mvp/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object p1

    invoke-static {p1}, LH3;->c(Landroid/view/LayoutInflater;)LH3;

    move-result-object p1

    const-string v0, "inflate(layoutInflater)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LH3;->b()Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->setContentView(Landroid/view/View;)V

    const-string v0, "connectivity"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type android.net.ConnectivityManager"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/net/ConnectivityManager;

    iput-object v0, p0, Lco/bird/android/feature/hardcount/HardCountActivity;->C:Landroid/net/ConnectivityManager;

    invoke-static {}, Lco/bird/android/feature/hardcount/a;->a()Lco/bird/android/feature/hardcount/HardCountActivity$a$a;

    move-result-object v0

    sget-object v1, LoG2;->a:LoG2;

    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v2

    const-string v3, "application"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, LoG2;->a(Landroid/content/Context;)LlG2;

    move-result-object v1

    invoke-static {p0}, Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;->b(LLifecycleOwner;)Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;

    move-result-object v2

    const-string v3, "AndroidLifecycleScopeProvider.from(this)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, v1, p0, v2, p1}, Lco/bird/android/feature/hardcount/HardCountActivity$a$a;->a(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;LH3;)Lco/bird/android/feature/hardcount/HardCountActivity$a;

    move-result-object p1

    invoke-interface {p1, p0}, Lco/bird/android/feature/hardcount/HardCountActivity$a;->a(Lco/bird/android/feature/hardcount/HardCountActivity;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "hard_count_expected_scans"

    const/4 v1, -0x1

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "hard_count_session_id"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lco/bird/android/feature/hardcount/HardCountActivity;->j0()LrG1;

    move-result-object v1

    invoke-interface {v1, p1, v0}, LrG1;->a(ILjava/lang/String;)V

    return-void
.end method

.method public onPause()V
    .locals 2

    invoke-super {p0}, Lco/bird/android/core/mvp/BaseActivity;->onPause()V

    invoke-virtual {p0}, Lco/bird/android/feature/hardcount/HardCountActivity;->j0()LrG1;

    move-result-object v0

    invoke-interface {v0}, LrG1;->onPause()V

    iget-object v0, p0, Lco/bird/android/feature/hardcount/HardCountActivity;->C:Landroid/net/ConnectivityManager;

    if-nez v0, :cond_0

    const-string v0, "connectivityManager"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    iget-object v1, p0, Lco/bird/android/feature/hardcount/HardCountActivity;->E:Lco/bird/android/feature/hardcount/HardCountActivity$c;

    invoke-virtual {v0, v1}, Landroid/net/ConnectivityManager;->unregisterNetworkCallback(Landroid/net/ConnectivityManager$NetworkCallback;)V

    return-void
.end method

.method public onResume()V
    .locals 3

    invoke-super {p0}, Lco/bird/android/core/base/BaseCoreActivity;->onResume()V

    invoke-virtual {p0}, Lco/bird/android/feature/hardcount/HardCountActivity;->j0()LrG1;

    move-result-object v0

    invoke-interface {v0}, LrG1;->onResume()V

    iget-object v0, p0, Lco/bird/android/feature/hardcount/HardCountActivity;->C:Landroid/net/ConnectivityManager;

    if-nez v0, :cond_0

    const-string v0, "connectivityManager"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    iget-object v1, p0, Lco/bird/android/feature/hardcount/HardCountActivity;->D:Landroid/net/NetworkRequest;

    iget-object v2, p0, Lco/bird/android/feature/hardcount/HardCountActivity;->E:Lco/bird/android/feature/hardcount/HardCountActivity$c;

    invoke-virtual {v0, v1, v2}, Landroid/net/ConnectivityManager;->registerNetworkCallback(Landroid/net/NetworkRequest;Landroid/net/ConnectivityManager$NetworkCallback;)V

    return-void
.end method
