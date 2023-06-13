.class final Lcom/uber/autodispose/AutoDisposeFlowable;
.super Lio/reactivex/k;
.source "SourceFile"

# interfaces
.implements Lcom/uber/autodispose/FlowableSubscribeProxy;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lio/reactivex/k<",
        "TT;>;",
        "Lcom/uber/autodispose/FlowableSubscribeProxy<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final c:Lna4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lna4<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final d:Lio/reactivex/h;


# direct methods
.method public constructor <init>(Lna4;Lio/reactivex/h;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lna4<",
            "TT;>;",
            "Lio/reactivex/h;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Lio/reactivex/k;-><init>()V

    iput-object p1, p0, Lcom/uber/autodispose/AutoDisposeFlowable;->c:Lna4;

    iput-object p2, p0, Lcom/uber/autodispose/AutoDisposeFlowable;->d:Lio/reactivex/h;

    return-void
.end method


# virtual methods
.method public X0(LhT5;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LhT5<",
            "-TT;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/uber/autodispose/AutoDisposeFlowable;->c:Lna4;

    new-instance v1, Lcom/uber/autodispose/AutoDisposingSubscriberImpl;

    iget-object v2, p0, Lcom/uber/autodispose/AutoDisposeFlowable;->d:Lio/reactivex/h;

    invoke-direct {v1, v2, p1}, Lcom/uber/autodispose/AutoDisposingSubscriberImpl;-><init>(Lio/reactivex/h;LhT5;)V

    invoke-interface {v0, v1}, Lna4;->c(LhT5;)V

    return-void
.end method
