.class public final Lio/reactivex/internal/operators/observable/B1$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/internal/operators/observable/B1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation


# instance fields
.field public final b:Lio/reactivex/internal/operators/observable/B1$d;

.field public final c:J


# direct methods
.method public constructor <init>(JLio/reactivex/internal/operators/observable/B1$d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lio/reactivex/internal/operators/observable/B1$e;->c:J

    iput-object p3, p0, Lio/reactivex/internal/operators/observable/B1$e;->b:Lio/reactivex/internal/operators/observable/B1$d;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lio/reactivex/internal/operators/observable/B1$e;->b:Lio/reactivex/internal/operators/observable/B1$d;

    iget-wide v1, p0, Lio/reactivex/internal/operators/observable/B1$e;->c:J

    invoke-interface {v0, v1, v2}, Lio/reactivex/internal/operators/observable/B1$d;->b(J)V

    return-void
.end method
