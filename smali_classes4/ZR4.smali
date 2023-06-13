.class public final synthetic LZR4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:LIT4;

.field public final synthetic c:Lco/bird/android/model/wire/WireBird;


# direct methods
.method public synthetic constructor <init>(LIT4;Lco/bird/android/model/wire/WireBird;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LZR4;->b:LIT4;

    iput-object p2, p0, LZR4;->c:Lco/bird/android/model/wire/WireBird;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LZR4;->b:LIT4;

    iget-object v1, p0, LZR4;->c:Lco/bird/android/model/wire/WireBird;

    invoke-static {v0, v1}, LIT4;->Y1(LIT4;Lco/bird/android/model/wire/WireBird;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
