.class public LNX0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LIO1;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;LwO1;LGO1;LX10;Landroid/view/animation/Animation;Landroid/view/animation/Animation;Landroid/view/View;)LHO1;
    .locals 9

    new-instance v8, LMX0;

    move-object v0, v8

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    move-object/from16 v7, p7

    invoke-direct/range {v0 .. v7}, LMX0;-><init>(Landroid/view/View;LwO1;LGO1;LX10;Landroid/view/animation/Animation;Landroid/view/animation/Animation;Landroid/view/View;)V

    return-object v8
.end method

.method public b(Landroid/view/View;LwO1;LGO1;LX10;Landroid/view/animation/Animation;Landroid/view/animation/Animation;Landroid/view/View;Ljava/util/List;Landroid/view/View;)LHO1;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "LwO1;",
            "LGO1;",
            "LX10;",
            "Landroid/view/animation/Animation;",
            "Landroid/view/animation/Animation;",
            "Landroid/view/View;",
            "Ljava/util/List<",
            "Landroid/view/View;",
            ">;",
            "Landroid/view/View;",
            ")",
            "LHO1;"
        }
    .end annotation

    new-instance v10, LMX0;

    move-object v0, v10

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    invoke-direct/range {v0 .. v9}, LMX0;-><init>(Landroid/view/View;LwO1;LGO1;LX10;Landroid/view/animation/Animation;Landroid/view/animation/Animation;Landroid/view/View;Ljava/util/List;Landroid/view/View;)V

    return-object v10
.end method
