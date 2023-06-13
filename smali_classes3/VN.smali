.class public final synthetic LVN;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lco/bird/android/feature/rider/birdpay/input/d;

.field public final synthetic c:Lco/bird/android/model/Balance;


# direct methods
.method public synthetic constructor <init>(Lco/bird/android/feature/rider/birdpay/input/d;Lco/bird/android/model/Balance;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LVN;->b:Lco/bird/android/feature/rider/birdpay/input/d;

    iput-object p2, p0, LVN;->c:Lco/bird/android/model/Balance;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LVN;->b:Lco/bird/android/feature/rider/birdpay/input/d;

    iget-object v1, p0, LVN;->c:Lco/bird/android/model/Balance;

    invoke-static {v0, v1}, Lco/bird/android/feature/rider/birdpay/input/d$g;->a(Lco/bird/android/feature/rider/birdpay/input/d;Lco/bird/android/model/Balance;)V

    return-void
.end method
