.class public final LOM0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lml3;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LOM0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:LlG2;

.field public final b:LOM0$b;


# direct methods
.method public constructor <init>(LlG2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, LOM0$b;->b:LOM0$b;

    iput-object p1, p0, LOM0$b;->a:LlG2;

    return-void
.end method

.method public synthetic constructor <init>(LlG2;LPM0;)V
    .locals 0

    invoke-direct {p0, p1}, LOM0$b;-><init>(LlG2;)V

    return-void
.end method


# virtual methods
.method public a(Ljl3;)V
    .locals 0

    invoke-virtual {p0, p1}, LOM0$b;->b(Ljl3;)Ljl3;

    return-void
.end method

.method public final b(Ljl3;)Ljl3;
    .locals 1

    invoke-virtual {p0}, LOM0$b;->c()LQl3;

    move-result-object v0

    invoke-static {p1, v0}, Lll3;->b(Ljl3;LQl3;)V

    return-object p1
.end method

.method public final c()LQl3;
    .locals 4

    new-instance v0, LQl3;

    iget-object v1, p0, LOM0$b;->a:LlG2;

    invoke-interface {v1}, LlG2;->k0()Lot5;

    move-result-object v1

    invoke-static {v1}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lot5;

    iget-object v2, p0, LOM0$b;->a:LlG2;

    invoke-interface {v2}, LlG2;->N2()LTl3;

    move-result-object v2

    invoke-static {v2}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LTl3;

    iget-object v3, p0, LOM0$b;->a:LlG2;

    invoke-interface {v3}, LlG2;->B1()LTq4;

    move-result-object v3

    invoke-static {v3}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LTq4;

    invoke-direct {v0, v1, v2, v3}, LQl3;-><init>(Lot5;LTl3;LTq4;)V

    return-object v0
.end method
