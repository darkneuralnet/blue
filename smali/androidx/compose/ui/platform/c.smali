.class public final Landroidx/compose/ui/platform/c;
.super LO1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/ui/platform/c$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0015\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\rB\t\u0008\u0002\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u001e\u0010\t\u001a\u00020\u00082\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0012\u0010\r\u001a\u0004\u0018\u00010\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001e"
    }
    d2 = {
        "Landroidx/compose/ui/platform/c;",
        "LO1;",
        "",
        "text",
        "Li26;",
        "layoutResult",
        "Lis5;",
        "node",
        "",
        "j",
        "",
        "current",
        "",
        "a",
        "b",
        "lineNumber",
        "LUL4;",
        "direction",
        "i",
        "c",
        "Li26;",
        "d",
        "Lis5;",
        "Landroid/graphics/Rect;",
        "e",
        "Landroid/graphics/Rect;",
        "tempRect",
        "<init>",
        "()V",
        "f",
        "ui_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final f:Landroidx/compose/ui/platform/c$a;

.field public static final g:I

.field public static h:Landroidx/compose/ui/platform/c;

.field public static final i:LUL4;

.field public static final j:LUL4;


# instance fields
.field public c:Li26;

.field public d:Lis5;

.field public e:Landroid/graphics/Rect;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/compose/ui/platform/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/compose/ui/platform/c$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Landroidx/compose/ui/platform/c;->f:Landroidx/compose/ui/platform/c$a;

    const/16 v0, 0x8

    sput v0, Landroidx/compose/ui/platform/c;->g:I

    sget-object v0, LUL4;->c:LUL4;

    sput-object v0, Landroidx/compose/ui/platform/c;->i:LUL4;

    sget-object v0, LUL4;->b:LUL4;

    sput-object v0, Landroidx/compose/ui/platform/c;->j:LUL4;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, LO1;-><init>()V

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Landroidx/compose/ui/platform/c;->e:Landroid/graphics/Rect;

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/platform/c;-><init>()V

    return-void
.end method

.method public static final synthetic g()Landroidx/compose/ui/platform/c;
    .locals 1

    sget-object v0, Landroidx/compose/ui/platform/c;->h:Landroidx/compose/ui/platform/c;

    return-object v0
.end method

.method public static final synthetic h(Landroidx/compose/ui/platform/c;)V
    .locals 0

    sput-object p0, Landroidx/compose/ui/platform/c;->h:Landroidx/compose/ui/platform/c;

    return-void
.end method


# virtual methods
.method public a(I)[I
    .locals 5

    invoke-virtual {p0}, LO1;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    if-gtz v0, :cond_0

    return-object v1

    :cond_0
    invoke-virtual {p0}, LO1;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lt p1, v0, :cond_1

    return-object v1

    :cond_1
    :try_start_0
    iget-object v0, p0, Landroidx/compose/ui/platform/c;->d:Lis5;

    if-nez v0, :cond_2

    const-string v0, "node"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v1

    :cond_2
    invoke-virtual {v0}, Lis5;->f()LOs4;

    move-result-object v0

    invoke-virtual {v0}, LOs4;->h()F

    move-result v0

    invoke-static {v0}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v0
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v2, 0x0

    invoke-static {v2, p1}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result p1

    iget-object v2, p0, Landroidx/compose/ui/platform/c;->c:Li26;

    const-string v3, "layoutResult"

    if-nez v2, :cond_3

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v2, v1

    :cond_3
    invoke-virtual {v2, p1}, Li26;->p(I)I

    move-result v2

    iget-object v4, p0, Landroidx/compose/ui/platform/c;->c:Li26;

    if-nez v4, :cond_4

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v4, v1

    :cond_4
    invoke-virtual {v4, v2}, Li26;->u(I)F

    move-result v2

    int-to-float v0, v0

    add-float/2addr v2, v0

    iget-object v0, p0, Landroidx/compose/ui/platform/c;->c:Li26;

    if-nez v0, :cond_5

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v1

    :cond_5
    iget-object v4, p0, Landroidx/compose/ui/platform/c;->c:Li26;

    if-nez v4, :cond_6

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v4, v1

    :cond_6
    invoke-virtual {v4}, Li26;->m()I

    move-result v4

    add-int/lit8 v4, v4, -0x1

    invoke-virtual {v0, v4}, Li26;->u(I)F

    move-result v0

    cmpg-float v0, v2, v0

    if-gez v0, :cond_8

    iget-object v0, p0, Landroidx/compose/ui/platform/c;->c:Li26;

    if-nez v0, :cond_7

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_0

    :cond_7
    move-object v1, v0

    :goto_0
    invoke-virtual {v1, v2}, Li26;->q(F)I

    move-result v0

    goto :goto_2

    :cond_8
    iget-object v0, p0, Landroidx/compose/ui/platform/c;->c:Li26;

    if-nez v0, :cond_9

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_1

    :cond_9
    move-object v1, v0

    :goto_1
    invoke-virtual {v1}, Li26;->m()I

    move-result v0

    :goto_2
    add-int/lit8 v0, v0, -0x1

    sget-object v1, Landroidx/compose/ui/platform/c;->j:LUL4;

    invoke-virtual {p0, v0, v1}, Landroidx/compose/ui/platform/c;->i(ILUL4;)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, p1, v0}, LO1;->c(II)[I

    move-result-object p1

    return-object p1

    :catch_0
    return-object v1
.end method

.method public b(I)[I
    .locals 5

    invoke-virtual {p0}, LO1;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    if-gtz v0, :cond_0

    return-object v1

    :cond_0
    if-gtz p1, :cond_1

    return-object v1

    :cond_1
    :try_start_0
    iget-object v0, p0, Landroidx/compose/ui/platform/c;->d:Lis5;

    if-nez v0, :cond_2

    const-string v0, "node"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v1

    :cond_2
    invoke-virtual {v0}, Lis5;->f()LOs4;

    move-result-object v0

    invoke-virtual {v0}, LOs4;->h()F

    move-result v0

    invoke-static {v0}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v0
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {p0}, LO1;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    invoke-static {v2, p1}, Lkotlin/ranges/RangesKt;->coerceAtMost(II)I

    move-result p1

    iget-object v2, p0, Landroidx/compose/ui/platform/c;->c:Li26;

    const-string v3, "layoutResult"

    if-nez v2, :cond_3

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v2, v1

    :cond_3
    invoke-virtual {v2, p1}, Li26;->p(I)I

    move-result v2

    iget-object v4, p0, Landroidx/compose/ui/platform/c;->c:Li26;

    if-nez v4, :cond_4

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v4, v1

    :cond_4
    invoke-virtual {v4, v2}, Li26;->u(I)F

    move-result v4

    int-to-float v0, v0

    sub-float/2addr v4, v0

    const/4 v0, 0x0

    cmpl-float v0, v4, v0

    if-lez v0, :cond_6

    iget-object v0, p0, Landroidx/compose/ui/platform/c;->c:Li26;

    if-nez v0, :cond_5

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_0

    :cond_5
    move-object v1, v0

    :goto_0
    invoke-virtual {v1, v4}, Li26;->q(F)I

    move-result v0

    goto :goto_1

    :cond_6
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {p0}, LO1;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-ne p1, v1, :cond_7

    if-ge v0, v2, :cond_7

    add-int/lit8 v0, v0, 0x1

    :cond_7
    sget-object v1, Landroidx/compose/ui/platform/c;->i:LUL4;

    invoke-virtual {p0, v0, v1}, Landroidx/compose/ui/platform/c;->i(ILUL4;)I

    move-result v0

    invoke-virtual {p0, v0, p1}, LO1;->c(II)[I

    move-result-object p1

    return-object p1

    :catch_0
    return-object v1
.end method

.method public final i(ILUL4;)I
    .locals 4

    iget-object v0, p0, Landroidx/compose/ui/platform/c;->c:Li26;

    const-string v1, "layoutResult"

    const/4 v2, 0x0

    if-nez v0, :cond_0

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v2

    :cond_0
    invoke-virtual {v0, p1}, Li26;->t(I)I

    move-result v0

    iget-object v3, p0, Landroidx/compose/ui/platform/c;->c:Li26;

    if-nez v3, :cond_1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v3, v2

    :cond_1
    invoke-virtual {v3, v0}, Li26;->x(I)LUL4;

    move-result-object v0

    if-eq p2, v0, :cond_3

    iget-object p2, p0, Landroidx/compose/ui/platform/c;->c:Li26;

    if-nez p2, :cond_2

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    move-object v2, p2

    :goto_0
    invoke-virtual {v2, p1}, Li26;->t(I)I

    move-result p1

    goto :goto_1

    :cond_3
    iget-object p2, p0, Landroidx/compose/ui/platform/c;->c:Li26;

    if-nez p2, :cond_4

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p2, v2

    :cond_4
    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p2, p1, v0, v1, v2}, Li26;->o(Li26;IZILjava/lang/Object;)I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    :goto_1
    return p1
.end method

.method public final j(Ljava/lang/String;Li26;Lis5;)V
    .locals 1

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "layoutResult"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "node"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, LO1;->f(Ljava/lang/String;)V

    iput-object p2, p0, Landroidx/compose/ui/platform/c;->c:Li26;

    iput-object p3, p0, Landroidx/compose/ui/platform/c;->d:Lis5;

    return-void
.end method
