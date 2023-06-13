.class public final LB81;
.super LU94;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "LU94<",
        "TT;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u0000*\u0004\u0008\u0000\u0010\u00012\u0008\u0012\u0004\u0012\u00028\u00000\u0002B#\u0012\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00028\u00000\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u001d\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0011\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R\u001a\u0010\t\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0008\u00a8\u0006\u000e"
    }
    d2 = {
        "LB81;",
        "T",
        "LU94;",
        "value",
        "LsP5;",
        "b",
        "(Ljava/lang/Object;LEt0;I)LsP5;",
        "LEM5;",
        "LEM5;",
        "policy",
        "Lkotlin/Function0;",
        "defaultFactory",
        "<init>",
        "(LEM5;Lkotlin/jvm/functions/Function0;)V",
        "runtime_release"
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
        "SMAP\nCompositionLocal.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompositionLocal.kt\nandroidx/compose/runtime/DynamicProvidableCompositionLocal\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,255:1\n25#2:256\n1114#3,6:257\n*S KotlinDebug\n*F\n+ 1 CompositionLocal.kt\nandroidx/compose/runtime/DynamicProvidableCompositionLocal\n*L\n126#1:256\n126#1:257,6\n*E\n"
    }
.end annotation


# instance fields
.field public final b:LEM5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEM5<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LEM5;Lkotlin/jvm/functions/Function0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LEM5<",
            "TT;>;",
            "Lkotlin/jvm/functions/Function0<",
            "+TT;>;)V"
        }
    .end annotation

    const-string v0, "policy"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "defaultFactory"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p2}, LU94;-><init>(Lkotlin/jvm/functions/Function0;)V

    iput-object p1, p0, LB81;->b:LEM5;

    return-void
.end method

.method public static final synthetic e(LB81;)LEM5;
    .locals 0

    iget-object p0, p0, LB81;->b:LEM5;

    return-object p0
.end method


# virtual methods
.method public b(Ljava/lang/Object;LEt0;I)LsP5;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "LEt0;",
            "I)",
            "LsP5<",
            "TT;>;"
        }
    .end annotation

    const v0, -0x5022614

    invoke-interface {p2, v0}, LEt0;->F(I)V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "androidx.compose.runtime.DynamicProvidableCompositionLocal.provided (CompositionLocal.kt:125)"

    invoke-static {v0, p3, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    const p3, -0x1d58f75c

    invoke-interface {p2, p3}, LEt0;->F(I)V

    invoke-interface {p2}, LEt0;->G()Ljava/lang/Object;

    move-result-object p3

    sget-object v0, LEt0;->a:LEt0$a;

    invoke-virtual {v0}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne p3, v0, :cond_1

    invoke-static {p0}, LB81;->e(LB81;)LEM5;

    move-result-object p3

    invoke-static {p1, p3}, LGM5;->g(Ljava/lang/Object;LEM5;)LEX2;

    move-result-object p3

    invoke-interface {p2, p3}, LEt0;->z(Ljava/lang/Object;)V

    :cond_1
    invoke-interface {p2}, LEt0;->Q()V

    check-cast p3, LEX2;

    invoke-interface {p3, p1}, LEX2;->setValue(Ljava/lang/Object;)V

    invoke-static {}, LQt0;->O()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-static {}, LQt0;->Y()V

    :cond_2
    invoke-interface {p2}, LEt0;->Q()V

    return-object p3
.end method
