.class public final Lio/reactivex/internal/operators/flowable/f$a$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/internal/operators/flowable/f$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "c"
.end annotation


# instance fields
.field public final b:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field public final synthetic c:Lio/reactivex/internal/operators/flowable/f$a;


# direct methods
.method public constructor <init>(Lio/reactivex/internal/operators/flowable/f$a;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/reactivex/internal/operators/flowable/f$a$c;->c:Lio/reactivex/internal/operators/flowable/f$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lio/reactivex/internal/operators/flowable/f$a$c;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/f$a$c;->c:Lio/reactivex/internal/operators/flowable/f$a;

    iget-object v0, v0, Lio/reactivex/internal/operators/flowable/f$a;->b:LhT5;

    iget-object v1, p0, Lio/reactivex/internal/operators/flowable/f$a$c;->b:Ljava/lang/Object;

    invoke-interface {v0, v1}, LhT5;->onNext(Ljava/lang/Object;)V

    return-void
.end method
