.class public final LGO4;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u001b\u0010\n\u001a\u00020\u00068@X\u0080\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0007\u001a\u0004\u0008\u0008\u0010\t\u00a8\u0006\r"
    }
    d2 = {
        "LGO4;",
        "",
        "Landroid/view/View;",
        "parent",
        "",
        "b",
        "LNt6;",
        "Lkotlin/Lazy;",
        "a",
        "()LNt6;",
        "viewTransformerManager",
        "<init>",
        "()V",
        "reword_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nReword.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Reword.kt\ndev/b3nedikt/reword/Reword\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,69:1\n13579#2,2:70\n13579#2,2:72\n*S KotlinDebug\n*F\n+ 1 Reword.kt\ndev/b3nedikt/reword/Reword\n*L\n48#1:70,2\n56#1:72,2\n*E\n"
    }
.end annotation


# static fields
.field public static final a:LGO4;

.field public static final b:Lkotlin/Lazy;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LGO4;

    invoke-direct {v0}, LGO4;-><init>()V

    sput-object v0, LGO4;->a:LGO4;

    sget-object v0, LGO4$a;->g:LGO4$a;

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    sput-object v0, LGO4;->b:Lkotlin/Lazy;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final b(Landroid/view/View;)V
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const-string v0, "parent"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LGO4;->a:LGO4;

    invoke-virtual {v0}, LGO4;->a()LNt6;

    move-result-object v0

    invoke-virtual {v0, p0}, LNt6;->f(Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public final a()LNt6;
    .locals 1

    sget-object v0, LGO4;->b:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LNt6;

    return-object v0
.end method
