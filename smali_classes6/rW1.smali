.class public final LrW1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ltj1<",
        "LqW1;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "LsW1;",
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
            "LsW1;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LrW1;->a:LZ94;

    return-void
.end method

.method public static a(LZ94;)LrW1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZ94<",
            "LsW1;",
            ">;)",
            "LrW1;"
        }
    .end annotation

    new-instance v0, LrW1;

    invoke-direct {v0, p0}, LrW1;-><init>(LZ94;)V

    return-object v0
.end method

.method public static c(LsW1;)LqW1;
    .locals 1

    new-instance v0, LqW1;

    invoke-direct {v0, p0}, LqW1;-><init>(LsW1;)V

    return-object v0
.end method


# virtual methods
.method public b()LqW1;
    .locals 1

    iget-object v0, p0, LrW1;->a:LZ94;

    invoke-interface {v0}, LZ94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LsW1;

    invoke-static {v0}, LrW1;->c(LsW1;)LqW1;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LrW1;->b()LqW1;

    move-result-object v0

    return-object v0
.end method
