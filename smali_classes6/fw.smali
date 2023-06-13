.class public final Lfw;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ltj1<",
        "Lew;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "Lpd5;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "LId;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "Lu62;",
            ">;"
        }
    .end annotation
.end field

.field public final d:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "Lx62;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LZ94;LZ94;LZ94;LZ94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZ94<",
            "Lpd5;",
            ">;",
            "LZ94<",
            "LId;",
            ">;",
            "LZ94<",
            "Lu62;",
            ">;",
            "LZ94<",
            "Lx62;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfw;->a:LZ94;

    iput-object p2, p0, Lfw;->b:LZ94;

    iput-object p3, p0, Lfw;->c:LZ94;

    iput-object p4, p0, Lfw;->d:LZ94;

    return-void
.end method

.method public static a(LZ94;LZ94;LZ94;LZ94;)Lfw;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZ94<",
            "Lpd5;",
            ">;",
            "LZ94<",
            "LId;",
            ">;",
            "LZ94<",
            "Lu62;",
            ">;",
            "LZ94<",
            "Lx62;",
            ">;)",
            "Lfw;"
        }
    .end annotation

    new-instance v0, Lfw;

    invoke-direct {v0, p0, p1, p2, p3}, Lfw;-><init>(LZ94;LZ94;LZ94;LZ94;)V

    return-object v0
.end method

.method public static c(Lpd5;LId;Lu62;Lx62;)Lew;
    .locals 1

    new-instance v0, Lew;

    invoke-direct {v0, p0, p1, p2, p3}, Lew;-><init>(Lpd5;LId;Lu62;Lx62;)V

    return-object v0
.end method


# virtual methods
.method public b()Lew;
    .locals 4

    iget-object v0, p0, Lfw;->a:LZ94;

    invoke-interface {v0}, LZ94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpd5;

    iget-object v1, p0, Lfw;->b:LZ94;

    invoke-interface {v1}, LZ94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LId;

    iget-object v2, p0, Lfw;->c:LZ94;

    invoke-interface {v2}, LZ94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lu62;

    iget-object v3, p0, Lfw;->d:LZ94;

    invoke-interface {v3}, LZ94;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lx62;

    invoke-static {v0, v1, v2, v3}, Lfw;->c(Lpd5;LId;Lu62;Lx62;)Lew;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lfw;->b()Lew;

    move-result-object v0

    return-object v0
.end method
