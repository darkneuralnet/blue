.class public final synthetic LZN3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/a;


# instance fields
.field public final synthetic b:LcO3;

.field public final synthetic c:Lco/bird/android/model/BirdPayment;


# direct methods
.method public synthetic constructor <init>(LcO3;Lco/bird/android/model/BirdPayment;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LZN3;->b:LcO3;

    iput-object p2, p0, LZN3;->c:Lco/bird/android/model/BirdPayment;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LZN3;->b:LcO3;

    iget-object v1, p0, LZN3;->c:Lco/bird/android/model/BirdPayment;

    invoke-static {v0, v1}, LcO3;->g(LcO3;Lco/bird/android/model/BirdPayment;)V

    return-void
.end method
