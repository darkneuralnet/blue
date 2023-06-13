.class public Ls12;
.super LJj6;
.source "SourceFile"


# instance fields
.field public a:[Ljava/lang/String;

.field public b:I


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, LJj6;-><init>()V

    const/4 v0, 0x0

    new-array v1, v0, [Ljava/lang/String;

    iput-object v1, p0, Ls12;->a:[Ljava/lang/String;

    iput v0, p0, Ls12;->b:I

    return-void
.end method

.method public constructor <init>(Ljava/util/Collection;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, LJj6;-><init>()V

    const/4 v0, 0x0

    new-array v1, v0, [Ljava/lang/String;

    iput-object v1, p0, Ls12;->a:[Ljava/lang/String;

    iput v0, p0, Ls12;->b:I

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v0

    new-array v0, v0, [Ljava/lang/String;

    invoke-interface {p1, v0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/String;

    invoke-virtual {p0, p1}, Ls12;->j([Ljava/lang/String;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public f(F)Ljava/lang/String;
    .locals 2

    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result v0

    if-ltz v0, :cond_1

    iget v1, p0, Ls12;->b:I

    if-ge v0, v1, :cond_1

    float-to-int p1, p1

    if-eq v0, p1, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Ls12;->a:[Ljava/lang/String;

    aget-object p1, p1, v0

    return-object p1

    :cond_1
    :goto_0
    const-string p1, ""

    return-object p1
.end method

.method public j([Ljava/lang/String;)V
    .locals 0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/String;

    :cond_0
    iput-object p1, p0, Ls12;->a:[Ljava/lang/String;

    array-length p1, p1

    iput p1, p0, Ls12;->b:I

    return-void
.end method
