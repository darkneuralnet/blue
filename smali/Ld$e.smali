.class public final LLd$e;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LLd;->f(LgV2;ZLUL4;Z)LgV2;
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
        "SMAP\nAndroidSelectionHandles.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidSelectionHandles.android.kt\nandroidx/compose/foundation/text/selection/AndroidSelectionHandles_androidKt$drawSelectionHandle$1\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,331:1\n76#2:332\n83#3,3:333\n1114#4,6:336\n*S KotlinDebug\n*F\n+ 1 AndroidSelectionHandles.android.kt\nandroidx/compose/foundation/text/selection/AndroidSelectionHandles_androidKt$drawSelectionHandle$1\n*L\n114#1:332\n116#1:333,3\n116#1:336,6\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Z

.field public final synthetic h:LUL4;

.field public final synthetic i:Z


# direct methods
.method public constructor <init>(ZLUL4;Z)V
    .locals 0

    iput-boolean p1, p0, LLd$e;->g:Z

    iput-object p2, p0, LLd$e;->h:LUL4;

    iput-boolean p3, p0, LLd$e;->i:Z

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LgV2;LEt0;I)LgV2;
    .locals 10

    const-string v0, "$this$composed"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x5bb680c8

    invoke-interface {p2, v0}, LEt0;->F(I)V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "androidx.compose.foundation.text.selection.drawSelectionHandle.<anonymous> (AndroidSelectionHandles.android.kt:112)"

    invoke-static {v0, p3, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    invoke-static {}, LC26;->b()LU94;

    move-result-object p3

    invoke-interface {p2, p3}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, LB26;

    invoke-virtual {p3}, LB26;->b()J

    move-result-wide v1

    sget-object p3, LgV2;->b0:LgV2$a;

    const/4 v0, 0x4

    new-array v3, v0, [Ljava/lang/Object;

    invoke-static {v1, v2}, Lpm0;->i(J)Lpm0;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    iget-boolean v4, p0, LLd$e;->g:Z

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    const/4 v6, 0x1

    aput-object v4, v3, v6

    const/4 v4, 0x2

    iget-object v6, p0, LLd$e;->h:LUL4;

    aput-object v6, v3, v4

    iget-boolean v4, p0, LLd$e;->i:Z

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    const/4 v6, 0x3

    aput-object v4, v3, v6

    iget-boolean v4, p0, LLd$e;->g:Z

    iget-object v6, p0, LLd$e;->h:LUL4;

    iget-boolean v7, p0, LLd$e;->i:Z

    const v8, -0x21de6e89

    invoke-interface {p2, v8}, LEt0;->F(I)V

    move v8, v5

    :goto_0
    if-ge v5, v0, :cond_1

    aget-object v9, v3, v5

    invoke-interface {p2, v9}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v8, v9

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_1
    invoke-interface {p2}, LEt0;->G()Ljava/lang/Object;

    move-result-object v0

    if-nez v8, :cond_2

    sget-object v3, LEt0;->a:LEt0$a;

    invoke-virtual {v3}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v0, v3, :cond_3

    :cond_2
    new-instance v8, LLd$e$a;

    move-object v0, v8

    move v3, v4

    move-object v4, v6

    move v5, v7

    invoke-direct/range {v0 .. v5}, LLd$e$a;-><init>(JZLUL4;Z)V

    invoke-interface {p2, v8}, LEt0;->z(Ljava/lang/Object;)V

    :cond_3
    invoke-interface {p2}, LEt0;->Q()V

    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-static {p3, v0}, Landroidx/compose/ui/draw/a;->b(LgV2;Lkotlin/jvm/functions/Function1;)LgV2;

    move-result-object p3

    invoke-interface {p1, p3}, LgV2;->t0(LgV2;)LgV2;

    move-result-object p1

    invoke-static {}, LQt0;->O()Z

    move-result p3

    if-eqz p3, :cond_4

    invoke-static {}, LQt0;->Y()V

    :cond_4
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

    invoke-virtual {p0, p1, p2, p3}, LLd$e;->a(LgV2;LEt0;I)LgV2;

    move-result-object p1

    return-object p1
.end method
