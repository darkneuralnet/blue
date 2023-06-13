.class public final Ld10$c$c;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ld10$c;->a(LzO2;Ljava/util/List;J)LyO2;
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
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "LOU3$a;",
        "",
        "a",
        "(LOU3$a;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Box.kt\nandroidx/compose/foundation/layout/BoxKt$boxMeasurePolicy$1$measure$5\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,287:1\n13644#2,3:288\n*S KotlinDebug\n*F\n+ 1 Box.kt\nandroidx/compose/foundation/layout/BoxKt$boxMeasurePolicy$1$measure$5\n*L\n164#1:288,3\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:[LOU3;

.field public final synthetic h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LvO2;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic i:LzO2;

.field public final synthetic j:Lkotlin/jvm/internal/Ref$IntRef;

.field public final synthetic k:Lkotlin/jvm/internal/Ref$IntRef;

.field public final synthetic l:LK9;


# direct methods
.method public constructor <init>([LOU3;Ljava/util/List;LzO2;Lkotlin/jvm/internal/Ref$IntRef;Lkotlin/jvm/internal/Ref$IntRef;LK9;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "LOU3;",
            "Ljava/util/List<",
            "+",
            "LvO2;",
            ">;",
            "LzO2;",
            "Lkotlin/jvm/internal/Ref$IntRef;",
            "Lkotlin/jvm/internal/Ref$IntRef;",
            "LK9;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Ld10$c$c;->g:[LOU3;

    iput-object p2, p0, Ld10$c$c;->h:Ljava/util/List;

    iput-object p3, p0, Ld10$c$c;->i:LzO2;

    iput-object p4, p0, Ld10$c$c;->j:Lkotlin/jvm/internal/Ref$IntRef;

    iput-object p5, p0, Ld10$c$c;->k:Lkotlin/jvm/internal/Ref$IntRef;

    iput-object p6, p0, Ld10$c$c;->l:LK9;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LOU3$a;)V
    .locals 18

    move-object/from16 v0, p0

    const-string v1, "$this$layout"

    move-object/from16 v9, p1

    invoke-static {v9, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, v0, Ld10$c$c;->g:[LOU3;

    iget-object v10, v0, Ld10$c$c;->h:Ljava/util/List;

    iget-object v11, v0, Ld10$c$c;->i:LzO2;

    iget-object v12, v0, Ld10$c$c;->j:Lkotlin/jvm/internal/Ref$IntRef;

    iget-object v13, v0, Ld10$c$c;->k:Lkotlin/jvm/internal/Ref$IntRef;

    iget-object v14, v0, Ld10$c$c;->l:LK9;

    array-length v15, v1

    const/4 v2, 0x0

    move v8, v2

    :goto_0
    if-ge v8, v15, :cond_0

    aget-object v3, v1, v8

    add-int/lit8 v16, v2, 0x1

    const-string v4, "null cannot be cast to non-null type androidx.compose.ui.layout.Placeable"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v10, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, LvO2;

    invoke-interface {v11}, LZ62;->getLayoutDirection()Lpm2;

    move-result-object v5

    iget v6, v12, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    iget v7, v13, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    move-object/from16 v2, p1

    move/from16 v17, v8

    move-object v8, v14

    invoke-static/range {v2 .. v8}, Ld10;->c(LOU3$a;LOU3;LvO2;Lpm2;IILK9;)V

    add-int/lit8 v8, v17, 0x1

    move/from16 v2, v16

    goto :goto_0

    :cond_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LOU3$a;

    invoke-virtual {p0, p1}, Ld10$c$c;->a(LOU3$a;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
