.class public final synthetic LWH;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:Lco/bird/android/model/wire/WireBird;


# direct methods
.method public synthetic constructor <init>(Lco/bird/android/model/wire/WireBird;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LWH;->b:Lco/bird/android/model/wire/WireBird;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LWH;->b:Lco/bird/android/model/wire/WireBird;

    invoke-static {v0}, LTH$h;->b(Lco/bird/android/model/wire/WireBird;)Lco/bird/android/model/wire/WireBird;

    move-result-object v0

    return-object v0
.end method
