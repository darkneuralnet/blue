.class public LQt4$a;
.super LbZ1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LQt4;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "LbZ1<",
        "Ljava/util/Map$Entry<",
        "TK;TV;>;>;"
    }
.end annotation


# instance fields
.field public final transient d:LXY1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LXY1<",
            "TK;TV;>;"
        }
    .end annotation
.end field

.field public final transient e:[Ljava/lang/Object;

.field public final transient f:I

.field public final transient g:I


# direct methods
.method public constructor <init>(LXY1;[Ljava/lang/Object;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LXY1<",
            "TK;TV;>;[",
            "Ljava/lang/Object;",
            "II)V"
        }
    .end annotation

    invoke-direct {p0}, LbZ1;-><init>()V

    iput-object p1, p0, LQt4$a;->d:LXY1;

    iput-object p2, p0, LQt4$a;->e:[Ljava/lang/Object;

    iput p3, p0, LQt4$a;->f:I

    iput p4, p0, LQt4$a;->g:I

    return-void
.end method

.method public static synthetic H(LQt4$a;)I
    .locals 0

    iget p0, p0, LQt4$a;->g:I

    return p0
.end method

.method public static synthetic I(LQt4$a;)[Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, LQt4$a;->e:[Ljava/lang/Object;

    return-object p0
.end method

.method public static synthetic J(LQt4$a;)I
    .locals 0

    iget p0, p0, LQt4$a;->f:I

    return p0
.end method


# virtual methods
.method public b([Ljava/lang/Object;I)I
    .locals 1

    invoke-virtual {p0}, LbZ1;->a()LVY1;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, LVY1;->b([Ljava/lang/Object;I)I

    move-result p1

    return p1
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Ljava/util/Map$Entry;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Ljava/util/Map$Entry;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v2, p0, LQt4$a;->d:LXY1;

    invoke-virtual {v2, v0}, LXY1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method public h()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    invoke-virtual {p0}, LQt4$a;->j()Lre6;

    move-result-object v0

    return-object v0
.end method

.method public j()Lre6;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lre6<",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;"
        }
    .end annotation

    invoke-virtual {p0}, LbZ1;->a()LVY1;

    move-result-object v0

    invoke-virtual {v0}, LVY1;->j()Lre6;

    move-result-object v0

    return-object v0
.end method

.method public size()I
    .locals 1

    iget v0, p0, LQt4$a;->g:I

    return v0
.end method

.method public y()LVY1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LVY1<",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;"
        }
    .end annotation

    new-instance v0, LQt4$a$a;

    invoke-direct {v0, p0}, LQt4$a$a;-><init>(LQt4$a;)V

    return-object v0
.end method
