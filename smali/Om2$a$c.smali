.class public final LOm2$a$c;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LOm2$a;->S()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "",
        "invoke"
    }
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
        "SMAP\nLayoutNodeLayoutDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegate$LookaheadPassDelegate$layoutChildren$1\n+ 2 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegate$LookaheadPassDelegate\n+ 3 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,1237:1\n685#2:1238\n686#2,2:1247\n685#2:1265\n686#2,2:1274\n163#3:1239\n163#3:1253\n163#3:1266\n460#4,7:1240\n467#4,4:1249\n460#4,11:1254\n460#4,7:1267\n467#4,4:1276\n*S KotlinDebug\n*F\n+ 1 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegate$LookaheadPassDelegate$layoutChildren$1\n*L\n707#1:1238\n707#1:1247,2\n729#1:1265\n729#1:1274,2\n707#1:1239\n711#1:1253\n729#1:1266\n707#1:1240,7\n707#1:1249,4\n711#1:1254,11\n729#1:1267,7\n729#1:1276,4\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LOm2$a;

.field public final synthetic h:LOm2;

.field public final synthetic i:LTC2;


# direct methods
.method public constructor <init>(LOm2$a;LOm2;LTC2;)V
    .locals 0

    iput-object p1, p0, LOm2$a$c;->g:LOm2$a;

    iput-object p2, p0, LOm2$a$c;->h:LOm2;

    iput-object p3, p0, LOm2$a$c;->i:LTC2;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LOm2$a$c;->invoke()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .locals 7

    iget-object v0, p0, LOm2$a$c;->g:LOm2$a;

    iget-object v0, v0, LOm2$a;->s:LOm2;

    invoke-static {v0}, LOm2;->a(LOm2;)LJm2;

    move-result-object v0

    invoke-virtual {v0}, LJm2;->w0()LLX2;

    move-result-object v0

    invoke-virtual {v0}, LLX2;->u()I

    move-result v1

    const/4 v2, 0x0

    if-lez v1, :cond_1

    invoke-virtual {v0}, LLX2;->s()[Ljava/lang/Object;

    move-result-object v0

    move v3, v2

    :cond_0
    aget-object v4, v0, v3

    check-cast v4, LJm2;

    invoke-virtual {v4}, LJm2;->X()LOm2;

    move-result-object v4

    invoke-virtual {v4}, LOm2;->w()LOm2$a;

    move-result-object v4

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v4}, LOm2$a;->n()Z

    move-result v5

    invoke-static {v4, v5}, LOm2$a;->o1(LOm2$a;Z)V

    invoke-virtual {v4, v2}, LOm2$a;->C1(Z)V

    add-int/lit8 v3, v3, 0x1

    if-lt v3, v1, :cond_0

    :cond_1
    iget-object v0, p0, LOm2$a$c;->h:LOm2;

    invoke-static {v0}, LOm2;->a(LOm2;)LJm2;

    move-result-object v0

    invoke-virtual {v0}, LJm2;->w0()LLX2;

    move-result-object v0

    invoke-virtual {v0}, LLX2;->u()I

    move-result v1

    if-lez v1, :cond_4

    invoke-virtual {v0}, LLX2;->s()[Ljava/lang/Object;

    move-result-object v0

    move v3, v2

    :cond_2
    aget-object v4, v0, v3

    check-cast v4, LJm2;

    invoke-virtual {v4}, LJm2;->j0()LJm2$g;

    move-result-object v5

    sget-object v6, LJm2$g;->c:LJm2$g;

    if-ne v5, v6, :cond_3

    sget-object v5, LJm2$g;->d:LJm2$g;

    invoke-virtual {v4, v5}, LJm2;->x1(LJm2$g;)V

    :cond_3
    add-int/lit8 v3, v3, 0x1

    if-lt v3, v1, :cond_2

    :cond_4
    iget-object v0, p0, LOm2$a$c;->g:LOm2$a;

    sget-object v1, LOm2$a$c$a;->g:LOm2$a$c$a;

    invoke-virtual {v0, v1}, LOm2$a;->Y0(Lkotlin/jvm/functions/Function1;)V

    iget-object v0, p0, LOm2$a$c;->i:LTC2;

    invoke-virtual {v0}, LTC2;->s1()LyO2;

    move-result-object v0

    invoke-interface {v0}, LyO2;->c()V

    iget-object v0, p0, LOm2$a$c;->g:LOm2$a;

    sget-object v1, LOm2$a$c$b;->g:LOm2$a$c$b;

    invoke-virtual {v0, v1}, LOm2$a;->Y0(Lkotlin/jvm/functions/Function1;)V

    iget-object v0, p0, LOm2$a$c;->g:LOm2$a;

    iget-object v0, v0, LOm2$a;->s:LOm2;

    invoke-static {v0}, LOm2;->a(LOm2;)LJm2;

    move-result-object v0

    invoke-virtual {v0}, LJm2;->w0()LLX2;

    move-result-object v0

    invoke-virtual {v0}, LLX2;->u()I

    move-result v1

    if-lez v1, :cond_7

    invoke-virtual {v0}, LLX2;->s()[Ljava/lang/Object;

    move-result-object v0

    :cond_5
    aget-object v3, v0, v2

    check-cast v3, LJm2;

    invoke-virtual {v3}, LJm2;->X()LOm2;

    move-result-object v3

    invoke-virtual {v3}, LOm2;->w()LOm2$a;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v3}, LOm2$a;->n()Z

    move-result v4

    if-nez v4, :cond_6

    invoke-static {v3}, LOm2$a;->n1(LOm2$a;)V

    :cond_6
    add-int/lit8 v2, v2, 0x1

    if-lt v2, v1, :cond_5

    :cond_7
    return-void
.end method
