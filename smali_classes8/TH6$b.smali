.class public LTH6$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LTH6;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public final a:LRH6;

.field public b:I

.field public c:I

.field public d:[B

.field public e:[B

.field public f:[B

.field public g:[B

.field public h:Lwv;

.field public i:[B


# direct methods
.method public constructor <init>(LRH6;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, LTH6$b;->b:I

    const/4 v0, -0x1

    iput v0, p0, LTH6$b;->c:I

    const/4 v0, 0x0

    iput-object v0, p0, LTH6$b;->d:[B

    iput-object v0, p0, LTH6$b;->e:[B

    iput-object v0, p0, LTH6$b;->f:[B

    iput-object v0, p0, LTH6$b;->g:[B

    iput-object v0, p0, LTH6$b;->h:Lwv;

    iput-object v0, p0, LTH6$b;->i:[B

    iput-object p1, p0, LTH6$b;->a:LRH6;

    return-void
.end method

.method public static synthetic a(LTH6$b;)LRH6;
    .locals 0

    iget-object p0, p0, LTH6$b;->a:LRH6;

    return-object p0
.end method

.method public static synthetic b(LTH6$b;)[B
    .locals 0

    iget-object p0, p0, LTH6$b;->i:[B

    return-object p0
.end method

.method public static synthetic c(LTH6$b;)[B
    .locals 0

    iget-object p0, p0, LTH6$b;->d:[B

    return-object p0
.end method

.method public static synthetic d(LTH6$b;)[B
    .locals 0

    iget-object p0, p0, LTH6$b;->e:[B

    return-object p0
.end method

.method public static synthetic e(LTH6$b;)[B
    .locals 0

    iget-object p0, p0, LTH6$b;->f:[B

    return-object p0
.end method

.method public static synthetic f(LTH6$b;)[B
    .locals 0

    iget-object p0, p0, LTH6$b;->g:[B

    return-object p0
.end method

.method public static synthetic g(LTH6$b;)Lwv;
    .locals 0

    iget-object p0, p0, LTH6$b;->h:Lwv;

    return-object p0
.end method

.method public static synthetic h(LTH6$b;)I
    .locals 0

    iget p0, p0, LTH6$b;->b:I

    return p0
.end method

.method public static synthetic i(LTH6$b;)I
    .locals 0

    iget p0, p0, LTH6$b;->c:I

    return p0
.end method


# virtual methods
.method public j()LTH6;
    .locals 2

    new-instance v0, LTH6;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LTH6;-><init>(LTH6$b;LTH6$a;)V

    return-object v0
.end method

.method public k(Lwv;)LTH6$b;
    .locals 0

    iput-object p1, p0, LTH6$b;->h:Lwv;

    return-object p0
.end method

.method public l(I)LTH6$b;
    .locals 0

    iput p1, p0, LTH6$b;->b:I

    return-object p0
.end method

.method public m(I)LTH6$b;
    .locals 0

    iput p1, p0, LTH6$b;->c:I

    return-object p0
.end method

.method public n([B)LTH6$b;
    .locals 0

    invoke-static {p1}, LWH6;->c([B)[B

    move-result-object p1

    iput-object p1, p0, LTH6$b;->f:[B

    return-object p0
.end method

.method public o([B)LTH6$b;
    .locals 0

    invoke-static {p1}, LWH6;->c([B)[B

    move-result-object p1

    iput-object p1, p0, LTH6$b;->g:[B

    return-object p0
.end method

.method public p([B)LTH6$b;
    .locals 0

    invoke-static {p1}, LWH6;->c([B)[B

    move-result-object p1

    iput-object p1, p0, LTH6$b;->e:[B

    return-object p0
.end method

.method public q([B)LTH6$b;
    .locals 0

    invoke-static {p1}, LWH6;->c([B)[B

    move-result-object p1

    iput-object p1, p0, LTH6$b;->d:[B

    return-object p0
.end method
