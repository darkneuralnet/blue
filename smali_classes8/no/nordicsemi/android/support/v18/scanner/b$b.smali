.class public Lno/nordicsemi/android/support/v18/scanner/b$b;
.super Lno/nordicsemi/android/support/v18/scanner/a$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lno/nordicsemi/android/support/v18/scanner/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public final n:Landroid/bluetooth/le/ScanCallback;


# direct methods
.method public constructor <init>(ZZLjava/util/List;Lno/nordicsemi/android/support/v18/scanner/ScanSettings;Ljj5;Landroid/os/Handler;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZ",
            "Ljava/util/List<",
            "Lno/nordicsemi/android/support/v18/scanner/ScanFilter;",
            ">;",
            "Lno/nordicsemi/android/support/v18/scanner/ScanSettings;",
            "Ljj5;",
            "Landroid/os/Handler;",
            ")V"
        }
    .end annotation

    invoke-direct/range {p0 .. p6}, Lno/nordicsemi/android/support/v18/scanner/a$a;-><init>(ZZLjava/util/List;Lno/nordicsemi/android/support/v18/scanner/ScanSettings;Ljj5;Landroid/os/Handler;)V

    new-instance p1, Lno/nordicsemi/android/support/v18/scanner/b$b$a;

    invoke-direct {p1, p0}, Lno/nordicsemi/android/support/v18/scanner/b$b$a;-><init>(Lno/nordicsemi/android/support/v18/scanner/b$b;)V

    iput-object p1, p0, Lno/nordicsemi/android/support/v18/scanner/b$b;->n:Landroid/bluetooth/le/ScanCallback;

    return-void
.end method

.method public synthetic constructor <init>(ZZLjava/util/List;Lno/nordicsemi/android/support/v18/scanner/ScanSettings;Ljj5;Landroid/os/Handler;Lno/nordicsemi/android/support/v18/scanner/b$a;)V
    .locals 0

    invoke-direct/range {p0 .. p6}, Lno/nordicsemi/android/support/v18/scanner/b$b;-><init>(ZZLjava/util/List;Lno/nordicsemi/android/support/v18/scanner/ScanSettings;Ljj5;Landroid/os/Handler;)V

    return-void
.end method

.method public static synthetic j(Lno/nordicsemi/android/support/v18/scanner/b$b;)Landroid/bluetooth/le/ScanCallback;
    .locals 0

    iget-object p0, p0, Lno/nordicsemi/android/support/v18/scanner/b$b;->n:Landroid/bluetooth/le/ScanCallback;

    return-object p0
.end method
