.class public final LiN0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LXv3;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LiN0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:LlG2;

.field public final b:Ljava/lang/String;

.field public final c:LiN0$b;


# direct methods
.method public constructor <init>(LlG2;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, LiN0$b;->c:LiN0$b;

    iput-object p1, p0, LiN0$b;->a:LlG2;

    iput-object p2, p0, LiN0$b;->b:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(LlG2;Ljava/lang/String;LjN0;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LiN0$b;-><init>(LlG2;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public a(LSv3;)V
    .locals 0

    invoke-virtual {p0, p1}, LiN0$b;->b(LSv3;)LSv3;

    return-void
.end method

.method public final b(LSv3;)LSv3;
    .locals 1

    invoke-virtual {p0}, LiN0$b;->c()Llw3;

    move-result-object v0

    invoke-static {p1, v0}, Low3;->b(LSv3;Llw3;)V

    return-object p1
.end method

.method public final c()Llw3;
    .locals 5

    new-instance v0, Llw3;

    iget-object v1, p0, LiN0$b;->a:LlG2;

    invoke-interface {v1}, LlG2;->F0()Lom3;

    move-result-object v1

    invoke-static {v1}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lom3;

    iget-object v2, p0, LiN0$b;->b:Ljava/lang/String;

    new-instance v3, LQv3;

    invoke-direct {v3}, LQv3;-><init>()V

    iget-object v4, p0, LiN0$b;->a:LlG2;

    invoke-interface {v4}, LlG2;->w2()Le13;

    move-result-object v4

    invoke-static {v4}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Le13;

    invoke-direct {v0, v1, v2, v3, v4}, Llw3;-><init>(Lom3;Ljava/lang/String;LQv3;Le13;)V

    return-object v0
.end method
