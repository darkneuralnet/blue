.class public final Lio/reactivex/internal/operators/flowable/b0$i;
.super Lio/reactivex/internal/operators/flowable/b0$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/internal/operators/flowable/b0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "i"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lio/reactivex/internal/operators/flowable/b0$a<",
        "TT;>;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = -0x51dae9f17ccbb88eL


# instance fields
.field public final e:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Lio/reactivex/internal/operators/flowable/b0$a;-><init>()V

    iput p1, p0, Lio/reactivex/internal/operators/flowable/b0$i;->e:I

    return-void
.end method


# virtual methods
.method public k()V
    .locals 2

    iget v0, p0, Lio/reactivex/internal/operators/flowable/b0$a;->c:I

    iget v1, p0, Lio/reactivex/internal/operators/flowable/b0$i;->e:I

    if-le v0, v1, :cond_0

    invoke-virtual {p0}, Lio/reactivex/internal/operators/flowable/b0$a;->g()V

    :cond_0
    return-void
.end method
