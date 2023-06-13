.class public final synthetic LRG3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/o;


# instance fields
.field public final synthetic b:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LRG3;->b:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LRG3;->b:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, p1}, LgH3;->a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/ParkingNest;

    move-result-object p1

    return-object p1
.end method
