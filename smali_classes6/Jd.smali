.class public final LJd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ltj1<",
        "LId;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "Ljava/lang/Integer;",
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
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJd;->a:LZ94;

    return-void
.end method

.method public static a(LZ94;)LJd;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZ94<",
            "Ljava/lang/Integer;",
            ">;)",
            "LJd;"
        }
    .end annotation

    new-instance v0, LJd;

    invoke-direct {v0, p0}, LJd;-><init>(LZ94;)V

    return-object v0
.end method

.method public static c(I)LId;
    .locals 1

    new-instance v0, LId;

    invoke-direct {v0, p0}, LId;-><init>(I)V

    return-object v0
.end method


# virtual methods
.method public b()LId;
    .locals 1

    iget-object v0, p0, LJd;->a:LZ94;

    invoke-interface {v0}, LZ94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, LJd;->c(I)LId;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LJd;->b()LId;

    move-result-object v0

    return-object v0
.end method
