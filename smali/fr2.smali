.class public final Lfr2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lfr2$a;,
        Lfr2$b;,
        Lfr2$c;,
        Lfr2$d;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0087@\u0018\u0000 \u001b2\u00020\u0001:\u0004\u000c\u001b\u001a\u0018B$\u0008\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0012\u0012\u0006\u0010\u0017\u001a\u00020\u0015\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0018\u0010\u0019B\u0014\u0008\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u001a\u0010\u0007J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00058\u0000X\u0080\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\rR\u001a\u0010\u0011\u001a\u00020\u000f8F\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0006\u001a\u0004\u0008\u0010\u0010\u0007R\u001a\u0010\u0014\u001a\u00020\u00128F\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0006\u001a\u0004\u0008\u0013\u0010\u0007R\u001a\u0010\u0017\u001a\u00020\u00158F\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0006\u001a\u0004\u0008\u0016\u0010\u0007\u0088\u0001\u000e\u0092\u0001\u00020\u0005\u00f8\u0001\u0000\u0082\u0002\u000f\n\u0002\u0008\u0019\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006\u001c"
    }
    d2 = {
        "Lfr2;",
        "",
        "",
        "j",
        "(I)Ljava/lang/String;",
        "",
        "i",
        "(I)I",
        "other",
        "",
        "e",
        "(ILjava/lang/Object;)Z",
        "a",
        "I",
        "mask",
        "Lfr2$b;",
        "f",
        "strategy",
        "Lfr2$c;",
        "g",
        "strictness",
        "Lfr2$d;",
        "h",
        "wordBreak",
        "d",
        "(III)I",
        "c",
        "b",
        "ui-text_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/jvm/JvmInline;
.end annotation


# static fields
.field public static final b:Lfr2$a;

.field public static final c:I

.field public static final d:I

.field public static final e:I


# instance fields
.field public final a:I


# direct methods
.method public static constructor <clinit>()V
    .locals 6

    new-instance v0, Lfr2$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lfr2$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lfr2;->b:Lfr2$a;

    sget-object v0, Lfr2$b;->b:Lfr2$b$a;

    invoke-virtual {v0}, Lfr2$b$a;->c()I

    move-result v1

    sget-object v2, Lfr2$c;->b:Lfr2$c$a;

    invoke-virtual {v2}, Lfr2$c$a;->c()I

    move-result v3

    sget-object v4, Lfr2$d;->b:Lfr2$d$a;

    invoke-virtual {v4}, Lfr2$d$a;->a()I

    move-result v5

    invoke-static {v1, v3, v5}, Lfr2;->d(III)I

    move-result v1

    sput v1, Lfr2;->c:I

    invoke-virtual {v0}, Lfr2$b$a;->a()I

    move-result v1

    invoke-virtual {v2}, Lfr2$c$a;->b()I

    move-result v3

    invoke-virtual {v4}, Lfr2$d$a;->b()I

    move-result v5

    invoke-static {v1, v3, v5}, Lfr2;->d(III)I

    move-result v1

    sput v1, Lfr2;->d:I

    invoke-virtual {v0}, Lfr2$b$a;->b()I

    move-result v0

    invoke-virtual {v2}, Lfr2$c$a;->d()I

    move-result v1

    invoke-virtual {v4}, Lfr2$d$a;->a()I

    move-result v2

    invoke-static {v0, v1, v2}, Lfr2;->d(III)I

    move-result v0

    sput v0, Lfr2;->e:I

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lfr2;->a:I

    return-void
.end method

.method public static final synthetic a()I
    .locals 1

    sget v0, Lfr2;->c:I

    return v0
.end method

.method public static final synthetic b(I)Lfr2;
    .locals 1

    new-instance v0, Lfr2;

    invoke-direct {v0, p0}, Lfr2;-><init>(I)V

    return-object v0
.end method

.method public static c(I)I
    .locals 0

    return p0
.end method

.method public static d(III)I
    .locals 0

    invoke-static {p0, p1, p2}, Lgr2;->a(III)I

    move-result p0

    invoke-static {p0}, Lfr2;->c(I)I

    move-result p0

    return p0
.end method

.method public static e(ILjava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Lfr2;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lfr2;

    invoke-virtual {p1}, Lfr2;->k()I

    move-result p1

    if-eq p0, p1, :cond_1

    return v1

    :cond_1
    const/4 p0, 0x1

    return p0
.end method

.method public static final f(I)I
    .locals 0

    invoke-static {p0}, Lgr2;->b(I)I

    move-result p0

    invoke-static {p0}, Lfr2$b;->e(I)I

    move-result p0

    return p0
.end method

.method public static final g(I)I
    .locals 0

    invoke-static {p0}, Lgr2;->c(I)I

    move-result p0

    invoke-static {p0}, Lfr2$c;->f(I)I

    move-result p0

    return p0
.end method

.method public static final h(I)I
    .locals 0

    invoke-static {p0}, Lgr2;->d(I)I

    move-result p0

    invoke-static {p0}, Lfr2$d;->d(I)I

    move-result p0

    return p0
.end method

.method public static i(I)I
    .locals 0

    invoke-static {p0}, Ljava/lang/Integer;->hashCode(I)I

    move-result p0

    return p0
.end method

.method public static j(I)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "LineBreak(strategy="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Lfr2;->f(I)I

    move-result v1

    invoke-static {v1}, Lfr2$b;->i(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", strictness="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Lfr2;->g(I)I

    move-result v1

    invoke-static {v1}, Lfr2$c;->j(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", wordBreak="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Lfr2;->h(I)I

    move-result p0

    invoke-static {p0}, Lfr2$d;->h(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 p0, 0x29

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    iget v0, p0, Lfr2;->a:I

    invoke-static {v0, p1}, Lfr2;->e(ILjava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public hashCode()I
    .locals 1

    iget v0, p0, Lfr2;->a:I

    invoke-static {v0}, Lfr2;->i(I)I

    move-result v0

    return v0
.end method

.method public final synthetic k()I
    .locals 1

    iget v0, p0, Lfr2;->a:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget v0, p0, Lfr2;->a:I

    invoke-static {v0}, Lfr2;->j(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
