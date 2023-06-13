.class public final LM25;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LL25;


# instance fields
.field public final a:LN25;


# direct methods
.method public constructor <init>(LN25;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LM25;->a:LN25;

    return-void
.end method

.method public static b(LN25;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LN25;",
            ")",
            "LY94<",
            "LL25;",
            ">;"
        }
    .end annotation

    new-instance v0, LM25;

    invoke-direct {v0, p0}, LM25;-><init>(LN25;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Landroid/content/Context;LG95;LP75;LwQ2;Le13;LDQ3;LsJ4;Lbz1;LZr1;LL44;)Li25;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;",
            "Landroid/content/Context;",
            "LG95;",
            "LP75;",
            "LwQ2;",
            "Le13;",
            "LDQ3;",
            "LsJ4;",
            "Lbz1;",
            "LZr1;",
            "LL44;",
            ")",
            "Li25;"
        }
    .end annotation

    move-object v0, p0

    iget-object v1, v0, LM25;->a:LN25;

    move-object v2, p1

    move-object v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    invoke-virtual/range {v1 .. v12}, LN25;->b(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Landroid/content/Context;LG95;LP75;LwQ2;Le13;LDQ3;LsJ4;Lbz1;LZr1;LL44;)Li25;

    move-result-object v1

    return-object v1
.end method
