.class public final Lo9$e$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo9$e;->a(LzO2;Ljava/util/List;J)LyO2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LOU3$a;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nAlertDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlertDialog.kt\nandroidx/compose/material/AlertDialogKt$AlertDialogFlowRow$1$measure$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,291:1\n69#2,4:292\n69#2,6:296\n74#2:302\n*S KotlinDebug\n*F\n+ 1 AlertDialog.kt\nandroidx/compose/material/AlertDialogKt$AlertDialogFlowRow$1$measure$1\n*L\n259#1:292,4\n271#1:296,6\n259#1:302\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/util/List<",
            "LOU3;",
            ">;>;"
        }
    .end annotation
.end field

.field public final synthetic h:LzO2;

.field public final synthetic i:F

.field public final synthetic j:I

.field public final synthetic k:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/List;LzO2;FILjava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/util/List<",
            "LOU3;",
            ">;>;",
            "LzO2;",
            "FI",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lo9$e$a;->g:Ljava/util/List;

    iput-object p2, p0, Lo9$e$a;->h:LzO2;

    iput p3, p0, Lo9$e$a;->i:F

    iput p4, p0, Lo9$e$a;->j:I

    iput-object p5, p0, Lo9$e$a;->k:Ljava/util/List;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LOU3$a;)V
    .locals 22

    move-object/from16 v0, p0

    const-string v1, "$this$layout"

    move-object/from16 v9, p1

    invoke-static {v9, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, v0, Lo9$e$a;->g:Ljava/util/List;

    iget-object v10, v0, Lo9$e$a;->h:LzO2;

    iget v11, v0, Lo9$e$a;->i:F

    iget v12, v0, Lo9$e$a;->j:I

    iget-object v13, v0, Lo9$e$a;->k:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v14

    const/4 v15, 0x0

    move v8, v15

    :goto_0
    if-ge v8, v14, :cond_4

    invoke-interface {v1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    move-object v7, v2

    check-cast v7, Ljava/util/List;

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v2

    new-array v3, v2, [I

    move v4, v15

    :goto_1
    if-ge v4, v2, :cond_1

    invoke-interface {v7, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LOU3;

    invoke-virtual {v5}, LOU3;->i1()I

    move-result v5

    invoke-static {v7}, Lkotlin/collections/CollectionsKt;->getLastIndex(Ljava/util/List;)I

    move-result v6

    if-ge v4, v6, :cond_0

    invoke-interface {v10, v11}, Lg01;->F0(F)I

    move-result v6

    goto :goto_2

    :cond_0
    move v6, v15

    :goto_2
    add-int/2addr v5, v6

    aput v5, v3, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_1
    sget-object v4, Llo;->a:Llo;

    invoke-virtual {v4}, Llo;->a()Llo$l;

    move-result-object v4

    new-array v6, v2, [I

    move v5, v15

    :goto_3
    if-ge v5, v2, :cond_2

    aput v15, v6, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_3

    :cond_2
    invoke-interface {v4, v10, v12, v3, v6}, Llo$l;->c(Lg01;I[I[I)V

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v5

    move v4, v15

    :goto_4
    if-ge v4, v5, :cond_3

    invoke-interface {v7, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, LOU3;

    aget v16, v6, v4

    invoke-interface {v13, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v17

    const/16 v18, 0x0

    const/16 v19, 0x4

    const/16 v20, 0x0

    move-object/from16 v2, p1

    move/from16 v21, v4

    move/from16 v4, v16

    move/from16 v16, v5

    move/from16 v5, v17

    move-object/from16 v17, v6

    move/from16 v6, v18

    move-object/from16 v18, v7

    move/from16 v7, v19

    move/from16 v19, v8

    move-object/from16 v8, v20

    invoke-static/range {v2 .. v8}, LOU3$a;->n(LOU3$a;LOU3;IIFILjava/lang/Object;)V

    add-int/lit8 v4, v21, 0x1

    move/from16 v5, v16

    move-object/from16 v6, v17

    move-object/from16 v7, v18

    move/from16 v8, v19

    goto :goto_4

    :cond_3
    move/from16 v19, v8

    add-int/lit8 v8, v19, 0x1

    goto/16 :goto_0

    :cond_4
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LOU3$a;

    invoke-virtual {p0, p1}, Lo9$e$a;->a(LOU3$a;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
