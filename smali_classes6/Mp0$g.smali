.class public final LMp0$g;
.super LO0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LMp0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "g"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LO0<",
        "TK;TV;>;"
    }
.end annotation


# instance fields
.field public final b:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TK;"
        }
    .end annotation
.end field

.field public c:I

.field public final synthetic d:LMp0;


# direct methods
.method public constructor <init>(LMp0;I)V
    .locals 0

    iput-object p1, p0, LMp0$g;->d:LMp0;

    invoke-direct {p0}, LO0;-><init>()V

    invoke-static {p1, p2}, LMp0;->b(LMp0;I)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, LMp0$g;->b:Ljava/lang/Object;

    iput p2, p0, LMp0$g;->c:I

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget v0, p0, LMp0$g;->c:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    iget-object v1, p0, LMp0$g;->d:LMp0;

    invoke-virtual {v1}, LMp0;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    iget-object v0, p0, LMp0$g;->b:Ljava/lang/Object;

    iget-object v1, p0, LMp0$g;->d:LMp0;

    iget v2, p0, LMp0$g;->c:I

    invoke-static {v1, v2}, LMp0;->b(LMp0;I)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, LXd3;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    iget-object v0, p0, LMp0$g;->d:LMp0;

    iget-object v1, p0, LMp0$g;->b:Ljava/lang/Object;

    invoke-static {v0, v1}, LMp0;->i(LMp0;Ljava/lang/Object;)I

    move-result v0

    iput v0, p0, LMp0$g;->c:I

    :cond_1
    return-void
.end method

.method public getKey()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TK;"
        }
    .end annotation

    iget-object v0, p0, LMp0$g;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public getValue()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TV;"
        }
    .end annotation

    iget-object v0, p0, LMp0$g;->d:LMp0;

    invoke-virtual {v0}, LMp0;->x()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, LMp0$g;->b:Ljava/lang/Object;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lrd3;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-virtual {p0}, LMp0$g;->a()V

    iget v0, p0, LMp0$g;->c:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    invoke-static {}, Lrd3;->b()Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :cond_1
    iget-object v1, p0, LMp0$g;->d:LMp0;

    invoke-static {v1, v0}, LMp0;->j(LMp0;I)Ljava/lang/Object;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public setValue(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;)TV;"
        }
    .end annotation

    iget-object v0, p0, LMp0$g;->d:LMp0;

    invoke-virtual {v0}, LMp0;->x()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, LMp0$g;->b:Ljava/lang/Object;

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lrd3;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p0}, LMp0$g;->a()V

    iget v0, p0, LMp0$g;->c:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    iget-object v0, p0, LMp0$g;->d:LMp0;

    iget-object v1, p0, LMp0$g;->b:Ljava/lang/Object;

    invoke-virtual {v0, v1, p1}, LMp0;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lrd3;->b()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    iget-object v1, p0, LMp0$g;->d:LMp0;

    invoke-static {v1, v0}, LMp0;->j(LMp0;I)Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, LMp0$g;->d:LMp0;

    iget v2, p0, LMp0$g;->c:I

    invoke-static {v1, v2, p1}, LMp0;->f(LMp0;ILjava/lang/Object;)V

    return-object v0
.end method
