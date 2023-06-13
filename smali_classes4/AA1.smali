.class public final LAA1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u001a\u000e\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000\u00a8\u0006\u0003"
    }
    d2 = {
        "",
        "seconds",
        "a",
        "app_birdRelease"
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
        "SMAP\nFunctions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Functions.kt\nco/bird/android/utility/misc/FunctionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,21:1\n1#2:22\n*E\n"
    }
.end annotation


# direct methods
.method public static final a(I)I
    .locals 2

    rem-int/lit8 v0, p0, 0x3c

    const/4 v1, 0x5

    if-lt v0, v1, :cond_0

    div-int/lit8 p0, p0, 0x3c

    add-int/lit8 p0, p0, 0x1

    goto :goto_0

    :cond_0
    div-int/lit8 p0, p0, 0x3c

    :goto_0
    return p0
.end method
