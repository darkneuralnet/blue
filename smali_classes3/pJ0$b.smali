.class public final LpJ0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LFp1;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LpJ0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:LlG2;

.field public final b:LpJ0$b;


# direct methods
.method public constructor <init>(LlG2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, LpJ0$b;->b:LpJ0$b;

    iput-object p1, p0, LpJ0$b;->a:LlG2;

    return-void
.end method

.method public synthetic constructor <init>(LlG2;LqJ0;)V
    .locals 0

    invoke-direct {p0, p1}, LpJ0$b;-><init>(LlG2;)V

    return-void
.end method


# virtual methods
.method public a(LDp1;)V
    .locals 0

    invoke-virtual {p0, p1}, LpJ0$b;->c(LDp1;)LDp1;

    return-void
.end method

.method public final b()Laq1;
    .locals 2

    new-instance v0, Laq1;

    iget-object v1, p0, LpJ0$b;->a:LlG2;

    invoke-interface {v1}, LlG2;->Y2()LHp1;

    move-result-object v1

    invoke-static {v1}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LHp1;

    invoke-direct {v0, v1}, Laq1;-><init>(LHp1;)V

    return-object v0
.end method

.method public final c(LDp1;)LDp1;
    .locals 1

    invoke-virtual {p0}, LpJ0$b;->b()Laq1;

    move-result-object v0

    invoke-static {p1, v0}, LGp1;->b(LDp1;Laq1;)V

    return-object p1
.end method
