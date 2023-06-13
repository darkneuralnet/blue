.class public final Lbn2$a$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbn2$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkf<",
        "Ljava/lang/Float;",
        "Lsf;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lkf;",
        "",
        "Lsf;",
        "",
        "a",
        "(Lkf;)V"
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
        "SMAP\nLazyAnimateScroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyAnimateScroll.kt\nandroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2$3\n+ 2 LazyAnimateScroll.kt\nandroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt\n*L\n1#1,264:1\n40#2,4:265\n40#2,4:269\n40#2,4:273\n40#2,4:277\n40#2,4:281\n40#2,4:285\n40#2,4:289\n40#2,4:293\n40#2,4:297\n*S KotlinDebug\n*F\n+ 1 LazyAnimateScroll.kt\nandroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2$3\n*L\n152#1:265,4\n159#1:269,4\n162#1:273,4\n170#1:277,4\n175#1:281,4\n186#1:285,4\n198#1:289,4\n211#1:293,4\n217#1:297,4\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Lcn2;

.field public final synthetic h:I

.field public final synthetic i:F

.field public final synthetic j:Lkotlin/jvm/internal/Ref$FloatRef;

.field public final synthetic k:LWp5;

.field public final synthetic l:Lkotlin/jvm/internal/Ref$BooleanRef;

.field public final synthetic m:Z

.field public final synthetic n:F

.field public final synthetic o:Lkotlin/jvm/internal/Ref$IntRef;

.field public final synthetic p:I

