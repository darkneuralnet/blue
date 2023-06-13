.class public interface abstract LbE4$b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Ldagger/Component$Factory;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = LbE4$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008g\u0018\u00002\u00020\u0001JH\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0001\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0001\u0010\t\u001a\u00020\u00082\u000e\u0008\u0001\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n2\u0008\u0008\u0001\u0010\u000e\u001a\u00020\rH&\u00a8\u0006\u0011"
    }
    d2 = {
        "LbE4$b$a;",
        "",
        "LlG2;",
        "mainComponent",
        "Lco/bird/android/core/mvp/BaseActivity;",
        "activity",
        "Lcom/uber/autodispose/ScopeProvider;",
        "scopeProvider",
        "Le00;",
        "binding",
        "Lio/reactivex/subjects/g;",
        "Lco/bird/android/model/DialogResponse;",
        "responseSubject",
        "Landroid/content/DialogInterface;",
        "dialog",
        "LbE4$b;",
        "a",
        "repair_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# virtual methods
.method public abstract a(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;Le00;Lio/reactivex/subjects/g;Landroid/content/DialogInterface;)LbE4$b;
    .param p2    # Lco/bird/android/core/mvp/BaseActivity;
        .annotation runtime Ldagger/BindsInstance;
        .end annotation
    .end param
    .param p3    # Lcom/uber/autodispose/ScopeProvider;
        .annotation runtime Ldagger/BindsInstance;
        .end annotation
    .end param
    .param p4    # Le00;
        .annotation runtime Ldagger/BindsInstance;
        .end annotation
    .end param
    .param p5    # Lio/reactivex/subjects/g;
        .annotation runtime Ldagger/BindsInstance;
        .end annotation
    .end param
    .param p6    # Landroid/content/DialogInterface;
        .annotation runtime Ldagger/BindsInstance;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LlG2;",
            "Lco/bird/android/core/mvp/BaseActivity;",
            "Lcom/uber/autodispose/ScopeProvider;",
            "Le00;",
            "Lio/reactivex/subjects/g<",
            "Lco/bird/android/model/DialogResponse;",
            ">;",
            "Landroid/content/DialogInterface;",
            ")",
            "LbE4$b;"
        }
    .end annotation
.end method
