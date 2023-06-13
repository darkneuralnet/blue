.class public final LI03;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LG03;


# instance fields
.field public final a:LL03;


# direct methods
.method public constructor <init>(LL03;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LI03;->a:LL03;

    return-void
.end method

.method public static b(LL03;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LL03;",
            ")",
            "LY94<",
            "LG03;",
            ">;"
        }
    .end annotation

    new-instance v0, LI03;

    invoke-direct {v0, p0}, LI03;-><init>(LL03;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LM03;Le13;LDQ3;)LD03;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;",
            "LM03;",
            "Le13;",
            "LDQ3;",
            ")",
            "LD03;"
        }
    .end annotation

    iget-object v0, p0, LI03;->a:LL03;

    invoke-virtual {v0, p1, p2, p3, p4}, LL03;->b(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LM03;Le13;LDQ3;)LD03;

    move-result-object p1

    return-object p1
.end method
