.class public Lf51$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf51;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/graphics/Rect;Ljava/util/List;)Landroid/view/DisplayCutout;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Rect;",
            "Ljava/util/List<",
            "Landroid/graphics/Rect;",
            ">;)",
            "Landroid/view/DisplayCutout;"
        }
    .end annotation

    invoke-static {}, LZ41;->a()V

    invoke-static {p0, p1}, LY41;->a(Landroid/graphics/Rect;Ljava/util/List;)Landroid/view/DisplayCutout;

    move-result-object p0

    return-object p0
.end method

.method public static b(Landroid/view/DisplayCutout;)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/DisplayCutout;",
            ")",
            "Ljava/util/List<",
            "Landroid/graphics/Rect;",
            ">;"
        }
    .end annotation

    invoke-static {p0}, La51;->a(Landroid/view/DisplayCutout;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static c(Landroid/view/DisplayCutout;)I
    .locals 0

    invoke-static {p0}, Lb51;->a(Landroid/view/DisplayCutout;)I

    move-result p0

    return p0
.end method

.method public static d(Landroid/view/DisplayCutout;)I
    .locals 0

    invoke-static {p0}, Lc51;->a(Landroid/view/DisplayCutout;)I

    move-result p0

    return p0
.end method

.method public static e(Landroid/view/DisplayCutout;)I
    .locals 0

    invoke-static {p0}, Le51;->a(Landroid/view/DisplayCutout;)I

    move-result p0

    return p0
.end method

.method public static f(Landroid/view/DisplayCutout;)I
    .locals 0

    invoke-static {p0}, Ld51;->a(Landroid/view/DisplayCutout;)I

    move-result p0

    return p0
.end method
