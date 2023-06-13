.class public final LqQ1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LpQ1;",
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

    iput-object p1, p0, LqQ1;->a:LY94;

    return-void
.end method

.method public static a(LY94;)LqQ1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Landroid/content/Context;",
            ">;)",
            "LqQ1;"
        }
    .end annotation

    new-instance v0, LqQ1;

    invoke-direct {v0, p0}, LqQ1;-><init>(LY94;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;)LpQ1;
    .locals 1

    new-instance v0, LpQ1;

    invoke-direct {v0, p0}, LpQ1;-><init>(Landroid/content/Context;)V

    return-object v0
.end method


# virtual methods
.method public b()LpQ1;
    .locals 1

    iget-object v0, p0, LqQ1;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-static {v0}, LqQ1;->c(Landroid/content/Context;)LpQ1;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LqQ1;->b()LpQ1;

    move-result-object v0

    return-object v0
.end method
