.class public final LNE1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LTl2;

.field public final b:LTl2;

.field public final c:LTl2;

.field public final d:I

.field public final e:Ljava/lang/String;

.field public f:LNE1;


# direct methods
.method public constructor <init>(LNE1;LTl2;LTl2;)V
    .locals 6

    iget-object v3, p1, LNE1;->c:LTl2;

    iget v4, p1, LNE1;->d:I

    iget-object v5, p1, LNE1;->e:Ljava/lang/String;

    move-object v0, p0

    move-object v1, p2

    move-object v2, p3

    invoke-direct/range {v0 .. v5}, LNE1;-><init>(LTl2;LTl2;LTl2;ILjava/lang/String;)V

    iget-object p1, p1, LNE1;->f:LNE1;

    iput-object p1, p0, LNE1;->f:LNE1;

    return-void
.end method

.method public constructor <init>(LTl2;LTl2;LTl2;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LNE1;->a:LTl2;

    iput-object p2, p0, LNE1;->b:LTl2;

    iput-object p3, p0, LNE1;->c:LTl2;

    iput p4, p0, LNE1;->d:I

    iput-object p5, p0, LNE1;->e:Ljava/lang/String;

    return-void
.end method

.method public static a(LNE1;)I
    .locals 1

    const/4 v0, 0x0

    :goto_0
    if-eqz p0, :cond_0

    add-int/lit8 v0, v0, 0x1

    iget-object p0, p0, LNE1;->f:LNE1;

    goto :goto_0

    :cond_0
    return v0
.end method

.method public static b(LNE1;)I
    .locals 0

    invoke-static {p0}, LNE1;->a(LNE1;)I

    move-result p0

    mul-int/lit8 p0, p0, 0x8

    add-int/lit8 p0, p0, 0x2

    return p0
.end method

.method public static c(LNE1;LO70;)V
    .locals 2

    invoke-static {p0}, LNE1;->a(LNE1;)I

    move-result v0

    invoke-virtual {p1, v0}, LO70;->k(I)LO70;

    :goto_0
    if-eqz p0, :cond_0

    iget-object v0, p0, LNE1;->a:LTl2;

    iget v0, v0, LTl2;->d:I

    invoke-virtual {p1, v0}, LO70;->k(I)LO70;

    move-result-object v0

    iget-object v1, p0, LNE1;->b:LTl2;

    iget v1, v1, LTl2;->d:I

    invoke-virtual {v0, v1}, LO70;->k(I)LO70;

    move-result-object v0

    iget-object v1, p0, LNE1;->c:LTl2;

    iget v1, v1, LTl2;->d:I

    invoke-virtual {v0, v1}, LO70;->k(I)LO70;

    move-result-object v0

    iget v1, p0, LNE1;->d:I

    invoke-virtual {v0, v1}, LO70;->k(I)LO70;

    iget-object p0, p0, LNE1;->f:LNE1;

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static d(LNE1;LTl2;LTl2;)LNE1;
    .locals 7

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    iget-object v0, p0, LNE1;->f:LNE1;

    invoke-static {v0, p1, p2}, LNE1;->d(LNE1;LTl2;LTl2;)LNE1;

    move-result-object v0

    iput-object v0, p0, LNE1;->f:LNE1;

    iget-object v1, p0, LNE1;->a:LTl2;

    iget v2, v1, LTl2;->d:I

    iget-object v3, p0, LNE1;->b:LTl2;

    iget v4, v3, LTl2;->d:I

    iget v5, p1, LTl2;->d:I

    if-nez p2, :cond_1

    const v6, 0x7fffffff

    goto :goto_0

    :cond_1
    iget v6, p2, LTl2;->d:I

    :goto_0
    if-ge v5, v4, :cond_6

    if-gt v6, v2, :cond_2

    goto :goto_1

    :cond_2
    if-gt v5, v2, :cond_4

    if-lt v6, v4, :cond_3

    return-object v0

    :cond_3
    new-instance p1, LNE1;

    invoke-direct {p1, p0, p2, v3}, LNE1;-><init>(LNE1;LTl2;LTl2;)V

    return-object p1

    :cond_4
    if-lt v6, v4, :cond_5

    new-instance p2, LNE1;

    invoke-direct {p2, p0, v1, p1}, LNE1;-><init>(LNE1;LTl2;LTl2;)V

    return-object p2

    :cond_5
    new-instance v0, LNE1;

    invoke-direct {v0, p0, p2, v3}, LNE1;-><init>(LNE1;LTl2;LTl2;)V

    iput-object v0, p0, LNE1;->f:LNE1;

    new-instance p2, LNE1;

    iget-object v0, p0, LNE1;->a:LTl2;

    invoke-direct {p2, p0, v0, p1}, LNE1;-><init>(LNE1;LTl2;LTl2;)V

    return-object p2

    :cond_6
    :goto_1
    return-object p0
.end method
