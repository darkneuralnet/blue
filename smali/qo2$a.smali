.class public final Lqo2$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function4;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lqo2;-><init>(LR62;Lkotlin/ranges/IntRange;Ljava/util/List;LMn2;LCo2;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function4<",
        "LR62$a<",
        "+",
        "Llo2;",
        ">;",
        "Ljava/lang/Integer;",
        "LEt0;",
        "Ljava/lang/Integer;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u000b\u00a2\u0006\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "LR62$a;",
        "Llo2;",
        "interval",
        "",
        "index",
        "",
        "a",
        "(LR62$a;ILEt0;I)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LCo2;

.field public final synthetic h:LMn2;


# direct methods
.method public constructor <init>(LCo2;LMn2;)V
    .locals 0

    iput-object p1, p0, Lqo2$a;->g:LCo2;

    iput-object p2, p0, Lqo2$a;->h:LMn2;

    const/4 p1, 0x4

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LR62$a;ILEt0;I)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LR62$a<",
            "Llo2;",
            ">;I",
            "LEt0;",
            "I)V"
        }
    .end annotation

    const-string v0, "interval"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v0, p4, 0xe

    if-nez v0, :cond_1

    invoke-interface {p3, p1}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, p4

    goto :goto_1

    :cond_1
    move v0, p4

    :goto_1
    and-int/lit8 p4, p4, 0x70

    if-nez p4, :cond_3

    invoke-interface {p3, p2}, LEt0;->r(I)Z

    move-result p4

    if-eqz p4, :cond_2

    const/16 p4, 0x20

    goto :goto_2

    :cond_2
    const/16 p4, 0x10

    :goto_2
    or-int/2addr v0, p4

    :cond_3
    and-int/lit16 p4, v0, 0x2db

    const/16 v1, 0x92

    if-ne p4, v1, :cond_5

    invoke-interface {p3}, LEt0;->b()Z

    move-result p4

    if-nez p4, :cond_4

    goto :goto_3

    :cond_4
    invoke-interface {p3}, LEt0;->k()V

    goto :goto_5

    :cond_5
    :goto_3
    invoke-static {}, LQt0;->O()Z

    move-result p4

    if-eqz p4, :cond_6

    const/4 p4, -0x1

    const-string v1, "androidx.compose.foundation.lazy.LazyListItemProviderImpl.$$delegate_0.<anonymous> (LazyListItemProvider.kt:81)"

    const v2, 0x7b689f43

    invoke-static {v2, v0, p4, v1}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_6
    invoke-virtual {p1}, LR62$a;->b()I

    move-result p4

    sub-int p4, p2, p4

    invoke-virtual {p1}, LR62$a;->c()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Llo2;

    invoke-virtual {v1}, Llo2;->getKey()Lkotlin/jvm/functions/Function1;

    move-result-object v1

    if-eqz v1, :cond_7

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    goto :goto_4

    :cond_7
    const/4 v1, 0x0

    :goto_4
    move-object v2, v1

    iget-object v1, p0, Lqo2$a;->g:LCo2;

    invoke-virtual {v1}, LCo2;->s()LZn2;

    move-result-object v4

    new-instance v1, Lqo2$a$a;

    iget-object v3, p0, Lqo2$a;->h:LMn2;

    invoke-direct {v1, p1, v3, p4}, Lqo2$a$a;-><init>(LR62$a;LMn2;I)V

    const p1, 0x4827c4cf

    const/4 p4, 0x1

    invoke-static {p3, p1, p4, v1}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v5

    and-int/lit8 p1, v0, 0x70

    or-int/lit16 v7, p1, 0xe08

    move v3, p2

    move-object v6, p3

    invoke-static/range {v2 .. v7}, LYn2;->a(Ljava/lang/Object;ILZn2;Lkotlin/jvm/functions/Function2;LEt0;I)V

    invoke-static {}, LQt0;->O()Z

    move-result p1

    if-eqz p1, :cond_8

    invoke-static {}, LQt0;->Y()V

    :cond_8
    :goto_5
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LR62$a;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    check-cast p3, LEt0;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p4

    invoke-virtual {p0, p1, p2, p3, p4}, Lqo2$a;->a(LR62$a;ILEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
