.class public final Lr41;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ltj1<",
        "Lq41;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "LKk0;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "Ls41;",
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
            "LKk0;",
            ">;",
            "LZ94<",
            "Ls41;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr41;->a:LZ94;

    iput-object p2, p0, Lr41;->b:LZ94;

    return-void
.end method

.method public static a(LZ94;LZ94;)Lr41;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZ94<",
            "LKk0;",
            ">;",
            "LZ94<",
            "Ls41;",
            ">;)",
            "Lr41;"
        }
    .end annotation

    new-instance v0, Lr41;

    invoke-direct {v0, p0, p1}, Lr41;-><init>(LZ94;LZ94;)V

    return-object v0
.end method

.method public static c(LKk0;Ls41;)Lq41;
    .locals 1

    new-instance v0, Lq41;

    invoke-direct {v0, p0, p1}, Lq41;-><init>(LKk0;Ls41;)V

    return-object v0
.end method


# virtual methods
.method public b()Lq41;
    .locals 2

    iget-object v0, p0, Lr41;->a:LZ94;

    invoke-interface {v0}, LZ94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LKk0;

    iget-object v1, p0, Lr41;->b:LZ94;

    invoke-interface {v1}, LZ94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ls41;

    invoke-static {v0, v1}, Lr41;->c(LKk0;Ls41;)Lq41;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lr41;->b()Lq41;

    move-result-object v0

    return-object v0
.end method
