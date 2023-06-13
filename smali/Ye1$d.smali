.class public final LYe1$d;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYe1;->g(LF96;LZe1;Lgi1;Ljava/lang/String;LEt0;I)LgV2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function3<",
        "LF96$b<",
        "LXe1;",
        ">;",
        "LEt0;",
        "Ljava/lang/Integer;",
        "LjO5<",
        "Landroidx/compose/ui/graphics/f;",
        ">;>;"
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
        "SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$animateValue$1\n*L\n1#1,1155:1\n*E\n"
    }
.end annotation


# static fields
.field public static final g:LYe1$d;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LYe1$d;

    invoke-direct {v0}, LYe1$d;-><init>()V

    sput-object v0, LYe1$d;->g:LYe1$d;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x3

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LF96$b;LEt0;I)LjO5;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LF96$b<",
            "LXe1;",
            ">;",
            "LEt0;",
            "I)",
            "LjO5<",
            "Landroidx/compose/ui/graphics/f;",
            ">;"
        }
    .end annotation

    const-string v0, "$this$null"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const p1, -0x3560ba1a    # -5219059.0f

    invoke-interface {p2, p1}, LEt0;->F(I)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.animation.core.animateValue.<anonymous> (Transition.kt:851)"

    invoke-static {p1, p3, v0, v1}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    const/4 p1, 0x7

    const/4 p3, 0x0

    const/4 v0, 0x0

    invoke-static {p3, p3, v0, p1, v0}, Lmf;->i(FFLjava/lang/Object;ILjava/lang/Object;)LjO5;

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

    check-cast p1, LF96$b;

    check-cast p2, LEt0;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LYe1$d;->a(LF96$b;LEt0;I)LjO5;

    move-result-object p1

    return-object p1
.end method
