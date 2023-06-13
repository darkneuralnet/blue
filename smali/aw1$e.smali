.class public final Law1$e;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Law1;->c(LgV2;ZLrX2;)LgV2;
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
        "SMAP\nFocusable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Focusable.kt\nandroidx/compose/foundation/FocusableKt$focusableInNonTouchMode$2\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,227:1\n76#2:228\n*S KotlinDebug\n*F\n+ 1 Focusable.kt\nandroidx/compose/foundation/FocusableKt$focusableInNonTouchMode$2\n*L\n218#1:228\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Z

.field public final synthetic h:LrX2;


# direct methods
.method public constructor <init>(ZLrX2;)V
    .locals 0

    iput-boolean p1, p0, Law1$e;->g:Z

    iput-object p2, p0, Law1$e;->h:LrX2;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LgV2;LEt0;I)LgV2;
    .locals 2

    const-string v0, "$this$composed"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const p1, -0x24e46b7d

    invoke-interface {p2, p1}, LEt0;->F(I)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.foundation.focusableInNonTouchMode.<anonymous> (Focusable.kt:216)"

    invoke-static {p1, p3, v0, v1}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    invoke-static {}, Lhu0;->k()LU94;

    move-result-object p1

    invoke-interface {p2, p1}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lm32;

    sget-object p3, LgV2;->b0:LgV2$a;

    new-instance v0, Law1$e$a;

    invoke-direct {v0, p1}, Law1$e$a;-><init>(Lm32;)V

    invoke-static {p3, v0}, Landroidx/compose/ui/focus/g;->a(LgV2;Lkotlin/jvm/functions/Function1;)LgV2;

    move-result-object p1

    iget-boolean p3, p0, Law1$e;->g:Z

    iget-object v0, p0, Law1$e;->h:LrX2;

    invoke-static {p1, p3, v0}, Law1;->b(LgV2;ZLrX2;)LgV2;

    move-result-object p1

    invoke-static {}, LQt0;->O()Z

    move-result p3

    if-eqz p3, :cond_1

    invoke-static {}, LQt0;->Y()V

    :cond_1
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

    invoke-virtual {p0, p1, p2, p3}, Law1$e;->a(LgV2;LEt0;I)LgV2;

    move-result-object p1

    return-object p1
.end method
