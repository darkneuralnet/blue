.class public Lcom/polidea/rxandroidble2/exceptions/BleScanException;
.super Lcom/polidea/rxandroidble2/exceptions/BleException;
.source "SourceFile"


# instance fields
.field public final b:I

.field public final c:Ljava/util/Date;


# direct methods
.method public constructor <init>(I)V
    .locals 2

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/polidea/rxandroidble2/exceptions/BleScanException;->a(ILjava/util/Date;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/polidea/rxandroidble2/exceptions/BleException;-><init>(Ljava/lang/String;)V

    iput p1, p0, Lcom/polidea/rxandroidble2/exceptions/BleScanException;->b:I

    iput-object v0, p0, Lcom/polidea/rxandroidble2/exceptions/BleScanException;->c:Ljava/util/Date;

    return-void
.end method

.method public constructor <init>(ILjava/lang/Throwable;)V
    .locals 2

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/polidea/rxandroidble2/exceptions/BleScanException;->a(ILjava/util/Date;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v1, p2}, Lcom/polidea/rxandroidble2/exceptions/BleException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    iput p1, p0, Lcom/polidea/rxandroidble2/exceptions/BleScanException;->b:I

    iput-object v0, p0, Lcom/polidea/rxandroidble2/exceptions/BleScanException;->c:Ljava/util/Date;

    return-void
.end method

.method public constructor <init>(ILjava/util/Date;)V
    .locals 1

    invoke-static {p1, p2}, Lcom/polidea/rxandroidble2/exceptions/BleScanException;->a(ILjava/util/Date;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/polidea/rxandroidble2/exceptions/BleException;-><init>(Ljava/lang/String;)V

    iput p1, p0, Lcom/polidea/rxandroidble2/exceptions/BleScanException;->b:I

    iput-object p2, p0, Lcom/polidea/rxandroidble2/exceptions/BleScanException;->c:Ljava/util/Date;

    return-void
.end method

.method public static a(ILjava/util/Date;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p0}, Lcom/polidea/rxandroidble2/exceptions/BleScanException;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " (code "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, ")"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Lcom/polidea/rxandroidble2/exceptions/BleScanException;->e(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static d(I)Ljava/lang/String;
    .locals 1

    const v0, 0x7ffffffe

    if-eq p0, v0, :cond_0

    packed-switch p0, :pswitch_data_0

    const-string p0, "Unknown error"

    return-object p0

    :pswitch_0
    const-string p0, "Scan failed because out of hardware resources"

    return-object p0

    :pswitch_1
    const-string p0, "Scan failed because feature unsupported"

    return-object p0

    :pswitch_2
    const-string p0, "Scan failed because of an internal error"

    return-object p0

    :pswitch_3
    const-string p0, "Scan failed because application registration failed"

    return-object p0

    :pswitch_4
    const-string p0, "Scan failed because it has already started"

    return-object p0

    :pswitch_5
    const-string p0, "Location Services disabled"

    return-object p0

    :pswitch_6
    const-string p0, "Location Permission missing"

    return-object p0

    :pswitch_7
    const-string p0, "Bluetooth not available"

    return-object p0

    :pswitch_8
    const-string p0, "Bluetooth disabled"

    return-object p0

    :pswitch_9
    const-string p0, "Bluetooth cannot start"

    return-object p0

    :cond_0
    const-string p0, "Undocumented scan throttle"

    return-object p0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static e(Ljava/util/Date;)Ljava/lang/String;
    .locals 2

    if-nez p0, :cond_0

    const-string p0, ""

    return-object p0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, ", suggested retry date is "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public b()I
    .locals 1

    iget v0, p0, Lcom/polidea/rxandroidble2/exceptions/BleScanException;->b:I

    return v0
.end method

.method public c()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lcom/polidea/rxandroidble2/exceptions/BleScanException;->c:Ljava/util/Date;

    return-object v0
.end method
