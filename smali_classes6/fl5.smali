.class public Lfl5;
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

    iput-object p1, p0, Lfl5;->a:Lpd5;

    iput-object p2, p0, Lfl5;->b:Lu62;

    iput-object p3, p0, Lfl5;->c:LZk5;

    iput-object p4, p0, Lfl5;->d:LId;

    return-void
.end method


# virtual methods
.method public varargs a(Lcom/polidea/rxandroidble2/scan/ScanSettings;[Lcom/polidea/rxandroidble2/scan/ScanFilter;)Lbl5;
    .locals 10

    iget-object v0, p0, Lfl5;->c:LZk5;

    invoke-virtual {p1}, Lcom/polidea/rxandroidble2/scan/ScanSettings;->b()I

    move-result v1

    invoke-virtual {v0, v1}, LZk5;->a(I)Lio/reactivex/C;

    move-result-object v0

    new-instance v1, Lbl5;

    new-instance v9, Lrk5;

    iget-object v3, p0, Lfl5;->a:Lpd5;

    iget-object v4, p0, Lfl5;->b:Lu62;

    iget-object v5, p0, Lfl5;->d:LId;

    new-instance v7, LXa1;

    invoke-direct {v7, p2}, LXa1;-><init>([Lek5;)V

    const/4 v8, 0x0

    move-object v2, v9

    move-object v6, p1

    invoke-direct/range {v2 .. v8}, Lrk5;-><init>(Lpd5;Lu62;LId;Lcom/polidea/rxandroidble2/scan/ScanSettings;LXa1;[Lcom/polidea/rxandroidble2/scan/ScanFilter;)V

    invoke-direct {v1, v9, v0}, Lbl5;-><init>(LYh3;Lio/reactivex/C;)V

    return-object v1
.end method
