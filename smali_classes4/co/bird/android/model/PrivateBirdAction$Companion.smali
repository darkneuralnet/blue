.class public final Lco/bird/android/model/PrivateBirdAction$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/model/PrivateBirdAction;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\u00052\u0008\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u0011\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u0004\u00a2\u0006\u0002\u0010\rR\u0019\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\n\n\u0002\u0010\u0008\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u000e"
    }
    d2 = {
        "Lco/bird/android/model/PrivateBirdAction$Companion;",
        "",
        "()V",
        "all",
        "",
        "Lco/bird/android/model/PrivateBirdAction;",
        "getAll",
        "()[Lco/bird/android/model/PrivateBirdAction;",
        "[Lco/bird/android/model/PrivateBirdAction;",
        "from",
        "text",
        "",
        "strings",
        "()[Ljava/lang/String;",
        "model_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nPrivateBirdAction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrivateBirdAction.kt\nco/bird/android/model/PrivateBirdAction$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,35:1\n11335#2:36\n11670#2,3:37\n1282#2,2:42\n37#3,2:40\n*S KotlinDebug\n*F\n+ 1 PrivateBirdAction.kt\nco/bird/android/model/PrivateBirdAction$Companion\n*L\n30#1:36\n30#1:37,3\n31#1:42,2\n30#1:40,2\n*E\n"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lco/bird/android/model/PrivateBirdAction$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final from(Ljava/lang/String;)Lco/bird/android/model/PrivateBirdAction;
    .locals 5

    invoke-virtual {p0}, Lco/bird/android/model/PrivateBirdAction$Companion;->getAll()[Lco/bird/android/model/PrivateBirdAction;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    invoke-virtual {v3}, Lco/bird/android/model/PrivateBirdAction;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    :goto_1
    if-nez v3, :cond_2

    sget-object v3, Lco/bird/android/model/PrivateBirdAction;->UNKNOWN:Lco/bird/android/model/PrivateBirdAction;

    :cond_2
    return-object v3
.end method

.method public final getAll()[Lco/bird/android/model/PrivateBirdAction;
    .locals 1

    invoke-static {}, Lco/bird/android/model/PrivateBirdAction;->access$getAll$cp()[Lco/bird/android/model/PrivateBirdAction;

    move-result-object v0

    return-object v0
.end method

.method public final strings()[Ljava/lang/String;
    .locals 6

    invoke-virtual {p0}, Lco/bird/android/model/PrivateBirdAction$Companion;->getAll()[Lco/bird/android/model/PrivateBirdAction;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    array-length v2, v0

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    array-length v2, v0

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v4, v2, :cond_0

    aget-object v5, v0, v4

    invoke-virtual {v5}, Lco/bird/android/model/PrivateBirdAction;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v1, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    new-array v0, v3, [Ljava/lang/String;

    invoke-interface {v1, v0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    return-object v0
.end method
