.class public final Lun2$c$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lun2$c;->a(LVn2;J)Lxn2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lrr2;",
        "Ljava/util/ArrayList<",
        "Lkotlin/Pair<",
        "+",
        "Ljava/lang/Integer;",
        "+",
        "Lkz0;",
        ">;>;>;"
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
        "SMAP\nLazyGrid.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGrid.kt\nandroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 ItemIndex.kt\nandroidx/compose/foundation/lazy/grid/ItemIndex\n*L\n1#1,364:1\n33#2,4:365\n38#2:370\n39#3:369\n*S KotlinDebug\n*F\n+ 1 LazyGrid.kt\nandroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1$1\n*L\n305#1:365,4\n305#1:370\n308#1:369\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LFn2;

.field public final synthetic h:LHo2;


# direct methods
.method public constructor <init>(LFn2;LHo2;)V
    .locals 0

    iput-object p1, p0, Lun2$c$a;->g:LFn2;

    iput-object p2, p0, Lun2$c$a;->h:LHo2;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final b(I)Ljava/util/ArrayList;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/ArrayList<",
            "Lkotlin/Pair<",
            "Ljava/lang/Integer;",
            "Lkz0;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lun2$c$a;->g:LFn2;

    invoke-virtual {v0, p1}, LFn2;->c(I)LFn2$c;

    move-result-object p1

    invoke-virtual {p1}, LFn2$c;->a()I

    move-result v0

    invoke-static {v0}, Luc2;->b(I)I

    move-result v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-virtual {p1}, LFn2$c;->b()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {p1}, LFn2$c;->b()Ljava/util/List;

    move-result-object p1

    iget-object v2, p0, Lun2$c$a;->h:LHo2;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v3

    const/4 v4, 0x0

    move v5, v4

    :goto_0
    if-ge v4, v3, :cond_0

    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LdE1;

    invoke-virtual {v6}, LdE1;->g()J

    move-result-wide v6

    invoke-static {v6, v7}, LdE1;->d(J)I

    move-result v6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v2, v5, v6}, LHo2;->a(II)J

    move-result-wide v8

    invoke-static {v8, v9}, Lkz0;->b(J)Lkz0;

    move-result-object v8

    invoke-static {v7, v8}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v7

    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Luc2;->b(I)I

    move-result v0

    add-int/2addr v5, v6

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lrr2;

    invoke-virtual {p1}, Lrr2;->g()I

    move-result p1

    invoke-virtual {p0, p1}, Lun2$c$a;->b(I)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1
.end method
