.class public final Lqa3;
.super LAk1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "LAk1<",
        "Lpa3;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0008\u0005\u0008\u00c6\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bJ&\u0010\t\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0014\u0010\u0008\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005H\u0014\u00a8\u0006\u000c"
    }
    d2 = {
        "Lqa3;",
        "LAk1;",
        "Lpa3;",
        "Landroid/app/Application;",
        "application",
        "",
        "",
        "",
        "extras",
        "c",
        "<init>",
        "()V",
        "notification-center_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final b:Lqa3;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lqa3;

    invoke-direct {v0}, Lqa3;-><init>()V

    sput-object v0, Lqa3;->b:Lqa3;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, LAk1;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Landroid/app/Application;Ljava/util/Map;)Lpa3;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Application;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Lpa3;"
        }
    .end annotation

    const-string v0, "application"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LFM0;->a()Lpa3$a;

    move-result-object v0

    sget-object v1, LoG2;->a:LoG2;

    invoke-virtual {v1, p1}, LoG2;->a(Landroid/content/Context;)LlG2;

    move-result-object p1

    new-instance v1, Lbd3;

    if-eqz p2, :cond_0

    const-string v2, "fragment_manager"

    invoke-interface {p2, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    const-string v3, "null cannot be cast to non-null type androidx.fragment.app.FragmentManager"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Landroidx/fragment/app/FragmentManager;

    const-string v3, "container_id"

    invoke-interface {p2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    const-string v3, "null cannot be cast to non-null type kotlin.Int"

    invoke-static {p2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-direct {v1, v2, p2}, Lbd3;-><init>(Landroidx/fragment/app/FragmentManager;I)V

    invoke-interface {v0, p1, v1}, Lpa3$a;->a(LlG2;Lbd3;)Lpa3;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic instantiateComponent(Landroid/app/Application;Ljava/util/Map;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lqa3;->c(Landroid/app/Application;Ljava/util/Map;)Lpa3;

    move-result-object p1

    return-object p1
.end method
