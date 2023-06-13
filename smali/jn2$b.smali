.class public final Ljn2$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ljn2;->d(LcE1;Llo$d;LPD3;LEt0;I)Lkotlin/jvm/functions/Function2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lg01;",
        "Lkz0;",
        "Ljava/util/List<",
        "Ljava/lang/Integer;",
        ">;>;"
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
        "SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt$rememberColumnWidthSums$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,493:1\n51#2:494\n*S KotlinDebug\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt$rememberColumnWidthSums$1$1\n*L\n162#1:494\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LPD3;

.field public final synthetic h:LcE1;

.field public final synthetic i:Llo$d;


# direct methods
.method public constructor <init>(LPD3;LcE1;Llo$d;)V
    .locals 0

    iput-object p1, p0, Ljn2$b;->g:LPD3;

    iput-object p2, p0, Ljn2$b;->h:LcE1;

    iput-object p3, p0, Ljn2$b;->i:Llo$d;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lg01;J)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg01;",
            "J)",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    const-string v0, "$this$null"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, p3}, Lkz0;->n(J)I

    move-result v0

    const v1, 0x7fffffff

    const/4 v2, 0x1

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    iget-object v0, p0, Ljn2$b;->g:LPD3;

    sget-object v1, Lpm2;->b:Lpm2;

    invoke-static {v0, v1}, LND3;->g(LPD3;Lpm2;)F

    move-result v0

    iget-object v3, p0, Ljn2$b;->g:LPD3;

    invoke-static {v3, v1}, LND3;->f(LPD3;Lpm2;)F

    move-result v1

    add-float/2addr v0, v1

    invoke-static {v0}, Lk61;->g(F)F

    move-result v0

    invoke-static {p2, p3}, Lkz0;->n(J)I

    move-result p2

    invoke-interface {p1, v0}, Lg01;->F0(F)I

    move-result p3

    sub-int/2addr p2, p3

    iget-object p3, p0, Ljn2$b;->h:LcE1;

    iget-object v0, p0, Ljn2$b;->i:Llo$d;

    invoke-interface {v0}, Llo$d;->a()F

    move-result v0

    invoke-interface {p1, v0}, Lg01;->F0(F)I

    move-result v0

    invoke-interface {p3, p1, p2, v0}, LcE1;->a(Lg01;II)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p2

    :goto_1
    if-ge v2, p2, :cond_1

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    add-int/lit8 v0, v2, -0x1

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    add-int/2addr p3, v0

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-interface {p1, v2, p3}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    return-object p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "LazyVerticalGrid\'s width should be bound by parent."

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Lg01;

    check-cast p2, Lkz0;

    invoke-virtual {p2}, Lkz0;->s()J

    move-result-wide v0

    invoke-virtual {p0, p1, v0, v1}, Ljn2$b;->a(Lg01;J)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
