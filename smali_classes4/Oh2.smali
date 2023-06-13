.class public final LOh2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LQh2;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LNh2;

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LNh2;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LNh2;",
            "LY94<",
            "Landroid/content/Context;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LOh2;->a:LNh2;

    iput-object p2, p0, LOh2;->b:LY94;

    return-void
.end method

.method public static a(LNh2;LY94;)LOh2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LNh2;",
            "LY94<",
            "Landroid/content/Context;",
            ">;)",
            "LOh2;"
        }
    .end annotation

    new-instance v0, LOh2;

    invoke-direct {v0, p0, p1}, LOh2;-><init>(LNh2;LY94;)V

    return-object v0
.end method

.method public static c(LNh2;Landroid/content/Context;)LQh2;
    .locals 0

    invoke-virtual {p0, p1}, LNh2;->a(Landroid/content/Context;)LQh2;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LQh2;

    return-object p0
.end method


# virtual methods
.method public b()LQh2;
    .locals 2

    iget-object v0, p0, LOh2;->a:LNh2;

    iget-object v1, p0, LOh2;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    invoke-static {v0, v1}, LOh2;->c(LNh2;Landroid/content/Context;)LQh2;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LOh2;->b()LQh2;

    move-result-object v0

    return-object v0
.end method
