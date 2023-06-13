.class public final synthetic LRP;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:Lco/bird/android/feature/birdplus/v1/details/a;


# direct methods
.method public synthetic constructor <init>(Lco/bird/android/feature/birdplus/v1/details/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LRP;->b:Lco/bird/android/feature/birdplus/v1/details/a;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LRP;->b:Lco/bird/android/feature/birdplus/v1/details/a;

    invoke-static {v0}, Lco/bird/android/feature/birdplus/v1/details/a;->x(Lco/bird/android/feature/birdplus/v1/details/a;)Lio/reactivex/h;

    move-result-object v0

    return-object v0
.end method
