.class public final LPz3$f;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LPz3;->j(LgV2;JLPD3;)LgV2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LPz3$f$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LiA0;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "LiA0;",
        "",
        "a",
        "(LiA0;)V"
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
        "SMAP\nOutlinedTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OutlinedTextField.kt\nandroidx/compose/material/OutlinedTextFieldKt$outlineCutout$1\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,981:1\n221#2:982\n261#2,11:983\n*S KotlinDebug\n*F\n+ 1 OutlinedTextField.kt\nandroidx/compose/material/OutlinedTextFieldKt$outlineCutout$1\n*L\n963#1:982\n963#1:983,11\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:J

.field public final synthetic h:LPD3;


# direct methods
.method public constructor <init>(JLPD3;)V
    .locals 0

    iput-wide p1, p0, LPz3$f;->g:J

    iput-object p3, p0, LPz3$f;->h:LPD3;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LiA0;)V
    .locals 13

    const-string v0, "$this$drawWithContent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-wide v0, p0, LPz3$f;->g:J

    invoke-static {v0, v1}, LxB5;->i(J)F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v2, v0, v1

    if-lez v2, :cond_2

    invoke-static {}, LPz3;->f()F

    move-result v2

    invoke-interface {p1, v2}, Lg01;->T0(F)F

    move-result v2

    iget-object v3, p0, LPz3$f;->h:LPD3;

    invoke-interface {p1}, LI61;->getLayoutDirection()Lpm2;

    move-result-object v4

    invoke-interface {v3, v4}, LPD3;->b(Lpm2;)F

    move-result v3

    invoke-interface {p1, v3}, Lg01;->T0(F)F

    move-result v3

    sub-float/2addr v3, v2

    add-float/2addr v0, v3

    const/4 v4, 0x2

    int-to-float v4, v4

    mul-float/2addr v2, v4

    add-float/2addr v0, v2

    invoke-interface {p1}, LI61;->getLayoutDirection()Lpm2;

    move-result-object v2

    sget-object v5, LPz3$f$a;->$EnumSwitchMapping$0:[I

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v2, v5, v2

    const/4 v6, 0x1

    if-ne v2, v6, :cond_0

    invoke-interface {p1}, LI61;->h()J

    move-result-wide v7

    invoke-static {v7, v8}, LxB5;->i(J)F

    move-result v2

    sub-float/2addr v2, v0

    goto :goto_0

    :cond_0
    invoke-static {v3, v1}, Lkotlin/ranges/RangesKt;->coerceAtLeast(FF)F

    move-result v2

    :goto_0
    move v8, v2

    invoke-interface {p1}, LI61;->getLayoutDirection()Lpm2;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v2, v5, v2

    if-ne v2, v6, :cond_1

    invoke-interface {p1}, LI61;->h()J

    move-result-wide v5

    invoke-static {v5, v6}, LxB5;->i(J)F

    move-result v0

    invoke-static {v3, v1}, Lkotlin/ranges/RangesKt;->coerceAtLeast(FF)F

    move-result v1

    sub-float/2addr v0, v1

    :cond_1
    move v10, v0

    iget-wide v0, p0, LPz3$f;->g:J

    invoke-static {v0, v1}, LxB5;->g(J)F

    move-result v0

    neg-float v1, v0

    div-float v9, v1, v4

    div-float v11, v0, v4

    sget-object v0, LRk0;->a:LRk0$a;

    invoke-virtual {v0}, LRk0$a;->a()I

    move-result v12

    invoke-interface {p1}, LI61;->d0()LC61;

    move-result-object v0

    invoke-interface {v0}, LC61;->h()J

    move-result-wide v1

    invoke-interface {v0}, LC61;->a()Lme0;

    move-result-object v3

    invoke-interface {v3}, Lme0;->v()V

    invoke-interface {v0}, LC61;->c()LL61;

    move-result-object v7

    invoke-interface/range {v7 .. v12}, LL61;->a(FFFFI)V

    invoke-interface {p1}, LiA0;->n0()V

    invoke-interface {v0}, LC61;->a()Lme0;

    move-result-object p1

    invoke-interface {p1}, Lme0;->p()V

    invoke-interface {v0, v1, v2}, LC61;->b(J)V

    goto :goto_1

    :cond_2
    invoke-interface {p1}, LiA0;->n0()V

    :goto_1
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LiA0;

    invoke-virtual {p0, p1}, LPz3$f;->a(LiA0;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
