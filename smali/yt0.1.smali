.class public final Lyt0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0004\u001a\u0008\u0010\u0001\u001a\u00020\u0000H\u0001\u001a\u000f\u0010\u0003\u001a\u00020\u0002H\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\"\u0011\u0010\u0008\u001a\u00020\u00058G\u00a2\u0006\u0006\u001a\u0004\u0008\u0006\u0010\u0007\"\u0011\u0010\u000c\u001a\u00020\t8G\u00a2\u0006\u0006\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\r"
    }
    d2 = {
        "",
        "c",
        "LYt0;",
        "d",
        "(LEt0;I)LYt0;",
        "Lns4;",
        "b",
        "(LEt0;I)Lns4;",
        "currentRecomposeScope",
        "",
        "a",
        "(LEt0;I)I",
        "currentCompositeKeyHash",
        "runtime_release"
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
        "SMAP\nComposables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,484:1\n1114#2,6:485\n1114#2,6:491\n1114#2,6:497\n1114#2,6:503\n1114#2,6:509\n*S KotlinDebug\n*F\n+ 1 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n25#1:485,6\n36#1:491,6\n49#1:497,6\n66#1:503,6\n85#1:509,6\n*E\n"
    }
.end annotation


# direct methods
.method public static final a(LEt0;I)I
    .locals 3
    .annotation build Lkotlin/jvm/JvmName;
        name = "getCurrentCompositeKeyHash"
    .end annotation

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.runtime.<get-currentCompositeKeyHash> (Composables.kt:224)"

    const v2, 0x1f4264f3

    invoke-static {v2, p1, v0, v1}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    invoke-interface {p0}, LEt0;->O()I

    move-result p0

    invoke-static {}, LQt0;->O()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {}, LQt0;->Y()V

    :cond_1
    return p0
.end method

.method public static final b(LEt0;I)Lns4;
    .locals 3
    .annotation build Lkotlin/jvm/JvmName;
        name = "getCurrentRecomposeScope"
    .end annotation

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.runtime.<get-currentRecomposeScope> (Composables.kt:192)"

    const v2, 0x178a93e7

    invoke-static {v2, p1, v0, v1}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    invoke-interface {p0}, LEt0;->D()Lns4;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-interface {p0, p1}, LEt0;->i(Lns4;)V

    invoke-static {}, LQt0;->O()Z

    move-result p0

    if-eqz p0, :cond_1

    invoke-static {}, LQt0;->Y()V

    :cond_1
    return-object p1

    :cond_2
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "no recompose scope found"

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final c()V
    .locals 2
    .annotation build Lkotlin/PublishedApi;
    .end annotation

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Invalid applier"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final d(LEt0;I)LYt0;
    .locals 3

    const v0, -0x457c7c0c

    invoke-interface {p0, v0}, LEt0;->F(I)V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "androidx.compose.runtime.rememberCompositionContext (Composables.kt:480)"

    invoke-static {v0, p1, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    invoke-interface {p0}, LEt0;->m()LYt0;

    move-result-object p1

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, LQt0;->Y()V

    :cond_1
    invoke-interface {p0}, LEt0;->Q()V

    return-object p1
.end method
