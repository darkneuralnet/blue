.class public LML4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkc1;


# instance fields
.field public final a:Lkc1;

.field public final b:LMc1;


# direct methods
.method public constructor <init>(Lkc1;LTe4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LML4;->a:Lkc1;

    const-class p1, LB74;

    invoke-virtual {p2, p1}, LTe4;->c(Ljava/lang/Class;)Ljava/util/List;

    move-result-object p1

    new-instance p2, LMc1;

    invoke-direct {p2, p1}, LMc1;-><init>(Ljava/util/List;)V

    iput-object p2, p0, LML4;->b:LMc1;

    return-void
.end method


# virtual methods
.method public a(I)Llc1;
    .locals 1

    iget-object v0, p0, LML4;->a:Lkc1;

    invoke-interface {v0, p1}, Lkc1;->b(I)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v0, p0, LML4;->a:Lkc1;

    invoke-interface {v0, p1}, Lkc1;->a(I)Llc1;

    move-result-object p1

    iget-object v0, p0, LML4;->b:LMc1;

    invoke-virtual {v0}, LMc1;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, LML4;->b:LMc1;

    invoke-virtual {v0, p1}, LMc1;->a(Llc1;)Llc1;

    move-result-object p1

    :cond_1
    return-object p1
.end method

.method public b(I)Z
    .locals 1

    iget-object v0, p0, LML4;->a:Lkc1;

    invoke-interface {v0, p1}, Lkc1;->b(I)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-object v0, p0, LML4;->b:LMc1;

    invoke-virtual {v0}, LMc1;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, LML4;->a:Lkc1;

    invoke-interface {v0, p1}, Lkc1;->a(I)Llc1;

    move-result-object p1

    iget-object v0, p0, LML4;->b:LMc1;

    invoke-virtual {v0, p1}, LMc1;->d(Llc1;)Z

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x1

    return p1
.end method
