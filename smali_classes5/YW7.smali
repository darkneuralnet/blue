.class public final LYW7;
.super LiS7;
.source "SourceFile"


# static fields
.field public static final g:LiS7;


# instance fields
.field public final transient e:[Ljava/lang/Object;

.field public final transient f:I


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, LYW7;

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-direct {v0, v3, v2, v1}, LYW7;-><init>(Ljava/lang/Object;[Ljava/lang/Object;I)V

    sput-object v0, LYW7;->g:LiS7;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;[Ljava/lang/Object;I)V
    .locals 0

    invoke-direct {p0}, LiS7;-><init>()V

    iput-object p2, p0, LYW7;->e:[Ljava/lang/Object;

    iput p3, p0, LYW7;->f:I

    return-void
.end method

.method public static g(I[Ljava/lang/Object;LTR7;)LYW7;
    .locals 1

    const/4 p0, 0x0

    aget-object p0, p1, p0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p2, 0x1

    aget-object v0, p1, p2

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p0, v0}, LnK7;->b(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance p0, LYW7;

    const/4 v0, 0x0

    invoke-direct {p0, v0, p1, p2}, LYW7;-><init>(Ljava/lang/Object;[Ljava/lang/Object;I)V

    return-object p0
.end method


# virtual methods
.method public final a()LVO7;
    .locals 4

    new-instance v0, LJW7;

    iget-object v1, p0, LYW7;->e:[Ljava/lang/Object;

    const/4 v2, 0x1

    iget v3, p0, LYW7;->f:I

    invoke-direct {v0, v1, v2, v3}, LJW7;-><init>([Ljava/lang/Object;II)V

    return-object v0
.end method

.method public final d()LwS7;
    .locals 4

    new-instance v0, LjW7;

    iget-object v1, p0, LYW7;->e:[Ljava/lang/Object;

    const/4 v2, 0x0

    iget v3, p0, LYW7;->f:I

    invoke-direct {v0, p0, v1, v2, v3}, LjW7;-><init>(LiS7;[Ljava/lang/Object;II)V

    return-object v0
.end method

.method public final e()LwS7;
    .locals 4

    new-instance v0, LJW7;

    iget-object v1, p0, LYW7;->e:[Ljava/lang/Object;

    const/4 v2, 0x0

    iget v3, p0, LYW7;->f:I

    invoke-direct {v0, v1, v2, v3}, LJW7;-><init>([Ljava/lang/Object;II)V

    new-instance v1, LwW7;

    invoke-direct {v1, p0, v0}, LwW7;-><init>(LiS7;LDR7;)V

    return-object v1
.end method

.method public final get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, LYW7;->e:[Ljava/lang/Object;

    iget v1, p0, LYW7;->f:I

    const/4 v2, 0x0

    if-nez p1, :cond_1

    :cond_0
    move-object p1, v2

    goto :goto_0

    :cond_1
    const/4 v3, 0x1

    if-ne v1, v3, :cond_0

    const/4 v1, 0x0

    aget-object v1, v0, v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    aget-object p1, v0, v3

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :goto_0
    if-nez p1, :cond_2

    return-object v2

    :cond_2
    return-object p1
.end method

.method public final size()I
    .locals 1

    iget v0, p0, LYW7;->f:I

    return v0
.end method
