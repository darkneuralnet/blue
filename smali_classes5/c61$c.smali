.class public Lc61$c;
.super Lc61;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc61;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lc61;-><init>()V

    return-void
.end method


# virtual methods
.method public a(IIII)Lc61$g;
    .locals 2

    invoke-virtual {p0, p1, p2, p3, p4}, Lc61$c;->b(IIII)F

    move-result v0

    const/high16 v1, 0x3f800000    # 1.0f

    cmpl-float v0, v0, v1

    if-nez v0, :cond_0

    sget-object p1, Lc61$g;->c:Lc61$g;

    goto :goto_0

    :cond_0
    sget-object v0, Lc61;->c:Lc61;

    invoke-virtual {v0, p1, p2, p3, p4}, Lc61;->a(IIII)Lc61$g;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public b(IIII)F
    .locals 1

    sget-object v0, Lc61;->c:Lc61;

    invoke-virtual {v0, p1, p2, p3, p4}, Lc61;->b(IIII)F

    move-result p1

    const/high16 p2, 0x3f800000    # 1.0f

    invoke-static {p2, p1}, Ljava/lang/Math;->min(FF)F

    move-result p1

    return p1
.end method
