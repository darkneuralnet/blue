.class public final LSK5;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LJy4;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LJy4;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LSK5;->a:LY94;

    return-void
.end method

.method public static a(LY94;)LSK5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LJy4;",
            ">;)",
            "LSK5;"
        }
    .end annotation

    new-instance v0, LSK5;

    invoke-direct {v0, p0}, LSK5;-><init>(LY94;)V

    return-object v0
.end method

.method public static c(LJy4;LDQ3;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LTK5;Le13;)LPK5;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LJy4;",
            "LDQ3;",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;",
            "LTK5;",
            "Le13;",
            ")",
            "LPK5;"
        }
    .end annotation

    new-instance v6, LPK5;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, LPK5;-><init>(LJy4;LDQ3;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LTK5;Le13;)V

    return-object v6
.end method


# virtual methods
.method public b(LDQ3;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LTK5;Le13;)LPK5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LDQ3;",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;",
            "LTK5;",
            "Le13;",
            ")",
            "LPK5;"
        }
    .end annotation

    iget-object v0, p0, LSK5;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LJy4;

    invoke-static {v0, p1, p2, p3, p4}, LSK5;->c(LJy4;LDQ3;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LTK5;Le13;)LPK5;

    move-result-object p1

    return-object p1
.end method
