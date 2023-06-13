.class public final LFe5$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/bird/android/model/HJPayloadEncryptor;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LFe5$b;->b()LFe5$b$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J \u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J \u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016\u00a8\u0006\t"
    }
    d2 = {
        "Fe5$b$a",
        "Lco/bird/android/model/HJPayloadEncryptor;",
        "",
        "payload",
        "",
        "macAddress",
        "Lio/reactivex/F;",
        "encrypt",
        "decrypt",
        "bluetooth_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic a:LFe5;


# direct methods
.method public constructor <init>(LFe5;)V
    .locals 0

    iput-object p1, p0, LFe5$b$a;->a:LFe5;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)[B
    .locals 0

    invoke-static {p0, p1}, LFe5$b$a;->c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)[B

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)[B
    .locals 0

    invoke-static {p0, p1}, LFe5$b$a;->d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)[B

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)[B
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [B

    return-object p0
.end method

.method public static final d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)[B
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [B

    return-object p0
.end method


# virtual methods
.method public decrypt([BLjava/lang/String;)Lio/reactivex/F;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([B",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/F<",
            "[B>;"
        }
    .end annotation

    const-string v0, "payload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LFe5$b$a;->a:LFe5;

    invoke-static {v0}, LFe5;->access$getBluetoothEncryptionClient$p(LFe5;)LhX;

    move-result-object v0

    new-instance v1, Lco/bird/api/request/WireBluetoothDecryptionRequest;

    const/4 v2, 0x2

    invoke-static {p1, v2}, LmS5;->d([BI)Ljava/lang/String;

    move-result-object p1

    const-string v2, "bird_bike_hj"

    invoke-direct {v1, v2, p1, p2}, Lco/bird/api/request/WireBluetoothDecryptionRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, LhX;->a(Lco/bird/api/request/WireBluetoothDecryptionRequest;)Lio/reactivex/F;

    move-result-object p1

    sget-object p2, LFe5$b$a$a;->g:LFe5$b$a$a;

    new-instance v0, LHe5;

    invoke-direct {v0, p2}, LHe5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v0}, Lio/reactivex/F;->I(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object p1

    const-string p2, "bluetoothEncryptionClien\u2026flags = Base64.NO_WRAP) }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public encrypt([BLjava/lang/String;)Lio/reactivex/F;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([B",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/F<",
            "[B>;"
        }
    .end annotation

    const-string v0, "payload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LHY;->e([B)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xa

    invoke-static {p1, v1}, LmS5;->d([BI)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "hongi bike encryptor raw = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", base64 payload = "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, LFe5$b$a;->a:LFe5;

    invoke-static {v0}, LFe5;->access$getBluetoothEncryptionClient$p(LFe5;)LhX;

    move-result-object v0

    new-instance v1, Lco/bird/api/request/WireBluetoothEncryptionRequest;

    const/4 v2, 0x2

    invoke-static {p1, v2}, LmS5;->d([BI)Ljava/lang/String;

    move-result-object p1

    const-string v2, "bird_bike_hj"

    invoke-direct {v1, v2, p1, p2}, Lco/bird/api/request/WireBluetoothEncryptionRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, LhX;->b(Lco/bird/api/request/WireBluetoothEncryptionRequest;)Lio/reactivex/F;

    move-result-object p1

    sget-object p2, LFe5$b$a$b;->g:LFe5$b$a$b;

    new-instance v0, LGe5;

    invoke-direct {v0, p2}, LGe5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v0}, Lio/reactivex/F;->I(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object p1

    const-string p2, "bluetoothEncryptionClien\u2026flags = Base64.NO_WRAP) }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
