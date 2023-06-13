.class public final LgM4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lew1;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0007\u0018\u00002\u00020\u0001B<\u0008\u0000\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u000f\u0012\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u0014\u0012\u0008\u0008\u0003\u0010\u001a\u001a\u00020\u0016\u0012\u0008\u0008\u0002\u0010 \u001a\u00020\u001b\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008!\u0010\"J\u0013\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\u0008\u0010\u0007\u001a\u00020\u0006H\u0016J\u0008\u0010\t\u001a\u00020\u0008H\u0016R\u0017\u0010\u000e\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\u000c\u0010\rR\u001a\u0010\u0013\u001a\u00020\u000f8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u0011\u001a\u0004\u0008\n\u0010\u0012R#\u0010\u0015\u001a\u00020\u00148\u0016X\u0096\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\u000b\u001a\u0004\u0008\u0010\u0010\rR\u0017\u0010\u001a\u001a\u00020\u00168\u0007\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0017\u0010\u0019R)\u0010 \u001a\u00020\u001b8WX\u0097\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0012\n\u0004\u0008\u001c\u0010\u000b\u0012\u0004\u0008\u001e\u0010\u001f\u001a\u0004\u0008\u001d\u0010\r\u0082\u0002\u000f\n\u0002\u0008\u0019\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006#"
    }
    d2 = {
        "LgM4;",
        "Lew1;",
        "",
        "other",
        "",
        "equals",
        "",
        "hashCode",
        "",
        "toString",
        "b",
        "I",
        "d",
        "()I",
        "resId",
        "LJw1;",
        "c",
        "LJw1;",
        "()LJw1;",
        "weight",
        "LEw1;",
        "style",
        "LIw1;",
        "e",
        "LIw1;",
        "()LIw1;",
        "variationSettings",
        "Luw1;",
        "f",
        "a",
        "getLoadingStrategy-PKNRLFQ$annotations",
        "()V",
        "loadingStrategy",
        "<init>",
        "(ILJw1;ILIw1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V",
        "ui-text_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final b:I

.field public final c:LJw1;

.field public final d:I

.field public final e:LIw1;

.field public final f:I


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(ILJw1;ILIw1;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, LgM4;->b:I

    iput-object p2, p0, LgM4;->c:LJw1;

    iput p3, p0, LgM4;->d:I

    iput-object p4, p0, LgM4;->e:LIw1;

    iput p5, p0, LgM4;->f:I

    return-void
.end method

.method public synthetic constructor <init>(ILJw1;ILIw1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct/range {p0 .. p5}, LgM4;-><init>(ILJw1;ILIw1;I)V

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, LgM4;->f:I

    return v0
.end method

.method public b()LJw1;
    .locals 1

    iget-object v0, p0, LgM4;->c:LJw1;

    return-object v0
.end method

.method public c()I
    .locals 1

    iget v0, p0, LgM4;->d:I

    return v0
.end method

.method public final d()I
    .locals 1

    iget v0, p0, LgM4;->b:I

    return v0
.end method

.method public final e()LIw1;
    .locals 1

    iget-object v0, p0, LgM4;->e:LIw1;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LgM4;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    iget v1, p0, LgM4;->b:I

    check-cast p1, LgM4;

    iget v3, p1, LgM4;->b:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    invoke-virtual {p0}, LgM4;->b()LJw1;

    move-result-object v1

    invoke-virtual {p1}, LgM4;->b()LJw1;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    invoke-virtual {p0}, LgM4;->c()I

    move-result v1

    invoke-virtual {p1}, LgM4;->c()I

    move-result v3

    invoke-static {v1, v3}, LEw1;->f(II)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, LgM4;->e:LIw1;

    iget-object v3, p1, LgM4;->e:LIw1;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    invoke-virtual {p0}, LgM4;->a()I

    move-result v1

    invoke-virtual {p1}, LgM4;->a()I

    move-result p1

    invoke-static {v1, p1}, Luw1;->e(II)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, LgM4;->b:I

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, LgM4;->b()LJw1;

    move-result-object v1

    invoke-virtual {v1}, LJw1;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, LgM4;->c()I

    move-result v1

    invoke-static {v1}, LEw1;->g(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, LgM4;->a()I

    move-result v1

    invoke-static {v1}, Luw1;->f(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LgM4;->e:LIw1;

    invoke-virtual {v1}, LIw1;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ResourceFont(resId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LgM4;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", weight="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LgM4;->b()LJw1;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", style="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LgM4;->c()I

    move-result v1

    invoke-static {v1}, LEw1;->h(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", loadingStrategy="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LgM4;->a()I

    move-result v1

    invoke-static {v1}, Luw1;->g(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
