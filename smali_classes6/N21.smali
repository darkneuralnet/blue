.class public final LN21;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ltj1<",
        "LL46;",
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

    iput-object p1, p0, LN21;->a:LZ94;

    return-void
.end method

.method public static a(LZ94;)LN21;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZ94<",
            "Lio/reactivex/E;",
            ">;)",
            "LN21;"
        }
    .end annotation

    new-instance v0, LN21;

    invoke-direct {v0, p0}, LN21;-><init>(LZ94;)V

    return-object v0
.end method

.method public static c(Lio/reactivex/E;)LL46;
    .locals 0

    invoke-static {p0}, LI21;->e(Lio/reactivex/E;)LL46;

    move-result-object p0

    invoke-static {p0}, LyZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LL46;

    return-object p0
.end method


# virtual methods
.method public b()LL46;
    .locals 1

    iget-object v0, p0, LN21;->a:LZ94;

    invoke-interface {v0}, LZ94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/reactivex/E;

    invoke-static {v0}, LN21;->c(Lio/reactivex/E;)LL46;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LN21;->b()LL46;

    move-result-object v0

    return-object v0
.end method
