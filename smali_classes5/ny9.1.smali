.class public final Lny9;
.super Lpl9;
.source "SourceFile"


# static fields
.field public static final g:Lpl9;


# instance fields
.field public final transient e:[Ljava/lang/Object;

.field public final transient f:I


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, Lny9;

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-direct {v0, v3, v2, v1}, Lny9;-><init>(Ljava/lang/Object;[Ljava/lang/Object;I)V

    sput-object v0, Lny9;->g:Lpl9;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;[Ljava/lang/Object;I)V
    .locals 0

    invoke-direct {p0}, Lpl9;-><init>()V

    iput-object p2, p0, Lny9;->e:[Ljava/lang/Object;

    iput p3, p0, Lny9;->f:I

    return-void
.end method

.method public static g(I[Ljava/lang/Object;LVh9;)Lny9;
    .locals 1

    const/4 p0, 0x0

    aget-object p0, p1, p0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p2, 0x1

    aget-object v0, p1, p2

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p0, v0}, LgA8;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance p0, Lny9;

    const/4 v0, 0x0

    invoke-direct {p0, v0, p1, p2}, Lny9;-><init>(Ljava/lang/Object;[Ljava/lang/Object;I)V

    return-object p0
.end method


# virtual methods
.method public final a()LTT8;
    .locals 4

    new-instance v0, Llx9;

    iget-object v1, p0, Lny9;->e:[Ljava/lang/Object;

    const/4 v2, 0x1

    iget v3, p0, Lny9;->f:I

    invoke-direct {v0, v1, v2, v3}, Llx9;-><init>([Ljava/lang/Object;II)V

    return-object v0
.end method

.method public final d()LAo9;
    .locals 4

    new-instance v0, Lcv9;

    iget-object v1, p0, Lny9;->e:[Ljava/lang/Object;

    const/4 v2, 0x0

    iget v3, p0, Lny9;->f:I

    invoke-direct {v0, p0, v1, v2, v3}, Lcv9;-><init>(Lpl9;[Ljava/lang/Object;II)V

    return-object v0
.end method

.method public final e()LAo9;
    .locals 4

    new-instance v0, Llx9;

    iget-object v1, p0, Lny9;->e:[Ljava/lang/Object;

    const/4 v2, 0x0

    iget v3, p0, Lny9;->f:I

    invoke-direct {v0, v1, v2, v3}, Llx9;-><init>([Ljava/lang/Object;II)V

    new-instance v1, Lmw9;

    invoke-direct {v1, p0, v0}, Lmw9;-><init>(Lpl9;LEd9;)V

    return-object v1
.end method

.method public final get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lny9;->e:[Ljava/lang/Object;

    iget v1, p0, Lny9;->f:I

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

    iget v0, p0, Lny9;->f:I

    return v0
.end method
