.class public interface abstract Lco/bird/android/app/feature/operator/activity/OperatorActivity$b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Ldagger/Component$Factory;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/app/feature/operator/activity/OperatorActivity$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/app/feature/operator/activity/OperatorActivity$b$a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008g\u0018\u00002\u00020\u0001J\u0098\u0001\u0010 \u001a\u00020\u001f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0001\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0001\u0010\t\u001a\u00020\u00082\u0008\u0008\u0001\u0010\u000b\u001a\u00020\n2\u000e\u0008\u0001\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c2\n\u0008\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0008\u0008\u0003\u0010\u0012\u001a\u00020\u00112\u0008\u0008\u0003\u0010\u0014\u001a\u00020\u00132\u0008\u0008\u0001\u0010\u0016\u001a\u00020\u00152\u0008\u0008\u0001\u0010\u0018\u001a\u00020\u00172\u0008\u0008\u0001\u0010\u001a\u001a\u00020\u00192\u0008\u0008\u0001\u0010\u001c\u001a\u00020\u001b2\u0008\u0008\u0001\u0010\u001e\u001a\u00020\u001dH&\u00a8\u0006!"
    }
    d2 = {
        "Lco/bird/android/app/feature/operator/activity/OperatorActivity$b$a;",
        "",
        "LlG2;",
        "mainComponent",
        "Lco/bird/android/app/feature/operator/activity/OperatorActivity$c;",
        "operatorModule",
        "Lco/bird/android/core/mvp/BaseActivity;",
        "activity",
        "Lcom/uber/autodispose/ScopeProvider;",
        "scopeProvider",
        "Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;",
        "mapScopeProvider",
        "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;",
        "LRE;",
        "lifecycleScopeProvider",
        "Lcom/guness/widget/NavigationView;",
        "navigationView",
        "Lco/bird/android/model/constant/FlightSheetContext;",
        "flightSheetContext",
        "",
        "repairFlow",
        "Lu4;",
        "binding",
        "LCt6;",
        "sideMenuBannerBinding",
        "Landroidx/fragment/app/FragmentManager;",
        "fragmentManager",
        "Landroidx/lifecycle/f;",
        "lifecycle",
        "LDQ3;",
        "permissionManager",
        "Lco/bird/android/app/feature/operator/activity/OperatorActivity$b;",
        "a",
        "app_birdRelease"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# virtual methods
.method public abstract a(LlG2;Lco/bird/android/app/feature/operator/activity/OperatorActivity$c;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Lcom/guness/widget/NavigationView;Lco/bird/android/model/constant/FlightSheetContext;ZLu4;LCt6;Landroidx/fragment/app/FragmentManager;Landroidx/lifecycle/f;LDQ3;)Lco/bird/android/app/feature/operator/activity/OperatorActivity$b;
    .param p3    # Lco/bird/android/core/mvp/BaseActivity;
        .annotation runtime Ldagger/BindsInstance;
        .end annotation
    .end param
    .param p4    # Lcom/uber/autodispose/ScopeProvider;
        .annotation runtime Ldagger/BindsInstance;
        .end annotation
    .end param
    .param p5    # Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;
        .annotation runtime Ldagger/BindsInstance;
        .end annotation
    .end param
    .param p6    # Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;
        .annotation runtime Ldagger/BindsInstance;
        .end annotation
    .end param
    .param p7    # Lcom/guness/widget/NavigationView;
        .annotation runtime Ldagger/BindsInstance;
        .end annotation
    .end param
    .param p8    # Lco/bird/android/model/constant/FlightSheetContext;
        .annotation runtime Ldagger/BindsInstance;
        .end annotation
    .end param
    .param p9    # Z
        .annotation runtime Ldagger/BindsInstance;
        .end annotation
    .end param
    .param p10    # Lu4;
        .annotation runtime Ldagger/BindsInstance;
        .end annotation
    .end param
    .param p11    # LCt6;
        .annotation runtime Ldagger/BindsInstance;
        .end annotation
    .end param
    .param p12    # Landroidx/fragment/app/FragmentManager;
        .annotation runtime Ldagger/BindsInstance;
        .end annotation
    .end param
    .param p13    # Landroidx/lifecycle/f;
        .annotation runtime Ldagger/BindsInstance;
        .end annotation
    .end param
    .param p14    # LDQ3;
        .annotation runtime Ldagger/BindsInstance;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LlG2;",
            "Lco/bird/android/app/feature/operator/activity/OperatorActivity$c;",
            "Lco/bird/android/core/mvp/BaseActivity;",
            "Lcom/uber/autodispose/ScopeProvider;",
            "Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;",
            "Lcom/guness/widget/NavigationView;",
            "Lco/bird/android/model/constant/FlightSheetContext;",
            "Z",
            "Lu4;",
            "LCt6;",
            "Landroidx/fragment/app/FragmentManager;",
            "Landroidx/lifecycle/f;",
            "LDQ3;",
            ")",
            "Lco/bird/android/app/feature/operator/activity/OperatorActivity$b;"
        }
    .end annotation
.end method
