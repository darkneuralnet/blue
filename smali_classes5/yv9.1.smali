.class public abstract Lyv9;
.super LnH8;
.source "SourceFile"


# instance fields
.field public final d:Ljava/lang/CharSequence;

.field public final e:LA99;

.field public final f:Z

.field public g:I

.field public h:I


# direct methods
.method public constructor <init>(LCw9;Ljava/lang/CharSequence;)V
    .locals 1

    invoke-direct {p0}, LnH8;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lyv9;->g:I

    invoke-static {p1}, LCw9;->a(LCw9;)LA99;

    move-result-object v0

    iput-object v0, p0, Lyv9;->e:LA99;

    invoke-static {p1}, LCw9;->g(LCw9;)Z

    move-result p1

    iput-boolean p1, p0, Lyv9;->f:Z

    const p1, 0x7fffffff

    iput p1, p0, Lyv9;->h:I

    iput-object p2, p0, Lyv9;->d:Ljava/lang/CharSequence;

    return-void
.end method


# virtual methods
.method public final bridge synthetic a()Ljava/lang/Object;
    .locals 5

    iget v0, p0, Lyv9;->g:I

    :cond_0
    :goto_0
    iget v1, p0, Lyv9;->g:I

    const/4 v2, -0x1

    if-eq v1, v2, :cond_8

    invoke-virtual {p0, v1}, Lyv9;->d(I)I

    move-result v1

    if-ne v1, v2, :cond_1

    iget-object v1, p0, Lyv9;->d:Ljava/lang/CharSequence;

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    iput v2, p0, Lyv9;->g:I

    move v3, v2

    goto :goto_1

    :cond_1
    invoke-virtual {p0, v1}, Lyv9;->c(I)I

    move-result v3

    iput v3, p0, Lyv9;->g:I

    :goto_1
    if-ne v3, v0, :cond_2

    add-int/lit8 v3, v3, 0x1

    iput v3, p0, Lyv9;->g:I

    iget-object v1, p0, Lyv9;->d:Ljava/lang/CharSequence;

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-le v3, v1, :cond_0

    iput v2, p0, Lyv9;->g:I

    goto :goto_0

    :cond_2
    if-ge v0, v1, :cond_3

    iget-object v3, p0, Lyv9;->d:Ljava/lang/CharSequence;

    invoke-interface {v3, v0}, Ljava/lang/CharSequence;->charAt(I)C

    :cond_3
    if-ge v0, v1, :cond_4

    iget-object v3, p0, Lyv9;->d:Ljava/lang/CharSequence;

    add-int/lit8 v4, v1, -0x1

    invoke-interface {v3, v4}, Ljava/lang/CharSequence;->charAt(I)C

    :cond_4
    iget-boolean v3, p0, Lyv9;->f:Z

    if-eqz v3, :cond_5

    if-ne v0, v1, :cond_5

    iget v0, p0, Lyv9;->g:I

    goto :goto_0

    :cond_5
    iget v3, p0, Lyv9;->h:I

    const/4 v4, 0x1

    if-ne v3, v4, :cond_6

    iget-object v1, p0, Lyv9;->d:Ljava/lang/CharSequence;

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    iput v2, p0, Lyv9;->g:I

    if-le v1, v0, :cond_7

    iget-object v2, p0, Lyv9;->d:Ljava/lang/CharSequence;

    add-int/lit8 v3, v1, -0x1

    invoke-interface {v2, v3}, Ljava/lang/CharSequence;->charAt(I)C

    goto :goto_2

    :cond_6
    add-int/2addr v3, v2

    iput v3, p0, Lyv9;->h:I

    :cond_7
    :goto_2
    iget-object v2, p0, Lyv9;->d:Ljava/lang/CharSequence;

    invoke-interface {v2, v0, v1}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_3

    :cond_8
    invoke-virtual {p0}, LnH8;->b()Ljava/lang/Object;

    const/4 v0, 0x0

    :goto_3
    return-object v0
.end method

.method public abstract c(I)I
.end method

.method public abstract d(I)I
.end method
