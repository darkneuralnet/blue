.class public Lhl5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcl5;


# instance fields
.field public final a:Lpd5;

.field public final b:Lu62;

.field public final c:LZk5;

.field public final d:LId;


# direct methods
.method public constructor <init>(Lpd5;Lu62;LZk5;LId;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhl5;->a:Lpd5;

    iput-object p2, p0, Lhl5;->b:Lu62;

    iput-object p3, p0, Lhl5;->c:LZk5;

    iput-object p4, p0, Lhl5;->d:LId;

    return-void
.end method

.method public static b([Lcom/polidea/rxandroidble2/scan/ScanFilter;)Z
    .locals 5

    array-length v0, p0

    const/4 v1, 0x1

    const/4 v2, 0x0

    move v3, v1

    :goto_0
    if-ge v2, v0, :cond_0

    aget-object v4, p0, v2

    invoke-virtual {v4}, Lcom/polidea/rxandroidble2/scan/ScanFilter;->a()Z

    move-result v4

    and-int/2addr v3, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    xor-int/lit8 p0, v3, 0x1

    return p0
.end method


# virtual methods
.method public varargs a(Lcom/polidea/rxandroidble2/scan/ScanSettings;[Lcom/polidea/rxandroidble2/scan/ScanFilter;)Lbl5;
    .locals 12

    invoke-static {p2}, Lhl5;->b([Lcom/polidea/rxandroidble2/scan/ScanFilter;)Z

    move-result v0

    invoke-virtual {p1}, Lcom/polidea/rxandroidble2/scan/ScanSettings;->b()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v1, v3, :cond_0

    move v1, v3

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    invoke-static {}, Lde3;->a()Lio/reactivex/C;

    move-result-object v4

    if-eqz v1, :cond_1

    if-nez v0, :cond_1

    move v0, v3

    goto :goto_1

    :cond_1
    move v0, v2

    :goto_1
    if-eqz v0, :cond_2

    const-string v0, "ScanSettings.callbackType != CALLBACK_TYPE_ALL_MATCHES but no (or only empty) filters are specified. Falling back to callbackType emulation."

    new-array v1, v2, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lye5;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lhl5;->c:LZk5;

    invoke-virtual {p1}, Lcom/polidea/rxandroidble2/scan/ScanSettings;->b()I

    move-result v1

    invoke-virtual {v0, v1}, LZk5;->a(I)Lio/reactivex/C;

    move-result-object v4

    invoke-virtual {p1, v3}, Lcom/polidea/rxandroidble2/scan/ScanSettings;->a(I)Lcom/polidea/rxandroidble2/scan/ScanSettings;

    move-result-object p1

    :cond_2
    move-object v9, p1

    new-instance p1, Lbl5;

    new-instance v0, Lrk5;

    iget-object v6, p0, Lhl5;->a:Lpd5;

    iget-object v7, p0, Lhl5;->b:Lu62;

    iget-object v8, p0, Lhl5;->d:LId;

    new-instance v10, LXa1;

    new-array v1, v2, [Lek5;

    invoke-direct {v10, v1}, LXa1;-><init>([Lek5;)V

    move-object v5, v0

    move-object v11, p2

    invoke-direct/range {v5 .. v11}, Lrk5;-><init>(Lpd5;Lu62;LId;Lcom/polidea/rxandroidble2/scan/ScanSettings;LXa1;[Lcom/polidea/rxandroidble2/scan/ScanFilter;)V

    invoke-direct {p1, v0, v4}, Lbl5;-><init>(LYh3;Lio/reactivex/C;)V

    return-object p1
.end method
