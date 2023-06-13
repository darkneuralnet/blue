.class public LDd1$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LDd1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public final a:LrV0$e;

.field public final b:LgY3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LgY3<",
            "LrV0<",
            "*>;>;"
        }
    .end annotation
.end field

.field public c:I


# direct methods
.method public constructor <init>(LrV0$e;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LDd1$a$a;

    invoke-direct {v0, p0}, LDd1$a$a;-><init>(LDd1$a;)V

    const/16 v1, 0x96

    invoke-static {v1, v0}, Luj1;->d(ILuj1$d;)LgY3;

    move-result-object v0

    iput-object v0, p0, LDd1$a;->b:LgY3;

    iput-object p1, p0, LDd1$a;->a:LrV0$e;

    return-void
.end method


# virtual methods
.method public a(Lcom/bumptech/glide/c;Ljava/lang/Object;LHd1;Lak2;IILjava/lang/Class;Ljava/lang/Class;LP24;LB41;Ljava/util/Map;ZZZLsy3;LrV0$b;)LrV0;
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/bumptech/glide/c;",
            "Ljava/lang/Object;",
            "LHd1;",
            "Lak2;",
            "II",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "TR;>;",
            "LP24;",
            "LB41;",
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Lr96<",
            "*>;>;ZZZ",
            "Lsy3;",
            "LrV0$b<",
            "TR;>;)",
            "LrV0<",
            "TR;>;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v6, p5

    move/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move/from16 v13, p12

    move/from16 v14, p13

    move/from16 v15, p14

    move-object/from16 v16, p15

    move-object/from16 v17, p16

    iget-object v1, v0, LDd1$a;->b:LgY3;

    invoke-interface {v1}, LgY3;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LrV0;

    invoke-static {v1}, LzZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LrV0;

    move-object/from16 p1, v1

    iget v1, v0, LDd1$a;->c:I

    move/from16 v18, v1

    add-int/lit8 v1, v1, 0x1

    iput v1, v0, LDd1$a;->c:I

    move-object/from16 v1, p1

    invoke-virtual/range {v1 .. v18}, LrV0;->n(Lcom/bumptech/glide/c;Ljava/lang/Object;LHd1;Lak2;IILjava/lang/Class;Ljava/lang/Class;LP24;LB41;Ljava/util/Map;ZZZLsy3;LrV0$b;I)LrV0;

    move-result-object v1

    return-object v1
.end method
