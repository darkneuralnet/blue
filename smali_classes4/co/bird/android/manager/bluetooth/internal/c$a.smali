.class public final Lco/bird/android/manager/bluetooth/internal/c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/manager/bluetooth/internal/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0008\u0005\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u001a\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\u000b"
    }
    d2 = {
        "Lco/bird/android/manager/bluetooth/internal/c$a;",
        "",
        "",
        "error",
        "Lco/bird/android/manager/bluetooth/internal/c;",
        "a",
        "",
        "values",
        "[Lco/bird/android/manager/bluetooth/internal/c;",
        "<init>",
        "()V",
        "bluetooth_release"
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
        "SMAP\nGattError.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GattError.kt\nco/bird/android/manager/bluetooth/internal/GattError$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,43:1\n1282#2,2:44\n*S KotlinDebug\n*F\n+ 1 GattError.kt\nco/bird/android/manager/bluetooth/internal/GattError$Companion\n*L\n39#1:44,2\n*E\n"
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

    invoke-direct {p0}, Lco/bird/android/manager/bluetooth/internal/c$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(I)Lco/bird/android/manager/bluetooth/internal/c;
    .locals 6

    invoke-static {}, Lco/bird/android/manager/bluetooth/internal/c;->access$getValues$cp()[Lco/bird/android/manager/bluetooth/internal/c;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_2

    aget-object v4, v0, v3

    invoke-virtual {v4}, Lco/bird/android/manager/bluetooth/internal/c;->b()I

    move-result v5

    if-ne v5, p1, :cond_0

    const/4 v5, 0x1

    goto :goto_1

    :cond_0
    move v5, v2

    :goto_1
    if-eqz v5, :cond_1

    goto :goto_2

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    const/4 v4, 0x0

    :goto_2
    if-nez v4, :cond_3

    sget-object v4, Lco/bird/android/manager/bluetooth/internal/c;->n:Lco/bird/android/manager/bluetooth/internal/c;

    :cond_3
    return-object v4
.end method
