.class public final Lio/reactivex/android/schedulers/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/android/schedulers/a$b;
    }
.end annotation


# static fields
.field public static final a:Lio/reactivex/E;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/reactivex/android/schedulers/a$a;

    invoke-direct {v0}, Lio/reactivex/android/schedulers/a$a;-><init>()V

    invoke-static {v0}, Lio/reactivex/android/plugins/a;->d(Ljava/util/concurrent/Callable;)Lio/reactivex/E;

    move-result-object v0

    sput-object v0, Lio/reactivex/android/schedulers/a;->a:Lio/reactivex/E;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "No instances."

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0
.end method

.method public static a()Lio/reactivex/E;
    .locals 1

    sget-object v0, Lio/reactivex/android/schedulers/a;->a:Lio/reactivex/E;

    invoke-static {v0}, Lio/reactivex/android/plugins/a;->e(Lio/reactivex/E;)Lio/reactivex/E;

    move-result-object v0

    return-object v0
.end method
