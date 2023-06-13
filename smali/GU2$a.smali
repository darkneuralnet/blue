.class public final LGU2$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LGU2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ:\u0010\u000c\u001a\u000c\u0012\u0004\u0012\u00020\u000b\u0012\u0002\u0008\u00030\n2\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0006\u0010\t\u001a\u00020\u0007\u00a8\u0006\u000f"
    }
    d2 = {
        "LGU2$a;",
        "",
        "Llf;",
        "",
        "animationSpec",
        "Lkotlin/Function1;",
        "LHU2;",
        "",
        "confirmValueChange",
        "skipHalfExpanded",
        "LRi5;",
        "LGU2;",
        "a",
        "<init>",
        "()V",
        "material_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, LGU2$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Llf;Lkotlin/jvm/functions/Function1;Z)LRi5;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llf<",
            "Ljava/lang/Float;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "LHU2;",
            "Ljava/lang/Boolean;",
            ">;Z)",
            "LRi5<",
            "LGU2;",
            "*>;"
        }
    .end annotation

    const-string v0, "animationSpec"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "confirmValueChange"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LGU2$a$a;->g:LGU2$a$a;

    new-instance v1, LGU2$a$b;

    invoke-direct {v1, p1, p2, p3}, LGU2$a$b;-><init>(Llf;Lkotlin/jvm/functions/Function1;Z)V

    invoke-static {v0, v1}, LSi5;->a(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)LRi5;

    move-result-object p1

    return-object p1
.end method
