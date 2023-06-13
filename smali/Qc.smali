.class public final LQc;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a=\u0010\u000c\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\nH\u0000\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\r\u001a\n\u0010\u000e\u001a\u00020\u0000*\u00020\u0001\u001a\u0019\u0010\u0010\u001a\u00020\u000f*\u00020\u0006H\u0000\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u001a\u0016\u0010\u0012\u001a\u00020\u0006*\u00020\u000fH\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0012\u0010\u0013\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006\u0014"
    }
    d2 = {
        "Landroid/graphics/Bitmap;",
        "LMW1;",
        "c",
        "",
        "width",
        "height",
        "LNW1;",
        "config",
        "",
        "hasAlpha",
        "LBm0;",
        "colorSpace",
        "a",
        "(IIIZLBm0;)LMW1;",
        "b",
        "Landroid/graphics/Bitmap$Config;",
        "d",
        "(I)Landroid/graphics/Bitmap$Config;",
        "e",
        "(Landroid/graphics/Bitmap$Config;)I",
        "ui-graphics_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public static final a(IIIZLBm0;)LMW1;
    .locals 3

    const-string v0, "colorSpace"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, LQc;->d(I)Landroid/graphics/Bitmap$Config;

    move-result-object v0

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1a

    if-lt v1, v2, :cond_0

    invoke-static {p0, p1, p2, p3, p4}, LVg;->c(IIIZLBm0;)Landroid/graphics/Bitmap;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    invoke-static {p2, p0, p1, v0}, Landroid/graphics/Bitmap;->createBitmap(Landroid/util/DisplayMetrics;IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object p0

    const-string p1, "createBitmap(\n          \u2026   bitmapConfig\n        )"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p3}, Landroid/graphics/Bitmap;->setHasAlpha(Z)V

    :goto_0
    new-instance p1, LNc;

    invoke-direct {p1, p0}, LNc;-><init>(Landroid/graphics/Bitmap;)V

    return-object p1
.end method

.method public static final b(LMW1;)Landroid/graphics/Bitmap;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, LNc;

    if-eqz v0, :cond_0

    check-cast p0, LNc;

    invoke-virtual {p0}, LNc;->c()Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Unable to obtain android.graphics.Bitmap"

    invoke-direct {p0, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final c(Landroid/graphics/Bitmap;)LMW1;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LNc;

    invoke-direct {v0, p0}, LNc;-><init>(Landroid/graphics/Bitmap;)V

    return-object v0
.end method

.method public static final d(I)Landroid/graphics/Bitmap$Config;
    .locals 4

    sget-object v0, LNW1;->b:LNW1$a;

    invoke-virtual {v0}, LNW1$a;->b()I

    move-result v1

    invoke-static {p0, v1}, LNW1;->i(II)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object p0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, LNW1$a;->a()I

    move-result v1

    invoke-static {p0, v1}, LNW1;->i(II)Z

    move-result v1

    if-eqz v1, :cond_1

    sget-object p0, Landroid/graphics/Bitmap$Config;->ALPHA_8:Landroid/graphics/Bitmap$Config;

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, LNW1$a;->e()I

    move-result v1

    invoke-static {p0, v1}, LNW1;->i(II)Z

    move-result v1

    if-eqz v1, :cond_2

    sget-object p0, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    goto :goto_0

    :cond_2
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1a

    if-lt v1, v2, :cond_3

    invoke-virtual {v0}, LNW1$a;->c()I

    move-result v3

    invoke-static {p0, v3}, LNW1;->i(II)Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-static {}, LOc;->a()Landroid/graphics/Bitmap$Config;

    move-result-object p0

    goto :goto_0

    :cond_3
    if-lt v1, v2, :cond_4

    invoke-virtual {v0}, LNW1$a;->d()I

    move-result v0

    invoke-static {p0, v0}, LNW1;->i(II)Z

    move-result p0

    if-eqz p0, :cond_4

    invoke-static {}, LPc;->a()Landroid/graphics/Bitmap$Config;

    move-result-object p0

    goto :goto_0

    :cond_4
    sget-object p0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    :goto_0
    return-object p0
.end method

.method public static final e(Landroid/graphics/Bitmap$Config;)I
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Landroid/graphics/Bitmap$Config;->ALPHA_8:Landroid/graphics/Bitmap$Config;

    if-ne p0, v0, :cond_0

    sget-object p0, LNW1;->b:LNW1$a;

    invoke-virtual {p0}, LNW1$a;->a()I

    move-result p0

    goto :goto_0

    :cond_0
    sget-object v0, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    if-ne p0, v0, :cond_1

    sget-object p0, LNW1;->b:LNW1$a;

    invoke-virtual {p0}, LNW1$a;->e()I

    move-result p0

    goto :goto_0

    :cond_1
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_4444:Landroid/graphics/Bitmap$Config;

    if-ne p0, v0, :cond_2

    sget-object p0, LNW1;->b:LNW1$a;

    invoke-virtual {p0}, LNW1$a;->b()I

    move-result p0

    goto :goto_0

    :cond_2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_3

    invoke-static {}, LOc;->a()Landroid/graphics/Bitmap$Config;

    move-result-object v2

    if-ne p0, v2, :cond_3

    sget-object p0, LNW1;->b:LNW1$a;

    invoke-virtual {p0}, LNW1$a;->c()I

    move-result p0

    goto :goto_0

    :cond_3
    if-lt v0, v1, :cond_4

    invoke-static {}, LPc;->a()Landroid/graphics/Bitmap$Config;

    move-result-object v0

    if-ne p0, v0, :cond_4

    sget-object p0, LNW1;->b:LNW1$a;

    invoke-virtual {p0}, LNW1$a;->d()I

    move-result p0

    goto :goto_0

    :cond_4
    sget-object p0, LNW1;->b:LNW1$a;

    invoke-virtual {p0}, LNW1$a;->b()I

    move-result p0

    :goto_0
    return p0
.end method
