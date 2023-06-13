.class public final synthetic Lwi3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:Lxi3;

.field public final synthetic c:Lco/bird/android/model/persistence/SkuOrder;

.field public final synthetic d:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Lxi3;Lco/bird/android/model/persistence/SkuOrder;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwi3;->b:Lxi3;

    iput-object p2, p0, Lwi3;->c:Lco/bird/android/model/persistence/SkuOrder;

    iput-object p3, p0, Lwi3;->d:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lwi3;->b:Lxi3;

    iget-object v1, p0, Lwi3;->c:Lco/bird/android/model/persistence/SkuOrder;

    iget-object v2, p0, Lwi3;->d:Ljava/util/List;

    invoke-static {v0, v1, v2}, Lxi3;->a(Lxi3;Lco/bird/android/model/persistence/SkuOrder;Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
