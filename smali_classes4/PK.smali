.class public final synthetic LPK;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:Lco/bird/android/model/Vehicle;


# direct methods
.method public synthetic constructor <init>(Lco/bird/android/model/Vehicle;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LPK;->b:Lco/bird/android/model/Vehicle;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LPK;->b:Lco/bird/android/model/Vehicle;

    invoke-static {v0}, LLK$L;->b(Lco/bird/android/model/Vehicle;)Lco/bird/android/model/Vehicle;

    move-result-object v0

    return-object v0
.end method
