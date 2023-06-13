.class public Lno/nordicsemi/android/support/v18/scanner/a$a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lno/nordicsemi/android/support/v18/scanner/a$a;-><init>(ZZLjava/util/List;Lno/nordicsemi/android/support/v18/scanner/ScanSettings;Ljj5;Landroid/os/Handler;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Landroid/os/Handler;

.field public final synthetic c:Lno/nordicsemi/android/support/v18/scanner/a$a;


# direct methods
.method public constructor <init>(Lno/nordicsemi/android/support/v18/scanner/a$a;Landroid/os/Handler;)V
    .locals 0

    iput-object p1, p0, Lno/nordicsemi/android/support/v18/scanner/a$a$b;->c:Lno/nordicsemi/android/support/v18/scanner/a$a;

    iput-object p2, p0, Lno/nordicsemi/android/support/v18/scanner/a$a$b;->b:Landroid/os/Handler;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lno/nordicsemi/android/support/v18/scanner/a$a$b;->c:Lno/nordicsemi/android/support/v18/scanner/a$a;

    invoke-static {v0}, Lno/nordicsemi/android/support/v18/scanner/a$a;->c(Lno/nordicsemi/android/support/v18/scanner/a$a;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lno/nordicsemi/android/support/v18/scanner/a$a$b;->c:Lno/nordicsemi/android/support/v18/scanner/a$a;

    invoke-virtual {v0}, Lno/nordicsemi/android/support/v18/scanner/a$a;->e()V

    iget-object v0, p0, Lno/nordicsemi/android/support/v18/scanner/a$a$b;->b:Landroid/os/Handler;

    iget-object v1, p0, Lno/nordicsemi/android/support/v18/scanner/a$a$b;->c:Lno/nordicsemi/android/support/v18/scanner/a$a;

    iget-object v1, v1, Lno/nordicsemi/android/support/v18/scanner/a$a;->g:Lno/nordicsemi/android/support/v18/scanner/ScanSettings;

    invoke-virtual {v1}, Lno/nordicsemi/android/support/v18/scanner/ScanSettings;->j()J

    move-result-wide v1

    invoke-virtual {v0, p0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_0
    return-void
.end method
