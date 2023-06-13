.class public Ldl5$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/C;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldl5;->a(Lcom/polidea/rxandroidble2/scan/ScanSettings;[Lcom/polidea/rxandroidble2/scan/ScanFilter;)Lbl5;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/reactivex/C<",
        "Lxe5;",
        "Lxe5;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lio/reactivex/C;

.field public final synthetic b:Lio/reactivex/C;

.field public final synthetic c:Ldl5;


# direct methods
.method public constructor <init>(Ldl5;Lio/reactivex/C;Lio/reactivex/C;)V
    .locals 0

    iput-object p1, p0, Ldl5$a;->c:Ldl5;

    iput-object p2, p0, Ldl5$a;->a:Lio/reactivex/C;

    iput-object p3, p0, Ldl5$a;->b:Lio/reactivex/C;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lio/reactivex/Observable;)Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/Observable<",
            "Lxe5;",
            ">;)",
            "Lio/reactivex/Observable<",
            "Lxe5;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ldl5$a;->a:Lio/reactivex/C;

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->compose(Lio/reactivex/C;)Lio/reactivex/Observable;

    move-result-object p1

    iget-object v0, p0, Ldl5$a;->b:Lio/reactivex/C;

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->compose(Lio/reactivex/C;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Lio/reactivex/Observable;)Lio/reactivex/B;
    .locals 0

    invoke-virtual {p0, p1}, Ldl5$a;->a(Lio/reactivex/Observable;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method
