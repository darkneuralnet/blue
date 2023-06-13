.class public final synthetic LbI3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:LcI3;

.field public final synthetic c:Lco/bird/android/model/wire/WireInventoryPart;


# direct methods
.method public synthetic constructor <init>(LcI3;Lco/bird/android/model/wire/WireInventoryPart;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LbI3;->b:LcI3;

    iput-object p2, p0, LbI3;->c:Lco/bird/android/model/wire/WireInventoryPart;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LbI3;->b:LcI3;

    iget-object v1, p0, LbI3;->c:Lco/bird/android/model/wire/WireInventoryPart;

    invoke-static {v0, v1}, LcI3;->a(LcI3;Lco/bird/android/model/wire/WireInventoryPart;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
