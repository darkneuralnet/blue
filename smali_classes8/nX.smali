.class public final synthetic LnX;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lno/nordicsemi/android/support/v18/scanner/b$b$a;

.field public final synthetic c:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Lno/nordicsemi/android/support/v18/scanner/b$b$a;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LnX;->b:Lno/nordicsemi/android/support/v18/scanner/b$b$a;

    iput-object p2, p0, LnX;->c:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LnX;->b:Lno/nordicsemi/android/support/v18/scanner/b$b$a;

    iget-object v1, p0, LnX;->c:Ljava/util/List;

    invoke-static {v0, v1}, Lno/nordicsemi/android/support/v18/scanner/b$b$a;->a(Lno/nordicsemi/android/support/v18/scanner/b$b$a;Ljava/util/List;)V

    return-void
.end method
