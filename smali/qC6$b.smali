.class public final LqC6$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LqC6;->a(LgV2;)LgV2;
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
        "SMAP\nWindowInsetsPadding.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsPadding.android.kt\nandroidx/compose/foundation/layout/WindowInsetsPadding_androidKt$windowInsetsPadding$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 WindowInsetsPadding.android.kt\nandroidx/compose/foundation/layout/WindowInsetsPadding_androidKt\n*L\n1#1,255:1\n36#2:256\n1057#3,3:257\n1060#3,3:261\n149#4:260\n*S KotlinDebug\n*F\n+ 1 WindowInsetsPadding.android.kt\nandroidx/compose/foundation/layout/WindowInsetsPadding_androidKt$windowInsetsPadding$1\n*L\n251#1:256\n251#1:257,3\n251#1:261,3\n*E\n"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x3

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LgV2;LEt0;I)LgV2;
    .locals 2

    const-string v0, "$this$composed"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const p1, 0x15733969

    invoke-interface {p2, p1}, LEt0;->F(I)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.android.kt:248)"

    invoke-static {p1, p3, v0, v1}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    sget-object p1, LnC6;->x:LnC6$a;

    const/16 p3, 0x8

    invoke-virtual {p1, p2, p3}, LnC6$a;->c(LEt0;I)LnC6;

    move-result-object p1

    const p3, 0x44faf204

    invoke-interface {p2, p3}, LEt0;->F(I)V

    invoke-interface {p2, p1}, LEt0;->n(Ljava/lang/Object;)Z

    move-result p3

    invoke-interface {p2}, LEt0;->G()Ljava/lang/Object;

    move-result-object v0

    if-nez p3, :cond_1

    sget-object p3, LEt0;->a:LEt0$a;

    invoke-virtual {p3}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object p3

    if-ne v0, p3, :cond_2

    :cond_1
    invoke-virtual {p1}, LnC6;->d()Lke;

    move-result-object p1

    new-instance v0, LF32;

    const/4 p3, 0x2

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1, p3, v1}, LF32;-><init>(LpB6;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p2, v0}, LEt0;->z(Ljava/lang/Object;)V

    :cond_2
    invoke-interface {p2}, LEt0;->Q()V

    check-cast v0, LF32;

    invoke-static {}, LQt0;->O()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, LQt0;->Y()V

    :cond_3
    invoke-interface {p2}, LEt0;->Q()V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LgV2;

    check-cast p2, LEt0;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LqC6$b;->a(LgV2;LEt0;I)LgV2;

    move-result-object p1

    return-object p1
.end method
