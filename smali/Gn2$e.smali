.class public final LGn2$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LNv4;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LGn2;-><init>(II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a8\u0006\u0006"
    }
    d2 = {
        "Gn2$e",
        "LNv4;",
        "LMv4;",
        "remeasurement",
        "",
        "S",
        "foundation_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic b:LGn2;


# direct methods
.method public constructor <init>(LGn2;)V
    .locals 0

    iput-object p1, p0, LGn2$e;->b:LGn2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public S(LMv4;)V
    .locals 1

    const-string v0, "remeasurement"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LGn2$e;->b:LGn2;

    invoke-static {v0, p1}, LGn2;->h(LGn2;LMv4;)V

    return-void
.end method
