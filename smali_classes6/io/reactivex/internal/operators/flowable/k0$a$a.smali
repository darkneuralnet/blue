.class public final Lio/reactivex/internal/operators/flowable/k0$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/internal/operators/flowable/k0$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final b:LoT5;

.field public final c:J


# direct methods
.method public constructor <init>(LoT5;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/reactivex/internal/operators/flowable/k0$a$a;->b:LoT5;

    iput-wide p2, p0, Lio/reactivex/internal/operators/flowable/k0$a$a;->c:J

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/k0$a$a;->b:LoT5;

    iget-wide v1, p0, Lio/reactivex/internal/operators/flowable/k0$a$a;->c:J

    invoke-interface {v0, v1, v2}, LoT5;->o(J)V

    return-void
.end method
