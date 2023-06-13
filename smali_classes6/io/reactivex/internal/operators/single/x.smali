.class public final Lio/reactivex/internal/operators/single/x;
.super Lio/reactivex/F;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/reactivex/F<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# static fields
.field public static final b:Lio/reactivex/F;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/F<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/reactivex/internal/operators/single/x;

    invoke-direct {v0}, Lio/reactivex/internal/operators/single/x;-><init>()V

    sput-object v0, Lio/reactivex/internal/operators/single/x;->b:Lio/reactivex/F;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lio/reactivex/F;-><init>()V

    return-void
.end method


# virtual methods
.method public X(Lio/reactivex/I;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/I<",
            "-",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    sget-object v0, Lio/reactivex/internal/disposables/e;->c:Lio/reactivex/internal/disposables/e;

    invoke-interface {p1, v0}, Lio/reactivex/I;->onSubscribe(Lio/reactivex/disposables/c;)V

    return-void
.end method
