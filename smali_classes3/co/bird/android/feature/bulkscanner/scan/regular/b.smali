.class public final Lco/bird/android/feature/bulkscanner/scan/regular/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lhm5;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lco/bird/android/feature/bulkscanner/scan/regular/DefaultBulkScannerActivity$b;

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LrQ3;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lip2;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lco/bird/android/feature/bulkscanner/scan/regular/DefaultBulkScannerActivity$b;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/feature/bulkscanner/scan/regular/DefaultBulkScannerActivity$b;",
            "LY94<",
            "LrQ3;",
            ">;",
            "LY94<",
            "Lip2;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/feature/bulkscanner/scan/regular/b;->a:Lco/bird/android/feature/bulkscanner/scan/regular/DefaultBulkScannerActivity$b;

    iput-object p2, p0, Lco/bird/android/feature/bulkscanner/scan/regular/b;->b:LY94;

    iput-object p3, p0, Lco/bird/android/feature/bulkscanner/scan/regular/b;->c:LY94;

    return-void
.end method

.method public static a(Lco/bird/android/feature/bulkscanner/scan/regular/DefaultBulkScannerActivity$b;LY94;LY94;)Lco/bird/android/feature/bulkscanner/scan/regular/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/feature/bulkscanner/scan/regular/DefaultBulkScannerActivity$b;",
            "LY94<",
            "LrQ3;",
            ">;",
            "LY94<",
            "Lip2;",
            ">;)",
            "Lco/bird/android/feature/bulkscanner/scan/regular/b;"
        }
    .end annotation

    new-instance v0, Lco/bird/android/feature/bulkscanner/scan/regular/b;

    invoke-direct {v0, p0, p1, p2}, Lco/bird/android/feature/bulkscanner/scan/regular/b;-><init>(Lco/bird/android/feature/bulkscanner/scan/regular/DefaultBulkScannerActivity$b;LY94;LY94;)V

    return-object v0
.end method

.method public static b(Lco/bird/android/feature/bulkscanner/scan/regular/DefaultBulkScannerActivity$b;LY94;LY94;)Lhm5;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/feature/bulkscanner/scan/regular/DefaultBulkScannerActivity$b;",
            "LY94<",
            "LrQ3;",
            ">;",
            "LY94<",
            "Lip2;",
            ">;)",
            "Lhm5;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lco/bird/android/feature/bulkscanner/scan/regular/DefaultBulkScannerActivity$b;->a(LY94;LY94;)Lhm5;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lhm5;

    return-object p0
.end method


# virtual methods
.method public c()Lhm5;
    .locals 3

    iget-object v0, p0, Lco/bird/android/feature/bulkscanner/scan/regular/b;->a:Lco/bird/android/feature/bulkscanner/scan/regular/DefaultBulkScannerActivity$b;

    iget-object v1, p0, Lco/bird/android/feature/bulkscanner/scan/regular/b;->b:LY94;

    iget-object v2, p0, Lco/bird/android/feature/bulkscanner/scan/regular/b;->c:LY94;

    invoke-static {v0, v1, v2}, Lco/bird/android/feature/bulkscanner/scan/regular/b;->b(Lco/bird/android/feature/bulkscanner/scan/regular/DefaultBulkScannerActivity$b;LY94;LY94;)Lhm5;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/feature/bulkscanner/scan/regular/b;->c()Lhm5;

    move-result-object v0

    return-object v0
.end method
