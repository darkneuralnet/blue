.class public final LFX$i$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LGu1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LFX$i;->collect(LGu1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "LGu1;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\u0008\u0000\u0010\u0000\"\u0004\u0008\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "T",
        "R",
        "value",
        "",
        "emit",
        "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 BluetoothManagerImpl.kt\nco/bird/android/bluetooth/impl/BluetoothManagerImpl\n+ 4 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,222:1\n48#2:223\n244#3:224\n245#3,10:226\n329#4:225\n329#4:237\n1#5:236\n1549#6:238\n1620#6,3:239\n*S KotlinDebug\n*F\n+ 1 BluetoothManagerImpl.kt\nco/bird/android/bluetooth/impl/BluetoothManagerImpl\n*L\n244#1:225\n254#1:237\n254#1:238\n254#1:239,3\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic b:LGu1;

.field public final synthetic c:LYk5;


# direct methods
.method public constructor <init>(LGu1;LYk5;)V
    .locals 0

    iput-object p1, p0, LFX$i$a;->b:LGu1;

    iput-object p2, p0, LFX$i$a;->c:LYk5;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 10

    instance-of v0, p2, LFX$i$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, LFX$i$a$a;

    iget v1, v0, LFX$i$a$a;->i:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LFX$i$a$a;->i:I

    goto :goto_0

    :cond_0
    new-instance v0, LFX$i$a$a;

    invoke-direct {v0, p0, p2}, LFX$i$a$a;-><init>(LFX$i$a;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, v0, LFX$i$a$a;->h:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LFX$i$a$a;->i:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p2, p0, LFX$i$a;->b:LGu1;

    check-cast p1, LZ21;

    invoke-interface {v0}, Lkotlin/coroutines/Continuation;->getContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object v2

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " -- mapping latest scan flow emission -- "

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x0

    new-array v5, v4, [Ljava/lang/Object;

    invoke-static {v2, v5}, Lg46;->l(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v2, p0, LFX$i$a;->c:LYk5;

    invoke-virtual {v2}, LYk5;->d()Lno/nordicsemi/android/support/v18/scanner/ScanFilter;

    move-result-object v2

    iget-object v5, p0, LFX$i$a;->c:LYk5;

    invoke-virtual {v5}, LYk5;->c()Lorg/joda/time/DateTime;

    move-result-object v5

    instance-of v6, p1, LAT5;

    const/4 v7, 0x0

    if-eqz v6, :cond_4

    if-nez v2, :cond_3

    if-eqz v5, :cond_4

    :cond_3
    check-cast p1, LAT5;

    invoke-virtual {p1}, LAT5;->b()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LYl5;

    invoke-static {v6, v2, v5}, LZl5;->b(LYl5;Lno/nordicsemi/android/support/v18/scanner/ScanFilter;Lorg/joda/time/DateTime;)LYl5;

    move-result-object v2

    invoke-static {p1, v7, v2, v3, v7}, LAT5;->copy$default(LAT5;LWX;Ljava/lang/Object;ILjava/lang/Object;)LAT5;

    move-result-object p1

    :cond_4
    invoke-interface {v0}, Lkotlin/coroutines/Continuation;->getContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    invoke-static {v5}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v5

    instance-of v6, p1, LAT5;

    if-eqz v6, :cond_5

    move-object v6, p1

    check-cast v6, LAT5;

    goto :goto_1

    :cond_5
    move-object v6, v7

    :goto_1
    if-eqz v6, :cond_6

    invoke-virtual {v6}, LAT5;->b()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LYl5;

    if-eqz v6, :cond_6

    invoke-virtual {v6}, LYl5;->b()Ljava/util/List;

    move-result-object v6

    if-eqz v6, :cond_6

    check-cast v6, Ljava/lang/Iterable;

    new-instance v8, Ljava/util/ArrayList;

    const/16 v9, 0xa

    invoke-static {v6, v9}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v9

    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_7

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lco/bird/android/bluetooth/model/ScannedDevice;

    invoke-virtual {v9}, Lco/bird/android/bluetooth/model/ScannedDevice;->c()Ljava/lang/String;

    move-result-object v9

    invoke-interface {v8, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_6
    const-string v8, ""

    :cond_7
    iget-object v6, p0, LFX$i$a;->c:LYk5;

    invoke-virtual {v6}, LYk5;->a()Lbi3;

    move-result-object v6

    iget-object v9, p0, LFX$i$a;->c:LYk5;

    invoke-virtual {v9}, LYk5;->d()Lno/nordicsemi/android/support/v18/scanner/ScanFilter;

    move-result-object v9

    if-eqz v9, :cond_8

    invoke-virtual {v9}, Lno/nordicsemi/android/support/v18/scanner/ScanFilter;->a()Ljava/lang/String;

    move-result-object v7

    :cond_8
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " -- Received scan results flow update: ["

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, "] "

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " "

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " - "

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-array v4, v4, [Ljava/lang/Object;

    invoke-static {v2, v4}, Lg46;->l(Ljava/lang/String;[Ljava/lang/Object;)V

    iput v3, v0, LFX$i$a$a;->i:I

    invoke-interface {p2, p1, v0}, LGu1;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_9

    return-object v1

    :cond_9
    :goto_3
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
