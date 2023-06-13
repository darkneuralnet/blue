.class public final LdR0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln86;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LdR0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:LlG2;

.field public final b:LdR0$b;


# direct methods
.method public constructor <init>(LlG2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, LdR0$b;->b:LdR0$b;

    iput-object p1, p0, LdR0$b;->a:LlG2;

    return-void
.end method

.method public synthetic constructor <init>(LlG2;LeR0;)V
    .locals 0

    invoke-direct {p0, p1}, LdR0$b;-><init>(LlG2;)V

    return-void
.end method


# virtual methods
.method public a(Ll86;)V
    .locals 0

    invoke-virtual {p0, p1}, LdR0$b;->b(Ll86;)Ll86;

    return-void
.end method

.method public final b(Ll86;)Ll86;
    .locals 1

    invoke-virtual {p0}, LdR0$b;->c()Lu86;

    move-result-object v0

    invoke-static {p1, v0}, Lm86;->b(Ll86;Lu86;)V

    return-object p1
.end method

.method public final c()Lu86;
    .locals 2

    new-instance v0, Lu86;

    iget-object v1, p0, LdR0$b;->a:LlG2;

    invoke-interface {v1}, LlG2;->p()LO86;

    move-result-object v1

    invoke-static {v1}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LO86;

    invoke-direct {v0, v1}, Lu86;-><init>(LO86;)V

    return-object v0
.end method
