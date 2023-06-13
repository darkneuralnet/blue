.class public final LVx2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ltj1<",
        "LUx2;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "LtW1;",
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
            "LtW1;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LVx2;->a:LZ94;

    return-void
.end method

.method public static a(LZ94;)LVx2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZ94<",
            "LtW1;",
            ">;)",
            "LVx2;"
        }
    .end annotation

    new-instance v0, LVx2;

    invoke-direct {v0, p0}, LVx2;-><init>(LZ94;)V

    return-object v0
.end method

.method public static c(LtW1;)LUx2;
    .locals 1

    new-instance v0, LUx2;

    invoke-direct {v0, p0}, LUx2;-><init>(LtW1;)V

    return-object v0
.end method


# virtual methods
.method public b()LUx2;
    .locals 1

    iget-object v0, p0, LVx2;->a:LZ94;

    invoke-interface {v0}, LZ94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LtW1;

    invoke-static {v0}, LVx2;->c(LtW1;)LUx2;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LVx2;->b()LUx2;

    move-result-object v0

    return-object v0
.end method
