.class public final Lsy;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lry;


# instance fields
.field public final a:Lty;


# direct methods
.method public constructor <init>(Lty;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsy;->a:Lty;

    return-void
.end method

.method public static b(Lty;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lty;",
            ")",
            "LY94<",
            "Lry;",
            ">;"
        }
    .end annotation

    new-instance v0, Lsy;

    invoke-direct {v0, p0}, Lsy;-><init>(Lty;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Luy;Le13;LDQ3;Z)Lny;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;",
            "Luy;",
            "Le13;",
            "LDQ3;",
            "Z)",
            "Lny;"
        }
    .end annotation

    iget-object v0, p0, Lsy;->a:Lty;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move v5, p5

    invoke-virtual/range {v0 .. v5}, Lty;->b(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Luy;Le13;LDQ3;Z)Lny;

    move-result-object p1

    return-object p1
.end method
