.class public final synthetic Lh55;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:LB55;

.field public final synthetic c:Lco/bird/android/model/User;

.field public final synthetic d:Lco/bird/android/model/wire/configs/Config;


# direct methods
.method public synthetic constructor <init>(LB55;Lco/bird/android/model/User;Lco/bird/android/model/wire/configs/Config;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh55;->b:LB55;

    iput-object p2, p0, Lh55;->c:Lco/bird/android/model/User;

    iput-object p3, p0, Lh55;->d:Lco/bird/android/model/wire/configs/Config;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lh55;->b:LB55;

    iget-object v1, p0, Lh55;->c:Lco/bird/android/model/User;

    iget-object v2, p0, Lh55;->d:Lco/bird/android/model/wire/configs/Config;

    invoke-static {v0, v1, v2}, LB55;->j0(LB55;Lco/bird/android/model/User;Lco/bird/android/model/wire/configs/Config;)Lio/reactivex/u;

    move-result-object v0

    return-object v0
.end method
