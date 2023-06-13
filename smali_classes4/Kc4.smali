.class public final LKc4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LJc4;",
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

    iput-object p1, p0, LKc4;->a:LY94;

    return-void
.end method

.method public static a(LY94;)LKc4;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Landroid/content/Context;",
            ">;)",
            "LKc4;"
        }
    .end annotation

    new-instance v0, LKc4;

    invoke-direct {v0, p0}, LKc4;-><init>(LY94;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;)LJc4;
    .locals 1

    new-instance v0, LJc4;

    invoke-direct {v0, p0}, LJc4;-><init>(Landroid/content/Context;)V

    return-object v0
.end method


# virtual methods
.method public b()LJc4;
    .locals 1

    iget-object v0, p0, LKc4;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-static {v0}, LKc4;->c(Landroid/content/Context;)LJc4;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LKc4;->b()LJc4;

    move-result-object v0

    return-object v0
.end method