.field public final synthetic q:Lkotlin/jvm/internal/Ref$ObjectRef;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Lnf<",
            "Ljava/lang/Float;",
            "Lsf;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcn2;IFLkotlin/jvm/internal/Ref$FloatRef;LWp5;Lkotlin/jvm/internal/Ref$BooleanRef;ZFLkotlin/jvm/internal/Ref$IntRef;ILkotlin/jvm/internal/Ref$ObjectRef;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcn2;",
            "IF",
            "Lkotlin/jvm/internal/Ref$FloatRef;",
            "LWp5;",
            "Lkotlin/jvm/internal/Ref$BooleanRef;",
            "ZF",
            "Lkotlin/jvm/internal/Ref$IntRef;",
            "I",
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Lnf<",
            "Ljava/lang/Float;",
            "Lsf;",
            ">;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lbn2$a$a;->g:Lcn2;

    iput p2, p0, Lbn2$a$a;->h:I

    iput p3, p0, Lbn2$a$a;->i:F

    iput-object p4, p0, Lbn2$a$a;->j:Lkotlin/jvm/internal/Ref$FloatRef;

    iput-object p5, p0, Lbn2$a$a;->k:LWp5;

    iput-object p6, p0, Lbn2$a$a;->l:Lkotlin/jvm/internal/Ref$BooleanRef;

    iput-boolean p7, p0, Lbn2$a$a;->m:Z

    iput p8, p0, Lbn2$a$a;->n:F

    iput-object p9, p0, Lbn2$a$a;->o:Lkotlin/jvm/internal/Ref$IntRef;

    iput p10, p0, Lbn2$a$a;->p:I

    iput-object p11, p0, Lbn2$a$a;->q:Lkotlin/jvm/internal/Ref$ObjectRef;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lkf;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkf<",
            "Ljava/lang/Float;",
            "Lsf;",
            ">;)V"
        }
    .end annotation

    const-string v0, "$this$animateTo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lbn2$a$a;->g:Lcn2;

    iget v1, p0, Lbn2$a$a;->h:I

    invoke-interface {v0, v1}, Lcn2;->e(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_8

    iget v0, p0, Lbn2$a$a;->i:F

    const/4 v2, 0x0

    cmpl-float v0, v0, v2

    if-lez v0, :cond_0

    invoke-virtual {p1}, Lkf;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    iget v2, p0, Lbn2$a$a;->i:F

    invoke-static {v0, v2}, Lkotlin/ranges/RangesKt;->coerceAtMost(FF)F

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lkf;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    iget v2, p0, Lbn2$a$a;->i:F

    invoke-static {v0, v2}, Lkotlin/ranges/RangesKt;->coerceAtLeast(FF)F

    move-result v0

    :goto_0
    iget-object v2, p0, Lbn2$a$a;->j:Lkotlin/jvm/internal/Ref$FloatRef;

    iget v2, v2, Lkotlin/jvm/internal/Ref$FloatRef;->element:F

    sub-float/2addr v0, v2

    iget-object v2, p0, Lbn2$a$a;->k:LWp5;

    invoke-interface {v2, v0}, LWp5;->a(F)F

    move-result v2

    iget-object v3, p0, Lbn2$a$a;->g:Lcn2;

    iget v4, p0, Lbn2$a$a;->h:I

    invoke-interface {v3, v4}, Lcn2;->e(I)Ljava/lang/Integer;

    move-result-object v3

    if-eqz v3, :cond_1

    goto/16 :goto_3

    :cond_1
    iget-boolean v4, p0, Lbn2$a$a;->m:Z

    iget-object v5, p0, Lbn2$a$a;->g:Lcn2;

    iget v6, p0, Lbn2$a$a;->h:I

    iget v7, p0, Lbn2$a$a;->p:I

    invoke-static {v4, v5, v6, v7}, Lbn2$a;->e(ZLcn2;II)Z

    move-result v4

    if-nez v4, :cond_7

    cmpg-float v2, v0, v2

    if-nez v2, :cond_2

    const/4 v2, 0x1

    goto :goto_1

    :cond_2
    move v2, v1

    :goto_1
    if-nez v2, :cond_3

    invoke-virtual {p1}, Lkf;->a()V

    iget-object p1, p0, Lbn2$a$a;->l:Lkotlin/jvm/internal/Ref$BooleanRef;

    iput-boolean v1, p1, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z

    return-void

    :cond_3
    iget-object v2, p0, Lbn2$a$a;->j:Lkotlin/jvm/internal/Ref$FloatRef;

    iget v4, v2, Lkotlin/jvm/internal/Ref$FloatRef;->element:F

    add-float/2addr v4, v0

    iput v4, v2, Lkotlin/jvm/internal/Ref$FloatRef;->element:F

    iget-boolean v0, p0, Lbn2$a$a;->m:Z

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Lkf;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    iget v2, p0, Lbn2$a$a;->n:F

    cmpl-float v0, v0, v2

    if-lez v0, :cond_5

    invoke-virtual {p1}, Lkf;->a()V

    goto :goto_2

    :cond_4
    invoke-virtual {p1}, Lkf;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    iget v2, p0, Lbn2$a$a;->n:F

    neg-float v2, v2

    cmpg-float v0, v0, v2

    if-gez v0, :cond_5

    invoke-virtual {p1}, Lkf;->a()V

    :cond_5
    :goto_2
    iget-boolean v0, p0, Lbn2$a$a;->m:Z

    const/4 v2, 0x2

    if-eqz v0, :cond_6

    iget-object v0, p0, Lbn2$a$a;->o:Lkotlin/jvm/internal/Ref$IntRef;

    iget v0, v0, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    if-lt v0, v2, :cond_7

    iget v0, p0, Lbn2$a$a;->h:I

    iget-object v2, p0, Lbn2$a$a;->g:Lcn2;

    invoke-interface {v2}, Lcn2;->d()I

    move-result v2

    sub-int/2addr v0, v2

    iget-object v2, p0, Lbn2$a$a;->g:Lcn2;

    invoke-interface {v2}, Lcn2;->h()I

    move-result v2

    if-le v0, v2, :cond_7

    iget-object v0, p0, Lbn2$a$a;->g:Lcn2;

    iget-object v2, p0, Lbn2$a$a;->k:LWp5;

    iget v4, p0, Lbn2$a$a;->h:I

    invoke-interface {v0}, Lcn2;->h()I

    move-result v5

    sub-int/2addr v4, v5

    invoke-interface {v0, v2, v4, v1}, Lcn2;->f(LWp5;II)V

    goto :goto_3

    :cond_6
    iget-object v0, p0, Lbn2$a$a;->o:Lkotlin/jvm/internal/Ref$IntRef;

    iget v0, v0, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    if-lt v0, v2, :cond_7

    iget-object v0, p0, Lbn2$a$a;->g:Lcn2;

    invoke-interface {v0}, Lcn2;->c()I

    move-result v0

    iget v2, p0, Lbn2$a$a;->h:I

    sub-int/2addr v0, v2

    iget-object v2, p0, Lbn2$a$a;->g:Lcn2;

    invoke-interface {v2}, Lcn2;->h()I

    move-result v2

    if-le v0, v2, :cond_7

    iget-object v0, p0, Lbn2$a$a;->g:Lcn2;

    iget-object v2, p0, Lbn2$a$a;->k:LWp5;

    iget v4, p0, Lbn2$a$a;->h:I

    invoke-interface {v0}, Lcn2;->h()I

    move-result v5

    add-int/2addr v4, v5

    invoke-interface {v0, v2, v4, v1}, Lcn2;->f(LWp5;II)V

    :cond_7
    :goto_3
    move-object v0, v3

    :cond_8
    iget-boolean v2, p0, Lbn2$a$a;->m:Z

    iget-object v3, p0, Lbn2$a$a;->g:Lcn2;

    iget v4, p0, Lbn2$a$a;->h:I

    iget v5, p0, Lbn2$a$a;->p:I

    invoke-static {v2, v3, v4, v5}, Lbn2$a;->e(ZLcn2;II)Z

    move-result v2

    if-eqz v2, :cond_9

    iget-object v0, p0, Lbn2$a$a;->g:Lcn2;

    iget-object v2, p0, Lbn2$a$a;->k:LWp5;

    iget v3, p0, Lbn2$a$a;->h:I

    iget v4, p0, Lbn2$a$a;->p:I

    invoke-interface {v0, v2, v3, v4}, Lcn2;->f(LWp5;II)V

    iget-object v0, p0, Lbn2$a$a;->l:Lkotlin/jvm/internal/Ref$BooleanRef;

    iput-boolean v1, v0, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z

    invoke-virtual {p1}, Lkf;->a()V

    return-void

    :cond_9
    if-nez v0, :cond_a

    return-void

    :cond_a
    new-instance p1, Lec2;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object v1, p0, Lbn2$a$a;->q:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v1, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v1, Lnf;

    invoke-direct {p1, v0, v1}, Lec2;-><init>(ILnf;)V

    throw p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkf;

    invoke-virtual {p0, p1}, Lbn2$a$a;->a(Lkf;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
