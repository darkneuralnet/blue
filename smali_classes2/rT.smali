.class public final LrT;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LqT;


# instance fields
.field public final a:LsT;


# direct methods
.method public constructor <init>(LsT;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LrT;->a:LsT;

    return-void
.end method

.method public static b(LsT;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LsT;",
            ")",
            "LY94<",
            "LqT;",
            ">;"
        }
    .end annotation

    new-instance v0, LrT;

    invoke-direct {v0, p0}, LrT;-><init>(LsT;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Landroid/content/res/Resources;LtT;Le13;LDQ3;)LpT;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;",
            "Landroid/content/res/Resources;",
            "LtT;",
            "Le13;",
            "LDQ3;",
            ")",
            "LpT;"
        }
    .end annotation

    iget-object v0, p0, LrT;->a:LsT;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, LsT;->b(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Landroid/content/res/Resources;LtT;Le13;LDQ3;)LpT;

    move-result-object p1

    return-object p1
.end method
