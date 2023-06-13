.class public final Lwe5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ltj1<",
        "Lve5;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "Lio/reactivex/E;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "LkX;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "Lv41;",
            ">;"
        }
    .end annotation
.end field

.field public final d:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "LsY2;",
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
            "Lio/reactivex/E;",
            ">;",
            "LZ94<",
            "LkX;",
            ">;",
            "LZ94<",
            "Lv41;",
            ">;",
            "LZ94<",
            "LsY2;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwe5;->a:LZ94;

    iput-object p2, p0, Lwe5;->b:LZ94;

    iput-object p3, p0, Lwe5;->c:LZ94;

    iput-object p4, p0, Lwe5;->d:LZ94;

    return-void
.end method

.method public static a(LZ94;LZ94;LZ94;LZ94;)Lwe5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZ94<",
            "Lio/reactivex/E;",
            ">;",
            "LZ94<",
            "LkX;",
            ">;",
            "LZ94<",
            "Lv41;",
            ">;",
            "LZ94<",
            "LsY2;",
            ">;)",
            "Lwe5;"
        }
    .end annotation

    new-instance v0, Lwe5;

    invoke-direct {v0, p0, p1, p2, p3}, Lwe5;-><init>(LZ94;LZ94;LZ94;LZ94;)V

    return-object v0
.end method

.method public static c(Lio/reactivex/E;LkX;Ljava/lang/Object;Ljava/lang/Object;)Lve5;
    .locals 1

    new-instance v0, Lve5;

    check-cast p2, Lv41;

    check-cast p3, LsY2;

    invoke-direct {v0, p0, p1, p2, p3}, Lve5;-><init>(Lio/reactivex/E;LkX;Lv41;LsY2;)V

    return-object v0
.end method


# virtual methods
.method public b()Lve5;
    .locals 4

    iget-object v0, p0, Lwe5;->a:LZ94;

    invoke-interface {v0}, LZ94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/reactivex/E;

    iget-object v1, p0, Lwe5;->b:LZ94;

    invoke-interface {v1}, LZ94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LkX;

    iget-object v2, p0, Lwe5;->c:LZ94;

    invoke-interface {v2}, LZ94;->get()Ljava/lang/Object;

    move-result-object v2

    iget-object v3, p0, Lwe5;->d:LZ94;

    invoke-interface {v3}, LZ94;->get()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v0, v1, v2, v3}, Lwe5;->c(Lio/reactivex/E;LkX;Ljava/lang/Object;Ljava/lang/Object;)Lve5;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lwe5;->b()Lve5;

    move-result-object v0

    return-object v0
.end method
