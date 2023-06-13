.class public final LYu7;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LXu7;

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LIw7;Ljava/lang/Object;LIw7;Ljava/lang/Object;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LXu7;

    invoke-direct {v0, p1, p2, p3, p4}, LXu7;-><init>(LIw7;Ljava/lang/Object;LIw7;Ljava/lang/Object;)V

    iput-object v0, p0, LYu7;->a:LXu7;

    iput-object p2, p0, LYu7;->b:Ljava/lang/Object;

    iput-object p4, p0, LYu7;->c:Ljava/lang/Object;

    return-void
.end method

.method public static b(LXu7;Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    iget-object v0, p0, LXu7;->a:LIw7;

    const/4 v1, 0x1

    invoke-static {v0, v1, p1}, LEt7;->a(LIw7;ILjava/lang/Object;)I

    move-result p1

    iget-object p0, p0, LXu7;->c:LIw7;

    const/4 v0, 0x2

    invoke-static {p0, v0, p2}, LEt7;->a(LIw7;ILjava/lang/Object;)I

    move-result p0

    add-int/2addr p1, p0

    return p1
.end method

.method public static d(LIw7;Ljava/lang/Object;LIw7;Ljava/lang/Object;)LYu7;
    .locals 1

    new-instance v0, LYu7;

    invoke-direct {v0, p0, p1, p2, p3}, LYu7;-><init>(LIw7;Ljava/lang/Object;LIw7;Ljava/lang/Object;)V

    return-object v0
.end method

.method public static e(Lut7;LXu7;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p1, LXu7;->a:LIw7;

    const/4 v1, 0x1

    invoke-static {p0, v0, v1, p2}, LEt7;->l(Lut7;LIw7;ILjava/lang/Object;)V

    iget-object p1, p1, LXu7;->c:LIw7;

    const/4 p2, 0x2

    invoke-static {p0, p1, p2, p3}, LEt7;->l(Lut7;LIw7;ILjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final a(ILjava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    invoke-static {p1}, Lut7;->l(I)I

    move-result p1

    iget-object v0, p0, LYu7;->a:LXu7;

    invoke-static {v0, p2, p3}, LYu7;->b(LXu7;Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p2

    invoke-static {p2}, Lut7;->m(I)I

    move-result p3

    add-int/2addr p3, p2

    add-int/2addr p1, p3

    return p1
.end method

.method public final c()LXu7;
    .locals 1

    iget-object v0, p0, LYu7;->a:LXu7;

    return-object v0
.end method
