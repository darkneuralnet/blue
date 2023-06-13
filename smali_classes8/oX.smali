.class public final synthetic LoX;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lno/nordicsemi/android/support/v18/scanner/b$b$a;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Lno/nordicsemi/android/support/v18/scanner/b$b$a;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LoX;->b:Lno/nordicsemi/android/support/v18/scanner/b$b$a;

    iput p2, p0, LoX;->c:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LoX;->b:Lno/nordicsemi/android/support/v18/scanner/b$b$a;

    iget v1, p0, LoX;->c:I

    invoke-static {v0, v1}, Lno/nordicsemi/android/support/v18/scanner/b$b$a;->c(Lno/nordicsemi/android/support/v18/scanner/b$b$a;I)V

    return-void
.end method
