.class public final Lcom/stripe/android/uicore/text/DimentionResourceSpKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u001c\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0001\u001a\u00020\u0000H\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u0005"
    }
    d2 = {
        "",
        "id",
        "LM26;",
        "dimensionResourceSp",
        "(ILEt0;I)J",
        "stripe-ui-core_release"
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
        "SMAP\nDimentionResourceSp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DimentionResourceSp.kt\ncom/stripe/android/uicore/text/DimentionResourceSpKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,19:1\n76#2:20\n*S KotlinDebug\n*F\n+ 1 DimentionResourceSp.kt\ncom/stripe/android/uicore/text/DimentionResourceSpKt\n*L\n15#1:20\n*E\n"
    }
.end annotation


# direct methods
.method public static final dimensionResourceSp(ILEt0;I)J
    .locals 3

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "com.stripe.android.uicore.text.dimensionResourceSp (DimentionResourceSp.kt:13)"

    const v2, -0x205d6702

    invoke-static {v2, p2, v0, v1}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v0

    invoke-interface {p1, v0}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg01;

    and-int/lit8 p2, p2, 0xe

    invoke-static {p0, p1, p2}, LH24;->a(ILEt0;I)F

    move-result p0

    invoke-interface {v0, p0}, Lg01;->s0(F)J

    move-result-wide p0

    return-wide p0
.end method
