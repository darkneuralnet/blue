.class public final LzH0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LKd0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LzH0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:LlG2;

.field public final b:LzH0$a;


# direct methods
.method public constructor <init>(LlG2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, LzH0$a;->b:LzH0$a;

    iput-object p1, p0, LzH0$a;->a:LlG2;

    return-void
.end method

.method public synthetic constructor <init>(LlG2;LyH0;)V
    .locals 0

    invoke-direct {p0, p1}, LzH0$a;-><init>(LlG2;)V

    return-void
.end method


# virtual methods
.method public a(LId0;)V
    .locals 0

    invoke-virtual {p0, p1}, LzH0$a;->c(LId0;)LId0;

    return-void
.end method

.method public final b()LTd0;
    .locals 3

    new-instance v0, LTd0;

    iget-object v1, p0, LzH0$a;->a:LlG2;

    invoke-interface {v1}, LlG2;->x()LaM;

    move-result-object v1

    invoke-static {v1}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LaM;

    iget-object v2, p0, LzH0$a;->a:LlG2;

    invoke-interface {v2}, LlG2;->w2()Le13;

    move-result-object v2

    invoke-static {v2}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Le13;

    invoke-direct {v0, v1, v2}, LTd0;-><init>(LaM;Le13;)V

    return-object v0
.end method

.method public final c(LId0;)LId0;
    .locals 1

    invoke-virtual {p0}, LzH0$a;->b()LTd0;

    move-result-object v0

    invoke-static {p1, v0}, LJd0;->b(LId0;LTd0;)V

    return-object p1
.end method
