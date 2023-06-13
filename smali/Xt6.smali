.class public LXt6;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lku6;

.field public static final b:Landroid/util/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Property<",
            "Landroid/view/View;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field public static final c:Landroid/util/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Property<",
            "Landroid/view/View;",
            "Landroid/graphics/Rect;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    new-instance v0, Lju6;

    invoke-direct {v0}, Lju6;-><init>()V

    sput-object v0, LXt6;->a:Lku6;

    goto :goto_0

    :cond_0
    new-instance v0, Liu6;

    invoke-direct {v0}, Liu6;-><init>()V

    sput-object v0, LXt6;->a:Lku6;

    :goto_0
    new-instance v0, LXt6$a;

    const-class v1, Ljava/lang/Float;

    const-string v2, "translationAlpha"

    invoke-direct {v0, v1, v2}, LXt6$a;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    sput-object v0, LXt6;->b:Landroid/util/Property;

    new-instance v0, LXt6$b;

    const-class v1, Landroid/graphics/Rect;

    const-string v2, "clipBounds"

    invoke-direct {v0, v1, v2}, LXt6$b;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    sput-object v0, LXt6;->c:Landroid/util/Property;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/view/View;)V
    .locals 1

    sget-object v0, LXt6;->a:Lku6;

    invoke-virtual {v0, p0}, Lku6;->a(Landroid/view/View;)V

    return-void
.end method

.method public static b(Landroid/view/View;)Lzs6;
    .locals 1

    new-instance v0, Lxs6;

    invoke-direct {v0, p0}, Lxs6;-><init>(Landroid/view/View;)V

    return-object v0
.end method

.method public static c(Landroid/view/View;)F
    .locals 1

    sget-object v0, LXt6;->a:Lku6;

    invoke-virtual {v0, p0}, Lku6;->c(Landroid/view/View;)F

    move-result p0

    return p0
.end method

.method public static d(Landroid/view/View;)LmB6;
    .locals 1

    new-instance v0, LlB6;

    invoke-direct {v0, p0}, LlB6;-><init>(Landroid/view/View;)V

    return-object v0
.end method

.method public static e(Landroid/view/View;)V
    .locals 1

    sget-object v0, LXt6;->a:Lku6;

    invoke-virtual {v0, p0}, Lku6;->d(Landroid/view/View;)V

    return-void
.end method

.method public static f(Landroid/view/View;Landroid/graphics/Matrix;)V
    .locals 1

    sget-object v0, LXt6;->a:Lku6;

    invoke-virtual {v0, p0, p1}, Lku6;->e(Landroid/view/View;Landroid/graphics/Matrix;)V

    return-void
.end method

.method public static g(Landroid/view/View;IIII)V
    .locals 6

    sget-object v0, LXt6;->a:Lku6;

    move-object v1, p0

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    invoke-virtual/range {v0 .. v5}, Lku6;->f(Landroid/view/View;IIII)V

    return-void
.end method

.method public static h(Landroid/view/View;F)V
    .locals 1

    sget-object v0, LXt6;->a:Lku6;

    invoke-virtual {v0, p0, p1}, Lku6;->g(Landroid/view/View;F)V

    return-void
.end method

.method public static i(Landroid/view/View;I)V
    .locals 1

    sget-object v0, LXt6;->a:Lku6;

    invoke-virtual {v0, p0, p1}, Lku6;->h(Landroid/view/View;I)V

    return-void
.end method

.method public static j(Landroid/view/View;Landroid/graphics/Matrix;)V
    .locals 1

    sget-object v0, LXt6;->a:Lku6;

    invoke-virtual {v0, p0, p1}, Lku6;->i(Landroid/view/View;Landroid/graphics/Matrix;)V

    return-void
.end method

.method public static k(Landroid/view/View;Landroid/graphics/Matrix;)V
    .locals 1

    sget-object v0, LXt6;->a:Lku6;

    invoke-virtual {v0, p0, p1}, Lku6;->j(Landroid/view/View;Landroid/graphics/Matrix;)V

    return-void
.end method
