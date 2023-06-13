.class public final LwH2$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Ldagger/Module;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = LwH2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0008\u0010\u0003\u001a\u00020\u0002H\u0007J\u0008\u0010\u0005\u001a\u00020\u0004H\u0007J\u0008\u0010\u0007\u001a\u00020\u0006H\u0007J\u0008\u0010\t\u001a\u00020\u0008H\u0007R\u0017\u0010\r\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\n\u001a\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u0010"
    }
    d2 = {
        "LwH2$c;",
        "",
        "Lco/bird/android/core/mvp/BaseActivity;",
        "a",
        "LwH2;",
        "c",
        "Lcom/uber/autodispose/ScopeProvider;",
        "d",
        "LrH2;",
        "b",
        "LwH2;",
        "getDialog",
        "()LwH2;",
        "dialog",
        "<init>",
        "(LwH2;)V",
        "co.bird.android.feature.rider.bottomsheets"
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
        "SMAP\nManageRidesDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ManageRidesDialog.kt\nco/bird/android/feature/rider/bottomsheets/ManageRidesDialog$ManageRidesModule\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,96:1\n64#2:97\n*S KotlinDebug\n*F\n+ 1 ManageRidesDialog.kt\nco/bird/android/feature/rider/bottomsheets/ManageRidesDialog$ManageRidesModule\n*L\n73#1:97\n*E\n"
    }
.end annotation


# instance fields
.field public final a:LwH2;


# direct methods
.method public constructor <init>(LwH2;)V
    .locals 1

    const-string v0, "dialog"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LwH2$c;->a:LwH2;

    return-void
.end method


# virtual methods
.method public final a()Lco/bird/android/core/mvp/BaseActivity;
    .locals 2
    .annotation runtime Ldagger/Provides;
    .end annotation

    iget-object v0, p0, LwH2$c;->a:LwH2;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type co.bird.android.core.mvp.BaseActivity"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lco/bird/android/core/mvp/BaseActivity;

    return-object v0
.end method

.method public final b()LrH2;
    .locals 2
    .annotation runtime Ldagger/Provides;
    .end annotation

    new-instance v0, LrH2;

    iget-object v1, p0, LwH2$c;->a:LwH2;

    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-direct {v0, v1}, LrH2;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public final c()LwH2;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    iget-object v0, p0, LwH2$c;->a:LwH2;

    return-object v0
.end method

.method public final d()Lcom/uber/autodispose/ScopeProvider;
    .locals 2
    .annotation runtime Ldagger/Provides;
    .end annotation

    iget-object v0, p0, LwH2$c;->a:LwH2;

    sget-object v1, Ljy1;->b:Ljy1;

    invoke-static {v0, v1}, Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;->i(LLifecycleOwner;Lcom/uber/autodispose/lifecycle/CorrespondingEventsFunction;)Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;

    move-result-object v0

    const-string v1, "AndroidLifecycleScopePro\u2026m(this, boundaryResolver)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
