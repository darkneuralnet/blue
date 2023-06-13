.class public final synthetic Loc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Landroidx/compose/ui/platform/f;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/platform/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Loc;->b:Landroidx/compose/ui/platform/f;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Loc;->b:Landroidx/compose/ui/platform/f;

    invoke-static {v0}, Landroidx/compose/ui/platform/f;->b(Landroidx/compose/ui/platform/f;)V

    return-void
.end method
