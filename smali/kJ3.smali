.class public final LkJ3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LkJ3$a;
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(FFFF)Landroid/view/animation/Interpolator;
    .locals 0

    invoke-static {p0, p1, p2, p3}, LkJ3$a;->b(FFFF)Landroid/view/animation/PathInterpolator;

    move-result-object p0

    return-object p0
.end method

.method public static b(Landroid/graphics/Path;)Landroid/view/animation/Interpolator;
    .locals 0

    invoke-static {p0}, LkJ3$a;->c(Landroid/graphics/Path;)Landroid/view/animation/PathInterpolator;

    move-result-object p0

    return-object p0
.end method
