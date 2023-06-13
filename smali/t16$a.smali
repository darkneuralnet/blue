.class public final Lt16$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lt16;->a(LgV2;LrX2;ZLkotlin/jvm/functions/Function1;)LgV2;
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
        "SMAP\nTextFieldPressGestureFilter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldPressGestureFilter.kt\nandroidx/compose/foundation/text/TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,86:1\n474#2,4:87\n478#2,2:95\n482#2:101\n25#3:91\n25#3:102\n50#3:109\n49#3:110\n1114#4,3:92\n1117#4,3:98\n1114#4,6:103\n1114#4,6:111\n474#5:97\n*S KotlinDebug\n*F\n+ 1 TextFieldPressGestureFilter.kt\nandroidx/compose/foundation/text/TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1\n*L\n42#1:87,4\n42#1:95,2\n42#1:101\n42#1:91\n43#1:102\n45#1:109\n45#1:110\n42#1:92,3\n42#1:98,3\n43#1:103,6\n45#1:111,6\n42#1:97\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "LCe3;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic h:LrX2;


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;LrX2;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "LCe3;",
            "Lkotlin/Unit;",
            ">;",
            "LrX2;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lt16$a;->g:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lt16$a;->h:LrX2;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LgV2;LEt0;I)LgV2;
    .locals 7

    const-string v0, "$this$composed"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const p1, -0x620472b

    invoke-interface {p2, p1}, LEt0;->F(I)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.foundation.text.tapPressTextFieldModifier.<anonymous> (TextFieldPressGestureFilter.kt:40)"

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

    move-result-object v2

    invoke-interface {p2}, LEt0;->Q()V

    invoke-interface {p2, p1}, LEt0;->F(I)V

    invoke-interface {p2}, LEt0;->G()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object p3

    if-ne p1, p3, :cond_2

    const/4 p1, 0x2

    const/4 p3, 0x0

    invoke-static {p3, p3, p1, p3}, LGM5;->h(Ljava/lang/Object;LEM5;ILjava/lang/Object;)LEX2;

    move-result-object p1

    invoke-interface {p2, p1}, LEt0;->z(Ljava/lang/Object;)V

    :cond_2
    invoke-interface {p2}, LEt0;->Q()V

    move-object v3, p1

    check-cast v3, LEX2;

    iget-object p1, p0, Lt16$a;->g:Lkotlin/jvm/functions/Function1;

    const/4 p3, 0x0

    invoke-static {p1, p2, p3}, LGM5;->n(Ljava/lang/Object;LEt0;I)LsP5;

    move-result-object v5

    iget-object p1, p0, Lt16$a;->h:LrX2;

    const v1, 0x1e7b2b64

    invoke-interface {p2, v1}, LEt0;->F(I)V

    invoke-interface {p2, v3}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v1

    invoke-interface {p2, p1}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v1, v4

    invoke-interface {p2}, LEt0;->G()Ljava/lang/Object;

    move-result-object v4

    if-nez v1, :cond_3

    invoke-virtual {v0}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v4, v0, :cond_4

    :cond_3
    new-instance v4, Lt16$a$a;

    invoke-direct {v4, v3, p1}, Lt16$a$a;-><init>(LEX2;LrX2;)V

    invoke-interface {p2, v4}, LEt0;->z(Ljava/lang/Object;)V

    :cond_4
    invoke-interface {p2}, LEt0;->Q()V

    check-cast v4, Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v4, p2, p3}, LY91;->c(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;LEt0;I)V

    sget-object p1, LgV2;->b0:LgV2$a;

    iget-object p3, p0, Lt16$a;->h:LrX2;

    new-instance v0, Lt16$a$b;

    const/4 v6, 0x0

    move-object v1, v0

    move-object v4, p3

    invoke-direct/range {v1 .. v6}, Lt16$a$b;-><init>(LZC0;LEX2;LrX2;LsP5;Lkotlin/coroutines/Continuation;)V

    invoke-static {p1, p3, v0}, LzW5;->c(LgV2;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)LgV2;

    move-result-object p1

    invoke-static {}, LQt0;->O()Z

    move-result p3

    if-eqz p3, :cond_5

    invoke-static {}, LQt0;->Y()V

    :cond_5
    invoke-interface {p2}, LEt0;->Q()V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LgV2;

    check-cast p2, LEt0;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lt16$a;->a(LgV2;LEt0;I)LgV2;

    move-result-object p1

    return-object p1
.end method
