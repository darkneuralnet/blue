.class public final synthetic LIJ1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:LGJ1;

.field public final synthetic c:Lco/bird/android/model/itemlease/ItemLease;


# direct methods
.method public synthetic constructor <init>(LGJ1;Lco/bird/android/model/itemlease/ItemLease;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LIJ1;->b:LGJ1;

    iput-object p2, p0, LIJ1;->c:Lco/bird/android/model/itemlease/ItemLease;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LIJ1;->b:LGJ1;

    iget-object v1, p0, LIJ1;->c:Lco/bird/android/model/itemlease/ItemLease;

    invoke-static {v0, v1}, LGJ1$f;->b(LGJ1;Lco/bird/android/model/itemlease/ItemLease;)Lio/reactivex/K;

    move-result-object v0

    return-object v0
.end method
