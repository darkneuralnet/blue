.class public final Lio/reactivex/internal/operators/completable/j;
.super Lio/reactivex/c;
.source "SourceFile"


# instance fields
.field public final b:Ljava/lang/Throwable;


# direct methods
.method public constructor <init>(Ljava/lang/Throwable;)V
    .locals 0

    invoke-direct {p0}, Lio/reactivex/c;-><init>()V

    iput-object p1, p0, Lio/reactivex/internal/operators/completable/j;->b:Ljava/lang/Throwable;

    return-void
.end method


# virtual methods
.method public W(Lio/reactivex/f;)V
    .locals 1

    iget-object v0, p0, Lio/reactivex/internal/operators/completable/j;->b:Ljava/lang/Throwable;

    invoke-static {v0, p1}, Lio/reactivex/internal/disposables/e;->g(Ljava/lang/Throwable;Lio/reactivex/f;)V

    return-void
.end method
