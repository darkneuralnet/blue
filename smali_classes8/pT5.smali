.class public final LpT5;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:LmT5;

.field public volatile c:Z


# direct methods
.method public constructor <init>(Ljava/lang/Object;LmT5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LpT5;->a:Ljava/lang/Object;

    iput-object p2, p0, LpT5;->b:LmT5;

    const/4 p1, 0x1

    iput-boolean p1, p0, LpT5;->c:Z

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, LpT5;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, LpT5;

    iget-object v0, p0, LpT5;->a:Ljava/lang/Object;

    iget-object v2, p1, LpT5;->a:Ljava/lang/Object;

    if-ne v0, v2, :cond_0

    iget-object v0, p0, LpT5;->b:LmT5;

    iget-object p1, p1, LpT5;->b:LmT5;

    invoke-virtual {v0, p1}, LmT5;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, LpT5;->a:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    iget-object v1, p0, LpT5;->b:LmT5;

    iget-object v1, v1, LmT5;->f:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method
