.class public final LFX$j$a$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LFX$j$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic g:Lno/nordicsemi/android/support/v18/scanner/a;

.field public final synthetic h:LBl0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LBl0<",
            "LZ21<",
            "LYl5;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lno/nordicsemi/android/support/v18/scanner/a;LBl0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lno/nordicsemi/android/support/v18/scanner/a;",
            "LBl0<",
            "LZ21<",
            "LYl5;",
            ">;>;)V"
        }
    .end annotation

    iput-object p1, p0, LFX$j$a$a;->g:Lno/nordicsemi/android/support/v18/scanner/a;

    iput-object p2, p0, LFX$j$a$a;->h:LBl0;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LFX$j$a$a;->invoke()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .locals 2

    iget-object v0, p0, LFX$j$a$a;->g:Lno/nordicsemi/android/support/v18/scanner/a;

    iget-object v1, p0, LFX$j$a$a;->h:LBl0;

    invoke-virtual {v0, v1}, Lno/nordicsemi/android/support/v18/scanner/a;->a(Ljj5;)V

    iget-object v0, p0, LFX$j$a$a;->g:Lno/nordicsemi/android/support/v18/scanner/a;

    iget-object v1, p0, LFX$j$a$a;->h:LBl0;

    invoke-virtual {v0, v1}, Lno/nordicsemi/android/support/v18/scanner/a;->e(Ljj5;)V

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "called stopScan in awaitClose!!!"

    invoke-static {v1, v0}, Lg46;->l(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method
