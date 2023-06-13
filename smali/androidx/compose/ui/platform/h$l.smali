.class public final Landroidx/compose/ui/platform/h$l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ComponentCallbacks2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/platform/h;->m(Landroid/content/Context;Landroid/content/res/Configuration;LEt0;I)LuY1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic b:Landroid/content/res/Configuration;

.field public final synthetic c:LuY1;


# direct methods
.method public constructor <init>(Landroid/content/res/Configuration;LuY1;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/platform/h$l;->b:Landroid/content/res/Configuration;

    iput-object p2, p0, Landroidx/compose/ui/platform/h$l;->c:LuY1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 2

    const-string v0, "configuration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/compose/ui/platform/h$l;->b:Landroid/content/res/Configuration;

    invoke-virtual {v0, p1}, Landroid/content/res/Configuration;->updateFrom(Landroid/content/res/Configuration;)I

    move-result v0

    iget-object v1, p0, Landroidx/compose/ui/platform/h$l;->c:LuY1;

    invoke-virtual {v1, v0}, LuY1;->c(I)V

    iget-object v0, p0, Landroidx/compose/ui/platform/h$l;->b:Landroid/content/res/Configuration;

    invoke-virtual {v0, p1}, Landroid/content/res/Configuration;->setTo(Landroid/content/res/Configuration;)V

    return-void
.end method

.method public onLowMemory()V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/h$l;->c:LuY1;

    invoke-virtual {v0}, LuY1;->a()V

    return-void
.end method

.method public onTrimMemory(I)V
    .locals 0

    iget-object p1, p0, Landroidx/compose/ui/platform/h$l;->c:LuY1;

    invoke-virtual {p1}, LuY1;->a()V

    return-void
.end method
