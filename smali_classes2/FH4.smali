.class public final LFH4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LEH4;


# instance fields
.field public final a:LGH4;


# direct methods
.method public constructor <init>(LGH4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LFH4;->a:LGH4;

    return-void
.end method

.method public static b(LGH4;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LGH4;",
            ")",
            "LY94<",
            "LEH4;",
            ">;"
        }
    .end annotation

    new-instance v0, LFH4;

    invoke-direct {v0, p0}, LFH4;-><init>(LGH4;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LEg1;LHH4;LDQ3;Le13;LoY1;)LCH4;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;",
            "LEg1;",
            "LHH4;",
            "LDQ3;",
            "Le13;",
            "LoY1;",
            ")",
            "LCH4;"
        }
    .end annotation

    iget-object v0, p0, LFH4;->a:LGH4;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    invoke-virtual/range {v0 .. v6}, LGH4;->b(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LEg1;LHH4;LDQ3;Le13;LoY1;)LCH4;

    move-result-object p1

    return-object p1
.end method
