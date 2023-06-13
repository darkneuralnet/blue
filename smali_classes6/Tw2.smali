.class public final LTw2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ltj1<",
        "LSw2;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "Lxi0;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "LBi0;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public final d:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "Ljava/lang/Boolean;",
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
            "Lxi0;",
            ">;",
            "LZ94<",
            "LBi0;",
            ">;",
            "LZ94<",
            "Ljava/lang/Boolean;",
            ">;",
            "LZ94<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LTw2;->a:LZ94;

    iput-object p2, p0, LTw2;->b:LZ94;

    iput-object p3, p0, LTw2;->c:LZ94;

    iput-object p4, p0, LTw2;->d:LZ94;

    return-void
.end method

.method public static a(LZ94;LZ94;LZ94;LZ94;)LTw2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZ94<",
            "Lxi0;",
            ">;",
            "LZ94<",
            "LBi0;",
            ">;",
            "LZ94<",
            "Ljava/lang/Boolean;",
            ">;",
            "LZ94<",
            "Ljava/lang/Boolean;",
            ">;)",
            "LTw2;"
        }
    .end annotation

    new-instance v0, LTw2;

    invoke-direct {v0, p0, p1, p2, p3}, LTw2;-><init>(LZ94;LZ94;LZ94;LZ94;)V

    return-object v0
.end method

.method public static c(Lxi0;LBi0;ZZ)LSw2;
    .locals 1

    new-instance v0, LSw2;

    invoke-direct {v0, p0, p1, p2, p3}, LSw2;-><init>(Lxi0;LBi0;ZZ)V

    return-object v0
.end method


# virtual methods
.method public b()LSw2;
    .locals 4

    iget-object v0, p0, LTw2;->a:LZ94;

    invoke-interface {v0}, LZ94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lxi0;

    iget-object v1, p0, LTw2;->b:LZ94;

    invoke-interface {v1}, LZ94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LBi0;

    iget-object v2, p0, LTw2;->c:LZ94;

    invoke-interface {v2}, LZ94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    iget-object v3, p0, LTw2;->d:LZ94;

    invoke-interface {v3}, LZ94;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    invoke-static {v0, v1, v2, v3}, LTw2;->c(Lxi0;LBi0;ZZ)LSw2;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LTw2;->b()LSw2;

    move-result-object v0

    return-object v0
.end method
