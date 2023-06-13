.class public final LrW2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ltj1<",
        "LqW2;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "Lve5;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "Ljava/lang/Integer;",
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
            "Lve5;",
            ">;",
            "LZ94<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LrW2;->a:LZ94;

    iput-object p2, p0, LrW2;->b:LZ94;

    return-void
.end method

.method public static a(LZ94;LZ94;)LrW2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZ94<",
            "Lve5;",
            ">;",
            "LZ94<",
            "Ljava/lang/Integer;",
            ">;)",
            "LrW2;"
        }
    .end annotation

    new-instance v0, LrW2;

    invoke-direct {v0, p0, p1}, LrW2;-><init>(LZ94;LZ94;)V

    return-object v0
.end method

.method public static c(Lve5;I)LqW2;
    .locals 1

    new-instance v0, LqW2;

    invoke-direct {v0, p0, p1}, LqW2;-><init>(Lve5;I)V

    return-object v0
.end method


# virtual methods
.method public b()LqW2;
    .locals 2

    iget-object v0, p0, LrW2;->a:LZ94;

    invoke-interface {v0}, LZ94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lve5;

    iget-object v1, p0, LrW2;->b:LZ94;

    invoke-interface {v1}, LZ94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {v0, v1}, LrW2;->c(Lve5;I)LqW2;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LrW2;->b()LqW2;

    move-result-object v0

    return-object v0
.end method
