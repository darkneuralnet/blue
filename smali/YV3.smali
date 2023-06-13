.class public final LYV3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LFV3;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYV3$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0008\u0008\u00c1\u0002\u0018\u00002\u00020\u0001:\u0001\u0013B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J(\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0016R\u001a\u0010\u0010\u001a\u00020\u000c8\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\r\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0014"
    }
    d2 = {
        "LYV3;",
        "LFV3;",
        "LaG2;",
        "style",
        "Landroid/view/View;",
        "view",
        "Lg01;",
        "density",
        "",
        "initialZoom",
        "LYV3$a;",
        "c",
        "",
        "Z",
        "b",
        "()Z",
        "canUpdateZoom",
        "<init>",
        "()V",
        "a",
        "foundation_release"
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
        "SMAP\nPlatformMagnifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformMagnifier.kt\nandroidx/compose/foundation/PlatformMagnifierFactoryApi29Impl\n+ 2 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,184:1\n152#2:185\n*S KotlinDebug\n*F\n+ 1 PlatformMagnifier.kt\nandroidx/compose/foundation/PlatformMagnifierFactoryApi29Impl\n*L\n152#1:185\n*E\n"
    }
.end annotation


# static fields
.field public static final b:LYV3;

.field public static final c:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LYV3;

    invoke-direct {v0}, LYV3;-><init>()V

    sput-object v0, LYV3;->b:LYV3;

    const/4 v0, 0x1

    sput-boolean v0, LYV3;->c:Z

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(LaG2;Landroid/view/View;Lg01;F)LEV3;
    .locals 0

    invoke-virtual {p0, p1, p2, p3, p4}, LYV3;->c(LaG2;Landroid/view/View;Lg01;F)LYV3$a;

    move-result-object p1

    return-object p1
.end method

.method public b()Z
    .locals 1

    sget-boolean v0, LYV3;->c:Z

    return v0
.end method

.method public c(LaG2;Landroid/view/View;Lg01;F)LYV3$a;
    .locals 5

    const-string v0, "style"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "view"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "density"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LaG2;->g:LaG2$a;

    invoke-virtual {v0}, LaG2$a;->b()LaG2;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance p1, LYV3$a;

    invoke-static {}, LHV3;->a()V

    invoke-static {p2}, LGV3;->a(Landroid/view/View;)Landroid/widget/Magnifier;

    move-result-object p2

    invoke-direct {p1, p2}, LYV3$a;-><init>(Landroid/widget/Magnifier;)V

    return-object p1

    :cond_0
    invoke-virtual {p1}, LaG2;->g()J

    move-result-wide v0

    invoke-interface {p3, v0, v1}, Lg01;->z(J)J

    move-result-wide v0

    invoke-virtual {p1}, LaG2;->d()F

    move-result v2

    invoke-interface {p3, v2}, Lg01;->T0(F)F

    move-result v2

    invoke-virtual {p1}, LaG2;->e()F

    move-result v3

    invoke-interface {p3, v3}, Lg01;->T0(F)F

    move-result p3

    invoke-static {}, LVV3;->a()V

    invoke-static {p2}, LUV3;->a(Landroid/view/View;)Landroid/widget/Magnifier$Builder;

    move-result-object p2

    sget-object v3, LxB5;->b:LxB5$a;

    invoke-virtual {v3}, LxB5$a;->a()J

    move-result-wide v3

    cmp-long v3, v0, v3

    if-eqz v3, :cond_1

    const/4 v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    :goto_0
    if-eqz v3, :cond_2

    invoke-static {v0, v1}, LxB5;->i(J)F

    move-result v3

    invoke-static {v3}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v3

    invoke-static {v0, v1}, LxB5;->g(J)F

    move-result v0

    invoke-static {v0}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v0

    invoke-static {p2, v3, v0}, LOV3;->a(Landroid/widget/Magnifier$Builder;II)Landroid/widget/Magnifier$Builder;

    :cond_2
    invoke-static {v2}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-static {p2, v2}, LPV3;->a(Landroid/widget/Magnifier$Builder;F)Landroid/widget/Magnifier$Builder;

    :cond_3
    invoke-static {p3}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_4

    invoke-static {p2, p3}, LQV3;->a(Landroid/widget/Magnifier$Builder;F)Landroid/widget/Magnifier$Builder;

    :cond_4
    invoke-static {p4}, Ljava/lang/Float;->isNaN(F)Z

    move-result p3

    if-nez p3, :cond_5

    invoke-static {p2, p4}, LRV3;->a(Landroid/widget/Magnifier$Builder;F)Landroid/widget/Magnifier$Builder;

    :cond_5
    invoke-virtual {p1}, LaG2;->c()Z

    move-result p1

    invoke-static {p2, p1}, LSV3;->a(Landroid/widget/Magnifier$Builder;Z)Landroid/widget/Magnifier$Builder;

    invoke-static {p2}, LTV3;->a(Landroid/widget/Magnifier$Builder;)Landroid/widget/Magnifier;

    move-result-object p1

    const-string p2, "Builder(view).run {\n    \u2026    build()\n            }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, LYV3$a;

    invoke-direct {p2, p1}, LYV3$a;-><init>(Landroid/widget/Magnifier;)V

    return-object p2
.end method
