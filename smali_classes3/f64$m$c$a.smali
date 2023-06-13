.class public final Lf64$m$c$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf64$m$c;->a(Lco/bird/android/buava/Optional;)Lio/reactivex/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/BluetoothEncryptionPermissionStatus;",
        "Lco/bird/android/buava/Optional<",
        "LTk5;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Lco/bird/android/model/BluetoothEncryptionPermissionStatus;",
        "kotlin.jvm.PlatformType",
        "it",
        "Lco/bird/android/buava/Optional;",
        "LTk5;",
        "a",
        "(Lco/bird/android/model/BluetoothEncryptionPermissionStatus;)Lco/bird/android/buava/Optional;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lf64;

.field public final synthetic h:Lco/bird/android/buava/Optional;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lco/bird/android/buava/Optional<",
            "LTk5;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lf64;Lco/bird/android/buava/Optional;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf64;",
            "Lco/bird/android/buava/Optional<",
            "LTk5;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lf64$m$c$a;->g:Lf64;

    iput-object p2, p0, Lf64$m$c$a;->h:Lco/bird/android/buava/Optional;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/BluetoothEncryptionPermissionStatus;)Lco/bird/android/buava/Optional;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/BluetoothEncryptionPermissionStatus;",
            ")",
            "Lco/bird/android/buava/Optional<",
            "LTk5;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lf64$m$c$a;->g:Lf64;

    const-string v1, "it"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, p1}, Lf64;->access$isAllowed(Lf64;Lco/bird/android/model/BluetoothEncryptionPermissionStatus;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lf64$m$c$a;->h:Lco/bird/android/buava/Optional;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/BluetoothEncryptionPermissionStatus;

    invoke-virtual {p0, p1}, Lf64$m$c$a;->a(Lco/bird/android/model/BluetoothEncryptionPermissionStatus;)Lco/bird/android/buava/Optional;

    move-result-object p1

    return-object p1
.end method
