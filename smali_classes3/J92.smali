.class public final synthetic LJ92;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:Z

.field public final synthetic c:Lco/bird/android/model/wire/WireSkuOrder;

.field public final synthetic d:Ljava/util/List;

.field public final synthetic e:LL92;


# direct methods
.method public synthetic constructor <init>(ZLco/bird/android/model/wire/WireSkuOrder;Ljava/util/List;LL92;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, LJ92;->b:Z

    iput-object p2, p0, LJ92;->c:Lco/bird/android/model/wire/WireSkuOrder;

    iput-object p3, p0, LJ92;->d:Ljava/util/List;

    iput-object p4, p0, LJ92;->e:LL92;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 4

    iget-boolean v0, p0, LJ92;->b:Z

    iget-object v1, p0, LJ92;->c:Lco/bird/android/model/wire/WireSkuOrder;

    iget-object v2, p0, LJ92;->d:Ljava/util/List;

    iget-object v3, p0, LJ92;->e:LL92;

    invoke-static {v0, v1, v2, v3}, LL92;->b(ZLco/bird/android/model/wire/WireSkuOrder;Ljava/util/List;LL92;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
