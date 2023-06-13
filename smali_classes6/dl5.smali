.class public Ldl5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcl5;


# instance fields
.field public final a:Lpd5;

.field public final b:Lu62;

.field public final c:LZk5;


# direct methods
.method public constructor <init>(Lpd5;Lu62;LZk5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldl5;->a:Lpd5;

    iput-object p2, p0, Ldl5;->b:Lu62;

    iput-object p3, p0, Ldl5;->c:LZk5;

    return-void
.end method


# virtual methods
.method public varargs a(Lcom/polidea/rxandroidble2/scan/ScanSettings;[Lcom/polidea/rxandroidble2/scan/ScanFilter;)Lbl5;
    .locals 6

    iget-object v0, p0, Ldl5;->c:LZk5;

    invoke-virtual {p1}, Lcom/polidea/rxandroidble2/scan/ScanSettings;->h()I

    move-result v1

    invoke-virtual {v0, v1}, LZk5;->b(I)Lio/reactivex/C;

    move-result-object v0

    iget-object v1, p0, Ldl5;->c:LZk5;

    invoke-virtual {p1}, Lcom/polidea/rxandroidble2/scan/ScanSettings;->b()I

    move-result p1

    invoke-virtual {v1, p1}, LZk5;->a(I)Lio/reactivex/C;

    move-result-object p1

    new-instance v1, Lbl5;

    new-instance v2, Lqk5;

    iget-object v3, p0, Ldl5;->a:Lpd5;

    iget-object v4, p0, Ldl5;->b:Lu62;

    new-instance v5, LXa1;

    invoke-direct {v5, p2}, LXa1;-><init>([Lek5;)V

    invoke-direct {v2, v3, v4, v5}, Lqk5;-><init>(Lpd5;Lu62;LXa1;)V

    new-instance p2, Ldl5$a;

    invoke-direct {p2, p0, v0, p1}, Ldl5$a;-><init>(Ldl5;Lio/reactivex/C;Lio/reactivex/C;)V

    invoke-direct {v1, v2, p2}, Lbl5;-><init>(LYh3;Lio/reactivex/C;)V

    return-object v1
.end method
