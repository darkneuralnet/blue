.class public final LQv4;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\u001ac\u0010\n\u001a\u00028\u0000\"\u0008\u0008\u0000\u0010\u0001*\u00020\u00002\u0016\u0010\u0003\u001a\u000c\u0012\u0008\u0008\u0001\u0012\u0004\u0018\u00010\u00000\u0002\"\u0004\u0018\u00010\u00002\u0016\u0008\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0008\u0001\u0012\u00020\u00000\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0008H\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001a\u0016\u0010\u000f\u001a\u00020\u000e*\u00020\u000c2\u0008\u0010\r\u001a\u0004\u0018\u00010\u0000H\u0002\"\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0014"
    }
    d2 = {
        "",
        "T",
        "",
        "inputs",
        "LRi5;",
        "saver",
        "",
        "key",
        "Lkotlin/Function0;",
        "init",
        "b",
        "([Ljava/lang/Object;LRi5;Ljava/lang/String;Lkotlin/jvm/functions/Function0;LEt0;II)Ljava/lang/Object;",
        "LHi5;",
        "value",
        "",
        "c",
        "",
        "a",
        "I",
        "MaxSupportedRadix",
        "runtime-saveable_release"
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
        "SMAP\nRememberSaveable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RememberSaveable.kt\nandroidx/compose/runtime/saveable/RememberSaveableKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,200:1\n76#2:201\n83#3,3:202\n1114#4,6:205\n*S KotlinDebug\n*F\n+ 1 RememberSaveable.kt\nandroidx/compose/runtime/saveable/RememberSaveableKt\n*L\n81#1:201\n83#1:202,3\n83#1:205,6\n*E\n"
    }
.end annotation


# static fields
.field public static final a:I = 0x24


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final synthetic a(LHi5;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LQv4;->c(LHi5;Ljava/lang/Object;)V

    return-void
.end method

.method public static final b([Ljava/lang/Object;LRi5;Ljava/lang/String;Lkotlin/jvm/functions/Function0;LEt0;II)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([",
            "Ljava/lang/Object;",
            "LRi5<",
            "TT;+",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function0<",
            "+TT;>;",
            "LEt0;",
            "II)TT;"
        }
    .end annotation

    const-string v0, "inputs"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "init"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x1a56bfab

    invoke-interface {p4, v0}, LEt0;->F(I)V

    and-int/lit8 v1, p6, 0x2

    if-eqz v1, :cond_0

    invoke-static {}, LSi5;->b()LRi5;

    move-result-object p1

    :cond_0
    and-int/lit8 p6, p6, 0x4

    const/4 v1, 0x0

    if-eqz p6, :cond_1

    move-object p2, v1

    :cond_1
    invoke-static {}, LQt0;->O()Z

    move-result p6

    if-eqz p6, :cond_2

    const/4 p6, -0x1

    const-string v2, "androidx.compose.runtime.saveable.rememberSaveable (RememberSaveable.kt:65)"

    invoke-static {v0, p5, p6, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    const p5, 0x3f24a645

    invoke-interface {p4, p5}, LEt0;->F(I)V

    const/4 p5, 0x0

    if-eqz p2, :cond_4

    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result p6

    if-nez p6, :cond_3

    goto :goto_0

    :cond_3
    move p6, p5

    goto :goto_1

    :cond_4
    :goto_0
    const/4 p6, 0x1

    :goto_1
    if-nez p6, :cond_5

    goto :goto_2

    :cond_5
    invoke-static {p4, p5}, Lyt0;->a(LEt0;I)I

    move-result p2

    sget p6, LQv4;->a:I

    invoke-static {p6}, Lkotlin/text/CharsKt;->checkRadix(I)I

    move-result p6

    invoke-static {p2, p6}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object p2

    const-string p6, "toString(this, checkRadix(radix))"

    invoke-static {p2, p6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_2
    invoke-interface {p4}, LEt0;->Q()V

    const-string p6, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable, kotlin.Any>"

    invoke-static {p1, p6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LJi5;->b()LU94;

    move-result-object p6

    invoke-interface {p4, p6}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object p6

    check-cast p6, LHi5;

    array-length v0, p0

    invoke-static {p0, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p0

    const v0, -0x21de6e89

    invoke-interface {p4, v0}, LEt0;->F(I)V

    array-length v0, p0

    move v2, p5

    move v3, v2

    :goto_3
    if-ge v2, v0, :cond_6

    aget-object v4, p0, v2

    invoke-interface {p4, v4}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_6
    invoke-interface {p4}, LEt0;->G()Ljava/lang/Object;

    move-result-object p0

    if-nez v3, :cond_7

    sget-object v0, LEt0;->a:LEt0$a;

    invoke-virtual {v0}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne p0, v0, :cond_a

    :cond_7
    if-eqz p6, :cond_8

    invoke-interface {p6, p2}, LHi5;->f(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    if-eqz p0, :cond_8

    invoke-interface {p1, p0}, LRi5;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    :cond_8
    if-nez v1, :cond_9

    invoke-interface {p3}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object p0

    goto :goto_4

    :cond_9
    move-object p0, v1

    :goto_4
    invoke-interface {p4, p0}, LEt0;->z(Ljava/lang/Object;)V

    :cond_a
    invoke-interface {p4}, LEt0;->Q()V

    if-eqz p6, :cond_b

    invoke-static {p1, p4, p5}, LGM5;->n(Ljava/lang/Object;LEt0;I)LsP5;

    move-result-object p1

    invoke-static {p0, p4, p5}, LGM5;->n(Ljava/lang/Object;LEt0;I)LsP5;

    move-result-object p3

    new-instance v0, LQv4$a;

    invoke-direct {v0, p6, p2, p1, p3}, LQv4$a;-><init>(LHi5;Ljava/lang/String;LsP5;LsP5;)V

    invoke-static {p6, p2, v0, p4, p5}, LY91;->b(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;LEt0;I)V

    :cond_b
    invoke-static {}, LQt0;->O()Z

    move-result p1

    if-eqz p1, :cond_c

    invoke-static {}, LQt0;->Y()V

    :cond_c
    invoke-interface {p4}, LEt0;->Q()V

    return-object p0
.end method

.method public static final c(LHi5;Ljava/lang/Object;)V
    .locals 2

    if-eqz p1, :cond_2

    invoke-interface {p0, p1}, LHi5;->a(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2

    new-instance p0, Ljava/lang/IllegalArgumentException;

    instance-of v0, p1, LCM5;

    if-eqz v0, :cond_1

    check-cast p1, LCM5;

    invoke-interface {p1}, LCM5;->a()LEM5;

    move-result-object v0

    invoke-static {}, LGM5;->i()LEM5;

    move-result-object v1

    if-eq v0, v1, :cond_0

    invoke-interface {p1}, LCM5;->a()LEM5;

    move-result-object v0

    invoke-static {}, LGM5;->p()LEM5;

    move-result-object v1

    if-eq v0, v1, :cond_0

    invoke-interface {p1}, LCM5;->a()LEM5;

    move-result-object v0

    invoke-static {}, LGM5;->m()LEM5;

    move-result-object v1

    if-eq v0, v1, :cond_0

    const-string p1, "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver"

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "MutableState containing "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p1}, LEX2;->getValue()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable()."

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable()."

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :goto_0
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    return-void
.end method
