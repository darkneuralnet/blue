.class public final LCl1;
.super LT42;
.source "SourceFile"

# interfaces
.implements LBm2;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0002\u0018\u00002\u00020\u00012\u00020\u0002B0\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0017\u0010\u001d\u001a\u0013\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u0019\u00a2\u0006\u0002\u0008\u001c\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ)\u0010\t\u001a\u00020\u0008*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0013\u0010\u000e\u001a\u00020\r2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\u0008\u0010\u0010\u001a\u00020\u000fH\u0016R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006 "
    }
    d2 = {
        "LCl1;",
        "LBm2;",
        "LT42;",
        "LzO2;",
        "LvO2;",
        "measurable",
        "Lkz0;",
        "constraints",
        "LyO2;",
        "f",
        "(LzO2;LvO2;J)LyO2;",
        "",
        "other",
        "",
        "equals",
        "",
        "hashCode",
        "Lm41;",
        "c",
        "Lm41;",
        "direction",
        "",
        "d",
        "F",
        "fraction",
        "Lkotlin/Function1;",
        "LS42;",
        "",
        "Lkotlin/ExtensionFunctionType;",
        "inspectorInfo",
        "<init>",
        "(Lm41;FLkotlin/jvm/functions/Function1;)V",
        "foundation-layout_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final c:Lm41;

.field public final d:F


# direct methods
.method public constructor <init>(Lm41;FLkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm41;",
            "F",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "LS42;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "direction"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "inspectorInfo"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p3}, LT42;-><init>(Lkotlin/jvm/functions/Function1;)V

    iput-object p1, p0, LCl1;->c:Lm41;

    iput p2, p0, LCl1;->d:F

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, LCl1;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-object v0, p0, LCl1;->c:Lm41;

    check-cast p1, LCl1;

    iget-object v2, p1, LCl1;->c:Lm41;

    if-ne v0, v2, :cond_1

    iget v0, p0, LCl1;->d:F

    iget p1, p1, LCl1;->d:F

    cmpg-float p1, v0, p1

    const/4 v0, 0x1

    if-nez p1, :cond_0

    move p1, v0

    goto :goto_0

    :cond_0
    move p1, v1

    :goto_0
    if-eqz p1, :cond_1

    move v1, v0

    :cond_1
    return v1
.end method

.method public f(LzO2;LvO2;J)LyO2;
    .locals 7

    const-string v0, "$this$measure"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "measurable"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p3, p4}, Lkz0;->j(J)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LCl1;->c:Lm41;

    sget-object v1, Lm41;->b:Lm41;

    if-eq v0, v1, :cond_0

    invoke-static {p3, p4}, Lkz0;->n(J)I

    move-result v0

    int-to-float v0, v0

    iget v1, p0, LCl1;->d:F

    mul-float/2addr v0, v1

    invoke-static {v0}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v0

    invoke-static {p3, p4}, Lkz0;->p(J)I

    move-result v1

    invoke-static {p3, p4}, Lkz0;->n(J)I

    move-result v2

    invoke-static {v0, v1, v2}, Lkotlin/ranges/RangesKt;->coerceIn(III)I

    move-result v0

    move v1, v0

    goto :goto_0

    :cond_0
    invoke-static {p3, p4}, Lkz0;->p(J)I

    move-result v0

    invoke-static {p3, p4}, Lkz0;->n(J)I

    move-result v1

    :goto_0
    invoke-static {p3, p4}, Lkz0;->i(J)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, p0, LCl1;->c:Lm41;

    sget-object v3, Lm41;->c:Lm41;

    if-eq v2, v3, :cond_1

    invoke-static {p3, p4}, Lkz0;->m(J)I

    move-result v2

    int-to-float v2, v2

    iget v3, p0, LCl1;->d:F

    mul-float/2addr v2, v3

    invoke-static {v2}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v2

    invoke-static {p3, p4}, Lkz0;->o(J)I

    move-result v3

    invoke-static {p3, p4}, Lkz0;->m(J)I

    move-result p3

    invoke-static {v2, v3, p3}, Lkotlin/ranges/RangesKt;->coerceIn(III)I

    move-result p3

    move p4, p3

    goto :goto_1

    :cond_1
    invoke-static {p3, p4}, Lkz0;->o(J)I

    move-result v2

    invoke-static {p3, p4}, Lkz0;->m(J)I

    move-result p3

    move p4, p3

    move p3, v2

    :goto_1
    invoke-static {v0, v1, p3, p4}, Lnz0;->a(IIII)J

    move-result-wide p3

    invoke-interface {p2, p3, p4}, LvO2;->P0(J)LOU3;

    move-result-object p2

    invoke-virtual {p2}, LOU3;->i1()I

    move-result v1

    invoke-virtual {p2}, LOU3;->d1()I

    move-result v2

    const/4 v3, 0x0

    new-instance v4, LCl1$a;

    invoke-direct {v4, p2}, LCl1$a;-><init>(LOU3;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v6}, LzO2;->Y(LzO2;IILjava/util/Map;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)LyO2;

    move-result-object p1

    return-object p1
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, LCl1;->c:Lm41;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, LCl1;->d:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method
