.class public final synthetic LqJ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:LLK;

.field public final synthetic c:Lco/bird/android/model/Vehicle;


# direct methods
.method public synthetic constructor <init>(LLK;Lco/bird/android/model/Vehicle;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LqJ;->b:LLK;

    iput-object p2, p0, LqJ;->c:Lco/bird/android/model/Vehicle;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LqJ;->b:LLK;

    iget-object v1, p0, LqJ;->c:Lco/bird/android/model/Vehicle;

    invoke-static {v0, v1}, LLK;->F(LLK;Lco/bird/android/model/Vehicle;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
