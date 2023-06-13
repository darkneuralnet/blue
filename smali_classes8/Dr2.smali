.class public LDr2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZB1;


# instance fields
.field public a:Ljava/util/Collection;

.field public b:Z


# direct methods
.method public constructor <init>(Ljava/util/Collection;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LDr2;->a:Ljava/util/Collection;

    iput-boolean p2, p0, LDr2;->b:Z

    return-void
.end method

.method public static b(LWB1;)Ljava/util/List;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, v0}, LDr2;->c(LWB1;Z)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static c(LWB1;Z)Ljava/util/List;
    .locals 2

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, LDr2;

    invoke-direct {v1, v0, p1}, LDr2;-><init>(Ljava/util/Collection;Z)V

    invoke-virtual {p0, v1}, LWB1;->f(LZB1;)V

    return-object v0
.end method


# virtual methods
.method public a(LWB1;)V
    .locals 1

    iget-boolean v0, p0, LDr2;->b:Z

    if-eqz v0, :cond_0

    instance-of v0, p1, LKr2;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, LWB1;->c0()LbC1;

    move-result-object v0

    check-cast p1, LKr2;

    invoke-virtual {p1}, LBr2;->M0()LEB0;

    move-result-object p1

    invoke-virtual {v0, p1}, LbC1;->f(LEB0;)LBr2;

    move-result-object p1

    iget-object v0, p0, LDr2;->a:Ljava/util/Collection;

    invoke-interface {v0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    return-void

    :cond_0
    instance-of v0, p1, LBr2;

    if-eqz v0, :cond_1

    iget-object v0, p0, LDr2;->a:Ljava/util/Collection;

    invoke-interface {v0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_1
    return-void
.end method
