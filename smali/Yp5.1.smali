.class public final LYp5;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u000f\u0010\u0003\u001a\u00020\u0002H\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u001e\u0010\u000e\u001a\u00020\u000c2\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000c\u00a8\u0006\u0011"
    }
    d2 = {
        "LYp5;",
        "",
        "Lcu1;",
        "a",
        "(LEt0;I)Lcu1;",
        "LDA3;",
        "b",
        "(LEt0;I)LDA3;",
        "Lpm2;",
        "layoutDirection",
        "LEy3;",
        "orientation",
        "",
        "reverseScrolling",
        "c",
        "<init>",
        "()V",
        "foundation_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nScrollable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scrollable.kt\nandroidx/compose/foundation/gestures/ScrollableDefaults\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,579:1\n36#2:580\n1114#3,6:581\n*S KotlinDebug\n*F\n+ 1 Scrollable.kt\nandroidx/compose/foundation/gestures/ScrollableDefaults\n*L\n190#1:580\n190#1:581,6\n*E\n"
    }
.end annotation


# static fields
.field public static final a:LYp5;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LYp5;

    invoke-direct {v0}, LYp5;-><init>()V

    sput-object v0, LYp5;->a:LYp5;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LEt0;I)Lcu1;
    .locals 3

    const v0, 0x4206c4aa

    invoke-interface {p1, v0}, LEt0;->F(I)V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "androidx.compose.foundation.gestures.ScrollableDefaults.flingBehavior (Scrollable.kt:187)"

    invoke-static {v0, p2, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    const/4 p2, 0x0

    invoke-static {p1, p2}, LWN5;->b(LEt0;I)LjV0;

    move-result-object p2

    const v0, 0x44faf204

    invoke-interface {p1, v0}, LEt0;->F(I)V

    invoke-interface {p1, p2}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v0

    invoke-interface {p1}, LEt0;->G()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_1

    sget-object v0, LEt0;->a:LEt0$a;

    invoke-virtual {v0}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v1, v0, :cond_2

    :cond_1
    new-instance v1, LiX0;

    const/4 v0, 0x2

    const/4 v2, 0x0

    invoke-direct {v1, p2, v2, v0, v2}, LiX0;-><init>(LjV0;LPV2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p1, v1}, LEt0;->z(Ljava/lang/Object;)V

    :cond_2
    invoke-interface {p1}, LEt0;->Q()V

    check-cast v1, LiX0;

    invoke-static {}, LQt0;->O()Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-static {}, LQt0;->Y()V

    :cond_3
    invoke-interface {p1}, LEt0;->Q()V

    return-object v1
.end method

.method public final b(LEt0;I)LDA3;
    .locals 3

    const v0, 0x6bdf63e4

    invoke-interface {p1, v0}, LEt0;->F(I)V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "androidx.compose.foundation.gestures.ScrollableDefaults.overscrollEffect (Scrollable.kt:200)"

    invoke-static {v0, p2, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    const/4 p2, 0x0

    invoke-static {p1, p2}, Lfd;->b(LEt0;I)LDA3;

    move-result-object p2

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, LQt0;->Y()V

    :cond_1
    invoke-interface {p1}, LEt0;->Q()V

    return-object p2
.end method

.method public final c(Lpm2;LEy3;Z)Z
    .locals 2

    const-string v0, "layoutDirection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "orientation"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    xor-int/2addr p3, v0

    sget-object v1, Lpm2;->c:Lpm2;

    if-ne p1, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    sget-object p1, LEy3;->b:LEy3;

    if-eq p2, p1, :cond_1

    xor-int/lit8 p3, p3, 0x1

    :cond_1
    return p3
.end method
