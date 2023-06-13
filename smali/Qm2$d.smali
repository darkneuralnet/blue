.class public final LQm2$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZS5$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LQm2;->t(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)LZS5$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0008\u0010\u0003\u001a\u00020\u0002H\u0016J%\u0010\u0008\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\tR\u0014\u0010\u000c\u001a\u00020\u00048VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\n\u0010\u000b\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006\r"
    }
    d2 = {
        "Qm2$d",
        "LZS5$a;",
        "",
        "dispose",
        "",
        "index",
        "Lkz0;",
        "constraints",
        "b",
        "(IJ)V",
        "a",
        "()I",
        "placeablesCount",
        "ui_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nSubcomposeLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/LayoutNodeSubcompositionsState$precompose$1\n+ 2 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n*L\n1#1,774:1\n1114#2,4:775\n*S KotlinDebug\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/LayoutNodeSubcompositionsState$precompose$1\n*L\n677#1:775,4\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic a:LQm2;

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LQm2;Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, LQm2$d;->a:LQm2;

    iput-object p2, p0, LQm2$d;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()I
    .locals 2

    iget-object v0, p0, LQm2$d;->a:LQm2;

    invoke-static {v0}, LQm2;->b(LQm2;)Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, LQm2$d;->b:Ljava/lang/Object;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LJm2;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LJm2;->M()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public b(IJ)V
    .locals 3

    iget-object v0, p0, LQm2$d;->a:LQm2;

    invoke-static {v0}, LQm2;->b(LQm2;)Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, LQm2$d;->b:Ljava/lang/Object;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LJm2;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, LJm2;->J0()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {v0}, LJm2;->M()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ltz p1, :cond_1

    if-ge p1, v1, :cond_1

    invoke-virtual {v0}, LJm2;->n()Z

    move-result v1

    const/4 v2, 0x1

    xor-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget-object v1, p0, LQm2$d;->a:LQm2;

    invoke-static {v1}, LQm2;->e(LQm2;)LJm2;

    move-result-object v1

    invoke-static {v1, v2}, LJm2;->w(LJm2;Z)V

    invoke-static {v0}, LNm2;->a(LJm2;)LjD3;

    move-result-object v2

    invoke-virtual {v0}, LJm2;->M()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LJm2;

    invoke-interface {v2, p1, p2, p3}, LjD3;->O(LJm2;J)V

    const/4 p1, 0x0

    invoke-static {v1, p1}, LJm2;->w(LJm2;Z)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Failed requirement."

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p2, Ljava/lang/IndexOutOfBoundsException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Index ("

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ") is out of bound of [0, "

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 p1, 0x29

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_2
    :goto_0
    return-void
.end method

.method public dispose()V
    .locals 6

    iget-object v0, p0, LQm2$d;->a:LQm2;

    invoke-virtual {v0}, LQm2;->q()V

    iget-object v0, p0, LQm2$d;->a:LQm2;

    invoke-static {v0}, LQm2;->b(LQm2;)Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, LQm2$d;->b:Ljava/lang/Object;

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LJm2;

    if-eqz v0, :cond_4

    iget-object v1, p0, LQm2$d;->a:LQm2;

    invoke-static {v1}, LQm2;->c(LQm2;)I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-lez v1, :cond_0

    move v1, v3

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    const-string v4, "Check failed."

    if-eqz v1, :cond_3

    iget-object v1, p0, LQm2$d;->a:LQm2;

    invoke-static {v1}, LQm2;->e(LQm2;)LJm2;

    move-result-object v1

    invoke-virtual {v1}, LJm2;->P()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v0

    iget-object v1, p0, LQm2$d;->a:LQm2;

    invoke-static {v1}, LQm2;->e(LQm2;)LJm2;

    move-result-object v1

    invoke-virtual {v1}, LJm2;->P()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    iget-object v5, p0, LQm2$d;->a:LQm2;

    invoke-static {v5}, LQm2;->c(LQm2;)I

    move-result v5

    sub-int/2addr v1, v5

    if-lt v0, v1, :cond_1

    move v2, v3

    :cond_1
    if-eqz v2, :cond_2

    iget-object v1, p0, LQm2$d;->a:LQm2;

    invoke-static {v1}, LQm2;->d(LQm2;)I

    move-result v2

    add-int/2addr v2, v3

    invoke-static {v1, v2}, LQm2;->j(LQm2;I)V

    iget-object v1, p0, LQm2$d;->a:LQm2;

    invoke-static {v1}, LQm2;->c(LQm2;)I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-static {v1, v2}, LQm2;->i(LQm2;I)V

    iget-object v1, p0, LQm2$d;->a:LQm2;

    invoke-static {v1}, LQm2;->e(LQm2;)LJm2;

    move-result-object v1

    invoke-virtual {v1}, LJm2;->P()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    iget-object v2, p0, LQm2$d;->a:LQm2;

    invoke-static {v2}, LQm2;->c(LQm2;)I

    move-result v2

    sub-int/2addr v1, v2

    iget-object v2, p0, LQm2$d;->a:LQm2;

    invoke-static {v2}, LQm2;->d(LQm2;)I

    move-result v2

    sub-int/2addr v1, v2

    iget-object v2, p0, LQm2$d;->a:LQm2;

    invoke-static {v2, v0, v1, v3}, LQm2;->g(LQm2;III)V

    iget-object v0, p0, LQm2$d;->a:LQm2;

    invoke-virtual {v0, v1}, LQm2;->n(I)V

    goto :goto_1

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    :goto_1
    return-void
.end method
