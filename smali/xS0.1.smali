.class public final LxS0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "",
        "a",
        "(LEt0;I)Z",
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
        "SMAP\nDarkTheme.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DarkTheme.android.kt\nandroidx/compose/foundation/DarkTheme_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,51:1\n76#2:52\n*S KotlinDebug\n*F\n+ 1 DarkTheme.android.kt\nandroidx/compose/foundation/DarkTheme_androidKt\n*L\n48#1:52\n*E\n"
    }
.end annotation


# direct methods
.method public static final a(LEt0;I)Z
    .locals 3

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.foundation._isSystemInDarkTheme (DarkTheme.android.kt:46)"

    const v2, -0x349ba2f4    # -1.4966028E7f

    invoke-static {v2, p1, v0, v1}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    invoke-static {}, Landroidx/compose/ui/platform/h;->f()LU94;

    move-result-object p1

    invoke-interface {p0, p1}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/res/Configuration;

    iget p0, p0, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 p0, p0, 0x30

    const/16 p1, 0x20

    if-ne p0, p1, :cond_1

    const/4 p0, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-static {}, LQt0;->Y()V

    :cond_2
    return p0
.end method
