.class public final LSL5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LRL5;


# instance fields
.field public final a:LTL5;


# direct methods
.method public constructor <init>(LTL5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LSL5;->a:LTL5;

    return-void
.end method

.method public static b(LTL5;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LTL5;",
            ")",
            "LY94<",
            "LRL5;",
            ">;"
        }
    .end annotation

    new-instance v0, LSL5;

    invoke-direct {v0, p0}, LSL5;-><init>(LTL5;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(LDQ3;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LWL5;Le13;)LGL5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LDQ3;",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;",
            "LWL5;",
            "Le13;",
            ")",
            "LGL5;"
        }
    .end annotation

    iget-object v0, p0, LSL5;->a:LTL5;

    invoke-virtual {v0, p1, p2, p3, p4}, LTL5;->b(LDQ3;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LWL5;Le13;)LGL5;

    move-result-object p1

    return-object p1
.end method
