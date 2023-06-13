.class public final Lte5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ltj1<",
        "Lse5;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "LD21;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "LC21$a;",
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
            "LD21;",
            ">;",
            "LZ94<",
            "LC21$a;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lte5;->a:LZ94;

    iput-object p2, p0, Lte5;->b:LZ94;

    return-void
.end method

.method public static a(LZ94;LZ94;)Lte5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZ94<",
            "LD21;",
            ">;",
            "LZ94<",
            "LC21$a;",
            ">;)",
            "Lte5;"
        }
    .end annotation

    new-instance v0, Lte5;

    invoke-direct {v0, p0, p1}, Lte5;-><init>(LZ94;LZ94;)V

    return-object v0
.end method

.method public static c(LD21;LZ94;)Lse5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LD21;",
            "LZ94<",
            "LC21$a;",
            ">;)",
            "Lse5;"
        }
    .end annotation

    new-instance v0, Lse5;

    invoke-direct {v0, p0, p1}, Lse5;-><init>(LD21;LZ94;)V

    return-object v0
.end method


# virtual methods
.method public b()Lse5;
    .locals 2

    iget-object v0, p0, Lte5;->a:LZ94;

    invoke-interface {v0}, LZ94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LD21;

    iget-object v1, p0, Lte5;->b:LZ94;

    invoke-static {v0, v1}, Lte5;->c(LD21;LZ94;)Lse5;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lte5;->b()Lse5;

    move-result-object v0

    return-object v0
.end method
