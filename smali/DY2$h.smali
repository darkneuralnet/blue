.class public final LDY2$h;
.super LVe3;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LDY2;-><init>(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0008\u0010\u0003\u001a\u00020\u0002H\u0016\u00a8\u0006\u0004"
    }
    d2 = {
        "DY2$h",
        "LVe3;",
        "",
        "handleOnBackPressed",
        "navigation-runtime_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic a:LDY2;


# direct methods
.method public constructor <init>(LDY2;)V
    .locals 0

    iput-object p1, p0, LDY2$h;->a:LDY2;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, LVe3;-><init>(Z)V

    return-void
.end method


# virtual methods
.method public handleOnBackPressed()V
    .locals 1

    iget-object v0, p0, LDY2$h;->a:LDY2;

    invoke-virtual {v0}, LDY2;->S()Z

    return-void
.end method
