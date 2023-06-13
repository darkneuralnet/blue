.class public final Lne1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lme1;


# instance fields
.field public final a:Loe1;


# direct methods
.method public constructor <init>(Loe1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lne1;->a:Loe1;

    return-void
.end method

.method public static b(Loe1;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Loe1;",
            ")",
            "LY94<",
            "Lme1;",
            ">;"
        }
    .end annotation

    new-instance v0, Lne1;

    invoke-direct {v0, p0}, Lne1;-><init>(Loe1;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Lpe1;Le13;LDQ3;)Lie1;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/core/mvp/BaseActivity;",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;",
            "Lpe1;",
            "Le13;",
            "LDQ3;",
            ")",
            "Lie1;"
        }
    .end annotation

    iget-object v0, p0, Lne1;->a:Loe1;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Loe1;->b(Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Lpe1;Le13;LDQ3;)Lie1;

    move-result-object p1

    return-object p1
.end method
