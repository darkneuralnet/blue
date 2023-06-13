.class public final Lio/reactivex/internal/operators/completable/t;
.super Lio/reactivex/c;
.source "SourceFile"


# static fields
.field public static final b:Lio/reactivex/c;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/reactivex/internal/operators/completable/t;

    invoke-direct {v0}, Lio/reactivex/internal/operators/completable/t;-><init>()V

    sput-object v0, Lio/reactivex/internal/operators/completable/t;->b:Lio/reactivex/c;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lio/reactivex/c;-><init>()V

    return-void
.end method


# virtual methods
.method public W(Lio/reactivex/f;)V
    .locals 1

    sget-object v0, Lio/reactivex/internal/disposables/e;->c:Lio/reactivex/internal/disposables/e;

    invoke-interface {p1, v0}, Lio/reactivex/f;->onSubscribe(Lio/reactivex/disposables/c;)V

    return-void
.end method
