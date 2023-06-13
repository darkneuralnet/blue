.class public final LLw2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ltj1<",
        "LKw2;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "LNw2;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LZ94;LZ94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZ94<",
            "Landroid/content/Context;",
            ">;",
            "LZ94<",
            "LNw2;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LLw2;->a:LZ94;

    iput-object p2, p0, LLw2;->b:LZ94;

    return-void
.end method

.method public static a(LZ94;LZ94;)LLw2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZ94<",
            "Landroid/content/Context;",
            ">;",
            "LZ94<",
            "LNw2;",
            ">;)",
            "LLw2;"
        }
    .end annotation

    new-instance v0, LLw2;

    invoke-direct {v0, p0, p1}, LLw2;-><init>(LZ94;LZ94;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;LNw2;)LKw2;
    .locals 1

    new-instance v0, LKw2;

    invoke-direct {v0, p0, p1}, LKw2;-><init>(Landroid/content/Context;LNw2;)V

    return-object v0
.end method


# virtual methods
.method public b()LKw2;
    .locals 2

    iget-object v0, p0, LLw2;->a:LZ94;

    invoke-interface {v0}, LZ94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, LLw2;->b:LZ94;

    invoke-interface {v1}, LZ94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LNw2;

    invoke-static {v0, v1}, LLw2;->c(Landroid/content/Context;LNw2;)LKw2;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LLw2;->b()LKw2;

    move-result-object v0

    return-object v0
.end method
