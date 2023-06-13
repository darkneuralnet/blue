.class public final Lco/bird/android/feature/webview/WebViewArchiveActivity;
.super Lco/bird/android/core/mvp/BaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/feature/webview/WebViewArchiveActivity$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0018\u00002\u00020\u0001:\u0001\u0012B\u0007\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0012\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u0008\u0010\u0006\u001a\u00020\u0004H\u0014J\u0008\u0010\u0007\u001a\u00020\u0004H\u0016R\"\u0010\u000f\u001a\u00020\u00088\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u000b\u0010\u000c\"\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0013"
    }
    d2 = {
        "Lco/bird/android/feature/webview/WebViewArchiveActivity;",
        "Lco/bird/android/core/mvp/BaseActivity;",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "",
        "onCreate",
        "onResume",
        "onBackPressed",
        "Lco/bird/android/feature/webview/c;",
        "B",
        "Lco/bird/android/feature/webview/c;",
        "j0",
        "()Lco/bird/android/feature/webview/c;",
        "setPresenter",
        "(Lco/bird/android/feature/webview/c;)V",
        "presenter",
        "<init>",
        "()V",
        "a",
        "webview_release"
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
        "SMAP\nWebViewArchiveActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebViewArchiveActivity.kt\nco/bird/android/feature/webview/WebViewArchiveActivity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,61:1\n44#2:62\n*S KotlinDebug\n*F\n+ 1 WebViewArchiveActivity.kt\nco/bird/android/feature/webview/WebViewArchiveActivity\n*L\n28#1:62\n*E\n"
    }
.end annotation


# instance fields
.field public B:Lco/bird/android/feature/webview/c;


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

    return-void
.end method


# virtual methods
.method public final j0()Lco/bird/android/feature/webview/c;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/webview/WebViewArchiveActivity;->B:Lco/bird/android/feature/webview/c;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "presenter"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public onBackPressed()V
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/feature/webview/WebViewArchiveActivity;->j0()Lco/bird/android/feature/webview/c;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/feature/webview/c;->d()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-super {p0}, Lco/bird/android/core/base/BaseCoreActivity;->onBackPressed()V

    :cond_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    invoke-super {p0, p1}, Lco/bird/android/core/mvp/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    sget p1, LWj4;->activity_archive_webview:I

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->setContentView(I)V

    invoke-static {}, Lco/bird/android/feature/webview/b;->a()Lco/bird/android/feature/webview/WebViewArchiveActivity$a$a;

    move-result-object p1

    sget-object v0, LoG2;->a:LoG2;

    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v1

    const-string v2, "application"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, LoG2;->a(Landroid/content/Context;)LlG2;

    move-result-object v0

    invoke-static {p0}, Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;->b(LLifecycleOwner;)Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;

    move-result-object v1

    const-string v2, "AndroidLifecycleScopeProvider.from(this)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, v0, p0, v1}, Lco/bird/android/feature/webview/WebViewArchiveActivity$a$a;->a(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;)Lco/bird/android/feature/webview/WebViewArchiveActivity$a;

    move-result-object p1

    invoke-interface {p1, p0}, Lco/bird/android/feature/webview/WebViewArchiveActivity$a;->a(Lco/bird/android/feature/webview/WebViewArchiveActivity;)V

    invoke-virtual {p0}, Lco/bird/android/feature/webview/WebViewArchiveActivity;->j0()Lco/bird/android/feature/webview/c;

    move-result-object p1

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "co.bird.android.web_archive_name"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lco/bird/android/feature/webview/c;->k(Ljava/lang/String;)V

    return-void
.end method

.method public onResume()V
    .locals 1

    invoke-super {p0}, Lco/bird/android/core/base/BaseCoreActivity;->onResume()V

    invoke-virtual {p0}, Lco/bird/android/feature/webview/WebViewArchiveActivity;->j0()Lco/bird/android/feature/webview/c;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/feature/webview/c;->l()V

    return-void
.end method
