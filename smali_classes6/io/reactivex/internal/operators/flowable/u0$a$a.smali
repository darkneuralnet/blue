.class public final Lio/reactivex/internal/operators/flowable/u0$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/internal/operators/flowable/u0$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation


# instance fields
.field public final synthetic b:Lio/reactivex/internal/operators/flowable/u0$a;


# direct methods
.method public constructor <init>(Lio/reactivex/internal/operators/flowable/u0$a;)V
    .locals 0

    iput-object p1, p0, Lio/reactivex/internal/operators/flowable/u0$a$a;->b:Lio/reactivex/internal/operators/flowable/u0$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/u0$a$a;->b:Lio/reactivex/internal/operators/flowable/u0$a;

    iget-object v0, v0, Lio/reactivex/internal/operators/flowable/u0$a;->d:LoT5;

    invoke-interface {v0}, LoT5;->cancel()V

    return-void
.end method
