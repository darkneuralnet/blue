.class public final Lio/reactivex/disposables/d;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No instances!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static a()Lio/reactivex/disposables/c;
    .locals 1

    sget-object v0, Lio/reactivex/internal/disposables/e;->b:Lio/reactivex/internal/disposables/e;

    return-object v0
.end method

.method public static b()Lio/reactivex/disposables/c;
    .locals 1

    sget-object v0, Lio/reactivex/internal/functions/a;->b:Ljava/lang/Runnable;

    invoke-static {v0}, Lio/reactivex/disposables/d;->d(Ljava/lang/Runnable;)Lio/reactivex/disposables/c;

    move-result-object v0

    return-object v0
.end method

.method public static c(Lio/reactivex/functions/a;)Lio/reactivex/disposables/c;
    .locals 1

    const-string v0, "run is null"

    invoke-static {p0, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lio/reactivex/disposables/a;

    invoke-direct {v0, p0}, Lio/reactivex/disposables/a;-><init>(Lio/reactivex/functions/a;)V

    return-object v0
.end method

.method public static d(Ljava/lang/Runnable;)Lio/reactivex/disposables/c;
    .locals 1

    const-string v0, "run is null"

    invoke-static {p0, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lio/reactivex/disposables/f;

    invoke-direct {v0, p0}, Lio/reactivex/disposables/f;-><init>(Ljava/lang/Runnable;)V

    return-object v0
.end method
