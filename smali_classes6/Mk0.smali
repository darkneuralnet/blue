.class public final LMk0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ltj1<",
        "LLk0;",
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


# direct methods
.method public constructor <init>(LZ94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZ94<",
            "Lio/reactivex/E;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LMk0;->a:LZ94;

    return-void
.end method

.method public static a(LZ94;)LMk0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZ94<",
            "Lio/reactivex/E;",
            ">;)",
            "LMk0;"
        }
    .end annotation

    new-instance v0, LMk0;

    invoke-direct {v0, p0}, LMk0;-><init>(LZ94;)V

    return-object v0
.end method

.method public static c(Lio/reactivex/E;)LLk0;
    .locals 1

    new-instance v0, LLk0;

    invoke-direct {v0, p0}, LLk0;-><init>(Lio/reactivex/E;)V

    return-object v0
.end method


# virtual methods
.method public b()LLk0;
    .locals 1

    iget-object v0, p0, LMk0;->a:LZ94;

    invoke-interface {v0}, LZ94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/reactivex/E;

    invoke-static {v0}, LMk0;->c(Lio/reactivex/E;)LLk0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LMk0;->b()LLk0;

    move-result-object v0

    return-object v0
.end method
