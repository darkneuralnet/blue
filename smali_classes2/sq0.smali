.class public final Lsq0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrq0;


# instance fields
.field public final a:Ltq0;


# direct methods
.method public constructor <init>(Ltq0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsq0;->a:Ltq0;

    return-void
.end method

.method public static b(Ltq0;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltq0;",
            ")",
            "LY94<",
            "Lrq0;",
            ">;"
        }
    .end annotation

    new-instance v0, Lsq0;

    invoke-direct {v0, p0}, Lsq0;-><init>(Ltq0;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Lgs0;Le13;)Lqq0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;",
            "Lgs0;",
            "Le13;",
            ")",
            "Lqq0;"
        }
    .end annotation

    iget-object v0, p0, Lsq0;->a:Ltq0;

    invoke-virtual {v0, p1, p2, p3}, Ltq0;->b(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Lgs0;Le13;)Lqq0;

    move-result-object p1

    return-object p1
.end method
