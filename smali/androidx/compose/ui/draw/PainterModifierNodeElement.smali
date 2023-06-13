.class final Landroidx/compose/ui/draw/PainterModifierNodeElement;
.super LrV2;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "LrV2<",
        "LoE3;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0007\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0083\u0008\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B9\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\u0006\u0010\u0018\u001a\u00020\u000c\u0012\u0006\u0010\u001e\u001a\u00020\u0019\u0012\u0006\u0010$\u001a\u00020\u001f\u0012\u0006\u0010*\u001a\u00020%\u0012\u0008\u00100\u001a\u0004\u0018\u00010+\u00a2\u0006\u0004\u00082\u00103J\u0008\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\t\u0010\u0007\u001a\u00020\u0006H\u00d6\u0001J\t\u0010\t\u001a\u00020\u0008H\u00d6\u0001J\u0013\u0010\r\u001a\u00020\u000c2\u0008\u0010\u000b\u001a\u0004\u0018\u00010\nH\u00d6\u0003R\u0017\u0010\u0013\u001a\u00020\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0012R\u0017\u0010\u0018\u001a\u00020\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017R\u0017\u0010\u001e\u001a\u00020\u00198\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001b\u001a\u0004\u0008\u001c\u0010\u001dR\u0017\u0010$\u001a\u00020\u001f8\u0006\u00a2\u0006\u000c\n\u0004\u0008 \u0010!\u001a\u0004\u0008\"\u0010#R\u0017\u0010*\u001a\u00020%8\u0006\u00a2\u0006\u000c\n\u0004\u0008&\u0010\'\u001a\u0004\u0008(\u0010)R\u0019\u00100\u001a\u0004\u0018\u00010+8\u0006\u00a2\u0006\u000c\n\u0004\u0008,\u0010-\u001a\u0004\u0008.\u0010/R\u0014\u00101\u001a\u00020\u000c8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000f\u0010\u0017\u00a8\u00064"
    }
    d2 = {
        "Landroidx/compose/ui/draw/PainterModifierNodeElement;",
        "LrV2;",
        "LoE3;",
        "h",
        "node",
        "j",
        "",
        "toString",
        "",
        "hashCode",
        "",
        "other",
        "",
        "equals",
        "LnE3;",
        "b",
        "LnE3;",
        "getPainter",
        "()LnE3;",
        "painter",
        "c",
        "Z",
        "getSizeToIntrinsics",
        "()Z",
        "sizeToIntrinsics",
        "LK9;",
        "d",
        "LK9;",
        "getAlignment",
        "()LK9;",
        "alignment",
        "LBA0;",
        "e",
        "LBA0;",
        "getContentScale",
        "()LBA0;",
        "contentScale",
        "",
        "f",
        "F",
        "getAlpha",
        "()F",
        "alpha",
        "Lsm0;",
        "g",
        "Lsm0;",
        "getColorFilter",
        "()Lsm0;",
        "colorFilter",
        "autoInvalidate",
        "<init>",
        "(LnE3;ZLK9;LBA0;FLsm0;)V",
        "ui_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final b:LnE3;

.field public final c:Z

.field public final d:LK9;

.field public final e:LBA0;

.field public final f:F

.field public final g:Lsm0;


# direct methods
.method public constructor <init>(LnE3;ZLK9;LBA0;FLsm0;)V
    .locals 1

    const-string v0, "painter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "alignment"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "contentScale"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LrV2;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/draw/PainterModifierNodeElement;->b:LnE3;

    iput-boolean p2, p0, Landroidx/compose/ui/draw/PainterModifierNodeElement;->c:Z

    iput-object p3, p0, Landroidx/compose/ui/draw/PainterModifierNodeElement;->d:LK9;

    iput-object p4, p0, Landroidx/compose/ui/draw/PainterModifierNodeElement;->e:LBA0;

    iput p5, p0, Landroidx/compose/ui/draw/PainterModifierNodeElement;->f:F

    iput-object p6, p0, Landroidx/compose/ui/draw/PainterModifierNodeElement;->g:Lsm0;

    return-void
.end method


# virtual methods
.method public bridge synthetic a()LgV2$c;
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/ui/draw/PainterModifierNodeElement;->h()LoE3;

    move-result-object v0

    return-object v0
.end method

.method public b()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Landroidx/compose/ui/draw/PainterModifierNodeElement;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Landroidx/compose/ui/draw/PainterModifierNodeElement;

    iget-object v1, p0, Landroidx/compose/ui/draw/PainterModifierNodeElement;->b:LnE3;

    iget-object v3, p1, Landroidx/compose/ui/draw/PainterModifierNodeElement;->b:LnE3;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Landroidx/compose/ui/draw/PainterModifierNodeElement;->c:Z

    iget-boolean v3, p1, Landroidx/compose/ui/draw/PainterModifierNodeElement;->c:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Landroidx/compose/ui/draw/PainterModifierNodeElement;->d:LK9;

    iget-object v3, p1, Landroidx/compose/ui/draw/PainterModifierNodeElement;->d:LK9;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Landroidx/compose/ui/draw/PainterModifierNodeElement;->e:LBA0;

    iget-object v3, p1, Landroidx/compose/ui/draw/PainterModifierNodeElement;->e:LBA0;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget v1, p0, Landroidx/compose/ui/draw/PainterModifierNodeElement;->f:F

    iget v3, p1, Landroidx/compose/ui/draw/PainterModifierNodeElement;->f:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Landroidx/compose/ui/draw/PainterModifierNodeElement;->g:Lsm0;

    iget-object p1, p1, Landroidx/compose/ui/draw/PainterModifierNodeElement;->g:Lsm0;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public bridge synthetic g(LgV2$c;)LgV2$c;
    .locals 0

    check-cast p1, LoE3;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/draw/PainterModifierNodeElement;->j(LoE3;)LoE3;

    move-result-object p1

    return-object p1
.end method

.method public h()LoE3;
    .locals 8

    new-instance v7, LoE3;

    iget-object v1, p0, Landroidx/compose/ui/draw/PainterModifierNodeElement;->b:LnE3;

    iget-boolean v2, p0, Landroidx/compose/ui/draw/PainterModifierNodeElement;->c:Z

    iget-object v3, p0, Landroidx/compose/ui/draw/PainterModifierNodeElement;->d:LK9;

    iget-object v4, p0, Landroidx/compose/ui/draw/PainterModifierNodeElement;->e:LBA0;

    iget v5, p0, Landroidx/compose/ui/draw/PainterModifierNodeElement;->f:F

    iget-object v6, p0, Landroidx/compose/ui/draw/PainterModifierNodeElement;->g:Lsm0;

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, LoE3;-><init>(LnE3;ZLK9;LBA0;FLsm0;)V

    return-object v7
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Landroidx/compose/ui/draw/PainterModifierNodeElement;->b:LnE3;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Landroidx/compose/ui/draw/PainterModifierNodeElement;->c:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    :cond_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Landroidx/compose/ui/draw/PainterModifierNodeElement;->d:LK9;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Landroidx/compose/ui/draw/PainterModifierNodeElement;->e:LBA0;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Landroidx/compose/ui/draw/PainterModifierNodeElement;->f:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Landroidx/compose/ui/draw/PainterModifierNodeElement;->g:Lsm0;

    if-nez v1, :cond_1

    const/4 v1, 0x0

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public j(LoE3;)LoE3;
    .locals 4

    const-string v0, "node"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LoE3;->g0()Z

    move-result v0

    iget-boolean v1, p0, Landroidx/compose/ui/draw/PainterModifierNodeElement;->c:Z

    if-ne v0, v1, :cond_1

    if-eqz v1, :cond_0

    invoke-virtual {p1}, LoE3;->f0()LnE3;

    move-result-object v0

    invoke-virtual {v0}, LnE3;->getIntrinsicSize-NH-jbRc()J

    move-result-wide v0

    iget-object v2, p0, Landroidx/compose/ui/draw/PainterModifierNodeElement;->b:LnE3;

    invoke-virtual {v2}, LnE3;->getIntrinsicSize-NH-jbRc()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, LxB5;->f(JJ)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    iget-object v1, p0, Landroidx/compose/ui/draw/PainterModifierNodeElement;->b:LnE3;

    invoke-virtual {p1, v1}, LoE3;->p0(LnE3;)V

    iget-boolean v1, p0, Landroidx/compose/ui/draw/PainterModifierNodeElement;->c:Z

    invoke-virtual {p1, v1}, LoE3;->q0(Z)V

    iget-object v1, p0, Landroidx/compose/ui/draw/PainterModifierNodeElement;->d:LK9;

    invoke-virtual {p1, v1}, LoE3;->l0(LK9;)V

    iget-object v1, p0, Landroidx/compose/ui/draw/PainterModifierNodeElement;->e:LBA0;

    invoke-virtual {p1, v1}, LoE3;->o0(LBA0;)V

    iget v1, p0, Landroidx/compose/ui/draw/PainterModifierNodeElement;->f:F

    invoke-virtual {p1, v1}, LoE3;->m0(F)V

    iget-object v1, p0, Landroidx/compose/ui/draw/PainterModifierNodeElement;->g:Lsm0;

    invoke-virtual {p1, v1}, LoE3;->n0(Lsm0;)V

    if-eqz v0, :cond_2

    invoke-static {p1}, LGm2;->b(LDm2;)V

    :cond_2
    invoke-static {p1}, LF61;->a(LE61;)V

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "PainterModifierNodeElement(painter="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/compose/ui/draw/PainterModifierNodeElement;->b:LnE3;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", sizeToIntrinsics="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Landroidx/compose/ui/draw/PainterModifierNodeElement;->c:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", alignment="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/compose/ui/draw/PainterModifierNodeElement;->d:LK9;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", contentScale="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/compose/ui/draw/PainterModifierNodeElement;->e:LBA0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", alpha="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroidx/compose/ui/draw/PainterModifierNodeElement;->f:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", colorFilter="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/compose/ui/draw/PainterModifierNodeElement;->g:Lsm0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
