.class public final synthetic LSI5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:J


# direct methods
.method public synthetic constructor <init>(J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, LSI5;->b:J

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-wide v0, p0, LSI5;->b:J

    invoke-static {v0, v1}, Lco/bird/android/app/manager/SmartlockManagerImpl;->A(J)Lio/reactivex/h;

    move-result-object v0

    return-object v0
.end method
