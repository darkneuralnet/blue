.class public final Lxm0;
.super LnE3;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u0018\u001a\u00020\u0013\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008!\u0010\"J\u000c\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0014J\u0010\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0014J\u0012\u0010\u000b\u001a\u00020\u00072\u0008\u0010\n\u001a\u0004\u0018\u00010\tH\u0014J\u0013\u0010\u000e\u001a\u00020\u00072\u0008\u0010\r\u001a\u0004\u0018\u00010\u000cH\u0096\u0002J\u0008\u0010\u0010\u001a\u00020\u000fH\u0016J\u0008\u0010\u0012\u001a\u00020\u0011H\u0016R \u0010\u0018\u001a\u00020\u00138\u0006\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001cR#\u0010 \u001a\u00020\u001d8\u0016X\u0096\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u0015\u001a\u0004\u0008\u001f\u0010\u0017\u0082\u0002\u000f\n\u0002\u0008\u0019\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006#"
    }
    d2 = {
        "Lxm0;",
        "LnE3;",
        "LI61;",
        "",
        "onDraw",
        "",
        "alpha",
        "",
        "applyAlpha",
        "Lsm0;",
        "colorFilter",
        "applyColorFilter",
        "",
        "other",
        "equals",
        "",
        "hashCode",
        "",
        "toString",
        "Lpm0;",
        "b",
        "J",
        "getColor-0d7_KjU",
        "()J",
        "color",
        "c",
        "F",
        "d",
        "Lsm0;",
        "LxB5;",
        "e",
        "getIntrinsicSize-NH-jbRc",
        "intrinsicSize",
        "<init>",
        "(JLkotlin/jvm/internal/DefaultConstructorMarker;)V",
        "ui-graphics_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final b:J

.field public c:F

.field public d:Lsm0;

.field public final e:J


# direct methods
.method public constructor <init>(J)V
    .locals 0

    invoke-direct {p0}, LnE3;-><init>()V

    iput-wide p1, p0, Lxm0;->b:J

    const/high16 p1, 0x3f800000    # 1.0f

    iput p1, p0, Lxm0;->c:F

    sget-object p1, LxB5;->b:LxB5$a;

    invoke-virtual {p1}, LxB5$a;->a()J

    move-result-wide p1

    iput-wide p1, p0, Lxm0;->e:J

    return-void
.end method

.method public synthetic constructor <init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lxm0;-><init>(J)V

    return-void
.end method


# virtual methods
.method public applyAlpha(F)Z
    .locals 0

    iput p1, p0, Lxm0;->c:F

    const/4 p1, 0x1

    return p1
.end method

.method public applyColorFilter(Lsm0;)Z
    .locals 0

    iput-object p1, p0, Lxm0;->d:Lsm0;

    const/4 p1, 0x1

    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lxm0;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    iget-wide v3, p0, Lxm0;->b:J

    check-cast p1, Lxm0;

    iget-wide v5, p1, Lxm0;->b:J

    invoke-static {v3, v4, v5, v6}, Lpm0;->o(JJ)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public getIntrinsicSize-NH-jbRc()J
    .locals 2

    iget-wide v0, p0, Lxm0;->e:J

    return-wide v0
.end method

.method public hashCode()I
    .locals 2

    iget-wide v0, p0, Lxm0;->b:J

    invoke-static {v0, v1}, Lpm0;->u(J)I

    move-result v0

    return v0
.end method

.method public onDraw(LI61;)V
    .locals 14

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-wide v2, p0, Lxm0;->b:J

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    iget v8, p0, Lxm0;->c:F

    const/4 v9, 0x0

    iget-object v10, p0, Lxm0;->d:Lsm0;

    const/4 v11, 0x0

    const/16 v12, 0x56

    const/4 v13, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v13}, LI61;->z0(LI61;JJJFLJ61;Lsm0;IILjava/lang/Object;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ColorPainter(color="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lxm0;->b:J

    invoke-static {v1, v2}, Lpm0;->v(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
