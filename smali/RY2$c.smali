.class public final LRY2$c;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LRY2;->a(LOY2;LJY2;LgV2;LEt0;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function3<",
        "Ljava/lang/String;",
        "LEt0;",
        "Ljava/lang/Integer;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic g:LEX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEX2<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic h:LsP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LsP5<",
            "Ljava/util/List<",
            "LAY2;",
            ">;>;"
        }
    .end annotation
.end field

.field public final synthetic i:Lzt0;

.field public final synthetic j:LEi5;


# direct methods
.method public constructor <init>(LEX2;LsP5;Lzt0;LEi5;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LEX2<",
            "Ljava/lang/Boolean;",
            ">;",
            "LsP5<",
            "+",
            "Ljava/util/List<",
            "LAY2;",
            ">;>;",
            "Lzt0;",
            "LEi5;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, LRY2$c;->g:LEX2;

    iput-object p2, p0, LRY2$c;->h:LsP5;

    iput-object p3, p0, LRY2$c;->i:Lzt0;

    iput-object p4, p0, LRY2$c;->j:LEi5;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/String;

    check-cast p2, LEt0;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LRY2$c;->invoke(Ljava/lang/String;LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Ljava/lang/String;LEt0;I)V
    .locals 5

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v0, p3, 0xe

    if-nez v0, :cond_1

    invoke-interface {p2, p1}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr p3, v0

    :cond_1
    and-int/lit8 p3, p3, 0x5b

    const/16 v0, 0x12

    if-ne p3, v0, :cond_3

    invoke-interface {p2}, LEt0;->b()Z

    move-result p3

    if-nez p3, :cond_2

    goto :goto_1

    :cond_2
    invoke-interface {p2}, LEt0;->k()V

    goto/16 :goto_3

    :cond_3
    :goto_1
    iget-object p3, p0, LRY2$c;->h:LsP5;

    invoke-static {p3}, LRY2;->f(LsP5;)Ljava/util/List;

    move-result-object p3

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v0

    invoke-interface {p3, v0}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object p3

    :cond_4
    invoke-interface {p3}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {p3}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, LAY2;

    invoke-virtual {v1}, LAY2;->g()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_2

    :cond_5
    const/4 v0, 0x0

    :goto_2
    check-cast v0, LAY2;

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    iget-object p3, p0, LRY2$c;->g:LEX2;

    iget-object v1, p0, LRY2$c;->h:LsP5;

    iget-object v2, p0, LRY2$c;->i:Lzt0;

    const v3, -0x383ecf

    invoke-interface {p2, v3}, LEt0;->F(I)V

    invoke-interface {p2, p3}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v3

    invoke-interface {p2, v1}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    invoke-interface {p2, v2}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    invoke-interface {p2}, LEt0;->G()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_6

    sget-object v3, LEt0;->a:LEt0$a;

    invoke-virtual {v3}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v4, v3, :cond_7

    :cond_6
    new-instance v4, LRY2$c$a;

    invoke-direct {v4, p3, v1, v2}, LRY2$c$a;-><init>(LEX2;LsP5;Lzt0;)V

    invoke-interface {p2, v4}, LEt0;->z(Ljava/lang/Object;)V

    :cond_7
    invoke-interface {p2}, LEt0;->Q()V

    check-cast v4, Lkotlin/jvm/functions/Function1;

    const/4 p3, 0x0

    invoke-static {p1, v4, p2, p3}, LY91;->c(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;LEt0;I)V

    if-nez v0, :cond_8

    goto :goto_3

    :cond_8
    iget-object p1, p0, LRY2$c;->j:LEi5;

    new-instance p3, LRY2$c$b;

    invoke-direct {p3, v0}, LRY2$c$b;-><init>(LAY2;)V

    const v1, -0x25a788e0

    const/4 v2, 0x1

    invoke-static {p2, v1, v2, p3}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object p3

    const/16 v1, 0x1c8

    invoke-static {v0, p1, p3, p2, v1}, LBY2;->a(LAY2;LEi5;Lkotlin/jvm/functions/Function2;LEt0;I)V

    :goto_3
    return-void
.end method
