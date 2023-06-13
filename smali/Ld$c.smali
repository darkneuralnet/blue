.class public final LLd$c;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LLd;->c(JZLUL4;ZLgV2;Lkotlin/jvm/functions/Function2;LEt0;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function2<",
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
        "SMAP\nAndroidSelectionHandles.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidSelectionHandles.android.kt\nandroidx/compose/foundation/text/selection/AndroidSelectionHandles_androidKt$SelectionHandle$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,331:1\n50#2:332\n49#2:333\n1114#3,6:334\n*S KotlinDebug\n*F\n+ 1 AndroidSelectionHandles.android.kt\nandroidx/compose/foundation/text/selection/AndroidSelectionHandles_androidKt$SelectionHandle$1\n*L\n74#1:332\n74#1:333\n74#1:334,6\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "LEt0;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic h:LgV2;

.field public final synthetic i:Z

.field public final synthetic j:J

.field public final synthetic k:I

.field public final synthetic l:LUL4;

.field public final synthetic m:Z


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function2;LgV2;ZJILUL4;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "LEt0;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "LgV2;",
            "ZJI",
            "LUL4;",
            "Z)V"
        }
    .end annotation

    iput-object p1, p0, LLd$c;->g:Lkotlin/jvm/functions/Function2;

    iput-object p2, p0, LLd$c;->h:LgV2;

    iput-boolean p3, p0, LLd$c;->i:Z

    iput-wide p4, p0, LLd$c;->j:J

    iput p6, p0, LLd$c;->k:I

    iput-object p7, p0, LLd$c;->l:LUL4;

    iput-boolean p8, p0, LLd$c;->m:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LEt0;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LLd$c;->invoke(LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LEt0;I)V
    .locals 10

    and-int/lit8 v0, p2, 0xb

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    invoke-interface {p1}, LEt0;->b()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, LEt0;->k()V

    goto/16 :goto_2

    :cond_1
    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v1, "androidx.compose.foundation.text.selection.SelectionHandle.<anonymous> (AndroidSelectionHandles.android.kt:69)"

    const v2, 0x2ba2f39d

    invoke-static {v2, p2, v0, v1}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    iget-object p2, p0, LLd$c;->g:Lkotlin/jvm/functions/Function2;

    if-nez p2, :cond_5

    const p2, 0x1708aa0e

    invoke-interface {p1, p2}, LEt0;->F(I)V

    iget-object p2, p0, LLd$c;->h:LgV2;

    iget-boolean v0, p0, LLd$c;->i:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iget-wide v1, p0, LLd$c;->j:J

    invoke-static {v1, v2}, LCe3;->d(J)LCe3;

    move-result-object v1

    iget-boolean v2, p0, LLd$c;->i:Z

    iget-wide v3, p0, LLd$c;->j:J

    const v5, 0x1e7b2b64

    invoke-interface {p1, v5}, LEt0;->F(I)V

    invoke-interface {p1, v0}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v0

    invoke-interface {p1, v1}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr v0, v1

    invoke-interface {p1}, LEt0;->G()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_3

    sget-object v0, LEt0;->a:LEt0$a;

    invoke-virtual {v0}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v1, v0, :cond_4

    :cond_3
    new-instance v1, LLd$c$a;

    invoke-direct {v1, v2, v3, v4}, LLd$c$a;-><init>(ZJ)V

    invoke-interface {p1, v1}, LEt0;->z(Ljava/lang/Object;)V

    :cond_4
    invoke-interface {p1}, LEt0;->Q()V

    check-cast v1, Lkotlin/jvm/functions/Function1;

    const/4 v0, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {p2, v3, v1, v0, v2}, Lfs5;->b(LgV2;ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)LgV2;

    move-result-object v4

    iget-boolean v5, p0, LLd$c;->i:Z

    iget-object v6, p0, LLd$c;->l:LUL4;

    iget-boolean v7, p0, LLd$c;->m:Z

    iget p2, p0, LLd$c;->k:I

    and-int/lit8 v0, p2, 0x70

    and-int/lit16 v1, p2, 0x380

    or-int/2addr v0, v1

    and-int/lit16 p2, p2, 0x1c00

    or-int v9, v0, p2

    move-object v8, p1

    invoke-static/range {v4 .. v9}, LLd;->a(LgV2;ZLUL4;ZLEt0;I)V

    invoke-interface {p1}, LEt0;->Q()V

    goto :goto_1

    :cond_5
    const p2, 0x1708acb1

    invoke-interface {p1, p2}, LEt0;->F(I)V

    iget-object p2, p0, LLd$c;->g:Lkotlin/jvm/functions/Function2;

    iget v0, p0, LLd$c;->k:I

    shr-int/lit8 v0, v0, 0xf

    and-int/lit8 v0, v0, 0xe

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p2, p1, v0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p1}, LEt0;->Q()V

    :goto_1
    invoke-static {}, LQt0;->O()Z

    move-result p1

    if-eqz p1, :cond_6

    invoke-static {}, LQt0;->Y()V

    :cond_6
    :goto_2
    return-void
.end method
