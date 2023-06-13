.class public abstract Lio/reactivex/subjects/h;
.super Lio/reactivex/Observable;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/D;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lio/reactivex/Observable<",
        "TT;>;",
        "Lio/reactivex/D<",
        "TT;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lio/reactivex/Observable;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lio/reactivex/subjects/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/subjects/h<",
            "TT;>;"
        }
    .end annotation

    instance-of v0, p0, Lio/reactivex/subjects/f;

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    new-instance v0, Lio/reactivex/subjects/f;

    invoke-direct {v0, p0}, Lio/reactivex/subjects/f;-><init>(Lio/reactivex/subjects/h;)V

    return-object v0
.end method
