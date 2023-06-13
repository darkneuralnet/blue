.class public final LFX$j$a$b;
.super LBl0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LFX$j$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LBl0<",
        "LZ21<",
        "LYl5;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0008\u0005*\u0001\u0000\u0008\n\u0018\u00002\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0018\u0010\t\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0016\u0010\u000c\u001a\u00020\u00082\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00060\nH\u0016J\u0010\u0010\u000e\u001a\u00020\u00082\u0006\u0010\r\u001a\u00020\u0004H\u0016\u00a8\u0006\u000f"
    }
    d2 = {
        "FX$j$a$b",
        "LBl0;",
        "LZ21;",
        "LYl5;",
        "",
        "callbackType",
        "Lno/nordicsemi/android/support/v18/scanner/ScanResult;",
        "result",
        "",
        "c",
        "",
        "results",
        "a",
        "errorCode",
        "b",
        "impl_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBluetoothManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BluetoothManagerImpl.kt\nco/bird/android/bluetooth/impl/BluetoothManagerImpl$scanResultsFlow$1$1$scanCallback$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,333:1\n1549#2:334\n1620#2,3:335\n*S KotlinDebug\n*F\n+ 1 BluetoothManagerImpl.kt\nco/bird/android/bluetooth/impl/BluetoothManagerImpl$scanResultsFlow$1$1$scanCallback$1\n*L\n166#1:334\n166#1:335,3\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic b:Ln74;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln74<",
            "LZ21<",
            "LYl5;",
            ">;>;"
        }
    .end annotation
.end field

.field public final synthetic c:LFX;

.field public final synthetic d:LWX;


# direct methods
.method public constructor <init>(Ln74;LFX;LWX;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln74<",
            "-",
            "LZ21<",
            "LYl5;",
            ">;>;",
            "LFX;",
            "LWX;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, LFX$j$a$b;->b:Ln74;

    iput-object p2, p0, LFX$j$a$b;->c:LFX;

    iput-object p3, p0, LFX$j$a$b;->d:LWX;

    invoke-direct {p0, p1}, LBl0;-><init>(Ln74;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lno/nordicsemi/android/support/v18/scanner/ScanResult;",
            ">;)V"
        }
    .end annotation

    const-string v0, "results"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Ljj5;->a(Ljava/util/List;)V

    iget-object v0, p0, LFX$j$a$b;->b:Ln74;

    invoke-interface {v0}, Lys5;->A()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    move-object v0, p1

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lno/nordicsemi/android/support/v18/scanner/ScanResult;

    invoke-virtual {v2}, Lno/nordicsemi/android/support/v18/scanner/ScanResult;->a()Landroid/bluetooth/BluetoothDevice;

    move-result-object v2

    invoke-virtual {v2}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onBatchScanResults "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " }}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Lg46;->l(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, LFX$j$a$b;->c:LFX;

    invoke-virtual {v0}, LFX;->f()LaX;

    move-result-object v0

    const/4 v2, 0x1

    sget-object v3, LFX$j$a$b$a;->g:LFX$j$a$b$a;

    invoke-virtual {v0, p1, v2, v3}, LaX;->c(Ljava/util/List;ZLkotlin/jvm/functions/Function1;)Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, LFX$j$a$b;->b:Ln74;

    sget-object v0, LZ21;->a:LZ21$a;

    iget-object v2, p0, LFX$j$a$b;->d:LWX;

    new-instance v3, LYl5;

    iget-object v4, p0, LFX$j$a$b;->c:LFX;

    invoke-virtual {v4}, LFX;->f()LaX;

    move-result-object v4

    invoke-virtual {v4}, LaX;->d()Ljava/util/List;

    move-result-object v4

    invoke-direct {v3, v4}, LYl5;-><init>(Ljava/util/List;)V

    invoke-virtual {v0, v2, v3}, LZ21$a;->c(LWX;Ljava/lang/Object;)LAT5;

    move-result-object v0

    invoke-interface {p1, v0}, Lys5;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, LQh0;->j(Ljava/lang/Object;)Z

    move-result v0

    invoke-static {p1}, LQh0;->i(Ljava/lang/Object;)Z

    move-result v2

    invoke-static {p1}, LQh0;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_2
    const/4 p1, 0x0

    :goto_1
    iget-object v3, p0, LFX$j$a$b;->b:Ln74;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "result: success - "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, " closed - "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, " error - "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " "

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v0, v1, [Ljava/lang/Object;

    invoke-static {p1, v0}, Lg46;->l(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_3
    return-void
.end method

.method public b(I)V
    .locals 7

    invoke-super {p0, p1}, Ljj5;->b(I)V

    iget-object v0, p0, LFX$j$a$b;->b:Ln74;

    invoke-interface {v0}, Lys5;->A()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, LFX$j$a$b;->b:Ln74;

    sget-object v1, LZ21;->a:LZ21$a;

    iget-object v2, p0, LFX$j$a$b;->d:LWX;

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move v3, p1

    invoke-static/range {v1 .. v6}, LZ21$a;->createError$default(LZ21$a;LWX;ILjava/lang/Throwable;ILjava/lang/Object;)Lvg1;

    move-result-object p1

    invoke-interface {v0, p1}, Lys5;->h(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public c(ILno/nordicsemi/android/support/v18/scanner/ScanResult;)V
    .locals 3

    const-string v0, "result"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Ljj5;->c(ILno/nordicsemi/android/support/v18/scanner/ScanResult;)V

    iget-object p1, p0, LFX$j$a$b;->b:Ln74;

    invoke-interface {p1}, Lys5;->A()Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p2}, Lno/nordicsemi/android/support/v18/scanner/ScanResult;->e()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, LFX$j$a$b;->c:LFX;

    invoke-virtual {p1}, LFX;->f()LaX;

    move-result-object p1

    invoke-virtual {p1, p2}, LaX;->a(Lno/nordicsemi/android/support/v18/scanner/ScanResult;)V

    :cond_1
    iget-object p1, p0, LFX$j$a$b;->b:Ln74;

    sget-object p2, LZ21;->a:LZ21$a;

    iget-object v0, p0, LFX$j$a$b;->d:LWX;

    new-instance v1, LYl5;

    iget-object v2, p0, LFX$j$a$b;->c:LFX;

    invoke-virtual {v2}, LFX;->f()LaX;

    move-result-object v2

    invoke-virtual {v2}, LaX;->d()Ljava/util/List;

    move-result-object v2

    invoke-direct {v1, v2}, LYl5;-><init>(Ljava/util/List;)V

    invoke-virtual {p2, v0, v1}, LZ21$a;->c(LWX;Ljava/lang/Object;)LAT5;

    move-result-object p2

    invoke-interface {p1, p2}, Lys5;->h(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
