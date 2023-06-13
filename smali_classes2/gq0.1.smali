.class public final Lgq0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfq0;


# instance fields
.field public final a:Lhq0;


# direct methods
.method public constructor <init>(Lhq0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgq0;->a:Lhq0;

    return-void
.end method

.method public static b(Lhq0;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhq0;",
            ")",
            "LY94<",
            "Lfq0;",
            ">;"
        }
    .end annotation

    new-instance v0, Lgq0;

    invoke-direct {v0, p0}, Lgq0;-><init>(Lhq0;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Landroid/view/ViewGroup;Le13;)Leq0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/core/mvp/BaseActivity;",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;",
            "Landroid/view/ViewGroup;",
            "Le13;",
            ")",
            "Leq0;"
        }
    .end annotation

    iget-object v0, p0, Lgq0;->a:Lhq0;

    invoke-virtual {v0, p1, p2, p3, p4}, Lhq0;->b(Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Landroid/view/ViewGroup;Le13;)Leq0;

    move-result-object p1

    return-object p1
.end method
