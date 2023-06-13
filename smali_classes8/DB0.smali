.class public LDB0;
.super Ljava/util/ArrayList;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/ArrayList<",
        "LyB0;",
        ">;"
    }
.end annotation


# static fields
.field public static final b:[LyB0;

.field private static final serialVersionUID:J = -0x16911b47d31eaa28L


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [LyB0;

    sput-object v0, LDB0;->b:[LyB0;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    return-void
.end method

.method public constructor <init>([LyB0;)V
    .locals 1

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    array-length v0, p1

    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->ensureCapacity(I)V

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, LDB0;->h([LyB0;Z)Z

    return-void
.end method

.method public constructor <init>([LyB0;Z)V
    .locals 1

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    array-length v0, p1

    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->ensureCapacity(I)V

    invoke-virtual {p0, p1, p2}, LDB0;->h([LyB0;Z)Z

    return-void
.end method


# virtual methods
.method public b2()[LyB0;
    .locals 1

    sget-object v0, LDB0;->b:[LyB0;

    invoke-virtual {p0, v0}, Ljava/util/AbstractCollection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LyB0;

    return-object v0
.end method

.method public clone()Ljava/lang/Object;
    .locals 3

    invoke-super {p0}, Ljava/util/ArrayList;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LDB0;

    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->size()I

    move-result v2

    if-ge v1, v2, :cond_0

    invoke-virtual {p0, v1}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LyB0;

    invoke-virtual {v2}, LyB0;->clone()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LyB0;

    invoke-virtual {v0, v1, v2}, Ljava/util/AbstractList;->add(ILjava/lang/Object;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public e(ILyB0;Z)V
    .locals 1

    if-nez p3, :cond_1

    invoke-virtual {p0}, Ljava/util/AbstractCollection;->size()I

    move-result p3

    if-lez p3, :cond_1

    if-lez p1, :cond_0

    add-int/lit8 v0, p1, -0x1

    invoke-virtual {p0, v0}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LyB0;

    invoke-virtual {v0, p2}, LyB0;->g(LyB0;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    if-ge p1, p3, :cond_1

    invoke-virtual {p0, p1}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, LyB0;

    invoke-virtual {p3, p2}, LyB0;->g(LyB0;)Z

    move-result p3

    if-eqz p3, :cond_1

    return-void

    :cond_1
    invoke-super {p0, p1, p2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    return-void
.end method

.method public f(LyB0;Z)V
    .locals 1

    if-nez p2, :cond_0

    invoke-virtual {p0}, Ljava/util/AbstractCollection;->size()I

    move-result p2

    const/4 v0, 0x1

    if-lt p2, v0, :cond_0

    invoke-virtual {p0}, Ljava/util/AbstractCollection;->size()I

    move-result p2

    sub-int/2addr p2, v0

    invoke-virtual {p0, p2}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LyB0;

    invoke-virtual {p2, p1}, LyB0;->g(LyB0;)Z

    move-result p2

    if-eqz p2, :cond_0

    return-void

    :cond_0
    invoke-super {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public h([LyB0;Z)Z
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, p2, v0}, LDB0;->j([LyB0;ZZ)Z

    return v0
.end method

.method public j([LyB0;ZZ)Z
    .locals 2

    const/4 v0, 0x1

    if-eqz p3, :cond_0

    const/4 p3, 0x0

    :goto_0
    array-length v1, p1

    if-ge p3, v1, :cond_1

    aget-object v1, p1, p3

    invoke-virtual {p0, v1, p2}, LDB0;->f(LyB0;Z)V

    add-int/lit8 p3, p3, 0x1

    goto :goto_0

    :cond_0
    array-length p3, p1

    sub-int/2addr p3, v0

    :goto_1
    if-ltz p3, :cond_1

    aget-object v1, p1, p3

    invoke-virtual {p0, v1, p2}, LDB0;->f(LyB0;Z)V

    add-int/lit8 p3, p3, -0x1

    goto :goto_1

    :cond_1
    return v0
.end method

.method public o()V
    .locals 2

    invoke-virtual {p0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LyB0;

    invoke-virtual {v1}, LyB0;->e()LyB0;

    move-result-object v1

    invoke-virtual {p0, v1, v0}, LDB0;->f(LyB0;Z)V

    :cond_0
    return-void
.end method

.method public w(Z)[LyB0;
    .locals 3

    if-eqz p1, :cond_0

    sget-object p1, LDB0;->b:[LyB0;

    invoke-virtual {p0, p1}, Ljava/util/AbstractCollection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [LyB0;

    return-object p1

    :cond_0
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->size()I

    move-result p1

    new-array v0, p1, [LyB0;

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p1, :cond_1

    sub-int v2, p1, v1

    add-int/lit8 v2, v2, -0x1

    invoke-virtual {p0, v2}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LyB0;

    aput-object v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method
