.class public final LRK5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LQK5;


# instance fields
.field public final a:LSK5;


# direct methods
.method public constructor <init>(LSK5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LRK5;->a:LSK5;

    return-void
.end method

.method public static b(LSK5;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LSK5;",
            ")",
            "LY94<",
            "LQK5;",
            ">;"
        }
    .end annotation

    new-instance v0, LRK5;

    invoke-direct {v0, p0}, LRK5;-><init>(LSK5;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(LDQ3;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LTK5;Le13;)LPK5;
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

    iget-object v0, p0, LRK5;->a:LSK5;

    invoke-virtual {v0, p1, p2, p3, p4}, LSK5;->b(LDQ3;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LTK5;Le13;)LPK5;

    move-result-object p1

    return-object p1
.end method
