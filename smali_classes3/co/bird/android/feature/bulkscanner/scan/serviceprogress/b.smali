.class public final Lco/bird/android/feature/bulkscanner/scan/serviceprogress/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Let3;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lco/bird/android/feature/bulkscanner/scan/serviceprogress/BulkServiceProgressScannerActivity$b;

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/uber/autodispose/ScopeProvider;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lhm5;",
            ">;"
        }
    .end annotation
.end field

.field public final d:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lme/dm7/barcodescanner/zxing/ZXingScannerView;",
            ">;"
        }
    .end annotation
.end field

.field public final e:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lit3;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lco/bird/android/feature/bulkscanner/scan/serviceprogress/BulkServiceProgressScannerActivity$b;LY94;LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/feature/bulkscanner/scan/serviceprogress/BulkServiceProgressScannerActivity$b;",
            "LY94<",
            "Lcom/uber/autodispose/ScopeProvider;",
            ">;",
            "LY94<",
            "Lhm5;",
            ">;",
            "LY94<",
            "Lme/dm7/barcodescanner/zxing/ZXingScannerView;",
            ">;",
            "LY94<",
            "Lit3;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/feature/bulkscanner/scan/serviceprogress/b;->a:Lco/bird/android/feature/bulkscanner/scan/serviceprogress/BulkServiceProgressScannerActivity$b;

    iput-object p2, p0, Lco/bird/android/feature/bulkscanner/scan/serviceprogress/b;->b:LY94;

    iput-object p3, p0, Lco/bird/android/feature/bulkscanner/scan/serviceprogress/b;->c:LY94;

    iput-object p4, p0, Lco/bird/android/feature/bulkscanner/scan/serviceprogress/b;->d:LY94;

    iput-object p5, p0, Lco/bird/android/feature/bulkscanner/scan/serviceprogress/b;->e:LY94;

    return-void
.end method

.method public static a(Lco/bird/android/feature/bulkscanner/scan/serviceprogress/BulkServiceProgressScannerActivity$b;LY94;LY94;LY94;LY94;)Lco/bird/android/feature/bulkscanner/scan/serviceprogress/b;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/feature/bulkscanner/scan/serviceprogress/BulkServiceProgressScannerActivity$b;",
            "LY94<",
            "Lcom/uber/autodispose/ScopeProvider;",
            ">;",
            "LY94<",
            "Lhm5;",
            ">;",
            "LY94<",
            "Lme/dm7/barcodescanner/zxing/ZXingScannerView;",
            ">;",
            "LY94<",
            "Lit3;",
            ">;)",
            "Lco/bird/android/feature/bulkscanner/scan/serviceprogress/b;"
        }
    .end annotation

    new-instance v6, Lco/bird/android/feature/bulkscanner/scan/serviceprogress/b;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lco/bird/android/feature/bulkscanner/scan/serviceprogress/b;-><init>(Lco/bird/android/feature/bulkscanner/scan/serviceprogress/BulkServiceProgressScannerActivity$b;LY94;LY94;LY94;LY94;)V

    return-object v6
.end method

.method public static c(Lco/bird/android/feature/bulkscanner/scan/serviceprogress/BulkServiceProgressScannerActivity$b;Lcom/uber/autodispose/ScopeProvider;Lhm5;Lme/dm7/barcodescanner/zxing/ZXingScannerView;Lit3;)Let3;
    .locals 0

    invoke-virtual {p0, p1, p2, p3, p4}, Lco/bird/android/feature/bulkscanner/scan/serviceprogress/BulkServiceProgressScannerActivity$b;->b(Lcom/uber/autodispose/ScopeProvider;Lhm5;Lme/dm7/barcodescanner/zxing/ZXingScannerView;Lit3;)Let3;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Let3;

    return-object p0
.end method


# virtual methods
.method public b()Let3;
    .locals 5

    iget-object v0, p0, Lco/bird/android/feature/bulkscanner/scan/serviceprogress/b;->a:Lco/bird/android/feature/bulkscanner/scan/serviceprogress/BulkServiceProgressScannerActivity$b;

    iget-object v1, p0, Lco/bird/android/feature/bulkscanner/scan/serviceprogress/b;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/uber/autodispose/ScopeProvider;

    iget-object v2, p0, Lco/bird/android/feature/bulkscanner/scan/serviceprogress/b;->c:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lhm5;

    iget-object v3, p0, Lco/bird/android/feature/bulkscanner/scan/serviceprogress/b;->d:LY94;

    invoke-interface {v3}, LY94;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lme/dm7/barcodescanner/zxing/ZXingScannerView;

    iget-object v4, p0, Lco/bird/android/feature/bulkscanner/scan/serviceprogress/b;->e:LY94;

    invoke-interface {v4}, LY94;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lit3;

    invoke-static {v0, v1, v2, v3, v4}, Lco/bird/android/feature/bulkscanner/scan/serviceprogress/b;->c(Lco/bird/android/feature/bulkscanner/scan/serviceprogress/BulkServiceProgressScannerActivity$b;Lcom/uber/autodispose/ScopeProvider;Lhm5;Lme/dm7/barcodescanner/zxing/ZXingScannerView;Lit3;)Let3;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/feature/bulkscanner/scan/serviceprogress/b;->b()Let3;

    move-result-object v0

    return-object v0
.end method
