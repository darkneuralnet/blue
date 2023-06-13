.class public final synthetic LVC5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:Lco/bird/android/model/wire/WireSkuScannedItems;

.field public final synthetic c:Z

.field public final synthetic d:LWC5;

.field public final synthetic e:Z


# direct methods
.method public synthetic constructor <init>(Lco/bird/android/model/wire/WireSkuScannedItems;ZLWC5;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LVC5;->b:Lco/bird/android/model/wire/WireSkuScannedItems;

    iput-boolean p2, p0, LVC5;->c:Z

    iput-object p3, p0, LVC5;->d:LWC5;

    iput-boolean p4, p0, LVC5;->e:Z

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, LVC5;->b:Lco/bird/android/model/wire/WireSkuScannedItems;

    iget-boolean v1, p0, LVC5;->c:Z

    iget-object v2, p0, LVC5;->d:LWC5;

    iget-boolean v3, p0, LVC5;->e:Z

    invoke-static {v0, v1, v2, v3}, LWC5;->a(Lco/bird/android/model/wire/WireSkuScannedItems;ZLWC5;Z)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
