.class public final LMe$d$c;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LMe$d;->invoke(LEt0;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function3<",
        "LTe;",
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
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic g:LOe;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LOe<",
            "TS;>;"
        }
    .end annotation
.end field

.field public final synthetic h:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TS;"
        }
    .end annotation
.end field

.field public final synthetic i:Lkotlin/jvm/functions/Function4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function4<",
            "LTe;",
            "TS;",
            "LEt0;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic j:I

.field public final synthetic k:LMM5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LMM5<",
            "TS;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LOe;Ljava/lang/Object;Lkotlin/jvm/functions/Function4;ILMM5;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LOe<",
            "TS;>;TS;",
            "Lkotlin/jvm/functions/Function4<",
            "-",
            "LTe;",
            "-TS;-",
            "LEt0;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;I",
            "LMM5<",
            "TS;>;)V"
        }
    .end annotation

    iput-object p1, p0, LMe$d$c;->g:LOe;

    iput-object p2, p0, LMe$d$c;->h:Ljava/lang/Object;

    iput-object p3, p0, LMe$d$c;->i:Lkotlin/jvm/functions/Function4;

    iput p4, p0, LMe$d$c;->j:I

    iput-object p5, p0, LMe$d$c;->k:LMM5;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LTe;

    check-cast p2, LEt0;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LMe$d$c;->invoke(LTe;LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LTe;LEt0;I)V
    .locals 4

    const-string v0, "$this$AnimatedVisibility"

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
    and-int/lit8 v0, p3, 0x5b

    const/16 v1, 0x12

    if-ne v0, v1, :cond_3

    invoke-interface {p2}, LEt0;->b()Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    invoke-interface {p2}, LEt0;->k()V

    goto :goto_2

    :cond_3
    :goto_1
    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 v0, -0x1

    const-string v1, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous>.<anonymous> (AnimatedContent.kt:690)"

    const v2, -0x70f1d811

    invoke-static {v2, p3, v0, v1}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_4
    new-instance v0, LMe$d$c$a;

    iget-object v1, p0, LMe$d$c;->k:LMM5;

    iget-object v2, p0, LMe$d$c;->h:Ljava/lang/Object;

    iget-object v3, p0, LMe$d$c;->g:LOe;

    invoke-direct {v0, v1, v2, v3}, LMe$d$c$a;-><init>(LMM5;Ljava/lang/Object;LOe;)V

    and-int/lit8 p3, p3, 0xe

    invoke-static {p1, v0, p2, p3}, LY91;->c(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;LEt0;I)V

    iget-object v0, p0, LMe$d$c;->g:LOe;

    invoke-virtual {v0}, LOe;->g()Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, LMe$d$c;->h:Ljava/lang/Object;

    move-object v2, p1

    check-cast v2, LUe;

    invoke-virtual {v2}, LUe;->a()LEX2;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, LMe$d$c;->i:Lkotlin/jvm/functions/Function4;

    iget-object v1, p0, LMe$d$c;->h:Ljava/lang/Object;

    iget v2, p0, LMe$d$c;->j:I

    shr-int/lit8 v2, v2, 0x9

    and-int/lit16 v2, v2, 0x380

    or-int/2addr p3, v2

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-interface {v0, p1, v1, p2, p3}, Lkotlin/jvm/functions/Function4;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, LQt0;->O()Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-static {}, LQt0;->Y()V

    :cond_5
    :goto_2
    return-void
.end method
