.class public final LrP3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LqP3;


# instance fields
.field public final a:LsP3;


# direct methods
.method public constructor <init>(LsP3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LrP3;->a:LsP3;

    return-void
.end method

.method public static b(LsP3;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LsP3;",
            ")",
            "LY94<",
            "LqP3;",
            ">;"
        }
    .end annotation

    new-instance v0, LrP3;

    invoke-direct {v0, p0}, LrP3;-><init>(LsP3;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LCP3;Lbz1;Le13;Lco/bird/android/core/mvp/BaseActivity;)LoP3;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;",
            "LCP3;",
            "Lbz1;",
            "Le13;",
            "Lco/bird/android/core/mvp/BaseActivity;",
            ")",
            "LoP3;"
        }
    .end annotation

    iget-object v0, p0, LrP3;->a:LsP3;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, LsP3;->b(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LCP3;Lbz1;Le13;Lco/bird/android/core/mvp/BaseActivity;)LoP3;

    move-result-object p1

    return-object p1
.end method
