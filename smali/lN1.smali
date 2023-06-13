.class public final LlN1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u001a\u0019\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Le62;",
        "LsP5;",
        "",
        "a",
        "(Le62;LEt0;I)LsP5;",
        "foundation_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nHoverInteraction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HoverInteraction.kt\nandroidx/compose/foundation/interaction/HoverInteractionKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,79:1\n25#2:80\n50#2:87\n49#2:88\n1114#3,6:81\n1114#3,6:89\n*S KotlinDebug\n*F\n+ 1 HoverInteraction.kt\nandroidx/compose/foundation/interaction/HoverInteractionKt\n*L\n66#1:80\n67#1:87\n67#1:88\n66#1:81,6\n67#1:89,6\n*E\n"
    }
.end annotation


# direct methods
.method public static final a(Le62;LEt0;I)LsP5;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le62;",
            "LEt0;",
            "I)",
            "LsP5<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x47eb0cb0    # 120345.375f

    invoke-interface {p1, v0}, LEt0;->F(I)V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "androidx.compose.foundation.interaction.collectIsHoveredAsState (HoverInteraction.kt:64)"

    invoke-static {v0, p2, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    const v0, -0x1d58f75c

    invoke-interface {p1, v0}, LEt0;->F(I)V

    invoke-interface {p1}, LEt0;->G()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, LEt0;->a:LEt0$a;

    invoke-virtual {v1}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v2

    const/4 v3, 0x0

    if-ne v0, v2, :cond_1

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/4 v2, 0x2

    invoke-static {v0, v3, v2, v3}, LGM5;->h(Ljava/lang/Object;LEM5;ILjava/lang/Object;)LEX2;

    move-result-object v0

    invoke-interface {p1, v0}, LEt0;->z(Ljava/lang/Object;)V

    :cond_1
    invoke-interface {p1}, LEt0;->Q()V

    check-cast v0, LEX2;

    and-int/lit8 p2, p2, 0xe

    const v2, 0x1e7b2b64

    invoke-interface {p1, v2}, LEt0;->F(I)V

    invoke-interface {p1, p0}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v2

    invoke-interface {p1, v0}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v2, v4

    invoke-interface {p1}, LEt0;->G()Ljava/lang/Object;

    move-result-object v4

    if-nez v2, :cond_2

    invoke-virtual {v1}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v4, v1, :cond_3

    :cond_2
    new-instance v4, LlN1$a;

    invoke-direct {v4, p0, v0, v3}, LlN1$a;-><init>(Le62;LEX2;Lkotlin/coroutines/Continuation;)V

    invoke-interface {p1, v4}, LEt0;->z(Ljava/lang/Object;)V

    :cond_3
    invoke-interface {p1}, LEt0;->Q()V

    check-cast v4, Lkotlin/jvm/functions/Function2;

    or-int/lit8 p2, p2, 0x40

    invoke-static {p0, v4, p1, p2}, LY91;->f(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;LEt0;I)V

    invoke-static {}, LQt0;->O()Z

    move-result p0

    if-eqz p0, :cond_4

    invoke-static {}, LQt0;->Y()V

    :cond_4
    invoke-interface {p1}, LEt0;->Q()V

    return-object v0
.end method
