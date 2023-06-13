.class public LQC0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(FFLvy5;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public b(Lvy5;FFF)V
    .locals 0

    invoke-virtual {p0, p2, p3, p1}, LQC0;->a(FFLvy5;)V

    return-void
.end method

.method public c(Lvy5;FFLandroid/graphics/RectF;LNC0;)V
    .locals 0

    invoke-interface {p5, p4}, LNC0;->a(Landroid/graphics/RectF;)F

    move-result p4

    invoke-virtual {p0, p1, p2, p3, p4}, LQC0;->b(Lvy5;FFF)V

    return-void
.end method
