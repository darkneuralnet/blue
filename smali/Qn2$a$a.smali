.class public final LQn2$a$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LQn2$a;->c()Lkotlin/jvm/functions/Function2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function2<",
        "LEt0;",
        "Ljava/lang/Integer;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0010\u0003\u001a\u00020\u0000H\u000b\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "",
        "invoke",
        "(LEt0;I)V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LQn2;

.field public final synthetic h:LQn2$a;


# direct methods
.method public constructor <init>(LQn2;LQn2$a;)V
    .locals 0

    iput-object p1, p0, LQn2$a$a;->g:LQn2;

    iput-object p2, p0, LQn2$a$a;->h:LQn2$a;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LEt0;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LQn2$a$a;->invoke(LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LEt0;I)V
    .locals 4

    and-int/lit8 v0, p2, 0xb

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    invoke-interface {p1}, LEt0;->b()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, LEt0;->k()V

    goto/16 :goto_2

    :cond_1
    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v1, "androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory.CachedItemContent.createContentLambda.<anonymous> (LazyLayoutItemContentFactory.kt:89)"

    const v2, 0x53af4291

    invoke-static {v2, p2, v0, v1}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    iget-object p2, p0, LQn2$a$a;->g:LQn2;

    invoke-virtual {p2}, LQn2;->d()Lkotlin/jvm/functions/Function0;

    move-result-object p2

    invoke-interface {p2}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LRn2;

    invoke-interface {p2}, LRn2;->b()Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, LQn2$a$a;->h:LQn2$a;

    invoke-virtual {v1}, LQn2$a;->e()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_3

    iget-object v1, p0, LQn2$a$a;->h:LQn2$a;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v2

    invoke-static {v1, v2}, LQn2$a;->a(LQn2$a;I)V

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    goto :goto_1

    :cond_3
    iget-object v0, p0, LQn2$a$a;->h:LQn2$a;

    invoke-virtual {v0}, LQn2$a;->f()I

    move-result v0

    :goto_1
    const v1, -0x2aa9ca91

    invoke-interface {p1, v1}, LEt0;->F(I)V

    invoke-interface {p2}, LRn2;->getItemCount()I

    move-result v1

    if-ge v0, v1, :cond_4

    invoke-interface {p2, v0}, LRn2;->c(I)Ljava/lang/Object;

    move-result-object v1

    iget-object v2, p0, LQn2$a$a;->h:LQn2$a;

    invoke-virtual {v2}, LQn2$a;->e()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    iget-object v2, p0, LQn2$a$a;->g:LQn2;

    invoke-static {v2}, LQn2;->a(LQn2;)LEi5;

    move-result-object v2

    new-instance v3, LQn2$a$a$a;

    invoke-direct {v3, p2, v0}, LQn2$a$a$a;-><init>(LRn2;I)V

    const p2, -0x49d78e04

    const/4 v0, 0x1

    invoke-static {p1, p2, v0, v3}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object p2

    const/16 v0, 0x238

    invoke-interface {v2, v1, p2, p1, v0}, LEi5;->c(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;LEt0;I)V

    :cond_4
    invoke-interface {p1}, LEt0;->Q()V

    iget-object p2, p0, LQn2$a$a;->h:LQn2$a;

    invoke-virtual {p2}, LQn2$a;->e()Ljava/lang/Object;

    move-result-object p2

    new-instance v0, LQn2$a$a$b;

    iget-object v1, p0, LQn2$a$a;->h:LQn2$a;

    invoke-direct {v0, v1}, LQn2$a$a$b;-><init>(LQn2$a;)V

    const/16 v1, 0x8

    invoke-static {p2, v0, p1, v1}, LY91;->c(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;LEt0;I)V

    invoke-static {}, LQt0;->O()Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-static {}, LQt0;->Y()V

    :cond_5
    :goto_2
    return-void
.end method
