.class public final LIf;
.super LHf;
.source "SourceFile"


# instance fields
.field public final c:LzX5;

.field public final d:Z

.field public final e:LO70;

.field public final f:I

.field public g:I

.field public final h:LIf;

.field public i:LIf;


# direct methods
.method public constructor <init>(LzX5;ZLO70;LIf;)V
    .locals 1

    const/high16 v0, 0x90000

    invoke-direct {p0, v0}, LHf;-><init>(I)V

    iput-object p1, p0, LIf;->c:LzX5;

    iput-boolean p2, p0, LIf;->d:Z

    iput-object p3, p0, LIf;->e:LO70;

    iget p1, p3, LO70;->b:I

    if-nez p1, :cond_0

    const/4 p1, -0x1

    goto :goto_0

    :cond_0
    add-int/lit8 p1, p1, -0x2

    :goto_0
    iput p1, p0, LIf;->f:I

    iput-object p4, p0, LIf;->h:LIf;

    if-eqz p4, :cond_1

    iput-object p0, p4, LIf;->i:LIf;

    :cond_1
    return-void
.end method

.method public static f(LIf;LIf;LIf;LIf;)I
    .locals 2

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    const-string v1, "RuntimeVisibleAnnotations"

    invoke-virtual {p0, v1}, LIf;->g(Ljava/lang/String;)I

    move-result p0

    add-int/2addr v0, p0

    :cond_0
    if-eqz p1, :cond_1

    const-string p0, "RuntimeInvisibleAnnotations"

    invoke-virtual {p1, p0}, LIf;->g(Ljava/lang/String;)I

    move-result p0

    add-int/2addr v0, p0

    :cond_1
    if-eqz p2, :cond_2

    const-string p0, "RuntimeVisibleTypeAnnotations"

    invoke-virtual {p2, p0}, LIf;->g(Ljava/lang/String;)I

    move-result p0

    add-int/2addr v0, p0

    :cond_2
    if-eqz p3, :cond_3

    const-string p0, "RuntimeInvisibleTypeAnnotations"

    invoke-virtual {p3, p0}, LIf;->g(Ljava/lang/String;)I

    move-result p0

    add-int/2addr v0, p0

    :cond_3
    return v0
.end method

