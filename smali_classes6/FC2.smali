.class public final LFC2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ltj1<",
        "LEC2;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "Lqy0;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "LlW2;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "Lke5;",
            ">;"
        }
    .end annotation
.end field

.field public final d:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "Lei3;",
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
            "Lqy0;",
            ">;",
            "LZ94<",
            "LlW2;",
            ">;",
            "LZ94<",
            "Lke5;",
            ">;",
            "LZ94<",
            "Lei3;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LFC2;->a:LZ94;

    iput-object p2, p0, LFC2;->b:LZ94;

    iput-object p3, p0, LFC2;->c:LZ94;

    iput-object p4, p0, LFC2;->d:LZ94;

    return-void
.end method

.method public static a(LZ94;LZ94;LZ94;LZ94;)LFC2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZ94<",
            "Lqy0;",
            ">;",
            "LZ94<",
            "LlW2;",
            ">;",
            "LZ94<",
            "Lke5;",
            ">;",
            "LZ94<",
            "Lei3;",
            ">;)",
            "LFC2;"
        }
    .end annotation

    new-instance v0, LFC2;

    invoke-direct {v0, p0, p1, p2, p3}, LFC2;-><init>(LZ94;LZ94;LZ94;LZ94;)V

    return-object v0
.end method

.method public static c(Lqy0;Ljava/lang/Object;Lke5;Lei3;)LEC2;
    .locals 1

    new-instance v0, LEC2;

    check-cast p1, LlW2;

    invoke-direct {v0, p0, p1, p2, p3}, LEC2;-><init>(Lqy0;LlW2;Lke5;Lei3;)V

    return-object v0
.end method


# virtual methods
.method public b()LEC2;
    .locals 4

    iget-object v0, p0, LFC2;->a:LZ94;

    invoke-interface {v0}, LZ94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lqy0;

    iget-object v1, p0, LFC2;->b:LZ94;

    invoke-interface {v1}, LZ94;->get()Ljava/lang/Object;

    move-result-object v1

    iget-object v2, p0, LFC2;->c:LZ94;

    invoke-interface {v2}, LZ94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lke5;

    iget-object v3, p0, LFC2;->d:LZ94;

    invoke-interface {v3}, LZ94;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lei3;

    invoke-static {v0, v1, v2, v3}, LFC2;->c(Lqy0;Ljava/lang/Object;Lke5;Lei3;)LEC2;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LFC2;->b()LEC2;

    move-result-object v0

    return-object v0
.end method
