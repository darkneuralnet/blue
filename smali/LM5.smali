.class public final synthetic LLM5;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a1\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\u0008\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\u000e\u0008\u0002\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a\u0012\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\u0008\u0000\u0010\u0000\u001a-\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\u0008\u0000\u0010\u00002\u0012\u0010\n\u001a\n\u0012\u0006\u0008\u0001\u0012\u00028\u00000\t\"\u00028\u0000\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u001a\u001e\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000f\"\u0004\u0008\u0000\u0010\r\"\u0004\u0008\u0001\u0010\u000e\u001a#\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0012\"\u0004\u0008\u0000\u0010\u00002\u0006\u0010\u0011\u001a\u00028\u0000H\u0007\u00a2\u0006\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0015"
    }
    d2 = {
        "T",
        "value",
        "LEM5;",
        "policy",
        "LEX2;",
        "d",
        "(Ljava/lang/Object;LEM5;)LEX2;",
        "LMM5;",
        "a",
        "",
        "elements",
        "b",
        "([Ljava/lang/Object;)LMM5;",
        "K",
        "V",
        "LOM5;",
        "c",
        "newValue",
        "LsP5;",
        "f",
        "(Ljava/lang/Object;LEt0;I)LsP5;",
        "runtime_release"
    }
    k = 0x5
    mv = {
        0x1,
        0x8,
        0x0
    }
    xs = "androidx/compose/runtime/SnapshotStateKt"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nSnapshotState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,298:1\n1#2:299\n25#3:300\n1114#4,6:301\n*S KotlinDebug\n*F\n+ 1 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n295#1:300\n295#1:301,6\n*E\n"
    }
.end annotation


# direct methods
.method public static final a()LMM5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()",
            "LMM5<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, LMM5;

    invoke-direct {v0}, LMM5;-><init>()V

    return-object v0
.end method

.method public static final varargs b([Ljava/lang/Object;)LMM5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;)",
            "LMM5<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "elements"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LMM5;

    invoke-direct {v0}, LMM5;-><init>()V

    invoke-static {p0}, Lkotlin/collections/ArraysKt;->toList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/util/Collection;

    invoke-virtual {v0, p0}, LMM5;->addAll(Ljava/util/Collection;)Z

    return-object v0
.end method

.method public static final c()LOM5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">()",
            "LOM5<",
            "TK;TV;>;"
        }
    .end annotation

    new-instance v0, LOM5;

    invoke-direct {v0}, LOM5;-><init>()V

    return-object v0
.end method

.method public static final d(Ljava/lang/Object;LEM5;)LEX2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;",
            "LEM5<",
            "TT;>;)",
            "LEX2<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "policy"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, LA6;->a(Ljava/lang/Object;LEM5;)LCM5;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Ljava/lang/Object;LEM5;ILjava/lang/Object;)LEX2;
    .locals 0

    and-int/lit8 p2, p2, 0x2

    if-eqz p2, :cond_0

    invoke-static {}, LGM5;->p()LEM5;

    move-result-object p1

    :cond_0
    invoke-static {p0, p1}, LGM5;->g(Ljava/lang/Object;LEM5;)LEX2;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Ljava/lang/Object;LEt0;I)LsP5;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;",
            "LEt0;",
            "I)",
            "LsP5<",
            "TT;>;"
        }
    .end annotation

    const v0, -0x3f14ae72

    invoke-interface {p1, v0}, LEt0;->F(I)V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "androidx.compose.runtime.rememberUpdatedState (SnapshotState.kt:294)"

    invoke-static {v0, p2, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    const p2, -0x1d58f75c

    invoke-interface {p1, p2}, LEt0;->F(I)V

    invoke-interface {p1}, LEt0;->G()Ljava/lang/Object;

    move-result-object p2

    sget-object v0, LEt0;->a:LEt0$a;

    invoke-virtual {v0}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne p2, v0, :cond_1

    const/4 p2, 0x2

    const/4 v0, 0x0

    invoke-static {p0, v0, p2, v0}, LGM5;->h(Ljava/lang/Object;LEM5;ILjava/lang/Object;)LEX2;

    move-result-object p2

    invoke-interface {p1, p2}, LEt0;->z(Ljava/lang/Object;)V

    :cond_1
    invoke-interface {p1}, LEt0;->Q()V

    check-cast p2, LEX2;

    invoke-interface {p2, p0}, LEX2;->setValue(Ljava/lang/Object;)V

    invoke-static {}, LQt0;->O()Z

    move-result p0

    if-eqz p0, :cond_2

    invoke-static {}, LQt0;->Y()V

    :cond_2
    invoke-interface {p1}, LEt0;->Q()V

    return-object p2
.end method
