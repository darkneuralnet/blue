.class public final LGy6;
.super LwZ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "LwZ<",
        "Lco/bird/android/model/BottomSheetButton;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u001a\u0010\u0008\u001a\u00020\u00038\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\u0005\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\r"
    }
    d2 = {
        "LGy6;",
        "LwZ;",
        "Lco/bird/android/model/BottomSheetButton;",
        "LEy6;",
        "c",
        "LEy6;",
        "d",
        "()LEy6;",
        "adapter",
        "Landroid/content/Context;",
        "context",
        "<init>",
        "(Landroid/content/Context;)V",
        "warehouse-flight-sheet_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final c:LEy6;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LwZ;-><init>(Landroid/content/Context;)V

    new-instance p1, LEy6;

    invoke-direct {p1}, LEy6;-><init>()V

    iput-object p1, p0, LGy6;->c:LEy6;

    invoke-virtual {p0}, LGy6;->d()LEy6;

    move-result-object p1

    new-instance v0, LGy6$a;

    invoke-direct {v0, p0}, LGy6$a;-><init>(LGy6;)V

    invoke-virtual {p1, v0}, LEy6;->v(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static final synthetic access$getOnClick(LGy6;)Lkotlin/jvm/functions/Function1;
    .locals 0

    invoke-virtual {p0}, LwZ;->a()Lkotlin/jvm/functions/Function1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public d()LEy6;
    .locals 1

    iget-object v0, p0, LGy6;->c:LEy6;

    return-object v0
.end method

.method public bridge synthetic getAdapter()LyS0;
    .locals 1

    invoke-virtual {p0}, LGy6;->d()LEy6;

    move-result-object v0

    return-object v0
.end method
