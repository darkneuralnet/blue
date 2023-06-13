.class public final LCi0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ltj1<",
        "LBi0;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "Lzi0;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "[[",
            "Ljava/lang/String;",
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
            "Lzi0;",
            ">;",
            "LZ94<",
            "[[",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LCi0;->a:LZ94;

    iput-object p2, p0, LCi0;->b:LZ94;

    return-void
.end method

.method public static a(LZ94;LZ94;)LCi0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZ94<",
            "Lzi0;",
            ">;",
            "LZ94<",
            "[[",
            "Ljava/lang/String;",
            ">;)",
            "LCi0;"
        }
    .end annotation

    new-instance v0, LCi0;

    invoke-direct {v0, p0, p1}, LCi0;-><init>(LZ94;LZ94;)V

    return-object v0
.end method

.method public static c(Lzi0;[[Ljava/lang/String;)LBi0;
    .locals 1

    new-instance v0, LBi0;

    invoke-direct {v0, p0, p1}, LBi0;-><init>(Lzi0;[[Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public b()LBi0;
    .locals 2

    iget-object v0, p0, LCi0;->a:LZ94;

    invoke-interface {v0}, LZ94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzi0;

    iget-object v1, p0, LCi0;->b:LZ94;

    invoke-interface {v1}, LZ94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [[Ljava/lang/String;

    invoke-static {v0, v1}, LCi0;->c(Lzi0;[[Ljava/lang/String;)LBi0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LCi0;->b()LBi0;

    move-result-object v0

    return-object v0
.end method
