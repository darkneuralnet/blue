.class public Lr51;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lio/reactivex/y;)Lio/reactivex/observers/e;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lio/reactivex/y<",
            "TT;>;)",
            "Lio/reactivex/observers/e<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lr51$b;

    invoke-direct {v0, p0}, Lr51$b;-><init>(Lio/reactivex/y;)V

    return-object v0
.end method

.method public static b(Lio/reactivex/H;)Lio/reactivex/observers/e;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lio/reactivex/H<",
            "TT;>;)",
            "Lio/reactivex/observers/e<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lr51$a;

    invoke-direct {v0, p0}, Lr51$a;-><init>(Lio/reactivex/H;)V

    return-object v0
.end method
