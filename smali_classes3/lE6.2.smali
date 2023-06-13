.class public final LlE6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LkE6;",
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


# direct methods
.method public constructor <init>(LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Landroid/content/Context;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LlE6;->a:LY94;

    return-void
.end method

.method public static a(LY94;)LlE6;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Landroid/content/Context;",
            ">;)",
            "LlE6;"
        }
    .end annotation

    new-instance v0, LlE6;

    invoke-direct {v0, p0}, LlE6;-><init>(LY94;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;)LkE6;
    .locals 1

    new-instance v0, LkE6;

    invoke-direct {v0, p0}, LkE6;-><init>(Landroid/content/Context;)V

    return-object v0
.end method


# virtual methods
.method public b()LkE6;
    .locals 1

    iget-object v0, p0, LlE6;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-static {v0}, LlE6;->c(Landroid/content/Context;)LkE6;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LlE6;->b()LkE6;

    move-result-object v0

    return-object v0
.end method
