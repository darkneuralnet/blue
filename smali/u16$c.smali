.class public final Lu16$c;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu16;->d(LgV2;Lv16;LrX2;Z)LgV2;
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
        "SMAP\nTextFieldScroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldScroll.kt\nandroidx/compose/foundation/text/TextFieldScrollKt$textFieldScrollable$2\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,369:1\n76#2:370\n36#3:371\n50#3:378\n49#3:379\n1114#4,6:372\n1114#4,6:380\n*S KotlinDebug\n*F\n+ 1 TextFieldScroll.kt\nandroidx/compose/foundation/text/TextFieldScrollKt$textFieldScrollable$2\n*L\n68#1:370\n70#1:371\n83#1:378\n83#1:379\n70#1:372,6\n83#1:380,6\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Lv16;

.field public final synthetic h:Z

.field public final synthetic i:LrX2;


# direct methods
.method public constructor <init>(Lv16;ZLrX2;)V
    .locals 0

    iput-object p1, p0, Lu16$c;->g:Lv16;

    iput-boolean p2, p0, Lu16$c;->h:Z

    iput-object p3, p0, Lu16$c;->i:LrX2;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LgV2;LEt0;I)LgV2;
    .locals 12

    const-string v0, "$this$composed"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const p1, 0x3001dc2a

    invoke-interface {p2, p1}, LEt0;->F(I)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.foundation.text.textFieldScrollable.<anonymous> (TextFieldScroll.kt:65)"

    invoke-static {p1, p3, v0, v1}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    invoke-static {}, Lhu0;->l()LU94;

    move-result-object p1

    invoke-interface {p2, p1}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object p1

    sget-object p3, Lpm2;->c:Lpm2;

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-ne p1, p3, :cond_1

    move p1, v0

    goto :goto_0

    :cond_1
    move p1, v1

    :goto_0
    iget-object p3, p0, Lu16$c;->g:Lv16;

    invoke-virtual {p3}, Lv16;->f()LEy3;

    move-result-object p3

    sget-object v2, LEy3;->b:LEy3;

    if-eq p3, v2, :cond_3

    if-nez p1, :cond_2

    goto :goto_1

    :cond_2
    move v7, v1

    goto :goto_2

    :cond_3
    :goto_1
    move v7, v0

    :goto_2
    iget-object p1, p0, Lu16$c;->g:Lv16;

    const p3, 0x44faf204

    invoke-interface {p2, p3}, LEt0;->F(I)V

    invoke-interface {p2, p1}, LEt0;->n(Ljava/lang/Object;)Z

    move-result p3

    invoke-interface {p2}, LEt0;->G()Ljava/lang/Object;

    move-result-object v2

    if-nez p3, :cond_4

    sget-object p3, LEt0;->a:LEt0$a;

    invoke-virtual {p3}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object p3

    if-ne v2, p3, :cond_5

    :cond_4
    new-instance v2, Lu16$c$a;

    invoke-direct {v2, p1}, Lu16$c$a;-><init>(Lv16;)V

    invoke-interface {p2, v2}, LEt0;->z(Ljava/lang/Object;)V

    :cond_5
    invoke-interface {p2}, LEt0;->Q()V

    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v2, p2, v1}, Lbq5;->b(Lkotlin/jvm/functions/Function1;LEt0;I)Laq5;

    move-result-object p1

    iget-object p3, p0, Lu16$c;->g:Lv16;

    const v2, 0x1e7b2b64

    invoke-interface {p2, v2}, LEt0;->F(I)V

    invoke-interface {p2, p1}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v2

    invoke-interface {p2, p3}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    invoke-interface {p2}, LEt0;->G()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_6

    sget-object v2, LEt0;->a:LEt0$a;

    invoke-virtual {v2}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v3, v2, :cond_7

    :cond_6
    new-instance v3, Lu16$c$b;

    invoke-direct {v3, p1, p3}, Lu16$c$b;-><init>(Laq5;Lv16;)V

    invoke-interface {p2, v3}, LEt0;->z(Ljava/lang/Object;)V

    :cond_7
    invoke-interface {p2}, LEt0;->Q()V

    move-object v4, v3

    check-cast v4, Lu16$c$b;

    sget-object v3, LgV2;->b0:LgV2$a;

    iget-object p1, p0, Lu16$c;->g:Lv16;

    invoke-virtual {p1}, Lv16;->f()LEy3;

    move-result-object v5

    iget-boolean p1, p0, Lu16$c;->h:Z

    if-eqz p1, :cond_9

    iget-object p1, p0, Lu16$c;->g:Lv16;

    invoke-virtual {p1}, Lv16;->c()F

    move-result p1

    const/4 p3, 0x0

    cmpg-float p1, p1, p3

    if-nez p1, :cond_8

    move p1, v0

    goto :goto_3

    :cond_8
    move p1, v1

    :goto_3
    if-nez p1, :cond_9

    move v6, v0

    goto :goto_4

    :cond_9
    move v6, v1

    :goto_4
    const/4 v8, 0x0

    iget-object v9, p0, Lu16$c;->i:LrX2;

    const/16 v10, 0x10

    const/4 v11, 0x0

    invoke-static/range {v3 .. v11}, LZp5;->l(LgV2;Laq5;LEy3;ZZLcu1;LrX2;ILjava/lang/Object;)LgV2;

    move-result-object p1

    invoke-static {}, LQt0;->O()Z

    move-result p3

    if-eqz p3, :cond_a

    invoke-static {}, LQt0;->Y()V

    :cond_a
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

    invoke-virtual {p0, p1, p2, p3}, Lu16$c;->a(LgV2;LEt0;I)LgV2;

    move-result-object p1

    return-object p1
.end method
