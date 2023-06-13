.class public final synthetic Lee5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:Lie5;

.field public final synthetic c:Lcom/polidea/rxandroidble2/scan/ScanSettings;

.field public final synthetic d:[Lcom/polidea/rxandroidble2/scan/ScanFilter;


# direct methods
.method public synthetic constructor <init>(Lie5;Lcom/polidea/rxandroidble2/scan/ScanSettings;[Lcom/polidea/rxandroidble2/scan/ScanFilter;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lee5;->b:Lie5;

    iput-object p2, p0, Lee5;->c:Lcom/polidea/rxandroidble2/scan/ScanSettings;

    iput-object p3, p0, Lee5;->d:[Lcom/polidea/rxandroidble2/scan/ScanFilter;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lee5;->b:Lie5;

    iget-object v1, p0, Lee5;->c:Lcom/polidea/rxandroidble2/scan/ScanSettings;

    iget-object v2, p0, Lee5;->d:[Lcom/polidea/rxandroidble2/scan/ScanFilter;

    invoke-static {v0, v1, v2}, Lie5;->g(Lie5;Lcom/polidea/rxandroidble2/scan/ScanSettings;[Lcom/polidea/rxandroidble2/scan/ScanFilter;)Lio/reactivex/B;

    move-result-object v0

    return-object v0
.end method
