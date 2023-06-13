.class public final LB01;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ltj1<",
        "LA01;",
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
            "Lei3;",
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
            "Lqy0;",
            ">;",
            "LZ94<",
            "Lei3;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LB01;->a:LZ94;

    iput-object p2, p0, LB01;->b:LZ94;

    return-void
.end method

.method public static a(LZ94;LZ94;)LB01;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZ94<",
            "Lqy0;",
            ">;",
            "LZ94<",
            "Lei3;",
            ">;)",
            "LB01;"
        }
    .end annotation

    new-instance v0, LB01;

    invoke-direct {v0, p0, p1}, LB01;-><init>(LZ94;LZ94;)V

    return-object v0
.end method

.method public static c(Lqy0;Lei3;)LA01;
    .locals 1

    new-instance v0, LA01;

    invoke-direct {v0, p0, p1}, LA01;-><init>(Lqy0;Lei3;)V

    return-object v0
.end method


# virtual methods
.method public b()LA01;
    .locals 2

    iget-object v0, p0, LB01;->a:LZ94;

    invoke-interface {v0}, LZ94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lqy0;

    iget-object v1, p0, LB01;->b:LZ94;

    invoke-interface {v1}, LZ94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lei3;

    invoke-static {v0, v1}, LB01;->c(Lqy0;Lei3;)LA01;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LB01;->b()LA01;

    move-result-object v0

    return-object v0
.end method
