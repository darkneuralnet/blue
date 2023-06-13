.class public final LGr5$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LGr5;->b(LgV2;ZZLCb5;Lkotlin/jvm/functions/Function0;)LgV2;
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
        "SMAP\nSelectable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Selectable.kt\nandroidx/compose/foundation/selection/SelectableKt$selectable$2\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,134:1\n25#2:135\n1114#3,6:136\n76#4:142\n*S KotlinDebug\n*F\n+ 1 Selectable.kt\nandroidx/compose/foundation/selection/SelectableKt$selectable$2\n*L\n73#1:135\n73#1:136,6\n74#1:142\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Z

.field public final synthetic h:Z

.field public final synthetic i:LCb5;

.field public final synthetic j:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(ZZLCb5;Lkotlin/jvm/functions/Function0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZ",
            "LCb5;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    iput-boolean p1, p0, LGr5$a;->g:Z

    iput-boolean p2, p0, LGr5$a;->h:Z

    iput-object p3, p0, LGr5$a;->i:LCb5;

    iput-object p4, p0, LGr5$a;->j:Lkotlin/jvm/functions/Function0;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LgV2;LEt0;I)LgV2;
    .locals 9

    const-string v0, "$this$composed"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const p1, -0x7ea2f888

    invoke-interface {p2, p1}, LEt0;->F(I)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.foundation.selection.selectable.<anonymous> (Selectable.kt:67)"

    invoke-static {p1, p3, v0, v1}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    sget-object v2, LgV2;->b0:LgV2$a;

    const p1, -0x1d58f75c

    invoke-interface {p2, p1}, LEt0;->F(I)V

    invoke-interface {p2}, LEt0;->G()Ljava/lang/Object;

    move-result-object p1

    sget-object p3, LEt0;->a:LEt0$a;

    invoke-virtual {p3}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object p3

    if-ne p1, p3, :cond_1

    invoke-static {}, Lf62;->a()LrX2;

    move-result-object p1

    invoke-interface {p2, p1}, LEt0;->z(Ljava/lang/Object;)V

    :cond_1
    invoke-interface {p2}, LEt0;->Q()V

    move-object v4, p1

    check-cast v4, LrX2;

    invoke-static {}, LA12;->a()LU94;

    move-result-object p1

    invoke-interface {p2, p1}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object p1

    move-object v5, p1

    check-cast v5, Ly12;

    iget-boolean v3, p0, LGr5$a;->g:Z

    iget-boolean v6, p0, LGr5$a;->h:Z

    iget-object v7, p0, LGr5$a;->i:LCb5;

    iget-object v8, p0, LGr5$a;->j:Lkotlin/jvm/functions/Function0;

    invoke-static/range {v2 .. v8}, LGr5;->a(LgV2;ZLrX2;Ly12;ZLCb5;Lkotlin/jvm/functions/Function0;)LgV2;

    move-result-object p1

    invoke-static {}, LQt0;->O()Z

    move-result p3

    if-eqz p3, :cond_2

    invoke-static {}, LQt0;->Y()V

    :cond_2
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

    invoke-virtual {p0, p1, p2, p3}, LGr5$a;->a(LgV2;LEt0;I)LgV2;

    move-result-object p1

    return-object p1
.end method
