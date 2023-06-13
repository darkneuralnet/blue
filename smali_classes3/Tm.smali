.class public final LTm;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LSm;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LTq4;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Ldr4;",
            ">;"
        }
    .end annotation
.end field

.field public final d:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lbn;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LTq4;",
            ">;",
            "LY94<",
            "Landroid/content/Context;",
            ">;",
            "LY94<",
            "Ldr4;",
            ">;",
            "LY94<",
            "Lbn;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LTm;->a:LY94;

    iput-object p2, p0, LTm;->b:LY94;

    iput-object p3, p0, LTm;->c:LY94;

    iput-object p4, p0, LTm;->d:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;LY94;)LTm;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LTq4;",
            ">;",
            "LY94<",
            "Landroid/content/Context;",
            ">;",
            "LY94<",
            "Ldr4;",
            ">;",
            "LY94<",
            "Lbn;",
            ">;)",
            "LTm;"
        }
    .end annotation

    new-instance v0, LTm;

    invoke-direct {v0, p0, p1, p2, p3}, LTm;-><init>(LY94;LY94;LY94;LY94;)V

    return-object v0
.end method

.method public static c(LTq4;Landroid/content/Context;Ldr4;Lbn;)LSm;
    .locals 1

    new-instance v0, LSm;

    invoke-direct {v0, p0, p1, p2, p3}, LSm;-><init>(LTq4;Landroid/content/Context;Ldr4;Lbn;)V

    return-object v0
.end method


# virtual methods
.method public b()LSm;
    .locals 4

    iget-object v0, p0, LTm;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LTq4;

    iget-object v1, p0, LTm;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    iget-object v2, p0, LTm;->c:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ldr4;

    iget-object v3, p0, LTm;->d:LY94;

    invoke-interface {v3}, LY94;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lbn;

    invoke-static {v0, v1, v2, v3}, LTm;->c(LTq4;Landroid/content/Context;Ldr4;Lbn;)LSm;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LTm;->b()LSm;

    move-result-object v0

    return-object v0
.end method
