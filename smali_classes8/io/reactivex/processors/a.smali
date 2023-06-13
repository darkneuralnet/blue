.class public abstract Lio/reactivex/processors/a;
.super Lio/reactivex/k;
.source "SourceFile"

# interfaces
.implements LhT5;
.implements Lio/reactivex/o;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lio/reactivex/k<",
        "TT;>;",
        "LhT5;",
        "Lio/reactivex/o<",
        "TT;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lio/reactivex/k;-><init>()V

    return-void
.end method


# virtual methods
.method public final x1()Lio/reactivex/processors/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/processors/a<",
            "TT;>;"
        }
    .end annotation

    instance-of v0, p0, Lio/reactivex/processors/c;

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    new-instance v0, Lio/reactivex/processors/c;

    invoke-direct {v0, p0}, Lio/reactivex/processors/c;-><init>(Lio/reactivex/processors/a;)V

    return-object v0
.end method
