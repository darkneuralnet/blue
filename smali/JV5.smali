.class public final synthetic LJV5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LMV5$a;


# direct methods
.method public synthetic constructor <init>(LMV5$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJV5;->b:LMV5$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, LJV5;->b:LMV5$a;

    invoke-virtual {v0}, Landroidx/camera/core/impl/DeferrableSurface;->d()V

    return-void
.end method
