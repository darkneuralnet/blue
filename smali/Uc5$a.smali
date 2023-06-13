.class public final LUc5$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LxO2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LUc5;->r(LRm2;Lkotlin/jvm/functions/Function5;FLDB5;LQE0;)LxO2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0007*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J/\u0010\t\u001a\u00020\u0008*\u00020\u00022\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\t\u0010\nJ\"\u0010\u000f\u001a\u00020\r*\u00020\u000b2\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016J\"\u0010\u0011\u001a\u00020\r*\u00020\u000b2\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u00032\u0006\u0010\u0010\u001a\u00020\rH\u0016J\"\u0010\u0012\u001a\u00020\r*\u00020\u000b2\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016J\"\u0010\u0013\u001a\u00020\r*\u00020\u000b2\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u00032\u0006\u0010\u0010\u001a\u00020\rH\u0016\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006\u0014"
    }
    d2 = {
        "Uc5$a",
        "LxO2;",
        "LzO2;",
        "",
        "LvO2;",
        "measurables",
        "Lkz0;",
        "constraints",
        "LyO2;",
        "a",
        "(LzO2;Ljava/util/List;J)LyO2;",
        "LZ62;",
        "LX62;",
        "",
        "height",
        "c",
        "width",
        "e",
        "b",
        "d",
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
.field public final synthetic a:LRm2;

.field public final synthetic b:Lkotlin/jvm/functions/Function5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function5<",
            "Ljava/lang/Integer;",
            "[I",
            "Lpm2;",
            "Lg01;",
            "[I",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic c:F

.field public final synthetic d:LDB5;

.field public final synthetic e:LQE0;


# direct methods
.method public constructor <init>(LRm2;Lkotlin/jvm/functions/Function5;FLDB5;LQE0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LRm2;",
            "Lkotlin/jvm/functions/Function5<",
            "-",
            "Ljava/lang/Integer;",
            "-[I-",
            "Lpm2;",
            "-",
            "Lg01;",
            "-[I",
            "Lkotlin/Unit;",
            ">;F",
            "LDB5;",
            "LQE0;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, LUc5$a;->a:LRm2;

    iput-object p2, p0, LUc5$a;->b:Lkotlin/jvm/functions/Function5;

    iput p3, p0, LUc5$a;->c:F

    iput-object p4, p0, LUc5$a;->d:LDB5;

    iput-object p5, p0, LUc5$a;->e:LQE0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LzO2;Ljava/util/List;J)LyO2;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LzO2;",
            "Ljava/util/List<",
            "+",
            "LvO2;",
            ">;J)",
            "LyO2;"
        }
    .end annotation

    const-string v0, "$this$measure"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "measurables"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    new-array v8, v0, [LOU3;

    new-instance v10, LWc5;

    iget-object v2, p0, LUc5$a;->a:LRm2;

    iget-object v3, p0, LUc5$a;->b:Lkotlin/jvm/functions/Function5;

    iget v4, p0, LUc5$a;->c:F

    iget-object v5, p0, LUc5$a;->d:LDB5;

    iget-object v6, p0, LUc5$a;->e:LQE0;

    const/4 v9, 0x0

    move-object v1, v10

    move-object v7, p2

    invoke-direct/range {v1 .. v9}, LWc5;-><init>(LRm2;Lkotlin/jvm/functions/Function5;FLDB5;LQE0;Ljava/util/List;[LOU3;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v4, 0x0

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v5

    move-object v0, v10

    move-object v1, p1

    move-wide v2, p3

    invoke-virtual/range {v0 .. v5}, LWc5;->e(LzO2;JII)LVc5;

    move-result-object p2

    iget-object p3, p0, LUc5$a;->a:LRm2;

    sget-object p4, LRm2;->b:LRm2;

    if-ne p3, p4, :cond_0

    invoke-virtual {p2}, LVc5;->e()I

    move-result p3

    invoke-virtual {p2}, LVc5;->b()I

    move-result p4

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, LVc5;->b()I

    move-result p3

    invoke-virtual {p2}, LVc5;->e()I

    move-result p4

    :goto_0
    move v1, p3

    move v2, p4

    const/4 v3, 0x0

    new-instance v4, LUc5$a$a;

    invoke-direct {v4, v10, p2, p1}, LUc5$a$a;-><init>(LWc5;LVc5;LzO2;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v6}, LzO2;->Y(LzO2;IILjava/util/Map;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)LyO2;

    move-result-object p1

    return-object p1
.end method

.method public b(LZ62;Ljava/util/List;I)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZ62;",
            "Ljava/util/List<",
            "+",
            "LX62;",
            ">;I)I"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "measurables"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LUc5$a;->a:LRm2;

    invoke-static {v0}, LUc5;->f(LRm2;)Lkotlin/jvm/functions/Function3;

    move-result-object v0

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    iget v1, p0, LUc5$a;->c:F

    invoke-interface {p1, v1}, Lg01;->F0(F)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p2, p3, p1}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    return p1
.end method

.method public c(LZ62;Ljava/util/List;I)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZ62;",
            "Ljava/util/List<",
            "+",
            "LX62;",
            ">;I)I"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "measurables"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LUc5$a;->a:LRm2;

    invoke-static {v0}, LUc5;->h(LRm2;)Lkotlin/jvm/functions/Function3;

    move-result-object v0

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    iget v1, p0, LUc5$a;->c:F

    invoke-interface {p1, v1}, Lg01;->F0(F)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p2, p3, p1}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    return p1
.end method

.method public d(LZ62;Ljava/util/List;I)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZ62;",
            "Ljava/util/List<",
            "+",
            "LX62;",
            ">;I)I"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "measurables"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LUc5$a;->a:LRm2;

    invoke-static {v0}, LUc5;->e(LRm2;)Lkotlin/jvm/functions/Function3;

    move-result-object v0

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    iget v1, p0, LUc5$a;->c:F

    invoke-interface {p1, v1}, Lg01;->F0(F)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p2, p3, p1}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    return p1
.end method

.method public e(LZ62;Ljava/util/List;I)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZ62;",
            "Ljava/util/List<",
            "+",
            "LX62;",
            ">;I)I"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "measurables"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LUc5$a;->a:LRm2;

    invoke-static {v0}, LUc5;->g(LRm2;)Lkotlin/jvm/functions/Function3;

    move-result-object v0

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    iget v1, p0, LUc5$a;->c:F

    invoke-interface {p1, v1}, Lg01;->F0(F)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p2, p3, p1}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    return p1
.end method
