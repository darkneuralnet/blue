.class public final synthetic Lu64;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:Lv64;

.field public final synthetic c:Lco/bird/android/model/wire/WireContainerOrder;

.field public final synthetic d:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Lv64;Lco/bird/android/model/wire/WireContainerOrder;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu64;->b:Lv64;

    iput-object p2, p0, Lu64;->c:Lco/bird/android/model/wire/WireContainerOrder;

    iput-object p3, p0, Lu64;->d:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lu64;->b:Lv64;

    iget-object v1, p0, Lu64;->c:Lco/bird/android/model/wire/WireContainerOrder;

    iget-object v2, p0, Lu64;->d:Ljava/util/List;

    invoke-static {v0, v1, v2}, Lv64;->a(Lv64;Lco/bird/android/model/wire/WireContainerOrder;Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
