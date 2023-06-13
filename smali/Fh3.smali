.class public final LFh3;
.super LEG6;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LFh3$a;,
        LFh3$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0018\u0000 \u00062\u00020\u0001:\u0002\u0007\u0008B\u0011\u0008\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\t"
    }
    d2 = {
        "LFh3;",
        "LEG6;",
        "LFh3$a;",
        "builder",
        "<init>",
        "(LFh3$a;)V",
        "e",
        "a",
        "b",
        "work-runtime_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# static fields
.field public static final e:LFh3$b;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LFh3$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LFh3$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LFh3;->e:LFh3$b;

    return-void
.end method

.method public constructor <init>(LFh3$a;)V
    .locals 2

    const-string v0, "builder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LEG6$a;->d()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {p1}, LEG6$a;->g()LHG6;

    move-result-object v1

    invoke-virtual {p1}, LEG6$a;->e()Ljava/util/Set;

    move-result-object p1

    invoke-direct {p0, v0, v1, p1}, LEG6;-><init>(Ljava/util/UUID;LHG6;Ljava/util/Set;)V

    return-void
.end method

.method public static final e(Ljava/lang/Class;)LFh3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Landroidx/work/c;",
            ">;)",
            "LFh3;"
        }
    .end annotation

    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, LFh3;->e:LFh3$b;

    invoke-virtual {v0, p0}, LFh3$b;->a(Ljava/lang/Class;)LFh3;

    move-result-object p0

    return-object p0
.end method
