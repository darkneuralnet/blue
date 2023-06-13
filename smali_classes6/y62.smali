.class public final Ly62;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ltj1<",
        "Lx62;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "Lse5;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LZ94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZ94<",
            "Lse5;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly62;->a:LZ94;

    return-void
.end method

.method public static a(LZ94;)Ly62;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZ94<",
            "Lse5;",
            ">;)",
            "Ly62;"
        }
    .end annotation

    new-instance v0, Ly62;

    invoke-direct {v0, p0}, Ly62;-><init>(LZ94;)V

    return-object v0
.end method

.method public static c(Lse5;)Lx62;
    .locals 1

    new-instance v0, Lx62;

    invoke-direct {v0, p0}, Lx62;-><init>(Lse5;)V

    return-object v0
.end method


# virtual methods
.method public b()Lx62;
    .locals 1

    iget-object v0, p0, Ly62;->a:LZ94;

    invoke-interface {v0}, LZ94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lse5;

    invoke-static {v0}, Ly62;->c(Lse5;)Lx62;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ly62;->b()Lx62;

    move-result-object v0

    return-object v0
.end method
