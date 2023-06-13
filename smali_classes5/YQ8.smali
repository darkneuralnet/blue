.class public final LYQ8;
.super LsR8;
.source "SourceFile"


# instance fields
.field public final synthetic h:LiR8;


# direct methods
.method public constructor <init>(LiR8;LCR8;Ljava/lang/CharSequence;)V
    .locals 0

    iput-object p1, p0, LYQ8;->h:LiR8;

    invoke-direct {p0, p2, p3}, LsR8;-><init>(LCR8;Ljava/lang/CharSequence;)V

    return-void
.end method


# virtual methods
.method public final c(I)I
    .locals 1

    iget-object v0, p0, LYQ8;->h:LiR8;

    iget-object v0, v0, LiR8;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/2addr p1, v0

    return p1
.end method

.method public final d(I)I
    .locals 5

    iget-object v0, p0, LYQ8;->h:LiR8;

    iget-object v0, v0, LiR8;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    iget-object v1, p0, LsR8;->d:Ljava/lang/CharSequence;

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    sub-int/2addr v1, v0

    :goto_0
    if-gt p1, v1, :cond_2

    const/4 v2, 0x0

    :goto_1
    if-ge v2, v0, :cond_1

    iget-object v3, p0, LsR8;->d:Ljava/lang/CharSequence;

    add-int v4, v2, p1

    invoke-interface {v3, v4}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    iget-object v4, p0, LYQ8;->h:LiR8;

    iget-object v4, v4, LiR8;->a:Ljava/lang/String;

    invoke-virtual {v4, v2}, Ljava/lang/String;->charAt(I)C

    move-result v4

    if-eq v3, v4, :cond_0

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    return p1

    :cond_2
    const/4 p1, -0x1

    return p1
.end method
