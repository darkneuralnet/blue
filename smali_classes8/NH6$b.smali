.class public LNH6$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LNH6;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public final a:LJH6;

.field public b:[B

.field public c:[B

.field public d:[B


# direct methods
.method public constructor <init>(LJH6;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, LNH6$b;->b:[B

    iput-object v0, p0, LNH6$b;->c:[B

    iput-object v0, p0, LNH6$b;->d:[B

    iput-object p1, p0, LNH6$b;->a:LJH6;

    return-void
.end method

.method public static synthetic a(LNH6$b;)LJH6;
    .locals 0

    iget-object p0, p0, LNH6$b;->a:LJH6;

    return-object p0
.end method

.method public static synthetic b(LNH6$b;)[B
    .locals 0

    iget-object p0, p0, LNH6$b;->d:[B

    return-object p0
.end method

.method public static synthetic c(LNH6$b;)[B
    .locals 0

    iget-object p0, p0, LNH6$b;->b:[B

    return-object p0
.end method

.method public static synthetic d(LNH6$b;)[B
    .locals 0

    iget-object p0, p0, LNH6$b;->c:[B

    return-object p0
.end method


# virtual methods
.method public e()LNH6;
    .locals 2

    new-instance v0, LNH6;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LNH6;-><init>(LNH6$b;LNH6$a;)V

    return-object v0
.end method

.method public f([B)LNH6$b;
    .locals 0

    invoke-static {p1}, LWH6;->c([B)[B

    move-result-object p1

    iput-object p1, p0, LNH6$b;->d:[B

    return-object p0
.end method

.method public g([B)LNH6$b;
    .locals 0

    invoke-static {p1}, LWH6;->c([B)[B

    move-result-object p1

    iput-object p1, p0, LNH6$b;->c:[B

    return-object p0
.end method

.method public h([B)LNH6$b;
    .locals 0

    invoke-static {p1}, LWH6;->c([B)[B

    move-result-object p1

    iput-object p1, p0, LNH6$b;->b:[B

    return-object p0
.end method
