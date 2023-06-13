.class public final LUn2$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LUn2;->a(LRn2;LgV2;Lao2;Lkotlin/jvm/functions/Function2;LEt0;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function3<",
        "LEi5;",
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

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nLazyLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayout.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutKt$LazyLayout$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,122:1\n25#2:123\n25#2:130\n50#2:137\n49#2:138\n1114#3,6:124\n1114#3,6:131\n1114#3,6:139\n*S KotlinDebug\n*F\n+ 1 LazyLayout.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutKt$LazyLayout$1\n*L\n51#1:123\n54#1:130\n68#1:137\n68#1:138\n51#1:124,6\n54#1:131,6\n68#1:139,6\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Lao2;

.field public final synthetic h:LgV2;

.field public final synthetic i:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "LVn2;",
            "Lkz0;",
            "LyO2;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic j:I

.field public final synthetic k:LsP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LsP5<",
            "LRn2;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lao2;LgV2;Lkotlin/jvm/functions/Function2;ILsP5;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lao2;",
            "LgV2;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "LVn2;",
            "-",
            "Lkz0;",
            "+",
            "LyO2;",
            ">;I",
            "LsP5<",
            "+",
            "LRn2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, LUn2$a;->g:Lao2;

    iput-object p2, p0, LUn2$a;->h:LgV2;

    iput-object p3, p0, LUn2$a;->i:Lkotlin/jvm/functions/Function2;

    iput p4, p0, LUn2$a;->j:I

    iput-object p5, p0, LUn2$a;->k:LsP5;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LEi5;LEt0;I)V
    .locals 9

    const-string v0, "saveableStateHolder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.foundation.lazy.layout.LazyLayout.<anonymous> (LazyLayout.kt:49)"

    const v2, 0x500aafab

    invoke-static {v2, p3, v0, v1}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    iget-object p3, p0, LUn2$a;->k:LsP5;

    const v0, -0x1d58f75c

    invoke-interface {p2, v0}, LEt0;->F(I)V

    invoke-interface {p2}, LEt0;->G()Ljava/lang/Object;

    move-result-object v1

    sget-object v2, LEt0;->a:LEt0$a;

    invoke-virtual {v2}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v1, v3, :cond_1

    new-instance v1, LQn2;

    new-instance v3, LUn2$a$b;

    invoke-direct {v3, p3}, LUn2$a$b;-><init>(LsP5;)V

    invoke-direct {v1, p1, v3}, LQn2;-><init>(LEi5;Lkotlin/jvm/functions/Function0;)V

    invoke-interface {p2, v1}, LEt0;->z(Ljava/lang/Object;)V

    :cond_1
    invoke-interface {p2}, LEt0;->Q()V

    check-cast v1, LQn2;

    invoke-interface {p2, v0}, LEt0;->F(I)V

    invoke-interface {p2}, LEt0;->G()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v2}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object p3

    if-ne p1, p3, :cond_2

    new-instance p1, LZS5;

    new-instance p3, LTn2;

    invoke-direct {p3, v1}, LTn2;-><init>(LQn2;)V

    invoke-direct {p1, p3}, LZS5;-><init>(LbT5;)V

    invoke-interface {p2, p1}, LEt0;->z(Ljava/lang/Object;)V

    :cond_2
    invoke-interface {p2}, LEt0;->Q()V

    move-object v3, p1

    check-cast v3, LZS5;

    iget-object p1, p0, LUn2$a;->g:Lao2;

    const p3, -0x5ad37920

    invoke-interface {p2, p3}, LEt0;->F(I)V

    if-nez p1, :cond_3

    goto :goto_0

    :cond_3
    iget-object p1, p0, LUn2$a;->g:Lao2;

    iget p3, p0, LUn2$a;->j:I

    shr-int/lit8 p3, p3, 0x6

    and-int/lit8 p3, p3, 0xe

    or-int/lit8 p3, p3, 0x40

    sget v0, LZS5;->f:I

    shl-int/lit8 v0, v0, 0x6

    or-int/2addr p3, v0

    invoke-static {p1, v1, v3, p2, p3}, Lco2;->a(Lao2;LQn2;LZS5;LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :goto_0
    invoke-interface {p2}, LEt0;->Q()V

    iget-object v4, p0, LUn2$a;->h:LgV2;

    iget-object p1, p0, LUn2$a;->i:Lkotlin/jvm/functions/Function2;

    const p3, 0x1e7b2b64

    invoke-interface {p2, p3}, LEt0;->F(I)V

    invoke-interface {p2, v1}, LEt0;->n(Ljava/lang/Object;)Z

    move-result p3

    invoke-interface {p2, p1}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v0

    or-int/2addr p3, v0

    invoke-interface {p2}, LEt0;->G()Ljava/lang/Object;

    move-result-object v0

    if-nez p3, :cond_4

    invoke-virtual {v2}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object p3

    if-ne v0, p3, :cond_5

    :cond_4
    new-instance v0, LUn2$a$a;

    invoke-direct {v0, v1, p1}, LUn2$a$a;-><init>(LQn2;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {p2, v0}, LEt0;->z(Ljava/lang/Object;)V

    :cond_5
    invoke-interface {p2}, LEt0;->Q()V

    move-object v5, v0

    check-cast v5, Lkotlin/jvm/functions/Function2;

    sget p1, LZS5;->f:I

    iget p3, p0, LUn2$a;->j:I

    and-int/lit8 p3, p3, 0x70

    or-int v7, p1, p3

    const/4 v8, 0x0

    move-object v6, p2

    invoke-static/range {v3 .. v8}, LYS5;->b(LZS5;LgV2;Lkotlin/jvm/functions/Function2;LEt0;II)V

    invoke-static {}, LQt0;->O()Z

    move-result p1

    if-eqz p1, :cond_6

    invoke-static {}, LQt0;->Y()V

    :cond_6
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LEi5;

    check-cast p2, LEt0;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LUn2$a;->a(LEi5;LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
