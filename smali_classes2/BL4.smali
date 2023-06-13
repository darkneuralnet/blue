.class public final LBL4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LAL4;


# instance fields
.field public final a:LCL4;


# direct methods
.method public constructor <init>(LCL4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LBL4;->a:LCL4;

    return-void
.end method

.method public static b(LCL4;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LCL4;",
            ")",
            "LY94<",
            "LAL4;",
            ">;"
        }
    .end annotation

    new-instance v0, LBL4;

    invoke-direct {v0, p0}, LBL4;-><init>(LCL4;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LGL4;Le13;LsJ4;LZr1;LUK4;)LyL4;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/core/mvp/BaseActivity;",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;",
            "LGL4;",
            "Le13;",
            "LsJ4;",
            "LZr1;",
            "LUK4;",
            ")",
            "LyL4;"
        }
    .end annotation

    iget-object v0, p0, LBL4;->a:LCL4;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    move-object v7, p7

    invoke-virtual/range {v0 .. v7}, LCL4;->b(Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LGL4;Le13;LsJ4;LZr1;LUK4;)LyL4;

    move-result-object p1

    return-object p1
.end method
