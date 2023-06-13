.class public final LlU7;
.super LdM7;
.source "SourceFile"


# static fields
.field public static final g:LdM7;


# instance fields
.field public final transient e:[Ljava/lang/Object;

.field public final transient f:I


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, LlU7;

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-direct {v0, v3, v2, v1}, LlU7;-><init>(Ljava/lang/Object;[Ljava/lang/Object;I)V

    sput-object v0, LlU7;->g:LdM7;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;[Ljava/lang/Object;I)V
    .locals 0

    invoke-direct {p0}, LdM7;-><init>()V

    iput-object p2, p0, LlU7;->e:[Ljava/lang/Object;

    iput p3, p0, LlU7;->f:I

    return-void
.end method

.method public static g(I[Ljava/lang/Object;LNL7;)LlU7;
    .locals 1

    const/4 p0, 0x0

    aget-object p0, p1, p0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p2, 0x1

    aget-object v0, p1, p2

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p0, v0}, Lcw7;->b(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance p0, LlU7;

    const/4 v0, 0x0

    invoke-direct {p0, v0, p1, p2}, LlU7;-><init>(Ljava/lang/Object;[Ljava/lang/Object;I)V

    return-object p0
.end method


# virtual methods
.method public final a()LrJ7;
    .locals 4

    new-instance v0, LWT7;

    iget-object v1, p0, LlU7;->e:[Ljava/lang/Object;

    const/4 v2, 0x1

    iget v3, p0, LlU7;->f:I

    invoke-direct {v0, v1, v2, v3}, LWT7;-><init>([Ljava/lang/Object;II)V

    return-object v0
.end method

.method public final d()LtM7;
    .locals 4

    new-instance v0, LkT7;

    iget-object v1, p0, LlU7;->e:[Ljava/lang/Object;

    const/4 v2, 0x0

    iget v3, p0, LlU7;->f:I

    invoke-direct {v0, p0, v1, v2, v3}, LkT7;-><init>(LdM7;[Ljava/lang/Object;II)V

    return-object v0
.end method

.method public final e()LtM7;
    .locals 4

    new-instance v0, LWT7;

    iget-object v1, p0, LlU7;->e:[Ljava/lang/Object;

    const/4 v2, 0x0

    iget v3, p0, LlU7;->f:I

    invoke-direct {v0, v1, v2, v3}, LWT7;-><init>([Ljava/lang/Object;II)V

    new-instance v1, LLT7;

    invoke-direct {v1, p0, v0}, LLT7;-><init>(LdM7;LxL7;)V

    return-object v1
.end method

.method public final get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, LlU7;->e:[Ljava/lang/Object;

    iget v1, p0, LlU7;->f:I

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

    iget v0, p0, LlU7;->f:I

    return v0
.end method
