.class public final synthetic Lej3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:Lfj3;

.field public final synthetic c:Lco/bird/android/model/wire/WireSkuOrder;


# direct methods
.method public synthetic constructor <init>(Lfj3;Lco/bird/android/model/wire/WireSkuOrder;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lej3;->b:Lfj3;

    iput-object p2, p0, Lej3;->c:Lco/bird/android/model/wire/WireSkuOrder;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lej3;->b:Lfj3;

    iget-object v1, p0, Lej3;->c:Lco/bird/android/model/wire/WireSkuOrder;

    invoke-static {v0, v1}, Lfj3$a;->a(Lfj3;Lco/bird/android/model/wire/WireSkuOrder;)Lio/reactivex/h;

    move-result-object v0

    return-object v0
.end method
