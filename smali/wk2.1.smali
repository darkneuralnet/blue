.class public final Lwk2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0000\u00f8\u0001\u0000\"\u001a\u0010\t\u001a\u00020\u00048\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\n"
    }
    d2 = {
        "Lkotlin/Function1;",
        "Lik2;",
        "",
        "shortcutModifier",
        "Lvk2;",
        "a",
        "Lvk2;",
        "b",
        "()Lvk2;",
        "defaultKeyMapping",
        "foundation_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final a:Lvk2;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    sget-object v0, Lwk2$b;->b:Lwk2$b;

    invoke-static {v0}, Lwk2;->a(Lkotlin/jvm/functions/Function1;)Lvk2;

    move-result-object v0

    new-instance v1, Lwk2$c;

    invoke-direct {v1, v0}, Lwk2$c;-><init>(Lvk2;)V

    sput-object v1, Lwk2;->a:Lvk2;

    return-void
.end method

.method public static final a(Lkotlin/jvm/functions/Function1;)Lvk2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lik2;",
            "Ljava/lang/Boolean;",
            ">;)",
            "Lvk2;"
        }
    .end annotation

    const-string v0, "shortcutModifier"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lwk2$a;

    invoke-direct {v0, p0}, Lwk2$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    return-object v0
.end method

.method public static final b()Lvk2;
    .locals 1

    sget-object v0, Lwk2;->a:Lvk2;

    return-object v0
.end method
