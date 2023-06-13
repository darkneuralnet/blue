.class public final synthetic LUI5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:Lco/bird/android/app/manager/SmartlockManagerImpl;

.field public final synthetic c:J


# direct methods
.method public synthetic constructor <init>(Lco/bird/android/app/manager/SmartlockManagerImpl;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LUI5;->b:Lco/bird/android/app/manager/SmartlockManagerImpl;

    iput-wide p2, p0, LUI5;->c:J

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, LUI5;->b:Lco/bird/android/app/manager/SmartlockManagerImpl;

    iget-wide v1, p0, LUI5;->c:J

    invoke-static {v0, v1, v2}, Lco/bird/android/app/manager/SmartlockManagerImpl;->X(Lco/bird/android/app/manager/SmartlockManagerImpl;J)Lio/reactivex/h;

    move-result-object v0

    return-object v0
.end method
