.class public final LPy4;
.super LAk1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "LAk1<",
        "LNy4;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0008\u0005\u0008\u00c6\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bJ&\u0010\t\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0014\u0010\u0008\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005H\u0014\u00a8\u0006\u000c"
    }
    d2 = {
        "LPy4;",
        "LAk1;",
        "LNy4;",
        "Landroid/app/Application;",
        "application",
        "",
        "",
        "",
        "extras",
        "c",
        "<init>",
        "()V",
        "repair_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final b:LPy4;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LPy4;

    invoke-direct {v0}, LPy4;-><init>()V

    sput-object v0, LPy4;->b:LPy4;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, LAk1;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Landroid/app/Application;Ljava/util/Map;)LNy4;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Application;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "LNy4;"
        }
    .end annotation

    const-string p2, "application"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LIO0;->a()LNy4$a;

    move-result-object p2

    sget-object v0, LoG2;->a:LoG2;

    invoke-virtual {v0, p1}, LoG2;->a(Landroid/content/Context;)LlG2;

    move-result-object p1

    invoke-interface {p2, p1}, LNy4$a;->a(LlG2;)LNy4;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic instantiateComponent(Landroid/app/Application;Ljava/util/Map;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LPy4;->c(Landroid/app/Application;Ljava/util/Map;)LNy4;

    move-result-object p1

    return-object p1
.end method
