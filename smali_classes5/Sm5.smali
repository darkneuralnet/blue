.class public final LSm5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lrj1<",
        "LRm5;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Landroid/content/Context;",
            ">;",
            "LY94<",
            "Ljava/lang/String;",
            ">;",
            "LY94<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LSm5;->a:LY94;

    iput-object p2, p0, LSm5;->b:LY94;

    iput-object p3, p0, LSm5;->c:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;)LSm5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Landroid/content/Context;",
            ">;",
            "LY94<",
            "Ljava/lang/String;",
            ">;",
            "LY94<",
            "Ljava/lang/Integer;",
            ">;)",
            "LSm5;"
        }
    .end annotation

    new-instance v0, LSm5;

    invoke-direct {v0, p0, p1, p2}, LSm5;-><init>(LY94;LY94;LY94;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;Ljava/lang/String;I)LRm5;
    .locals 1

    new-instance v0, LRm5;

    invoke-direct {v0, p0, p1, p2}, LRm5;-><init>(Landroid/content/Context;Ljava/lang/String;I)V

    return-object v0
.end method


# virtual methods
.method public b()LRm5;
    .locals 3

    iget-object v0, p0, LSm5;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, LSm5;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, LSm5;->c:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v0, v1, v2}, LSm5;->c(Landroid/content/Context;Ljava/lang/String;I)LRm5;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LSm5;->b()LRm5;

    move-result-object v0

    return-object v0
.end method
