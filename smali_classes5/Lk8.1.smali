.class public final LLk8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnn8;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lnn8<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final a:LKj8;

.field public final b:LDq8;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LDq8<",
            "**>;"
        }
    .end annotation
.end field

.field public final c:Ll98;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll98<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LDq8;Ll98;LKj8;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LDq8<",
            "**>;",
            "Ll98<",
            "*>;",
            "LKj8;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LLk8;->b:LDq8;

    invoke-virtual {p2, p3}, Ll98;->c(LKj8;)Z

    iput-object p2, p0, LLk8;->c:Ll98;

    iput-object p3, p0, LLk8;->a:LKj8;

    return-void
.end method

.method public static a(LDq8;Ll98;LKj8;)LLk8;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LDq8<",
            "**>;",
            "Ll98<",
            "*>;",
            "LKj8;",
            ")",
            "LLk8<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, LLk8;

    invoke-direct {v0, p0, p1, p2}, LLk8;-><init>(LDq8;Ll98;LKj8;)V

    return-object v0
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    iget-object v0, p0, LLk8;->b:LDq8;

    invoke-virtual {v0, p1}, LDq8;->e(Ljava/lang/Object;)V

    iget-object v0, p0, LLk8;->c:Ll98;

    invoke-virtual {v0, p1}, Ll98;->b(Ljava/lang/Object;)V

    return-void
.end method

.method public final c(Ljava/lang/Object;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)Z"
        }
    .end annotation

    iget-object v0, p0, LLk8;->c:Ll98;

    invoke-virtual {v0, p1}, Ll98;->a(Ljava/lang/Object;)Lwa8;

    const/4 p1, 0x0

    throw p1
.end method

.method public final d(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;TT;)Z"
        }
    .end annotation

    iget-object v0, p0, LLk8;->b:LDq8;

    invoke-virtual {v0, p1}, LDq8;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, LLk8;->b:LDq8;

    invoke-virtual {v0, p2}, LDq8;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method public final e(Ljava/lang/Object;[BIILd38;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;[BII",
            "Ld38;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    move-object p2, p1

    check-cast p2, LPb8;

    iget-object p3, p2, LPb8;->zzc:LPq8;

    invoke-static {}, LPq8;->a()LPq8;

    move-result-object p4

    if-eq p3, p4, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, LPq8;->c()LPq8;

    move-result-object p3

    iput-object p3, p2, LPb8;->zzc:LPq8;

    :goto_0
    check-cast p1, LBb8;

    const/4 p1, 0x0

    throw p1
.end method

.method public final f(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;TT;)V"
        }
    .end annotation

    iget-object v0, p0, LLk8;->b:LDq8;

    invoke-static {v0, p1, p2}, LLn8;->f(LDq8;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public final zza(Ljava/lang/Object;)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)I"
        }
    .end annotation

    iget-object v0, p0, LLk8;->b:LDq8;

    invoke-virtual {v0, p1}, LDq8;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result p1

    return p1
.end method

.method public final zzd()Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, LLk8;->a:LKj8;

    check-cast v0, LPb8;

    const/4 v1, 0x5

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v2}, LPb8;->h(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnb8;

    invoke-interface {v0}, Lxj8;->zzg()LKj8;

    move-result-object v0

    return-object v0
.end method
