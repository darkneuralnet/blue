.class public final LPm2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u001a.\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0004H\u0002\u00a8\u0006\u0008"
    }
    d2 = {
        "LJm2;",
        "LLX2;",
        "LvO2;",
        "destination",
        "Lkotlin/Function1;",
        "transform",
        "",
        "b",
        "ui_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nLayoutNodeLayoutDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegateKt\n+ 2 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,1237:1\n165#2:1238\n476#3,11:1239\n*S KotlinDebug\n*F\n+ 1 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegateKt\n*L\n1161#1:1238\n1161#1:1239,11\n*E\n"
    }
.end annotation


# direct methods
.method public static final synthetic a(LJm2;LLX2;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-static {p0, p1, p2}, LPm2;->b(LJm2;LLX2;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static final b(LJm2;LLX2;Lkotlin/jvm/functions/Function1;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LJm2;",
            "LLX2<",
            "LvO2;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "LJm2;",
            "+",
            "LvO2;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0}, LJm2;->w0()LLX2;

    move-result-object v0

    invoke-virtual {v0}, LLX2;->u()I

    move-result v1

    if-lez v1, :cond_2

    invoke-virtual {v0}, LLX2;->s()[Ljava/lang/Object;

    move-result-object v0

    const/4 v2, 0x0

    :cond_0
    aget-object v3, v0, v2

    check-cast v3, LJm2;

    invoke-virtual {p1}, LLX2;->u()I

    move-result v4

    if-gt v4, v2, :cond_1

    invoke-interface {p2, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {p1, v3}, LLX2;->b(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-interface {p2, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {p1, v2, v3}, LLX2;->F(ILjava/lang/Object;)Ljava/lang/Object;

    :goto_0
    add-int/lit8 v2, v2, 0x1

    if-lt v2, v1, :cond_0

    :cond_2
    invoke-virtual {p0}, LJm2;->M()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p0

    invoke-virtual {p1}, LLX2;->u()I

    move-result p2

    invoke-virtual {p1, p0, p2}, LLX2;->D(II)V

    return-void
.end method
