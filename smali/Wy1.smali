.class public final LWy1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LnV5$c;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a8\u0006\u0008"
    }
    d2 = {
        "LWy1;",
        "LnV5$c;",
        "LnV5$b;",
        "configuration",
        "LnV5;",
        "a",
        "<init>",
        "()V",
        "sqlite-framework_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LnV5$b;)LnV5;
    .locals 7

    const-string v0, "configuration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LUy1;

    iget-object v2, p1, LnV5$b;->a:Landroid/content/Context;

    iget-object v3, p1, LnV5$b;->b:Ljava/lang/String;

    iget-object v4, p1, LnV5$b;->c:LnV5$a;

    iget-boolean v5, p1, LnV5$b;->d:Z

    iget-boolean v6, p1, LnV5$b;->e:Z

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, LUy1;-><init>(Landroid/content/Context;Ljava/lang/String;LnV5$a;ZZ)V

    return-object v0
.end method
