.class public final LJJ0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LKs1;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LJJ0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:LlG2;

.field public final b:LJJ0$b;


# direct methods
.method public constructor <init>(LlG2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, LJJ0$b;->b:LJJ0$b;

    iput-object p1, p0, LJJ0$b;->a:LlG2;

    return-void
.end method

.method public synthetic constructor <init>(LlG2;LKJ0;)V
    .locals 0

    invoke-direct {p0, p1}, LJJ0$b;-><init>(LlG2;)V

    return-void
.end method


# virtual methods
.method public a(LJs1;)V
    .locals 0

    invoke-virtual {p0, p1}, LJJ0$b;->c(LJs1;)LJs1;

    return-void
.end method

.method public final b()LNs1;
    .locals 2

    new-instance v0, LNs1;

    iget-object v1, p0, LJJ0$b;->a:LlG2;

    invoke-interface {v1}, LlG2;->r()Lgl;

    move-result-object v1

    invoke-static {v1}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lgl;

    invoke-direct {v0, v1}, LNs1;-><init>(Lgl;)V

    return-object v0
.end method

.method public final c(LJs1;)LJs1;
    .locals 1

    invoke-virtual {p0}, LJJ0$b;->b()LNs1;

    move-result-object v0

    invoke-static {p1, v0}, LLs1;->b(LJs1;LNs1;)V

    return-object p1
.end method
