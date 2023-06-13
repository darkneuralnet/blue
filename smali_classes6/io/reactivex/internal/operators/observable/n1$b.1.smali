.class public final Lio/reactivex/internal/operators/observable/n1$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/internal/operators/observable/n1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "b"
.end annotation


# instance fields
.field public final b:Lio/reactivex/internal/operators/observable/n1$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/internal/operators/observable/n1$a<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final synthetic c:Lio/reactivex/internal/operators/observable/n1;


# direct methods
.method public constructor <init>(Lio/reactivex/internal/operators/observable/n1;Lio/reactivex/internal/operators/observable/n1$a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/internal/operators/observable/n1$a<",
            "TT;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/reactivex/internal/operators/observable/n1$b;->c:Lio/reactivex/internal/operators/observable/n1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lio/reactivex/internal/operators/observable/n1$b;->b:Lio/reactivex/internal/operators/observable/n1$a;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lio/reactivex/internal/operators/observable/n1$b;->c:Lio/reactivex/internal/operators/observable/n1;

    iget-object v0, v0, Lio/reactivex/internal/operators/observable/a;->b:Lio/reactivex/B;

    iget-object v1, p0, Lio/reactivex/internal/operators/observable/n1$b;->b:Lio/reactivex/internal/operators/observable/n1$a;

    invoke-interface {v0, v1}, Lio/reactivex/B;->subscribe(Lio/reactivex/D;)V

    return-void
.end method
