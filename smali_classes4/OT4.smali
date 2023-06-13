.class public final synthetic LOT4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/a;


# instance fields
.field public final synthetic b:Lco/bird/android/model/wire/WireRide;

.field public final synthetic c:LIT4;


# direct methods
.method public synthetic constructor <init>(Lco/bird/android/model/wire/WireRide;LIT4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LOT4;->b:Lco/bird/android/model/wire/WireRide;

    iput-object p2, p0, LOT4;->c:LIT4;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LOT4;->b:Lco/bird/android/model/wire/WireRide;

    iget-object v1, p0, LOT4;->c:LIT4;

    invoke-static {v0, v1}, LIT4$F;->b(Lco/bird/android/model/wire/WireRide;LIT4;)V

    return-void
.end method
