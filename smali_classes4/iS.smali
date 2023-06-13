.class public final synthetic LiS;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:LgS;

.field public final synthetic c:Lco/bird/android/model/wire/WireBird;


# direct methods
.method public synthetic constructor <init>(LgS;Lco/bird/android/model/wire/WireBird;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LiS;->b:LgS;

    iput-object p2, p0, LiS;->c:Lco/bird/android/model/wire/WireBird;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LiS;->b:LgS;

    iget-object v1, p0, LiS;->c:Lco/bird/android/model/wire/WireBird;

    invoke-static {v0, v1}, LgS$d;->a(LgS;Lco/bird/android/model/wire/WireBird;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
