.class public final LB16$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LB16;->a(LgV2;LG26;)LgV2;
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
        "b",
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
        "SMAP\nTextFieldSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldSize.kt\nandroidx/compose/foundation/text/TextFieldSizeKt$textFieldMinSize$1\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,116:1\n76#2:117\n76#2:118\n76#2:119\n50#3:120\n49#3:121\n50#3:128\n49#3:129\n25#3:136\n1114#4,6:122\n1114#4,6:130\n1114#4,6:137\n76#5:143\n*S KotlinDebug\n*F\n+ 1 TextFieldSize.kt\nandroidx/compose/foundation/text/TextFieldSizeKt$textFieldMinSize$1\n*L\n40#1:117\n41#1:118\n42#1:119\n44#1:120\n44#1:121\n47#1:128\n47#1:129\n56#1:136\n44#1:122,6\n47#1:130,6\n56#1:137,6\n47#1:143\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LG26;


# direct methods
.method public constructor <init>(LG26;)V
    .locals 0

    iput-object p1, p0, LB16$a;->g:LG26;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static final synthetic a(LsP5;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0}, LB16$a;->c(LsP5;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final c(LsP5;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LsP5<",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-interface {p0}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final b(LgV2;LEt0;I)LgV2;
    .locals 10

    const-string v0, "$this$composed"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const p1, 0x5e56a525

    invoke-interface {p2, p1}, LEt0;->F(I)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.foundation.text.textFieldMinSize.<anonymous> (TextFieldSize.kt:38)"

    invoke-static {p1, p3, v0, v1}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    invoke-static {}, Lhu0;->g()LU94;

    move-result-object p1

    invoke-interface {p2, p1}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lg01;

    invoke-static {}, Lhu0;->i()LU94;

    move-result-object p3

    invoke-interface {p2, p3}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lkw1$b;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v0

    invoke-interface {p2, v0}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lpm2;

    iget-object v0, p0, LB16$a;->g:LG26;

    const v1, 0x1e7b2b64

    invoke-interface {p2, v1}, LEt0;->F(I)V

    invoke-interface {p2, v0}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v2

    invoke-interface {p2, v6}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    invoke-interface {p2}, LEt0;->G()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_1

    sget-object v2, LEt0;->a:LEt0$a;

    invoke-virtual {v2}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v3, v2, :cond_2

    :cond_1
    invoke-static {v0, v6}, LH26;->d(LG26;Lpm2;)LG26;

    move-result-object v3

    invoke-interface {p2, v3}, LEt0;->z(Ljava/lang/Object;)V

    :cond_2
    invoke-interface {p2}, LEt0;->Q()V

    move-object v7, v3

    check-cast v7, LG26;

    invoke-interface {p2, v1}, LEt0;->F(I)V

    invoke-interface {p2, p3}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v0

    invoke-interface {p2, v7}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr v0, v1

    invoke-interface {p2}, LEt0;->G()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_3

    sget-object v0, LEt0;->a:LEt0$a;

    invoke-virtual {v0}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v1, v0, :cond_7

    :cond_3
    invoke-virtual {v7}, LG26;->l()Lkw1;

    move-result-object v0

    invoke-virtual {v7}, LG26;->q()LJw1;

    move-result-object v1

    if-nez v1, :cond_4

    sget-object v1, LJw1;->c:LJw1$a;

    invoke-virtual {v1}, LJw1$a;->d()LJw1;

    move-result-object v1

    :cond_4
    invoke-virtual {v7}, LG26;->o()LEw1;

    move-result-object v2

    if-eqz v2, :cond_5

    invoke-virtual {v2}, LEw1;->i()I

    move-result v2

    goto :goto_0

    :cond_5
    sget-object v2, LEw1;->b:LEw1$a;

    invoke-virtual {v2}, LEw1$a;->b()I

    move-result v2

    :goto_0
    invoke-virtual {v7}, LG26;->p()LFw1;

    move-result-object v3

    if-eqz v3, :cond_6

    invoke-virtual {v3}, LFw1;->m()I

    move-result v3

    goto :goto_1

    :cond_6
    sget-object v3, LFw1;->b:LFw1$a;

    invoke-virtual {v3}, LFw1$a;->a()I

    move-result v3

    :goto_1
    invoke-interface {p3, v0, v1, v2, v3}, Lkw1$b;->a(Lkw1;LJw1;II)LsP5;

    move-result-object v1

    invoke-interface {p2, v1}, LEt0;->z(Ljava/lang/Object;)V

    :cond_7
    invoke-interface {p2}, LEt0;->Q()V

    move-object v8, v1

    check-cast v8, LsP5;

    iget-object v4, p0, LB16$a;->g:LG26;

    const v0, -0x1d58f75c

    invoke-interface {p2, v0}, LEt0;->F(I)V

    invoke-interface {p2}, LEt0;->G()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, LEt0;->a:LEt0$a;

    invoke-virtual {v1}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_8

    new-instance v9, LA16;

    invoke-static {v8}, LB16$a;->a(LsP5;)Ljava/lang/Object;

    move-result-object v5

    move-object v0, v9

    move-object v1, v6

    move-object v2, p1

    move-object v3, p3

    invoke-direct/range {v0 .. v5}, LA16;-><init>(Lpm2;Lg01;Lkw1$b;LG26;Ljava/lang/Object;)V

    invoke-interface {p2, v9}, LEt0;->z(Ljava/lang/Object;)V

    :cond_8
    invoke-interface {p2}, LEt0;->Q()V

    move-object v9, v0

    check-cast v9, LA16;

    invoke-static {v8}, LB16$a;->c(LsP5;)Ljava/lang/Object;

    move-result-object v5

    move-object v0, v9

    move-object v1, v6

    move-object v2, p1

    move-object v3, p3

    move-object v4, v7

    invoke-virtual/range {v0 .. v5}, LA16;->c(Lpm2;Lg01;Lkw1$b;LG26;Ljava/lang/Object;)V

    sget-object p1, LgV2;->b0:LgV2$a;

    new-instance p3, LB16$a$a;

    invoke-direct {p3, v9}, LB16$a$a;-><init>(LA16;)V

    invoke-static {p1, p3}, Landroidx/compose/ui/layout/b;->a(LgV2;Lkotlin/jvm/functions/Function3;)LgV2;

    move-result-object p1

    invoke-static {}, LQt0;->O()Z

    move-result p3

    if-eqz p3, :cond_9

    invoke-static {}, LQt0;->Y()V

    :cond_9
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

    invoke-virtual {p0, p1, p2, p3}, LB16$a;->b(LgV2;LEt0;I)LgV2;

    move-result-object p1

    return-object p1
.end method