.method public static h(Ljava/lang/String;[LIf;I)I
    .locals 4

    mul-int/lit8 v0, p2, 0x2

    add-int/lit8 v0, v0, 0x7

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, p2, :cond_1

    aget-object v3, p1, v2

    if-nez v3, :cond_0

    move v3, v1

    goto :goto_1

    :cond_0
    invoke-virtual {v3, p0}, LIf;->g(Ljava/lang/String;)I

    move-result v3

    add-int/lit8 v3, v3, -0x8

    :goto_1
    add-int/2addr v0, v3

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return v0
.end method

.method public static i(LzX5;ILDb6;Ljava/lang/String;LIf;)LIf;
    .locals 1

    new-instance v0, LO70;

    invoke-direct {v0}, LO70;-><init>()V

    invoke-static {p1, v0}, LEb6;->a(ILO70;)V

    invoke-static {p2, v0}, LDb6;->d(LDb6;LO70;)V

    invoke-virtual {p0, p3}, LzX5;->D(Ljava/lang/String;)I

    move-result p1

    invoke-virtual {v0, p1}, LO70;->k(I)LO70;

    move-result-object p1

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, LO70;->k(I)LO70;

    new-instance p1, LIf;

    const/4 p2, 0x1

    invoke-direct {p1, p0, p2, v0, p4}, LIf;-><init>(LzX5;ZLO70;LIf;)V

    return-object p1
.end method

.method public static j(LzX5;Ljava/lang/String;LIf;)LIf;
    .locals 2

    new-instance v0, LO70;

    invoke-direct {v0}, LO70;-><init>()V

    invoke-virtual {p0, p1}, LzX5;->D(Ljava/lang/String;)I

    move-result p1

    invoke-virtual {v0, p1}, LO70;->k(I)LO70;

    move-result-object p1

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, LO70;->k(I)LO70;

    new-instance p1, LIf;

    const/4 v1, 0x1

    invoke-direct {p1, p0, v1, v0, p2}, LIf;-><init>(LzX5;ZLO70;LIf;)V

    return-object p1
.end method

.method public static l(LzX5;LIf;LIf;LIf;LIf;LO70;)V
    .locals 1

    if-eqz p1, :cond_0

    const-string v0, "RuntimeVisibleAnnotations"

    invoke-virtual {p0, v0}, LzX5;->D(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p1, v0, p5}, LIf;->k(ILO70;)V

    :cond_0
    if-eqz p2, :cond_1

    const-string p1, "RuntimeInvisibleAnnotations"

    invoke-virtual {p0, p1}, LzX5;->D(Ljava/lang/String;)I

    move-result p1

    invoke-virtual {p2, p1, p5}, LIf;->k(ILO70;)V

    :cond_1
    if-eqz p3, :cond_2

    const-string p1, "RuntimeVisibleTypeAnnotations"

    invoke-virtual {p0, p1}, LzX5;->D(Ljava/lang/String;)I

    move-result p1

    invoke-virtual {p3, p1, p5}, LIf;->k(ILO70;)V

    :cond_2
    if-eqz p4, :cond_3

    const-string p1, "RuntimeInvisibleTypeAnnotations"

    invoke-virtual {p0, p1}, LzX5;->D(Ljava/lang/String;)I

    move-result p0

    invoke-virtual {p4, p0, p5}, LIf;->k(ILO70;)V

    :cond_3
    return-void
.end method

.method public static m(I[LIf;ILO70;)V
    .locals 6

    mul-int/lit8 v0, p2, 0x2

    add-int/lit8 v0, v0, 0x1

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    const/4 v3, 0x0

    if-ge v2, p2, :cond_1

    aget-object v4, p1, v2

    if-nez v4, :cond_0

    move v3, v1

    goto :goto_1

    :cond_0
    invoke-virtual {v4, v3}, LIf;->g(Ljava/lang/String;)I

    move-result v3

    add-int/lit8 v3, v3, -0x8

    :goto_1
    add-int/2addr v0, v3

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {p3, p0}, LO70;->k(I)LO70;

    invoke-virtual {p3, v0}, LO70;->i(I)LO70;

    invoke-virtual {p3, p2}, LO70;->g(I)LO70;

    move p0, v1

    :goto_2
    if-ge p0, p2, :cond_4

    aget-object v0, p1, p0

    move v2, v1

    move-object v4, v3

    :goto_3
    if-eqz v0, :cond_2

    invoke-virtual {v0}, LIf;->d()V

    add-int/lit8 v2, v2, 0x1

    iget-object v4, v0, LIf;->h:LIf;

    move-object v5, v4

    move-object v4, v0

    move-object v0, v5

    goto :goto_3

    :cond_2
    invoke-virtual {p3, v2}, LO70;->k(I)LO70;

    :goto_4
    if-eqz v4, :cond_3

    iget-object v0, v4, LIf;->e:LO70;

    iget-object v2, v0, LO70;->a:[B

    iget v0, v0, LO70;->b:I

    invoke-virtual {p3, v2, v1, v0}, LO70;->h([BII)LO70;

    iget-object v4, v4, LIf;->i:LIf;

    goto :goto_4

    :cond_3
    add-int/lit8 p0, p0, 0x1

    goto :goto_2

    :cond_4
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 6

    iget v0, p0, LIf;->g:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, LIf;->g:I

    iget-boolean v0, p0, LIf;->d:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, LIf;->e:LO70;

    iget-object v1, p0, LIf;->c:LzX5;

    invoke-virtual {v1, p1}, LzX5;->D(Ljava/lang/String;)I

    move-result p1

    invoke-virtual {v0, p1}, LO70;->k(I)LO70;

    :cond_0
    instance-of p1, p2, Ljava/lang/String;

    if-eqz p1, :cond_1

    iget-object p1, p0, LIf;->e:LO70;

    iget-object v0, p0, LIf;->c:LzX5;

    check-cast p2, Ljava/lang/String;

    invoke-virtual {v0, p2}, LzX5;->D(Ljava/lang/String;)I

    move-result p2

    const/16 v0, 0x73

    invoke-virtual {p1, v0, p2}, LO70;->e(II)LO70;

    goto/16 :goto_8

    :cond_1
    instance-of p1, p2, Ljava/lang/Byte;

    const/16 v0, 0x42

    if-eqz p1, :cond_2

    iget-object p1, p0, LIf;->e:LO70;

    iget-object v1, p0, LIf;->c:LzX5;

    check-cast p2, Ljava/lang/Byte;

    invoke-virtual {p2}, Ljava/lang/Byte;->byteValue()B

    move-result p2

    invoke-virtual {v1, p2}, LzX5;->l(I)LvX5;

    move-result-object p2

    iget p2, p2, LvX5;->a:I

    invoke-virtual {p1, v0, p2}, LO70;->e(II)LO70;

    goto/16 :goto_8

    :cond_2
    instance-of p1, p2, Ljava/lang/Boolean;

    const/16 v1, 0x5a

    if-eqz p1, :cond_3

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object p2, p0, LIf;->e:LO70;

    iget-object v0, p0, LIf;->c:LzX5;

    invoke-virtual {v0, p1}, LzX5;->l(I)LvX5;

    move-result-object p1

    iget p1, p1, LvX5;->a:I

    invoke-virtual {p2, v1, p1}, LO70;->e(II)LO70;

    goto/16 :goto_8

    :cond_3
    instance-of p1, p2, Ljava/lang/Character;

    const/16 v2, 0x43

    if-eqz p1, :cond_4

    iget-object p1, p0, LIf;->e:LO70;

    iget-object v0, p0, LIf;->c:LzX5;

    check-cast p2, Ljava/lang/Character;

    invoke-virtual {p2}, Ljava/lang/Character;->charValue()C

    move-result p2

    invoke-virtual {v0, p2}, LzX5;->l(I)LvX5;

    move-result-object p2

    iget p2, p2, LvX5;->a:I

    invoke-virtual {p1, v2, p2}, LO70;->e(II)LO70;

    goto/16 :goto_8

    :cond_4
    instance-of p1, p2, Ljava/lang/Short;

    const/16 v3, 0x53

    if-eqz p1, :cond_5

    iget-object p1, p0, LIf;->e:LO70;

    iget-object v0, p0, LIf;->c:LzX5;

    check-cast p2, Ljava/lang/Short;

    invoke-virtual {p2}, Ljava/lang/Short;->shortValue()S

    move-result p2

    invoke-virtual {v0, p2}, LzX5;->l(I)LvX5;

    move-result-object p2

    iget p2, p2, LvX5;->a:I

    invoke-virtual {p1, v3, p2}, LO70;->e(II)LO70;

    goto/16 :goto_8

    :cond_5
    instance-of p1, p2, LAb6;

    if-eqz p1, :cond_6

    iget-object p1, p0, LIf;->e:LO70;

    iget-object v0, p0, LIf;->c:LzX5;

    check-cast p2, LAb6;

    invoke-virtual {p2}, LAb6;->d()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, LzX5;->D(Ljava/lang/String;)I

    move-result p2

    const/16 v0, 0x63

    invoke-virtual {p1, v0, p2}, LO70;->e(II)LO70;

    goto/16 :goto_8

    :cond_6
    instance-of p1, p2, [B

    const/4 v4, 0x0

    const/16 v5, 0x5b

    if-eqz p1, :cond_7

    check-cast p2, [B

    iget-object p1, p0, LIf;->e:LO70;

    array-length v1, p2

    invoke-virtual {p1, v5, v1}, LO70;->e(II)LO70;

    array-length p1, p2

    :goto_0
    if-ge v4, p1, :cond_f

    aget-byte v1, p2, v4

    iget-object v2, p0, LIf;->e:LO70;

    iget-object v3, p0, LIf;->c:LzX5;

    invoke-virtual {v3, v1}, LzX5;->l(I)LvX5;

    move-result-object v1

    iget v1, v1, LvX5;->a:I

    invoke-virtual {v2, v0, v1}, LO70;->e(II)LO70;

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_7
    instance-of p1, p2, [Z

    if-eqz p1, :cond_8

    check-cast p2, [Z

    iget-object p1, p0, LIf;->e:LO70;

    array-length v0, p2

    invoke-virtual {p1, v5, v0}, LO70;->e(II)LO70;

    array-length p1, p2

    :goto_1
    if-ge v4, p1, :cond_f

    aget-boolean v0, p2, v4

    iget-object v2, p0, LIf;->e:LO70;

    iget-object v3, p0, LIf;->c:LzX5;

    invoke-virtual {v3, v0}, LzX5;->l(I)LvX5;

    move-result-object v0

    iget v0, v0, LvX5;->a:I

    invoke-virtual {v2, v1, v0}, LO70;->e(II)LO70;

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_8
    instance-of p1, p2, [S

    if-eqz p1, :cond_9

    check-cast p2, [S

    iget-object p1, p0, LIf;->e:LO70;

    array-length v0, p2

    invoke-virtual {p1, v5, v0}, LO70;->e(II)LO70;

    array-length p1, p2

    :goto_2
    if-ge v4, p1, :cond_f

    aget-short v0, p2, v4

    iget-object v1, p0, LIf;->e:LO70;

    iget-object v2, p0, LIf;->c:LzX5;

    invoke-virtual {v2, v0}, LzX5;->l(I)LvX5;

    move-result-object v0

    iget v0, v0, LvX5;->a:I

    invoke-virtual {v1, v3, v0}, LO70;->e(II)LO70;

    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_9
    instance-of p1, p2, [C

    if-eqz p1, :cond_a

    check-cast p2, [C

    iget-object p1, p0, LIf;->e:LO70;

    array-length v0, p2

    invoke-virtual {p1, v5, v0}, LO70;->e(II)LO70;

    array-length p1, p2

    :goto_3
    if-ge v4, p1, :cond_f

    aget-char v0, p2, v4

    iget-object v1, p0, LIf;->e:LO70;

    iget-object v3, p0, LIf;->c:LzX5;

    invoke-virtual {v3, v0}, LzX5;->l(I)LvX5;

    move-result-object v0

    iget v0, v0, LvX5;->a:I

    invoke-virtual {v1, v2, v0}, LO70;->e(II)LO70;

    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    :cond_a
    instance-of p1, p2, [I

    if-eqz p1, :cond_b

    check-cast p2, [I

    iget-object p1, p0, LIf;->e:LO70;

    array-length v0, p2

    invoke-virtual {p1, v5, v0}, LO70;->e(II)LO70;

    array-length p1, p2

    :goto_4
    if-ge v4, p1, :cond_f

    aget v0, p2, v4

    iget-object v1, p0, LIf;->e:LO70;

    iget-object v2, p0, LIf;->c:LzX5;

    invoke-virtual {v2, v0}, LzX5;->l(I)LvX5;

    move-result-object v0

    iget v0, v0, LvX5;->a:I

    const/16 v2, 0x49

    invoke-virtual {v1, v2, v0}, LO70;->e(II)LO70;

    add-int/lit8 v4, v4, 0x1

    goto :goto_4

    :cond_b
    instance-of p1, p2, [J

    if-eqz p1, :cond_c

    check-cast p2, [J

    iget-object p1, p0, LIf;->e:LO70;

    array-length v0, p2

    invoke-virtual {p1, v5, v0}, LO70;->e(II)LO70;

    array-length p1, p2

    :goto_5
    if-ge v4, p1, :cond_f

    aget-wide v0, p2, v4

    iget-object v2, p0, LIf;->e:LO70;

    iget-object v3, p0, LIf;->c:LzX5;

    invoke-virtual {v3, v0, v1}, LzX5;->p(J)LvX5;

    move-result-object v0

    iget v0, v0, LvX5;->a:I

    const/16 v1, 0x4a

    invoke-virtual {v2, v1, v0}, LO70;->e(II)LO70;

    add-int/lit8 v4, v4, 0x1

    goto :goto_5

    :cond_c
    instance-of p1, p2, [F

    if-eqz p1, :cond_d

    check-cast p2, [F

    iget-object p1, p0, LIf;->e:LO70;

    array-length v0, p2

    invoke-virtual {p1, v5, v0}, LO70;->e(II)LO70;

    array-length p1, p2

    :goto_6
    if-ge v4, p1, :cond_f

    aget v0, p2, v4

    iget-object v1, p0, LIf;->e:LO70;

    iget-object v2, p0, LIf;->c:LzX5;

    invoke-virtual {v2, v0}, LzX5;->k(F)LvX5;

    move-result-object v0

    iget v0, v0, LvX5;->a:I

    const/16 v2, 0x46

    invoke-virtual {v1, v2, v0}, LO70;->e(II)LO70;

    add-int/lit8 v4, v4, 0x1

    goto :goto_6

    :cond_d
    instance-of p1, p2, [D

    if-eqz p1, :cond_e

    check-cast p2, [D

    iget-object p1, p0, LIf;->e:LO70;

    array-length v0, p2

    invoke-virtual {p1, v5, v0}, LO70;->e(II)LO70;

    array-length p1, p2

    :goto_7
    if-ge v4, p1, :cond_f

    aget-wide v0, p2, v4

    iget-object v2, p0, LIf;->e:LO70;

    iget-object v3, p0, LIf;->c:LzX5;

    invoke-virtual {v3, v0, v1}, LzX5;->f(D)LvX5;

    move-result-object v0

    iget v0, v0, LvX5;->a:I

    const/16 v1, 0x44

    invoke-virtual {v2, v1, v0}, LO70;->e(II)LO70;

    add-int/lit8 v4, v4, 0x1

    goto :goto_7

    :cond_e
    iget-object p1, p0, LIf;->c:LzX5;

    invoke-virtual {p1, p2}, LzX5;->d(Ljava/lang/Object;)LvX5;

    move-result-object p1

    iget-object p2, p0, LIf;->e:LO70;

    iget v0, p1, LvX5;->b:I

    const-string v1, ".s.IFJDCS"

    invoke-virtual {v1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    iget p1, p1, LvX5;->a:I

    invoke-virtual {p2, v0, p1}, LO70;->e(II)LO70;

    :cond_f
    :goto_8
    return-void
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;)LHf;
    .locals 3

    iget v0, p0, LIf;->g:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, LIf;->g:I

    iget-boolean v0, p0, LIf;->d:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, LIf;->e:LO70;

    iget-object v2, p0, LIf;->c:LzX5;

    invoke-virtual {v2, p1}, LzX5;->D(Ljava/lang/String;)I

    move-result p1

    invoke-virtual {v0, p1}, LO70;->k(I)LO70;

    :cond_0
    iget-object p1, p0, LIf;->e:LO70;

    iget-object v0, p0, LIf;->c:LzX5;

    invoke-virtual {v0, p2}, LzX5;->D(Ljava/lang/String;)I

    move-result p2

    const/16 v0, 0x40

    invoke-virtual {p1, v0, p2}, LO70;->e(II)LO70;

    move-result-object p1

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, LO70;->k(I)LO70;

    new-instance p1, LIf;

    iget-object p2, p0, LIf;->c:LzX5;

    iget-object v0, p0, LIf;->e:LO70;

    const/4 v2, 0x0

    invoke-direct {p1, p2, v1, v0, v2}, LIf;-><init>(LzX5;ZLO70;LIf;)V

    return-object p1
.end method

.method public c(Ljava/lang/String;)LHf;
    .locals 4

    iget v0, p0, LIf;->g:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, LIf;->g:I

    iget-boolean v0, p0, LIf;->d:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, LIf;->e:LO70;

    iget-object v1, p0, LIf;->c:LzX5;

    invoke-virtual {v1, p1}, LzX5;->D(Ljava/lang/String;)I

    move-result p1

    invoke-virtual {v0, p1}, LO70;->k(I)LO70;

    :cond_0
    iget-object p1, p0, LIf;->e:LO70;

    const/16 v0, 0x5b

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, LO70;->e(II)LO70;

    new-instance p1, LIf;

    iget-object v0, p0, LIf;->c:LzX5;

    iget-object v2, p0, LIf;->e:LO70;

    const/4 v3, 0x0

    invoke-direct {p1, v0, v1, v2, v3}, LIf;-><init>(LzX5;ZLO70;LIf;)V

    return-object p1
.end method

.method public d()V
    .locals 4

    iget v0, p0, LIf;->f:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    iget-object v1, p0, LIf;->e:LO70;

    iget-object v1, v1, LO70;->a:[B

    iget v2, p0, LIf;->g:I

    ushr-int/lit8 v3, v2, 0x8

    int-to-byte v3, v3

    aput-byte v3, v1, v0

    add-int/lit8 v0, v0, 0x1

    int-to-byte v2, v2

    aput-byte v2, v1, v0

    :cond_0
    return-void
.end method

.method public e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    iget v0, p0, LIf;->g:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, LIf;->g:I

    iget-boolean v0, p0, LIf;->d:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, LIf;->e:LO70;

    iget-object v1, p0, LIf;->c:LzX5;

    invoke-virtual {v1, p1}, LzX5;->D(Ljava/lang/String;)I

    move-result p1

    invoke-virtual {v0, p1}, LO70;->k(I)LO70;

    :cond_0
    iget-object p1, p0, LIf;->e:LO70;

    iget-object v0, p0, LIf;->c:LzX5;

    invoke-virtual {v0, p2}, LzX5;->D(Ljava/lang/String;)I

    move-result p2

    const/16 v0, 0x65

    invoke-virtual {p1, v0, p2}, LO70;->e(II)LO70;

    move-result-object p1

    iget-object p2, p0, LIf;->c:LzX5;

    invoke-virtual {p2, p3}, LzX5;->D(Ljava/lang/String;)I

    move-result p2

    invoke-virtual {p1, p2}, LO70;->k(I)LO70;

    return-void
.end method

.method public g(Ljava/lang/String;)I
    .locals 2

    if-eqz p1, :cond_0

    iget-object v0, p0, LIf;->c:LzX5;

    invoke-virtual {v0, p1}, LzX5;->D(Ljava/lang/String;)I

    :cond_0
    const/16 p1, 0x8

    move-object v0, p0

    :goto_0
    if-eqz v0, :cond_1

    iget-object v1, v0, LIf;->e:LO70;

    iget v1, v1, LO70;->b:I

    add-int/2addr p1, v1

    iget-object v0, v0, LIf;->h:LIf;

    goto :goto_0

    :cond_1
    return p1
.end method

.method public k(ILO70;)V
    .locals 6

    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x0

    move v4, v1

    move-object v3, v2

    move-object v2, p0

    :goto_0
    if-eqz v2, :cond_0

    invoke-virtual {v2}, LIf;->d()V

    iget-object v3, v2, LIf;->e:LO70;

    iget v3, v3, LO70;->b:I

    add-int/2addr v0, v3

    add-int/lit8 v4, v4, 0x1

    iget-object v3, v2, LIf;->h:LIf;

    move-object v5, v3

    move-object v3, v2

    move-object v2, v5

    goto :goto_0

    :cond_0
    invoke-virtual {p2, p1}, LO70;->k(I)LO70;

    invoke-virtual {p2, v0}, LO70;->i(I)LO70;

    invoke-virtual {p2, v4}, LO70;->k(I)LO70;

    :goto_1
    if-eqz v3, :cond_1

    iget-object p1, v3, LIf;->e:LO70;

    iget-object v0, p1, LO70;->a:[B

    iget p1, p1, LO70;->b:I

    invoke-virtual {p2, v0, v1, p1}, LO70;->h([BII)LO70;

    iget-object v3, v3, LIf;->i:LIf;

    goto :goto_1

    :cond_1
    return-void
.end method
