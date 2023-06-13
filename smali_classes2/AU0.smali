.class public final LAU0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LzU0;


# instance fields
.field public final a:LBU0;


# direct methods
.method public constructor <init>(LBU0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LAU0;->a:LBU0;

    return-void
.end method

.method public static b(LBU0;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LBU0;",
            ")",
            "LY94<",
            "LzU0;",
            ">;"
        }
    .end annotation

    new-instance v0, LAU0;

    invoke-direct {v0, p0}, LAU0;-><init>(LBU0;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LCU0;Le13;Lgl;)LxU0;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/core/mvp/BaseActivity;",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;",
            "LCU0;",
            "Le13;",
            "Lgl;",
            ")",
            "LxU0;"
        }
    .end annotation

    iget-object v0, p0, LAU0;->a:LBU0;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, LBU0;->b(Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LCU0;Le13;Lgl;)LxU0;

    move-result-object p1

    return-object p1
.end method
