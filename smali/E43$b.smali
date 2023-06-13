.class public final LE43$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE43;->a(LgV2;LB43;LC43;)LgV2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function3<",
        "LgV2;",
        "LEt0;",
        "Ljava/lang/Integer;",
        "LgV2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "LgV2;",
        "a",
        "(LgV2;LEt0;I)LgV2;"
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
        "SMAP\nNestedScrollModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NestedScrollModifier.kt\nandroidx/compose/ui/input/nestedscroll/NestedScrollModifierKt$nestedScroll$2\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,344:1\n474#2,4:345\n478#2,2:353\n482#2:359\n25#3:349\n25#3:360\n67#3,3:367\n66#3:370\n1114#4,3:350\n1117#4,3:356\n1114#4,6:361\n1114#4,6:371\n474#5:355\n*S KotlinDebug\n*F\n+ 1 NestedScrollModifier.kt\nandroidx/compose/ui/input/nestedscroll/NestedScrollModifierKt$nestedScroll$2\n*L\n337#1:345,4\n337#1:353,2\n337#1:359\n337#1:349\n339#1:360\n340#1:367,3\n340#1:370\n337#1:350,3\n337#1:356,3\n339#1:361,6\n340#1:371,6\n337#1:355\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LC43;

.field public final synthetic h:LB43;


# direct methods
.method public constructor <init>(LC43;LB43;)V
    .locals 0

    iput-object p1, p0, LE43$b;->g:LC43;

    iput-object p2, p0, LE43$b;->h:LB43;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LgV2;LEt0;I)LgV2;
    .locals 4

    const-string v0, "$this$composed"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const p1, 0x187562b7

    invoke-interface {p2, p1}, LEt0;->F(I)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.ui.input.nestedscroll.nestedScroll.<anonymous> (NestedScrollModifier.kt:335)"

    invoke-static {p1, p3, v0, v1}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    const p1, 0x2e20b340

    invoke-interface {p2, p1}, LEt0;->F(I)V

    const p1, -0x1d58f75c

    invoke-interface {p2, p1}, LEt0;->F(I)V

    invoke-interface {p2}, LEt0;->G()Ljava/lang/Object;

    move-result-object p3

    sget-object v0, LEt0;->a:LEt0$a;

    invoke-virtual {v0}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne p3, v1, :cond_1

    sget-object p3, Lkotlin/coroutines/EmptyCoroutineContext;->INSTANCE:Lkotlin/coroutines/EmptyCoroutineContext;

    invoke-static {p3, p2}, LY91;->j(Lkotlin/coroutines/CoroutineContext;LEt0;)LZC0;

    move-result-object p3

    new-instance v1, Liu0;

    invoke-direct {v1, p3}, Liu0;-><init>(LZC0;)V

    invoke-interface {p2, v1}, LEt0;->z(Ljava/lang/Object;)V

    move-object p3, v1

    :cond_1
    invoke-interface {p2}, LEt0;->Q()V

    check-cast p3, Liu0;

    invoke-virtual {p3}, Liu0;->a()LZC0;

    move-result-object p3

    invoke-interface {p2}, LEt0;->Q()V

    iget-object v1, p0, LE43$b;->g:LC43;

    const v2, 0x5fd2434

    invoke-interface {p2, v2}, LEt0;->F(I)V

    if-nez v1, :cond_3

    invoke-interface {p2, p1}, LEt0;->F(I)V

    invoke-interface {p2}, LEt0;->G()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne p1, v1, :cond_2

    new-instance p1, LC43;

    invoke-direct {p1}, LC43;-><init>()V

    invoke-interface {p2, p1}, LEt0;->z(Ljava/lang/Object;)V

    :cond_2
    invoke-interface {p2}, LEt0;->Q()V

    move-object v1, p1

    check-cast v1, LC43;

    :cond_3
    invoke-interface {p2}, LEt0;->Q()V

    iget-object p1, p0, LE43$b;->h:LB43;

    const v2, 0x607fb4c4

    invoke-interface {p2, v2}, LEt0;->F(I)V

    invoke-interface {p2, p1}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v2

    invoke-interface {p2, v1}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    invoke-interface {p2, p3}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    invoke-interface {p2}, LEt0;->G()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_4

    invoke-virtual {v0}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v3, v0, :cond_5

    :cond_4
    invoke-virtual {v1, p3}, LC43;->h(LZC0;)V

    new-instance v3, LF43;

    invoke-direct {v3, v1, p1}, LF43;-><init>(LC43;LB43;)V

    invoke-interface {p2, v3}, LEt0;->z(Ljava/lang/Object;)V

    :cond_5
    invoke-interface {p2}, LEt0;->Q()V

    check-cast v3, LF43;

    invoke-static {}, LQt0;->O()Z

    move-result p1

    if-eqz p1, :cond_6

    invoke-static {}, LQt0;->Y()V

    :cond_6
    invoke-interface {p2}, LEt0;->Q()V

    return-object v3
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LgV2;

    check-cast p2, LEt0;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LE43$b;->a(LgV2;LEt0;I)LgV2;

    move-result-object p1

    return-object p1
.end method
