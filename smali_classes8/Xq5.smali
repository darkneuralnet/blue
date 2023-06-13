.class public LXq5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public final b:LS83;

.field public final c:LyB0;

.field public final d:I

.field public final e:I

.field public final f:Z


# direct methods
.method public constructor <init>(LS83;LyB0;II)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LXq5;->b:LS83;

    new-instance v0, LyB0;

    invoke-direct {v0, p2}, LyB0;-><init>(LyB0;)V

    iput-object v0, p0, LXq5;->c:LyB0;

    iput p3, p0, LXq5;->d:I

    iput p4, p0, LXq5;->e:I

    invoke-virtual {p1, p3}, LS83;->u(I)LyB0;

    move-result-object p1

    invoke-virtual {p2, p1}, LyB0;->g(LyB0;)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    iput-boolean p1, p0, LXq5;->f:Z

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    iget-boolean v0, p0, LXq5;->f:Z

    return v0
.end method

.method public compareTo(Ljava/lang/Object;)I
    .locals 4

    check-cast p1, LXq5;

    iget v0, p0, LXq5;->d:I

    iget v1, p1, LXq5;->d:I

    const/4 v2, -0x1

    if-ge v0, v1, :cond_0

    return v2

    :cond_0
    const/4 v3, 0x1

    if-le v0, v1, :cond_1

    return v3

    :cond_1
    iget-object v0, p0, LXq5;->c:LyB0;

    iget-object v1, p1, LXq5;->c:LyB0;

    invoke-virtual {v0, v1}, LyB0;->g(LyB0;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 p1, 0x0

    return p1

    :cond_2
    iget-boolean v0, p0, LXq5;->f:Z

    if-nez v0, :cond_3

    return v2

    :cond_3
    iget-boolean v0, p1, LXq5;->f:Z

    if-nez v0, :cond_4

    return v3

    :cond_4
    iget v0, p0, LXq5;->e:I

    iget-object v1, p0, LXq5;->c:LyB0;

    iget-object p1, p1, LXq5;->c:LyB0;

    invoke-static {v0, v1, p1}, Lar5;->a(ILyB0;LyB0;)I

    move-result p1

    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget v1, p0, LXq5;->d:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LXq5;->c:LyB0;

    invoke-virtual {v1}, LyB0;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
