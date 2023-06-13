.class public final Lf16$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf16;->b(LgV2;LC16;LF16;LHe3;La30;Z)LgV2;
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
        "SMAP\nTextFieldCursor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldCursor.kt\nandroidx/compose/foundation/text/TextFieldCursorKt$cursor$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,100:1\n25#2:101\n1114#3,6:102\n652#4:108\n*S KotlinDebug\n*F\n+ 1 TextFieldCursor.kt\nandroidx/compose/foundation/text/TextFieldCursorKt$cursor$1\n*L\n47#1:101\n47#1:102,6\n48#1:108\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:La30;

.field public final synthetic h:LC16;

.field public final synthetic i:LF16;

.field public final synthetic j:LHe3;


# direct methods
.method public constructor <init>(La30;LC16;LF16;LHe3;)V
    .locals 0

    iput-object p1, p0, Lf16$a;->g:La30;

    iput-object p2, p0, Lf16$a;->h:LC16;

    iput-object p3, p0, Lf16$a;->i:LF16;

    iput-object p4, p0, Lf16$a;->j:LHe3;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LgV2;LEt0;I)LgV2;
    .locals 8

    const-string v0, "$this$composed"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x6169e59c

    invoke-interface {p2, v0}, LEt0;->F(I)V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "androidx.compose.foundation.text.cursor.<anonymous> (TextFieldCursor.kt:45)"

    invoke-static {v0, p3, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    const p3, -0x1d58f75c

    invoke-interface {p2, p3}, LEt0;->F(I)V

    invoke-interface {p2}, LEt0;->G()Ljava/lang/Object;

    move-result-object p3

    sget-object v0, LEt0;->a:LEt0$a;

    invoke-virtual {v0}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-ne p3, v0, :cond_1

    const/4 p3, 0x0

    const/4 v0, 0x2

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2, p3, v0, v1}, Lte;->b(FFILjava/lang/Object;)Lne;

    move-result-object p3

    invoke-interface {p2, p3}, LEt0;->z(Ljava/lang/Object;)V

    :cond_1
    invoke-interface {p2}, LEt0;->Q()V

    move-object v3, p3

    check-cast v3, Lne;

    iget-object p3, p0, Lf16$a;->g:La30;

    instance-of v0, p3, LpN5;

    const/4 v2, 0x1

    if-eqz v0, :cond_4

    check-cast p3, LpN5;

    invoke-virtual {p3}, LpN5;->b()J

    move-result-wide v4

    sget-object p3, Lpm0;->b:Lpm0$a;

    invoke-virtual {p3}, Lpm0$a;->g()J

    move-result-wide v6

    cmp-long p3, v4, v6

    const/4 v0, 0x0

    if-nez p3, :cond_2

    move p3, v2

    goto :goto_0

    :cond_2
    move p3, v0

    :goto_0
    if-nez p3, :cond_3

    goto :goto_1

    :cond_3
    move v2, v0

    :cond_4
    :goto_1
    iget-object p3, p0, Lf16$a;->h:LC16;

    invoke-virtual {p3}, LC16;->d()Z

    move-result p3

    if-eqz p3, :cond_5

    iget-object p3, p0, Lf16$a;->i:LF16;

    invoke-virtual {p3}, LF16;->g()J

    move-result-wide v4

    invoke-static {v4, v5}, Ls26;->h(J)Z

    move-result p3

    if-eqz p3, :cond_5

    if-eqz v2, :cond_5

    iget-object p3, p0, Lf16$a;->i:LF16;

    invoke-virtual {p3}, LF16;->e()LDf;

    move-result-object p3

    iget-object v0, p0, Lf16$a;->i:LF16;

    invoke-virtual {v0}, LF16;->g()J

    move-result-wide v4

    invoke-static {v4, v5}, Ls26;->b(J)Ls26;

    move-result-object v0

    new-instance v2, Lf16$a$a;

    invoke-direct {v2, v3, v1}, Lf16$a$a;-><init>(Lne;Lkotlin/coroutines/Continuation;)V

    const/16 v1, 0x200

    invoke-static {p3, v0, v2, p2, v1}, LY91;->e(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;LEt0;I)V

    new-instance p3, Lf16$a$b;

    iget-object v4, p0, Lf16$a;->j:LHe3;

    iget-object v5, p0, Lf16$a;->i:LF16;

    iget-object v6, p0, Lf16$a;->h:LC16;

    iget-object v7, p0, Lf16$a;->g:La30;

    move-object v2, p3

    invoke-direct/range {v2 .. v7}, Lf16$a$b;-><init>(Lne;LHe3;LF16;LC16;La30;)V

    invoke-static {p1, p3}, Landroidx/compose/ui/draw/a;->c(LgV2;Lkotlin/jvm/functions/Function1;)LgV2;

    move-result-object p1

    goto :goto_2

    :cond_5
    sget-object p1, LgV2;->b0:LgV2$a;

    :goto_2
    invoke-static {}, LQt0;->O()Z

    move-result p3

    if-eqz p3, :cond_6

    invoke-static {}, LQt0;->Y()V

    :cond_6
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

    invoke-virtual {p0, p1, p2, p3}, Lf16$a;->a(LgV2;LEt0;I)LgV2;

    move-result-object p1

    return-object p1
.end method
