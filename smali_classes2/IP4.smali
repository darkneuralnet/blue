.class public final LIP4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LHP4;


# instance fields
.field public final a:LJP4;


# direct methods
.method public constructor <init>(LJP4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LIP4;->a:LJP4;

    return-void
.end method

.method public static b(LJP4;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LJP4;",
            ")",
            "LY94<",
            "LHP4;",
            ">;"
        }
    .end annotation

    new-instance v0, LIP4;

    invoke-direct {v0, p0}, LIP4;-><init>(LJP4;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LhY4;LKP4;Le13;LZr1;Ljava/lang/String;)LFP4;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;",
            "LhY4;",
            "LKP4;",
            "Le13;",
            "LZr1;",
            "Ljava/lang/String;",
            ")",
            "LFP4;"
        }
    .end annotation

    iget-object v0, p0, LIP4;->a:LJP4;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    invoke-virtual/range {v0 .. v6}, LJP4;->b(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LhY4;LKP4;Le13;LZr1;Ljava/lang/String;)LFP4;

    move-result-object p1

    return-object p1
.end method
