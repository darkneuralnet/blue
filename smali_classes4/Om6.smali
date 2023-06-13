.class public final synthetic LOm6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:Lco/bird/android/model/Vehicle;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Lco/bird/android/model/Vehicle;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LOm6;->b:Lco/bird/android/model/Vehicle;

    iput p2, p0, LOm6;->c:I

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LOm6;->b:Lco/bird/android/model/Vehicle;

    iget v1, p0, LOm6;->c:I

    invoke-static {v0, v1}, Lco/bird/android/manager/bluetooth/internal/d;->X(Lco/bird/android/model/Vehicle;I)Lkotlin/Pair;

    move-result-object v0

    return-object v0
.end method
