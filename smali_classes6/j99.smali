.class public final Lj99;
.super LcG7;
.source "SourceFile"


# instance fields
.field public final synthetic a:LcD1$n;


# direct methods
.method public constructor <init>(LcD1;LcD1$n;)V
    .locals 0

    iput-object p2, p0, Lj99;->a:LcD1$n;

    invoke-direct {p0}, LcG7;-><init>()V

    return-void
.end method


# virtual methods
.method public final A(LOf7;)V
    .locals 2

    iget-object v0, p0, Lj99;->a:LcD1$n;

    new-instance v1, LDX3;

    invoke-direct {v1, p1}, LDX3;-><init>(LOf7;)V

    invoke-interface {v0, v1}, LcD1$n;->a(LDX3;)V

    return-void
.end method
