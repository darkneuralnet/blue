.class public final LfX3$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LfX3;->a(LgV2;LdX3;Z)LgV2;
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
        "SMAP\nPointerIcon.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerIcon.kt\nandroidx/compose/ui/input/pointer/PointerIconKt$pointerHoverIcon$2\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,101:1\n76#2:102\n*S KotlinDebug\n*F\n+ 1 PointerIcon.kt\nandroidx/compose/ui/input/pointer/PointerIconKt$pointerHoverIcon$2\n*L\n80#1:102\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LdX3;

.field public final synthetic h:Z


# direct methods
.method public constructor <init>(LdX3;Z)V
    .locals 0

    iput-object p1, p0, LfX3$b;->g:LdX3;

    iput-boolean p2, p0, LfX3$b;->h:Z

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LgV2;LEt0;I)LgV2;
    .locals 6

    const-string v0, "$this$composed"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x305836b0

    invoke-interface {p2, v0}, LEt0;->F(I)V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "androidx.compose.ui.input.pointer.pointerHoverIcon.<anonymous> (PointerIcon.kt:78)"

    invoke-static {v0, p3, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    invoke-static {}, Lhu0;->m()LU94;

    move-result-object p3

    invoke-interface {p2, p3}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, LgX3;

    if-nez p3, :cond_1

    sget-object p1, LgV2;->b0:LgV2$a;

    goto :goto_0

    :cond_1
    iget-object v0, p0, LfX3$b;->g:LdX3;

    iget-boolean v1, p0, LfX3$b;->h:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    new-instance v2, LfX3$b$a;

    iget-boolean v3, p0, LfX3$b;->h:Z

    iget-object v4, p0, LfX3$b;->g:LdX3;

    const/4 v5, 0x0

    invoke-direct {v2, v3, p3, v4, v5}, LfX3$b$a;-><init>(ZLgX3;LdX3;Lkotlin/coroutines/Continuation;)V

    invoke-static {p1, v0, v1, v2}, LzW5;->b(LgV2;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)LgV2;

    move-result-object p1

    :goto_0
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

    invoke-virtual {p0, p1, p2, p3}, LfX3$b;->a(LgV2;LEt0;I)LgV2;

    move-result-object p1

    return-object p1
.end method
