.class public final synthetic Lf54;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:Lg54;

.field public final synthetic c:Lco/bird/android/model/wire/WireBird;

.field public final synthetic d:Z


# direct methods
.method public synthetic constructor <init>(Lg54;Lco/bird/android/model/wire/WireBird;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf54;->b:Lg54;

    iput-object p2, p0, Lf54;->c:Lco/bird/android/model/wire/WireBird;

    iput-boolean p3, p0, Lf54;->d:Z

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lf54;->b:Lg54;

    iget-object v1, p0, Lf54;->c:Lco/bird/android/model/wire/WireBird;

    iget-boolean v2, p0, Lf54;->d:Z

    invoke-static {v0, v1, v2}, Lg54;->h(Lg54;Lco/bird/android/model/wire/WireBird;Z)Lio/reactivex/h;

    move-result-object v0

    return-object v0
.end method
