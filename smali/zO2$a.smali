.class public final LzO2$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LyO2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LzO2;->O0(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)LyO2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0008\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0008\u0005*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0008\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008R\u001a\u0010\u000c\u001a\u00020\u00048\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u0006\u001a\u0004\u0008\u000b\u0010\u0008R&\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00040\r8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u000f\u001a\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0013"
    }
    d2 = {
        "zO2$a",
        "LyO2;",
        "",
        "c",
        "",
        "a",
        "I",
        "getWidth",
        "()I",
        "width",
        "b",
        "getHeight",
        "height",
        "",
        "LL9;",
        "Ljava/util/Map;",
        "d",
        "()Ljava/util/Map;",
        "alignmentLines",
        "ui_release"
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
        "SMAP\nMeasureScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MeasureScope.kt\nandroidx/compose/ui/layout/MeasureScope$layout$1\n+ 2 Placeable.kt\nandroidx/compose/ui/layout/Placeable$PlacementScope$Companion\n*L\n1#1,61:1\n360#2,15:62\n*S KotlinDebug\n*F\n+ 1 MeasureScope.kt\nandroidx/compose/ui/layout/MeasureScope$layout$1\n*L\n52#1:62,15\n*E\n"
    }
.end annotation


# instance fields
.field public final a:I

.field public final b:I

.field public final c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "LL9;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic d:I

.field public final synthetic e:LzO2;

.field public final synthetic f:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "LOU3$a;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(IILjava/util/Map;LzO2;Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Ljava/util/Map<",
            "LL9;",
            "Ljava/lang/Integer;",
            ">;",
            "LzO2;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "LOU3$a;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    iput p1, p0, LzO2$a;->d:I

    iput-object p4, p0, LzO2$a;->e:LzO2;

    iput-object p5, p0, LzO2$a;->f:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, LzO2$a;->a:I

    iput p2, p0, LzO2$a;->b:I

    iput-object p3, p0, LzO2$a;->c:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public c()V
    .locals 9

    sget-object v0, LOU3$a;->a:LOU3$a$a;

    iget v1, p0, LzO2$a;->d:I

    iget-object v2, p0, LzO2$a;->e:LzO2;

    invoke-interface {v2}, LZ62;->getLayoutDirection()Lpm2;

    move-result-object v2

    iget-object v3, p0, LzO2$a;->e:LzO2;

    instance-of v4, v3, LSC2;

    if-eqz v4, :cond_0

    check-cast v3, LSC2;

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    iget-object v4, p0, LzO2$a;->f:Lkotlin/jvm/functions/Function1;

    invoke-static {}, LOU3$a;->f()Lnm2;

    move-result-object v5

    invoke-static {v0}, LOU3$a$a;->E(LOU3$a$a;)I

    move-result v6

    invoke-static {v0}, LOU3$a$a;->D(LOU3$a$a;)Lpm2;

    move-result-object v7

    invoke-static {}, LOU3$a;->a()LOm2;

    move-result-object v8

    invoke-static {v1}, LOU3$a;->i(I)V

    invoke-static {v2}, LOU3$a;->h(Lpm2;)V

    invoke-static {v0, v3}, LOU3$a$a;->C(LOU3$a$a;LSC2;)Z

    move-result v1

    invoke-interface {v4, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    if-nez v3, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v3, v1}, LSC2;->z1(Z)V

    :goto_1
    invoke-static {v6}, LOU3$a;->i(I)V

    invoke-static {v7}, LOU3$a;->h(Lpm2;)V

    invoke-static {v5}, LOU3$a;->j(Lnm2;)V

    invoke-static {v8}, LOU3$a;->g(LOm2;)V

    return-void
.end method

.method public d()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "LL9;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LzO2$a;->c:Ljava/util/Map;

    return-object v0
.end method

.method public getHeight()I
    .locals 1

    iget v0, p0, LzO2$a;->b:I

    return v0
.end method

.method public getWidth()I
    .locals 1

    iget v0, p0, LzO2$a;->a:I

    return v0
.end method
