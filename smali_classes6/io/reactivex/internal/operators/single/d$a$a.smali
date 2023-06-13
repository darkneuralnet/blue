.class public final Lio/reactivex/internal/operators/single/d$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/internal/operators/single/d$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation


# instance fields
.field public final b:Ljava/lang/Throwable;

.field public final synthetic c:Lio/reactivex/internal/operators/single/d$a;


# direct methods
.method public constructor <init>(Lio/reactivex/internal/operators/single/d$a;Ljava/lang/Throwable;)V
    .locals 0

    iput-object p1, p0, Lio/reactivex/internal/operators/single/d$a$a;->c:Lio/reactivex/internal/operators/single/d$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lio/reactivex/internal/operators/single/d$a$a;->b:Ljava/lang/Throwable;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lio/reactivex/internal/operators/single/d$a$a;->c:Lio/reactivex/internal/operators/single/d$a;

    iget-object v0, v0, Lio/reactivex/internal/operators/single/d$a;->c:Lio/reactivex/I;

    iget-object v1, p0, Lio/reactivex/internal/operators/single/d$a$a;->b:Ljava/lang/Throwable;

    invoke-interface {v0, v1}, Lio/reactivex/I;->onError(Ljava/lang/Throwable;)V

    return-void
.end method
